
package cofruit;


public class Mela {
   private int numeroMela; //Numero della mela
   private String coloreMela; //Colore della mela
   private boolean statoMela; //Stato della mela
   
   //Costruttore
    public Mela(int numeroMela, String coloreMela, boolean statoMela) {
        this.numeroMela = numeroMela;
        this.coloreMela = coloreMela;
        this.statoMela = statoMela;
    }

    public Mela() {
    }
      
    //Set e Get
    public void setNumeroMela(int numeroMela) {
        this.numeroMela = numeroMela;
    }

    public void setColoreMela(String coloreMela) {
        this.coloreMela = coloreMela;
    }

    public void setStatoMela(boolean statoMela) {
        this.statoMela = statoMela;
    }
    
    public int getNumeroMela() {
        return numeroMela;
    }

    public String getColoreMela() {
        return coloreMela;
    }

    public boolean getStatoMela() {
        return statoMela;
    }
   
}
