
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class Test {
  static  Scanner scan =new Scanner(System.in);
   static  String items;
    public static void main(String[] args) {
        ArrayList<String> myItems = new ArrayList<>();

        Integer opt;
        while(true){
           System.out.println("Selecciona una opcion");
            System.out.println("Avaliable Actions");
            System.out.println("0 - to Shutdown");
            System.out.println("1 - to Add items (comma delimited list)");
            System.out.println("2 - to remove any items (comma delimited list)");
            opt=scan.nextInt();
            switch(opt){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    myItems  =addItem(myItems);
                    System.out.println(myItems);
                    break;
                case 2:
                    //myList.remove(0);
                    System.out.println("Remove "+opt);
                    break;
                default:
                    System.out.println("Incorrect Option");
                    break;
            }
        }
       // ArrayList<String> items = new ArrayList<>(Arrays.asList(userInpGroceries.split(",")))
    }
    public static ArrayList<String> addItem(ArrayList<String> myArray){
        System.out.println("Introduce los valores separados por , ");
        items=scan.next(); 
        
        System.out.println("uno");      
        ArrayList<String> myList = new ArrayList<>(Arrays.asList(items.split(",")));
       
        System.out.println(myArray);
        System.out.println(myList);
        myArray.addAll(myList);
        System.out.println(myArray);
        
        return myArray;      
}
}
