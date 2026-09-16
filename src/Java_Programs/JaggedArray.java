package Java_Programs;
public class JaggedArray {
    
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2, 3};
        jaggedArray[1] = new int[]{4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9};

        for (int[] jaggedArray1 : jaggedArray) {
            for (int j = 0; j < jaggedArray1.length; j++) {
                System.out.print(jaggedArray1[j] + " ");
            }
            System.out.println();
        }
    }
}
