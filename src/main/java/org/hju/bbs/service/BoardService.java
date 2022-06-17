package org.hju.bbs.service;

import lombok.RequiredArgsConstructor;
import org.hju.bbs.dto.BoardRequestDto;
import org.hju.bbs.dto.BoardResponseDto;
import org.hju.bbs.repository.BoardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
// 초기화되지 않은 모든 final 필드, @NonNull로 마크되어있는 모든 필드들에 대한 생성자 자동 생성
@RequiredArgsConstructor
public class BoardService {

    // repository 타입의 repo 객체를 다른 객체로 바꾸지 않기 위해 final 사용
    private final BoardRepository repo;

    // INSERT
    @Transactional
    public Long save(BoardRequestDto saveDto) {
        // save()는 저장된 entity 객체를 반환함
        return repo.save(saveDto.toEntity()).getBSeq();
    }

    // SELECT LIST
    @Transactional(readOnly = true)
    public List<BoardResponseDto> findAll() {
        return repo.findAll()
                .stream()
                .map(BoardResponseDto::new)
                .collect(Collectors.toList());
    }

}
