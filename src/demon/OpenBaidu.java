package demon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * author:jianbin.zhong
 * time:2017/8/23  15:13
 * description:This is OpenBaidu to test the env is ok
 * Firefox:54.0b9
 */

public class OpenBaidu {

    public static void main(String args[]){
        testOpenBaidu();
    }
    //打开百度首页
    private static void testOpenBaidu( ){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baidu.com/");
        driver.quit();
    }
}
