def gerar_msg_boas_vindas(nome, idade):
    print (f"Bem-vindo {nome}, você tem {idade} anos!")

nome = str(input("Digite seu nome: "))
idade = int(input("Digite sua idade: "))

gerar_msg_boas_vindas(nome, idade)