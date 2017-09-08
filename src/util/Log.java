package util;

import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * author:jianbin.zhong
 * time:2017/8/31  17:53
 * description:This is Log
 */

public class Log {

    public boolean InitLog4j2(String time){
        boolean init=false;
        InputStream inputStream = null;
        try {
            inputStream=changeXML(time);
            if(inputStream!=null){
                ConfigurationSource source = new ConfigurationSource(inputStream);
                Configurator.initialize(null, source);
                init=true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return init;
    }

    private InputStream changeXML(String time){
        SAXReader reader = new SAXReader();
        InputStream inputStream = null;
        try {
            Document doc = reader.read(getClass().getResourceAsStream("/log4j2.xml"));
            Element root=doc.getRootElement();
            List<Element> childElements = root.elements();
            for (Element child : childElements) {
                if( child.getName().equals("appenders")){
                    Element ele_File= child.element("File");
                    Attribute attr=ele_File.attribute("fileName");
                    attr.setValue("Logs/Log_"+time+".txt");
                }
            }
            inputStream= new ByteArrayInputStream(doc.asXML().getBytes("UTF-8"))  ;
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputStream;
    }














}
