package com.example.xyzreader.data.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Kendon Kyle on 2017/12/20.
 */

public class Article implements Parcelable {
    public String _id;
    public String SERVER_ID;
    public String title;
    public String author;
    public String body;
    public String thumb_url;
    public String photo_url;
    public String aspect_ratio;
    public String published_date;

    public Article()    {

    }

    protected Article(Parcel in) {
        _id = in.readString();
        SERVER_ID = in.readString();
        title = in.readString();
        author = in.readString();
        body = in.readString();
        thumb_url = in.readString();
        photo_url = in.readString();
        aspect_ratio = in.readString();
        published_date = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(_id);
        dest.writeString(SERVER_ID);
        dest.writeString(title);
        dest.writeString(author);
        dest.writeString(body);
        dest.writeString(thumb_url);
        dest.writeString(photo_url);
        dest.writeString(aspect_ratio);
        dest.writeString(published_date);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Article> CREATOR = new Parcelable.Creator<Article>() {
        @Override
        public Article createFromParcel(Parcel in) {
            return new Article(in);
        }

        @Override
        public Article[] newArray(int size) {
            return new Article[size];
        }
    };
}