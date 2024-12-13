import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);
        // char at index
        // System.out.println(sb.charAt(0));

        // set char at index
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // insert char at index
        // sb.insert(2, 'n');
        // System.out.println(sb);

        // // deleting
        // sb.delete(2, 4);
        // System.out.println(sb);
        // appending new character at end
        StringBuilder sb = new StringBuilder("h");

        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
    }
}