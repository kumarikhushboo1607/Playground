#include<iostream>
#include<cstring>
using namespace std;
int main() 
{ 
  string fnum;
  int i,found;
  getline(cin,fnum);
  found=fnum.find(".");
  if(found==0 || found==-1)
    cout<<"Floating part is : ";
    else
    {
      cout<<"Floating part is : ";
  for(i=found+1;fnum[i]!='\0';i++)
  {
    cout<<fnum[i];
  }
  
	
}
}