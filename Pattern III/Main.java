#include<iostream>
using namespace std;
int main()
{
  int n,i,a,j;
cin>>n;
  a=n+4;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<i;j++)
    {
      cout<<i<<"*";
    }
    cout<<i<<"\n";
  }
for(i=n;i>=1;i--)
  {
    for(j=i;j>1;j--)
    {
      cout<<i<<"*";
    }
    cout<<i<<"\n";
  }
}
