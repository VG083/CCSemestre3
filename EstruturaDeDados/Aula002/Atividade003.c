#include <stdio.h>

int main(){
	
	
	for(;;){
		int *p = (int*) malloc(sizeof(int));
		printf("%p\n", p);
		free(p);
	}
	
	
	
	return 1;
}
