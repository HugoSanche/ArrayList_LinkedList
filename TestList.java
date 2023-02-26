import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {

        //Como copiar colleciones (String to List, 
        //List to ArrayList and ArrayList to ArrayList)
        String[]  items ={"Banana","Pera", "Apple"};
        //Integer[] enteros ={1,2,3};

        //Copy String to List, 
        List<String> list=List.of(items);
       
        System.out.println(list);
        System.out.println(list.getClass().getName());
        //list.add("Milk");//error en tiempo de ejecucion

        System.out.println("************************************");    
        //Copy List to ArrayList
        ArrayList grocery= new ArrayList<>(list);
        grocery.add(new GroceryItems("Yogurt"));
        System.out.println(grocery);
        
        System.out.println("************************************"); 

        ArrayList<String> nextList =new ArrayList<>(List.of("cheese","mustard","pickles" ));
        System.out.println(nextList);
       
        //agrega una collection 
        // Copy ArrayList to ArrayList
        grocery.addAll(nextList);
        System.out.println(grocery);
    }
}
