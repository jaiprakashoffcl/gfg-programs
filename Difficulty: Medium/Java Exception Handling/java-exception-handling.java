// User function Template for Java

class Solution {
    public int findMin(int a, int b) {
        // Your code here
        int add= a+b;
        int sub = a-b;
        int mul = a*b;
        int div =1;
        
        try{
            div = a/b;
        }
        catch(ArithmeticException ex){
            
        }
        if((add<mul) && (add<sub) && (add<div)){
            return add;
        }
        else if((sub<add)&&(sub<mul)&&(sub<div)){
            return sub;
        }
        else if((mul<add)&&(mul<sub)&&(mul<div)){
            return mul;
        }
        else{
            return div;
        }
    }
}