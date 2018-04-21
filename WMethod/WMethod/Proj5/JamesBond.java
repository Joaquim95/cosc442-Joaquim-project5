package Proj5;

import java.util.regex.Pattern;

public class JamesBond {
	
	public Boolean bondRegex(String input) {
		Pattern pattern = Pattern.compile("(.*)?\\((.*)?007(.*)?\\)(.*)");
		return pattern.matcher(input).matches();
	}
}
