#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char s1[50],s2[50];
  char rev[50]="\0";
  int len,i,j=0;
  cin>>s1>>s2;
  len=strlen(s1);
  for(i=len-1;i>=0;i--)
  {
    rev[j]=s1[i];
    j++;
  }
  
  if(strcmp(rev,s2)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  }

