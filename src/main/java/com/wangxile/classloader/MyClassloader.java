package com.wangxile.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2018/10/6
 * @Modified by:
 */
public class MyClassloader extends ClassLoader {
    private String path;
    private String name;

    public MyClassloader(String name, String path) {
        super();
        this.name = name;
        this.path = path;
    }

    public MyClassloader(ClassLoader parent, String name, String path) {
        super(parent);
        this.name = name;
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = readcClassFileToByteArray(name);
        return this.defineClass(name, data, 0, data.length);
    }

    private byte[] readcClassFileToByteArray(String name) {
        InputStream is = null;
        byte[] returnData = null;
        name = name.replaceAll("\\.", "/");
        String filePath = this.path + name + ".class";
        File file = new File(filePath);

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            is = new FileInputStream(file);
            int tmp = 0;
            while ((tmp = is.read()) != -1){
                os.write(tmp);
            }
            returnData = os.toByteArray();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                is.close();
                os.close();
            }catch (Exception e){

            }
        }

        return returnData ;
    }
}
