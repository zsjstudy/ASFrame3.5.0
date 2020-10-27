package cn.yhong.aframework.utils;

import android.text.TextUtils;

/**
 * Created by YBD-TECH029 on 2019/2/13.
 * 验证手机号
 */

public class PhoneCheckUtils {

    public static boolean isMobileNO(String mobileNums) {
        /**
         * 判断字符串是否符合手机号码格式
         * 移动号段: 134,135,136,137,138,139,147,150,151,152,157,158,159,170,178,182,183,184,187,188
         * 联通号段: 130,131,132,145,155,156,170,171,175,176,185,186
         * 电信号段: 133,149,153,170,173,177,180,181,189
         * @param str
         * @return 待检测的字符串
         */
        String num = "[1][3456789]\\d{9}";//"[1]"代表第1位为数字1，"[34578]"代表第二位可以为3、4、5、7、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
//        String regex = "(1[0-9][0-9]|15[0-9]|18[0-9])\\d{8}";
//        String telRegex = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))\\d{8}$";// "[1]"代表下一位为数字可以是几，"[0-9]"代表可以为0-9中的一个，"[5,7,9]"表示可以是5,7,9中的任意一位,[^4]表示除4以外的任何一个,\\d{9}"代表后面是可以是0～9的数字，有9位。
//        String regex = "/(^(13\d|14\d|15\d|16\d|17\d|18\d|19\d)\d{8})$/";
        if (TextUtils.isEmpty(mobileNums))
            return false;
        else
            return mobileNums.matches(num);
    }
}
