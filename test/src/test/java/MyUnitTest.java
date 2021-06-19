import junit.framework.TestSuite;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;
/**
 * @author SX2016021翟文斌
 * @date 2021/6/18 20:02
 */
public class MyUnitTest {
    @Test
    public void testAdd(){
        OpenMapRealVector openMapRealVector=new OpenMapRealVector(7);
        OpenMapRealVector openMapRealVector2=new OpenMapRealVector(7);
        openMapRealVector.setEntry(2,1);
        openMapRealVector.setEntry(4,1);
        openMapRealVector2.setEntry(2,3);
        openMapRealVector2.setEntry(3,4);
        openMapRealVector=openMapRealVector.add(openMapRealVector2);
        double[] except=new double[7];
        except[2]=4;
        except[3]=4;
        except[4]=1;
        assertEquals(Arrays.toString(except),Arrays.toString(openMapRealVector.toArray()));
    }

}