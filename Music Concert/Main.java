#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int n,m=0,f=0,i;
  cin>>n;
  int *a;
  a=(int *)calloc(n, sizeof(a));
  for(i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  for(i=0;i<n;i++)
  {
    if(*(a+i)%2==0)
    {
      f++;
      
    }
    else
      m++;
  }
  cout<<m<<"\n";
   cout<<f<<"\n";
  
      
  return 0;
}