// File : Data.java
// Nama / NIM : Arga Yura Danendra / 24060124140191
// Lab : B2

class Data<T> {
    private T[] ruang;
    private int banyak;

    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public void setIsi(int posisi, T isi) {
        ruang[posisi - 1] = isi;

        if (posisi > banyak) {
            banyak = posisi;
        }
    }

    public T getIsi(int posisi) {
        return ruang[posisi - 1];
    }

    public int getSize() {
        return banyak;
    }
}