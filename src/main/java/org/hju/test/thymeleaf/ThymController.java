package org.hju.test.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymController {

    @RequestMapping("/thyme")
    String index (Model model) {
        BoardVO vo1 = new BoardVO(1, "test1", "tester");
        BoardVO vo2 = new BoardVO(2, "test2", "tester");
        BoardVO vo3 = new BoardVO(3, "test3", "tester");
        BoardVO vo4 = new BoardVO(4, "test4", "tester");
        BoardVO vo5 = new BoardVO(5, "test5", "tester");

        List<BoardVO> list = new ArrayList<>();
        list.add(vo1);
        list.add(vo2);
        list.add(vo3);
        list.add(vo4);
        list.add(vo5);

        model.addAttribute("voList", list);
        return "index";
    }
}
