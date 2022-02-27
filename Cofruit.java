package cofruit;

public class Cofruit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contenitore contenitoreMele = new Contenitore();
        Contenitore contenitoreMeleGialle = new Contenitore();
        Contenitore contenitoreMeleMarcie = new Contenitore();

        Produttore produttore = new Produttore(contenitoreMele);
        Thread threadProduttore = new Thread(produttore);
        
        Consumatore consumatore = new Consumatore(contenitoreMele, contenitoreMeleGialle);
        Thread threadConsumatore = new Thread(consumatore);
        
        Analizzatore analizzatore = new Analizzatore(contenitoreMeleGialle, contenitoreMeleMarcie);
        Thread threadAnalizzatore = new Thread(analizzatore);
        
        
        threadProduttore.start();
        threadConsumatore.start();
        threadAnalizzatore.start();
        
        Mela mela;
        
        while(true){
            mela = contenitoreMeleMarcie.estrai();
            if(mela.getNumeroMela() == -1)
                return;
            if(mela.getStatoMela())
                System.out.println("Mela N°" + mela.getNumeroMela() + " di colore " + mela.getColoreMela() + " marcia.");
            else
                System.out.println("Mela N°" + mela.getNumeroMela() + " di colore " + mela.getColoreMela() + " sana.");
        }
    }
}
