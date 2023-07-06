package com.test.springtestapp01.repository;

import com.test.springtestapp01.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "guitars", path = "guitars")
public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
