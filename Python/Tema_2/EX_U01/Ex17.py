conj1 = {3, 6, 2, 8}
conj2 = {4, 7, 9, 2}

c1_and_c2 = conj1.intersection(conj2)
if (c1_and_c2 == set()):
    print("No hay ningún número en común")
else:
    print(f"Los números en común son: {c1_and_c2}")