print("Advinhe o número com 'while' em Python!")
numero_secreto = 7
numero_digitado = 0

while numero_digitado != numero_secreto:
    numero_digitado = int(input("Digite um número: "))
    if numero_digitado != numero_secreto:
        print("Número incorreto. Tente novamente.")

print("Parabéns! Você acertou!")    