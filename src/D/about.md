*Esse é o princípio **pai da flexibilidade de software**, ele nos guia a deixar os componentes o **mais flexíveis** possível utilizando as práticas de **abstração**.*

***“É preferível depender de abstrações ao invés de implementações concretas”***

“high level modules should not depends low level modules, BOTH SHOULD DEPEND ABSTRACTION”

**Benefícios** do DIP:

- **Redução de Acoplamento**: Ao depender de abstrações (interfaces) em vez de implementações concretas, o código se torna menos acoplado, facilitando a substituição ou atualização de partes específicas do sistema sem impacto significativo.

- **Facilidade de Testes**: Com o DIP, é mais simples injetar dependências simuladas (mocks ou stubs) em testes unitários, o que possibilita testar componentes de forma isolada.

- **Extensibilidade**: Como o código depende de abstrações, fica mais fácil adicionar novos comportamentos implementando novas classes que seguem a mesma interface, sem precisar alterar o código existente.

- **Reutilização de Componentes**: Interfaces bem definidas promovem a reutilização de componentes, permitindo que as implementações sejam utilizadas em diferentes contextos e aplicações.

- **Manutenção e Leitura**: O código orientado por interfaces é geralmente mais fácil de manter e entender, pois as dependências ficam explícitas. Esse tipo de estrutura modularizada e clara permite que a equipe de desenvolvimento gerencie as responsabilidades e mudanças com maior facilidade.