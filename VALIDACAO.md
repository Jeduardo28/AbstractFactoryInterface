# Validação local

- Aplicação executada com Java 21: as duas famílias produziram a saída esperada.
- JUnit Jupiter: 7 testes encontrados, 7 executados, 7 aprovados.
- Diagrama: nomes, métodos, implementações e dependências conferidos com os fontes.

## Limitação observada no ambiente de execução

O comando de compilação dos testes emitiu uma AccessDeniedException ao fechar
o arquivo JAR do JUnit, embora tenha retornado código zero, gerado as classes
e permitido executar os sete testes com sucesso.
Uma tentativa alternativa com o JAR extraído não resolveu a compilação neste ambiente.
A causa exata da restrição de acesso não foi determinada.

Por isso, antes da publicação, execute testar.ps1 também no terminal local do VS Code
para confirmar o comportamento fora do ambiente de execução do assistente.
