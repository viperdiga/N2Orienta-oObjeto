package controller;

import java.util.Scanner;

import Model.Automovel;
import Model.Aviacao;
import Model.Barco;

public class TrabalhoN2 {

    public static void main(String[] args) {
     
        int numTurbina = 0;
        int capacidade = 0;
        int numVelas = 0;
        
        Scanner teclado = new Scanner(System.in);
        Aviacao av = new Aviacao();//Classes Extends
        Barco barco = new Barco();//Classes Extends
        Automovel auto = new Automovel();//Classes Extends
        


        
        System.out.println("#################################################################################");
        System.out.println("Chamando o metodo da Class Aviao  que chama o metodo da Classe Abstract Veiculos");
        av.Acelerar();
        System.out.println("Detalhe da Class Aviação que chama o metodo da Classe Abstract Veiculos");
        av.MostrarDetalhes();        
        System.out.println("Metodos Decolar");
        av.Decolar();
        System.out.println("Metodos Pousar");
        av.Pousar();
        
        System.out.println("#################################################################################");
        System.out.println("\n\n\n");

        System.out.println("#################################################################################");
        System.out.println("Chamando o metodo da Class Barco  que chama o metodo da Classe Abstract Veiculos");
        barco.Acelerar();
        System.out.println("Detalhe da Class Barco que chama o metodo da Classe Abstract Veiculos");
        barco.MostrarDetalhes();
        System.out.println("Metodos Içar Velas");
        barco.IcarVelhas();        
        System.out.println("Metodos Recolher Velas");
        barco.RecolherVelhas();
        System.out.println("#################################################################################");

        System.out.println("\n\n\n");
        System.out.println("#################################################################################");
        System.out.println("Chamando o metodo da Class Automovel  que chama o metodo da Classe Abstract Veiculos");
        auto.Acelerar();
        System.out.println("Detalhe da Class Automovel que chama o metodo da Classe Abstract Veiculos");
        auto.MostrarDetalhes();
        System.out.println("Metodos Abrir Portas");
        auto.AbrirPortaMalas();
  
        System.out.println("#################################################################################");
        
        System.out.println("Acessando a Class Abstract");
        auto.Acelerar2();

               

    }
}