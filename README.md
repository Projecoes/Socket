# 🧩 Projeto: Comunicação Cliente-Servidor TCP em Java

## 📝 Descrição
Este projeto demonstra a **comunicação entre um cliente e um servidor via protocolo TCP** utilizando **Java** e **serialização de objetos**.  
O sistema permite que o cliente envie informações de alunos (nome, nota e ID) para o servidor, que as armazena em uma lista e confirma o recebimento de cada registro.

O objetivo é compreender na prática como funciona a **comunicação via sockets em Java**, a troca de objetos através de **streams** (`ObjectInputStream` e `ObjectOutputStream`) e o controle de fluxo entre cliente e servidor.

---

## ⚙️ Tecnologias utilizadas
- ☕ **Java SE 21**
- 🔌 **Sockets TCP**
- 📦 **Serialização de Objetos (`Serializable`)**
- 📋 **Collections (`ArrayList`)**
- 🧱 **Tratamento de Exceções (`try-with-resources`)**

---

## 💻 Estrutura do projeto

| Arquivo | Função |
|----------|--------|
| `ServidorTCP.java` | Recebe conexões, lê objetos `Aluno` enviados e armazena em uma lista. |
| `ClienteTCP.java` | Permite ao usuário inserir dados de alunos e enviá-los ao servidor. |
| `Aluno.java` | Classe modelo representando um aluno (nome, nota, id). |

---

## 🔁 Fluxo de execução

1. O **servidor** é iniciado e fica aguardando conexões na porta `6789`.  
2. O **cliente** se conecta ao servidor via `Socket`.  
3. O cliente solicita ao usuário o nome e a nota do aluno.  
4. Um objeto `Aluno` é criado e enviado ao servidor.  
5. O servidor recebe o objeto, adiciona à lista e retorna uma mensagem de confirmação.  
6. O processo se repete até que o cliente digite `SAIR`.

---

## 🧠 Exemplo de execução

**Servidor:**

Servidor aguardando conexão...
Servidor conectado com cliente...
Aluno inserido com sucesso!
Alunos já inseridos:
ID: 0 | Nome: João | Nota: 8.5
ID: 1 | Nome: Maria | Nota: 9.0


**Cliente:**

Digite o nome do aluno (ou SAIR para finalizar):
João
Digite a nota do aluno:
8.5
Do servidor: Aluno inserido com sucesso!


---

## 🚀 Como executar

### 🖥️ Servidor
```bash
javac ServidorTCP.java Aluno.java
java ServidorTCP

💡 Cliente

javac ClienteTCP.java Aluno.java
java ClienteTCP

    ⚠️ Importante: o servidor deve ser iniciado antes do cliente.

📚 Aprendizados

    Implementação de comunicação bidirecional via TCP.

    Uso de Object Streams para envio de objetos entre aplicações.

    Manipulação de listas dinâmicas e tratamento de fluxos de entrada e saída.

    Noções práticas sobre arquitetura cliente-servidor e redes em Java.

👨‍💻 Autor

Andrew Coelho
Desenvolvedor focado em backend com Java ☕

🔗 [LinkedIn](https://www.linkedin.com/in/andrewcoelhodev/)
