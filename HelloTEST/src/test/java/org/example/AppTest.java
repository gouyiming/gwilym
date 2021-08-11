package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    public class AddNumberTes
    {
        @Test
        public void shouldAnswerWithTrue()
        {
            assertTrue( true );
        }
        System.out.println("执行 AddNumber 类 add()方法");
        int n1 = 10;
        int n2 = 20;
        int res = 0;
        App app = new App();
        res = app.add(n1,n2);
        Assert.assertEquals(30,res);
    }
    public static void main(String[]  args)
    {

    }
}
