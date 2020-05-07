#include<iostream>
using namespace std;
int main()
{
  int n,m,i,count=0,j;
  int arr[10];
  cin>>n>>m;
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(i=0;i<n;i++)
  {
    if(arr[i]<=m)
    {
      count++;
      if(arr[i+1]==1)
        count--;
    }
    else 
    {
      j=arr[i]-m;
    }
  }
  cout<<count;
}
      
  
