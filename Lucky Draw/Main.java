#include<iostream>
using namespace std;
int main()
{
  int n,i,c=0;
  cin>>n;
  for (i = 1; i <= n; i++) {
      if (n % i == 0) {
         c++;
      }
  }

  if (c == 2) {
  cout<<"Eligible";
  }
  else {
 cout<<"Not eligible";
  }
}
  
  
  
  
  
  
  
  
  /*int n,i,f=0;
  cin>>n;
  for(i=2;i<=n/2;i++)
  {
    if(n%i==0)
    {
      cout<<"Not eligible";
      f=1;
      break;
    }
  }
    if(f==0)
    
      cout<<"Eligible";
      
  }*/

