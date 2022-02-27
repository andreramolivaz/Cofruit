/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cofruitpersonnettaz;

/**
 *
 * @author personal
 */
public class Analizzatore implements Runnable {
    Contenitore contenitoreMeleGialle, contenitoreMeleMarcie;

    public Analizzatore(Contenitore contenitoreMeleGialle, Contenitore contenitoreMeleMarcie) {
        this.contenitoreMeleGialle = contenitoreMeleGialle;
        this.contenitoreMeleMarcie = contenitoreMeleMarcie;
    }

    public Analizzatore() {
    }
    
    @Override
    public void run() {
        Mela analizzaMela;
        int i=0, j=1;
        
        while(true) { //Finche' e' vero allora
            analizzaMela=contenitoreMeleGialle.estrai();
            
            
            if(analizzaMela.getNumeroMela()==-1){
                contenitoreMeleMarcie.inserisci(analizzaMela);
                return;
            }
            
            if(analizzaMela.getStatoMela()==true) {
                contenitoreMeleMarcie.inserisci(analizzaMela); 
            } 
        }
    }
}
