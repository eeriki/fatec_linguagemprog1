def gerar_tabuada(numero):
    for i in range(1, 11):
        resultado = numero * i
        print(f"{numero} x {i} = {resultado}")

numero = float(input("Digite um número: "))

gerar_tabuada(numero)