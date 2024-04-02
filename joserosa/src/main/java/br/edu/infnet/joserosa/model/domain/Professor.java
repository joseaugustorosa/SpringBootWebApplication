package br.edu.infnet.joserosa.model.domain;

public class Professor {

		private int registro;
		private String nome;
		private float salario;
		private boolean mestre;
		private Endereco endereco;
		
		public float calcularSalario() {
			return salario + (mestre ? 1000: 500);
		}
		public boolean indicativoGratificacao() {
			return salario >= 5000 && mestre;
		}
		
		public int getRegistro() {
			return registro;
		}
		public void setRegistro(int registro) {
			this.registro = registro;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public float getSalario() {
			return salario;
		}
		public void setSalario(float salario) {
			this.salario = salario;
		}
		public boolean isMestre() {
			return mestre;
		}
		public void setMestre(boolean meste) {
			this.mestre = meste;
		}
		public Endereco getEndereco() {
			return endereco;
		}
		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
		
		
}
