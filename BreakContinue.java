public class BreakContinue {
    public static void main(String[] args) {
        //break and continue using loops
        // for(int i=0; i<5; i++){

        //     System.out.println(i);
        //     System.out.println("Java is great");
        //     if(i ==2){
        //         System.out.println("Ending the loop");
        //         break;
        //         //iss loop ko yehi khatam karo
        //     }

        // }

        // int i =0;
        // while (i<5){
        //     System.out.println(i);
        //     System.out.println("Java is great");

        //     if(i ==2){
        //         System.out.println("Ending the loop");
        //         i++;
        //         break;
                
        //         //iss loop ko yehi khatam karo
        //     }
        //     i++;

        // }

        // System.out.println("Loop ends here");

        int i =0;
        do{
            i++;
            if(i ==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
             
            
        }
        while(i<5);
        
        System.out.println("Loop ends here");

        

    }
}
