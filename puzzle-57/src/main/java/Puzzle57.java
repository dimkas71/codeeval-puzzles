import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Puzzle57 {
    enum Direction {
        LEFT,
        RIGHT,
        UP,
        DOWN
    }

    public static List<Integer> getListOf(final int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        int leftEdge = 0, rightEdge = matrix.length - 1, upEdge = 0, downEdge = matrix.length - 1;
        System.out.println(matrix.length);

        List<Direction> spiralDirections = Arrays.asList(
                Direction.RIGHT,
                Direction.DOWN,
                Direction.LEFT,
                Direction.UP);

        while (canMove(leftEdge, rightEdge, upEdge, downEdge)) {
            for (Direction direction : spiralDirections) {
                switch (direction) {
                    case RIGHT:
                        System.out.println(String.format("lr->(%d %d); up->(%d, %d)", leftEdge, rightEdge, upEdge, downEdge));
                        if (canMove(leftEdge, rightEdge, upEdge, downEdge)) {
                            for (int i = leftEdge; i <= rightEdge ; i++) {
                                list.add(matrix[upEdge][i]);
                            }
                            upEdge++;
                        }
                        break;
                    case DOWN:
                        System.out.println(String.format("lr->(%d %d); up->(%d, %d)", leftEdge, rightEdge, upEdge, downEdge));
                        if (canMove(leftEdge, rightEdge, upEdge, downEdge)) {
                            for (int i = upEdge; i <= downEdge ; i++) {
                                list.add(matrix[i][rightEdge]);
                            }
                            rightEdge--;
                        }
                        break;
                    case LEFT:
                        System.out.println(String.format("lr->(%d %d); up->(%d, %d)", leftEdge, rightEdge, upEdge, downEdge));
                        if (canMove(leftEdge, rightEdge, upEdge, downEdge)) {
                            for (int i = rightEdge; i >= leftEdge; i--) {
                                list.add(matrix[downEdge][i]);
                            }
                            downEdge--;
                        }
                        break;
                    case UP:
                        System.out.println(String.format("lr->(%d %d); up->(%d, %d)", leftEdge, rightEdge, upEdge, downEdge));
                        if (canMove(leftEdge, rightEdge, upEdge, downEdge)) {
                            for (int i = downEdge; i >= upEdge ; i--) {
                                list.add(matrix[i][leftEdge]);

                            }
                            leftEdge++;
                        }
                        break;
                    default:
                        break;
                }
            }
        }



        return list;
    }

    private static boolean canMove(final int leftEdge, final int rightEdge, final int upEdge, final int downEdge) {
        return (leftEdge <= rightEdge) && (upEdge <= downEdge);
    }
}
