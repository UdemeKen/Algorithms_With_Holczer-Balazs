package org.bughunter.nQueensProblem;

public class NQueensProblem {
    private int[][] chessTable;
    private int numberOfQueens;

    public NQueensProblem(int numberOfQueens) {
        this.numberOfQueens = numberOfQueens;
        this.chessTable = new int[numberOfQueens][numberOfQueens];
    }

    public void solve() {
//        start solving the problem starting with the first column
//        another interpretation: start placing the queens starting with index
        if (setQueens(0)){
            printQueens();
        } else {
            System.out.println("There is no solution ...");
        }
    }

    public boolean setQueens(int colIndex) {
        if (colIndex == numberOfQueens) {
            return true;
        }
//        consider all the possible locations in the given column one by one
        for(int rowIndex = 0; rowIndex < numberOfQueens; rowIndex++) {
//            is the location valid for the given queen?
            if (isPlaceValid(rowIndex, colIndex)) {
//                the location is valid (1 means there is a queen)
                chessTable[rowIndex][colIndex] = 1;
//                solve the problem for the next column (next queen)
                if (setQueens(colIndex + 1)) {
                    return true;
                } else {
//                    BACKTRACK
                    chessTable[rowIndex][colIndex] = 0;
                }
            }
        }
//            can not find a valid location (we have tried all the rows without any success)
//            have to change the position of the already settled queens
            return false;
    }

    private boolean isPlaceValid(int rowIndex, int colIndex) {
//        there can not be other queens in the same row
        for(int i = 0; i < colIndex; i++) {
            if (chessTable[rowIndex][i] == 1) {
                return false;
            }
        }
//            we do not have to check the columns

//            check the diagonal
//            diagonal locations from top left to bottom right
        for (int i = rowIndex, j = colIndex; i >= 0 && j >= 0; i--, j--) {
                if (chessTable[i][j] == 1) {
                    return false;
                }
            }

//        diagonal from top right to bottom left
        for (int i= rowIndex, j = colIndex; i < chessTable.length && j >= 0; i++, j--) {
            if (chessTable[i][j] == 1) {
                return false;
            }
        }
//        the position (rowIndex, colIndex) is valid - there are no "collisions"
        return true;
    }

//    1 represent the queen
//    0 means that the cell is empty
    private void printQueens() {
        for(int i = 0; i < chessTable.length; i++) {
            for(int j = 0; j < chessTable.length; j++) {
                if (chessTable[i][j] == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }
}
