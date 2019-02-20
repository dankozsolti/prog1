#include <stdio.h>

int main() {

int a = 33;
int b = 42;

printf("a = %d\nb = %d\n",a,b);

b = b - a;
a = a + b;
b = a - b;

printf("Felcserélés után:\na = %d\nb = %d\n",a,b);

}
