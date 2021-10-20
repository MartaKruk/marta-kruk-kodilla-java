package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        Set<Book> clonedBooks = new HashSet<>(clonedLibrary.books);
            clonedLibrary.setBooks(clonedBooks);
        return clonedLibrary;
    }

    @Override
    public String toString() {
        String s = "<" + name + ">\n";
        for (Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }
}
