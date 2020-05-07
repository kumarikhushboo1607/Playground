#include<iostream>
using namespace std;
int main()
{
  int n,x,c;
  cin>>n;
  c=n%10;
  n/=10;
  n/=10;
  n/=10;
  cout<<c+n;
}