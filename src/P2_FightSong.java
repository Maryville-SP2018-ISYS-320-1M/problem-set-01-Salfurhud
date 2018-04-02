/*
  	ISYS 320
  	Name(s):AlfurhudSolomon
  	Date: Apr1, 2018
*/

public class P2_FightSong {
	public static void main(String[] args) {
		String[] songlines = songLines();
		writeSong(songlines);
	
	}
	
	public static String[] songLines() {
		String[] songLines = {
				"Go, team, Go!", 
				"You can do it.",
				"",
				"Go, team go!", 
				"You can do it.",
				"You're the best,",
				"In the West.",
				"Go, team go!", 
				"You can do it.",
				"",
				"Go, team, go!", 
				"You can do it.",
				"You're the best,",
				"In the West.",
				"Go, team go!", 
				"You can do it.",
				"",
				"Go, team, go!", 
				"You can do it.",
		};
	
		return songLines;
	}

	public static void writeSong( String[] songLinesArray ) {

		for(int x = 0; x < songLinesArray.length; x++) {
			System.out.println(songLinesArray[x]);
		}
	}
}