public enum Animal {
    Dog("Собака"), Cat("Кошка"), Frog("Лягушка");

    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return translation;
    }
}
