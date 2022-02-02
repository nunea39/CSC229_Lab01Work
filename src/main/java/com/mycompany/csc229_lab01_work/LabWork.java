package com.mycompany.csc229_lab01_work;



public class LabWork {
    
    //Task01
    static int getSumofPrimes(int n){
        int sum=0;
        for(int i=2; i<=n; i++)
            if(isPrim(i))
                sum = sum+ i;       
        return sum;
    }
    static boolean isPrim(int x){
        for(int i=2; i<x; i++)
            if(x%i == 0)
                return false;
        return true;
    }
    
    //Task02
    static int getSumofPrimesWithDigit(int n){
        int sum=0;
        for(int i=2; i<=n; i++)
            if(isPrim(i) && checkDigit(i,3))
                sum = sum+ i;       
        return sum;
    }
    static boolean checkDigit(int x, int digit){
        String str = ""+x;
        return str.contains(""+digit);        
    }
    
    //Task03
    static int getSumofPrimesWith2Digit(int n){
        int sum=0;
        for(int i=2; i<=n; i++)
            if(isPrim(i) && checkDigit(i,3) && checkDigit(i,5))
                sum = sum+ i;       
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(getSumofPrimesWith2Digit (100) );
    }


}
