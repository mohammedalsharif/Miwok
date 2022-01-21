package com.examples.miwok.Ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.examples.miwok.Adapter.WordAdapter;
import com.examples.miwok.R;
import com.examples.miwok.model.Word;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentCategory#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentCategory extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_ListWords = "ListWords";
    private static final String ARG_COLORLIST = "ColorList";

    // TODO: Rename and change types of parameters
    private ArrayList<Word> wordsList;
    private int colorList;

    public FragmentCategory() {
        // Required empty public constructor
    }

    public static FragmentCategory newInstance(ArrayList<Word> words, int colorList) {

        Bundle args = new Bundle();
        args.putSerializable(ARG_ListWords, words);
        args.putInt(ARG_COLORLIST,colorList);

        FragmentCategory fragment = new FragmentCategory();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            wordsList = (ArrayList<Word>) getArguments().getSerializable(ARG_ListWords);
            colorList = getArguments().getInt(ARG_COLORLIST);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.word_list, container, false);

        ListView lvNumber = view.findViewById(R.id.list);

        WordAdapter  itemsAdapter = new WordAdapter(getActivity(),wordsList,getResources().getColor(colorList));

        lvNumber.setAdapter(itemsAdapter);

        return view;
    }
}