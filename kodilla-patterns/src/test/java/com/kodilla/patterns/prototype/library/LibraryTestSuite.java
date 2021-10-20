package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Test Library 1");
        IntStream.iterate(1, i -> i + 1)
                .limit(10)
                .forEach(i -> library.getBooks().add(new Book("Title" + i, "Author" + i, LocalDate.of(2000 + i, i, i))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Test Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Test Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Title11", "Author11", LocalDate.of(2011, 11, 11)));

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(11,library.getBooks().size());
        assertEquals(11,clonedLibrary.getBooks().size());
        assertEquals(10,deepClonedLibrary.getBooks().size());

    }
}
