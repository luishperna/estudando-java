<h1 align="center">Java :pencil:</h1>

<p align="center">
<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white"/>
</p>

Esse repositório tem como objetivo **agrupar** as minhas **anotações de conceitos e códigos** sobre **Java** vistos durante um curso na plataforma de educação à distância **Alura**.

---

## :open_file_folder: Instalando Kit de Desenvolvimento Java (JDK) no Windows 10

Basta acessar o link abaixo e baixar a versão que deseja entre os **JDK** disponiveis.

- Download JDK: https://www.oracle.com/java/technologies/downloads/

Observação: é necessario criar uma conta na oracle, caso não tenha ainda.

Feito isso, agora é só executar o arquivo baixado e instalar de forma convencional.

---

## :gear: Configurando as Variaveis de Ambiente no Windows 10

Pesquise por `Sobre o computador` na lupa do windows, depois clique em `Configurações avançadas do sistema`.

Aparecerá a tela de Propriedades do Sistema, clique em `Variaveis de Ambiente` e em Path clique em `Editar...`, posteriormente em `Novo` e acrescente seguinte o caminho `C:\Program Files\Java\jdk1.8.0_341\bin`.

Observação: nesse caminho contém o **javac** e **java** no qual será muito utilizado compilar um arquivo .java e executá-lo a partir da JVM (Máquina virtual Java).

---

## :hammer: Compilando um arquivo em Java

No terminal, dentro do diretório do arquivo, basta digitar `javac nome-do-arquivo.java`.

Feito isso, será criado outro arquivo com o final `.class` onde estaram os códigos compilado em uma forma intermediária de código chamada **bytecodes**, que será executada pela JVM.

Observação: o nome do arquivo .java deve ser o mesmo que o nome da class do código-fonte.

---

## :computer: Executando um arquivo em Java

No terminal, dentro do diretório do arquivo, basta digitar `java nome-do-arquivo`, sem o .java ou .class, ou seja, apenas ficará o nome da class dessa forma: `java nome-da-class`.