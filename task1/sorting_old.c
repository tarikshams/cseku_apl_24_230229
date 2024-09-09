#include<stdio.h>
int main()
{
    int i,arr1[10],n,j,k;
    printf("Enter the size of array\n");
    scanf("%d",&n);
    printf("Enter the array\n");
    for(i=0; i<n; i++)
    {
        scanf("%d",&arr1[i]);
    }
    for(i=0; i<n; i++)
    {
        for(j=0; j<n; j++)
        {
            if(arr1[i]<arr1[j])
            {
                k=arr1[i];
                arr1[i]=arr1[j];
                arr1[j]=k;

            }
        }
    }
    for(i=0; i<n; i++)
    {
        printf("%d\n",arr1[i]);
    }
}
