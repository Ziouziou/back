package com.SamarPFE.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SamarPFE.demo.entity.Tier;

@Repository
public interface TierRepository extends JpaRepository<Tier, Integer> {

}
