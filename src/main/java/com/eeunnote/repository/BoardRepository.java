package com.eeunnote.repository;

import com.eeunnote.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {

    Board save(Board board);
    Optional<Board> findByNo(Long no);
    Optional<Board> findByTitle(String title);
    List<Board> findAll();
}
