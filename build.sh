#!/bin/bash

# LIMPA TELA
clear

# REMOVE OS ARQUIVOS VELHOS
rm -rf source/*.class

# COMPILAÇÃO
javac -cp . source/*.java

# EXECUÇÃO
java source.main