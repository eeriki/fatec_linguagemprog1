#include <iostream>
using namespace std;

float converter(float c) {
    return (c * 9/5) + 32;
}

int main() {
    float c;
    cout << "Digite a temperatura em Celsius: ";
    cin >> c;

    cout << "A temperatura em Fahrenheit é: " << converter(c);

    return 0;
}