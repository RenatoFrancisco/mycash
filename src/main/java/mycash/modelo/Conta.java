package mycash.modelo;

import java.util.Collection;

public class Conta {

	private Long id;

	private int agencia;

	private int numero;

	private Usuario titular;
	
	private Banco banco;
	
	private Collection<Cartao> cartoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Usuario getTitular() {
		return titular;
	}

	public void setTitular(Usuario titular) {
		this.titular = titular;
	}
	
	public Banco getBanco() {
		return banco;
	}
	
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public Collection<Cartao> getCartoes() {
		return cartoes;
	}
	
	public void setCartoes(Collection<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
}
