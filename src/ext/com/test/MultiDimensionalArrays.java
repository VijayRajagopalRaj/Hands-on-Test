package src.ext.com.test;

import java.util.Scanner;

import static java.lang.System.out;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // One-Dimensional Array
        int[] marks1D = new int[5];
        out.println("Enter marks for 5 subjects (1D array):");
        for (int i = 0; i < marks1D.length; i++) {
            out.print("Subject " + (i + 1) + " marks: ");
            marks1D[i] = scanner.nextInt();
        }
        int[] hardcoded1D = {85, 90, 78, 88, 92};

        // Two-Dimensional Array
        int[][] marks2D = new int[2][5];
        for (int i = 0; i < 2; i++) {
            out.println("Enter marks for Class " + (i + 5) + ":");
            for (int j = 0; j < 5; j++) {
                out.print("Subject " + (j + 1) + " marks: ");
                marks2D[i][j] = scanner.nextInt();
            }
        }
        int[][] hardcoded2D = {{85, 90, 78, 88, 92}, {80, 85, 88, 90, 86}};

        // Three-Dimensional Array
        int[][][] marks3D = new int[3][2][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                out.println("Enter marks for Class " + (i + 5) + " Section " + (j + 1) + ":");
                for (int k = 0; k < 5; k++) {
                    marks3D[i][j][k] = scanner.nextInt();
                }
            }
        }
        int[][][] hardcoded3D = {{{85, 90, 78, 88, 92}, {80, 85, 88, 90, 86}},
                {{78, 82, 85, 80, 88}, {75, 79, 82, 84, 81}},
                {{89, 91, 85, 87, 90}, {83, 86, 88, 89, 85}}};

        // Four-Dimensional Array 
        int[][][][] marks4D = new int[4][3][2][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    out.println("Enter marks for Class " + (i + 5) + " Section " + (k + 1) + " Group " + (j + 1) + ":");
                    for (int l = 0; l < 5; l++) {
                        marks4D[i][j][k][l] = scanner.nextInt();
                    }
                }
            }
        }
        int[][][][] hardcoded4D = {{{{85, 90, 78, 88, 92}, {80, 85, 88, 90, 86}},
                {{78, 82, 85, 80, 88}, {75, 79, 82, 84, 81}},
                {{89, 91, 85, 87, 90}, {83, 86, 88, 89, 85}}},
                {{{79, 81, 85, 86, 84}, {82, 85, 87, 90, 88}},
                        {{76, 78, 80, 82, 84}, {85, 87, 89, 91, 92}},
                        {{88, 90, 91, 92, 93}, {84, 86, 87, 88, 89}}}};

        // Printing values using for loop and foreach
        out.println("Marks from 1D array:");
        for (int mark : marks1D) {
            out.print(mark + " ");
        }
        out.println("Hardcoded 1D:");
        for (int mark : hardcoded1D) {
            out.print(mark + " ");
        }

        out.println("Marks from 2D array:");
        for (int[] classMarks : hardcoded2D) {
            for (int mark : classMarks) {
                out.print(mark + " ");
            }
            out.println();
        }

        out.println("Marks from 3D array:");
        for (int[][] classMarks : hardcoded3D) {
            for (int[] sectionMarks : classMarks) {
                for (int mark : sectionMarks) {
                    out.print(mark + " ");
                }
                out.println();
            }
            out.println();
        }

        out.println("Marks from 4D array:");
        for (int[][][] classMarks : hardcoded4D) {
            for (int[][] groupMarks : classMarks) {
                for (int[] sectionMarks : groupMarks) {
                    for (int mark : sectionMarks) {
                        out.print(mark + " ");
                    }
                    out.println();
                }
                out.println();
            }
            out.println();
        }
    }
}
