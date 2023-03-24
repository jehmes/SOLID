package org.example.before;

public class Square extends Rectangle {

    /*Foi feito essa forçamento no metodo setWidth e setHeight para
    * adaptar a metodo e calcular a area correta de uma quadrado.
    * Isso mostra que o principio foi quebrado, a classe quadrado
    * não consegue substituir sua superclasse(retangulo)
    * pq seu metodo tem q ser diferente
    * Fazendo essas sobrescrita no método, garante que tanto o lado
    * quanto a altura irão ser iguais, pq isso que definir um quadrado*/
    @Override
    public void setWidth(double width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(double height) {
        this.width = height;
        this.height = height;
    }
}
