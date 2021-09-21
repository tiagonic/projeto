#!/bin/bash

git config --global url."https://".insteadOf git://
cat .gitignore 
git config --global user.name "Tiago Barreto dos Santos"
git config --global user.email "tiagonic@gmail.com"
git config --list
git init
git add .
git status
git commit -m "Projeto inicial criado"

