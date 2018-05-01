package com.michelpessoa.cursomc.security;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.michelpessoa.cursomc.domain.enums.Perfil;

public class UserSS implements UserDetails {

	private static final long serialVersionUID = 3419806309135434855L;

	private Integer id;
	private String email;
	private String senha;
	Collection<? extends GrantedAuthority> authorities;
	
	public UserSS() {
	}

	public UserSS(Integer id, String email, String senha, Set<Perfil> perfis) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.authorities = perfis.stream().map(x -> new SimpleGrantedAuthority(x.getDescricao())).collect(Collectors.toList());
	}

	public Integer getId() {
		return id;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		return senha;
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		// Alterar para conferência na conta do usuário, verificar se conta expirada.
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// Alterar para conferência na conta do usuário, verificar se conta está
		// bloqueada.
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// Alterar para conferência na conta do usuário, verificar se conta está com a
		// credências expiradas.
		return true;
	}

	@Override
	public boolean isEnabled() {
		// Alterar para conferência na conta do usuário, verificar se usário está ativo.
		return true;
	}

}
