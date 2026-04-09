def contar_vogais(texto):
    contador = 0
    for letra in texto:
        if letra in "aeiou":
            contador += 1
    print("Vogais: ", contador)

texto = str(input("Digite uma frase ou palavra: ")).lower()
contar_vogais(texto)
