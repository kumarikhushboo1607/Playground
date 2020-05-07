
  #include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int totalballs,totalruns,runsscored,ballsbowled,overs,a;
  float oversbowled,crr,trr,b;
  cin>>totalballs;
  cin>>totalruns;
  cin>>runsscored;
  cin>>ballsbowled;
  overs=totalballs/6;
  a=ballsbowled/6;
  b=ballsbowled%6;
  b/=10;
  oversbowled=a+b;
  crr=runsscored/oversbowled;
  trr=totalruns/50.0;
  cout<<overs<<"\n"<<oversbowled<<"\n";
  cout<<fixed<<setprecision(1)<<crr<<"\n";
  cout<<fixed<<setprecision(1)<<trr<<"\n";
  if(crr>trr)
  cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}
