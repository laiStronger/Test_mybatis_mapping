/*
 * 文件名：Gen.java
 * 版权：Copyright 2014 Yiba Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Gen.java
 * 修改人：刘红艳
 * 修改时间：2014年12月19日
 * 修改内容：新增
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 * 
 * @author     刘红艳
 * @version    YIBA-O2O 2014年12月19日
 * @since      YIBA-O2O
 */
public class Gen
{
    private static void generateMbgConfiguration(String filepath)
    {
        /*
         * Mybatis自带Generator工具生成相应东西
         */
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File(filepath);
        FileInputStream fio = null;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = null;
        try
        {
            fio = new FileInputStream(configFile);
            config = cp.parseConfiguration(fio);
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (XMLParserException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        try
        {
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        }
        catch (InvalidConfigurationException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("生成Mybatis配置成功！");
    }
    
    public static void main(String[] args)
    {
        String filePath = "./src/generatorConfig.xml";
        generateMbgConfiguration(filePath);
        filePath = "./src/msg-generatorConfig.xml";
        generateMbgConfiguration(filePath);
    }
}
