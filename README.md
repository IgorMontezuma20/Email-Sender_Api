API REST com Microserviços e Mensageria
Esta é uma API REST desenvolvida em Java, utilizando o Spring Boot Framework. A API segue a arquitetura de microserviços e faz uso de mensageria para comunicação entre os serviços.

Tecnologias Utilizadas
Java
Spring Boot Framework
RabbitMQ (ou outro sistema de mensageria)
Funcionalidades

A API foi desenvolvida seguindo a arquitetura de microserviços, onde cada funcionalidade é implementada como um serviço independente. Isso permite uma maior flexibilidade, escalabilidade e facilita a manutenção do sistema como um todo.

Os microserviços são responsáveis por uma única tarefa específica e se comunicam entre si por meio de chamadas de API REST e mensagens assíncronas utilizando um sistema de mensageria, como o RabbitMQ. Isso permite uma comunicação eficiente e desacoplada entre os serviços.

Mensageria
A API utiliza o RabbitMQ (ou outro sistema de mensageria) para a comunicação assíncrona entre os serviços. A mensageria é utilizada para troca de informações e eventos entre os diferentes microserviços, permitindo uma arquitetura distribuída e escalável.

As mensagens podem ser enviadas pelos serviços de forma assíncrona, garantindo uma maior eficiência e desacoplamento entre os componentes da aplicação.

Configuração e Execução
Siga os passos abaixo para configurar e executar a API em seu ambiente local:

Clone o repositório em sua máquina: git clone <URL do repositório>
Instale o Java Development Kit (JDK) versão X ou superior.
Instale o RabbitMQ (ou outro sistema de mensageria) e configure as filas e exchanges necessárias.
Configure as propriedades da API, como o acesso ao banco de dados e as filas de mensagens, no arquivo application.properties.
Execute a aplicação utilizando o comando: java -jar nome-do-arquivo.jar.
Certifique-se de ter as dependências necessárias instaladas e configuradas corretamente antes de executar a API.
