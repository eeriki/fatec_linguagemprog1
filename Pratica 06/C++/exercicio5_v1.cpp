#include <iostream>
using namespace std;

int main() {
    float c;
    cout << "Digite a temperatura em Celsius: ";
    cin >> c;

    float f = (c * 9/5) + 32;
    cout << "A temperatura em Fahrenheit é: " << f;

    return 0;
}