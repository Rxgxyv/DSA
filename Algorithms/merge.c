#include<stdio.h>
#include<conio.h>
void merge(int arr[], int lb,int mid, int up){
    int i = lb;
    int j= mid + 1;
    int k=0;
    int merge[up-lb+1];
    while (i <=mid && j <=up){
        if (arr[i] <= arr[j]){
            merge[k++]=arr[i++];
        }else{
            merge[k++]=arr[j++];
        }
    }
    while(j<=up){//to print remaining elements
            merge[k++]=arr[j];
            j++;
        }
   
    while(i<=mid){//to print remaining elements
        merge[k++]=arr[i];
        i++;
    }
    for(i = lb,k=0;i <=up;i++,k++){//copy it to original array
        arr[i]=merge[k];
    }         
}
void mergesort(int arr[],int lb, int up){
    if(lb < up){
        int mid=(lb+up)/2;
        mergesort(arr,lb,mid);
        mergesort(arr,mid+1,up);
        merge(arr,lb,mid,up);
    }
}
int main(){
    int n;
    scanf("%d",&n);
    int *arr=(int*)malloc(n*sizeof(int));
    int i;
    printf("enter the elements:");
    for (i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }
    int lb=0;
    int up=n-1;
    mergesort(arr,lb,up);
    int p;
    for (p = 0; p < n; p++){
        printf("%d\t",arr[p]);
    }printf("\n");
    
    
}