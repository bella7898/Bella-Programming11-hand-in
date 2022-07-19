package com.example.gameofchance;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HelloController {

    @FXML
    private Text computerText;

    @FXML
    private Text humanText;

    @FXML
    private Text winner;

    @FXML
    private Text humanScore;

    @FXML
    private Text computerScore;

    private String humanPick;
    private String computerPick;
    private Random random = new Random();

    ArrayList<String> options = new ArrayList<>(Arrays.asList("rock","paper", "scissors"));

    @FXML
    void paperClicked(ActionEvent event){
        humanPick = "paper";
        humanText.setText("You picked " + humanPick);
        computerTurn();
    }

    @FXML
    void rockClicked(ActionEvent event){
        humanPick = "rock";
        humanText.setText("You picked " + humanPick);
        computerTurn();
    }

    @FXML
    void scissorsClicked(ActionEvent event){
        humanPick = "scissors";
        humanText.setText("You picked " + humanPick);
        computerTurn();
    }

    public void computerTurn(){
        computerPick = options.get(random.nextInt(options.size()));
        computerText.setText("computer picked " + computerPick);
        checkWinner();
    }

    public void checkWinner(){
        if(humanPick.equals(computerPick)){
            winner.setText("Draw, try again!");
        }
        else if(humanPick.equals("rock") && computerPick.equals("paper")){
            winner.setText("Computer Won!");
            computerScore.setText(String.valueOf(Integer.parseInt(computerScore.getText()) + 1));
        }
        else if(humanPick.equals("scissors") && computerPick.equals("rock")){
            winner.setText("Computer Won!");
            computerScore.setText(String.valueOf(Integer.parseInt(computerScore.getText()) + 1));
        }
        else if(humanPick.equals("paper") && computerPick.equals("scissors")){
            winner.setText("Computer Won!");
            computerScore.setText(String.valueOf(Integer.parseInt(computerScore.getText()) + 1));
        }
        else if(humanPick.equals("paper") && computerPick.equals("rock")){
            winner.setText("You Won!");
            humanScore.setText(String.valueOf(Integer.parseInt(humanScore.getText()) + 1));
        }
        else if(humanPick.equals("rock") && computerPick.equals("scissors")){
            winner.setText("You Won!");
            humanScore.setText(String.valueOf(Integer.parseInt(humanScore.getText()) + 1));
        }
        else if(humanPick.equals("scissors") && computerPick.equals("paper")) {
            winner.setText("You Won!");
            humanScore.setText(String.valueOf(Integer.parseInt(humanScore.getText()) + 1));
        }
    }


}