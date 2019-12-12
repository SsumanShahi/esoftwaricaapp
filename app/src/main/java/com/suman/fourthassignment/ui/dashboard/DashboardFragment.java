package com.suman.fourthassignment.ui.dashboard;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.ListAdapter;

import com.suman.fourthassignment.MainActivity;
import com.suman.fourthassignment.R;
import com.suman.fourthassignment.ui.Contacts;
import com.suman.fourthassignment.ui.ContactsAdapter;
import com.suman.fourthassignment.ui.home.HomeFragment;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment implements View.OnClickListener{

    private EditText fullname, age,address;
    private Button btnadd;
    private RadioGroup rdgroup;
    private RadioButton male, female, other;





    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        fullname = view.findViewById(R.id.fullname);
        age = view.findViewById(R.id.age);
        address = view.findViewById(R.id.address);
        btnadd = view.findViewById(R.id.btnadd);
        rdgroup = view.findViewById(R.id.rdgroup);
        male = view.findViewById(R.id.male);
        female = view.findViewById(R.id.female);
        other = view.findViewById(R.id.other);

        btnadd.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(fullname.getText())){
            fullname.setError("Please enter full name");
            fullname.requestFocus();
            return;
        }
        else if(TextUtils.isEmpty(age.getText())){
            age.setError("Please enter age");
            age.requestFocus();
            return;
        }
        else if(TextUtils.isEmpty(address.getText())){
            address.setError("Please enter address");
            address.requestFocus();
            return;
        }

        if(v.getId() == R.id.btnadd)
        {
            String fname, Age, Address;
            fname = fullname.getText().toString();
            Age = age.getText().toString();
            Address = address.getText().toString();

            final List<Contacts> contactsList = new ArrayList<>();

           // contactsList.add(fullname.getText().toString());

            Toast.makeText(getContext(), "Student Details is Added", Toast.LENGTH_SHORT).show();

        }


    }
}