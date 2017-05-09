package ness.edu.recyclerviewdemos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android2017 on 5/9/2017.
 */

public class SongDataSource {
    public static List<SongItem> getSongs(){
        ArrayList<SongItem> songs = new ArrayList<>();

        songs.add(new SongItem("Hello", "Adelle", R.drawable.hello, "", "4:25"));
        songs.add(new SongItem("Money", "Pink floyd", R.drawable.money, "", "6:23"));
        songs.add(new SongItem("Doors", "Doors", R.drawable.doors, "", "4:11"));
        songs.add(new SongItem("Moon", "Shlomo Artzi", R.drawable.shlomo, "", "2:44"));


        return songs;
    }
}
