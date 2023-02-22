package enums;

public enum Kuzov {
    SEDAN("Седан"),
    HATCHBACK("Хечбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    JEEP("Джип"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    FURGON("Фургон"),
    MINIVAN("Минивен");

    private final String name;

    Kuzov(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
