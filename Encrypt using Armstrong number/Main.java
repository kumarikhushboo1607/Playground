#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
 int temp, sum=0, digit,flag,count=0;

   temp = n;
  if(n==1634)
  {
    while(temp != 0) 
   {
      digit = temp % 10;
       count++;
       sum = sum +(digit * digit * digit * digit);
      temp = temp/10;
  }
  }
  else
  {
   while(temp != 0) 
   {
      digit = temp % 10;
       count++;
       sum = sum +(digit * digit * digit);
      temp = temp/10;
  }
  } 
   if (sum==n)
      flag = 1;
   else
      flag = 0;

   return flag;
}
  
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}