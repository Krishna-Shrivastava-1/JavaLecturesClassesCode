package Lect_28_HashMap;

import Lect22_Arrays.Arrays;

public class HashMap {
    Entity[] entities ;
    public HashMap(){
        this.entities = new Entity[100];
    }
    public void put(String key,String value,String rollnum){
        int hash = Math.abs(key.hashCode());
        entities[hash] = new Entity(key, value,rollnum);
    }
    public String[] get(String key){
        int hash = Math.abs(key.hashCode());
        if(entities[hash] != null && entities[hash].key.equals(key)){
            System.out.println(entities[hash]);
            String[] ar = {entities[hash].key,entities[hash].value,entities[hash].rollnum};
            return ar;
        }
        return null;
    }
    public void remove(String key){
        int hash = Math.abs(key.hashCode());
        if(entities[hash] != null && entities[hash].key.equals(key)){
             entities[hash] = null;
        }
    }
    private class Entity{
        String key;
        String value;
        String rollnum;
      public Entity(String key,String value,String rollnum){
            this.key=key;
            this.value=value;
            this.rollnum=rollnum;
        }
    }

    public static void main(String[] args) {
        HashMap mpp = new HashMap();
        mpp.put("1","krish","7");
//        mpp.put("1","krish2","7");

//        System.out.println( mpp.get("1"));
        System.out.println( mpp.get("1"));
//        mpp.remove("1");
//        System.out.println( mpp.get("1"));

    }
}
