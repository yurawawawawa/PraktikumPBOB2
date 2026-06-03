// File : Anabul.java
// Nama / NIM : Arga Yura Danendra / 24060124140191
// Lab : B2

class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void bersuara() {
        System.out.println("Suara Anabul");
    }

    public String getNama() {
        return nama;
    }
}

class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " : Meong");
    }
}

class Anggora extends Kucing {
    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }
}

class Kembangtelon extends Kucing {
    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }
}

class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " : Guk-guk");
    }
}