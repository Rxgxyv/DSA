#include<bits/stdc++.h>
using namespace std;
void swap(int &st,int &en){
    int temp=st;
    st = en;
    en=temp;
}
int quicksort(int arr[],int lb,int up){
    int pivot=arr[lb];
    int start=lb;
    int end=up;
    while(start<end){
        while(arr[start]<=pivot){
            start++;
        }
        while(arr[end]>pivot){
            end--;
        }
        if(start<end){
            swap(arr[start],arr[end]);
        }
    }
    swap(arr[lb],arr[end]);
    return end;
}
void quick(int arr[],int lb, int up){
    if(lb<up){
        int loc=quicksort(arr,lb,up);
        quick(arr,lb,loc-1);
        quick(arr,loc+1,up);
    }

}
int main(){
    int n;
    cout<<"Enter the size of the array:"<<endl;
    cin>>n;
    int arr[n];
    cout<<"Enter the elements:"<<endl;
    for (size_t i = 0; i < n; i++){
        cin>>arr[i];
    }
    int lb=0;
    int up=n-1;
    quick(arr,lb,up);
    for (size_t i = 0; i < n; i++){
        cout<<arr[i]<<" ";
    }
    
}