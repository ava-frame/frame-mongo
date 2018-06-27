package com.ava.frame.mongo.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * leo on 2015/7/17.
 */
public class RegexUtils {

    public static final List<String> special_list = new ArrayList<String>();

    static {
        special_list.add("\\");
        special_list.add("$");
        special_list.add("(");
        special_list.add(")");
        special_list.add("*");
        special_list.add("+");
        special_list.add(".");
        special_list.add("[");
        special_list.add("]");
        special_list.add("^");
        special_list.add("{");
        special_list.add("}");
        special_list.add("|");
        special_list.add("?");
    }

    public static boolean isPhone(String phone) {
        String regex = "1\\d{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public static boolean isEmail(String email) {
        String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(email);
        return matcher.matches();
    }

    public static String compile(String keyword) {
        for (String s : special_list) {
            if (keyword.contains(s)) {
                keyword = keyword.replaceAll("\\" + s, "\\\\" + s);
            }
        }
        return keyword;
    }
}
