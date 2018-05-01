package com.michelpessoa.cursomc.DTO;

import java.io.Serializable;

public class CredenciasDTO implements Serializable {

	private static final long serialVersionUID = -9137849432601402077L;

	private String email;
	private String senha;
	
	public CredenciasDTO() {
	}
	
	public CredenciasDTO(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
