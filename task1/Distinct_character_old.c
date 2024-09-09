#include<stdio.h>
#include<string.h>
int main()
{
    printf("Enter any string ");
    char str[1000];
    scanf("%s",str);
    int len=strlen(str);
    for(int i=0; i<len; i++)
    {
        for(int j=i+1; j<len; j++)
        {
            if(str[i]==str[j])
            {
                str[j]=str[len-1];
                len--;
                j--;
            }
        }
    }
    str[len]='\0';
    printf("%s",str);

}
