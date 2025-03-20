dic = {}

strr = str(input("Introduce una palabra: "))
count = 0
for i in strr:
    if (i in dic):
        dic[i] += 1
    else:
        dic[i] = 1

print(dic)