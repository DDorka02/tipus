package tipusok;

public class Tipusok {

    public static void main(String[] args) {
        String so = "abc";
        char[] betuk = {'a','b','\n'};
        final int M =9;
        betuk = new char[M];
//        betuk[0]= 'a';
//        betuk[0]= 'b';
//        betuk[0]= 'c';
//        betuk[0]= 'd';
        int i = 0;
        for (char c ='a';c<'i';c++){
            System.out.print(c + "(" + (int)c+")");
//            betuk[i]= 'x';  
        }
        
        for (i =97;i<105;i++){
//            System.out.print((char)i+"");
            betuk[i-97]= (char)i;
        }

        for (i =0;i<M;i++){
            if(i != 0 && i % 3 == 0){
                System.out.println("");
            }
            System.out.print(betuk[i]+" ");
        }
        System.out.println("");
        
//        System.out.println("3x3-as mátrix keverve:");
////        int [] sorrend = {7,8,3,2,4,6,5,0,1};
//        int [] sorrend = {1,2,3,4,5,6,7,8};
//        for (int j = 0;j<sorrend.length;j++){
//            int t = (int) (Math.random()*sorrend.length);
//            int temp = sorrend[j];
//            sorrend[j] = sorrend[t];
//            sorrend[t] = temp;
//            }
//
//        for (i =0;i<M;i++){
//            if(i != 0 && i % 3 == 0){
//                System.out.println("");
//            }
//            System.out.print(betuk[sorrend[i]]+" ");
//        }
//        System.out.println("");
 
        System.out.println("10 faktoriális");
        long f =1;
        final int F_M =25;
        for (i = 1; i <= F_M; i++) {
            f *= i;
        }
        System.out.println("10! ="+f);   

        double dPi = Math.PI;
        System.out.printf("dPi: %.15f\n",dPi);
        System.out.println(dPi);
        float fPi = (float)Math.PI;
        System.out.printf("fPi: %.15f\n",fPi);
        System.out.println(fPi);
        
        
        System.out.println("min int: " +Byte.MIN_VALUE);
        System.out.println("max int:  "+Byte.MAX_VALUE);
        System.out.println("min int: " +Integer.MIN_VALUE);
        System.out.println("max int:  "+Integer.MAX_VALUE);
        System.out.println("min int: " +Long.MIN_VALUE);
        System.out.println("max int:  "+Long.MAX_VALUE);
        
        
        
        }
}
