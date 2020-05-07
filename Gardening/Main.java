#include<iostream>
using namespace std;
int main()
{
  int r,c,n,m;
  cin>>r;
  cin>>c;
  cin>>n;
  m=r*c;
  if(n<=(r+r) && n>r+r-r)
  cout<<"It is a mango tree";
 else if(n<=m && n>(m-(r+r)))
  {
    if(n<=(m-r) && n>(m-(r+r)))
  cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  }
  else
    cout<<"It is not a mango tree";
  
}
  
