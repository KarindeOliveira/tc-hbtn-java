O que é um enum (tipo enumerado)?
Quando utilizar enum
Como criar enum
Como especificar valores para enums


Crie um programa que implemente um celular simples com os seguintes recursos: capaz de armazenar, modificar, remover e consultar nomes de contato.

Crie uma classe separada para Contatos (nome, número de telefone e tipo), classe Contato. Tipo do número deve ser um enum TipoNumero, com os tipos: CELULAR, COMERCIAL, CASA

Crie uma classe Celular que contém um ArrayList<Contato>.

A classe Celular tem as funcionalidades:

Obter posição na lista de contatos, método obterPosicaoContato. Recebe uma String contendo o nome do contato e retorna em qual posição da lista esse contato está, se contato não existe na lista, então retorne -1.
Adicionar novo contato, método adicionarContato. Certifique-se de verificar se o contato já existe, utilize o método obterPosicaoContato. Se já existir, lançar exceção Nao foi possivel adicionar contato. Contato jah existente com esse nome.
Atualizar um contato já existente, método atualizarContato(Contato contatoAntigo, Contato novoContato).Certifique-se de verificar:
Verificar se contato sendo alterado (contatoAntigo) existe na lista de contatos, utilize método obterPosicaoContato. Se não existir, lançar exceção Nao foi possivel modificar contato. Contato nao existe.
Verificar se já existe contato na lista de contatos o novo nome do contato (novoContato), utilize método obterPosicaoContato. Se já existir, lançar exceção Nao foi possivel modificar contato. Contato jah existente com esse nome.
Remover contato, método removerContato(Contato contato). Certifique-se de verificar se o contato existe, utilize obterPosicaoContato, se não existir, lance a exceção Nao foi possivel remover contato. Contato nao existe.
Listar contatos, método listarContatos. Deve apresentar os contatos da seguinte forma:
    Jane Doe -> 998211555 (CELULAR)
    John Bannons -> 32214332 (CASA)
    
    
    Seu trabalho é criar um aplicativo bancário simples. Implemente as seguintes classes:

Classe Banco:

Possui dois campos, uma String chamado nome e um ArrayList que contém objetos do tipo Agencia chamada agencias.
Um construtor que recebe uma String (nome do banco). Ele inicializa o nome e instancia agencias.
Deve possuir cinco métodos, são eles (suas funções estão em seus nomes):
buscarAgencia, possui um parâmetro do tipo String (nome da agência) e retorna uma Agencia. Retorna a agência se existir ou null caso contrário.
adicionarAgencia, possui um parâmetro do tipo String (nome da agência) e retorna um valor boolean. Ele retorna true se a agência foi adicionada com sucesso ou false caso contrário. Não deve incluir agência já existente, deve verificar através do método buscarAgencia.
adicionarCliente, possui três parâmetros do tipo String (nome da agência), String (nome do cliente), double (valor da transação inicial) e retorna um boolean. O cliente pertence a uma agência. Não deve incluir cliente já existente na agência, verificar através do método buscarCliente, método da classe Agencia descrito mais abaixo. Retorna true se o cliente foi adicionado com sucesso ou false caso contrário.
adicionarTransacaoCliente, possui três parâmetros do tipo String (nome da agência), String (nome do cliente), double (valor da transação) e retorna um boolean. Retorna true se a transação do cliente foi adicionada com sucesso ou false caso contrário. Verificar se cliente existe (buscarCliente) e se agência existe (buscarAgencia), não deve incluir transação se cliente ou agência não existir.
listarClientes, possui dois parâmetros do tipo String (nome da agência), boolean (imprime transações) e retorna um boolean. Retorna true se a agência existir ou false caso contrário (utilizar buscarAgencia). Este método imprime uma lista de clientes. Deve listar da seguinte forma:


Se imprime transações estiver false:
Cliente: Jane Doe [1]
Cliente: John Bannons [2]
Se imprime transações estiver true:
  Cliente: Tim [1]
    [1] valor 50.05
    [2] valor 44.22
    [3] valor 12.44
  Cliente: Mike [2]
    [1] valor 175.34
    [2] valor 1.65
Classe Agencia:

Possui dois campos, Uma String chamada nome e uma ArrayList que contém objetos do tipo Cliente chamada clientes.
Um construtor que recebe uma String (nome da agência). Ele inicializa o nome e instancia clientes.
Deve possuir cinco métodos, são eles (suas funções estão em seus nomes):
getNome, getter para nome.
getClientes, getter para clientes.
novoCliente, possui dois parâmetros do tipo String (nome do cliente), double (valor da transação inicial) e retorna um boolean. Retorna true se o cliente foi adicionado com sucesso ou false caso contrário. Deve verificar se cliente já existe através do método buscarCliente. Não deve incluir cliente que já exista.
adicionarTransacaoCliente, possui dois parâmetros do tipo String (nome do cliente), double (valor da transação) e retorna um boolean. Retorna true se a transação do cliente foi adicionada com sucesso ou false caso contrário. Deve verificar se cliente existe, através do método buscarCliente.
buscarCliente, possui um parâmetro do tipo String (nome do cliente) e retorna um Cliente. Devolva o Cliente se existir, null caso contrário.
Classe Cliente:

Possui dois campos, uma String chamada nome e um ArrayList que contém objetos do tipo Double chamada transacoes.
Um construtor que recebe um String (nome do cliente) e um double (valor da transação inicial). Ele inicializa o nome e instancia transacoes.
Deve possuir três métodos, são eles (suas funções estão em seus nomes):
getNome, getter para nome.
getTransacoes, getter para transações.
adicionarTransacao, tem um parâmetro do tipo double (valor da transação) e não retorna nada.
NOTAS: Todas as transações são depósitos.
