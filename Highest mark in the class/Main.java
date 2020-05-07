#include<iostream>
using namespace std;
int main()
{
  int n,i,temp;
  cin>>n;
  int arr[50];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(i=0;i<n;i++)
  {
    if(arr[i]>arr[i+1])
    {
      temp=arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=temp;
    }
      
}
  cout<<temp;
}