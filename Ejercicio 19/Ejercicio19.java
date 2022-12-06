import java.util.Scanner;
public class Ejercicio19{
    public static void main(String[] args){
            Scanner valor = new Scanner(System.in);
            int filas,colum;
            System.out.print  ("Ingrese filas: ");
            filas=valor.nextInt();
            System.out.print("Ingrese columnas ");
            colum=valor.nextInt();
            while(filas!=colum){
                System.out.print("Las columnas tienen que se iguales a las filas: ");
                System.out.print("Ingrese Filas: ");    
                filas=valor.nextInt();
            }
            int [][] mat = new int[filas][colum];
            matrix2(mat,filas);
            mostrar(mat,filas);
            AntiSimetrica(mat,filas);
    }   // cierre del main

    
public static void AntiSimetrica(int mat[][], int fila){
    boolean bandera;
    bandera=false;
    for (int i=0;i<fila ;i++ ) {
        for (int j=0;j<fila ;j++ ) {
            if(i==j){
                if(mat[i][j]==0){
                    bandera=true;
                }else{
                    bandera=false;
                }
            }
        }
    }
     if(bandera==true){
            System.out.print("La matriz es Anti Simetrica");
     }else{
            System.out.print("La matriz no es Anti Simetrica");
     }
}
public static void  matrix2(int[][] mat,int fila){
    Scanner result = new Scanner(System.in);
    for (int i=0;i<fila ;i++ ) {
        for (int j=0;j<fila ;j++ ) {
            System.out.print("Ingrese numero: ");
            mat[i][j]=result.nextInt();
            while(mat[i][j]<0 || mat[i][j]>=10){
                System.out.print("Ingrese numero entre 1 y 9 : ");
                mat[i][j]=result.nextInt();
            }
         }
    }


}
 public static void  mostrar(int[][] matrix,int aux){
      for ( int i=0;i<aux ; i++) {
          for ( int j=0;j<aux ;j++ ) {
            System.out.print(" "+matrix[i][j]);
          }
          System.out.println();
        }  
  }
}  // cierre de la clase