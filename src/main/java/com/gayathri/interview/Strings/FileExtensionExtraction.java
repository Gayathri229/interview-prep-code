package com.gayathri.interview.Strings;

public class FileExtensionExtraction {
    public static void main(String[] args) {
        String fileName = "document.pdf";
        System.out.println(fileExtension(fileName));
    }

    public static String fileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf(".") + 1;

        if(lastDotIndex == -1)
            return "";

        return fileName.substring(lastDotIndex);
    }
}
