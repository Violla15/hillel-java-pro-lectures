package ua.ithillel.lectures.lecture12.builder;

public class Phone {

    // required fields
    private String model;
    private String manufacturer;

    // optional fields
    private boolean isUsed;
    private int storage;
    private int pixels;
    private int year;

    public Phone(PhoneBuilder phoneBuilder) {
        this.model = phoneBuilder.model;
        this.manufacturer = phoneBuilder.manufacturer;
        this.storage = phoneBuilder.storage;
        this.isUsed = phoneBuilder.isUsed;
        this.pixels = phoneBuilder.pixels;
        this.year = phoneBuilder.year;
    }

    // Builder class
    public static class PhoneBuilder {
        // required fields
        private String model;
        private String manufacturer;

        // optional fields
        private boolean isUsed;
        private int storage;
        private int pixels;
        private int year;

        public PhoneBuilder(String model, String manufacturer) {
            this.model = model;
            this.manufacturer = manufacturer;
        }

        public PhoneBuilder isUsed(boolean isUsed) {
            this.isUsed = isUsed;
            return this;
        }

        public PhoneBuilder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public PhoneBuilder pixels(int pixels) {
            this.pixels = pixels;
            return this;
        }

        public PhoneBuilder year(int year) {
            this.year = year;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", isUsed=" + isUsed +
                ", storage=" + storage +
                ", pixels=" + pixels +
                ", year=" + year +
                '}';
    }
}
