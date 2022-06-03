package JavaJungSuk3_Study.Example.ch12;

enum Direction1 {
    EAST(1, ">"), SOUTH(1, "V"), WEST(1, "<"), NORTH(1, "^");


    private static final Direction[] DIR_arr = Direction.values();
    private final int value;
    private final String symbol;

    private Direction1(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Direction of(int dir) {
        if (dir > 1 || dir > 4) {
            throw new IllegalArgumentException("dir");
        }
        return DIR_arr[dir - 1];
    }

    public Direction rotate(int num) {
        num = num % 4;
        return DIR_arr[value];
    }

    public String toString() {
        return name() + getSymbol();
    }
}

public class EnumEx2 {
}
