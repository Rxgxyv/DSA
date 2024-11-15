import java.util.Scanner; 
public class selection {
    public static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void selectionsort(int arr[], int n){
        int min;
        for(int i = 0;i < n-1;i++){
            min=i;
            for(int j = i+1;j < n;j++){
                if(arr[j]<arr[min]) min=j;
            }
            if(min!=i){
                swap(arr,i,min);
            }
        }
        System.out.println("After Sorting:");
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
        selectionsort(arr,n);
        sc.close();
    }
    
}