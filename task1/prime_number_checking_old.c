#include<stdio.h>
#include<math.h>
int main()
{
    printf("Enter any number\n");
    int n;
    scanf("%d",&n);
    int prime[n],count=0;
    for(int i=2;i<=n;i++)
    {
        if(i==2)
        {
            prime[count]=2;
            count++;
        }
        else if(i>2)
        {
            int c=0;
            for(int j=2;j*j<i;j++)
            {
                if(i%j==0)
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                prime[count]=i;
                count++;
            }
        }
    }
    for(int i=0;i<count;i++)
    {
        printf("%d ",prime[i]);
    }
}
