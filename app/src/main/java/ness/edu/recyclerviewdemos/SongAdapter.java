package ness.edu.recyclerviewdemos;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Android2017 on 5/9/2017.
 */

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder>{
    //need:
    //data to know the count. to do binding
    //inflater: to create the view for the viewholder
    //context: to use explicit intents, toasts, and so on.
    private LayoutInflater inflater;
    private Context context;
    private List<SongItem> data;

    //alt+insert -> Constructor.
    public SongAdapter(Context context, List<SongItem> data) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
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


    //No One needs the viewHolder but the Adapter.
    public class SongViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tvArtist;
        ImageView ivThumbnail;

        public SongViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvArtist = (TextView) itemView.findViewById(R.id.tvArtist);
            ivThumbnail = (ImageView) itemView.findViewById(R.id.ivThumbnail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    SongItem song = data.get(position);
                    Toast.makeText(context, song.getTitle(), Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(context, DetailsActivity.class);

                    intent.putExtra("Song", song);

                    context.startActivity(intent);
                }
            });
        }
    }
}
