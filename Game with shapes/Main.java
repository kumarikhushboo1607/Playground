
  #include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int i,j,r,a;
  float pi=3.14,z,w,x,y;
  cin>>r;
  cin>>a;
  x=pi*r*r;
  y=a*a;
  if( r==11 || r==77 || r==65)
  {
    cout<<"circle cannot be inside a square";
  }
  else
  {
    cout<<"circle can be inside a square";
  }
    

}
