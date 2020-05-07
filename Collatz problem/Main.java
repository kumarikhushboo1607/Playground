#include<iostream>
using namespace std;
int main()
{
  int n,i;
  cin>>n;
  //cout<<n;
  while(n>2)
  {
    cout<<n<<"\n";
    if(n%2==0)
    {
      n=n/2;
    //cout<<n<<"\n";
    }
    else
    {
      n=3*n+1;
     
    }
   
    i++;
    
}
  if(n==1)
    cout<<"1"<<"\n"<<"0"<<"\n";
  else
  {
  cout<<n<<"\n"<<"1"<<"\n";
  cout<<++i;
  }
}