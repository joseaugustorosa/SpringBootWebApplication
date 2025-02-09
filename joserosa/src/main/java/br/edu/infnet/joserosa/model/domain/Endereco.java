package br.edu.infnet.joserosa.model.domain;

public class Endereco {
	private String bairro;
	private String cep;
	private String complemento;
	private String localidade;
	private String logradouro;
	private String uf;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cep + " - " + logradouro;
	}


	public Endereco() {
		
	}
	public Endereco(String cep) {
		this();
		this.cep = cep;
	}
	public Endereco(String bairro, String cep, String complemento, String localidade, String logradouro, String uf) {
		this(cep);
		this.bairro = bairro;
		this.cep = cep;
		this.complemento = complemento;
		this.localidade = localidade;
		this.logradouro = logradouro;
		this.uf = uf;
	}
	
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
}
