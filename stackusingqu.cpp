#include<bits/stdc++.h>
using namespace std;
class queue{
public:
    int rear, front,capacity,size;
    int* arr;
    queue(int capacity){
        this->capacity=capacity;
        front=size=0;
        rear=capacity-1;
        arr=int[capacity];
    }
    bool isfull(){ return (size==capacity);}
    bool isempty(){ return (size==0);}
    void enqueue(int item){
        if(!isempty()){
            rear++;
            arr[rear]=item;
            size++;
        }
        else{
            cout<<"Queue is full:"<<endl;
        }
    }
    void dequeue(){
        if(isempty()) return;
        int d=arr[front];
        front++;
        size--;
        cout<<"Deleted element:"<<d<<endl;
    }
    void frontele(){
        if(isempty()) return -1;
        return arr[front];
    }
};
class 