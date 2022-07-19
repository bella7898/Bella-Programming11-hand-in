import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //declare variables needed later
        char x = 'x';
        int choiceNum = 0;
        int wins = 0;
        int losses = 0;

        //set strings to make life easier
        String lose = "You lost :(";
        String win = "You won!";
        String tie = "It's a tie.";

        //print out the strings
        System.out.print("Choose your weapon: r for 'rock', p for 'paper', and s for 'scissors'. To exit, type 'x'.");
        System.out.print("\n************************************************************************************************\n" +
                "Wins: " + Integer.toString(wins) + "; Losses: " + Integer.toString(losses) + " \nPlayer choice: \n");

        //get user input
        char choice = scan.next().charAt(0);

        while (choice != 'x') {

            //get random number from 1 to 3
            int random = 1 + (int) (Math.random() * 3);


            //assign letter r to 1, p to 2, and s to 3
            if (choice == 'r') {
                choiceNum = 1;
            } else if (choice == 'p') {
                choiceNum = 2;
            } else if (choice == 's') {
                choiceNum = 3;
            } else if (choice == 'x') { //check if the user wants to quit
                break;
            } else { //check for invalid input
                System.out.print("Invalid input, please try again.");
                break;
            }


            if (choiceNum == random) { //check for tie instance
                System.out.print(tie);
                if (choiceNum == 1) { //rock vs rock
                    String var = "rock";
                    System.out.print("\nComputer chose: " + var + "   Player chose: " + var);
                } else if (choiceNum == 2) { //paper vs paper
                    String var = "paper";
                    System.out.print("\nComputer chose: " + var + "   Player chose: " + var);
                } else { //scissors vs scissors
                    String var = "scissors";
                    System.out.print("\nComputer chose: " + var + "   Player chose: " + var);
                }
            } else if (choiceNum == 3 && random == 1) { //scissors vs rock == lose
                System.out.print(lose);
                System.out.print("\nComputer chose: rock   Player chose: scissors");
                losses++; // <----------------add increment to losses value
            } else if (choiceNum == 1 && random == 3) { //rock vs scissors == win
                System.out.print(win);
                System.out.print("\nComputer chose: scissors   Player chose: rock");
                wins++; // <---------------add increment to wins value
            } else if (choiceNum > random) { //scissors vs paper or paper vs rock == win
                System.out.print(win);
                if (random == 1) {
                    String var = "rock";
                    System.out.print("\nComputer chose: " + var);
                } else {
                    String var = "paper";
                    System.out.print("\nComputer chose: " + var);
                }
                if (choiceNum == 3) {
                    String var = "scissors";
                    System.out.print("   Player chose: " + var);
                } else {
                    String var = "paper";
                    System.out.print("   Player chose: " + var);
                }
                wins++;
            } else { //rock vs paper or paper vs scissors == lose
                System.out.print(lose);
                if (random == 3) {
                    String var = "scissors";
                    System.out.print("\nComputer chose: " + var);
                } else if (random == 2) {
                    String var = "paper";
                    System.out.print("\nComputer chose: " + var);
                }
                if (choiceNum == 1) {
                    String var = "rock";
                    System.out.print("   Player chose: " + var);
                } else if (random == 3) {
                    String var = "paper";
                    System.out.print("   Player chose " + var);
                }
                losses++;
            }


            //print next round's strings
            System.out.print("\n************************************************************************************************\n" +
                    "Wins: " + Integer.toString(wins) + "; Losses: " + Integer.toString(losses) + " \nPlayer choice: \n");
            choice = scan.next().charAt(0); //scan for user input in next round
        }


        //if loop has been broken (with user entering x) print statement
        if (choice == 'x') {
            System.out.println("Thanks for playing!");
        }

        /*
        Program by Bella W.
        Assignment for Computer Programming 11
        'Rock Paper Scissors'
        2021-11-03 (happy late halloween!)
        */
    }
}
