package Model;


public class Automovel extends Veiculos{
  
   private int diametroDaRoda;

    public int getDiametroDaRoda() {
        return diametroDaRoda;
    }

    public void setDiametroDaRoda(int diametroDaRoda) {
        this.diametroDaRoda = diametroDaRoda;
    }
      
   @Override
   public void Acelerar(){
       System.out.println("O automóvel acelerou");
   }
   @Override
   public void MostrarDetalhes(){
        System.out.println("Mostrar Detalhe da Class Automovel");
   }
   public void AbrirPortaMalas(){
       System.out.println("O porta malas do carro foi aberto");
   }

    public Automovel() {
    }

    public Automovel(int diametroDaRoda) {
        this.diametroDaRoda = diametroDaRoda;
    }

    @Override
    public String toString() {
        return "Automovel{" + "diametroDaRoda=" + diametroDaRoda + '}';
    }
    
}
