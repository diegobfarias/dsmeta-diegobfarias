package com.diegobfarias.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegobfarias.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
