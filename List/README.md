O que é ArrayList?
Qual é a diferença entre Array e ArrayList?
Quando utilizar ArrayList
Como especificar uma ArrayList que contenha apenas objetos de um tipo específico
Quais são os principais métodos para trabalhar com ArrayList?


Crie uma Classe ManipularArrayNumeros que possui os seguintes métodos estáticos:

buscarPosicaoNumero: quer recebe uma lista de inteiros e um número a ser buscado na lista. Esse método deve retornar a posicao do número na lista, se número não for encontrado retorna -1.

adicionarNumero: que recebe uma lista de inteiros e um número para ser adicionado como parâmetro. Esse método verifica se o número já existe na lista, se sim, lança uma exceção com a mensagem Numero jah contido na lista, se não, adiciona o item na lista, utilize o método buscarPosicaoNumero.

removerNumero: que recebe uma lista de inteiros e um número a ser removido da lista. Se o número não for encontrado na lista deve-se lançar uma exceção com a mensagem Numero nao encontrado na lista, utilize o método buscarPosicaoNumero.

substituirNumero: que recebe uma lista de inteiros e dois números numeroSubstituir e numeroSubstituto, deve buscar o produto e substituí-lo. Caso o número a ser substituído não exista, apenas adicione o número substituto.


Uma organização arrecada dinheiro com a venda de caixas de biscoitos. Um pedido de cookie especifica o sabor e o número de caixas encomendadas.

Classe PedidoCookie

Possui os atributos String sabor e int quantidadeCaixas.
Construtor que inicializa o valores de ambos atributos, respectivamente ao listados anteriormente.
Métodos acessores para cada uma dos atributos.

Class Pedido

Contém uma ArrayList chamada cookies de PedidoCookie
Inicialize a ArrayList no construtor
Adicione um método adicionarPedidoCookie que permita adicionar PedidoCookie a lista
Adicione um método obterTotalCaixas que calcula e retorna a quantidade de caixas totais de todos cookies encomendados.
Adicione um método removerSabor que remove da lista todas encomendas de um sabor específico. Esse método retorna a quantidade total de caixas removidas.


O objetivo desse exercício é criar uma aplicação que gerencia uma lista de TODOs (a fazeres).

Classe: Tarefa

Possui os atributos: String descricao, boolean estahFeita, int identificador
Crie um construtor que receba valors para descricao e identificador, respectivamente
Cria métodos acessores getters necessários
Crie um método modificarDescricao que modifica a descricao da tarefa
Deve-se verificar se a descrição é válida, não pode ser nula nem string vazia, senão lance uma exceção com a mensagem Descricao de tarefa invalida

Classe: ListaTodo

Possui o atributo tarefas que é uma lista de Tarefa
Crie um construtor que inicialize a lista de tarefas
Criar método adicionarTarefa, que recebe uma Tarefa a ser adicionada na lista, deve-se verificar se já há uma tarefa com o mesmo identificador, se sim, lance uma exceção com a mensagem Tarefa com identificador <identificador> ja existente na lista
Criar método marcarTarefaFeita, que recebe o identificador da tarefa. Esse método deve retornar um boolean, Percorre a lista e marca tarefa como feita:
retorna false, se tarefa com identificador passado não for encontrada.
retorna true, se foi possível marcar como feita, mesmo que tarefa já estivesse como feita.
Criar método desfazerTarefa, que recebe o identificador da tarefa. Esse método deve retornar um boolean. Percorre a lista e marca tarefa como não feita:
retorna false, se tarefa com identificador passado não for encontrada.
retorna true, se foi possível marcar como não feita, mesmo que tarefa já estivesse como não feita.
Criar método desfazerTodas, marca todos tarefas como não feitas
Criar método fazerTodas, marca todos tarefas como feitas
Criar método listarTarefas que apresenta todas as tarefas da lista da seguinte maneira:

