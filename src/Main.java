//Crea una classe Utente che abbia i parametri privati nome ed età ed i getter e setter
//All'interno dell'Utente ci sarà anche una funzione che stampa a video le informazioni di età e il nome.
//Creare 2 oggetti User di cui creerà un'istanza.
//Del primo si stamperanno le informazioni di default,
//del secondo si cambieranno le informazioni e poi si stamperanno a video

public class Main {
    public static void main(String[] args) {

        Utente utente1 = Utente.getIntance();
        Utente utente2 = Utente.getIntance();
        System.out.println("Utente 1= " + utente1);
        System.out.println("Utente 2= " + utente2);
        utente2.setNome("Gino");
        utente2.setEta(37);
        System.out.println("Utente 2 modificato= " + utente2);

    }
}