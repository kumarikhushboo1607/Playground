#include<iostream>
using namespace std;
int main()
{
 int n,i,a,c,b=0,d=0;
  cin>>n;
  c=n;
 while(n!=0)
 {
   a=n%10;
  if(a%2==0)
    b+=a;
    else
     d+=a;
   n/=10;
 }
  if(b==d)
    cout<<"Yes";
  else
    cout<<"No";
  
}
   
   
