#include<iostream>
using namespace std;
void add(int a, int b,int c, int d);
void subtract(int a, int b,int c, int d);
void multiply(int a, int b,int c, int d);
int main()
{
  int ch;
  cin>>ch;
  int a,b,c,d;
  cin>>a>>b>>c>>d;
 switch(ch)
 {
   case 1: add(a,b,c,d);
     break;
   case 2: subtract(a,b,c,d);
     break;
   case 3: multiply(a,b,c,d);
     break;
   default: cout<<"Invalid choice";
 }
}
  void add(int a,int b,int c,int d)
  {
    int e,f;
    e=a+c;
    f=b+d;
    cout<<e<<"+"<<f<<"i";
  }
  void subtract(int a,int b,int c,int d)
  {
    int e,f;
    e=a-c;
    f=b-d;
    cout<<e<<"+"<<f<<"i";
  }
  void multiply(int a,int b,int c,int d)
  {
    int e,f;
    e=a*c-b*d;
    f=a*d+b*c;
    cout<<e<<f<<"i";
  }
  /*
#include<iostream>
using namespace std;
struct complex
{
  int real, img;
};

int main()
{
  int choice, x, y, z;
  struct complex a, b, c;
  int ch;
  cin>>ch;
  cin>>a.real>>a.img>>b.real>>b.img;
  switch(ch)
  {
      
   case 1: c.real = a.real + b.real;
      c.img = a.img + b.img;
      if (c.img >= 0)
        cout<<c.real<<"+"<<c.img<<"i";
      else
       cout<<c.real<<c.img<<"i";
     break;
   case 2:  c.real = a.real - b.real;
      c.img = a.img - b.img;

      if (c.img >= 0)
        cout<<c.real<<"+"<<c.img<<"i";
      else
       cout<<c.real<<c.img<<"i";
     break;
   case 3: 
      c.real = a.real*b.real - a.img*b.img;
      c.img = a.img*b.real + a.real*b.img;

      if (c.img >= 0)
         cout<<c.real<<"+"<<c.img<<"i";
      else
       cout<<c.real<<c.img-128<<"i";
        
     break;
   default: cout<<"Invalid choice";
  }

  }*/