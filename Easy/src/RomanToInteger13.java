import java.util.LinkedHashMap;

public class RomanToInteger13 {

    public static void main(String args[]) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        String s = "MCMXCIV";
        int value = 0;
        int prevKey = 0;

        for (char c : s.toCharArray()) {
            int currentKey = map.get(c);

            if (prevKey < currentKey) {
                value -= 2 * prevKey; 
            }
            value += currentKey; 
            prevKey = currentKey; 

        System.out.println(value);
    }
}}
