package com.demoblaze.qa.exceptions;

public class NotFindCategories extends AssertionError{
    /**
     * Exception for control find CATEGORIES element
     */
    private static final long serialVersionUID = 12312L;
    private static final String NO_FIND_CATEGORIES = "No find categories";
//    private static final String LOGIN_FAILED = "Login failed";

    public static String getNoFindCategoriesMessage(){
        return NO_FIND_CATEGORIES;
    }
    public NotFindCategories(String message, Throwable cause){
        super(message, cause);
    }

}
