package br.com.acs.superslimsample.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.tonicartos.superslim.LayoutManager;

import br.com.acs.superslimsample.R;
import br.com.acs.superslimsample.adapters.TimelineAdapter;
import br.com.acs.superslimsample.utils.Data;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private Toolbar mToolbar;
    private TimelineAdapter timelineAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);

        mRecyclerView.setLayoutManager(new LayoutManager(this));

        Data data = new Data();

        timelineAdapter = new TimelineAdapter(data.getData());
        mRecyclerView.setAdapter(timelineAdapter);
    }

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
        if (id == R.id.action_mode_grid) {

            timelineAdapter.setSectionManager(0);
            timelineAdapter.notifyDataSetChanged();
            return true;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_mode_list) {
            timelineAdapter.setSectionManager(1);
            timelineAdapter.notifyDataSetChanged();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
