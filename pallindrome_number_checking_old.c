#include<stdio.h>
#include<math.h>
int main()
{
    int n,i=0,j,k=0,remainder,count=0,l=0,m=0;
    int array[10];
    printf("Enter any number ");
    scanf("%d",&n);
    for(i=0;n>0;i++)
    {
        remainder=n%10;
        //printf("%d\n",remainder);
        n=n/10;
        array[i]=0;
        array[i]=remainder;
        count++;
    }
    //for(i=0;i<count;i++)
    //{
      //  printf("%d#\n",array[i]);

    //}

    for(j=0;j<count;j++)
    {
        k=count-1;
       // printf("%d",array[k]);
        if(array[j]==array[k])
        {
            l++;
        }
        else
        {
            m++;
        }

    }
    if(l==count && m==0)
    {
        printf("The entered number is a palindrome number ");
    }
    else
    {
        printf("The entered number is not a palindrome number ");
    }
    return 0;

}
