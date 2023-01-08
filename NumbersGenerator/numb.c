#include <stdio.h>
#include <time.h>

int main(){
    long start = time(NULL);
    int count = 0;
    while(count<=100000){
        printf("%d\n", count);
        count++;
    }
    long end = time(NULL);
    int time = (end-start); 

    printf("\nCurrent time: %d seconds.", time);
    return 0;
}