# Santander Dev-Week 2023

### Descritption
 > Creating an API at Santander Dev Week 2023 on DIO.

## Class Diagram

```mermaid

classDiagram
    class User {
        +String name
        +Account account
        +Feature[] features
        +Card card
        +News[] news
    }

    class Account {
        +String number
        +String agency
        +Number balance
        +Number limit
    }

    class Features {
        +String icon
        +String description
    }

    class Card {
        +String number
        +Number limit
    }

    class News {
        +String icon
        +String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Features
    User "1" *-- "1" Card
    User "1" *-- "N" News

```
