
#include<iostream>
#include<iostream>
using namespace std;
int main()
{
  int d1,d2,d3,d4,d5,d6,d7,D;
  float s1,s2,s3,s4,s5,s6,s7,s8,S;
  cin>>d1;
  cin>>d2; 
  cin>>d3; 
  cin>>d4; 
  cin>>d5;
   cin>>d6;
   cin>>d7;
  s1=d1*150;
  s7=d7*125;
    if(d2<=8)
    {
        s2=d2*100;
    }
    else if(d2>8)
    {
       s2=(100*8)+(d2-8)*115;
    }
    if(d3<=8)
    {
        s3=d3*100;
    }
    else if(d3>8)
    {
        s3=(100*8)+(d3-8)*115;
    }
    if(d4<=8)
    {
        s4=d4*100;
    }
    else if(d4>8)
    {
        s4=(100*8)+(d4-8)*115;
    }
    if(d5<=8)
    {
        s5=d5*100;
    }
    else if(d5>8)
    {
        s5=(100*8)+(d5-8)*115;
    }
    if(d6 <= 8)
    {
        s6=d6*100;
    }
    else if(d6>8)
    {
        s6=(100*8)+(d6-8)*115;
    }
    D=d1+d2+d3+d4+d5+d6+d7;
    if(D>40)
    S+=(D-40)*25;
    S=s1+s2+s3+s4+s5+s6+s7;
    cout<<S;
    return 0;
}
