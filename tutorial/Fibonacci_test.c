#include<stdio.h>
#include<stdlib.h>
int main(int argc,char *argv[]){
    int a=0,b=1,next=0;
    int n=atoi(argv[1]);
    if(argc>=2)
		do{
			printf("%d ",next);
			next=a+b;
			a=b;
			b=next;
			
		}while(--n);
	else{
		printf("no correct arguments are inserted");
	}	
    return 0;
}
