import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class English {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("HELL");
        BufferedReader br = new BufferedReader(new FileReader("./src/main/java/gg.txt"));
        List<String> list = new ArrayList<>();
        String s;
        while((s=br.readLine())!=null) {
            String[] k = s.split("\t");
            //System.out.println(k[1]);
            list.add(k[1]);
        }
        br.close();
        Collections.shuffle(list);
        PrintWriter pw = new PrintWriter(new FileWriter("./src/main/java/hhh.txt"));
        for(int i = 0;i<list.size();i++) {
            //System.out.println((i+1)+". "+list.get(i));
            String h = (i+1)+". "+list.get(i);
            pw.println(h);
        }
        pw.flush();
    }
}
