package stacks;

import stacks.Node;
import stacks.Stack;

public class Parentheses{
    public static final char L_PAREN = '(';
    public static final char R_PAREN = ')';
    public static final char L_BRACE = '{';
    public static final char R_BRACE = '}';
    public static final char L_BRACKET = '[';
    public static final char R_BRACKET = ']';

    public static boolean isMatching(String input){
        Stack s = new Stack();
        Node n;
        for(int i=0; i < input.length(); i++){
            char c = input.charAt(i);
            if (c == L_PAREN || c == L_BRACE || c == L_BRACKET || c == R_PAREN || c == R_BRACE || c == R_BRACKET){
                if(c == L_PAREN || c == L_BRACE || c == L_BRACKET){
                    s.push(new Node(c));
                } else if(c == R_PAREN || c == R_BRACE || c == R_BRACKET){
                    n = s.pop();
                    if (n == null){
                        // reached end of stack
                        return false;
                    }
                    if(c == R_PAREN && n.item != (Object)L_PAREN){
                        return false;
                    }
                    if(c == R_BRACE && n.item != (Object)L_BRACE){
                        return false;
                    }
                    if(c == R_BRACKET && n.item != (Object)L_BRACKET){
                        return false;
                    }
                } else {
                    // invalid char
                }
            }
        }
        if(s.getSize() != 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        String s = "(((A + B) - (C - D)) / (E - F)) (((A))) (A) ((A (B D) D)) () (( )) (((A + B))) ((A * B)) (A / B) A * B A / B + C A ^ (B - C) (((C ^ E))) D ( A - B * C) A- B / C ( A / B * C) ( A - C ^ C) ( A * C ^ C) ( D / C ^ C) A - C ^ C A - B * C +D / E A*B - C ^ C ^ D A B - C ^ C ^ D (( A - B * C) ^ D ^ E) ^ ( F / G * H + I ) (A - B) * (( C * D ) + E) ((( )(( ) )(((( )))) ((( )(( ) (((( )))) A * ( B / C) + D( A - B) A * ( B / C) + D ^ ( A - B) A * ( B / C) + D ^ A - B";
        String s1 = "{([])}";
        if(isMatching(s)){
            System.out.println("S - Matching");
        } else {
            System.out.println("S - Not Matching");
        }
        if(isMatching(s1)){
            System.out.println("S1 - Matching");
        } else {
            System.out.println("S1 - Not Matching");
        }
    }
}
