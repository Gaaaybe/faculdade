def func(nbr1, nbr2, nbr3):

    if nbr1 > nbr2 > nbr3:
        return f'{nbr1} > {nbr2}> {nbr3}'
    elif nbr1 > nbr3 > nbr2:
        return f'{nbr1} > {nbr3}> {nbr2}'
    elif nbr2 > nbr1 > nbr3:
        return f'{nbr2} > {nbr1}> {nbr3}'
    elif nbr2 > nbr3 > nbr1:
        return f'{nbr2} > {nbr3}> {nbr1}'
    elif nbr3 > nbr1 > nbr2:
        return f'{nbr3} > {nbr1}> {nbr2}'
    elif nbr3 > nbr2 > nbr1:
        return f'{nbr3}> {nbr2}> {nbr1}'
    else:
        return 'não digite tudo igual não.'


number_1 = int(input('Digite um número: '))
number_2 = int(input('Digite um número: '))
number_3 = int(input('Digite um número: '))

print(func(number_1, number_2, number_3))