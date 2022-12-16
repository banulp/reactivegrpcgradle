package org.reactivegrpcgradle.exeption;

final class BlogNotFoundException extends IllegalStateException {
    BlogNotFoundException(String s) {
        super(s);
    }
}