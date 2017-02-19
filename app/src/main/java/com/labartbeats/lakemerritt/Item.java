package com.labartbeats.lakemerritt;

/**
 * {@Link Item} represents a list item that represents an attraction.
 */


public class Item {

    /*Title of the Item*/
    private String mItemTitle;

    /*A brief description of the Item*/
    private String mItemDescription;

    /*The text content of the item*/
    private String mItemText;

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

    public Item (String itemTitle, String itemDescription, String itemText){
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

    public Item (String itemTitle, String itemDescription, String itemText, int imageResource){
        mItemTitle = itemTitle;
        mItemDescription = itemDescription;
        mItemText = itemText;
        mImageResourceId = imageResource;
    }

    /*
    * Getters for the member variables
    * */
    public String getItemTitle() {
        return mItemTitle;
    }
    public String getItemDescription() {
        return mItemDescription;
    }
    public String getItemText() {
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
