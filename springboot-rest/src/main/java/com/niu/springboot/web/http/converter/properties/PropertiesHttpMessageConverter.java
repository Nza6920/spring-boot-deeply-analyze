package com.niu.springboot.web.http.converter.properties;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractGenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Properties;

/**
 * @Description: PropertiesHttpMessageConverter
 * @Author nza
 * @Date 2020/1/22
 **/
public class PropertiesHttpMessageConverter extends AbstractGenericHttpMessageConverter<Properties> {

    public PropertiesHttpMessageConverter() {
        // 设置支持的 Mediatype
        super(new MediaType("text", "properties"));
    }

    @Override
    protected void writeInternal(Properties properties, Type type, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        // Properties -> String
        // OutputStream -> Writer

        // 从请求头 Content-type 解析编码
        HttpHeaders headers = httpOutputMessage.getHeaders();
        MediaType mediaType = headers.getContentType();
        // 获取字符编码
        Charset charset = mediaType.getCharset();
        // 当不存在时默认等于 utf-8
        charset = charset == null ? Charset.forName("UTF-8") : charset;

        // 获取字节输出流
        OutputStream body = httpOutputMessage.getBody();
        // 转换为字符输出流
        Writer writer = new OutputStreamWriter(body, charset);

        // Properties 写入到字符输出流
        properties.store(writer, "From PropertiesHttpMessageConverter");
    }

    @Override
    protected Properties readInternal(Class<? extends Properties> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        // 从请求头 Content-type 解析编码
        HttpHeaders headers = httpInputMessage.getHeaders();
        MediaType mediaType = headers.getContentType();
        // 获取字符编码
        Charset charset = mediaType.getCharset();

        // 当不存在时默认等于 utf-8
        charset = charset == null ? Charset.forName("UTF-8") : charset;

        // 字节流 -> 字符流
        InputStream body = httpInputMessage.getBody();
        InputStreamReader reader = new InputStreamReader(body, charset);

        // 加载字符流成为 properties 对象
        Properties properties = new Properties();
        properties.load(reader);

        return properties;
    }

    @Override
    public Properties read(Type type, Class<?> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return this.readInternal(null, httpInputMessage);
    }
}
