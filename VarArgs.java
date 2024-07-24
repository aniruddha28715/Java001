public class VarArgs {

    static int sum(int x, int ...arr){
        //Available as int[] arr;
        int result = 0;
        for(int a: arr){
            result +=a;
        }
        return result;

    }
    // static int sum(int a, int b){
    //         return a+b;
    //     }
    // static int sum(int a, int b, int c){
    //         return a+b+c;
    //     }
    public static void main(String[] args) {

        System.out.println("Welcome to Varags tut");
        System.out.println("the sum :" + sum(4,5));
        System.out.println("the sum :" + sum(4,5,6));
    }
}
 