package nextstep.ladder.model;

import java.util.Objects;

public class Direction {
    private final boolean left;
    private final boolean right;

    private Direction(boolean left, boolean right) {
        if (left && right) {
            throw new IllegalStateException();
        }

        this.left = left;
        this.right = right;
    }

    public boolean isRight() {
        return this.right;
    }

    public boolean isLeft() {
        return this.left;
    }

    public static Direction left() {
        return new Direction(true, false);
    }

    public static Direction right() {
        return new Direction(false, true);
    }

    public static Direction straight() {
        return new Direction(false, false);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direction pair = (Direction) o;
        return left == pair.left &&
                right == pair.right;
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    @Override
    public String toString() {
        return "Direction{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
