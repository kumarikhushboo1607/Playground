#include<iostream>
using namespace std;
int main()
{
int n,i,x,f=0;
  cin>>n;
  int arr[50];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cin>>x;
  for(i=0;i<n;i++)
  {
    if(x==arr[i])
      f=1;
}
  if(f==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}
