package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DigitalLibrary {

    private int libraryId;
    private String libraryName;

    @Autowired
    private Book book;

    public int getLibraryId() { return libraryId; }
    public void setLibraryId(int libraryId) { this.libraryId = libraryId; }

    public String getLibraryName() { return libraryName; }
    public void setLibraryName(String libraryName) { this.libraryName = libraryName; }

    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    @Override
    public String toString() {
        return "DigitalLibrary{" +
                "libraryId=" + libraryId +
                ", libraryName='" + libraryName + '\'' +
                ", book=" + book +
                '}';
    }
}

