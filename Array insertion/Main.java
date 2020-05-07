#include<iostream>
using namespace std;
int main()
{
  int n,i,pos,v,arr[20],f=0;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  cout<<"Enter the elements in the array"<<"\n";
  
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cout<<"Enter the location where you wish to insert an element"<<"\n";
    cin>>pos;
   if(pos<n)
  {
    f=1;
  cout<<"Enter the value to insert"<<"\n";
  cin>>v;
  pos=pos-1;
  for(i=n;i>pos;i--)
  {
    arr[i]=arr[i-1];
  }
  arr[pos]=v;
  cout<<"Array after insertion is"<<"\n";
  for(i=0;i<n+1;i++)
  {
    cout<<arr[i]<<"\n";
  }
}
else
{
  cout<<"Invalid Input";
}

}
    
   