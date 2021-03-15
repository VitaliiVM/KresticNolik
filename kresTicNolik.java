package KresticNolik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class kresTicNolik {
    public static void main(String[] args) throws IOException {
        gameStart();
    }

    public static void gameStart() throws IOException {
        System.out.println("ИГРА: КРЕСТИКИ НОЛИКИ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя первого игрока: X");
        String firstPlayer = reader.readLine();

        System.out.println("Введите имя второго игрока: O");
        String secondPlayer = reader.readLine();

        System.out.println("Игра началась!!!");
        String[][] gameField = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

        System.out.println(gameField[0][0] + " | " + gameField[0][1] + " | " + gameField[0][2]);
        System.out.println("---------");
        System.out.println(gameField[1][0] + " | " + gameField[1][1] + " | " + gameField[1][2]);
        System.out.println("---------");
        System.out.println(gameField[2][0] + " | " + gameField[2][1] + " | " + gameField[2][2]);



        for (int win = 0; win <= 3; ) {
            System.out.println("Ход игрока: " + firstPlayer + ": ");
            int x = Integer.parseInt(reader.readLine());

            if (x == 1) {
                gameField[0][0] = "X";
            } else if (x == 2) {
                gameField[0][1] = "X";
            } else if (x == 3) {
                gameField[0][2] = "X";
            } else if (x == 4) {
                gameField[1][0] = "X";
            } else if (x == 5) {
                gameField[1][1] = "X";
            } else if (x == 6) {
                gameField[1][2] = "X";
            } else if (x == 7) {
                gameField[2][0] = "X";
            } else if (x == 8) {
                gameField[2][1] = "X";
            } else if (x == 9) {
                gameField[2][2] = "X";
            } else {
                System.out.println("Неверный ввод");
                continue;
            }

            if ((gameField[0][0] + gameField[0][1] + gameField[0][2]).equals("XXX") ||
                    (gameField[1][0] + gameField[1][1] + gameField[1][2]).equals("XXX") ||
                    (gameField[2][0] + gameField[2][1] + gameField[2][2]).equals("XXX") ||
                    (gameField[0][0] + gameField[1][0] + gameField[2][0]).equals("XXX") ||
                    (gameField[0][1] + gameField[1][1] + gameField[2][1]).equals("XXX") ||
                    (gameField[0][2] + gameField[1][2] + gameField[2][2]).equals("XXX") ||
                    (gameField[0][0] + gameField[1][1] + gameField[2][2]).equals("XXX") ||
                    (gameField[0][2] + gameField[1][1] + gameField[2][0]).equals("XXX")) {
                System.out.println("Игру выиграл игрок: " + firstPlayer);
                break;
            }

            System.out.println(gameField[0][0] + " | " + gameField[0][1] + " | " + gameField[0][2]);
            System.out.println("---------");
            System.out.println(gameField[1][0] + " | " + gameField[1][1] + " | " + gameField[1][2]);
            System.out.println("---------");
            System.out.println(gameField[2][0] + " | " + gameField[2][1] + " | " + gameField[2][2]);
            
            if (!gameField[0][0].equals("") && gameField[0][0] != "1" &&
                    !gameField[0][1].equals("") && gameField[0][1] != "2" &&
                    !gameField[0][2].equals("") && gameField[0][2] != "3" &&
                    !gameField[1][0].equals("") && gameField[1][0] != "4" &&
                    !gameField[1][1].equals("") && gameField[1][1] != "5" &&
                    !gameField[1][2].equals("") && gameField[1][2] != "6" &&
                    !gameField[2][0].equals("") && gameField[2][0] != "7" &&
                    !gameField[2][1].equals("") && gameField[2][1] != "8" &&
                    !gameField[2][2].equals("") && gameField[2][2] != "9" &&
                    !(gameField[0][0] + gameField[0][1] + gameField[0][2]).equals("XXX") &&
                    !(gameField[1][0] + gameField[1][1] + gameField[1][2]).equals("XXX") &&
                    !(gameField[2][0] + gameField[2][1] + gameField[2][2]).equals("XXX") &&
                    !(gameField[0][0] + gameField[1][0] + gameField[2][0]).equals("XXX") &&
                    !(gameField[0][1] + gameField[1][1] + gameField[2][1]).equals("XXX") &&
                    !(gameField[0][2] + gameField[1][2] + gameField[2][2]).equals("XXX") &&
                    !(gameField[0][0] + gameField[1][1] + gameField[2][2]).equals("XXX") &&
                    !(gameField[0][2] + gameField[1][1] + gameField[2][0]).equals("XXX") &&
                    !(gameField[0][0] + gameField[0][1] + gameField[0][2]).equals("OOO") &&
                    !(gameField[1][0] + gameField[1][1] + gameField[1][2]).equals("OOO") &&
                    !(gameField[2][0] + gameField[2][1] + gameField[2][2]).equals("OOO") &&
                    !(gameField[0][0] + gameField[1][0] + gameField[2][0]).equals("OOO") &&
                    !(gameField[0][1] + gameField[1][1] + gameField[2][1]).equals("OOO") &&
                    !(gameField[0][2] + gameField[1][2] + gameField[2][2]).equals("OOO") &&
                    !(gameField[0][0] + gameField[1][1] + gameField[2][2]).equals("OOO") &&
                    !(gameField[0][2] + gameField[1][1] + gameField[2][0]).equals("OOO")){
                System.out.println("Ничья");
                break;
            }

            System.out.println("Ход игрока: " + secondPlayer + ": ");
            int o = Integer.parseInt(reader.readLine());

            if (o == 1) {
                gameField[0][0] = "O";
            } else if (o == 2) {
                gameField[0][1] = "O";
            } else if (o == 3) {
                gameField[0][2] = "O";
            } else if (o == 4) {
                gameField[1][0] = "O";
            } else if (o == 5) {
                gameField[1][1] = "O";
            } else if (o == 6) {
                gameField[1][2] = "O";
            } else if (o == 7) {
                gameField[2][0] = "O";
            } else if (o == 8) {
                gameField[2][1] = "O";
            } else if (o == 9) {
                gameField[2][2] = "O";
            } else {
                System.out.println("Неверный ввод");
             break;
            }

            System.out.println(gameField[0][0] + " | " + gameField[0][1] + " | " + gameField[0][2]);
            System.out.println("---------");
            System.out.println(gameField[1][0] + " | " + gameField[1][1] + " | " + gameField[1][2]);
            System.out.println("---------");
            System.out.println(gameField[2][0] + " | " + gameField[2][1] + " | " + gameField[2][2]);

            if ((gameField[0][0] + gameField[0][1] + gameField[0][2]).equals("OOO") ||
                    (gameField[1][0] + gameField[1][1] + gameField[1][2]).equals("OOO") ||
                    (gameField[2][0] + gameField[2][1] + gameField[2][2]).equals("OOO") ||
                    (gameField[0][0] + gameField[1][0] + gameField[2][0]).equals("OOO") ||
                    (gameField[0][1] + gameField[1][1] + gameField[2][1]).equals("OOO") ||
                    (gameField[0][2] + gameField[1][2] + gameField[2][2]).equals("OOO") ||
                    (gameField[0][0] + gameField[1][1] + gameField[2][2]).equals("OOO") ||
                    (gameField[0][2] + gameField[1][1] + gameField[2][0]).equals("OOO")) {
                System.out.println("Игру выиграл игрок: " + secondPlayer);
                break;
            }

        }
    }
}
