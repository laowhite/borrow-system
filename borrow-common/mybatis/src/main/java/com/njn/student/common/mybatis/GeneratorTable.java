package com.njn.student.common.mybatis;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Collections;

public class GeneratorTable {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://124.222.176.227:3306/book?useSSL=false&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT%2B8",
                        "root", "Wsx1357!")
                .globalConfig(builder -> {
                    builder.author("timo") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .disableOpenDir() //禁止打开输出目录
                            .outputDir("E:\\myproject\\borrow-system\\book-system\\book-system-service\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.njn") // 设置父包名
                            .moduleName("") // 设置父包模块名
                            .entity("entity") //设置entity包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "E:\\myproject\\borrow-system\\book-system\\book-system-service\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径

                })
                .strategyConfig(builder -> {
                    builder.addInclude("books") // 设置需要生成的表名 可边长参数“user”, “user1”
                            .addTablePrefix("", "") // 设置过滤表前缀
                            .serviceBuilder()//service策略配置
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .entityBuilder()// 实体类策略配置
                            //.idType(IdType.ASSIGN_ID)//主键策略  雪花算法自动生成的id
                            .addTableFills(new Column("create_time", FieldFill.INSERT)) // 自动填充配置
                            .addTableFills(new Column("update_time", FieldFill.INSERT_UPDATE))
                            .enableLombok() //开启lombok
                            .logicDeleteColumnName("deleted")// 说明逻辑删除是哪个字段
                            .enableTableFieldAnnotation()// 属性加上注解说明
                            .controllerBuilder() //controller 策略配置
                            .formatFileName("%sController")
                            .enableRestStyle() // 开启RestController注解
                            .mapperBuilder()// mapper策略配置
                            .formatMapperFileName("%sMapper")
                            .enableMapperAnnotation()//@mapper注解开启
                            .formatXmlFileName("%sMapper");
                })
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                //.templateEngine(new FreemarkerTemplateEngine())
                //.templateEngine(new EnhanceFreemarkerTemplateEngine())
                .execute();
    }
}
