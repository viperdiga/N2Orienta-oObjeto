package Model;

public abstract class Veiculos {
    
	   private String nome;
	   private Fabricante fabricante;
	   private int anoFabricação;
	   private int capacidade;

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public Fabricante getFabricante() {
	        return fabricante;
	    }

	    public void setFabricante(Fabricante fabricante) {
	        this.fabricante = fabricante;
	    }

	    public int getAnoFabricação() {
	        return anoFabricação;
	    }

	    public void setAnoFabricação(int anoFabricação) {
	        this.anoFabricação = anoFabricação;
	    }

	    public int getCapacidade() {
	        return capacidade;
	    }

	    public void setCapacidade(int capacidade) {
	        this.capacidade = capacidade;
	    }  
	   
	   public abstract void Acelerar();
	   public abstract void MostrarDetalhes();
	   
	   
	   public void Acelerar2(){
	       
	        System.out.println("Metodo Comun da Class Abstract de Acelerar");
	   }
	   public void MostrarDetalhes2(){
	       System.out.println("Metodo Comun da Class Abstract de Mostrar Detalhes");
	   }
	}
	        