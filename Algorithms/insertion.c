#include<stdio.h>
#include<conio.h>
void insertion(int arr[],int n){
    int i,temp,j;
    for(i=1;i<n;i++){
        temp=arr[i];
        j=i-1;
        while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
    for(i=0;i<n;i++){
        printf("%d ",arr[i]);
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
    insertion(arr,n);
}