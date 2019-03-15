// Demonstrate HashSet.
import java.util.*;
class HashSetDemo {
public static void main(String args[]) {
// Create a hash set.
HashSet<String> hs = new HashSet<String>();
// Add elements to the hash set.
hs.add("B");
hs.add("D");
hs.add("F");
hs.add("E");
hs.add("C");
hs.add("A");
hs.add("D");
hs.add("C");
hs.add("A");
System.out.println(hs);
}
}