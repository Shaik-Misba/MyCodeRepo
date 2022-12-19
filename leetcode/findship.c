#include <stdio.h>

int main(void) {
	// your code goes here
	int t,v;
	v=t-1;
	scanf("%d",&t);
	while(t--)
	{
	    char ch;
	    scanf("%c",&ch);
	    if(v!=t)
	    printf("\n");
	    if(ch=='b' || ch=='B')
	    {
	        printf("BattleShip");
	    }
	    else if( ch=='C'|| ch=='c')
	    {
	        printf("Cruiser");
	    }
	    else if(ch=='d' || ch=='D')
	    {
	        printf("Destroyer");
	    }
	    else if(ch=='f' || ch=='F')
	    {
	        printf("Frigate");
	    }
	    if(t!=0)
	    {
	        printf("\n");
	    }
	}
	return 0;
}

