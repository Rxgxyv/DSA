import java.util.Scanner;
public class bubblesort {
    public static void bubble(int arr[],int n){
        int temp,flag;
        for(int i = 0; i < n -1;i++){
            flag=0;
            for(int j = 0; j < n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0) break;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubble(arr,n);
        sc.close();
    }
}