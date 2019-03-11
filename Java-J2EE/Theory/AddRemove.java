import java.util.*;

public class AddRemove {
   public static void main(String args[]) {
      /* Creating ArrayList of type "String" which means
       * we can only add "String" elements
       */
      ArrayList<String> obj = new ArrayList<String>();

      /*This is how we add elements to an ArrayList*/
      obj.add("Ajeet");
      obj.add("Harry");
      obj.add("Chaitanya");
      obj.add("Steve");
      obj.add("Anuj");

      // Displaying elements
      System.out.println("Original ArrayList:");
      for(String str:obj)
         System.out.println(str);

      /* Add element at the given index
       * obj.add(0, "Rahul") - Adding element "Rahul" at first position
       * obj.add(1, "Justin") - Adding element "Justin" at second position
       */
      obj.add(0, "Rahul");
      obj.add(1, "Justin");

      // Displaying elements
      System.out.println("ArrayList after add operation:");
      for(String str:obj)
         System.out.println(str);

      //Remove elements from ArrayList like this
      obj.remove("Chaitanya"); //Removes "Chaitanya" from ArrayList
      obj.remove("Harry"); //Removes "Harry" from ArrayList

      // Displaying elements
      System.out.println("ArrayList after remove operation:");
      for(String str:obj)
         System.out.println(str);

      //Remove element from the specified index
      obj.remove(1); //Removes Second element from the List

      // Displaying elements
      System.out.println("Final ArrayList:");
      for(String str:obj)
         System.out.println(str);
   }
}
