#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;

    Node(int value) {
        data = value;
        next = NULL;
    }
};

int main() {
    // Create nodes
    Node* newNode1 = new Node(120);
    Node* newNode2 = new Node(140);
    Node* newNode3 = new Node(160);
    Node* newNode4 = new Node(180);

    // Link nodes
    newNode1->next = newNode2;
    newNode2->next = newNode3;
    newNode3->next = newNode4;

    // Print linked list
    Node* Temp = newNode1;
    while (Temp != NULL) {
        cout << Temp->data << " ";
        Temp = Temp->next;
    }

    return 0;
}
