package cofruit;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Contenitore {
    private final static int dimensioneContenitore = 3; // dimensione del contenitore
    
    private ArrayList <Mela> mele;

    public Contenitore() {
        mele= new ArrayList(dimensioneContenitore); //definisco arraList
    }
    
    public synchronized void inserisci(Mela mela)
    {
        while(mele.size()== dimensioneContenitore){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Contenitore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        mele.add(mela);
        notifyAll();
    }
    
    public synchronized Mela estrai(){
        while(mele.size()==0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Contenitore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Mela mela=mele.get(0);
        mele.remove(0);
        notifyAll();
        
        return mela;
    }
}
