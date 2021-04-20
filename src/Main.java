import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n--------------------------- 2D --------------------------\n");

        ArrayList<myVector> vectoren2d = new ArrayList<>(Arrays.asList(
            new Vector2D(new Point(0, 13), new Point(0, 0)),
            new Vector2D(new Point(0, 9), new Point(0, 9)),
            new Vector2D(new Point(0, 0), new Point(0, 3)),
            new Vector2D(new Point(0, 1), new Point(0, 0))
        ));

        for (myVector tmp : vectoren2d){
            System.out.println(tmp);
        }

        System.out.println("\nnach Länge Sortiert:\n");

        AnalyzeVector<myVector> analyzeList2d = new AnalyzeVector<>(vectoren2d);
        for (myVector tmp : analyzeList2d.analyze()){
            System.out.println(tmp);
        }

        System.out.println("\n--------------------------- 3D --------------------------\n");

        ArrayList<myVector> vectoren3d = new ArrayList<>(Arrays.asList(
                new Vector3D(new Point(0,13,6), new Point(0,0,9)),
                new Vector3D(new Point(0,9, 5), new Point(0,9,8)),
                new Vector3D(new Point(0,0,3), new Point(0,3,6)),
                new Vector3D(new Point(0,1,0), new Point(0,0,7))
        ));

        for (myVector tmp : vectoren3d){
            System.out.println(tmp);
        }

        System.out.println("\nnach Länge Sortiert:\n");

        AnalyzeVector<myVector> analyzeList3d = new AnalyzeVector<>(vectoren3d);
        for (myVector tmp : analyzeList3d.analyze()){
            System.out.println(tmp);
        }

        System.out.println("\n------------------------ 2D und 3D -----------------------\n");

        ArrayList<myVector> vectoren2dUnd3d = new ArrayList<>(Arrays.asList(
                new Vector2D(new Point(0,13), new Point(0,0)),
                new Vector3D(new Point(0,9, 5), new Point(0,9,8))
        ));

        for (myVector tmp : vectoren2dUnd3d){
            System.out.println(tmp);
        }

        System.out.println("\nnach Länge Sortiert:\n");

        AnalyzeVector<myVector> analyzeList2dUnd3d = new AnalyzeVector<>(vectoren2dUnd3d);
        for (myVector tmp : analyzeList2dUnd3d.analyze()){
            System.out.println(tmp);
        }
    }



















}
