#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char s1[1000];
  int i,len,v=0,c=0,d=0,w=0,s=0;
  cin.getline(s1,1000);
  len=strlen(s1);
  for(i=0;i<len;i++)
  {
    if(s1[i]=='A' || s1[i]=='E' || s1[i]=='I' || s1[i]=='O' || s1[i]=='U' || s1[i]=='a' || s1[i]=='e' || s1[i]=='i' || s1[i]=='o' || s1[i]=='u')
     v++;
   
   else if((s1[i]>='a' && s1[i]<='z') || (s1[i]>='A' && s1[i]<='Z'))
      c++;
    
    else if(s1[i]>='0' && s1[i]<='9')
      d++;
    else if(s1[i]==' ')
      w++;
    else
      s++;
  }
  cout<<"Vowels:"<<v<<"\n";
  cout<<"Consonants:"<<c<<"\n";
  cout<<"White Spaces:"<<w<<"\n";
  cout<<"Digits:"<<d<<"\n";
  cout<<"Symbols:"<<s<<"\n";
}    
       