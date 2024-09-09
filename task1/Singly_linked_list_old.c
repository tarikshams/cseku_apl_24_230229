#include<stdio.h>
#include<stdlib.h>
struct node
{
    int nid;
    struct node * n;
};
void printflist(struct node * s);
int main()
{
    struct node *p1,*p,*p2,*p3,*start,*current;
    p1=(struct node*)malloc(sizeof(struct node));

    int counter = 0,i=0;
    printf("How many values do you need to scan?");
    scanf("%d",&counter);
    while(i<counter)
    {
        int nid;
        printf("\nEnter node id");
        scanf("%d",&nid);
        p=(struct node *)malloc(sizeof(struct node));
        p->nid=nid;
        p->n = NULL;
        if(i==0)
        {
            start = p;
            current= start;
        }
        else
        {
            current->n=p;
            current =p;
        }
        i++;
    }
    printflist(start);
}
void printflist(struct node * s)
{
    while(s!=NULL)
    {
        printf("%d\n",s->nid);
        s=s->n;
    }
}
