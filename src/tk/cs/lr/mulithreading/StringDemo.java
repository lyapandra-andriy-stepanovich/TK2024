package tk.cs.lr.mulithreading;

import org.w3c.dom.ls.LSOutput;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("string 01");
        String s2 = new String("string 01");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        String s3 = "string 01";
        String s4 = "string 01";
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
    }
}
