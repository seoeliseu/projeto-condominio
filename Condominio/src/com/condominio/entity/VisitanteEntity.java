package com.condominio.entity;

public class VisitanteEntity {

	String nome;
	String motivo;
	String telefone;
	String rua;
	String bairro;
	String uf;
	int id;
	int idParente;
	int numero;
	long cpf;
	long cep;
	long rg;
	
	
	public String getNome() {
		return nome;
	}
	public VisitanteEntity setNome(String nome) {
		this.nome = nome;
		return this;
	}
	public String getMotivo() {
		return motivo;
	}
	public VisitanteEntity setMotivo(String motivo) {
		this.motivo = motivo;
		return this;
	}
	public String getTelefone() {
		return telefone;
	}
	public VisitanteEntity setTelefone(String telefone) {
		this.telefone = telefone;
		return this;
	}
	public String getRua() {
		return rua;
	}
	public VisitanteEntity setRua(String rua) {
		this.rua = rua;
		return this;
	}
	public String getBairro() {
		return bairro;
	}
	public VisitanteEntity setBairro(String bairro) {
		this.bairro = bairro;
		return this;
	}
	public String getUf() {
		return uf;
	}
	public VisitanteEntity setUf(String uf) {
		this.uf = uf;
		return this;
	}
	public int getId() {
		return id;
	}
	public VisitanteEntity setId(int id) {
		this.id = id;
		return this;
	}
	public int getIdParente() {
		return idParente;
	}
	public VisitanteEntity setIdParente(int idParente) {
		this.idParente = idParente;
		return this;
	}
	public int getNumero() {
		return numero;
	}
	public VisitanteEntity setNumero(int numero) {
		this.numero = numero;
		return this;
	}
	public long getCpf() {
		return cpf;
	}
	public VisitanteEntity setCpf(long cpf) {
		this.cpf = cpf;
		return this;
	}
	public long getCep() {
		return cep;
	}
	public VisitanteEntity setCep(long cep) {
		this.cep = cep;
		return this;
	}
	public long getRg() {
		return rg;
	}
	public VisitanteEntity setRg(long rg) {
		this.rg = rg;
		return this;
	}
	
}
