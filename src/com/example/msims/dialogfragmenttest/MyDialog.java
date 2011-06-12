package com.example.msims.dialogfragmenttest;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MyDialog extends DialogFragment {

    /*
     * Order of initialization:
     * onCreate()
     * onCreateDialog()
     * onCreateView()
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("Flubber", "onCreate");
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_FRAME, 0);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Log.d("Flubber", "onCreateDialog");
        return super.onCreateDialog(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("Flubber", "onCreateView");

        /* Inflate something here */
        View view = inflater.inflate(R.layout.my_dialog, null, false);
        Button dismissButton = (Button) view.findViewById(R.id.dismiss_button);
        dismissButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dismiss();
            }
        });

        return view;
    }
}
