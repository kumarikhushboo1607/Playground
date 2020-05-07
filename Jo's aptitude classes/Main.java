#include<iostream>
using namespace std;
int main()
{
  int a,b,c,n,gcd;
  cin>>a;
  cin>>b;
  cin>>c;
  cin>>n;
  if(a<b && a<c)
  {
    while(a!=0)
    {
     if(b%a==0 && c%a==0 && a%a==0)
       gcd=a;
      break;
      a--;
      }
    
    if(gcd==n)
      cout<<"Answer is correct.";
    else
      cout<<"Answer is wrong.";
  }
  else if(b<a && b<c)
  {
    while(b!=0)
    {
     if(a%b==0 && c%b==0 && b%b==0)
       gcd=b;
      b--;
    }
    if(gcd==n)
      cout<<"Answer is correct.";
    else
      cout<<"Answer is wrong.";
  }
  else   
  {
     while(c!=0)
    {
     if(a%c==0 && b%c==0 && c%c==0)
       gcd=c;
      c--;
    }
    if(gcd==n)
      cout<<"Answer is correct.";
    else
      cout<<"Answer is wrong.";
  }
}
      