package com.tnsif.userdefinedannotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

// --------------------------- Marker Annotation ---------------------------
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MarkerAnnotation {}

// ----------------------- Single-Value Annotation ------------------------
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface SingleValue {
    String value();
}

// ------------------------- Multi-Value Annotation -----------------------
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MultiValue {
    String os() default "Android";
    int version() default 1;
}

// ---------------------- Annotation with Array Values ---------------------
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface DeveloperInfo {
    String[] developers();
}

// -------------------------- Nested Annotations --------------------------
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Book {
    Author author();
    String title();
}

// ------------------------ Repeatable Annotations -------------------------
@Repeatable(Hints.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Hint {
    String value();
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Hints {
    Hint[] value();
}

// ------------------------ Main Class with All Annotations ----------------
@MarkerAnnotation
@MultiValue(os = "iOS", version = 15)
@DeveloperInfo(developers = {"Alice", "Bob"})
@Book(author = @Author(name = "George Orwell"), title = "1984")
@Hint("hint1")
@Hint("hint2")
public class TypesOfAnnotation {

    @SingleValue("Hello from method")
    public void greet() {}

    public static void main(String[] args) throws Exception {
        Class<?> cls = TypesOfAnnotation.class;
        TypesOfAnnotation obj = new TypesOfAnnotation();

        // ---------------- Marker Annotation ----------------
        if (cls.isAnnotationPresent(MarkerAnnotation.class)) {
            System.out.println("MarkerAnnotation is present.");
        }

        // ---------------- Single-Value Annotation ----------------
        Method method = cls.getMethod("greet");
        SingleValue single = method.getAnnotation(SingleValue.class);
        System.out.println("SingleValue: " + single.value());

        // ---------------- Multi-Value Annotation ----------------
        MultiValue mv = cls.getAnnotation(MultiValue.class);
        System.out.println("MultiValue OS: " + mv.os());
        System.out.println("MultiValue Version: " + mv.version());

        // ---------------- Array Value Annotation ----------------
        DeveloperInfo devInfo = cls.getAnnotation(DeveloperInfo.class);
        for (String dev : devInfo.developers()) {
            System.out.println("Developer: " + dev);
        }

        // ---------------- Nested Annotation ----------------
        Book book = cls.getAnnotation(Book.class);
        System.out.println("Book Title: " + book.title());
        System.out.println("Author Name: " + book.author().name());

        // ---------------- Repeatable Annotation ----------------
        Hint[] hints = cls.getAnnotationsByType(Hint.class);
        for (Hint h : hints) {
            System.out.println("Hint: " + h.value());
        }
    }
}


