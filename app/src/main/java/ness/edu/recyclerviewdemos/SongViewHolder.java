package ness.edu.recyclerviewdemos;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Android2017 on 5/9/2017.
 */

public class SongViewHolder extends RecyclerView.ViewHolder {
    TextView tvTitle;
    TextView tvArtist;
    ImageView ivThumbnail;

    public SongViewHolder(View itemView) {
        super(itemView);
        tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
        tvArtist = (TextView) itemView.findViewById(R.id.tvArtist);
        ivThumbnail = (ImageView) itemView.findViewById(R.id.ivThumbnail);
    }
}
