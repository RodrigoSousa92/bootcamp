package com.example.bootcamp.repository;

import com.example.bootcamp.model.Superpower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperPowerRepository extends JpaRepository<Superpower, Long> {
}
