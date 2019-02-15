package org.springframework.transaction;

import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.assertTrue;

/**
 * @author jun.chu
 * @date 2019-02-15 09:48
 */
public class FileSystemXmlApplicationContextPropertyTest {
    @Test
    public void testXmlFilePropertyParse() {
        //用于debug xmlFile property属性解析

        String configLocation = "org.springframework.transaction/src/test/java/org/springframework/transaction/interceptor/transactionalBeanFactory.xml";
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(configLocation);
        assertTrue(ctx.containsBean("targetDependency"));
        ctx.close();
    }
}
