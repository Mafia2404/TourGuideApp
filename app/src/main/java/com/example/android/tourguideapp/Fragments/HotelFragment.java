package com.example.android.tourguideapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.tourguideapp.Adapers.DataAdapter;
import com.example.android.tourguideapp.Model.Data;
import com.example.android.tourguideapp.R;

import java.util.ArrayList;
import java.util.List;

public class HotelFragment extends Fragment {
    View view;
    RecyclerView hotelrecyler;
    DataAdapter hotelAdapter;
    List<Data>  hoteldata;

    public HotelFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_hotel,container,false);

    hotelrecyler=(RecyclerView) view.findViewById(R.id.hotel_recycler);
    hotelAdapter=new DataAdapter(getContext(),hoteldata);
    hotelrecyler.setLayoutManager(new LinearLayoutManager(getActivity()));
    hotelrecyler.setAdapter(hotelAdapter);
        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hoteldata=new ArrayList<>();
        hoteldata.add(new Data("JW Marriot",R.drawable.hotel_jw));
        hoteldata.add(new Data("Taj Hotel",R.drawable.hotel_taj));
        hoteldata.add(new Data("Hyatt",R.drawable.hotel_hyat));
        hoteldata.add(new Data("Novotel",R.drawable.hotel_nov));
        hoteldata.add(new Data("Ritz Carlton",R.drawable.hotel_ritzcarlton));
    }
}
