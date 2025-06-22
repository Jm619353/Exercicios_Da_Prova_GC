package ConstrutoresEInstancias;

public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("João Miguel", 20);
        System.out.println("Nome: "+u.nome);
        System.out.println("Idade: "+u.idade);
    }
}
