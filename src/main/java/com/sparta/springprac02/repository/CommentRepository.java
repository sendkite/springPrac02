package com.sparta.springprac02.repository;

import com.sparta.springprac02.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}