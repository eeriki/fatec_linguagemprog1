def verificar_numero(numero):
    if numero % 2 == 0:
        print("Par")
    else:
        print("Ímpar")

numero = int(input("Digite um número: "))
verificar_numero(numero)