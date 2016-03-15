package shoppingpad.com.demodatabinding;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    RecyclerView.LayoutManager mlayoutManager;
    RecyclerAdapter mAdapter;
    List<BindingPojo> mListData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mListData = new ArrayList<>();

        mlayoutManager= new LinearLayoutManager(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mListData=new ArrayList<>();
        for(int i=0;i<5;i++) {
            BindingPojo bindingPojo = new BindingPojo("aaa", "bbb");
            mListData.add(bindingPojo);
        }
        mrecyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        mrecyclerView.setLayoutManager(mlayoutManager);
        mAdapter=new RecyclerAdapter(mListData);
        mrecyclerView.setAdapter(mAdapter);

    }

    /*
    public  List<BindingPojo> getData()
    {
        List<BindingPojo> data = new ArrayList<>();
        String title2[] = {"viewed", "clicked", "clicked", "viewed",
                           "viewed", "clicked",
                           "viewed", "clicked", "clicked"};

        String title3[] = {"page title1 for 30sec",
                          "image title for 50sec", "image link1",
                          "image link1",
                          "Video title1", "image link1",
                          "opened today at 2am", "image link5",
                          "opened yesterday at 11am"};
        for (int i = 0; i < title2.length && i < title3.length; i++) {
            BindingPojo current = new BindingPojo();
            current.firstName = title2[i];
            current.lastName = title3[i];
            data.add(current);
        }
      return data;
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
