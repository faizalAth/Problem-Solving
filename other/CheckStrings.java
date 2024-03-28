package other;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckStrings {
    public static void main(String...args) {
        String s1="adbc";
        String s2="abcde";

        List<Character> first = s1.chars().mapToObj( ch -> (char) ch).collect(Collectors.toList());
        List<Character> second = s2.chars().mapToObj(ch -> (char)ch).collect(Collectors.toList());

        for(int i=0;i<s2.length();i++){
            if(! first.contains(second.get(i))){
                System.out.println(second.get(i));
            }
        }

        System.out.println(first + " === " + second);
        
        
    }
}