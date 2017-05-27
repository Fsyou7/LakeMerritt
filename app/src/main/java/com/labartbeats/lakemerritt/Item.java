package com.labartbeats.lakemerritt;

/**
 * {@Link Item} represents a list item that represents an attraction.
 */


public class Item {

    /*Title of the Item*/
    private int mItemTitle;

    /*A brief description of the Item*/
    private int mItemDescription;

    /*The text content of the item*/
    private int mItemText;

    /*Reference to the image file*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /*Create a new Item object
    *
    * @param itemTitle is the title of the Item
    *
    * @param itemDescription is a brief description or header
    *
    * @param itemText is the article's text content
    *
    * @param imageResourceId is the drawable resource ID of the image associated with the item
    * */

    public Item (int itemTitle, int itemDescription, int itemText){
        mItemTitle = itemTitle;
        mItemDescription = itemDescription;
        mItemText = itemText;
    }

     /*Create a new Item object
    *
    * @param itemTitle is the title of the Item
    *
    * @param itemDescription is a brief description or header
    *
    * @param itemText is the article's text content
    *
    * @param imageResourceId is the drawable resource ID of the image associated with the item
    * */

    public Item (int itemTitle, int itemDescription, int itemText, int imageResource){
        mItemTitle = itemTitle;
        mItemDescription = itemDescription;
        mItemText = itemText;
        mImageResourceId = imageResource;
    }

    /*
    * Getters for the member variables
    * */
    public int getItemTitle() {
        return mItemTitle;
    }
    public int getItemDescription() {
        return mItemDescription;
    }
    public int getItemText() {
        return mItemText;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /*
    * Returns whether or not there is an image for this item.
    * */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
