package com.example.lesson7authentificationsecurity.repository;

import com.example.lesson7authentificationsecurity.entity.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.awt.print.Pageable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, Long> {

    T trash(Long id);

    List<T> findAllNotDeleted();

    Page<T> findAllNotDeleted(Pageable pageable);

}
