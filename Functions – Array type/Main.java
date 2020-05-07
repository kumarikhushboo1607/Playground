#include<iostream>
using namespace std;
int main()
{
  int n,i,arr[20],f=0,count=0,sum=0;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  cout<<"Enter the elements in the array"<<"\n";
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
}

  for(i=0;i<n;i++)
  {
    if(arr[i]%2==0)
    {
    count++;
  }
  else if(arr[i]%2!=0)
  {
    sum++;
  }
  }
  if(sum==n)
    cout<<"The array is Odd";
  else if(count==n)
    cout<<"The array is Even";
    else
 cout<<"The array is Mixed";
   
}
