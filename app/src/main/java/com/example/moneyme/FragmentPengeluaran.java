package com.example.moneyme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentPengeluaran#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentPengeluaran extends Fragment {

    private RecyclerView recyclerView;
    private KeuanganAdapter keuanganAdapter;
    private ArrayList<Keuangan> listPengeluaran;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentPengeluaran() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PengeluaranFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentPengeluaran newInstance(String param1, String param2) {
        FragmentPengeluaran fragment = new FragmentPengeluaran();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pemasukkan, container, false);

        getData();

        recyclerView = view.findViewById(R.id.rv_keuangan);
        keuanganAdapter = new KeuanganAdapter(listPengeluaran);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(keuanganAdapter);

        return view;
    }

    public void getData (){
        listPengeluaran = new ArrayList<>();
        listPengeluaran.add(new Keuangan("Sabun", "1500000", "7 April 2021"));
        listPengeluaran.add(new Keuangan("Bayar Pajak", "1500000", "7 April 2021"));
        listPengeluaran.add(new Keuangan("Bensin", "100000", "7 April 2021"));
        listPengeluaran.add(new Keuangan("Internet", "1500000", "7 April 2021"));
        listPengeluaran.add(new Keuangan("Makan", "100000", "7 April 2021"));
        listPengeluaran.add(new Keuangan("Listrik", "1500000", "7 April 2021"));
        listPengeluaran.add(new Keuangan("Baju", "100000", "7 April 2021"));
        listPengeluaran.add(new Keuangan("Motor", "1500000", "7 April 2021"));
    }
}