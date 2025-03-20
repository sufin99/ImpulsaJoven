lst = ["sipollo", "lol", "si", "sipollo"]

strr = str(input(f"Introduce una palabra que este aquí ({lst}): "))
count = 0
for l in lst:
    if (l == strr):
        count += 1

print(f"La palabra sale {count} veces")