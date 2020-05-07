#include<iostream>
using namespace std;
int main()
{
  int a,b,gcd,small=0;
  cin>>a;
  cin>>b;
  if(a<b)
  {
    small=a;
    while(small!=0)
    {
      if(b%small==0 && a%small==0)
      {
        gcd=small;
      break;
    }
      small--;
}
    cout<<"G.C.D of "<<a<<" "<<"and"<<" "<<b<<" "<<"= "<<gcd;
    //cout<<gcd;
  }
  else
  {
    small=b;
    while(small!=0)
    {
      if(a%small==0 && b%small==0)
      {
        gcd=small;
      break;
      }
      small--;
}
    cout<<"G.C.D of "<<a<<" "<<"and"<<" "<<b<<" "<<"= "<<gcd;
    //cout<<gcd;
  }
}
    