import java.util.LinkedList;

public class hw_4_1 {
   //Метод добавляет элементы в LinkedList
   public static void main(String[] args){
      LinkedList<Integer> LList = new LinkedList<>();

      for (int i = 0; i < 10; i++) {
         LList.add(i);
      }
      System.out.println(LList);

      reversLList(LList);
   }
//Метод переворачивает LinkedList и выводит новый
   public static void reversLList(LinkedList<Integer> LList){
      LinkedList<Integer> newLinkedList = new LinkedList<Integer>();
      for (int i = 0; i < LList.size(); i++) {
         newLinkedList.addFirst(LList.get(i));
      }

      System.out.println(newLinkedList);

      // for (int j = 0; j < newLinkedList.size(); j++) {
      //    System.out.print(newLinkedList.get(j)+" ");
      // }
   }
}
