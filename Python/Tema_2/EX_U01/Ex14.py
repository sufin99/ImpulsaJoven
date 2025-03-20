week = (
    "lunes",
    "martes",
    "miércoles",
    "jueves",
    "viernes",
    "sábado",
    "domingo"
)

strr = str(input("Introduce un día de la semana: "))

flag = 0
for i in week:
    if (i == strr):
        print("Si existe ese día")
        flag = 1

if (flag != 1):
    print("No existe ese día")