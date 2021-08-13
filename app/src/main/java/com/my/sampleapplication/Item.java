package com.my.sampleapplication;

import android.view.View;

import java.util.ArrayList;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Item {

    private String title;
    private String description;
    private int  titleLottie;
    private int contentLottie;

    private View.OnClickListener requestBtnClickListener;

    public Item() {
    }

    public Item(String title, String description, int titleLottie, int contentLottie) {
        this.title = title;
        this.description = description;
        this.titleLottie = titleLottie;
        this.contentLottie = contentLottie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTitleLottie() {
        return titleLottie;
    }

    public void setTitleLottie(int titleLottie) {
        this.titleLottie = titleLottie;
    }

    public int getContentLottie() {
        return contentLottie;
    }

    public void setContentLottie(int contentLottie) {
        this.contentLottie = contentLottie;
    }

    public View.OnClickListener getRequestBtnClickListener() {
        return requestBtnClickListener;
    }

    public void setRequestBtnClickListener(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener = requestBtnClickListener;
    }

    /**
     * @return List of elements prepared for tests
     */
    public static ArrayList<Item> getTestingList() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Nature","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla pulvinar elit eget tristique luctus. Maecenas.",R.raw.nature_scene, R.raw.tree));
        items.add(new Item("Beach", "This is description", R.raw.beach, R.raw.dolphin));
        items.add(new Item("Health", "Health is wealth", R.raw.exercise, R.raw.banana));
        return items;

    }

}
