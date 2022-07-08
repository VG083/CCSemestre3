#include<stdio.h>

void somar(int *x, int *y){
	(*x)++;
	(*y)++;
}

int main(){
	
	int x = 1, y=2;
	
	somar(&x,&y);
	
	printf("x - %d\n", x);
	printf("y - %d\n", y);
	return 1;
}
