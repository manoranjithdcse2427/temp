import java.util.Scanner;

class main{
    
    static void pivot(int[] arr,int l,int h){
        if(l < h){
            int pi = merge(arr,l,h);
            pivot(arr,l,pi-1);
            pivot(arr,pi+1,h);
        }
        
    }
    
    static int merge(int[] arr,int l,int h){
        int pivot = arr[h];
        int i = l-1;
        for(int j = l;j <= h;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;arr[i++] = sc.nextInt());
        
        pivot(arr,0,n-1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
