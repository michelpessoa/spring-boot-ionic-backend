package com.michelpessoa.cursomc.DTO;

import java.io.Serializable;

import com.michelpessoa.cursomc.domain.Estado;

public class EstadoDTO implements Serializable {

	private static final long serialVersionUID = -4567965490534843482L;

	private Integer id;
	private String nome;
	
	
	public EstadoDTO() {
	}
	
	public EstadoDTO(Estado obj) {
		id = obj.getId();
		nome = obj.getNome();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
