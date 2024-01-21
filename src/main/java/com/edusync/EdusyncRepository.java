package com.edusync;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EdusyncRepository extends JpaRepository<SchoolDetails, Integer> {

}
