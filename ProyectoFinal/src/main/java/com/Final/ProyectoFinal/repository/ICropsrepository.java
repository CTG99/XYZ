package com.Final.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Final.ProyectoFinal.dto.CropsDto;
@Repository
public interface ICropsrepository extends JpaRepository<CropsDto,Integer>{

	
}
