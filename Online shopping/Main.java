#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as,totalf,totals,totala;
  cin>>fa;
  cin>>fd;
  cin>>fs;
  cin>>sa;
  cin>>sd;
  cin>>ss;
  cin>>aa;
  cin>>ad;
  cin>>as;
  totalf=fa-(fa*(fd/100.0))+fs;
  totals=sa-(sa*(sd/100.0))+ss;
  totala=aa-(aa*(ad/100.0))+as;
  cout<<"In Flipkart"<<" "<<"Rs."<<totalf<<"\n";
    cout<<"In Snapdeal"<<" "<<"Rs."<<totals<<"\n";
    cout<<"In Amazon"<<" "<<"Rs."<<totala<<"\n";
    if(totalf<=totals && totalf<totala)
      cout<<"He will prefer Flipkart";
  else if(totals<totalf  && totals<totala)
      cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}
    
  
