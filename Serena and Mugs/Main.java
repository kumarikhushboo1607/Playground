#include<iostream>
using namespace std;
int main()
{
  int n,s,i;
  int arr[10];
  cin>>n>>s;
  int sum=0;
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(i=0;i<n;i++)
  {
  sum+=arr[i];
}
  if(sum<=s)
    cout<<"YES";
  else
    cout<<"NO";
}