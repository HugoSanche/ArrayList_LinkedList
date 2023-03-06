import java.util.Collection;
import java.util.Collections;

import java.util.LinkedList;

public class ChallengePlaces {
    public static void main(String[] args) {
        Places[] places ={new Places("Sidney",0),
                        new Places("Adelaine",1374),
                        new Places("Aline Springs",2771),
                        new Places("Brisbane",917),
                        new Places("Aline Springs",2771),
                        };
        
        LinkedList<Places> myPlaces=new LinkedList<>();
        System.out.println("******");
        System.out.println(myPlaces);
        addCity(places, myPlaces);
        System.out.println(myPlaces);
       // System.out.println(myPlaces); 
     
    }

    public static void printPlaces(LinkedList<Places> list){
        //System.out.println(list);
        var iterator =list.iterator();
        Places lastPlace=list.getFirst();
        while(iterator.hasNext()){
            var nextCity=iterator.next();
            System.out.println("Ciudad "+nextCity.getTown()+" Distancia " +nextCity.getDistance());

        }

    }
    public static void addCity(Places[] arrayPlaces, LinkedList<Places> listPlaces){
        
    //   if (!listPlaces.indexOf(arrayPlaces[i]))
      //      System.out.println("*****Hola****************************************");
     //       listPlaces.push(arrayPlaces[i]);
     //  }

        for (Places town :arrayPlaces ) {
            if (listPlaces.indexOf(town) < 0) 
                listPlaces.add(town);
        }
    
    }
}    