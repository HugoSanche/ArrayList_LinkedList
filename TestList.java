import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
        grocery.add("Yogurt");
        System.out.println(grocery);
        
        System.out.println("************************************"); 

        ArrayList<String> nextList =new ArrayList<>(List.of("cheese","mustard","pickles" ));
        System.out.println(nextList);
       
        //agrega una collection 
        // Copy ArrayList to ArrayList
        grocery.addAll(nextList);
        System.out.println(grocery);

        System.out.println("----------------------------------");

        //search element
        System.out.println("Get element "+grocery.get(2));
        if (grocery.contains("cheese")){
            System.out.println("cheese esta dentro de la lista");
        }
        grocery.add("Yogurt");
        //busca la primera ocurrencia de Yogurt
        System.out.println("First element "+grocery.indexOf("Yogurt"));
        
        //busca la ultima ocurrencia de Yogurt
        System.out.println("Last element "+grocery.lastIndexOf("Yogurt"));

        System.out.println(grocery);

        grocery.remove(1);
        grocery.remove("Yogurt");

        System.out.println(grocery);

        //remove all elements from the list
        grocery.removeAll(List.of("Banana","cheese","pickles"));
        System.out.println(grocery);

        grocery.add("PineApple");
        System.out.println(grocery);

        //retain all elements from the list
        grocery.retainAll(List.of("mustard","PineApple"));

        System.out.println(grocery);
        grocery.clear();
        System.out.println(grocery);

        System.out.println(" Grocery is empty? "+grocery.isEmpty());

        grocery.addAll(List.of("Banana","Pera", "Apple"));
        grocery.addAll(Arrays.asList("cheese","milk","mustard","pickles"));

        System.out.println(grocery);
        grocery.sort(Comparator.naturalOrder());
        System.out.println(grocery);
        grocery.sort(Comparator.reverseOrder());
        System.out.println(grocery);

        var groceryArray=grocery.toArray(new String[grocery.size()]);
        System.out.println(Arrays.toString(groceryArray));
        System.out.println(groceryArray[0]);
        
        //groceryArray.get(2); error ya no es un ArrayList sino un array


    }
}
