# Santander BootCamp 2023
Java RESTful API criada para a Santander BootCamp 2023.

## Diagrama de Classes

```mermaid
classDiagram
  class User {
    -name: String
    -account: Account
    -features: Feature[]
    -card: Card
    -news: News[]
  }

  class Account {
    -number: String
    -agency: String
    -balance: Float
    -limit: Float
  }

  class Feature {
    -icon: String
    -description: String
  }

  class Card {
    -number: String
    -limit: Float
  }

  class News {
    -icon: String
    -description: String
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature 
  User "1" *-- "1" Card 
  User "1" *-- "N" News

```

## Essa API REST foi a minha primeira a subir na nuvem (Railway). Um grande momento.
<h3> Você pode visualizar e testar <a href="https://api-bank-santander-production.up.railway.app/swagger-ui.html"> aqui. </a>
<p> Para informações e alguns detalhes, leia o arquivo "Documentação.txt". </p>
<h2> Até mais! ;) </h2>
