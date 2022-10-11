package lang.print.gaps.task4;

import java.io.PrintWriter;

public class IntRepresentation {
    public static void main(String[] args) {
        char chc = 'c';
        char chh = 'h';
        char cha = 'a';
        char chr = 'r';
        /*
        int c = c - '0';
        int h = chh - '0';
        int a = cha - '0';
        int r = chr - '0';
        */


        int c = Character.getNumericValue('c');
        int h = Character.getNumericValue('h');
        int a = Character.getNumericValue('a');
        int r = Character.getNumericValue('r');

      /*  int[] myChar = {c, h, a, r};

        Writer writer = new PrintWriter(System.out);

        writer.write(myChar, 0, 4);
        writer.flush();
        */



        System.out.println(c);
        System.out.println(h);
        System.out.println(a);
        System.out.println(r);


    }
}
