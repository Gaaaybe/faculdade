import random

#Atributos
forc = +15
con = +15
sab = +16
inte = +17
des = +18

def d30():
    print('Rolando dado... ')
    num_d30 = int(random.randint(1, 30))
    return num_d30

def atacar(min, max):
    print('Rolando dado... ')
    num_atk = int(random.randint(1,20000000))
    return num_atk
...

teste_de_con = d30() + con
print(teste_de_con)
