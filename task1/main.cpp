#include <bits/stdc++.h>
using namespace std;
float f(float x)
{
    float temp=pow(x,2)-x-2;
    return temp;
}

int main()
{
    float a=0,b=0,x0=0;
    int iteration_num=0;
    cout << "Enter upper and lower value" << endl;
    cin>>a>>b;
    cout<<"Enter iteration number"<<endl;
    cin>>iteration_num;
    int c=0;
    for(int i=0;i<iteration_num;i++)
    {
        cout<<"Iteration number: "<<(i+1)<<endl;
        cout<<endl;
        x0=a-((f(a)*(b-a))/(f(b)-f(a)));
        cout<<"x0:"<<x0<<endl;
        cout<<endl;
        float value_of_function=f(x0);
        cout<<"f(x0):"<<value_of_function<<endl;
        cout<<endl;
        float abs_value_of_func=abs(value_of_function);

        if(abs_value_of_func==0)
        {
            cout<<"Root is:"<<x0<<endl;
            c=1;
            break;
        }
        else if(f(x0)*f(a)<0)
        {
            b=x0;
            continue;
        }
        else if(f(x0)*f(b)<0)
        {
            a=x0;
            continue;
        }
    }
    if(c==0)
    {
        cout<<"x0 from last iteration :"<<x0<<endl;
    }

    return 0;
}
