#include<iostream>
using namespace std;
int main()
{
  int n,i,j,k=0,number=1;
  cin>>n;
  for(i=1;i<=n;i++)
  { 
   if(i%2!=0)
   {
     for(j=k+1;j<k+i;j++)
     {
       cout<<j<<"*";
     }
     cout<<j++<<"\n";
     k=j;
   }
    else
    {
      k=k+i-1;
      for(j=k;j>k-i+1;j--)
      {
        cout<<j<<"*";
      }
      cout<<j<<"\n";
    }
  }
}   