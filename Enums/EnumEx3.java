package Enums;

enum Transportation {
    BUS(100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    TRAIN(200) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    SHIP(1000) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    AIRPLANE(1500) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    protected final int BASIC_FARE;
    int fee;

    Transportation(int fee) {
        this.BASIC_FARE = fee;
    }

    public int getBasicFare() {
        return BASIC_FARE;
    }

    abstract int fare(int distance);
    // @FunctionalInterface
    // int fare(int distance);
    

}

public class EnumEx3 {
    public static void main(String[] args) {
        System.out.println("busFee : " + Transportation.BUS.fare(20));
        System.out.println("shipFee : " + Transportation.SHIP.fare(15));
        System.out.println("trainFee : " + Transportation.TRAIN.fare(10));
        System.out.println("airplaneFee : " + Transportation.AIRPLANE.fare(40));
    }
}
