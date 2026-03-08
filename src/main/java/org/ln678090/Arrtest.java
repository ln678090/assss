package org.ln678090;

public class Arrtest {
    //https://loppytoon.com

    public int sum(int []arr){
        int sum = 0;
        for(int j:arr){
            if(j%2==0){
                sum+=1;
            }
        }
        return sum;
    }
}
