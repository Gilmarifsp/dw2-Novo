package com.example.demo.model;

import java.util.Objects;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min = 3, max = 50)
	private String nome;
	@NotNull
	@Email
	private String email;
	@NotNull
	private String telefone;
	@NotNull
	private String cpf;
	@NotNull
	private Boolean ativo;
	@Embedded
	private EnderecoCliente endereco;
	

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public EnderecoCliente getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoCliente endereco) {
		this.endereco = endereco;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

	

}

