package edu.java.game;

import java.io.IOException;
import java.util.Scanner;

public class ComputerLogics extends Matches {

    public void computerLogics() throws IOException {

        ConsoleMessages consoleMessages = new ConsoleMessages();

        Scanner scanner = new Scanner(System.in);

        while (matches > 1) {

            if (player % 2 == 0) {
                int num = 1;

                for (int i = 0; ; i++) {
                    num += 4;

                    if (num > matches) {
                        compNumber = matches - (num - 4);
                        break;
                    }
                }
                System.out.println("На столе осталось " + matches +
                        " спичек\n - Количество выбранных компьютером спичек = " + compNumber);
                matches -= compNumber;
                player--;

                if (matches < 2) {
                    consoleMessages.youLose();
                } else {
                    System.out.print("На столе осталось " + matches + " спичек \n - Ход игрока. Введите количество спичек: ");

                    int playerX = scanner.nextInt();

                    if (playerX < 1 || playerX > 3) {
                        rep:
                        while (true) {
                            System.out.print("Ошибка!\nВведите число от 1 до 3: ");
                            int playerY = scanner.nextInt();
                            if (playerY < 1 || playerY > 3) {
                                continue rep;
                            }
                            matches -= playerY;
                            player--;
                            break;
                        }
                    } else {
                        matches -= playerX;
                        player--;

                        if (matches < 2) {
                            consoleMessages.compLose();
                        }
                    }
                }
            }
        }
    }
}