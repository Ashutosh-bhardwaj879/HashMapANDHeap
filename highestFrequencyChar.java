import java.util.*;

class highestFrequencyChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();// input string
        HashMap<Character, Integer> map = new HashMap<>();// creating hashmap
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // if map contains key increase its value by 1
            if (map.containsKey(ch)) {
                int old_freq = map.get(ch);// getting old freq
                int new_freq = old_freq + 1;// adding one
                map.put(ch, new_freq);// puttting key and new_freq
            } else {// if map doesnt contains key make it value 1
                map.put(ch, 1);
            }
        }
        char max_freq_char = str.charAt(0);// let the max occuring char be 0

        for (Character ch : map.keySet()) {// using all keys i.e the characters
            if (map.get(ch) > map.get(max_freq_char)) {// if the value at ch > value at max_freq_char
                max_freq_char = ch;// update max_freq_char
            }
        }
        System.out.println(max_freq_char);// printing the result
        scn.close();
    }
}
