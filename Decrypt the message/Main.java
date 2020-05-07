#include<iostream>
using namespace std;
int main()
{
  int a,b,i,c,d,e=0;
  cin>>a;
  cin>>b;
  c=a+b;
  for(i=1;i<c;i++)
  {
    d=c%i;
    if(d==0 || d==c)
    {
      e=e+i;
    }
  }
  //e=e-c;
  if(e==c)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}