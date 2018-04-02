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

public class fact_list extends ArrayAdapter<fact> {
    private Activity context;
    private List<fact> factList;

    public fact_list(Activity context, List<fact> factList)
    {
        super(context, R.layout.fragment_tab4, factList);
        this.context = context;
        this.factList = factList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View ListViewItem = inflater.inflate(R.layout.fragment_tab4,null,true);

        TextView textViewFact = (TextView) ListViewItem.findViewById(R.id.textViewFact);

        fact fact = factList.get(position);

        textViewFact.setText(fact.getContent());


        return ListViewItem;
    }
}
