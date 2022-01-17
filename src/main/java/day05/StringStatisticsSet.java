package day05;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringStatisticsSet {

    public Set<Character> collectAllLettersTree(String word) {
        Set<Character> result = new TreeSet<>();
        for ( int i = 0; i < word.length(); i++ ) {
            result.add(word.charAt(i));
        }
        return result;
    }

    public Set<Character> collectAllLettersHash(String word) {
        Set<Character> result = new HashSet<>();
        for ( int i = 0; i < word.length(); i++ ) {
            result.add(word.charAt(i));
        }
        result.size();
        return result;
    }

    public static void main(String[] args) {
        StringStatisticsSet stringStatisticsSet = new StringStatisticsSet();
        System.out.println(stringStatisticsSet.collectAllLettersTree("almaAfaM"));
        System.out.println(stringStatisticsSet.collectAllLettersHash("almaAfaM"));
    }
}
