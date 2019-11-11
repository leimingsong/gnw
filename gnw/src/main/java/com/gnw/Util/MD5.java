package com.gnw.Util;

import org.apache.shiro.crypto.hash.Md5Hash;

public class MD5 {
    public static String md5Password(String oldpwd,String salt,int num){
        Md5Hash md5Hash = new Md5Hash(oldpwd,salt,num);
        String password_md5 =md5Hash.toString();
        return password_md5;
    }
}
