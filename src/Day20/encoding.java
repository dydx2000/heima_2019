package Day20;

import java.io.FileReader;
import java.io.IOException;

public class encoding {
    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("D:\\Users\\Peter\\IdeaProjects\\JavayoutubeDemo\\src\\Day20\\gbk.txt");
        FileReader fr = new FileReader("./gbk.txt");
        int len =0;
        while ((len = fr.read())!=-1){
            System.out.print((char) len);
        }
        fr.close();

    }
}

