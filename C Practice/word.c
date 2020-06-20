#include<stdio.h>
#include<string.h>
int main(){

	char s[20];
	int number=0,d=0,c=0,digit;
	char v[100],con[100];


	

    fgets(s,20,stdin);
	printf("%s\n",s );


	char vowels[] ={'A','E','I','O','U'};

	for(int i=0;i<strlen(s);i++){

		printf("%c\n",s[i]);



		if(s[i]>='0' && s[i]<='9' ){

			digit=s[i]-'0';

			number=number*10+digit;




		}


	}



	for (int k = 0; k<strlen(s); k++)
	{
		

	

				if ( s[k] == 'A' ||  s[k] == 'E' || s[k] == 'I' || s[k]=='O' || s[k] == 'U')
				{



					v[d]=s[k];
					d++;

			

			}else if ( !(s[k]>='0' && s[k]<='9' )) {

				con[c]=s[k];
					c++;
			}

		}








	printf("vowels:\n");

	printf("%s\n",v );

	printf("Consonents :\n");
	printf("%s\n",con);
	printf("numbers:\n");
	printf("%d\n",number );

	printf("vowels followed by Consonents:\n");

	strcat(v,con);

	printf("%s\n",v );







}