import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileReader;
public class Main {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int c;String b,url;
        History h = History.getInstance();
        System.out.println("1 - url\n"+"2 - history\n"+"3 - exit\n");
        while(true){
            c = sc.nextInt();
            if( c == 1){
                b = sc.next();
                h.writeHistory(b);
            }
            else if(c == 2){
                try{
                    BufferedReader br = new BufferedReader(new FileReader("Hist.txt"));
                    while((url = br.readLine()) != null) {
                        System.out.println(url);
                    }

                }
                catch(Exception e){
                    System.out.println("File not found");
                }
            }
            else
                break;
        }
    }
}
