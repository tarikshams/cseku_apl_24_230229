#include <stdio.h>
#include <stdlib.h>

// Define the structure for a node in the linked list
struct Node
{
    int id;
    struct Node *next;
};

// Function to print the linked list
void printList(struct Node *start);

int main()
{
    struct Node *newNode, *current, *start = NULL;
    int nodeCount = 0, i = 0;


    printf("How many values do you need to scan? ");
    scanf("%d", &nodeCount);

    // Loop to create the linked list
    while (i < nodeCount)
    {
        int nodeId;
        printf("\nEnter node id: ");
        scanf("%d", &nodeId);

        // Allocate memory for a new node
        newNode = (struct Node *)malloc(sizeof(struct Node));
        newNode->id = nodeId;
        newNode->next = NULL;

        // If it's the first node, set it as the start
        if (i == 0)
        {
            start = newNode;
            current = start;
        }
        else
        {
            // Link the new node to the end of the list
            current->next = newNode;
            current = newNode;
        }
        i++;
    }

    // Print the linked list
    printList(start);

    return 0;
}

// Function to print the linked list
void printList(struct Node *start)
{
    struct Node *temp = start;
    while (temp != NULL)
    {
        printf("%d\n", temp->id);
        temp = temp->next;
    }
}

