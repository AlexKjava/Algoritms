package org.alex;

public class BubbleSort {
    public static void main(String[] args) {
        int nmbr[] = {2,1,5,7,-1,5,4,9};
        int a,b,c;
        for (a=1; a<size;a++){
            for (b=size-1;b>=a;b--){
                if (nmbr[b-1]>nmbr[b]){
                    c=nmbr[b-1];
                    nmbr[b-1]=nmbr[b];
                    nmbr[b]=c;
                }
            }
        }
    }

}
