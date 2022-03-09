# Revisão
## Aquecimento 

---
1) Faça um programa que leia 2 números e imprima todos os números inteiros existentes entre esses dois números (lembre-se que o usuário pode informar o maior número primeiro).

---
2) Faça um programa que leia um número inteiro e que imprima sua tabuada de multiplicar. Por exemplo, para o número 5: 
```
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50 
```
---
3) Faça um programa que leia um vetor com 5 elementos inteiros. Solicite ao usuário que informe um novo número, e verifique se este número encontra-se no vetor. Caso positivo, imprima a(s) posição(ões) em que este número estiver no vetor. Caso contrário, exiba uma mensagem ao usuário informando que o número não se encontra no vetor.
---
4) Faça um programa que solicite ao usuário que informe inicialmente os 6 números sorteados na Mega Sena. Em seguida, peça que ele digite os 6 números do cartão que jogou. Imprima a quantidade de pontos que ele fez no concurso.

## Orientação a Objetos

### Package retangulo
- Criar uma classe **RetanguloEstruturada.java** para calcular e apresentar a área e o perímetro de um retângulo
- A partir do mesmo problema, criar a Classe **Retângulo.java** utilizando o paradigma da orientação a objetos.
- Criar a classe **TesteRetângulo.java** para testar a classe Retangulo.

### Package data

Criar a classe **Data.java** para armazenar internamente Dia, Mês e Ano

- Não permita atribuição direta de valores para anos. Só aceitar valores positivos acima do ano 1900 e abaixo de 9999
- Não permita atribuição direta de valores para meses. Só aceite valores positivos entre 1 e 12
- Não permita atribuição direta de valores para dias. Só aceita valores positivos entre 1 e 31.
- Implementar um método set e um get para cada atributo

Criar 4 construtores:
- Sem nenhuma informação passada (a data padrão será 1/1/1900)
- Passando somente o dia (a data padrão será data/1/1900)
- Passando somente o dia e o mês (a data padrão será data/mes/1900)
- Passando dia, mês e ano (a data padrão será data/mes/ano)
- Criar um método que retorne uma string contendo uma data no formato dia/mês/ano

Finalmente criar uma classe **TesteData.java** para realizar os respectivos testes na classe **Teste.java**

### Package time

Criar a classe Time para armazenar internamente Hora, Minutos e Segundos.

- Não permita atribuição direta e só aceitar valores válidos (0-23 ou 0-59)
- Implementar um método set e um get para cada atributo

Criar 4 construtores:
- Sem nenhuma informação passada (o time padrão será 0:0:0)
- Passando somente a hora inicial (o time padrão será hora:0:0)
- Passando somente a hora e minutos iniciais (o time padrão será hora:minutos:0)
- Passando a hora, minutos e segundos iniciais (o time padrão será hora:minutos:segundos)
- Criar um método que retorne uma string contendo uma hora no formato hh:mm:ss