#include<iostream>
using namespace std;
int main()
{
  int n,i,a=5,b=6,c=0;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    b+=c;
    c=a*i;
    cout<<b<<" ";
  }
}