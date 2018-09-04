
public class Common {
	public int count(String a, String b) {
		int compare = 0; // create integer to compare
		for (int i = 0; i < a.length(); i++) { // for every character in string a
			char c = a.charAt(i); // create character
			for (int k = 0; k < b.length(); k++) { // for every character in string b
				if (c == b.charAt(k)) { // if the characters match
					compare++; // increase count
					b = b.substring(0, k) + b.substring(k + 1); // remove character from string b
					break; // stop checking rest of string b
				}
			}
		}
		return compare;
	}

}
