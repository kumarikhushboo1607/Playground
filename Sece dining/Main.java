#include<iostream>
using namespace std;
int main()
{
 string str;
  int rail;
  cin>>str;
  cin>>rail;
  if(str=="front")
  { 
    if(rail==1)
    { 
      cout<<"Left Handed";
    }
  else 
  {
    cout<<"Right Handed";
  }
  }
    if(str=="rear")
    {
      if(rail==1)
      {
        cout<<"Right Handed";
      }
      else
      {
        cout<<"Left Handed";
      }
    }
}
  
