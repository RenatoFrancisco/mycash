package mycash.modelo;

import java.util.Collection;

public class Usuario {
	private Long id;

	private String nome;

	private String email;

	private String senha;

	private boolean ativo;

	private PerfilUser perfil;
	
	private Collection<Conta> contas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public PerfilUser getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilUser perfil) {
		this.perfil = perfil;
	}

}
