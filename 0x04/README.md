Escreva uma classe Java com as seguintes características:

A classe deve se chamar PersonagemGame
Deve possuir um atributo público chamado saudeAtual
Deve possuir um atributo público chamado nome
saudeAtual deve ser int
nome deve ser String

Escreva uma classe Java com as seguintes características:

A classe deve se chamar PersonagemGame
Deve possuir um atributo privado chamado saudeAtual
Deve possuir um atributo privado chamado nome
Deve possuir os métodos getters e setters para ambos atributos:
public int getSaudeAtual()
public void setSaudeAtual(int saudeAtual)
public String getNome()
public void setNome(String nome)


Faça uma cópia do arquivo PersonagemGame.java do exercício anterior e faça as seguintes mudanças:

Crie um método público tomarDano que recebe um parâmetro int chamado quantidadeDeDano
O método tomarDano deve diminuir a quantidade de saúde atual do personagem subtraindo a quantidade de dano tomada.
O método tomarDano deve considerar que a saúde mínima do personagem é 0
Crie um método público receberCura que recebe um parâmetro int chamado quantidadeDeCura
O método receberCura deve aumentar a quantidade de saúde atual do personagem somando a quantidade de cura recebida.
O método receberCura deve considerar que a saúde máxima do personagem é 100


Faça uma cópia do arquivo PersonagemGame.java do exercício anterior e faça as seguintes mudanças:

Crie um atributo privado chamado status do tipo String.
Modifique o método setter de saude do personagem de forma que:
se saude atual for maior que 0 então status deve possuir valor "vivo"
se saude atual for 0 então status deve possuir valor "morto"
Modifique os métodos tomarDano e receberCura para que ao invés de modificar diretamente o valor de saude atual utilize o métodos setter, dessa forma, a lógica de status ficará em um ponto só.
Crie um método getter para o atributo status, não é necessário um método setter já que o atribuito é apenas de leitura (read-only).



O intuito desse exercício é mantermos os dados do personagem sempre consistentes, ou seja, não devemos aceitar que algum programa possa criar um personagem e depois modificar o personsagem de forma que esse fique em um estado inconsistente. Um personagem inconsistente é:

Não possua um nome, ou um nome inválido.
Não possua uma saúde atual inválida.
Não possua um status válido.

Faça uma cópia do arquivo PersonagemGame.java do exercício anterior e faça as seguintes mudanças:

Crie um construtor que receba um valor int para sua saúde atual inicial e um valor String para seu nome inicial, respectivamente. Dessa forma o personagem será criado consistente, ou seja, com um nome e com uma saúde atual.
Utilize o método setter de saúde atual no construtor, assim o status do personagem também possuirá um valor inicial conforme sua saúde atual.
Modifique o método setter de nome para que não aceite valor nulo ou string vazia, se este receber algum desses valores como parâmetro, deve-se manter o nome como está.

