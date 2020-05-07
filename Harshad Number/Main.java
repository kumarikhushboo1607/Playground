#include<iostream>
using namespace std;
int main()
{
  int n,j,t,s=0;
  cin>>n;
  j=n;
  while(n!=0)
  {
    t=n%10;
    s=s+t;
    
    n/=10;
  }
  if(j%s==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}