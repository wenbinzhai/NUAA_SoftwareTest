import org.apache.commons.math3.linear.OpenMapRealVector;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
/**
 * @author SX2016021翟文斌
 * @date 2021/6/18 20:29
 */
public class MyUnitTest2 {
    @Test
    public void testAppend(){
        OpenMapRealVector openMapRealVector=new OpenMapRealVector(3);
        OpenMapRealVector openMapRealVector2=new OpenMapRealVector(4);
        openMapRealVector.setEntry(1,4);
        openMapRealVector.setEntry(2,4);
        openMapRealVector2.setEntry(0,1);
        openMapRealVector=openMapRealVector.append(openMapRealVector2);
        double[] except=new double[7];
        except[2]=4;
        except[1]=4;
        except[3]=1;
        assertEquals(Arrays.toString(except),Arrays.toString(openMapRealVector.toArray()));
    }
}
