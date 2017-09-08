package page;

import org.openqa.selenium.By;

/**
 * author:jianbin.zhong
 * time:2017/9/8  14:00
 * description:This is FollowPage
 */

public class FollowPage {

    //官网
    private static By logo = By.className("logo");
    //发现
    private static By discovery = By.className("discover ");
    //关注
    private static By follow = By.className("follow ");
    //消息
    private static By notification = By.className("notifications");
    //search
    private static By search = By.id("header-search-btn");
    //avatar登录头像
    private static By login = By.className("btn-login avatar log-on");
    private static By loginSelfPage = By.xpath("/html/body/header/div/div[2]/ul/li[1]/a");
    private static By loginSetting = By.xpath("/html/body/header/div/div[2]/ul/li[2]/a");
    private static By loginLogOut = By.xpath("/html/body/header/div/div[2]/ul/li[3]/a");

    //用户个人信息User,封面设置
    private static By userCoverBtn = By.className("upload-cover-btn");
    private static By userCoverLogo = By.xpath("/html/body/div[4]/div[2]/div[1]/svg");
    private static By userCoverClose = By.xpath("/html/body/div[4]/div[2]/div[2]/svg");
    private static By userCoverTitle = By.className("title");
    private static By userCoverAdd = By.xpath("/html/body/div[4]/div[2]/div[3]/div[1]/label/svg");
    private static By userCoverPreview = By.xpath("/html/body/div[4]/div[2]/div[3]/div[2]/h3");
    private static By userCoverAppCoverPicture = By.className("cover-preview-app");
    private static By userCoverAppCoverText = By.xpath("/html/body/div[4]/div[2]/div[3]/div[2]/p[1]");
    private static By userCoverWebCoverPicture = By.className("cover-preview-web");
    private static By userCoverWebCoverText = By.xpath("/html/body/div[4]/div[2]/div[3]/div[2]/p[2]");
    private static By userCoverConfirm = By.className("cover-submit-box");
    //用户个人信息User,头像设置
    private static By userAvatarBtn = By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/img");
    private static By userAvatarLogo = By.xpath("/html/body/div[4]/div[2]/div[1]/svg"); //与private static By userCoverLogo = By.xpath("/html/body/div[4]/div[2]/div[1]/svg");相等
    private static By userAvatarClose = By.xpath("/html/body/div[4]/div[2]/div[2]/svg");
    private static By userAvatarTitle = By.className("title");
    private static By userAvatarAdd = By.xpath("/html/body/div[4]/div[2]/div[3]/div[1]/label/svg");
    private static By userAvatarPreview = By.xpath("/html/body/div[4]/div[2]/div[3]/div[2]/h3");
    private static By userAvatarPreview100 = By.className("head-preview-100");
    private static By userAvatarPreview100Text = By.xpath("/html/body/div[4]/div[2]/div[3]/div[2]/p[1]");
    private static By userAvatarPreview76 = By.className("head-preview-76");
    private static By userAvatarPreview76Text = By.xpath("/html/body/div[4]/div[2]/div[3]/div[2]/p[2]");
    private static By userAvatarPreview48 = By.className("head-preview-48");
    private static By userAvatarPreview48Text = By.xpath("/html/body/div[4]/div[2]/div[3]/div[2]/p[3]");
    private static By userAvatarConfirm = By.className("head-submit-box");
    //用户个人信息User,详细
    private static By userNicknameIcon = By.xpath("/html/body/div[2]/div[1]/div[2]/h3/span[1]");
    private static By userVipIcon = By.className("vip");
    private static By userGenderIcon = By.xpath("/html/body/div[2]/div[1]/div[2]/h3/svg/use");
    private static By userSioeyeID = By.className("profile-sioeyeID");
    private static By userEditBtn = By.className("profile-follow");
    private static By userShareBtn = By.className("profile-share");
    //用户个人信息User,直播达人
    private static By userCameraBtn = By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/a/svg/use");
    private static By userDaRenTxt = By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]");
    private static By userVipIcon2 = By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[2]");//与private static By userVipIcon = By.className("vip");相等
    private static By userZanIcon = By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/svg/use");
    private static By userZanValue = By.xpath("like-count");
    private static By userLocationIcon = By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/svg/use");
    private static By userLocationValue = By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/span");
    private static By userHobbyIcon = By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/svg/use");
    private static By userHobbyValue = By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/span");
    private static By userCityIcon = By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/svg/use");
    private static By userCityValue = By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/span");

    //推荐达人 rec for recommend
    private static By recTitle = By.className("title");
    private static By recRefreshIcon = By.xpath("/html/body/div[2]/div/div[1]/div[3]/div[1]/div/svg");
    private static By recRefreshText = By.xpath("/html/body/div[2]/div/div[1]/div[3]/div[1]/div/span");
    private static By recRefreshBtn = By.className("refresh");

    //推荐达人内容可能需要遍历写，不能写固定(未完)

    //follow内容（未完）

}
