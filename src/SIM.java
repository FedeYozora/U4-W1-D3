public class SIM {
    public static void main(String[] args) {
        SIM sim = new SIM("3422589115");

        // Chiamate effettuate
        sim.listaChiamate[0] = new Chiamata(5, "987654321");
        sim.listaChiamate[1] = new Chiamata(10, "987654322");
        sim.listaChiamate[2] = new Chiamata(2, "987654323");
        sim.listaChiamate[3] = new Chiamata(8, "987654324");
        sim.listaChiamate[4] = new Chiamata(15, "987654325");

        sim.stampaDatiSIM();
    }

    private String numeroTelefono;
    private double credito;
    private Chiamata[] listaChiamate = new Chiamata[5];

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
    }

    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");
        System.out.println("Lista delle ultime 5 chiamate effettuate:");
        for (int i = 0; i < listaChiamate.length; i++) {
            Chiamata chiamata = listaChiamate[i];
            System.out.println("Durata: " + chiamata.getDurata() + " minuti, Numero chiamato: " + chiamata.getNumeroChiamato());
        }
    }
}

class Chiamata {
    private int durata;
    private String numeroChiamato;

    public Chiamata(int durata, String numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }
}