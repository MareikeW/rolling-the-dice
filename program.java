public class Dice {
	//5 dice. Using random numbers, how often does the program need to throw the dice until all numbers are the same?
	public static void main(String[] args) {
		int dice1 = rollDice();//throwing the each dice
		int dice2 = rollDice();
		int dice3 = rollDice();
		int dice4 = rollDice();
		int dice5 = rollDice();
		
		int count = 1; //loop counter initialize to 1
		while(!(dice1==dice2 && dice2==dice3 && dice3==dice4 && dice4==dice5)) { //keeps on throwing the dice until all dice show the same number
			dice1 = rollDice();
			dice2 = rollDice();
			dice3 = rollDice();
			dice4 = rollDice();
			dice5 = rollDice();
			count++; //adds one throw count after each round
		}
		System.out.println(count); //displays the final number of throws on screen which took place to reach 5 same numbers
	}
		
		
	private static int rollDice() { //method to get random number
		int random1 =  (int) (Math.random() * 7+1);
		return random1;
	}		
}
