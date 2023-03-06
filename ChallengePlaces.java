
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class ChallengePlaces {
    static  Scanner scan =new Scanner(System.in);
    public static void main(String[] args) {
        Places[] places ={new Places("Sidney",0),
                        new Places("Aline Springs",2771),
                        new Places("Brisbane",917),
                        new Places("Darwin",3972),
                        new Places("Melbourne",877),
                        new Places("Perth",3923),
                        };
        
        LinkedList<Places> myPlaces=new LinkedList<>();
        addCity(places, myPlaces);
        ListIterator<Places> iterator=myPlaces.listIterator();
        iterator.hasNext();              
        boolean flag=true;
        while(flag){

            printMenu();
            char c = scan.next().charAt(0);
            switch(c){
             
                case 'F':
                    forward(myPlaces, iterator);
                    //printPlaces(myPlaces);
                    break;
                case 'B':
                    backward(myPlaces, iterator);
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
        Places lastPlace=list.getFirst();
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
    public static void  backward(LinkedList<Places> list, ListIterator<Places> iterator){
       System.out.println(iterator.hasPrevious());
       if(iterator.hasPrevious()){
            var location= iterator.previous();
            System.out.println("we are in "+location);
       }
       else{
        System.out.println("We are in "+iterator.next()/*+iterator.previous()+" distance= "+iterator.next().getDistance()*/);
       }   
    }
    public static void  forward(LinkedList<Places> list, ListIterator<Places> iterator ){
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