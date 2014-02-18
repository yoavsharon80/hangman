/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;

public class Hangman extends ConsoleProgram {
	public static final int NUM_ROUNDS = 8;
	
    public void run() {
		/* You fill this in */
    	gameSetup();
    	play();
    	
    	
	}
    
private void gameSetup() {
	println("Welcome To Hangman!");
	println("You have "+ NUM_ROUNDS + "to guess the word");
	
}
public void play() {
	
	while (true) {
		int turn=NUM_ROUNDS;
		word = getRandomWord();
		tmp ="";
		println("The Word now looks like this: "+ mask);
		while (turn > 0) {
			wordCheck(turn);
			turn-=1;
		}
		
	}
}

public String getRandomWord() {
	HangmanLexicon lex = new HangmanLexicon();
	int len = lex.getWordCount()-1;
	int rand = rgen.nextInt(0, len);
	String word = lex.getWord(rand);
	return word;
}

public String maskedWord(String word) {
	String temp = "";
	for (int i=0; i <= word.length(); i++) {
		temp = temp + "-";
	}
	return temp;
}

public void wordCheck(int turn) {
	mask = maskedWord(word);
println(word);
	println("The Word now looks like this: "+ tmp);
	println("You Have "+ turn + " guesses Left");
	String st = readLine("Your Guess? ");
	if (st.length() != 1 ) {
		println(st.length());
		st = readLine("You Can guess only single letter: ");
	} else tmp = charChk(st);
	if (tmp.equalsIgnoreCase(word)) {
		println("You Have guessed correct");
		}	
}

public String charChk(String str) {
	char temp =str.charAt(0);
	char min = '-';
	if (word.indexOf(str) == -1 ) {
		println("The word doesn't contains" + temp + "letters");
	}
	
	
	
	wordlcase = word.toLowerCase();
	for (int i = 0; i <= word.length() - 1; i++) {
		if (word.charAt(i) == temp || wordlcase.charAt(i) == temp)  {
			tmp = tmp + str;
			} 
		else {
			if (tmp.charAt(i) == min)
			  tmp = tmp + "-";
				}
		}
	return tmp;
	}
	
			
			

private String word;
private String wordlcase;
private String mask;
private String tmp;
private RandomGenerator rgen = RandomGenerator.getInstance();

}
