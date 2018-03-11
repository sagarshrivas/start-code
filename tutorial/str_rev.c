#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
#include<string.h>
int main(int args,char *argv[]){
	char *s=argv[1];
	int i,j;
	 for (i = 0, j = len - 1; i < j; i++, j--) {
           char c = str[i];
           str[i] = str[j];
           str[j] = c;
       }
	printf("string is: %s\n",s);
	
	while(i!=strlen(s)){
		printf("%c",*(argv[1]+i));
		i++;
	}
	return 0;
}
	


