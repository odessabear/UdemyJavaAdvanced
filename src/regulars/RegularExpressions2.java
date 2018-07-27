package regulars;

import java.util.Arrays;

public class RegularExpressions2 {
    public static void main(String[] args) {
        String a = "Hello1242354there4545345hey35345skafh";
        String[]words=a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b = "Hello34234there23434234hey";
        System.out.println(b.replaceAll("\\d+","-"));
        System.out.println(b.replaceFirst("\\d+","-"));


    }
}
