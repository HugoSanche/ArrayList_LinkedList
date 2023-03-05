import java.util.LinkedList;

//The difference between getFirst and peekFirst in LinkedList

//If the firts element is null like this example getFirst return exeption
//but qhen you use .peekFirst return null, no a exception
public class TestList2 {

    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();

       //Exception in thread "main" java.util.NoSuchElementException
       // System.out.println("First Element "+list.getFirst());
       
       //return null for the first element
       System.out.println("First Element "+list.peekFirst());


    }
}
