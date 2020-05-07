#include<iostream>
using namespace std;
int main()
{
    int r,c,i,j,a[10][10],sumr=0,sumc=0,sumd=0,sumt=0;
    cin >> r >> c;
     for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
            cin >> a[i][j];
    }
     }
for(i=0,j=0;j<c-1;j++)
{
  sumr=sumr+a[i][j];
}
  for(i=r-1,j=1;j<c;j++)
  {
    sumc=sumc+a[i][j];
   }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if((i+j)==c-1)
      {
        sumd=sumd+a[i][j];
      }
    }
  }
  sumt=sumc+sumr+sumd;
  cout<<"Sum of Zig-Zag pattern is "<<sumt;
}