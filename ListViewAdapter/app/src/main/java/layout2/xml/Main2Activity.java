package layout2.xml;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.bilal.listviewadapter.MainActivity;
import com.example.bilal.listviewadapter.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void A (View v)
    {
        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(i);
    }
}
