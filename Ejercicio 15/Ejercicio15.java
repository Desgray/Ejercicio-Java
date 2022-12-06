import java.util.Scanner;
public class Ejercicio15 {
		public static void main(String[] args) {
 			int[] vector = new int[100];
            for (int i=0;i<vector.length ;i++) {
                    vector[i]=i;
            }
            for (int i=vector.length-1;i>=0 ;i--) {
                    System.out.println(vector[i]);
            }
		}
}