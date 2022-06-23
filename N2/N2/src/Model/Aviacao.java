package Model;


public class Aviacao extends Veiculos{
    
    
    private int numTurbinas;

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }

 
    public void toString(int ntub, int cap) {        
        System.out.println("O aviao 737, ano 1990, produzido pela Boeing (Estados Unidos) utiliza "+(ntub)+" turbinas e possui capacidade para "+(cap)+"pessoas");
    }

    public Aviacao() {
    }

    public Aviacao(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }
    
    
   @Override
   public void Acelerar(){
       System.out.println("O aviao acelerou");
   }
   
    @Override
   public void MostrarDetalhes(){
        toString();
   }
   public void Decolar(){
       System.out.println("O aviao decolou");
   }

   public void Pousar(){
       System.out.println("O aviao pousou");
   }

    
    
}
