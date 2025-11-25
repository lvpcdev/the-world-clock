# 🌍 World Clock (Relógio Mundial)

Um sistema de console desenvolvido em Java que exibe, em tempo real, a data e o horário atual em diferentes fusos horários ao redor do mundo.

## 📝 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de praticar a manipulação de datas e horas com a API moderna do Java (`java.time`) e aplicar boas práticas de programação.

## 🚀 Tecnologias Utilizadas

* **Java** (JDK 17 ou superior)
* **java.time API** (Instant, LocalDateTime, ZoneId, DateTimeFormatter)

## 🧠 Conceitos Praticados

* **Manipulação de Fuso Horário:** Conversão de um `Instant` global para `LocalDateTime` específicos usando `ZoneId`.
* **Refatoração:** Criação de métodos estáticos para evitar repetição de código.
* **Formatação:** Uso de `DateTimeFormatter` para exibir datas de forma legível.
* **Clean Code:** Nomenclatura clara de variáveis e métodos.

## 💻 Exemplo de Saída

```text
Bem vindo ao relógio do mundo!

Local: Máquina local
 Data: 25/11/2025
 Hora: 15:30

Local: Portugal
 Data: 25/11/2025
 Hora: 18:30
```

## 🔧 Como Executar

Clone este repositório:


No GitBash:
git clone https://github.com/lvpcdev/the-world-clock.git
Abra o projeto na sua IDE favorita (IntelliJ, Eclipse, VS Code).

Execute a classe Program.java.

---