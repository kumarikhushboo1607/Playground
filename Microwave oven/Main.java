#include<iostream>
using namespace std;
int main()
{
  int a;
  float b,c;
  cin>>a;
  cin>>b;
  if(a==2)
  {
    c=b+(b*50.0/100.0);
    cout<<c;
  }
  else if(a==3)
  {
      c=2*b;
    cout<<c;   
  }
  else
  {
    cout<<"Number of items is more";
  }
}

  
  
