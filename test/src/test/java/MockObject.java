import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
/**
 * @author SX2016021翟文斌
 * @date 2021/6/18 21:03
 */
public class MockObject {
//    @Test
//    public void MockTest(){
//        List mock=mock(List.class);
//        mock.add(1);
//        mock.clear();
//        verify(mock).add(1);
//        System.out.println(mock.toString());
//        verify(mock).clear();
//        System.out.println(mock.toString());
//    }
    @Test
    public void when_thenReturn(){
        //mock一个Iterator类
        Iterator iterator = mock(Iterator.class);
        //预设当iterator调用next()时第一次返回hello，第n次都返回world
        when(iterator.next()).thenReturn("hello").thenReturn("world");
        //使用mock的对象
        String result = iterator.next() + " " + iterator.next() + " " + iterator.next();
        //验证结果
        System.out.println("预期结果："+"hello world world");
        System.out.println("实际结果:"+result);
        assertEquals("hello world world",result);
    }
}
