package com.test.springtestapp01.repository;

import com.test.springtestapp01.entity.GuitarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuitarRepository extends JpaRepository<GuitarEntity, Long> {
}
