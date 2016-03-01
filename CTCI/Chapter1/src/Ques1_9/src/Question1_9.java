/*
 * Write a method to replace all spaces in a string with'%20'. You may assume that
 * the string has sufficient space at the end of the string to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if implementing
 * in Java, please use a character array so that you can perform this operation in place.)
 * EXAMPLE
 * Input: "Mr John Smith
 * Output: "Mr%20Dohn%20Smith"
 * 
 * */

public class Question1_9 {
	public static String replaceSpacesBasic(String str) {
		StringBuilder sb = new StringBuilder();
		for(Character c:str.toCharArray()) {
			if(c == ' ') sb.append("%20");
			else sb.append(c);
		}
		return sb.toString();
	}
	
	public static String replaceSpacesReverse(char[] str, int length) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = length + spaceCount * 2;
		str[index] = '\0';
		for (i = length - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
		return new String(str);
	}

}
