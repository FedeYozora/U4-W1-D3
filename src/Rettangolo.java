public class Rettangolo {

    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(4, 5);
        Rettangolo rettangolo2 = new Rettangolo(6, 7);

        stampaDueRettangoli(rettangolo1, rettangolo2);
    }
    private double larghezza;
    private double altezza;

    public Rettangolo(double larghezza, double altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    public double calcolaPerimetro() {
        return 2 * (larghezza + altezza);
    }

    public double calcolaArea() {
        return larghezza * altezza;
    }

    public void stampaRettangolo() {
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Rettangolo 1:");
        rettangolo1.stampaRettangolo();

        System.out.println("Rettangolo 2:");
        rettangolo2.stampaRettangolo();

        System.out.println("Somma delle aree: " + (rettangolo1.calcolaArea() + rettangolo2.calcolaArea()));
        System.out.println("Somma dei perimetri: " + (rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro()));
    }
}