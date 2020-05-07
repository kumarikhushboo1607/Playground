#include<iostream>
using namespace std;
int main()
{
  int consumed,amt;
  cin>>consumed;
  if(consumed<=200)
  {
    amt=consumed*0.5;
  cout<<"Rs."<<amt;
  }
  else if(consumed>200 && consumed<=400)
  {
   amt=consumed*0.65+100;
  cout<<"Rs."<<amt;
  }
   else if(consumed>400 && consumed<=600)
   {
    amt=consumed*0.80+200;
  cout<<"Rs."<<amt;
   }
  else
  {
    amt=consumed*1.25+425;
  cout<<"Rs."<<amt;
   }
    
  
}