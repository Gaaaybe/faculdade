nota = int(input('Digite uma nota: '))
v = 1
for i in range(0,11):
    if nota > 10:
        v = 'invalido'
if v == 'invalido':
    print('invalido')
else:
    print('valido')
