def validar_senha(senha):
    while len(senha) < 8:
        senha = input("Digite a senha: ")
    print("Senha válida!")

senha = ""
validar_senha(senha)