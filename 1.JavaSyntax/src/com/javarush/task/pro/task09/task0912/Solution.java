package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("https")) {
            return url.substring(0, 5);
        } else if (url.startsWith("http")) {
            return url.substring(0, 4);
        }
        return "неизвестный";
    }

    public static String checkDomain(String url) {
        if (url.endsWith("com") || url.endsWith("net") || url.endsWith("org")) {
            return url.substring(url.length() - 3);
        } else if (url.endsWith("ru")) {
            return url.substring(url.length() - 2);
        }
        return "неизвестный";
    }
}
