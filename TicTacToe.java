import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        char letter1 = ' ';
        char letter2 = ' ';
        char letter3 = ' ';
        char letter4 = ' ';
        char letter5 = ' ';
        char letter6 = ' ';
        char letter7 = ' ';
        char letter8 = ' ';
        char letter9 = ' ';
        System.out.println("---------");
        System.out.println("|" + " " + letter1 + " " + letter2 + " " + letter3 + " " + "|");
        System.out.println("|" + " " + letter4 + " " + letter5 + " " + letter6 + " " + "|");
        System.out.println("|" + " " + letter7 + " " + letter8 + " " + letter9 + " " + "|");
        System.out.println("---------");

        boolean gameIsOver = false;
        int Os=0;
        int Xs=0;
        while (gameIsOver != true) {
            char o = 'O';
            char x = 'X';
            char[] allLetter = new char[9];
            allLetter[0] = letter1;
            allLetter[1] = letter2;
            allLetter[2] = letter3;
            allLetter[3] = letter4;
            allLetter[4] = letter5;
            allLetter[5] = letter6;
            allLetter[6] = letter7;
            allLetter[7] = letter8;
            allLetter[8] = letter9;


            System.out.println("Enter the coordinates: ");
            Scanner scanner1 = new Scanner(System.in);
            int firstCoordinate = 0;
            int secondCoordinate = 0;


            boolean isOccupied = true;
            while(isOccupied == true) {
                if (!scanner1.hasNextInt()) {
                    System.out.println("You should enter numbers!");
                } else {
                    firstCoordinate = scanner1.nextInt();
                    secondCoordinate = scanner1.nextInt();
                    while (firstCoordinate > 3 || firstCoordinate < 1) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        System.out.println("Enter the coordinates: ");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                    }
                    while (secondCoordinate > 3 || secondCoordinate < 1) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        System.out.println("Enter the coordinates: ");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                    }
                }

                if (firstCoordinate == 1 && secondCoordinate == 1) {
                    if (letter1 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter1 = 'X';
                        Xs += 1;
                        isOccupied = false;
                    }
                }

                if (firstCoordinate == 1 && secondCoordinate == 2) {
                    if (letter2 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter2 = 'X';
                        Xs += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 1 && secondCoordinate == 3) {
                    if (letter3 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter3 = 'X';
                        Xs += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 2 && secondCoordinate == 1) {
                    if (letter4 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter4 = 'X';
                        Xs += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 2 && secondCoordinate == 2) {
                    if (letter5 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter5 = 'X';
                        Xs += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 2 && secondCoordinate == 3) {
                    if (letter6 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter6 = 'X';
                        Xs += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 3 && secondCoordinate == 1) {
                    if (letter7 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter7 = 'X';
                        Xs += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 3 && secondCoordinate == 2) {
                    if (letter8 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter8 = 'X';
                        Xs += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 3 && secondCoordinate == 3) {
                    if (letter9 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter9 = 'X';
                        Xs += 1;
                        isOccupied = false;
                    }
                }
            }

            System.out.println("---------");
            System.out.println("|" + " " + letter1 + " " + letter2 + " " + letter3 + " " + "|");
            System.out.println("|" + " " + letter4 + " " + letter5 + " " + letter6 + " " + "|");
            System.out.println("|" + " " + letter7 + " " + letter8 + " " + letter9 + " " + "|");
            System.out.println("---------");
            int row1 = letter1 + letter2 + letter3;
            int row2 = letter4 + letter5 + letter6;
            int row3 = letter7 + letter8 + letter9;
            int column1 = letter1 + letter4 + letter7;
            int column2 = letter2 + letter5 + letter8;
            int column3 = letter3 + letter6 + letter9;
            int diagonal159 = letter1 + letter5 + letter9;
            int diagonal357 = letter3 + letter5 + letter7;
            int[] allLines = new int[8];
            allLines[0] = row1;
            allLines[1] = row2;
            allLines[2] = row3;
            allLines[3] = column1;
            allLines[4] = column2;
            allLines[5] = column3;
            allLines[6] = diagonal159;
            allLines[7] = diagonal357;
            int NumberOfSameLines = 0;
            for (int i = 0; i < 8; i++) {
                if (allLines[i] == 264 || allLines[i] == 237) {
                    NumberOfSameLines += 1;
                }
            }

            if (Math.abs(Xs - Os) > 1 || NumberOfSameLines > 1) {
                System.out.println("Impossible");
                break;

            } else {
                if ((letter1 == letter2 && letter2 == letter3 && letter1 == o) || (letter4 == letter5 && letter5 == letter6 && letter4 == o) || (letter7 == letter8 && letter8 == letter9 && letter7 == o) || (letter1 == letter5 && letter5 == letter9 && letter1 == o) || (letter3 == letter5 && letter5 == letter7 && letter3 == o)) {
                    System.out.println("O wins");
                    gameIsOver = true;
                    break;
                }
                if ((letter1 == letter2 && letter2 == letter3 && letter1 == x) || (letter4 == letter5 && letter5 == letter6 && letter4 == x) || (letter7 == letter8 && letter8 == letter9 && letter7 == x) || (letter1 == letter5 && letter5 == letter9 && letter1 == x) || (letter3 == letter5 && letter5 == letter7 && letter3 == x)) {
                    System.out.println("X wins");
                    gameIsOver = true;
                    break;
                }
                if ((letter1 == letter4 && letter4 == letter7 && letter1 == o) || (letter2 == letter5 && letter5 == letter8 && letter2 == o) || (letter3 == letter6 && letter6 == letter9 && letter3 == o)) {
                    System.out.println("O wins");
                    gameIsOver = true;
                    break;
                }
                if ((letter1 == letter4 && letter4 == letter7 && letter1 == x) || (letter2 == letter5 && letter5 == letter8 && letter2 == x) || (letter3 == letter6 && letter6 == letter9 && letter3 == x)) {
                    System.out.println("X wins");
                    gameIsOver = true;
                    break;
                }
                if (Xs + Os == 9) {
                    System.out.println("Draw");
                    gameIsOver = true;
                } else {
                    System.out.println("Game not finished");
                }

            }
            if (gameIsOver == true){
                break;
            }










            System.out.println("Enter the coordinates: ");
            Scanner scanner = new Scanner(System.in);


            isOccupied = true;
            while(isOccupied == true) {
                if (!scanner1.hasNextInt()) {
                    System.out.println("You should enter numbers!");
                } else {
                    firstCoordinate = scanner1.nextInt();
                    secondCoordinate = scanner1.nextInt();
                    while (firstCoordinate > 3 || firstCoordinate < 1) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        System.out.println("Enter the coordinates: ");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                    }
                    while (secondCoordinate > 3 || secondCoordinate < 1) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        System.out.println("Enter the coordinates: ");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                    }
                }

                if (firstCoordinate == 1 && secondCoordinate == 1) {
                    if (letter1 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter1 = 'O';
                        Os += 1;
                        isOccupied = false;
                    }
                }

                if (firstCoordinate == 1 && secondCoordinate == 2) {
                    if (letter2 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter2 = 'O';
                        Os += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 1 && secondCoordinate == 3) {
                    if (letter3 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter3 = 'O';
                        Os += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 2 && secondCoordinate == 1) {
                    if (letter4 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter4 = 'O';
                        Os += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 2 && secondCoordinate == 2) {
                    if (letter5 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter5 = 'O';
                        Os += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 2 && secondCoordinate == 3) {
                    if (letter6 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter6 = 'O';
                        Os += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 3 && secondCoordinate == 1) {
                    if (letter7 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter7 = 'O';
                        Os += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 3 && secondCoordinate == 2) {
                    if (letter8 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter8 = 'O';
                        Os += 1;
                        isOccupied = false;
                    }
                }
                if (firstCoordinate == 3 && secondCoordinate == 3) {
                    if (letter9 != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                        scanner1 = new Scanner(System.in);
                        firstCoordinate = scanner1.nextInt();
                        secondCoordinate = scanner1.nextInt();
                        isOccupied = true;
                    } else {
                        letter9 = 'O';
                        Os += 1;
                        isOccupied = false;
                    }
                }
            }


            System.out.println("---------");
            System.out.println("|" + " " + letter1 + " " + letter2 + " " + letter3 + " " + "|");
            System.out.println("|" + " " + letter4 + " " + letter5 + " " + letter6 + " " + "|");
            System.out.println("|" + " " + letter7 + " " + letter8 + " " + letter9 + " " + "|");
            System.out.println("---------");

            allLines[0] = row1;
            allLines[1] = row2;
            allLines[2] = row3;
            allLines[3] = column1;
            allLines[4] = column2;
            allLines[5] = column3;
            allLines[6] = diagonal159;
            allLines[7] = diagonal357;
            for (int i = 0; i < 8; i++) {
                if (allLines[i] == 264 || allLines[i] == 237) {
                    NumberOfSameLines += 1;
                }
            }


            if (Math.abs(Xs - Os) > 1 || NumberOfSameLines > 1) {
                System.out.println("Impossible");
                break;

            } else {
                if ((letter1 == letter2 && letter2 == letter3 && letter1 == o) || (letter4 == letter5 && letter5 == letter6 && letter4 == o) || (letter7 == letter8 && letter8 == letter9 && letter7 == o) || (letter1 == letter5 && letter5 == letter9 && letter1 == o) || (letter3 == letter5 && letter5 == letter7 && letter3 == o)) {
                    System.out.println("O wins");
                    gameIsOver = true;
                    break;
                }
                if ((letter1 == letter2 && letter2 == letter3 && letter1 == x) || (letter4 == letter5 && letter5 == letter6 && letter4 == x) || (letter7 == letter8 && letter8 == letter9 && letter7 == x) || (letter1 == letter5 && letter5 == letter9 && letter1 == x) || (letter3 == letter5 && letter5 == letter7 && letter3 == x)) {
                    System.out.println("X wins");
                    gameIsOver = true;
                    break;
                }
                if ((letter1 == letter4 && letter4 == letter7 && letter1 == o) || (letter2 == letter5 && letter5 == letter8 && letter2 == o) || (letter3 == letter6 && letter6 == letter9 && letter3 == o)) {
                    System.out.println("O wins");
                    gameIsOver = true;
                    break;
                }
                if ((letter1 == letter4 && letter4 == letter7 && letter1 == x) || (letter2 == letter5 && letter5 == letter8 && letter2 == x) || (letter3 == letter6 && letter6 == letter9 && letter3 == x)) {
                    System.out.println("X wins");
                    gameIsOver = true;
                    break;
                }
                if (Xs + Os == 9) {
                    System.out.println("Draw");
                    gameIsOver = true;
                    break;
                } else {
                    System.out.println("Game not finished");
                }
            }

        }

    }


}
