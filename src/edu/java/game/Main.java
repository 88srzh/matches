package edu.java.game;

public class Main {

    public static void main(String[] args) {

        Matches matches = new Matches();
        ConsoleMessages consoleMessages = new ConsoleMessages();
//        consoleMessages.setRemainedMatches(20);
//        consoleMessages.callRemainedMatches();
        ComputerLogics computerLogics = new ComputerLogics();
        computerLogics.computerLogics();
        PeopleLogics peopleLogics = new PeopleLogics();
        peopleLogics.peopleLogics();



        }
    }
