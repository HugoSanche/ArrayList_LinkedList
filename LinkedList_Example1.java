import java.util.LinkedList;

public class LinkedList_Example1 {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        list.add("Karina");
        list.add(0,"Veronica");
        addElements(list);
        System.out.println(list);
        removeElements(list);
    }
    public static void addElements(LinkedList<String> list){
        list.addFirst("Diana");
        list.addLast("Hugo");
        System.out.println("Before queue "+list);
        //queue methods
        list.offer("Keira");
        list.offerFirst("Lionel");
        list.offerLast("Dodo");

        /*NOTA.- the difference between .add and .offer
            if for any razon doesnot can add. 
                .add retuns a must throw an exception (rather than returning false)
         
            .offer 
            doesnot return must throw an exception (rather than returning false)

        Is always preferible to use .offer over .add
        */

        //stack methods
        list.push("Rocio");
        System.out.println("after queu "+list);

    }
    public static void removeElements(LinkedList<String> list){
        list.remove(0);
        list.remove("Hugo");
        System.out.println(list);
        String str = list.remove();//remove first element
        System.out.println("Element removed "+str);

        String str1 = list.removeFirst();//remove first element
        System.out.println("Removed First Element "+str1);

        String str2 = list.removeLast();//remove first element
        System.out.println("Removed Last Element "+str2);

        list.offer("Leydi");
        list.add(0,"Hugo");
        System.out.println(list);
        String poll = list.poll();//remove first element
        System.out.println("Element removed "+poll);

        String poll1 = list.pollFirst();//remove first element
        System.out.println("Removed First Element "+poll1);

        String poll2 = list.pollLast();//remove first element
        System.out.println("Removed Last Element "+poll2);
        
        System.out.println(list);

        list.pop();//remove the last element
        System.out.println(list);
    }
}
