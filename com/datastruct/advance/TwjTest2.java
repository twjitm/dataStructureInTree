package datastruct.advance;

/**
 * 测试2  Dijkstra?
 * 2018.6.22
 */
public class TwjTest2 {
    private static int matrixMaxVertex;
    private static int vertexSize;


    private  static int[][] edgesMatrix;
    private Object[] vertexesArray;

    public TwjTest2(int size) {
        this.vertexSize = 0;
        this.matrixMaxVertex = size;
        vertexesArray = new Object[matrixMaxVertex];
        edgesMatrix = new int[matrixMaxVertex][matrixMaxVertex];
        //对数组进行初始化，顶点间没有边关联的值为Integer类型的最大值
        for (int row = 0; row < edgesMatrix.length; row++) {
            for (int column = 0; column < edgesMatrix.length; column++) {
                edgesMatrix[row][column] = Integer.MAX_VALUE;
            }
        }
    }
    public boolean addEdge(int vnum1, int vnum2, int weight) {
        edgesMatrix[vnum1][vnum2] = weight;
        return true;
    }
    public boolean addVertex(Object val) {
        assert (val != null);
        vertexesArray[vertexSize] = val;
        vertexSize++;
        return true;
    }

    public static void shortestPath() {
        int n = vertexSize;
        int[][] D = new int[n][n];//保存从i到j的最小路径值
        int[][] p = new int[n][n];//保存经过的中间节点
        for (int i = 0; i < n; i++) {//初始化D，p
            for (int j = 0; j < n; j++) {
                if (edgesMatrix[i][j] < Integer.MAX_VALUE) {

                    p[i][j] = j;
                } else {
                    p[i][j] = -1;
                }
                D[i][j] = edgesMatrix[i][j];
            }
        }

        for (int x = 0; x < n; x++) {//进行Floyd算法，从0到n-1所有可能进行遍历
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (D[i][j] > D[i][x] + D[x][j]) {
                        D[i][j] = D[i][x] + D[x][j];
                        p[i][j] = p[i][x];
                    }
                }
            }
        }
        // 下面对获得的结果进行展示
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + D[i][j]);
            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + p[i][j]);
            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("out=" + i + "to j=" + j + "min path is ");
                int k = p[i][j];
                if (k == -1) {
                    System.out.println("not find min path");
                } else {
                    System.out.print(k);
                    while (k != j) {
                        k = p[k][j];
                        System.out.print(k);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        TwjTest2 test2=new TwjTest2(6);
        test2.addVertex("1");
        test2.addVertex("2");
        test2.addVertex("3");
        test2.addVertex("4");
        test2.addVertex("5");
        test2.addVertex("6");

        test2.addEdge(0, 1,7);
        test2.addEdge(0, 2,9);
        test2.addEdge(0, 5,14);

        test2.addEdge(1, 3,15);
        test2.addEdge(1, 2,10);

        test2.addEdge(2, 3,11);
        test2.addEdge(2, 5,2);

        test2.addEdge(3, 4,6);
        test2.addEdge(4, 5,9);
        test2.shortestPath();
    }

}
