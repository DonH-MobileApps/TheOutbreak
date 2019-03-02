package com.example.theoutbreak;



public class MainActivity {



private static int getDataSize(Room[][] matrix, int row, int column) {
    if (row < 0 || column < 0 || row > matrix.length || column >= matrix[row].length) {
        return 0;
    }
    if (!matrix[row][column].isInfected || matrix[row][column].visited) {
        return 0;
    }

    matrix[row][column].visited = true;
    int size = 1;
    for (int r = row - 1; r <= row + 1; r++) {

        for (int c = column - 1; c <= column + 1; c++) {

            if (r == row || c == column) {
                size += getDataSize(matrix, r, c);
            }
        }
    }
    return size;
}

    public static boolean isOutbreak(Room[][] floor) {
      //  int connectedRooms = 0;

        for (int row = 0; row < floor.length; row++) {

            for (int column = 0; column < floor[row].length; column++) {

                if (floor[row][column].isInfected && !floor[row][column].visited) {

                    int size = getDataSize(floor, row, column);

                    if (size >= 5)
                        return true;
                }
            }

        }

        return false;
    }
    public static void main(String[] arg) {
        Room[][] verticalTrue = new Room[][]{

                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}
        };


        Room[][] horizontalTrue = new Room[][]{
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(true), new Room(true), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
        };

        Room[][] noInfection = new Room[][]{
                {new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}
        };


        System.out.println("Horizontal = " + isOutbreak(horizontalTrue));
        System.out.println("Vertical = " + isOutbreak(verticalTrue));
        System.out.println("No Outbreak = " + isOutbreak(noInfection));

    }


    }