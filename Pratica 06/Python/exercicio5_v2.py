def c_para_f(c):
    f = (c * 9/5) + 32
    print(f"A temperatura em Fahrenheit é: {f}")

c = float(input("Digite a temperatura em Celsius: "))
c_para_f(c)