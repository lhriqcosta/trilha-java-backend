package br.dio.com;

import br.dio.com.model.Iphone;

public class App {
    public static void main(String[] args) {
        Iphone apple = new Iphone("iPhone 15 Pro", 2023);
        apple.tocar();
    }
}
