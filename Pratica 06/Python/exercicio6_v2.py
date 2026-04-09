def aplicar_desconto(valor, desc):
    final = valor - (valor * desc / 100)
    print(f"O valor final do produto é: R$ {final:.2f}")

valor = float(input("Digite um valor do produto: "))
desc = float(input("Digite o valor do desconto (%): "))

aplicar_desconto(valor, desc)