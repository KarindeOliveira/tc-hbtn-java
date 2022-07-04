Criar novas exceções
O porquê criar novas exceções
Como criar uma exceção checked
Como criar uma exceção unchecked
Como utilizar uma exceção definida pelo usuário


Nesse exercício o objetivo é elaborar um sistema para calcular os pagamentos dos funcionários de uma empresa.

Cada funcionário recebe um salário fixo mais um bônus.
Para funcionários que não são gerentes, o bônus é calculado a partir do desempenho de seu departamento:
recebem 10% do salário fixo caso o departamento tenha atingido sua meta.
Para funcionário que são gerentes, o bônus é calculado de forma diferente:
recebem 20% do salário fixo caso o departamento tenha atingido sua meta, mais 1% da diferença entre o resultado alcançado pelo departamento e qual era a meta do departamento.  
Devemos criar as seguintes classes:

Classe: Departamento

Possui os seguintes atributos:
valorMeta do tipo double
valorAtingidoMeta do tipo double
Criar métodos getters getValorMeta() e getValorAtingidoMeta()
Criar construtor que receba os valores de ambos atributos, respectivamente conforme ordem acima.
Criar método alcancouMeta() que retorna um valor boolean que retorna se meta foi atingida ou não.

Classe: Empregado

Possui os seguintes atributos:
salarioFixo do tipo double
Criar método getter getSalarioFixo()
Criar construtor que receba o valor do salario fixo.
Possui os seguintes métodos:
double calcularBonus(Departamento departamento), retorna o valor bônus do empregado conforme dados do empregado e do departamento.
double calcularSalarioTotal(Departamento departamento), retorna o valor do salário fixo do empregado acrescentado de seu bônus.

Classe: Gerente

Deve herdar da classe Empregado.
Deve sobrescrever o método calcularBonus.
salarioFixo do tipo double


Nesse exercício o objetivo é elaborar um sistema de livraria. Há dois tipos de livros:

Livros Comum
Livros Edição Ouro: é uma edição mais cara, neste tipo de livro aplica-se 30% do preço original do livro.
Devemos criar as seguintes classes:

Classe: AutorInvalidoException

Pacote: exceptions, arquivo deve estar contido em uma pasta exceptions
Herda de Exception
Crie construtor que receba mensagem

Classe: LivroInvalidoException

Pacote: exceptions, arquivo deve estar contido em uma pasta exceptions
Herda de Exception
Crie construtor que receba mensagem

Classe: Livro

Contém os seguintes atributos:
titulo
autor
preco
Contém construtor que recebe todos atributos, respectivamente conforme lista acima.
Contém métodos acessores para cada um dos atributos.
Métodos setters devem aplicar restrições de forma que lance exceção se alguma for violada:
Nome do autor deve possuir pelo menos dois nomes, senão Nome de autor invalido - Exceção: AutorInvalidoException.
Título do livro deve possuir pelo menos 3 caracteres, senão Titulo de livro invalido - Exceção: LivroInvalidoException.
Preço do livro deve ser maior que 0, senão Preco de livro invalido - Exceção: LivroInvalidoException.

Classe LivroEdicaoOuro

Herda da classe Livro
Deve sobrescrever o método getPreco() para aplicar 30% de acrescimo ao preço do livro.

Crie as seguintes classes:

Classe: OperacaoInvalidaException

Pacote: exceptions, arquivo deve estar contido em uma pasta exceptions
Herda de Exception
Crie construtor que receba mensagem

Classe: ContaBancariaBasica

contém os seguintes atributos privados:
numeracao do tipo String, é a numeração única que identifica a conta.
saldo do tipo double, é o saldo atual da conta.
taxaJurosAnual do tipo double, é o percentual de juros anual.
apenas inclua métodos getters para cada um dos atributos.
inclua um construtor que receba valores para numeracao e taxaJurosAnual. Inicia saldo igual a 0.
contém os seguintes métodos:
void depositar(double valor):
verifica se valor é maior que zero, senão deve lançar exceção OperacaoInvalidaException, mensagem: Valor para deposito deve ser maior que 0
acrescenta valor ao saldo
void sacar(double valor):         - verifica se valor é maior que zero, senão deve lançar exceção OperacaoInvalidaException, mensagem: Valor de saque deve ser maior que 0
verifica se possui saldo o suficiente na conta, se não deve lançar exceção OperacaoInvalidaException, mensagem: Valor de saque deve ser menor que o saldo atual
diminui valor do saldo
double calcularTarifaMensal():
método que calcula a tarifa cobrada mensalmente pelo banco.
banco cobra R$ 10,00 ou 10% do saldo atual da conta, é utilizado aquele que der o valor menor.
double calcularJurosMensal():
método que calcula o valor em R$ do juros mensal a ser aplicado ao saldo da conta.
taxa de juros é 0 quando a conta possui saldo negativo.
void aplicarAtualizacaoMensal():
reajusta o saldo da conta subtraindo a tarifa mensal e adicionando o valor de juros mensal.

Com base no exercício anterior, crie as seguintes classes:

Classe: ContaBancariaControlada

herda da classe ContaBancariaBasica
contém os seguintes atributos privados:
saldoMinimo do tipo double, é o saldo mínimo que conta deve ter para não ser taxada.
valorPenalidade do tipo double, é o valor de penalidade a aplicar à conta em que o saldo esteja abaixo do saldo mínimo.
crie construtor que receba todos valores recebidos pela super classe acrescentado de saldoMinimo e valorPenalidade.
sobrescreva o método aplicarAtualizacaoMensal para além de reajustar o saldo da conta subtraindo a tarifa mensal e adicionando o valor de juros mensal também aplicar a penalidade caso o saldo esteja abaixo do saldo mínimo.
Classe: ContaBancariaTarifada

herda da classe ContaBancariaBasica
contém os seguintes atributos privados:
quantidadeTransacoes do tipo int, é a quantidade de transações efetudas na conta, seja saque o depósito.
sobrescreva os métodos sacar e depositar para aplicar uma tarifa de R$ 0.10 por transação. Dica: invoque os métodos da super classe, depois desconte a tarifa.
crie método getter para quantidadeTransacoes.



