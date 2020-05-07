#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,i,e,f;
  cin>>a;
  cin>>b;
  cin>>c;
  cin>>d;

e=a+c;
f=b+d;
if(f>100)
{
 e=e+1;
  cout<<e<<"\n";
}
else
  cout<<e<<"\n";
if(f>100)
{
  f=f-100;
  cout<<f;
}
else
  cout<<f;
}
