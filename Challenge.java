import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String opt;
        opt=scan.nextLine();
        switch(opt){
            
            case "0":
                System.exit(0);
                break;
            case "1":
                addItem();
                break;
            case "2":
                remove();
                break;
            default:
                System.out.println("Incorrect Option");
                break;
        }
    
    }
   
    public static void remove() {
        System.out.println("remove");
    }
    public static void print(){
        System.out.println("print");
    }
}
