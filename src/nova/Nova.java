package nova;

import java.io.IOException;
import java.util.ArrayList;

public class Nova {

	public static void main(String[] args) throws IOException {
		
		TextFiles responsesText = new TextFiles("responses.txt");
		ArrayList<String> responses = responsesText.getText();
		TextFiles keywordsText = new TextFiles("keywords.txt");
		ArrayList<String> keywords = keywordsText.getText();
		
		keywords.toString();
		responses.toString();

	}

}
