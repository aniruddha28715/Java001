package Java;

public class MEthods {
    static int logic(int a, int b){  //static method bhi cal kr sakte hai 
        int z;                              //bina kisi public main ko call kare bina
        if(a>b){
            z = a+b;
        }
        else{
            z= (a+b) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int c;
        c = logic(x,y);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1,b1);
        if(a1>b1){
            c1 = (a1 + b1) * 5;
        }
        System.out.println(c);
        System.out.println(c1);

    }
}

