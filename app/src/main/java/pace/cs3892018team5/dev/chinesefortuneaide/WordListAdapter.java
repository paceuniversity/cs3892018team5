package pace.cs3892018team5.dev.chinesefortuneaide;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnnychen on 2018/4/16.
 */

public class WordListAdapter extends ArrayAdapter<word> {
    private Context mContext;
    int mResource;

    public WordListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<word> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int image = getItem(position).getImg();
        int sound = getItem(position).getSound();

        word word = new word(image,sound);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        final MediaPlayer player = MediaPlayer.create(getContext(),sound);


        ImageButton btn = (ImageButton) convertView.findViewById(R.id.word_sound);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.start();
            }
        });

        ImageView img = (ImageView) convertView.findViewById(R.id.word);

        img.setImageResource(image);

        return convertView;
    }
}
