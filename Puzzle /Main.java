#include<iostream>
using namespace std;
int main()
{
   int c,r,i,j;
  cin>>r;
  cin>>c;
  int mat1[r][c],mat2[r][c],mat3[r][c];
for(i=0;i<r;i++)
{
  for(j=0;j<c;j++)
  {
    cin>>mat1[i][j];
  }

}
  for(i=0;i<c;i++)
{
  for(j=0;j<r;j++)
  {
    cout<<mat1[j][i]<<" ";
  }
cout<<"\n";
}
}