package com.suman.fourthassignment.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.suman.fourthassignment.MainActivity;
import com.suman.fourthassignment.R;
import com.suman.fourthassignment.ui.Contacts;
import com.suman.fourthassignment.ui.ContactsAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recycleview;
    List<Contacts>contactsList = new ArrayList<>();


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recycleview = view.findViewById(R.id.recycleview);

       if(MainActivity.st.isEmpty()){
           MainActivity.st.add(new Contacts("Suman Shahi","Nakkhu","Male","23"));
           MainActivity.st.add(new Contacts("Sangita Karki","Buspark","Female","22"));

           ContactsAdapter contactsAdapter = new ContactsAdapter(getContext(), MainActivity.st);
           recycleview.setLayoutManager(new LinearLayoutManager(getContext()));
           recycleview.setAdapter(contactsAdapter);
       }     else {
           ContactsAdapter contactsAdapter1 = new ContactsAdapter(getContext(),MainActivity.st);
           recycleview.setLayoutManager(new LinearLayoutManager(getContext()));
           recycleview.setAdapter(contactsAdapter1);
       }

               return view;
    }
}