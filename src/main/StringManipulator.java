package main;

public class StringManipulator {
    //input: ExAmPLE => output: ELPmAxE
    public String reverse(String input) {
        char[] chars = input.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for(int i = chars.length - 1; i >= 0; i--) {
            reverse.append(chars[i]);
        }
        return reverse.toString();
    }
    //input: example => output: false
    //input: ELpmpLE => output: true
    public boolean isPalindrome(String input) {
        char[] chars = input.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for(int i = chars.length - 1; i >= 0; i--) {
            reverse.append(chars[i]);
        }
        return input.equals(reverse.toString());
    }
    //input: ExAmPLE, part: Ex => output: true
    //input: ExAmPLE, part: ex => output: false
    public boolean isContained(String input, String part) {
        char[] chars = input.toCharArray();
        String main = new String(chars);
        boolean contain = main.contains(part);
        return contain;
    }
    //input: ExAm1PLE2 => output: ExAmPLE
    public String numberRemoved(String input) {
        String remove = input.replaceAll("\\d", "");
        return remove;
    }
    //input: ExAmPLE => output: EXAMPLE
    public String upperString(String input) {
        String upper = input.toUpperCase();
        return upper;
    }
    // input: ExAmPLE => output: example
    public String lowerString(String input) {
        String lower = input.toLowerCase();
        return lower;
    }
    // input: example string => output: Example String
    public String capitalString(String input) {
        String[] chars = input.split(" ");
        StringBuilder capitalize = new StringBuilder();
        for(String word: chars) {
            if(word.length() > 0) {
                capitalize.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return capitalize.toString().trim();
    }
    // input: Example => output: 3
    public int countVowels(String input) {
        int count = 0;
        String vowel = "aeiouAEIOU";
        for(int i = 0; i < input.length(); i++) {
            if(vowel.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
    // input: Hello, how are you? => output: 4
    public int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
    // Input: input = "Java programming", substring = "programming" => Output: 5
    // Input: input = "Java programming", substring = "Programming" => Output: -1
    public int findSubstringIndex(String input, String substring) {
        return input.indexOf(substring);
    }
    // Input: "Hello World How Are You" => Output: "You Are How World Hello"
    public String reverseWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if(i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}