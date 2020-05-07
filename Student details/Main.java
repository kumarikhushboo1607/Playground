#include<iostream>
#include<cstring>
#include<iomanip>
using namespace std;

struct student
{
  char name[20];
  char department[20];
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
    cin>>s[i].name>>s[i].department>>s[i].year>>s[i].cgpa;
  }
  cout<<"Enter the number of students"<<"\n";
  for(i=0;i<n;i++)
  {
  cout<<"Enter the details of student "<<i+1<<"\n";
  cout<<"Enter name"<<"\n";
  cout<<"Enter department"<<"\n";
  cout<<"Enter year of study"<<"\n";
  cout<<"Enter cgpa"<<"\n";
  
  }  
  cout<<"Details of students"<<"\n";
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
    cout<<"Student "<<k<<"\n";
    cout<<"Name:"<<s[i].name<<"\n";
    cout<<"Department:"<<s[i].department<<"\n";
     cout<<"Year of study:"<<s[i].year<<"\n";
     cout<<"CGPA:"<<setprecision(3)<<s[i].cgpa<<"\n";
    k++;
  }
  }

