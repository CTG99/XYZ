package com.Final.ProyectoFinal.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.SerializedName;


@Table(
	    name = "favoritos" , 
	    schema = "crops"
	)
@Entity
public class CropsDto {
	
	public String Category;//Categoria de la planta
	@Column(name="Class")
	public String Clase;//Clase de la planta
	public String CommonName;//Nombre comun que recibe
	public String Consistency;//Consistencia de la planta(herbáceos, leñosos o sufruticosos)
	public String CropCycle;//Ciclo de cultivo
	public String Division;//Division de la planta
	public String Family;//Familia a la que pertenece
	public String FruitType;//Tipo de fruto que da la planta
	public String Genus;//Genero de la planta
	public String Order;//Orden de la planta
	public String Remarks;//Descripción de la planta
	@Id
	public int SpecieId;//Id de la especie de la planta
	public String SpecieName;//Nombre de la especie
	public String SubCategory;//Subcategoria
	public String SubClass;//Subclase
	public String SubDivision;//Subdivisión
	public String SubFamily;//Subfamilia
	public String SubSpecieVarietyForm;//???
	public String Superorder;//Superorden
	public String Synonyms;//Synonimos al nombre comun
	
	//Getters y Setters de cada atributo
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getClase() {
		return Clase;
	}
	public void setClase(String clase) {
		Clase = clase;
	}
	public String getCommonName() {
		return CommonName;
	}
	public void setCommonName(String commonName) {
		CommonName = commonName;
	}
	public String getConsistency() {
		return Consistency;
	}
	public void setConsistency(String consistency) {
		Consistency = consistency;
	}
	public String getCropCycle() {
		return CropCycle;
	}
	public void setCropCycle(String cropCycle) {
		CropCycle = cropCycle;
	}
	public String getDivision() {
		return Division;
	}
	public void setDivision(String division) {
		Division = division;
	}
	public String getFamily() {
		return Family;
	}
	public void setFamily(String family) {
		Family = family;
	}
	public String getFruitType() {
		return FruitType;
	}
	public void setFruitType(String fruitType) {
		FruitType = fruitType;
	}
	public String getGenus() {
		return Genus;
	}
	public void setGenus(String genus) {
		Genus = genus;
	}
	public String getOrder() {
		return Order;
	}
	public void setOrder(String order) {
		Order = order;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	public int getSpecieId() {
		return SpecieId;
	}
	public void setSpecieId(int specieId) {
		SpecieId = specieId;
	}
	public String getSpecieName() {
		return SpecieName;
	}
	public void setSpecieName(String specieName) {
		SpecieName = specieName;
	}
	public String getSubCategory() {
		return SubCategory;
	}
	public void setSubCategory(String subCategory) {
		SubCategory = subCategory;
	}
	public String getSubClass() {
		return SubClass;
	}
	public void setSubClass(String subClass) {
		SubClass = subClass;
	}
	public String getSubDivision() {
		return SubDivision;
	}
	public void setSubDivision(String subDivision) {
		SubDivision = subDivision;
	}
	public String getSubFamily() {
		return SubFamily;
	}
	public void setSubFamily(String subFamily) {
		SubFamily = subFamily;
	}
	public String getSubSpecieVarietyForm() {
		return SubSpecieVarietyForm;
	}
	public void setSubSpecieVarietyForm(String subSpecieVarietyForm) {
		SubSpecieVarietyForm = subSpecieVarietyForm;
	}
	public String getSuperorder() {
		return Superorder;
	}
	public void setSuperorder(String superorder) {
		Superorder = superorder;
	}
	public String getSynonyms() {
		return Synonyms;
	}
	public void setSynonyms(String synonyms) {
		Synonyms = synonyms;
	}
	
	//En caso de saber que valor cobra el objeto mas alla del debug
	@Override
	public String toString() {
		return "CropsDto [Category=" + Category + ", Clase=" + Clase + ", CommonName=" + CommonName + ", Consistency="
				+ Consistency + ", CropCycle=" + CropCycle + ", Division=" + Division + ", Family=" + Family
				+ ", FruitType=" + FruitType + ", Genus=" + Genus + ", Order=" + Order + ", Remarks=" + Remarks
				+ ", SpecieId=" + SpecieId + ", SpecieName=" + SpecieName + ", SubCategory=" + SubCategory
				+ ", SubClass=" + SubClass + ", SubDivision=" + SubDivision + ", SubFamily=" + SubFamily
				+ ", SubSpecieVarietyForm=" + SubSpecieVarietyForm + ", Superorder=" + Superorder + ", Synonyms="
				+ Synonyms + "]";
	}
	
}