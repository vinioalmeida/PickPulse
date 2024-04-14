# PickPulse

API do Projeto PickPulse

## Nome dos integrantes

Kauan Guerreiro Carraro RM 99891\
Leonardo Matheus Mariano Guedes da Silva RM 99824\
Leonardo Shoiti Araki RM 98587\
Thiago Martins Bezerra RM 98644\
Vinicius Oliveira de Almeida RM 97967

Vinicius e Thiagos encarregados do Código 

## Como rodar a aplicação

Com o código aberto em sua IDE de preferência, clique no botão de run, e em seguida abra o postman ou insomnia,
coloque o link: http://localhost:8080/, e use JSON para testar os endpoints.

### O que usamos:
- Java
- Spring boot

## Requisitos

- [ ] CRUD Usuários

### Endpoints
- [Cadastrar Conta](#Cadastrar-Conta)
- [Listar Todos os Usuários](#Listar-Todos-os-Usuários)
- [Listar Usuários Por Id](#Listar-Usuário-Por-ID)
- [Listar Usuários Por Email](#Listar-Usuário-Por-Email)
- [Apagar Conta](#Apagar-Conta)

### Cadastrar Conta
`POST` /conta

#### Corpo da Requisição
|Campo|Tipo|Obrigatório|Descrição
|-----|----|-----------|---------
|Email|String|✅|Email para a conta
|Senha|String|✅|Senha para a conta

#### Exemplo da Requisição
```js
[
    {
        "id": 1
        "email": "vinicius@gmai.com"
        "senha": "123"
        "dataCriacao": "2024-04-01"
        "ativa": true
        "tipoConta": "administrador"
    }
]
```

---

### Listar Todos os Usuários
`GET` /conta

Retorna uma lista com todos os usuários cadastrados

#### Exemplo de Resposta
```js
[
    {
        "id": 1
        "email": "vinicius@gmai.com"
        "senha": "123"
        "dataCriacao": "2024-04-01"
        "ativa": true
        "tipoConta": "administrador"
    }
    {
        "id": 2
        "email": "thiago@gmal.com"
        "senha": "123"
        "dataCriacao": "2024-04-05"
        "ativa": true
        "tipoConta": "usuario"
    }
    {
        "id": 3
        "email": "leonardo@leonardo.com"
        "senha": "123"
        "dataCriacao": "2024-04-10"
        "ativa": true
        "tipoConta": "usuario"
    }
]
```

---

### Listar Usuário Por ID
`GET` /conta/`{2}`

Retorna a conta cadastrada com o `id` informado

#### Exemplo de Resposta
```js
[
    {
        "id": 2
        "email": "thiago@gmal.com"
        "senha": "123"
        "dataCriacao": "2024-04-05"
        "ativa": true
        "tipoConta": "usuario"
    }
]
```

---

### Listar Usuário Por Email
`GET` /conta?email=`{leonardo@leonardo.com}`

Retorna a conta cadastrada com o `email` informado

#### Exemplo de Resposta
```js
[
    {
        "id": 3
        "email": "leonardo@leonardo.com"
        "senha": "123"
        "dataCriacao": "2024-04-10"
        "ativa": true
        "tipoConta": "usuario"
    }
]
```
---

### Apagar Conta

`DELETE` /conta/`{id}`

Apaga a conta com o `id` informado no path

