import java.io.File;

public class Main {

     static void searchjava(File file){
        for (File f : file.listFiles()) {
            if(f.getName().endsWith(".java")) System.out.println(f.getName());
            if(f.isDirectory()) searchjava(f);
        }
    }

    public static void main(String[] args) {
        File file = new File("./");
        searchjava(file);
    }
}
