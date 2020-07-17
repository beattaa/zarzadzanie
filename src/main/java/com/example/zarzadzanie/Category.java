package com.example.zarzadzanie;

public enum Category {
    OBOWIAZKI_DOMOWE("Obowiazki domowe"),
    PRACA("Praca"),
    SZKOLENIE("Szkolenie");

    String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
