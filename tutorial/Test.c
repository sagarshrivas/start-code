#include<stdio.h>

int main(int argc,char *argv[]){
	int n;
	char *c="";
	scanf("%d",&n);
	while(n>0){
		c="abc"+c;
		n=n/2;
	}
	puts(c);
return 0;
}
