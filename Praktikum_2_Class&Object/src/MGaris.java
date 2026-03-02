public class MGaris {
    public static void main(String[] args) {

        // Objek garis
        Garis g1 = new Garis();                              

        Titik t1 = new Titik(); t1.setAbsis(0); t1.setOrdinat(0);
        Titik t2 = new Titik(); t2.setAbsis(4); t2.setOrdinat(4);
        Garis g2 = new Garis(t1, t2);                        

        Titik t3 = new Titik(); t3.setAbsis(0); t3.setOrdinat(1);
        Titik t4 = new Titik(); t4.setAbsis(4); t4.setOrdinat(5);
        Garis g3 = new Garis(t3, t4);                       

        Titik t5 = new Titik(); t5.setAbsis(0); t5.setOrdinat(0);
        Titik t6 = new Titik(); t6.setAbsis(1); t6.setOrdinat(-1);
        Garis g4 = new Garis(t5, t6);                        

        // Info g1
        g1.tampilkan();
        System.out.println("Panjang: " + g1.getPanjang());
        System.out.println("Gradien: " + g1.getGradien());
        System.out.println("Tengah : " + g1.getTitikTengah());

        System.out.println();

        // Cek relasi
        System.out.println("g2 sejajar g3?     " + g2.isSejajar(g3));
        System.out.println("g2 tegak lurus g4? " + g2.isTegakLurus(g4));
        System.out.println("Total garis: " + Garis.getCounterGaris());
    }
}