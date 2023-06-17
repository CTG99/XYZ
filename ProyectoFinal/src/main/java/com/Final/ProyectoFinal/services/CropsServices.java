package com.Final.ProyectoFinal.services;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Final.ProyectoFinal.dto.CropsDto;
import com.google.gson.Gson;

import kong.unirest.JsonNode;
import kong.unirest.Unirest;

@Service
public class CropsServices {

	
	
	
	
	public CropsDto[] getAllCropsSearch(String cm,String specie,String category,String sc,String ft,String family,String crop,String consistency) {
		Gson gson = new Gson();
		
		
//Parametros que controlen el llenado o no de los campos
		if(cm.length()>=1) {
			
		}else {
			cm=" ";
		}
		if(specie.length()>=1) {
			specie="&specieName=" + specie;
		}else {
			specie="";
		}
		if(category.length()>=1) {
			category="&category=" + category;
			
		}else {
			category="";
		}
		if(sc.length()>=1) {
			sc="&subcategory=" + sc;
	
		}else {
			sc="";
		}
		if(ft.length()>=1) {
			ft="&fruitType=" + ft;
		}else {
			ft="";
		}
		if(family.length()>=1) {
			family="&family=" + family;
		}else {
			family="";
		}
		if(crop.length()>=1) {
			crop="&cropCycle=" + crop;
		}else {
			crop="";
		}
		if(consistency.length()>=1) {
			consistency="&consistency=" + consistency;
		}else {
			consistency="";
		}

		
		//Peticion a la API 
		kong.unirest.HttpResponse<JsonNode> response = Unirest.get("https://crops.p.rapidapi.com/?commonName="+ cm  + specie  + category +sc +ft  + family + crop +consistency)
				.header("X-RapidAPI-Key", "aad64a7866mshe873d38658cb83bp15e1b7jsnd748bdb9e9c0")
				.header("X-RapidAPI-Host", "crops.p.rapidapi.com")
				.asJson();
	
		//Guardado de la peticion en un Array
		CropsDto[] crops = gson.fromJson(response.getBody().toString(), CropsDto[].class);

		
		
		return crops;
		
	}
	
}
