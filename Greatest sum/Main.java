/* C++ program to find the sum of elements in each row and each column of the given matrix and print the greatest of the same */
#include<iostream>
using namespace std;


int main()
{
    int m, n, row, col, sum = 0, row_ind = 0, col_ind = 0;
    //cout << "\nEnter the order of the matrix : ";
    cin >> m >> n;
    int row_arr[m];
    int i, j;
    int mat[m][n];
   // cout << "\nInput the matrix elements : \n";
    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++)
            cin >> mat[i][j];
    }

    int z = 0;

    cout << "Sum of rows is ";
    for(row=0; row<m; row++)
    {
        sum = 0;
        for(col=0; col<n; col++)
        {
            sum += mat[row][col];
        }
        cout << sum << " ";
        row_arr[z++] = sum;
    }
    cout << endl;
    int temp_row = row_arr[0];
    for(i=1;i<m;i++)
    {
        if(temp_row < row_arr[i])
        {
            temp_row = row_arr[i];
            row_ind = i;
        }
    }
    cout << "Row " << row_ind + 1 << " has maximum sum "<<"\n";
    //cout << endl;
    cout << "Sum of columns is ";
    sum = 0;
    int y = 0;
    int col_arr[n];
    for (i = 0; i < n; ++i)
    {
        sum = 0;
        for (j = 0; j < m; ++j)
        {
            sum = sum + mat[j][i];
        }
        cout << sum << " ";
        col_arr[y++] = sum;
    }
    int temp_col = col_arr[0];
    for(i=1;i<n;i++)
    {
        if(temp_col < col_arr[i])
        {
            temp_col = col_arr[i];
            col_ind = i;
        }
    }
    //cout << endl;
    cout << "\nColumn " << col_ind + 1 << " has maximum sum "<<"\n";
    //cout << endl;
    return 0;
}




/*#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,rowsum,colsum;
  int rowind=0,colind=0;
  int row[r];
  int col[c];
  int y,z;
  cin>>r>>c;
  int a[20][20];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
    
}
   cout<<"Sum of rows is"<<" ";
  for(i=0;i<r;i++)
  {
   rowsum=0; 
    for(j=0;j<c;j++)
    {
      rowsum+=a[i][j];
    
    }
 cout<<rowsum<<" ";
    row[z++]=rowsum;
  }
  cout<<"\n";
  int tempr=row[0];
  for(i=1;i<r;i++)
    {
        if(tempr< row[i])
        {
            tempr = row[i];
            rowind = i;
        }
    }
    cout<<"Row"<<" "<<rowind+1<<" "<<"has maximum sum"<<"\n";

cout<<"Sum of columns is"<<" ";
  for(j=0;j<c;j++)
  {
    colsum=0;
    for(i=0;i<r;i++)
    {
      colsum+=a[i][j];
    
    }
  cout<<colsum<<" ";

}
  cout<<"\n";
   int tempc=col[0];
  for(i=1;i<c;i++)
    {
        if(tempc< col[i])
        {
            tempc = col[i];
            colind = i;
        }
    }
    cout<<"Column"<<" "<<colind+1<<" "<<"has maximum sum"<<"\n";
}
*/

