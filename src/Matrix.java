import javax.swing.*;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        /* Este programa en Java permite al usuario ingresar
        los elementos de una matriz y luego los muestra en la consola.*/

        Scanner src = new Scanner(System.in);
        int matrix[][], nRows, nCols; // Se declara una matriz y las variables para almacenar el número de filas y columnas

        // Se solicita al usuario ingresar el número de filas y columnas mediante ventanas de diálogo
        nRows = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows"));
        nCols = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of columns"));

        matrix = new int[nRows][nCols]; // Se inicializa la matriz con el tamaño especificado por el usuario

        System.out.println("Enter the elements of the matrix");

        // Se recorre la matriz para permitir al usuario ingresar los elementos
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                System.out.println("Matrix [" + i + "][" + j + "]"); // Se solicita al usuario que ingrese el elemento para la posición [i][j]
                matrix[i][j] = src.nextInt();
            }
        }

        System.out.println("\nThe matrix is: ");

        // Se muestra la matriz en la consola
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrix[i][j]); // Se imprime el elemento en la posición [i][j]
            }
            System.out.println(" "); // Se agrega un espacio en blanco entre cada fila para mayor legibilidad
        }

        /*
        El programa utiliza la clase JOptionPane para mostrar cuadros de
        diálogo y permitir al usuario ingresar el número de filas y columnas.

        Utiliza un objeto Scanner para leer la entrada del usuario desde la consola
        para ingresar los elementos de la matriz.

        El programa asume que la matriz siempre tendrá 3 filas y 3 columnas
        en el bucle de impresión, lo cual es incorrecto. Debería usar las variables
        nRows y nCols para recorrer la matriz en lugar de un valor fijo como 3.

        El programa imprime la matriz en la consola, pero la forma de impresión
        puede no ser muy clara ya que no se distinguen claramente las filas.
        Sería útil agregar un formato más claro para imprimir la matriz, por ejemplo,
        separando los elementos de cada fila con espacios.
        */

    }
}
