package com.labartbeats.lakemerritt;

import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

import static android.R.attr.fragment;
//import android.app.FragmentTransaction;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecreationFragment extends Fragment {

    public RecreationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.item_list, container, false);

        // Create a list of words
        ArrayList<Item> fun = new ArrayList<Item>();
        fun.add(new Item(R.string.cascade_title, R.string.cascade_description, R.string.cascade_text, R.drawable.cascade));
        fun.add(new Item(R.string.fairyland_title, R.string.fairyland_description, R.string.fairyland_text, R.drawable.chalet));
        fun.add(new Item(R.string.museum_title, R.string.museum_description, R.string.museum_text, R.drawable.fairyland));
        fun.add(new Item(R.string.chalet_title, R.string.chalet_description, R.string.chalet_text, R.drawable.museum));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), fun, R.color.funBackground);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // item_list.xml layout file.
        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);

        //Create a click listener to launch the detail fragment
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView < ? > adapter, View view, int position, long arg){
                //Intent detail = new Intent (getContext(), DetailFragment.class);


                //Instantiate the Fragment Manager
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                DetailFragment fragment = new DetailFragment();
                fragmentTransaction.add(R.id.viewpager, fragment);
                fragmentTransaction.commit();
            }
        });

        return rootView;


    }

}
