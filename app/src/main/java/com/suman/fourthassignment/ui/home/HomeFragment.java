package com.suman.fourthassignment.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.suman.fourthassignment.R;
import com.suman.fourthassignment.ui.Contacts;
import com.suman.fourthassignment.ui.ContactsAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recycleview;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recycleview = view.findViewById(R.id.recycleview);

        List<Contacts>contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Suman Shahi","nakhu","male","23",R.drawable.male, "Delete"));
        contactsList.add(new Contacts("Symon Shahi","nakhu","male","21",R.drawable.male, "Delete"));
        contactsList.add(new Contacts("Manjita Shahi","nakhu","female","23",R.drawable.female, "Delete"));
        ContactsAdapter contactsAdapter = new ContactsAdapter(getContext(), contactsList);
        recycleview.setAdapter(contactsAdapter);
        recycleview.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}