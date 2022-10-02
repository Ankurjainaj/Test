#include<stdio.h>
int main()
{
    int i,n,sum=0;
    float avg=0;
    printf("Enter the number of terms you want to show: ");                 //enter the value of n
    scanf("%d",&n);
    for(i=0;i<n;i++)
      {
          sum+=i;
          printf("%d \t",i);
      }
    printf("the sum of all numbers is: %d",sum);
    avg=sum/n;
    printf("the average of all numbers is: %.2f",avg);
    return 0;
}