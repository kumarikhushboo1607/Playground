#include<iostream>
using namespace std;
int main()
{
  int  wb,a,b,c;
  cin>>wb;
  cin>>a;
  cin>>b;
  c=(a*75)+(b*30);
  if(c<wb)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}