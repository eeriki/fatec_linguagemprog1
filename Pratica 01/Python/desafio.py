print(" --- Simulador Financeiro (Python) --- ")

# Entradas
ganho = int(input("Informe o Ganho: "))
investimento = int(input("Informe o investimento: "))

#bloqueio para evitar erro no calculo
if investimento == 0:
    print("Investimento não pode ser igual a 0")
    exit()

#processamento
roi = ((ganho - investimento) / investimento) * 100
print(f'Resultado: {roi}')