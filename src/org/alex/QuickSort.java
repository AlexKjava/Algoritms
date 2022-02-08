package org.alex;

public class QuickSort {
    static void qsort(char items[]) {
        qs(items, 0, items.length - 1);
    }
        private static void qs(char items[], int left, int right){
            int i, j;
            char x, y;
            i = left;
            j = right;
            x = items[(left + right) / 2];
            do{
                while(
                        (items[i]<x) && (i<right)
                ) i++;

                while(
                        (x<items[j]) && (j>left)
                ) j--;

                if(i<=j){
                    y=items[i];
                    items[i]=items[j];
                    items[j]=y;
                    i++;
                    j--;
                }
            } while (i<=j);
            if(left<j)qs(items,left,j);
            if(i<right)qs(items,i,right);
        }
    }
class QSrun{
    public static void main(String[] args) {
        char a[] = {'f','z','k','a','e','v'};
        int i;
        for (i=0;i<a.length;i++){
            System.out.println("Initial arr: " + a[i]);
        }
        QuickSort.qsort(a);
        for (i=0;i<a.length;i++){
            System.out.println("After sort arr: " + a[i]);
        }
    }
}


