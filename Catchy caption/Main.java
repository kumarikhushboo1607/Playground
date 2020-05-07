#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   string s1;
  int count=0,i;
  getline(cin,s1);
  for(i=0;s1[i]!='\0';i++)
  {
    if(s1[i]==' ')
      count++;
  }
  if(count>10)
    cout<<"Caption not eligible for the contest";
  else
    cout<<"Caption eligible for the contest";
   
}