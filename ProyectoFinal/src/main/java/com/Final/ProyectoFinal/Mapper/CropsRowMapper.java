package com.Final.ProyectoFinal.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Final.ProyectoFinal.dto.CropsDto;


public class CropsRowMapper implements RowMapper<CropsDto>{

	@Override
	public CropsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		//Creacion del objeto Crops
		CropsDto crop= new CropsDto();
		//Asignamos uno de los atributos al objeto
		crop.setCategory(rs.getString(1));
		//Asignamos uno de los atributos al objeto
		crop.setClase(rs.getString(2));
		//Asignamos uno de los atributos al objeto
		crop.setCommonName(rs.getString(3));
		//Asignamos uno de los atributos al objeto
		crop.setConsistency(rs.getString(4));
		//Asignamos uno de los atributos al objeto
		crop.setCropCycle(rs.getString(5));
		//Asignamos uno de los atributos al objeto
		crop.setDivision(rs.getString(6));
		//Asignamos uno de los atributos al objeto
		crop.setFamily(rs.getString(7));
		//Asignamos uno de los atributos al objeto
		crop.setFruitType(rs.getString(8));
		//Asignamos uno de los atributos al objeto
		crop.setGenus(rs.getString(9));
		//Asignamos uno de los atributos al objeto
		crop.setOrder(rs.getString(10));
		//Asignamos uno de los atributos al objeto
		crop.setRemarks(rs.getString(11));
		//Asignamos uno de los atributos al objeto
		crop.setSpecieId(rs.getInt(12));
		//Asignamos uno de los atributos al objeto
		crop.setSpecieName(rs.getString(13));
		//Asignamos uno de los atributos al objeto
		crop.setSubCategory(rs.getString(14));
		//Asignamos uno de los atributos al objeto
		crop.setSubClass(rs.getString(15));
		//Asignamos uno de los atributos al objeto
		crop.setSubDivision(rs.getString(16));
		//Asignamos uno de los atributos al objeto
		crop.setSubFamily(rs.getString(17));
		//Asignamos uno de los atributos al objeto
		crop.setSubSpecieVarietyForm(rs.getString(18));
		//Asignamos uno de los atributos al objeto
		crop.setSuperorder(rs.getString(19));
		//Asignamos uno de los atributos al objeto
		crop.setSynonyms(rs.getString(20));
		//Devolvemos el objeto en la función
		return crop;
		
	}


}
