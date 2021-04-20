import java.util.ArrayList;
import java.util.Comparator;

public class AnalyzeVector<T extends myVector> {
    //Fields
    private ArrayList<T> vectorList;

    //Constructor
    public AnalyzeVector(ArrayList<T> vectorList){
        this.vectorList = vectorList;
    }

    public ArrayList<T> analyze() {
        vectorList.sort(new Comparator<myVector>() {
            @Override
            public int compare(myVector v1, myVector v2) {
                double lengthV1;
                double lengthV2;

                lengthV1 = v1.getLength();
                lengthV2 = v2.getLength();

                return Double.compare(lengthV1, lengthV2);
            }
        });
        return vectorList;
    }
}
