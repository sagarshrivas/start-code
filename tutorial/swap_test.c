#include<stdio.h>
#include<stdlib.h>

int main(int args,char *argv[]){
	int a=atoi(argv[1]);
	int b=atoi(argv[2]);
	printf("\na: %d,b: %d\n",a,b);
	a=(a+b)-(b=a);
	printf("\na: %d\nb: %d",a,b);
	return 0;
}
	

