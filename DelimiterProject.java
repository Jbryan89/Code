/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package delimiter.project;

import java.util.Scanner;


public class DelimiterProject {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with paranethesis, curly braces, or brackets:");
        String input = scanner.nextLine();
        scanner.close();
        
        if(doesItMatch(input)) {
            System.out.println("This is a match");
                    }else{  
            System.out.println("The is not a match");
                    }
        
    }

    
    public static boolean doesItMatch(String input) {
        int parent = 0;
        int curly = 0;
        int bracket = 0;

        for(int i = 0; i <input.length();i++){
            char c = input.charAt(i);
            if (c == '(') {
                parent++;
            } else if (c == ')') {
                parent--;
            } else if (c == '{') {
                curly++;
            } else if (c == '}') {
                curly--;
            } else if (c == '[') {
                bracket++;
            } else if (c == ']') {
                bracket--;
            }
}
        if(parent > 0 && curly > 0 && bracket >0){
            return false;
        }
    
// Check if all counts are zero, indicating matching pairs of parentheses, curly braces, and brackets
    return parent == 0 && curly == 0 && bracket == 0;

}
    
}