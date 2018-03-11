#include <stdio.h>
#include <string.h>

int main()
{
	int i=0,j=0,k=0,len=0;
	char a[30][40],b[100],temp[20];

	printf("enter string\n");
	gets(b);

	for(i=0;i<10;i++)
		for(j=0;j<30;j++)
			a[i][j]=0;
	i=0,j=0;

	for(i=0;b[i]!=0;i++){
		if(b[i]==' '){
			a[j][k]=0;
			j++;
			k=0;
		}
		else{
			a[j][k]=b[i];
			k++;
		}
	}

	for(i=0;a[i][0]!=0;i++){
		//printf("%s\n",a[i]);
		len++;
	}

	/*for(i=0;i<len-1;i++){
		for(j=i;j<len;j++){
			if(strcmp(a[j],a[i])<0){
				strcpy(temp,a[i]);
				strcpy(a[i],a[j]);
				strcpy(a[j],temp);

			}
		}
	}*/

	printf("\n______________________________________________________\n");

	for(i=0;i<len;i++){
		char b[10];
		for(int j=0,k=strlen(a[i]);a[i]!=0;j++,k--)
			b[j]=a[i][k-1];
		strcpy(a[i],b);
		
		printf("%s ",a[i])
	}
return 0;
}

