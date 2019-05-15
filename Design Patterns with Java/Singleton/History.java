import java.io.*;
public class History {
    private static History h;
    private History(){}
    static History getInstance(){
        if(h == null){
            h = new History();
        }
        return h;
    }
    void writeHistory(String url){
        try{
           PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Hist.txt",true)));
           out.println(url);
           out.close();
        }
        catch(Exception e){
            System.out.println("Could not open file");
        }

    }

}
