package com.Jakub;

public class Wyliczanie {
    public void wyliczciag(int x){
        int[] fib = new int[x];
        System.out.println("Ciąg fibonacciego " + fib.length + " elementowy");
        for (int i = 0 ; i < fib.length ; i++){
            if (i == 0){
                fib[i] = 0;
            }
            else if(i == 1){
                fib[i]= 1;
            }
            else {
                fib[i] = fib[i-2] + fib [i - 1];
            }


        }
        for(int y = 0 ; y < fib.length ; y++)

            System.out.print(fib[y]   +    "  ");
    }

}
