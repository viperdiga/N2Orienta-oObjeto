package app;

import java.util.ArrayList;
import java.time.LocalDate;

public class Instrutor {
	private int rg;
	private String nome;
	private ArrayList<String>telefones;
	private LocalDate datadenascimento;
	
	
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<String> getTelefones() {
		return telefones;
	}
	public void setTelefones(ArrayList<String> telefones) {
		this.telefones = telefones;
	}
	public LocalDate getDatadenascimento() {
		return datadenascimento;
	}
	public void setDatadenascimento(LocalDate datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	
	


}
