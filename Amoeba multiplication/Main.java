#include<iostream>
using namespace std;
int main()
{
  int n,i,x=0,y=1,z;
  cin>>n;
  for(i=0;i<n;i++)
  {
    if(n==1)
      cout<<x;
    if(n==2)
      cout<<y;
    z=x+y;
    y=x;
    x=z;
}
  cout<<y;
}