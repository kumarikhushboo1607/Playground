#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,large;
  cin>>r>>c;
  int a[20][20];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
    
}
  for(i=0;i<r;i++)
  {
    int max=a[i][0];
    for(j=1;j<c;j++)
    {
      if(a[i][j]>max)
        max=a[i][j];
    }
    cout<<max<<"\n";
  }
  
}
  