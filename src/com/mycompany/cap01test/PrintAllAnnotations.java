package com.mycompany.cap01test;

import com.mycompany.cap01a.Document;
import com.mycompany.cap01a.Version;
import java.lang.annotation.Annotation;

public class PrintAllAnnotations {

    public static void main(String[] args) {
        Class<Document> c = Document.class;
// Get all annotations on the class declaration
        Annotation[] allAnns = c.getAnnotations();
        System.out.println("Annotation count: " + allAnns.length);
// Print all annotations
        for (Annotation ann : allAnns) {
            System.out.println(ann);
        }

        Class<Document> c2 = Document.class;
        Version v = c2.getAnnotation(Version.class);
        if (v != null) {
            int major = v.major();
            int minor = v.minor();
            System.out.println("Version: major=" + major + ", minor=" + minor);
        }

    }
}
