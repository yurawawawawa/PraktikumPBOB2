// Nama File : Titik.java
// Nama & NIM : Arga Yura Danendra & 24060124140191
// Deskripsi : Class dan method dari titik

public class Titik {
    /******************ATRIBUT********************/
    double absis;
    double ordinat;

    /******************METHOD********************/
    // konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
    }

    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
    }
    
    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;  // <-- DIPERBAIKI: dari x jadi y
    }

    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // Memeriksa kuadran 
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
// end class Titik