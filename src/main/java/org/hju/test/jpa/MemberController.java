package org.hju.test.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.plaf.metal.MetalMenuBarUI;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/member")
public class MemberController {

        @Autowired
        MemberService service;

        // INSERT
        @GetMapping("/insert")
        public void insertMember() throws Exception {
            try {
                MemberVO vo = new MemberVO();

                vo.setId("id1");
                vo.setPwd("pw1");
                vo.setName("name1");
                vo.setRegId("id1");
                vo.setRegDtm(LocalDateTime.now());

                service.save(vo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // SELECT LIST
        @GetMapping("/selectList")
        public void selectMemberList() throws Exception {
            try {
                service.findAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // SELECT BY ID
        @GetMapping("/select")
        public void selectMember() throws Exception {
            try {
                service.findById((long)1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // UPDATE
        @GetMapping("/update")
        public void updateMember() throws Exception {
            try {
                MemberVO vo = new MemberVO();

                vo.setMSeq((long) 1);
                vo.setId("update id1");
                vo.setPwd("update pw1");
                vo.setName("update name1");
                vo.setRegId("update id1");
                vo.setModDtm(LocalDateTime.now());

                service.updateById(vo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //DELETE
        @GetMapping("/delete")
        public void deleteMember() throws Exception {
            try {
                service.deleteById((long) 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


}
