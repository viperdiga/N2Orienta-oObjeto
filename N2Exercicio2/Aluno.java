package app;

import java.time.LocalDate;
import java.util.ArrayList;


public class Aluno {
	private String nome;
	private String codigomatricula;
	private String endereco;
	private String telefones;
	private LocalDate datadenascimento;
	private double peso;
	private double altura;
	private ArrayList<Registro_ausencias>ausencias;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigomatricula() {
		return codigomatricula;
	}
	public void setCodigomatricula(String codigomatricula) {
		this.codigomatricula = codigomatricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefones() {
		return telefones;
	}
	public void setTelefones(String string) {
		this.telefones = string;
	}
	public LocalDate getDatadenascimento() {
		return datadenascimento;
	}
	public void setDatadenascimento(LocalDate datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public ArrayList<Registro_ausencias> getAusencias() {
		return ausencias;
	}
	public void setAusencias(ArrayList<Registro_ausencias> ausencias) {
		this.ausencias = ausencias;
	}
	
	

}
