package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public abstract class Atividades extends Turma {
	
			

     public static void main(String[] args) {
    	 
    	 Scanner sc = new Scanner(System.in);
    	 Aluno p1 = new Aluno();
    	 
    	  System.out.println("Nome do aluno:");
    	  p1.setNome(sc.nextLine());
		
    	  System.out.println("Matrícula:");
    	  p1.setCodigomatricula(sc.nextLine());
    	  
    	  System.out.println("Endereço:");
    	  p1.setEndereco(sc.nextLine());
    	  
    	  System.out.println("Telefone:");
    	  p1.setTelefones(sc.nextLine());
    	  
    	  System.out.println("Data de nascimento:");
    	  p1.setDatadenascimento(LocalDate.of(0, 0, 0));
    	  
    	  System.out.println("Peso:");
    	  p1.setPeso(sc.nextDouble());
    	  
    	  System.out.println("Altura:");
    	  p1.setAltura(sc.nextDouble());

	}

}
