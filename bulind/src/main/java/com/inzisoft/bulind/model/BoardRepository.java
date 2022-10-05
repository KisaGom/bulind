package com.inzisoft.bulind.model;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;

import com.inzisoft.bulind.dto.BoardDto;

public interface BoardRepository extends JpaRepository<BoardDto, Integer> {
}
