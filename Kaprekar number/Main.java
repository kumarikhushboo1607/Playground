#include<iostream>
using namespace std;
int main()
{
  int i,n,a,c,e,f;
  cin>>n;
  a=n*n;
    if(a<1000)
    {
      c=a%10;
      e=a/10;
      f=c+e;
      if(f==n)
        cout<<"Kaprekar Number";
      else
        cout<<"Not a Kaprekar Number";
    }
    if(a>1000)
    {
      c=a%100;
      e=a/100;
      f=c+e;
      if(f==n)
        cout<<"Kaprekar Number";
      else
        cout<<"Not a Kaprekar Number";
    }
}