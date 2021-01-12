/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissor;

import java.util.Scanner;

/**
 *
 * @author Gurar
 */
public class RockPaperScissor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int humanSelect;
        int round = 1;
        int drows = 0;
        int humanWin = 0;
        int computerWin = 0;
        int humanSelectRock = 0;
        int humanSelectPaper = 0;
        int humanSelectScissor = 0;
        int computerSelectRock = 0;
        int computerSelectPaper = 0;
        int computerSelectScissor = 0;
        
        
        
        do {
            
            System.out.println("1 - Rock");
            System.out.println("2 - Paper");
            System.out.println("3 - Scissor ");
            System.out.println("0 - Close game ");

            System.out.println("-----");
            
            System.out.println("Raund " + round);
            
            humanSelect = sc.nextInt();
            
            if(humanSelect != 0 && humanSelect <= 3) {
                
                if(humanSelect == 1) {
                    humanSelectRock += 1;
                    System.out.println("Human:  Rock");
                }else if(humanSelect == 2) {
                    humanSelectPaper += 1;
                    System.out.println("Human:  Paper");
                }else if(humanSelect == 3) {
                    humanSelectScissor += 1;
                    System.out.println("Human:  Scissor");
                }

                int computerSelect = (int) (Math.random() * 3) + 1;

                if(computerSelect == 1) {
                    computerSelectRock += 1; 
                    System.out.println("Computer:  Rock");
                }else if(computerSelect == 2) {
                    computerSelectPaper += 1;
                    System.out.println("Computer:  Paper");
                }else if(computerSelect == 3) {
                    computerSelectScissor += 1;
                    System.out.println("Computer:  Scissor");
                }
                
                if(humanSelect == 0) {
                    round = 0;
                } else {
                    round += 1;
                }
                
                
                if(humanSelect == computerSelect) {
                    drows += 1;
                    System.out.println("!!Drow!!");
                }
                
                if(humanSelect == 1 && computerSelect == 2) {
                    computerWin += 1;
                    System.out.println("!!Computer Win!!");
                }
                
                if(computerSelect == 1 && humanSelect == 2) {
                    humanWin += 1;
                    System.out.println("!!Human Win!!");
                }
                
                if(humanSelect == 1 && computerSelect == 3) {
                    humanWin += 1;
                    System.out.println("!!Human Win!!");
                }
                
                if(computerSelect == 1 && humanSelect == 3) {
                    computerWin += 1;
                    System.out.println("!!Computer Win!!");
                }
                
                if(humanSelect == 2 && computerSelect == 3) {
                    computerWin += 1;
                    System.out.println("!!Computer Win!!");
                }
                
                if(humanSelect == 3 && computerSelect == 2) {
                    humanWin += 1;
                    System.out.println("!!Human Win!!");
                }
                
            }
            
            System.out.println("-----");
        
        } while (humanSelect != 0);
        
        System.out.println("Rounds " + (round - 1));
        System.out.println("Human win rounds  " + humanWin);
        System.out.println("Computer win rounds " + computerWin);
        System.out.println("Drows " + drows);
        System.out.println("----");
        System.out.println("Human Select Rock " + humanSelectRock);
        System.out.println("Human Select Rock " + (0.1 * humanSelectRock / (round - 1)));
        System.out.println("Human Select Paper " + humanSelectPaper);
        System.out.println("Human Select Rock " + (0.1 * humanSelectPaper / (round - 1)));
        System.out.println("Human Select Scissor " + humanSelectScissor);
        System.out.println("Human Select Rock " + (0.1 * humanSelectScissor / (round - 1)));
        System.out.println("----");
        System.out.println("Computer Select Rock " + computerSelectRock);
        System.out.println("Computer Select Rock " + (0.1 * computerSelectRock / (round - 1)));
        System.out.println("Computer Select Paper " + computerSelectPaper);
        System.out.println("Computer Select Rock " + (0.1 * computerSelectPaper/ (round - 1)));
        System.out.println("Computer Select Scissor " + computerSelectScissor);
        System.out.println("Computer Select Rock " + (0.1 * computerSelectScissor/ (round - 1)));
    }
    
}
