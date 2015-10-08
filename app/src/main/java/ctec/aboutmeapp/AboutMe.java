package ctec.aboutmeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;




public class AboutMe extends AppCompatActivity {

    private Button artButton;
    private Button animeButton;
    private Button gamesButton;
    private Button jobButton;
    private Button kpopButton;
    private TextView artText;
    private TextView animeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        artButton = (Button) findViewById(R.id.artButton);
        animeButton = (Button) findViewById(R.id.animeButton);
        gamesButton = (Button) findViewById(R.id.gamesButton);
        jobButton = (Button) findViewById(R.id.jobButton);
        kpopButton = (Button) findViewById(R.id.kpopButton);
        artText = (TextView) findViewById(R.id.artText);
        animeText = (TextView) findViewById(R.id.animeText);

        setupListeners();



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
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


        private void changeArtVisibility()
    {

        if(artText.getVisibility() == View.VISIBLE)
        {
            artText.setVisibility(View.GONE);
        }
        else
        {
            artText.setVisibility(View.VISIBLE);
        }

        private void changeAnimeVisibility()
    {
        if(animeText.getVisibility() == View.VISIBLE)
        {
            animeText.setVisibility(View.GONE);
        }
        else
        {
            animeText.setVisibility(View.VISIBLE);
        }
    }






    }


        private void setupListeners()
        {
            artButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View buttonView) {
                    changeArtVisibility();
                }

            });
            animeButton.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View buttonView)
                {
                    changeAnimeVisibility();
                }
            });
        }
}


