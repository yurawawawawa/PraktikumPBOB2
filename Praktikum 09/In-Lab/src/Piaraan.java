// File : Piaraan.java
// Nama : Arga Yura Danendra / 24060124140191
// Lab : B2

import java.util.LinkedList;
import java.util.Queue;

class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public int CountKucing(){
        int count = 0;
        for (Anabul a : Lanabul){
            if (a instanceof Kucing){
                count ++;
            }        
        } return count;
        
        
    }

}  


