Adicionar elementos em coleções Set
Listar elementos em coleções Set
Adicionar elementos em coleções List
Listar elementos em coleções List
Adicionar elementos em coleções Map
Listar elementos em coleções Map

Nesse exercício o objetivo é elaborar um sistema de criação de um Blog e gerenciar suas postagens.

O Blog possui uma lista de postagens Post.

Um Post contém autor, titulo, corpo, categoria, todos atributos do tipo String

Na classe Blog, criar os métodos:

adicionarPostagem: recebe uma postagem e adiciona a lista de postagens.
obterTodosAutores: que retorna um Set com todos autores que possuem pelo menos um post no blog e deve-se retornar a lista de autores ordenados pelo nome.
obterContagemPorCategoria: que retorna um Map onde a chave é o nome da categoria, o valor é a quantidade de postagens daquela categoria, deve-se retornar os conjuntos ordenados pelo nome da categoria


Faça uma cópia dos arquivos do exercício anterior e faça as seguintes modificações:

Crie a classe Autor, com o atributo nome e sobrenome. Sobrescreva o método toString para retornar <nome> <sobrenome>
Crie o enum Categorias, com os valores DEVOPS, DESENVOLVIMENTO e DATA_SCIENCE

Sobrescreva toString da classe Post para retornar <titulo>

Modifique a classe Blog da seguinte forma:

Modifique o método obterTodosAutores: deve retornar Set do tipo Autor
Modifique o método obterContagemPorCategoria: deve retornar Map porém chave deve ser um enum Categorias ao invés de String, não é mais necessário retornar em ordem pelo nome da categoria
Modifique o método adicionarPostagem: deve verificar se postagem já foi adicionada, essa comparação deve ser feita da seguinte forma: mesmo autor com mesmo título, se já houver, deve lançar uma exceção com mensagem Postagem jah existente
Acrescente o método obterPostsPorAutor: recebe um autor como parâmetro e retorna um Set de posts daquele autor, deve-se retornar os posts ordenados pelo título
Acrescente o método obterPostsPorCategoria: recebe uma categoria como parâmetro e retorna um Set de posts daquela categoria, deve-se retornar os posts ordenados pelo título
Acrescente o método obterTodosPostsPorCategorias: retorne uma Map que a chave seja Categorias e o valor seja um Set com todos posts daquela categoria
Acrescente o método obterTodosPostsPorAutor: retorne uma Map que a chave seja Autor e o valor seja um Set com todos posts daquela categoria
DICA: Implemente a interface Comparable nas classes Post e Autor.
