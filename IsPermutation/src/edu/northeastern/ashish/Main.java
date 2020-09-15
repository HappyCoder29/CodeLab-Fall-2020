package edu.northeastern.ashish;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    private static boolean isPermut(String str1, String str2){
        if(str1.length() != str2.length()){
            return  false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0 ; i < str1.length() ; i ++){
            if( map1.containsKey(str1.charAt(i) ) ) {
                map1.put( str1.charAt(i), map1.get(str1.charAt(i)) + 1 );
            }else{
                map1.put( str1.charAt(i), 1 );
            }

            if( map2.containsKey(str2.charAt(i) ) ) {
                map2.put( str2.charAt(i), map2.get(str2.charAt(i)) + 1 );
            }else{
                map2.put( str2.charAt(i), 1 );
            }
        }

        for(int i = 0 ; i < str1.length(); i ++){
              Character ch = str1.charAt(i);

              if(!map2.containsKey(ch)){
                  return  false;
              }
              if(map1.get(ch) != map2.get(ch)){
                  return  false;
              }
        }

        return true;



    }
}
