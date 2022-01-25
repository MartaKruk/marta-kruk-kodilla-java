package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1", "Title1", 2000, "Signature1"));
        bookSet.add(new Book("Author2", "Title2", 2001, "Signature2"));
        bookSet.add(new Book("Author3", "Title3", 2002, "Signature3"));
        bookSet.add(new Book("Author4", "Title4", 2008, "Signature4"));
        bookSet.add(new Book("Author5", "Title5", 2000, "Signature5"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println("Median: " + median);
        assertEquals(2001, median);
    }
}
