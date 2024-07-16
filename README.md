# dio-trilha-java-desafio-uml


```mermaid
classDiagram
    class ReprodutorMusical {
        +diminuirVolumeMusica()
        +aumentarVolumeMusica()
        +pausarMusica()
        +selecionarMusica()
        +tocarMusica()
    }

    class AparelhoTelefonico {
        +ligar()
        +atender()
        +iniciarCorreioDeVoz()
    }

    class NavegadorInternet {
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet

    ReprodutorMusical : <<interface>>
    AparelhoTelefonico : <<interface>>
    NavegadorInternet : <<interface>>
```
