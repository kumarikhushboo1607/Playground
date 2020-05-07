#include<iostream>
using namespace std;
int main()
{
  int n,i,count=0,a=2,b=1;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==0)
    {
      a=(i*i)-2;
      cout<<a<<" ";
    }
    else
    {
    a=(i*i)-1;
    cout<<a<<" ";
  }
  }
}
  

        
    
