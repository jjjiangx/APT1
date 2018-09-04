
public class DNAMaxNucleotide {
	public String max(String[] strands, String nuc) {
		String answer = "";
		int maxoccur = 0;

		for (int i = 0; i < strands.length; i++) { // goes through every strand
			int occurances = 0; // counter for how many times a character occurs

			if (strands[i].contains(nuc)) { // if strand contains the letter
				for (int j = 0; j < strands[i].length(); j++) { // for every character in the strand
					if (strands[i].charAt(j) == nuc.charAt(0)) { // check if it matches the character
						occurances++; // count how many times it matches
					} // ending checking if it matches
				} // ending going through every character

				if (occurances > maxoccur) { // if the occurances is greater than the maxes
					maxoccur = occurances; // reset maxoccur to new occurances number
					answer = strands[i];
				} else if (occurances == maxoccur) { // if occurances matches
					if (strands[i].length() > answer.length()) { // check if the current strand is longer
						answer = strands[i]; // replace the answer
					}
				}
			}
		}
		return answer;
	}
}
