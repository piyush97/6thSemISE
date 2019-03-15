import java.util.Iterator;
import java.util.LinkedList;

class Address
{
    String name;
    String street;
    String state;
    String city;
    String code;
    public Address(String name, String street, String state, String city,
            String code) 
    {
        this.name = name;
        this.street = street;
        this.state = state;
        this.city = city;
        this.code = code;
    }
    
    public String toString()
    {
        return "Name= " + name + ", street=" + street + ", state="
                + state + ", city=" + city + ", code=" + code + "\n";
    }
    
}
public class MailList 
{
    public static void main(String[] args) 
    {
        LinkedList<Address> mail=new LinkedList<Address>();
        mail.add(new Address("John","12","avenue","urban","500064"));
        mail.add(new Address("Adam","27","avn","city","500064"));
        mail.add(new Address("Carl","34","vrnue","urban","500064"));
        mail.add(new Address("Mike","65","enue","city","500064"));
        mail.add(new Address("YoBr","98","aveue","urban","500064"));
        
        
        Iterator i = mail.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
//        for(Address obj:mail)
//            System.out.println(obj);
    }

}