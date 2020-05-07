#include<iostream>
using namespace std;
int main()
{
 int age;
  double t;
  cin>>age;
  cin>>t;
  if(age>13)
  {
    if(t==13.30)
    {
      cout<<"$5.00";
    }
    else
    {
      cout<<"$8.00";
    }
    
  }
  else
  {
    if(t==13.30)
    {
      cout<<"$2.00";
    }
    else
    {
  
      cout<<"$4.00";
    }
}
}