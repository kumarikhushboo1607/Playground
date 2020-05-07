#include<iostream>
using namespace std;
int main()
{
  int n,i,a=0,count=0,temp=0;
  cin>>n;
  while(n!=0)
  {
    a+=n%10;
    n/=10;
  }
  while(a!=0)
  {
    temp+=a%10;
    a/=10;
  
}
  cout<<temp;
}