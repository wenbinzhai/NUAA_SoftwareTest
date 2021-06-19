import org.apache.commons.math3.*;
import org.apache.commons.math3.linear.OpenMapRealVector;

import java.util.Arrays;

public class MyUnit {

    public String add(){
        OpenMapRealVector openMapRealVector=new OpenMapRealVector(7);
        OpenMapRealVector openMapRealVector2=new OpenMapRealVector(7);
        openMapRealVector.setEntry(2,1.0);
        openMapRealVector.setEntry(4,1.0);
        openMapRealVector2.setEntry(2,3.0);
        openMapRealVector2.setEntry(3,4.2);
        openMapRealVector=openMapRealVector.add(openMapRealVector2);
        System.out.println("sparse："+ openMapRealVector.toArray());
        return Arrays.toString(openMapRealVector.toArray());
    }
    public String append(){
        OpenMapRealVector openMapRealVector=new OpenMapRealVector(7);
        OpenMapRealVector openMapRealVector2=new OpenMapRealVector(7);
        openMapRealVector.setEntry(2,1.0);
        openMapRealVector.setEntry(4,1.0);
        openMapRealVector2.setEntry(2,3.0);
        openMapRealVector2.setEntry(3,4.2);
        openMapRealVector=openMapRealVector.add(openMapRealVector2);
        System.out.println("sparse："+ openMapRealVector.toArray());
        return Arrays.toString(openMapRealVector.toArray());
    }
    public int getDimension(){
        return 0;
    }
}
