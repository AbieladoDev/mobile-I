# Aula 09 — Campos de Texto e Leitura de Dados (TextInputLayout)

Sete projetos Android independentes, em **Kotlin** (`MainActivity.kt`), um por exercício.
Cada pasta é um projeto completo do Android Studio — abrir a pasta do exercício, não esta pasta.

| Pasta | Exercício | Botão | Regra extra |
|---|---|---|---|
| `01-pedido-lanche` | Pedido de Lanche | `btn_Pedir` | — |
| `02-cadastro-pet` | Cadastro de Pet | `btn_CadastrarPet` | — |
| `03-reserva-sala` | Reserva de Sala | `btn_Reservar` | — |
| `04-tela-login` | Tela de Login | `btn_Entrar` | senha com no mínimo 6 caracteres |
| `05-inscricao-evento` | Inscrição em Evento | `btn_Inscrever` | idade entre 14 e 99 |
| `06-cadastro-produto` | Cadastro de Produto | `btn_Cadastrar` | preço maior que zero |
| `07-recuperar-senha` | Recuperar Senha | `btn_Recuperar` | os dois e-mails têm que ser iguais |

Todos cumprem as três etapas da lista:

1. **Etapa 1** — os valores digitados saem no Logcat com `println` (filtrar por `System.out`).
2. **Regra extra** (4 a 7) — `if` conferindo o dado e mostrando a mensagem certa.
3. **Desafio** — o resultado também aparece na tela, no `TextView` de id `txtResultado`, via `.text = ...`.

## Estrutura de cada projeto

- `app/src/main/res/layout/activity_main.xml` — os `TextInputLayout`/`TextInputEditText`, o botão e o `txtResultado`.
- `app/src/main/java/com/example/<projeto>/MainActivity.kt` — `findViewById`, `setOnClickListener { }` e a lógica.

Gradle, AGP e wrapper são os mesmos do projeto `aula-04` deste repositório, mais o plugin
`org.jetbrains.kotlin.android` (2.2.20) para compilar Kotlin.
