
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class ChallengePlaces {
    static  Scanner scan =new Scanner(System.in);
    public static void main(String[] args) {
        
       /*  Places places ={new Places("Sidney",0),
                        new Places("Alice Springs",2771),
                        new Places("Brisbane",917),
                        new Places("Darwin",3972),
                        new Places("Melbourne",877),
                        new Places("Perth",3923),
                        };
        */

        LinkedList<Places> myPlaces=new LinkedList<>();
        Places adeline=new Places ("Adelaid",1374);
        
        addCity2(adeline, myPlaces);
        addCity2(new Places("Adelaid",1374), myPlaces);
        addCity2(new Places("Sidney",0), myPlaces);
        addCity2(new Places("Aline Springs",2771), myPlaces);  
        addCity2(new Places("Brisbane",917), myPlaces);             
        addCity2(new Places("Darwin",3972), myPlaces); 
        addCity2(new Places("Melbourne",877), myPlaces); 
        addCity2(new Places("Perth",3923), myPlaces); 
        addCity2(new Places("perth",3923), myPlaces);

        ListIterator<Places> iterator=myPlaces.listIterator();
        iterator.hasNext();              
        boolean flag=true;
        while(flag){

            printMenu();
            char c = scan.next().charAt(0);
            switch(c){
             
                case 'F':
                    forward( iterator);
                    //printPlaces(myPlaces);
                    break;
                case 'B':
                    backward( iterator);
                    //print(myItems);
                    break;
                case 'L':
                    printPlaces(myPlaces);
                    break;    
                case 'M':
                    printMenu();;
                    break;     
                case 'Q':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect Option");
                    break;
            }
         }
     
    }

    public static void printPlaces(LinkedList<Places> list){
        System.out.println();
        var iterator =list.iterator();
        while(iterator.hasNext()){
            var nextCity=iterator.next();
            System.out.println("Ciudad "+nextCity.getTown()+" Distancia " +nextCity.getDistance());

        }
        System.out.println();
    }
    public static void addCity(Places[] arrayPlaces, LinkedList<Places> listPlaces){    
        for (Places town :arrayPlaces ) {
            if (listPlaces.indexOf(town) < 0) 
                listPlaces.add(town);
        }
     }
     public static void addCity2(Places places, LinkedList<Places> listPlaces){    
        if (listPlaces.contains(places)){
            System.out.println("Duplicate "+places);
            return;
        }
        for (Places p : listPlaces) {
            if (p.getTown().equalsIgnoreCase(places.getTown())) {
                System.out.println("Found duplicate2: " + places);
                return;
            }
        }
        listPlaces.add(places);
        // for (Places p: places )
     }

     public static void printMenu(){
        String textBlock="""
            Avaliable Actions
            (F)orward
            (B)ackward 
            (L)ist Places
            (M)enu
            (Q)uit
             """;
            System.out.println(textBlock+" ");
    }
    public static void  backward(ListIterator<Places> iterator){
       System.out.println(iterator.hasPrevious());
       if(iterator.hasPrevious()){
            var location= iterator.previous();
            System.out.println("we are in "+location);
       }
       else{
        System.out.println("We are in "+iterator.next()/*+iterator.previous()+" distance= "+iterator.next().getDistance()*/);
       }   
    }
    public static void  forward( ListIterator<Places> iterator ){
        System.out.println(iterator.hasNext());
        if (iterator.hasNext()){
            var location=  iterator.next();
            System.out.println("We are in "+location);
        }
        else{
            System.out.println("We are in "+iterator.previous());
        }
    }

}