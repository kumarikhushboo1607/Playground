#include <iostream>
using namespace std;
int main() 
{
  int i,n,m;
  cin>>n;
 while(n>0)
 {
   m=n%10;
   cout<<m;
   n/=10;
   
}
}