package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithPropertiesImplements implements MyBeanWithProperties{

    private String nombre;
    private String apellido;
    private String random;
    public MyBeanWithPropertiesImplements(String nombre, String apellido, String random) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.random = random;
    }

    @Override
    public String function() {
        return this.nombre + " - " + this.apellido;
    }

    @Override
    public String myRandom() {
        return this.random;
    }
}
