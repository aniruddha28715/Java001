public class AssociativityOperators {
    public static void main(String[] args){
        //write your code here
        int a = 7*5+9-0/3;
        System.out.println(a);

        int d = 4;
        int e = 2;
        int x = (d*d*d + e*e)/2;
        System.out.println(x);

    }
}

//Associativity is left to right
//precedence is multiplication and division
//precedence is addition and subtraction

//highest precedence goes to * and  / , they are then evaluated on the basis 
//of left to right Associativity
 