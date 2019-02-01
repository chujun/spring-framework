package org.springframework.context.support;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author jun.chu
 * @date 2019-02-01 10:54
 */
public class FileSystemXmlApplicationContextTest {
    private static final String PATH              = "org.springframework.context/src/test/java/org/springframework/context/support/";
    private static final String SIMPLE_CONTEXT    = "simpleContext.xml";
    private static final String FQ_SIMPLE_CONTEXT = PATH + SIMPLE_CONTEXT;

    @Test
    public void testSingleConfigLocation() {
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("user.dir"));
        //user.dir:/Users/chujun/Documents/ideaspace/openSource/spring/spring-framework
        //System.getProperty("user.dir") + path = 绝对路径
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(FQ_SIMPLE_CONTEXT);
        assertTrue(ctx.containsBean("someMessageSource"));
        ctx.close();
    }
}
