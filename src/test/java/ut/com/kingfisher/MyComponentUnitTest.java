package ut.com.kingfisher;

import org.junit.Test;
import com.kingfisher.api.MyPluginComponent;
import com.kingfisher.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}