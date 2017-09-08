package demon;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.Log;

/**
 * author:jianbin.zhong
 * time:2017/8/31  17:55
 * description:This is TestLog
 */

public class TestLog {
    public static void main(String[] args) {
        //调用util.包里Log类的InitLog4j2方法和changeXML方法，按照下面步骤初始化Log，使生成的log文件类似于Log_2017_0901_0900_29.txt
        String timekey=null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MMdd_HHmm_ss");
        timekey=sdf.format(new Date());
        Log init = new Log();
        if (!init.InitLog4j2(timekey)) {
            System.out.println("初始化loger失败");
            return;
        }
        Logger logger = LoggerFactory.getLogger(TestLog.class);
        logger.info("hello world");
        logger.info("Kobe");
        new Test1().say();
        new Test2().sing();
    }
}
