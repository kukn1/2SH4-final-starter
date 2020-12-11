/* Question 1
 [C Programming]
 [30 Marks]
In this question, you are required to implement a linked list in C
The question has four parts, answer all of them in this same file*/
 
/*(a) [5 Marks] write structure Node that holds an integer value as well as a pointer to the next node*/
//Answer:

struct Node{
    
    int value;
    struct Node *next;
};

/*(b) [5 Marks] Write structure SLL that represents the singly linked list and holds a pointer to the first node in the list.*/
//Answer:

struct SLL{
  
  struct Node *head;
};


/*(c) [10 Marks] write function searchList, that takes as input two parameters: the head of a linked list "head" and the integer value to search for "target" and 
returns:
1 if the target was found in the list
0, otherwise*/
//Answer:

int searchList (struct Node *head, int target){
    
    for (struct Node *temp = head; temp != NULL; temp = temp->next){
        
        if (temp->value == target) return 1;
        
    }
    return 0;
}


  
/*(d) [10 Marks] test your function in main by creating a list of 10 nodes and then call the searchList function to search for a certain value, make sure you check 
the correctness of the returned value from the function by comparing it against what you expect. */
//Answer:


int main(){

    struct Node* test1;
    test1 = (struct Node*)malloc(sizeof(struct Node));
    test1->value = 1;
    struct Node* test2;
    test2 = (struct Node*)malloc(sizeof(struct Node));
    test2->value = 2;
    test1->next = test2;
	struct Node* test3;
    test3 = (struct Node*)malloc(sizeof(struct Node));
    test3->value = 3;
    test2->next = test3;
    
    
	int check = searchList(test1,2);
	if (check == 1) printf("correct\n");
	else printf("wrong\n");
	
	int check2 = searchList(test1,42069);
	if (check2 == 0) printf("correct\n");
	else printf("wrong\n");
	
	
	return 0;
}
