import java.util.ArrayList;

record GroceryItems(String name, String type, int count){
    public GroceryItems(String name){
    this(name, "daily",1);
}
}

public class GroceryStore{
    //record is inmutable, automatically create getters, toString
    //is useful when yu dont set values only uses for read
  

    public static void main(String[] args) {
        Object[] objectItems=new Object[4];
        objectItems[0]=new GroceryItems("Jabon");  
        objectItems[1]=new GroceryItems("Apples","Red",10);
        objectItems[2]="Oranges"; //lo permite pero es incorrecto

        GroceryItems[] groceryItems=new GroceryItems[3];
        groceryItems[0]=new GroceryItems("Jabon");  
        groceryItems[1]=new GroceryItems("Apples","Red",10);
        objectItems[2]="Oranges"; 

        //si no especificas de que tipo es ArrayList te crea un array de tipo Object
        ArrayList objecList =new ArrayList();
        objecList.add(new GroceryItems("Banana", "MAcho", 5));

        ArrayList<GroceryItems> groceryList =new ArrayList<>();
        groceryList.add( new GroceryItems("Apples","Red",10));
        groceryList.add( new GroceryItems("Bananas","small",10));

    }
}