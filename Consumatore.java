package cofruit;


public class Consumatore implements Runnable {
    Contenitore contenitoreMele, contenitoreMeleGialle;

    public Consumatore(Contenitore contenitoreMele, Contenitore contenitoreMeleGialle) {
        this.contenitoreMele = contenitoreMele;
        this.contenitoreMeleGialle = contenitoreMeleGialle;
    }
    
    @Override
    public void run(){
        Mela mela;
        
        for(int i=0; i<15; i++)
        {
            mela=contenitoreMele.estrai();
            
            if(mela.getColoreMela()=="Gialla") {
                contenitoreMeleGialle.inserisci(mela);
            }
        }
        Mela tmpMela = new Mela(-1, "Gialla", true);
        contenitoreMeleGialle.inserisci(tmpMela);
    }
}
