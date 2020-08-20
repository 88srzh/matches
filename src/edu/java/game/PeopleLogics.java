package edu.java.game;

import java.util.Scanner;

public class PeopleLogics
{

    public void peopleLogics() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");

        int peopleNumber = sc.nextInt();
        Matches matches = new Matches();
//        matches.quantityMatches = 20;



        if (peopleNumber > 0 && peopleNumber < 4) {
            System.out.println(" - Количество выбранных человеком спичек: " + peopleNumber);
            matches.setRemainedMatches(matches.getRemainedMatches() - peopleNumber);
            System.out.println("На столе осталось " + matches.getRemainedMatches() + " спичек");
        } else if (peopleNumber > 3) {
            System.out.print("Вы не можете вводить больше 3, попробуйте снова.\nВведите число: ");
            int peopleNumberRepeat = sc.nextInt();
            System.out.println(" - Количество выбранных человеком спичек: " + peopleNumberRepeat);
            matches.remainedMatches = matches.quantityMatches - peopleNumberRepeat;
            System.out.println("На столе осталось " + matches.remainedMatches + " спичек");
        }
        sc.close();
    }

}
