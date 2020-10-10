package com.company;

/**
 * @author Pandula Weerasooriya
 * @version 2.0
 * @since 2015
 * Class for Library Book
 */

public class JavadocDemo {
    /**
     * @value 10 default value
     */
    static int val = 10;

    /**
     * Parametrized Constructor
     *
     * @param s Book Name
     */
    public JavadocDemo(String s) {
    }

    /**
     * Issue a Book to a Student
     *
     * @param roll Roll number of a student
     * @throws Exception if Book is not available, throws Exception
     */
    public void issue(int roll) throws Exception {
    }

    /**
     * Check if book is available
     *
     * @param str Book Name
     * @return if Book is available return true else false
     */
    public boolean available(String str) {
        return true;
    }

    /**
     * Get book name
     *
     * @param id book id
     * @return book name
     */
    public String getName(int id) {
        return "";
    }
}