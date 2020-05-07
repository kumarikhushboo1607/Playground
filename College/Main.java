#include<iostream>
#include<cstring>
#include<iomanip>
using namespace std;

struct student
{
  char name[100];
  char city[100];
  int year;
  float cgpa;
};
int main()
{
  struct student s[1000];
  struct student t;
  int n,i,j,k=1;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>s[i].name>>s[i].city>>s[i].year>>s[i].cgpa;
  }
   cout<<"Enter the number of colleges"<<"\n";
  for(i=0;i<n;i++)
  {
 
  cout<<"Enter the details of college "<<i+1<<"\n";
  cout<<"Enter name"<<"\n";
  cout<<"Enter city"<<"\n";
  cout<<"Enter year of establishment"<<"\n";
  cout<<"Enter pass percentage"<<"\n";
  }
  cout<<"Details of colleges"<<"\n";
   for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(strcmp(s[i].name,s[j].name)>0)
      {
        t=s[i];
        s[i]=s[j];
        s[j]=t;
      }
    }
  }
  for(i=0;i<n;i++)
  {
    cout<<"College:"<<k<<"\n";
    cout<<"Name:"<<s[i].name<<"\n";
    cout<<"City:"<<s[i].city<<"\n";
    cout<<"Year of establishment:"<<s[i].year<<"\n";
    cout<<"Pass percentage:"<<setprecision(4)<<s[i].cgpa<<"\n";
    k++;
  }
  }

