#include <stdio.h>

int main()
{
    int  temp, size;
    int array[10];


    printf("Enter the size of the array (up to 10):\n");
    scanf("%d", &size);


    printf("Enter the elements of the array:\n");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &array[i]);
    }

    // Sort the array using bubble sort algorithm
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            if (array[i] < array[j])
            {
                // Swap elements if they are in the wrong order
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }

    // Print the sorted array
    printf("Sorted array:\n");
    for (i = 0; i < size; i++)
    {
        printf("%d\n", array[i]);
    }

    return 0;
}

