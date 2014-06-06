package co.helloxprototype.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseFacebookUtils;
import com.parse.ParseUser;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Lims on 6/5/2014.
 */
public class SelectIntent extends Activity{

    private Dialog progressDialog;

    private Button teachButton;
    private Button learnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.select_intent);

        learnButton = (Button) findViewById(R.id.learn);
        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLearnButtonClicked();
            }
        });

        teachButton = (Button) findViewById(R.id.teach);
        teachButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onTeachButtonClicked();
            }
        });

    }

    private void onLearnButtonClicked() {
        SelectIntent.this.progressDialog = ProgressDialog.show(
                SelectIntent.this, "", "Logging in...", true);

        Intent intent = new Intent(this, LearnRegistration.class);
        startActivity(intent);
    }

    private void onTeachButtonClicked() {
        SelectIntent.this.progressDialog = ProgressDialog.show(
                SelectIntent.this, "", "Logging in...", true);

        Intent intent = new Intent(this, TeachRegistration.class);
        startActivity(intent);
    }
}
