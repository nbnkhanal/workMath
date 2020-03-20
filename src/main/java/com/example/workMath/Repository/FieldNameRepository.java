package com.example.workMath.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workMath.Entity.Fields;

public interface FieldNameRepository extends JpaRepository<Fields, Long>{

}
