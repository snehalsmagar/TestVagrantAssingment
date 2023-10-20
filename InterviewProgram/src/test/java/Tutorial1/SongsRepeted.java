package Tutorial1;

import java.util.Arrays;
import java.util.Scanner;

public class SongsRepeted {

public void addNewSong() {
		
		String song [] = {"s1", "s2", "s3"};
		while(true) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter new Song:" );
		String input = scr.nextLine();
		
		if(input.contains("s")) {
			song[0]=song[1];
			song[1]=song[2];
			song[2]= input;
		}
		System.out.println(Arrays.toString(song));
		}

	}
	
}