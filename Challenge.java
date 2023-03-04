import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Challenge {
    static  Scanner scan =new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> myItems =new ArrayList<>();
        boolean flag=true;
        while(flag){

            printMenu();
            switch(scan.nextInt()){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                
                    addItem(myItems);
                    print(myItems);
                    break;
                case 2:
                    removeItem(myItems);
                    print(myItems);
                    break;
                default:
                    System.out.println("Incorrect Option");
                    break;
            }
         }
    }
    public static void addItem(ArrayList<String> array ){
        System.out.println("Enter the values separared by commas ");
        scan.nextLine();
        String[] values=scan.nextLine().toUpperCase().split(",");

        for (int i=0; i<values.length; i++){
           // System.out.println("*****Spaces *****"+values[i]);
            String spaces=values[i].trim();
           // System.out.println("*****Spaces *****"+spaces);
            array.add(spaces);
        }
    }
    public static void removeItem(ArrayList<String> array ){
        System.out.println("Enter the values to remove");
        scan.nextLine();
        String[] values=scan.nextLine().toUpperCase().split(",");
        
        for (int i=0; i<values.length; i++){
            String spaces=values[i].trim();
          // System.out.println("Spaces "+spaces);
            array.remove(spaces);
        }
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

