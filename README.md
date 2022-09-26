<h1 align="center">Java :pencil:</h1>

<p align="center">
<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white"/>
</p>

Este repositório tem como objetivo **agrupar** as minhas **anotações de conceitos e códigos** sobre **Java** vistos durante um curso na plataforma de educação à distância **Alura**.

---

## :open_file_folder: Instalando Kit de Desenvolvimento Java (JDK) no Windows 10

Basta acessar o link abaixo e baixar a versão que deseja entre os **JDK** disponiveis.

- Download JDK: https://www.oracle.com/java/technologies/downloads/

Observação: é necessario criar uma conta na oracle, caso não tenha ainda.

Feito isso, agora é só executar o arquivo baixado e instalar de forma convencional.

---

## :gear: Configurando as Variáveis de Ambiente no Windows 10

Pesquise por `Sobre o computador` na lupa do windows, depois clique em `Configurações avançadas do sistema`.

Aparecerá a tela de Propriedades do Sistema, clique em `Variáveis de Ambiente` e em Path clique em `Editar...`, posteriormente em `Novo` e acrescente seguinte o caminho `C:\Program Files\Java\jdk1.8.0_341\bin`.

Observação: neste caminho contém o **javac** e **java** no qual serão utilizados para compilar arquivos .java e executá-los a partir da JVM (Máquina virtual Java).

---

## :hammer: Compilando um arquivo em Java

No terminal, dentro do diretório do arquivo, basta digitar `javac nome-do-arquivo.java`.

Feito isso, será criado outro arquivo com o final `.class` onde estaram os códigos compilados em uma forma intermediária de código chamada **bytecode**, que será executada pela JVM.

Observação: o nome do arquivo .java deve ser o mesmo que o nome da class do código-fonte.

---

## :computer: Executando um arquivo em Java

No terminal, dentro do diretório do arquivo, basta digitar `java nome-do-arquivo`, sem o .java ou .class, ou seja, apenas ficará o nome da class dessa forma: `java nome-da-class`.

Observação: o comando `java` executa a JVM no qual será responsável por interpretar os bytecodes e executar no sistema operacional em que esteja utilizando.

---

## Autor

| [<img src="https://avatars.githubusercontent.com/u/96630233?s=400&u=3400cfe6ba8fb87692f4f14cbdbef3e5cc996b67&v=4" width=115><br><sub>Luís Henrique Perna</sub>](https://github.com/luishperna) |
| :---: |