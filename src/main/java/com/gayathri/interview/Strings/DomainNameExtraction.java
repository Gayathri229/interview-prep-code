package com.gayathri.interview.Strings;

public class DomainNameExtraction {
    public static String subDomain(String url) {
        int start = url.indexOf("://") + 3;
        int end = url.indexOf(".", start);
        return url.substring(start, end);
    }

    public static void main(String[] args) {

        String url = "https://subdomain.example.com";
        System.out.println(subDomain(url));
    }
}
