import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        //Set Interface
        //Collection Interface'den kalıtım almıştır
        //Aynı elemanlar veri kümesi içinde tekrar bulunamaz
        //HashSet en yaygın olan alt sınıfıdır

        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(10);
        hSet.add(30);
        hSet.add(40);
        hSet.add(null);

        System.out.println(hSet.size());
        System.out.println(hSet.isEmpty());
        System.out.println(hSet.contains(20));
        hSet.remove(40);

        /*
        for (Integer sayi : hSet){
            System.out.println(sayi);
        }
        */
        hSet.clear();//temizler
        /*
        Iterator<Integer> itr = hSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

         */
        //-----------------------------------------------
        //LinkedHashSet
        //HashSet alt sınıfıdır
        //Yineleme sırası korunur

        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        lSet.add(10);
        lSet.add(20);
        lSet.add(10);
        lSet.add(30);
        lSet.add(40);
        lSet.add(null);

        Iterator<Integer> itr = lSet.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}