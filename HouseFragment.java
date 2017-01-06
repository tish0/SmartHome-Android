package com.peneff.smarthome;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HouseFragment extends Fragment {


    public HouseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_house, container, false);

        String[] menuItems ={"    Garage ",
                             "HouseTemp",
                             "   Weather",
                             "      Help "};

        ListView LV = (ListView) view.findViewById(R.id.HF);



        ArrayAdapter<String> LVA = new ArrayAdapter<String>
                (getActivity(),
                android.R.layout.simple_list_item_1,menuItems);

        LV.setAdapter(LVA);

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                   Toast.makeText(getActivity(), "Garage Menu", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(),GarageActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Toast.makeText(getActivity(), "HouseTemp Menu", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(),HouseTempActivity.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Toast.makeText(getActivity(), "Weather Menu", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(),WeatherActivity.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Toast.makeText(getActivity(), "Help Menu", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(),HelpActivity.class);
                    startActivity(intent);
                }
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
