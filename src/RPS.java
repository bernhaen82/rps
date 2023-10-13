import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean donePlaying = false;

        do {
            boolean doneMoveA = false;
            boolean doneMoveB = false;
            String playerA = "";
            String playerB = "";

            do {
                System.out.print("Enter your move player A: [R,P,S] : ");
                playerA = in.nextLine();

                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    playerA = playerA.toUpperCase();
                    doneMoveA = true;
                } else {
                    System.out.println("Must be R, P, or S.");
                }
            } while (!doneMoveA);

            do {
                System.out.print("Enter your move player B: [R,P,S] : ");
                playerB = in.nextLine();

                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                    playerB = playerB.toUpperCase();
                    doneMoveB = true;
                } else {
                    System.out.println("Must be R, P, or S.");
                }
            } while (!doneMoveB);

            if (playerA.equals("R")) {
                if (playerB.equals("R")) {
                    System.out.println("Rock vs Rock, it's a tie.");
                } else if (playerB.equals("P")) {
                    System.out.println("Paper beats rock. Player B wins.");
                } else {
                    System.out.println("Rock breaks scissors. Player A wins.");
                }
            } else if (playerA.equals("P")) {
                if (playerB.equals("R")) {
                    System.out.println("Paper beats rock. Player A wins.");
                } else if (playerB.equals("P")) {
                    System.out.println("Paper vs paper, it's a tie.");
                } else {
                    System.out.println("Scissors cut paper. Player B wins.");
                }
            } else if (playerA.equals("S")) {
                if (playerB.equals("R")) {
                    System.out.println("Rock breaks scissors. Player B wins.");
                } else if (playerB.equals("P")) {
                    System.out.println("Scissors cut paper. Player A wins.");
                } else {
                    System.out.println("Scissors vs scissors, it's a tie.");
                }
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = in.nextLine();
            if (!playAgain.equalsIgnoreCase("Y")) {
                donePlaying = true;
            }

        } while (!donePlaying);

        System.out.println("Thanks for playing!");
        in.close();
    }
}
