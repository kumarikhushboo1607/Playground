#include<iostream>
using namespace std;
int main()
{
  int a,b,c,ch;
  cout<<"Enter first number : ";
  cin>>a;
  cout<<"Enter second number : ";
  cin>>b;
  cout<<"Menu";
  cout<<"\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  cin>>ch;
  switch(ch)
  {
    case 1: c=a+b;
      cout<<c;
      break;
      case 2: c=a-b;
      cout<<c;
      break;
      case 3: c=a*b;
      cout<<c;
      break;
      case 4: c=a/b;
      cout<<c;
      break;
      case 5: c=a%b;
      cout<<c;
      break;
    default: cout<<"Invalid operation";
      break;
  }
}
  
  