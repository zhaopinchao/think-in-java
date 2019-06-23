package arrays.practise;

import com.sun.codemodel.internal.fmt.JTextFile;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class Practise4  {

    public static void main(String[] args) throws IOException {
        System.out.println();
        File file = new File(new File("").getAbsolutePath()+"/src/arrays/practise/Practise3.java");
        FileInputStream fileInputStream = new FileInputStream(file);//("/Users/zhaopinchao/IdeaProjects/think-in-java/src/arrays/practise/Practise3.java");
        int l = 0;
        int i = 0;
        byte[] bytes = new byte[1024];
        String s = "";
        while ((l = fileInputStream.read(bytes)) != -1){
            s = new String(bytes);
        }
        List<String> list = Arrays.asList(s.split("\\W+"));
        System.out.println("list = " + list);
    }
}
