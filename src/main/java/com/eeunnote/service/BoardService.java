package com.eeunnote.service;

import com.eeunnote.domain.Board;
import com.eeunnote.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    //@Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<Board> getBoardList() {
        List<Board> list = boardRepository.findAll();
        return list;
    }
}
