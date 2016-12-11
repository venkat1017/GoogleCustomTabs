package googlecustomtabs.androidxu.com.googlecustomtabs;

import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchtabs(View view)
    {
        final CustomTabsIntent intent  =  new CustomTabsIntent.Builder().build();
        final String URL="http://www.androidxu.com";
        intent.launchUrl(this, Uri.parse(URL));
    }
}
