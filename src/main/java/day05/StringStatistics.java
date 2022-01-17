package day05;


import java.util.HashMap;
import java.util.Map;

public class StringStatistics {

        public Map<Character, Integer> countCharacterNumberPerCharacter(String  word) {
            Map<Character, Integer> result = new HashMap<>();
            
            for ( int i = 0; i < word.length(); i++ ) {
                if (!result.containsKey(word.charAt(i))) {
                    result.put(word.charAt(i), 1);
                } else {

                    result.put(word.charAt(i), result.get(word.charAt(i))+ 1);
                }
            }
            return result;
        }


    public static void main(String[] args) {
        StringStatistics stringStatistics = new StringStatistics();
        Map<Character, Integer> result = stringStatistics.countCharacterNumberPerCharacter("almafa");
        for (Map.Entry<Character, Integer> actual : result.entrySet()) {
            System.out.println("Kulcs: "+actual.getKey()+" Érték: "+actual.getValue());
        }

    }
}
