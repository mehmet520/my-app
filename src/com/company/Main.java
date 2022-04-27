package com.company;

import com.company.model.Product;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        PrintStream out = System.out;
        out.println("Hello");
        Product product = new Product("Keybord");
        System.out.println(product.getName());

        System.out.println();
        System.out.println();

    }
}