#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,rowsum;
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
   rowsum=0; 
    for(j=0;j<c;j++)
    {
      rowsum+=a[i][j];
    
    }
 cout<<rowsum<<"\n";
  }
}