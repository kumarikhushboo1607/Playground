#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char s1[100];
  cin>>s1;
  int len,i;
  len=strlen(s1);
  for(i=0;i<len;i++)
    {
    if(s1[i]>='a' && s1[i]<='z' || s1[i]>='A' && s1[i]<='Z')
      cout<<s1[i];
   } 
}