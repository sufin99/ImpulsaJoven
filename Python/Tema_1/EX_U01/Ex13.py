print("Vamos a sumar, introduce 0 para parar los cálculos")
num = int(input("Introduce un número para sumar: "))

sum = 0
while (1):
    if (num == 0):
        break
    sum += num
    num = int(input("Introduce otro número: "))

print(f"El total de la suma es de: {sum}")