def classificar_triangulo(lado_a, lado_b, lado_c):
    if lado_a == lado_b == lado_c:
        print("Equilátero.")
    elif lado_a == lado_b or lado_a == lado_c or lado_b == lado_c:
        print("Isósceles.")
    else:
        print("Escaleno.")

lado_a = float(input("Digite o comprimento do lado a: "))
lado_b = float(input("Digite o comprimento do lado b: "))
lado_c = float(input("Digite o comprimento do lado c: "))

classificar_triangulo(lado_a, lado_b, lado_c)