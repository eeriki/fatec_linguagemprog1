texto = str(input("Digite uma frase ou palavra: ")).lower()
contador = 0

for letra in texto:
    if letra in "aeiou":
        contador += 1

print("Vogais: ", contador)
