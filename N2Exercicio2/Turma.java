package app;

import java.time.LocalDate;
import java.util.ArrayList;

public class Turma {
	public static Object setAtividades;
	private ArrayList<Aluno>alunos;
	private String horario;
	private String duracaoaula;
	private LocalDate datainicio;
	private LocalDate datafinal;
	private String instrutor;
	private String tipoAtividade;
	private Aluno monitor;
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getDuracaoaula() {
		return duracaoaula;
	}
	public void setDuracaoaula(String duracaoaula) {
		this.duracaoaula = duracaoaula;
	}
	public LocalDate getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(LocalDate datainicio) {
		this.datainicio = datainicio;
	}
	public LocalDate getDatafinal() {
		return datafinal;
	}
	public void setDatafinal(LocalDate datafinal) {
		this.datafinal = datafinal;
	}
	public String getInstrutor() {
		return instrutor;
	}
	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}
	public String getTipoAtividade() {
		return tipoAtividade;
	}
	public void setTipoAtividade(String tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}
	public Aluno getMonitor() {
		return monitor;
	}
	public void setMonitor(Aluno monitor) {
		this.monitor = monitor;
	}
	
	
	
}
	
	