package com.Final.ProyectoFinal.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Final.ProyectoFinal.dto.CropsDto;

@Repository
public class CropsRepository {

	private JdbcTemplate jdbcTemplate;
	
	
	private String query;
	
	private ICropsrepository r;
	
	public List<CropsDto> getAllCrops(){
		
		
		return r.findAll();
		
	}
	
	

	/*public List<CropsDto> getAllCrops() {
		query="SELECT * FROM favoritos";
	     
		return jdbcTemplate.query(query,new CropsRowMapper());
				
	}
	
	public boolean deleteCropsbyId(int Id) {
		query="DELETE FROM favoritos WHERE SpecieId="+Id;
		
		jdbcTemplate.execute(query);
		return true;
		
	}
	
	public boolean saveCrops(CropsDto c) {
		//%s para string %d para decimales o enteros
		query.format("INSERT INTO favoritos(%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%d,%s,%s,%s,%s,%s,%s,%s,%s)",
				c.getClass(),c.getCommonName(),c.getConsistency(),c.getCropCycle(),c.getDivision(),c.getFamily(),c.getFruitType(),
				c.getGenus(),c.getOrder(),c.getRemarks(),c.getSpecieId(),c.getSpecieName(),c.getSubCategory(),c.getSubClass(),c.getSubDivision(),c.getSubFamily(),
				c.getSubSpecieVarietyForm(),c.getSuperorder(),c.getSynonyms());
		
		jdbcTemplate.execute(query);
		
		return true;
		
	}*/
	

	
	
	
}
