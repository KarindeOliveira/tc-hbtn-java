Quais são as diversas coleções disponíveis no Java
Quais são as diferenças entre List, Set e Map
Quando utilizar List
Quando utilizar Set
Quando utilizar Map
Como utilizar classe Collections
Manipular dados de uma coleção
Como ordernar dados de uma coleção
O que são as interfaces java.lang.Comparable e interface java.util.Comparator
Quando utilizar método equals e hashCode
Iterar por itens de uma coleção


Crie a classe AnalisadorFrase que contenha o método estático contagemPalavras que retorne TreeMap, de forma que o elementos fiquem ordenados pela chave, com cada uma das palavras como chave e a quantidade de suas ocorrências na frase.

A contagem não deve ser case-sensitive, ou seja, uma palavra em maiúsculo deve ser considerada a mesma palavra se em outra ocorrência ela aparece em minúsculo.

Trate os caracteres especiais: ?, . e !


DICAS: Utilize split()


Crie a classe NumerosDuplicados que contenha o método estático buscar que receba um array de inteiros e retorne um TreeSet, de forma que os números fiquem ordenados, com os valores duplicados contidos nessa lista.

Utilize HashSet para descobrir quais são os valores duplicados.

Se houver mais de uma ocorrência de mesmo valor, retorne apenas 1 delas.


Crie a Classe ListaTelefonica que contém um atributo HashMap que contenha nome das pessoas como chave e seus telefones do tipo ArrayList<Telefone> como valor

Crie um construtor que inicialize o HashMap
Crie o método adicionarTelefone que recebe um nome e um telefone
Crie o método buscar que recebe um nome e retorne ArrayList<Telefone> contendo os telefones da pessoa. Se não houver a pessoa na lista, retorn null.

Crie a Classe Telefone:

Contém os atributos codigoArea e numero
Sobrescreva o método toString() para retornar o número de telefone no formato:

  `(<codigo área>) <numero>`  
  
  
  Faça uma cópia dos arquivos criado na tarefa anterior.

Modifique de ArrayList<Telefone> para HashSet<Telefone> para que não haja telefones duplicados.

Modifique o método adicionarTelefone deve retorna HashSet<Telefone>. Altere para fazer as seguintes validações:

Lançar uma exceção caso pessoa já possua telefone sendo adicionado, mensagem Telefone jah existente para essa pessoa.
Lançar uma exceção caso outra pessoa já possua telefone sendo adicionado, mensagem Telefone jah pertence a outra pessoa.

DICAS:
- Sobrescreva equals e hashCode de Telefone



