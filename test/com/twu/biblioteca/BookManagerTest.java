package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Doarcutine on 2017/9/22.
 */
public class BookManagerTest {
    BookManager bookManager = new BookManager();

    @Test
    public void userCheckoutBookTest() {
        assertTrue(bookManager.CheckoutBook("book1"));
    }

    @Test
    public void userReturnBookTest() {
        bookManager.CheckoutBook("book1");
        assertTrue(bookManager.ReturnBook("book1"));
    }

    @Test
    public void printAvaliableBookListTest() {
        bookManager.CheckoutBook("book1");
        bookManager.PrintAvaliableBookList();
    }
}
