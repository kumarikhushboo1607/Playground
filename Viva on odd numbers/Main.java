#include<iostream>
using namespace std;
int main()
{
   int n,count=0;
  float p=0;
  cin>>n;
  for(;count!=3;)
  {
    if(n<0)
    {
      p=p-1.0;
      break;
    }
    if(n%2==0)
    {
      p=p-0.5;
      cin>>n;
    }
    else
    {
      if(count!=3)
      {
        p=p+1.0;
        cin>>n;
        count++;
      }
    }
  }
  cout<<p;
}