## Todo List API

Este projeto é uma API simples de todo list desenvolvida com Spring Boot. 

### Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker

### Estrutura do Projeto

- `/controller/TodoController.java`
- `/entity/Todo.java`
- `/repository/TodoRepository.java`
- `/service/TodoService.java`


### Endpoints

- `GET /todos`: Retorna a lista de todas as tarefas.
- `POST /todos`: Cria uma nova tarefa.
- `PUT /todos`: Atualiza uma tarefa existente.
- `DELETE /todos/{id}`: Exclui uma tarefa pelo seu ID.

### Configuração e Execução

#### Pré-requisitos

- Docker

#### Passos para Execução

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/gusttv/todo-list-api.git
   cd todo-list-api
   ```

2. **Suba o contêiner PostgreSQL:**

   ```bash
   docker-compose up -d
   ```

3. **Execute a aplicação Spring Boot:**

   ```bash
   ./mvnw spring-boot:run
   ```

### Exemplo de Uso

1. **Listar todas as tarefas:**

   ```bash
   curl -X GET http://localhost:8080/todos
   ```

2. **Criar uma nova tarefa:**

   ```bash
   curl -X POST http://localhost:8080/todos -H "Content-Type: application/json" -d '{
     "title": "new task",
     "description": "task description",
     "completed": false,
     "priority": 1
   }'
   ```

3. **Atualizar uma tarefa:**

   ```bash
   curl -X PUT http://localhost:8080/todos -H "Content-Type: application/json" -d '{
     "id": 1,
     "title": "updated task",
     "description": "new description",
     "completed": true,
     "priority": 1
   }'
   ```

4. **Excluir uma tarefa:**

   ```bash
   curl -X DELETE http://localhost:8080/todos/1
   ```
