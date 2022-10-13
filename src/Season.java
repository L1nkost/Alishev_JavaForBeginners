public enum Season {
    Summer(35), Winter(-30), Autumn(10), Spring(20);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
