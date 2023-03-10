import java.util.LinkedList;
import java.util.ListIterator;

public class Cities {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Ciudad de MExico");
        list.add("Monterry");
        list.offer("Chiapas");
        list.offer("Canada");
        list.offer("Brasil");
        list.offerFirst("New York");
        list.offerLast("Austrlia");
        list.add(7, "Belgica");
        System.out.println(list);
       // printRout3(list);
        testIterator(list);
    }   
    public static void printRout(LinkedList<String> list){
        System.out.println("Trip start in "+list.peekFirst());
        String before=list.getFirst();
        //this iterate is not efficient in LinkedList
        for (int i=1; i<list.size(); i++){
            System.out.println(">> front "+before +" to "+list.get(i));
            before=list.get(i);
        }
        System.out.println("Trip ends in "+list.peekLast());
    }
    //its better than the first iterate but have a issu
    public static void printRout2(LinkedList<String> list){
        System.out.println("Trip start in "+list.peekFirst());
        String before=list.getFirst();
        for (String element: list){
            System.out.println(">> front "+before +" to "+element);
            before=element;
        }
        System.out.println("Trip ends in "+list.peekLast());
    }
    public static void printRout3(LinkedList<String> list){
        System.out.println("Trip start in "+list.peekFirst());
        String before=list.getFirst();
        ListIterator<String> iterate=list.listIterator(1);
        while(iterate.hasNext()){

            //next element of the list
            var nexCity=iterate.next();
            //String  nexCity=iterate.next();

            System.out.println(">> front "+before +" to "+nexCity);
            before=nexCity;
        }
        System.out.println("Trip ends in "+list.peekLast());
    }
    public static void testIterator(LinkedList<String> list){
        var iterator=list.listIterator();
        while(iterator.hasNext()){
            if (iterator.next().equals("Brasil")){
                iterator.remove();
            }
            //System.out.println(iterator.next());
        }

        //una vez que usaste iterator ya no puesde volver a empezar desde cero
        //tienes hacer backward con .hasPrevious
        //if you want to again use iterator you need to backward
        //print the las city to the firs city
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2=list.listIterator(2);
       // System.out.println(iterator2.next());
        System.out.println(iterator2.previous());

    }
}
