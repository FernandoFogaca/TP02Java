# TP02 Java – Medical Reimbursement Calculator

Student: Fernando Fogaça  
Course: Analysis and Systems Development (ADS) – INFNET  

## Project description

This project was developed as part of a programming assignment to practise unit testing in Java.

The system simulates a simple reimbursement calculation for medical consultations.  
The main idea is to calculate how much money a patient should receive back based on the health plan coverage.

The project also includes unit tests using **JUnit**, following the idea of **Test Driven Development (TDD)**, where tests help validate the behaviour of the code.

---

## How the calculation works

The reimbursement is calculated using the consultation value and the coverage percentage.

Example:

Consultation value: 200  
Coverage: 70%

Calculation:

reimbursement = consultationValue * coverage / 100

Result:

200 * 70 / 100 = 140

There is also a business rule in the system:

The **maximum reimbursement allowed is 150 per consultation**.

---

## Project structure

The project was organised using a few classes to separate responsibilities.

### CalculadoraReembolso

This class contains the logic responsible for calculating the reimbursement value.

### Paciente

A very simple class used only to represent a patient object.  
In the tests it is used as a **Dummy**, meaning it is only required to satisfy the method signature.

### HistoricoConsultasFake

This class simulates a consultation history using a list in memory.  
It works as a **Fake**, replacing a real database during testing.

### PlanoSaude

An interface representing a health plan and its coverage percentage.

### AuditoriaSpy

Used to check if a consultation was registered in the system.  
This object works as a **Spy**, because it records if a method was called.

### AutorizadorMock

Simulates an external service that authorises reimbursements.  
It was implemented as a **Mock** to test different scenarios.

---

## Unit tests

The project includes unit tests created with **JUnit**.

Some of the scenarios tested include:

- basic reimbursement calculation
- consultation value equal to zero
- coverage equal to zero
- full coverage (100%)
- reimbursement limit rule
- simulated authorisation

These tests help ensure that the system continues to work correctly if the code changes in the future.

---

## Technologies used

- Java  
- Eclipse IDE  
- JUnit  
- Git  
- GitHub  

---

# Versão em Português

## Descrição do projeto

Este projeto foi desenvolvido como parte de um trabalho da disciplina para praticar testes unitários em Java.

O sistema simula um cálculo simples de reembolso de consultas médicas.  
A ideia principal é calcular quanto o paciente deve receber de volta de acordo com a cobertura do plano de saúde.

O projeto também inclui testes unitários utilizando **JUnit**, seguindo o conceito de **TDD (Test Driven Development)**.

---

## Como funciona o cálculo

O valor do reembolso é calculado usando o valor da consulta e o percentual de cobertura do plano.

Exemplo:

Valor da consulta: 200  
Cobertura: 70%

Cálculo:

reembolso = valorConsulta * cobertura / 100

Resultado:

200 * 70 / 100 = 140

Também existe uma regra no sistema:

O **valor máximo de reembolso permitido é 150 por consulta**.

---

## Estrutura do projeto

O projeto foi organizado em algumas classes para separar responsabilidades.

### CalculadoraReembolso

Classe responsável por realizar o cálculo do reembolso.

### Paciente

Classe simples usada apenas para representar um paciente.  
Nos testes ela é utilizada como **Dummy**, ou seja, apenas para preencher o parâmetro do método.

### HistoricoConsultasFake

Classe que simula um histórico de consultas usando uma lista em memória.  
Ela funciona como um **Fake**, substituindo um banco de dados real durante os testes.

### PlanoSaude

Interface que representa um plano de saúde e seu percentual de cobertura.

### AuditoriaSpy

Utilizada para verificar se uma consulta foi registrada no sistema.  
Ela funciona como um **Spy**, pois permite verificar se um método foi chamado.

### AutorizadorMock

Simula um serviço externo que autoriza reembolsos.  
Foi implementado como **Mock** para testar diferentes cenários.

---

## Testes

Os testes foram implementados usando **JUnit**.

Alguns cenários testados:

- cálculo básico de reembolso  
- consulta com valor zero  
- cobertura igual a zero  
- cobertura total (100%)  
- limite máximo de reembolso  
- simulação de autorização  

Os testes ajudam a garantir que o sistema continue funcionando corretamente caso o código seja alterado no futuro.

---

## Tecnologias utilizadas

- Java  
- Eclipse  
- JUnit  
- Git  
- GitHub  
