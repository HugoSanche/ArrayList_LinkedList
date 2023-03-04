import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Challenge {
  static  Scanner scan =new Scanner(System.in);
   static  String items;
    public static void main(String[] args) {
        ArrayList<String> myItems = new ArrayList<>();

        while(true){
            printMenu();
            
            switch(scan.nextInt()){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    myItems  =addItem(myItems);
                    print(myItems);
                    break;
                case 2:
                    myItems=remove(myItems);
                    print(myItems);
                    break;
                default:
                    System.out.println("Incorrect Option");
                    break;
            }
        }
       // ArrayList<String> items = new ArrayList<>(Arrays.asList(userInpGroceries.split(",")))
    }
    public static ArrayList<String> addItem(ArrayList<String> myArray){
        System.out.println("Enter the values separared by commas ");
        
        String[] myItems=scan.nextLine().toUpperCase().split(",");
        var newList= Arrays.asList(myItems);
       
        boolean exist=myArray.containsAll(newList);
        
        if(!exist){
            ArrayList<String> myList = new ArrayList<>(Arrays.asList(items.split(",")));
            myArray.addAll(myList);
        }
        else{
            System.out.println("The value allready exists");
        }
        return myArray;      
    }
    public static ArrayList<String>  remove(ArrayList<String> myArray) {
        scan.nextLine();
        System.out.println("Enter the values to remove");
        String values=scan.nextLine().toUpperCase();
        String[] myItems=values.split(",");
        var array=Arrays.asList(myItems);
        if (!myArray.containsAll(array))
            {
                System.out.println("The value doesnot exist");
            }
        else{
            myArray.removeAll(array);
        }
        return myArray;
    }
    public static void print(ArrayList<String> array){
        array.sort(Comparator.naturalOrder());
        System.out.println("------------------\n");
        System.out.println(array);
        System.out.println("------------------\n");
    }
    public static void printMenu(){
        String textBlock="""
            Avaliable Actions
            0 - to Shutdown
            1 - to Add items (comma delimited list)
            2 - to remove any items (comma delimited list)
            Enter a number for which action you wanth to do """;
            System.out.println(textBlock+" ");
    }
}
