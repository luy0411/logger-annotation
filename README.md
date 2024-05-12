# Projeto Spring Boot com AOP para Logging de Métodos

Neste projeto, estamos explorando o uso do Spring Boot AOP (Aspect-Oriented Programming) para criar uma anotação personalizada que irá interceptar os atributos e retornos de todos os métodos marcados com a anotação `@LogMethod`.

## Objetivo

O objetivo deste projeto é demonstrar como utilizar o AOP do Spring Boot para criar um mecanismo de logging que possa ser aplicado de forma transparente aos métodos específicos da aplicação, sem a necessidade de modificação direta no código fonte de cada método.

## Tecnologias Utilizadas

### Spring Boot

O Spring Boot é um framework Java baseado em Spring que facilita a criação de aplicativos autônomos e prontos para produção, com a configuração mínima necessária. Ele fornece uma ampla gama de recursos para o desenvolvimento de aplicativos web e serviços RESTful.

### Spring AOP

O Spring AOP (Aspect-Oriented Programming) é uma técnica que permite modularizar aspectos transversais de um sistema de software. No contexto do Spring, o AOP permite separar preocupações como logging, transações e segurança do código de negócios principal, facilitando a manutenção e a reutilização do código.

### JRebel

O JRebel é uma ferramenta de desenvolvimento que elimina o tempo de espera durante a compilação, recarregando automaticamente as alterações no código Java e recursos no servidor de aplicativos. Ele permite visualizar as mudanças imediatamente, sem a necessidade de reiniciar a aplicação, o que acelera significativamente o ciclo de desenvolvimento e depuração.
