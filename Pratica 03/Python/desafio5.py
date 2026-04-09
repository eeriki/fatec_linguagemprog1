usuario= str(input("Digite o nome de usuário: "))
senha_correta = "senha123"
senha = ""

while senha != senha_correta:
    senha = input("Digite a senha: ")

print(f"Bem-vindo, {usuario}!")