package labs_examples.datastructures.hashmap.labs;

import java.util.*;
import java.util.function.BiFunction;

public class HashmapObjectives {
    public static long timer() {
        Long startTime = System.currentTimeMillis();


        Long endTIme = System.currentTimeMillis();
        System.out.println(" it took " + (endTIme - startTime) + " milliseconds " );


        return timer();
    }
    public static int forLoopFor100Methods() {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            count = i;
        }
        return count;
    }
    public static HashMap hash100(){
        HashMap hashMap = new HashMap(forLoopFor100Methods());
hashMap.get(forLoopFor100Methods());

return hashMap;
    }
    public static HashMap remove(){
        HashMap hashMap = new HashMap(forLoopFor100Methods());
        hashMap.remove(forLoopFor100Methods());
        return hashMap;
    }
    public static HashMap update(){
        HashMap hashMap = new HashMap(forLoopFor100Methods());
        hashMap.replaceAll((BiFunction) hashMap);
        return hashMap;
    }
    public static HashMap search() {
        HashMap hashMap = new HashMap(forLoopFor100Methods());
        hashMap.values().stream();
        return hashMap;


    }
}


