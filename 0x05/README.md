Como organizar classes java em pacotes
O que é uma superclasse, classe base ou classe pai/mãe
O que é uma classe filha ou subclasse
Como herdar uma classe
Qual é o propósito da herança
O que é super
O que é @Override
O que são classes abstratas
O que é instanceof

Escreva uma classe vazia chamada Cachorro que herda da classe vazia Animal.

Classe Base: Animal
Classe Derivada: Cachorro


Crie uma classe chamada FormaGeométrica.

Classe: FormaGeometrica
método público: public double area()
Lance uma exceção java.lang.UnsupportedOperationException com a mensagem “Funcao area nao implementada”


Baseado no exercício anterior, escreva uma classe Retangulo que herda da classe FormaGeometrica.

Classe: Retangulo
atributo privado: private double largura
atributo privado: private double altura
métodos acessores (getters/setters) de largura:
getLargura: retorna o valor de largura
setLargura: se valor for negativo, lançar exceção java.lang.IllegalArgumentException com a mensagem Largura deve ser maior ou igual a 0, senão atribua o valor de largura.
métodos acessores (getters/setters) de altura:
getAltura: retorna o valor de altura
setAltura: se valor for negativo, lançar exceção java.lang.IllegalArgumentException com a mensagem Altura deve ser maior ou igual a 0, senão atribua o valor de altura.


Baseado no exercício anterior, escreva uma classe Retangulo que herda da classe FormaGeometrica.

Faça uma cópia da classe Retangulo e adicione:
método público: public double area()
Esse método será sobrescrita (override) do método area() definido na super classe FormaGeometrica, inclua o cálculo de área de uma retângulo.
método público: public String toString()
returna a string [Retangulo] <largura> / <altura>, utilize String.format para formatar o retorno


Baseado no exercício anterior, escreva uma classe Quadrado que herda da classe Retangulo.

Classe: Quadrado

atributo privado: private double lado
modifique a visibilidade dos atributos da class Retangulo de private para protected.
métodos acessores (getters/setters) de lado:
getLado: retorna o valor de lado
setLado: se valor for negativo, lançar exceção java.lang.IllegalArgumentException com a mensagem Lado deve ser maior ou igual a 0, senão atribua o valor de lado, largura e altura com o valor do parâmetro.
.toString() deve retornar [Quadrado] <lado>


Baseado no exercício anterior, modifique a classe FormaGeometrica:

Torne a classe abstract.
Torne o método area() em abstract, portanto remova sua implementação. Desta forma obrigará as classes filhas implementarem tal função.


