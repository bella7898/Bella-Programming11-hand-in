import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //first step: print out a string and get user input

        System.out.println("Choose rock, paper, or scissors: r for 'rock', p for 'paper', and s for 'scissors");
        String choice = (scan.next());

        //get random integer with Math.random with range of 1 - 3

        int random = 1 + (int)(Math.random() * 3);

        //convert char variables to string

        char rock = 'r';
        String rocks = String.valueOf(rock);
        char paper = 'p';
        String papers = String.valueOf(paper);
        char scissor = 's';
        String scissors = String.valueOf(scissor);

        /*
        compare string variables declared above with player choice.
        print out tie/win/lose statement.
        if the player entered something else, it will print an error statement.
        rock = 1, paper = 2, scissors = 3
        rock < paper < scissors, but scissors < rock
         */

        if(choice.equals(rocks)){
            int intChoice = 1;
            if(random == intChoice) {
                System.out.println("It's a tie.");
                System.out.println("Computer chose: rock      Player chose: rock"); //tie statement
            }
            else if(random == 3){
                System.out.println("You won!");
                System.out.println("Computer chose: scissors      Player chose: rock"); //win statement
            }
            else{
                System.out.println("You lost :(");
                System.out.println("Computer chose: paper      Player chose: rock"); //loss statement
            }
        }
        else if(choice.equals(papers)){
            int intChoice = 2;
            if(random == intChoice) {
                System.out.println("It's a tie.");
                System.out.println("Computer chose: paper      Player chose: paper"); //paper ties with paper
            }
            else if(random == 1){
                System.out.println("You won!");
                System.out.println("Computer chose: rock      Player chose: paper"); //paper won against rock
            }
            else {
                System.out.println("You lost :(");
                System.out.println("Computer chose: scissors      Player chose: paper"); //paper lost against scissors
            }
        }
        else if(choice.equals(scissors)){
            int intChoice = 3;
            if(random == intChoice) { //when random choice is equal to our choice, it's a tie.
                System.out.println("It's a tie.");
                System.out.println("Computer chose: scissors      Player chose: scissors");
            }
            else if(random == 2){ //when random is equal to 2, it's paper, which is defeated by our choice.
                System.out.println("You won!");
                System.out.println("Computer chose: paper      Player chose: scissors");
            }
            else { //else, which is when random is equal to 1, (rock) means we lost with our scissors.
                System.out.println("You lost :(");
                System.out.println("Computer chose: rock      Player chose: scissors");
            }
        }
        else{
            System.out.println("Invalid selection please play again.");  //error statement
        }

        /*
        Program by Bella W.
        Assignment for Computer Programming 11
        'Rock Paper Scissors'
        2021-10-22
        */
    }
}
