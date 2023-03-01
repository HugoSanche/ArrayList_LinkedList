import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

        ArrayList<String> arrayList2=new ArrayList<>(List.of("KArina","Veronica","Yaneth"));


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









    }
}
