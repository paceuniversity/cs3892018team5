package pace.cs3892018team5.dev.chinesefortuneaide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Fortunetab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortunetab);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Fortunes fortunesObject = new Fortunes();
        TextView textView = findViewById(R.id.textView);
        textView.setText(fortunesObject.getRandom());


    }

}
