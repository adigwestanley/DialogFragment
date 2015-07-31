package com.example.stanley.dialogfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;


public class AlertFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState) {
        return new AlertDialog.Builder(getActivity())

                // Set Dialog Icon
                //.setIcon(R.drawable.tenth)
                        // Set Dialog Title
                .setTitle("TestApp")
                        // Set Dialog Message
                .setMessage("Sample Dialog Fragment")
                        // Positive button
                .setPositiveButton("+", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something else
                    }
                })
                        // Positive button
                .setNegativeButton("-", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something else
                    }
                })
                .create();

    }

}