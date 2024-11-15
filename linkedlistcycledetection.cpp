#include<bits/stdc++.h>
using namespace std;
class node{
public:
    int data;
    node *next;
    node(int x){
        this->data=x;
        this->next=NULL;
    }
};
    bool detectcycle(node* head){
        node* slow=head;
        node* fast=head;
        while(slow!=NULL and fast!=NULL and fast->next!=NULL)
        {
            slow=slow->next;
            fast=fast->next->next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

int main(){
    node* head=new node(10);
    head->next = new node(20);
    head->next->next = new node(30);
    head->next->next->next = new node(40);
    head->next->next->next->next = new node(50);
    head->next->next->next->next->next = new node(60);
    head->next->next->next->next = head;

    if (detectcycle(head)){
        /* code */
        cout<<"Loop detected:";
    }else cout<<"No Loop present in Linked List";
    
}