package com.example.m.praswipepage;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragment extends Fragment {


    public PageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_page,container,false);
       Bundle bundle =  getArguments();
        int liczbaStrony = bundle.getInt("count");
        TextView tekst = (TextView)view.findViewById(R.id.textView);
        tekst.setText(String.valueOf(liczbaStrony));
        return view;
    }

}
