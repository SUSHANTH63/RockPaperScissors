import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors 
{
	public static void main(String[] args) 
	{  

		Scanner scanner = new Scanner(System.in);

		while (true) 
		{
			String[] rps = {"rock", "paper", "siz"};
			String computerMove = rps[new Random().nextInt(rps.length)];

			String playerMove;

			while(true) 
			{
				System.out.println("Please enter your move (rock, paper, or siz)");
				playerMove = scanner.nextLine();
				if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("siz"))
				{
					break;
				}
				System.out.println(playerMove + " is not a valid move. Please enter a valid move mentioned");
			}

			System.out.println("Computer played: " + computerMove);

			if (playerMove.equals(computerMove)) 
			{
				System.out.println("The game was a tie!");
			}
			else if (playerMove.equals("rock")) 
			{
				if (computerMove.equals("paper")) 
				{
					System.out.println("You lose!");

				} else if (computerMove.equals("siz")) 
				{
					System.out.println("You win!");
				}
			}

			else if (playerMove.equals("paper"))
			{
				if (computerMove.equals("rock")) 
				{
					System.out.println("You win!");

				} else if (computerMove.equals("siz")) 
				{
					System.out.println("You lose!");
				}
			}

			else if (playerMove.equals("siz"))
			{
				if (computerMove.equals("paper"))
				{
					System.out.println("You win!");

				} else if (computerMove.equals("rock"))
				{
					System.out.println("You lose!");
				}
			}

			System.out.println("Play again? (y/n)");
			String playAgain = scanner.nextLine();

			if (!playAgain.equals("y")) 
			{
				break;
			}
		}
		scanner.close();
	}
}
