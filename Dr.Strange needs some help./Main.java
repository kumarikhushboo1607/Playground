#include<iostream>
using namespace std;
int bacteria(int, int);
int main()
{
  int m,n,a=2,i,req;
  cin>>m;
  cin>>n;
  cin>>req;
  for(i=1;i<n;i++)
  {
   a*=m; 
  }
 
  if(req<=a)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}  
