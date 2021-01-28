# nearby_locations

Este serviço recebe uma coordenada de local e devolve, de forma ordenada por menor distancia, 3 estabelecimentos cujo raio de distanica esteja compreendido dentro do valor máximo em relação ao local de paramentro.

O calculo será realizado da seguinte forma:

A distancia entre o local de parametro(A) e os estabelecimentos próximos (B) é obtida pela diferença na subtração das coordenadas X e Y de ambas.

Estabeleço um valor máximo para as coordenadas X e Y, que neste caso será [100,100]. Vou buscar todos os locais cujos valores de coordenadas sejam iguais ou menores a [100,100] e maiores que zero.

Recebo a matriz [ [40,88],[18,56], [99,2]]

Supondo que o local de referencia tenha as coordenadas Xa e Xa, respectivamente [25,30], que primeiro estabelecimento tenha as coordenadas Xb e Yb [40,88] e o segundo tenha as coordenadas Xc e Yc [18,56]. 

Com estes dados, vou acessar a primeira posição (0) da matriz, calcular a diferença entre Xa e Xb, a diferença entre Ya e Yb e salvar este valor (DAB - diferença entre A e B). Vou salvar as coordenadas [40,88] em outra matriz.

Depois, vou realizar a mesma operação para calcular a diferença entre Xa e Xc, a diferença entre Ya e Yc e salvar o valor desta diferença na variável DAC. Se o valor de DAC foi menor que DAB, eu reordeno a matriz, deixando as coordenadas Xc e Yc na posição 0 e as coordenadas Xb e Yb na posição 1. Se DAC for maior que DAB, eu mantenho as coordenadas Xb e Yb na posição 0 da matriz e salvo as coordenadas Xc e Yc na posição 1.

Obtendo um terceiro valor de coordenadas, que seriam Xd e Yd, eu primeiro comparo se DAD é maior que DAC. Se for, salvo na segunda posição da matriz e em seguida, já exibo seu resultado na tela. Caso DAD seja menor que DAC, eu reordeno a matriz, deixando DAC na segunda posição da matriz, DAD na primeira e, a seguir, comparo DAD com DAB, repetindo o processo feito anteriormente de reordenação. A seguir, retorno a matriz reordenada.

Este metodo de ordenação utilizando é o Isertion Sort. O escolhi porque sempre vou precisar comparar e reordenar a ultima entrada com os valores já salvos.
