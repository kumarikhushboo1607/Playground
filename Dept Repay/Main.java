#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t;
  float si,amt,dis,famt;
  std::cin>>p>>r>>t;
  si=(p*r*t)/100;
  amt=p+si;
  dis=si*2/100;
  famt=amt-dis;
  std::cout<<si<<"\n";
  std::cout<<amt<<"\n"<<dis<<"\n"<<famt<<"\n";
  
}