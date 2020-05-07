#include<iostream>
using namespace std;
int main()
{
  int a,b,c,n,m;
  cin>>a;
  cin>>b;
  cin>>c;
  if((a<b && a>c) || (a>b && a<c))
  {
    cout<<"The treasure is in box which has number"<<" "<<a<<"\n";
}
   else if((b<a && b>c) || (a<b && b<c))
  {
    cout<<"The treasure is in box which has number"<<" "<<b<<"\n";
}
  else
  {
    cout<<"The treasure is in box which has number"<<" "<<c<<"\n";
}
  if(a<b && a<c)
  {
    if(b%a==0 && c%a==0)
      cout<<"The code to open the box is"<<" "<<a;
    else
    {
      n=b-a;
      m=c-a;
      if(m<n)
      cout<<"The code to open the box is"<<" "<<m;
      else
        cout<<"The code to open the box is"<<" "<<n;
    }
  }
  if(b<a && b<c)
  {
    if(a%b==0 && c%b==0)
      cout<<"The code to open the box is"<<" "<<a;
    else
    {
      n=a-b;
       m=c-b;
      if(m<n)
      cout<<"The code to open the box is"<<" "<<m;
      else
        cout<<"The code to open the box is"<<" "<<n;
     
    }
  }
    if(c<a && c<b)
  {
    if(a%c==0 && b%c==0)
      cout<<"The code to open the box is"<<" "<<c;
      else
    {
        
      n=a-c;
         m=b-c;
      if(m<n)
      cout<<"The code to open the box is"<<" "<<m;
      else
        cout<<"The code to open the box is"<<" "<<n;
      
    }
  }
    
    
  
  
  
  
}
  