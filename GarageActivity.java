package com.peneff.smarthome;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class GarageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);


        // 8.	Add a setOnCheckedChanged() callback handler to the Switch object

        Switch mySwitch = (Switch) findViewById(R.id.switchDoor);
        //set the switch to on
        mySwitch.setChecked(true);

        // attaching the listerning to check if th state changes

        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Context context = getApplicationContext();

                if (isChecked) { // if the switch is checked
                    CharSequence text = "Door Open"; // the text message that will show in the toast
                    int duration = Toast.LENGTH_SHORT; // setting the duration the toast is on screen for
                    Toast toast = Toast.makeText(context, text, duration); // making Toast object toast
                    toast.show(); // displaying toast object on bottom of screen


                } else { // if the switch is not checked
                    CharSequence text = "Door Closed";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show(); // displaying toast object on bottom of screen

                }

            }
        });


        // 8.	Add a setOnCheckedChanged() callback handler to the Switch object

        Switch SwitchLight = (Switch) findViewById(R.id.switchLight);
        //set the switch to on
        SwitchLight.setChecked(true);

        // attaching the listerning to check if th state changes

        SwitchLight.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Context context = getApplicationContext();

                if (isChecked) { // if the switch is checked
                    CharSequence text = "Light On"; // the text message that will show in the toast
                    int duration = Toast.LENGTH_SHORT; // setting the duration the toast is on screen for
                    Toast toast = Toast.makeText(context, text, duration); // making Toast object toast
                    toast.show(); // displaying toast object on bottom of screen


                } else { // if the switch is not checked
                    CharSequence text = "Light Off";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show(); // displaying toast object on bottom of screen

                }

            }
        });

    }
}
