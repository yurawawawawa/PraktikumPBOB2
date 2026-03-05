// Nama File : Titik.java
// Nama & NIM : Arga Yura Danendra & 24060124140191
// Deskripsi : Class dan method dari titik

public class Titik {
    // ATRIBUT
    double absis;
    double ordinat;

    // METHOD
    
    public Titik() {
        absis = 0;
        ordinat = 0;
    }

    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
    }
    
    
    double getAbsis() {
        return absis;
    }


    double getOrdinat() {
        return ordinat;
    }

    
    void setAbsis(double x) {
        absis = x;
    }

    
    void setOrdinat(double y) {
        ordinat = y;
    }

    
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;  // <-- DIPERBAIKI: dari x jadi y
    }

    
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    
    double getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0){
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else {
            return 4;
        }
    }
}
