package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Engineers;

public interface EngineerRepository extends JpaRepository<Engineers, String> {

}
