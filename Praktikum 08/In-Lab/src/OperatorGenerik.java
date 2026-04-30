// File : OperatorGenerik.java
// Nama / NIM : Arga Yura Danendra / 24060124140191
// Lab : B2
class Box<T> {
    public T nilai;

    public Box(T nilai) {
        this.nilai = nilai;
    }
}

class OperatorGenerik {

    public static <T> void Tukar(Box<T> a, Box<T> b) {
        T temp = a.nilai;
        a.nilai = b.nilai;
        b.nilai = temp;
    }

    public static <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}