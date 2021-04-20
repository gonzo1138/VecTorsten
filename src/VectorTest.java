import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VectorTest {
    Vector2D test1;
    Vector2D test2;

    Vector3D test3;
    Vector3D test4;

    @Before
    public void runBefore(){
        this.test1 = new Vector2D(new Point(0,5), new Point(0,0));
        this.test2 = new Vector2D(new Point(0,0), new Point(9,9));

        this.test3 = new Vector3D(new Point(0,0, 5), new Point(0,0, 0));
        this.test4 = new Vector3D(new Point(0,0, 0), new Point(9,9, 9));
    }

    @Test
    public void isVector2DlengthCorrect(){
        Assert.assertTrue(5 == this.test1.getLength());
    }

    @Test
    public void isVector2DlengthCorrectFloatingPoint(){
        double d = Math.pow(10, 2);
        Assert.assertTrue((Math.round(12.727922061357 * d) / d) == (Math.round(this.test2.getLength() * d) / d));
    }

    @Test
    public void isVector3DlengthCorrect(){
        Assert.assertTrue(5 == this.test3.getLength());
    }

    @Test
    public void isVector3DlengthCorrectFloatingPoint(){
        double d = Math.pow(10, 2);
        //System.out.println(this.test4.getVectorLength());
        Assert.assertTrue((Math.round(15.588457268119896 * d) / d) == (Math.round(this.test4.getLength() * d) / d));
    }
}