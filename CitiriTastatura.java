import java.util.Arrays;
import java.util.Scanner;

public class CitiriTastatura {

    /*
        Metoda principala, de la care incepe executia programului.
        Codul de mai jos testeaza citirile de la tastatura, citind pe rand:
        un numar, de pe urmatoarea linie, un vector (care e alcatuit din
        dimensiunile matricei ce urmeaza sa fie citita) si o matrice cu dimensiunile n si m,
        citite mai sus. Dupa citire, ele sunt afisate in ordinea in care au
        fost citite
     */
    public static void main(String[] args) {
        int x = readIntFromConsole();
        int[] dim = readIntArrayFromConsole(" ");
        int[][] m = definedReadIntMatrixFromConsole(dim[0], dim[1], " ");


        System.out.println(x);
        System.out.println(Arrays.toString(dim));
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }

    /*
        Citirea unui numar intreg de la tastatura, presupunand
        ca exista un singur numar pe o linie
     */
    private static int readIntFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int data = Integer.parseInt(line);
        return data;
    }

    /*
        Citirea unui vector de numere intregi de la tastatura,
        despartite prin caracterul/sirul de caractere "splitter",
        aflate toate pe o singura linie
     */
    private static int[] readIntArrayFromConsole(String splitter) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbers = line.split(splitter);
        int[] v = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            v[i] = Integer.parseInt(numbers[i]);
        }

        return v;
    }

    /*
        Citirea unei matrici de numere intregi de la tastatura,
        avand "rows" linii si "columns" coloane, matrice
        in care numerele de pe o linie sunt despartite prin
        caracterul/sirul de caractere "splitter", iar liniile sunt
        despartite prin Enter.

     */
    private static int[][] definedReadIntMatrixFromConsole(int rows, int columns, String splitter) {
        Scanner scanner = new Scanner(System.in);
        String line;
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            line = scanner.nextLine();
            String[] row = line.split(splitter);

            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
            }
        }

        return matrix;
    }

    /*
        Citirea unei linii de la tastatura, sub forma de String
     */
    private static String readLineFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
