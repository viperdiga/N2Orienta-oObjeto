package Model;

public class Barco extends Veiculos{
    
    private int numVelas;

    public int getNumVelas() {
        return numVelas;
    }

    public void setNumVelas(int numVelas) {
        this.numVelas = numVelas;
    }

    
    public void toString(int nroVelas) {
        System.out.println("Barco numVelas=" + numVelas);
    }

    public Barco() {
    }

    public Barco(int numVelas) {
        this.numVelas = numVelas;
    }
    
    
   @Override
   public void Acelerar(){
       System.out.println("O barco acelerou");
   }
   
   
   @Override
   public void MostrarDetalhes(){
        System.out.println("Mostrar Detalhe da Class Barco");
   }
   public void IcarVelhas(){
       System.out.println("O barco esta com as velas icadas");
   }

   public void RecolherVelhas(){
       System.out.println("Velas recolhidas");
   }
}
