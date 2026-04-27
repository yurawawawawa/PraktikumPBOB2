class Anabul {
    String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak() {}
    public void bersuara() {}
}

class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " bergerak melata");
    }

    public void bersuara() {
        System.out.println(nama + " : Meong");
    }
}

class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " bergerak melata");
    }

    public void bersuara() {
        System.out.println(nama + " : Guk-guk");
    }
}

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " terbang");
    }

    public void bersuara() {
        System.out.println(nama + " : Cuit");
    }
}

public class AnabulMain {
    public static void main(String[] args) {
        Anabul[] a = {
            new Kucing("Milo"),
            new Anjing("Doggy"),
            new Burung("Rio")
        };

        for (Anabul x : a) {
            x.gerak();
            x.bersuara();
            System.out.println();
        }
    }
}