#include<stdio.h>
#include<math.h>
int main()
{
    printf("Enter any number\n");
    int size;
    scanf("%d",&size);
    int prime[size],count=0;
    for(int i=2; i<=size; i++)
    {
        if(i==2)// 2 is a prime number
        {
            prime[count]=2;
            count++;
        }
        else if(i>2)//prime number checking from atleast 3
        {
            int flag=0;
            for(int j=2; j<sqrt(i); j++)//checking for divisor
            {
                if(i%j==0)/*if the number i is divisible
                           then it is not a prime number*/
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)//the number is not divisible therefore prime
            {
                prime[count]=i;
                count++;
            }
        }
    }
    for(int i=0; i<count; i++)//printing the list of prime from 2 to size
    {
        printf("%d ",prime[i]);
    }
}

