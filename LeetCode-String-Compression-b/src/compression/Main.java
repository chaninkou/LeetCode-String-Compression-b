package compression;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		char[] words = {'a','a','b','b','c','c','c'};
		
		System.out.println("Input: " + Arrays.toString(words));
		
		System.out.println("Solution: " + compress(words));
		
	}
	
	public static int compress(char[] chars) {
        int indexAnswer = 0;
        
        int index = 0;
        
        while(index < chars.length){
            char current = chars[index];
            
            int count = 0;
            
            while(index < chars.length && chars[index] == current){
                index ++;
                count ++;
            }
            
            chars[indexAnswer++] = current;
            
            if(count != 1){
                for(char c : Integer.toString(count).toCharArray()){
                    chars[indexAnswer++] = c;
                }
            }
            
        }
        return indexAnswer;
    }

}
