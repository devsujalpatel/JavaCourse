public class Array {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        int marks[] = new int[3];
        marks[0] = 95; // phy
        marks[1] = 90; // chem
        marks[2] = 85; // math
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}