package cofruit;

import java.util.Random;


public class Produttore implements Runnable {
    private Contenitore contenitoreMele;

    public Produttore(Contenitore contenitoreMele) {
        this.contenitoreMele = contenitoreMele;
    }
    
    @Override
    public void run(){
        Mela mela;
        Random nRandom = new Random();
        int estratto, marcia;
        
        for(int i=0; i<15; i++) {
            estratto = (int) nRandom.nextInt(2); //Estraggo il numero per vedere se gialla/Rossa
            marcia = (int) nRandom.nextInt(2); //Estraggo il numero per vedere se e' marcia o meno
            
            if(estratto==1) { //Controllo se mela e' rossa
                mela = new Mela(i, "Rossa", true);
            }
            else {
                mela = new Mela(i, "Gialla", true); //altrimenti e' gialla
            }
            
            if(marcia==1) { //Controllo se e' marcia (1) imposto setStatoMela() a true, altrimenti a false
                mela.setStatoMela(true);
            }
            else {
                mela.setStatoMela(false);
            }
            contenitoreMele.inserisci(mela); //Inserisco la mela nel contenitore
        }
    }
}
