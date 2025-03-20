num = int(input("Introduce un número: "))

print("Su tabla de multiplicar es: ")
for count in range(1, 11):
    print(f"{num} x {count} = {num * count}")
    count += 1