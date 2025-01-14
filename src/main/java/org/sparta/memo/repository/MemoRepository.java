package org.sparta.memo.repository;

import org.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();

    List<Memo> findByContentsContaining(String keyword);

//    원래 답안
//    List<Memo> findAllByContentsContainsOrderByModifiedAtDesc(String keyword);


}