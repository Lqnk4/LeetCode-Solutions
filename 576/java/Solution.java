class Solution {

    public void main(String... args) {
        System.out.println(findNeighbors(2,2));
        System.out.print(findPaths(3, 3, 3, 1, 1));
    }


    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        return 0;
    }

    public int[][] findNeighbors(int x, int y) {
        return new int[][] {{x+1, y}, {x-1, y}, {x, y+1}, {x, y-1}};
    }
}