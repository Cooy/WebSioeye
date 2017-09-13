package util;

import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * author:jianbin.zhong
 * time:2017/8/31  17:53
 * description:This is Log
 */

public class Log {
    private static Logger logger = LoggerFactory.getLogger(Log.class);

    private static final ThreadLocal<DateFormat> DATE_FORMAT = new ThreadLocal<DateFormat>(){
        @Override
        protected DateFormat initialValue(){
            return new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]");
        }
    };

    public static void warn(String message, Object... args){
        Reporter.log(getPrefix()+String.format(message, args)+"<br>");
    }

    public static void info(String message, Object... args){
        String messages = getPrefix()+String.format(message, args);
        logger.info(messages);
        Reporter.log(messages+"<br>");
    }

    public static void info2(String message, Object... args){
        String messages = getPrefix()+String.format(message, args);
        logger.info(messages);
        Reporter.log("<span style=\"color:green\">"+messages+"</span><br>");
    }

    public static void infoSuccess(String message, Object... args){
        String messages = getPrefix()+String.format(message, args);
        logger.info(messages);
        Reporter.log("<span style=\"color:green\">"+messages+"</span><br>");
    }

    public static void infoFailed(String message, Object... args){
        String messages = getPrefix()+String.format(message, args);
        logger.info(messages);
        Reporter.log("<span style=\"color:red\">"+messages+"</span><br>");
    }

    public static void infoSkipped(String message, Object... args){
        String messages = getPrefix()+String.format(message, args);
        logger.info(messages);
        Reporter.log("<span style=\"color:blue\">"+messages+"</span><br>");
    }

    /**
     * 获取堆栈轨迹的方法和类名，作为用例执行log的前缀。
     * @return
     */
    private static String getPrefix(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements == null || stackTraceElements.length < 4){
            return "[BOGUS]";
        }
        String className = stackTraceElements[3].getClassName();
        String methodName = stackTraceElements[3].getMethodName();
        className = className.replaceAll("[a-z\\.]","");
        String timestamp = DATE_FORMAT.get().format(new Date());
        return String.format("%s [%s.%s]", timestamp, className, methodName);
    }

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
