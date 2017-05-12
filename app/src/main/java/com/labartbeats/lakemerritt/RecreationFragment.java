package com.labartbeats.lakemerritt;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

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
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        // Create a list of words
        ArrayList<Item> fun = new ArrayList<Item>();
        fun.add(new Item("Cleveland Cascade", "250-foot Stairway", "It was constructed in the 1920s as a park with flowing water down the center of the stairs. Though Cleveland Cascade has been dry since the ’50s, it remains as a place to add an extra kick to your workout if jogging the lake just isn’t enough."));
        fun.add(new Item("Children's Fairyland", "Children's Amusement Park", "Children’s Fairyland is a timeless reminder of the joys of standing three-feet tall."));
        fun.add(new Item("Oakland Museum of California", "Art, History and Natural Science Museum", "Children’s Fairyland is a timeless reminder of the joys of standing three-feet tall."));
        fun.add(new Item("Lake Chalet", "Restaurant", "The Lake Chalet restaurant is known for its impeccable views and, if you show up on a nice day, there’s lakeside seating available. "));

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

        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        return rootView;
    }

}
