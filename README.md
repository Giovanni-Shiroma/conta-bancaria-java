# 💳 Desafio Java - Sistema Bancário Simples

Este projeto é um desafio em **Java** que implementa um sistema bancário básico no console.  
O programa simula operações comuns de uma conta corrente, permitindo consultar saldo, receber valores e realizar transferências.

---

## 🚀 Funcionalidades

- Consultar dados do cliente (nome, tipo de conta e saldo);
- Consultar saldo atualizado;
- Receber valores e somar ao saldo;
- Realizar transferências, verificando se há saldo suficiente;
- Menu interativo no console para escolher operações.

---

## 🖥️ Exemplo de Uso

Ao executar o programa, você verá o menu de opções:

```
***********************
Dados do cliente:

Nome: Junior da Silva
Tipo Conta: Corrente
Saldo: R$ 2500,00
***********************

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada:
```

Exemplo de fluxo:
- Selecionar **2** → Informar valor recebido → saldo atualizado.
- Selecionar **3** → Informar valor a transferir → saldo atualizado ou mensagem de saldo insuficiente.

---

## 🛠️ Tecnologias Utilizadas

- Java 17+  
- `Scanner` para leitura de dados no console  
- Estrutura básica de métodos e controle de fluxo

---

## 📂 Estrutura do Projeto

```
Desafio.java
```

- `main` → Ponto de entrada do programa
- `consultaDeDados()` → Exibe informações do cliente e saldo
- `menuDeOpcoes()` → Exibe menu de operações
- `recebeTransferencia()` → Adiciona valor ao saldo
- `transferirValor()` → Subtrai valor do saldo (se houver fundos suficientes)

---

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```

2. Compile o código:
   ```bash
   javac Desafio.java
   ```

3. Execute o programa:
   ```bash
   java Desafio
   ```

---

## 📌 Objetivo

Este projeto foi desenvolvido como exercício de lógica de programação em Java, praticando:
- Estruturas condicionais
- Métodos e escopo de variáveis
- Interação com o usuário via console

---

✍️ Autor: **Giovanni Shiroma**
