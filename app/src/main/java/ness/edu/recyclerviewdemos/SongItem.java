package ness.edu.recyclerviewdemos;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Android2017 on 5/9/2017.
 */

public class SongItem implements Parcelable {
    private final String title;
    private final String artist;
    private final int thumbnailResId;
    //private final String thumbnail;
    private final String lyrics;
    private final String duration;

    public SongItem(String title, String artist, int thumbnailResId, String lyrics, String duration) {
        this.title = title;
        this.artist = artist;
        this.thumbnailResId = thumbnailResId;
        this.lyrics = lyrics;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getThumbnailResId() {
        return thumbnailResId;
    }

    public String getLyrics() {
        return lyrics;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.artist);
        dest.writeInt(this.thumbnailResId);
        dest.writeString(this.lyrics);
        dest.writeString(this.duration);
    }

    protected SongItem(Parcel in) {
        this.title = in.readString();
        this.artist = in.readString();
        this.thumbnailResId = in.readInt();
        this.lyrics = in.readString();
        this.duration = in.readString();
    }

    public static final Parcelable.Creator<SongItem> CREATOR = new Parcelable.Creator<SongItem>() {
        @Override
        public SongItem createFromParcel(Parcel source) {
            return new SongItem(source);
        }

        @Override
        public SongItem[] newArray(int size) {
            return new SongItem[size];
        }
    };
}
