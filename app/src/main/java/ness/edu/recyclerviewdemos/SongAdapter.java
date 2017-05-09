package ness.edu.recyclerviewdemos;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Android2017 on 5/9/2017.
 */

public class SongAdapter extends RecyclerView.Adapter<SongViewHolder>{
    //need:
    //data to know the count. to do binding
    //inflater: to create the view for the viewholder
    //context: to use explicit intents, toasts, and so on.
    private LayoutInflater inflater;
    private Context context;
    private List<SongItem> data;

    //alt+insert -> Constructor.
    public SongAdapter(LayoutInflater inflater, Context context, List<SongItem> data) {
        this.inflater = inflater;
        this.context = context;
        this.data = data;
    }
    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.song_item, parent, false);
        return new SongViewHolder(v);
    }
    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {
        SongItem song = data.get(position);
        //data binding
        //tvTitle.setText(...)
        holder.tvArtist.setText(song.getArtist());
        holder.tvTitle.setText(song.getTitle());
        holder.ivThumbnail.setImageResource(song.getThumbnailResId());
    }
    @Override
    public int getItemCount() {
        //how many items? data.size!
        return data.size();
    }
}
