package com.sparta.springprac02.repository;

import com.sparta.springprac02.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
