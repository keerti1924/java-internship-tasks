package com.test;

import com.media.Media;
import com.media.Book;
import com.media.CD;
import com.media.DVD;

public class Main {
    public static void main(String[] args) {
        Media[] mediaArray = new Media[3];
        mediaArray[0] = new Book();
        mediaArray[1] = new CD();
        mediaArray[2] = new DVD();

        for (Media media : mediaArray) {
            media.displayInfo();
        }
    }
}
