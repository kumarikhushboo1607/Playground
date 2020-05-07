#include<iostream>
using namespace std;
struct time
{
  int h,m,s;
};
int main()
{
  struct time h1,h2;
  int a,b,c;
  cin>>h1.h>>h1.m>>h1.s;
  cin>>h2.h>>h2.m>>h2.s;
  if(h2.s>h1.s)
    {
    --h1.m;
    h1.s+=60;
   }
   c=h1.s-h2.s;
  if(h2.m>h1.m)
  {
    --h1.h;
    h1.m+=60;
  }
  
  a=h1.h-h2.h;
  b=h1.m-h2.m;
  cout<<a<<":"<<b<<":"<<c;
}