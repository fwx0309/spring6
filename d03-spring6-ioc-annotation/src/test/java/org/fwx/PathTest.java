package org.fwx;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;

/**
 * @ClassName PathTest
 * @Description TODO
 * @Author Fwx
 * @Date 2024/4/6 16:12
 * @Version 1.0
 */
public class PathTest {
    @Test
    public void test() throws IOException {
//        URL resource = Thread.currentThread().getContextClassLoader().getResource("org/fwx");
        URL resource = Thread.currentThread().getContextClassLoader().getResource("org\\fwx");
        System.out.println("resource = " + resource);
        String decode = URLDecoder.decode(resource.getPath(), "utf-8");
        System.out.println("decode = " + decode);
//        Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources("org\\fwx");

    }
}
