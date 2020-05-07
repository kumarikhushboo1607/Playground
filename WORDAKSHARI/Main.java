#include<bits/stdc++.h>
#include<string.h>
using namespace std;

int main()
{
    char s1[100][100];
    int i,n=0;
    for(i=0;i<5;i++)
    {
        cin.getline(s1[i],50);
        n++;
        if(strcmp(s1[i],"####")==0)
            break;
    }
  cout<<s1[0]<<"\n";
    for(i=0;i<n;i++)
    {
        if(s1[i][strlen(s1[i])-1]==s1[i+1][0])
            cout<<s1[i+1]<<"\n";
    }
    return 0;
}