package jw.demo.service;

public class StorageFileNotFoundException extends RuntimeException {
    public StorageFileNotFoundException(String s) {
        super(s);
    }

    public StorageFileNotFoundException(String s, Throwable e) {
        super(s, e);
    }
}
