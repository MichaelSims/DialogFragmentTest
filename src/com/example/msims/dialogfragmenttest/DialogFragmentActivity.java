package com.example.msims.dialogfragmenttest;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DialogFragmentActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.theButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                showMyDialog();
            }
        });
        showMyDialog();
    }

    private void showMyDialog() {
        FragmentManager fm = getFragmentManager();
        MyDialog myDialog = new MyDialog();
        myDialog.show(fm, "myDialog");
    }
}
