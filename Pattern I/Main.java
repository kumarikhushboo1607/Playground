#include<iostream>
using namespace std;
int main()
{
  int n,i,a,j;
cin>>n;
  a=n+4;
  for(i=n;i<a;i++)
  {
    for(j=n;j<=i;j++)
    {
      cout<<i;
    }
    cout<<"\n";
  }
for(i=a-1;i>=n;i--)
  {
    for(j=i;j>=n;j--)
    {
      cout<<i;
    }
    cout<<"\n";
  }
}