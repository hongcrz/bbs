package org.hju.test.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository repo;

    // INSERT
    public MemberVO save(MemberVO vo) throws Exception{
        return repo.save(vo);
    }

    // SELECT LIST
    public List<MemberVO> findAll() throws Exception{
        return repo.findAll();
    }

    // SELECT BY ID
    public Optional<MemberVO> findById(Long mSeq) {
        return repo.findById(mSeq);
    }

    // UPDATE
    public MemberVO updateById(MemberVO vo) throws Exception {
        // memberSeq를 이용하여 수정 객체 vo에 대한 동일 오브젝트 탐색
        Optional<MemberVO> opt = repo.findById(vo.getMSeq());

        MemberVO resultMember = null;
        // opt 객체가 존재하면,
        if(opt.isPresent()) {
            resultMember = repo.save(vo);
        }

        return resultMember;
    }

    // DELETE
    public void deleteById(Long mbrSeq) throws Exception {
        repo.deleteById(mbrSeq);
    }
}
