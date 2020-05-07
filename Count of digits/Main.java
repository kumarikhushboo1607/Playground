#include<iostream>
using namespace std;
int main()
{
  int n,i=0;
  cin>>n;
  /*if(n<0)
{
n=n*-1;
}*/
if(n==0)
{
n=1;
}
  while(n!=0)
  {
    n=n/10;
    ++i;
  }

cout<<i;
}