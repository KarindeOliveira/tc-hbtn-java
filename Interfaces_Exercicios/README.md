Projete um mecanismo de workflow que pegue um objeto workflow e o execute. Um workflow (fluxo de trabalho) possui uma série de etapas ou atividades. A classe MaquinaWorkflow deve ter um método chamado executar que recebe um Workflow como parâmetro e, em seguida, itera sobre cada atividade contido no workflow e os executam em sequência.

Queremos que nossos workflows sejam extensíveis, para que possamos criar novas atividades sem afetar as atividades existentes.

Devemos representar o conceito de uma atividade usando uma interface, inclua no pacote atividades. Cada atividade deve ter um método chamado executar(). A MaquinaWorkflow não se preocupa com a implementação concreta das atividades do workflow. Tudo o que importa é que essas atividades tenham uma interface comum: elas fornecem um método chamado executar. O motor simplesmente chama este método e desta forma executa uma série de atividades em sequência.

A classe Workflow deve conter um método registrarAtividade que inclui uma nova atividade no workflow.

O objetivo deste exercício é ajudá-lo a entender como você pode usar interfaces para projetar aplicativos extensíveis. Você altera o comportamento de seu aplicativo criando novas classes ao vez de alterar as classes existentes. Você também verá o comportamento polimórfico das interfaces.

Caso de uso do mundo real:

Em um aplicativo do mundo real, você pode usar um fluxo de trabalho em um cenário como o seguinte:

Carregue um vídeo para um armazenamento em nuvem. Criar a atividade CarregarVideo, executar essa atividade apresenta na saída: carregando video

Ligue para um serviço da Web fornecido por um serviço de codificação de vídeo de terceiros para informar que você tem um vídeo pronto para codificação. Criar a atividade CodificarVideo, executar essa atividade apresenta na saída: codificando video

Envie um e-mail para o proprietário do vídeo notificando-o de que o vídeo começou a ser processado. Criar a atividade EnviarEmail, executar essa atividade apresenta na saída: enviando email com video

Altere o status da gravação de vídeo no banco de dados para “Processando”. Criar a atividade ModificarStatusVideo, executar essa atividade apresenta na saída: modificando status do video

Cada uma dessas etapas pode ser representada por uma atividade. Cada atividade deve estar no pacote atividades. Para os propósitos deste exercício, não se preocupe com essas complexidades. Simplesmente use System.out.println em cada uma de suas classes de atividade. Seu foco deve ser enviar um fluxo de trabalho para o mecanismo de fluxo de trabalho e fazer com que ele execute o fluxo de trabalho e todas as atividades dentro dele. Não nos importamos com as atividades reais.


Nesse exercício calcularemos o valor de frete de um pedido baseado nos vários serviços frete que nosso sistema dá suporte.

Para isso criaremos uma interface ProvedorFrete, pacote provedores:

Criar método calcularFrete(double peso, double valor) que retorna um objeto do tipo Frete, teremos os seguintes provedores de frete, também pacote provedores:
Classe Sedex: o valor do frete é 10% do valor total do pedido, se peso passar de 1kg, senão o valor é 5% do valor do pedido
Classe JadLog: o valor do frete é 7% do valor total do pedido, se peso passar de 2kg, senão o valor é 4,5% do valor do pedido
Classe Loggi: o valor do frete é 12% do valor total do pedido, se peso passar de 5kg, senão o valor é 4% do valor do pedido

Criar método obterTipoProvedorFrete() que retorna o TipoProvedorFrete daquele provedore de frete.


Deve-se criar o enum TipoProvedorFrete, com os valores SEDEX, JADLOG, LOGGI, também no pacote provedores

Deve-se criar a classe Frete no pacote provedores

Possui os atributos valor e tipoProvedorFrete (do tipo TipoProvedorFrete)

Deve-se criar a classe Pedido

Possui os atributos codigo, peso, total e frete (do tipo Frete)

Deve-se criar a classe ProcessadorPedido

Possui um atributos provedorFrete do tipo ProvedorFrete
Crie um construtor que receba qual é o provedor de frete (do tipo ProvedorFrete) que será utilizado para processar pedidos
Crie o método processar que recebe um pedido como parâmetro, esse método deve preencher o atributo frete do pedido atráves da chamada de calcularFrete do provedor de frete do processador de pedido.

NOTA: campo peso deve conter peso em gramas.

