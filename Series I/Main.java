#include<iostream>
using namespace std;
int main()
{
  int n;
  float i,a=0.5;
  cin>>n;
  if(n==1)
    cout<<a;
  for(i=0.5;i<n-1;i++)
  {
    if(i==0.5)
      cout<<a<<" ";
    a=a*3;
    cout<<a<<" ";
    
  }
}