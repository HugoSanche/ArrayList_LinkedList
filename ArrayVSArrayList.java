
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayVSArrayList {
    public static void main(String[] args) {
        
        //Array suport primitive types
        //ArrayList doesnot support primitive types

        //Array not resizable
        //ArrayList resizable

        //ArrayList implements List interface

        //Instantiating without values
        String[] array =new String[10];
        ArrayList<String> arrayList =new ArrayList<>();


        //Instantiating with values
        String[] arrayb=new String[] {"Pedro", "pablo","Irma"};
        String[] arrayc= {"Pedro","Pablo","Irma"}; //anonymous array 

        List<String> test =Arrays.asList(arrayb);

        ArrayList<String> arrayList2=new ArrayList<>(List.of("Karina","Veronica","Yaneth"));


        //Accesing Array Element data
        int element=array.length-1;
        array[0]="Hugo";
        String data= array[0];
        System.out.println(Arrays.toString(array));

        //Accesing ArrayList Element data
        int elementList=arrayList.size()-1;
        arrayList.add(0,"Hugo");
        String dataList=arrayList.get(0);
        System.out.println(arrayList);

        //multidimencional
        String[][] arrayMulti = {
                               {"One","two","Three"},
                               {"Four","Five"} 
        };
        System.out.println(Arrays.deepToString(arrayMulti));

        ArrayList<ArrayList<String>> arrayListMulti= new ArrayList<>();
        System.out.println(arrayListMulti);

        ///Finding an element 

        //array must be order to find a element
        Arrays.sort(arrayb);
        if (Arrays.binarySearch(arrayb, "Pedro")>=0)
        {
            System.out.println("Elemento encontrado");
        }
    
        System.out.println(arrayList2.contains("Veronica"));

        //Sorting
        Arrays.sort(arrayb);
        arrayList2.sort(Comparator.naturalOrder());
        arrayList2.sort(Comparator.reverseOrder());

        System.out.println("****************000");
        //Array >>>ArrayList
        Integer[] arrayInt=new Integer[] {1,2,3,4,5};
        var newList= Arrays.asList(arrayInt);
        newList.set(0, 9);

        System.out.println("List "+newList);
        //check arrayInt also modify the value 
        System.out.println("Array "+Arrays.toString(arrayInt));

        //new List cannot remove or add elements.- Remeber ArrayLista can remove and add elements and Array cannot remove or add element
       // newList.remove(0); //runtime error
        //newList.add(6);//runtime error

        System.out.println("*******************************");

        //Returned List is NOT resizeable, but is mutable
        //Using Arrays.asList
        var myList=Arrays.asList("One","Two","Three");
        String[] numbers=new String[]{"One", "Two","Three"};
        List<String> newMyList=Arrays.asList(numbers);

        //Returned List is IMMUTABLE
        //Using List.of
        var otherList =List.of("One","Two","Three");
        String[] otherNumbers=new String[] {"One","Two","Three"};
        List<String> newOtherList =List.of(otherNumbers);

        

    }
}
