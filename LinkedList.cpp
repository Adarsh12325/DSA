#include<iostream>
using namespace std;
class Node{
  public:
  int data;
  Node* next;
  Node(int value){
   data = value;
    next = NULL;
  }
};
int main(){
  int n,value;
  Node* Head = NULL;
  Node* Tail = NULL;
  cin>> n;
  for (int i=0;i<n;i++){
    cout<<"enter data no. "<<(i+1)<<": ";
    cin>>value;
    
  Node* newNode = new Node(value);
  
  if(Head == NULL){
    Head = newNode;
    Tail = newNode;
  }else{
    Tail->next = newNode;
    Tail = newNode;
  }
  }
  Node* Temp = Head;
  while(Temp!=NULL){
    cout<<Temp->data<<" ";
    Temp = Temp -> next;
  }
    
  
  return 0;
}