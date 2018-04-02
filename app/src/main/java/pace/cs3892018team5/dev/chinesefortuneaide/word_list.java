package pace.cs3892018team5.dev.chinesefortuneaide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by johnnychen on 2018/4/2.
 */

public class word_list extends ArrayAdapter<word> {

    private Activity context;
    private List<word> wordList;

    public word_list(Activity context, List<word> wordList)
    {
        super(context, R.layout.fragment_tab3, wordList);
        this.context = context;
        this.wordList = wordList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View ListViewItem = inflater.inflate(R.layout.fragment_tab3,null,true);

        TextView textViewCHS = (TextView) ListViewItem.findViewById(R.id.textViewCHS);
        TextView textViewENG = (TextView) ListViewItem.findViewById(R.id.textViewENG);

        word word = wordList.get(position);

        textViewCHS.setText(word.getCHS());
        textViewENG.setText(word.getENG());

        return ListViewItem;
    }
}
