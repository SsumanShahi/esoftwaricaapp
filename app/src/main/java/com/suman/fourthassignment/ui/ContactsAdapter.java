package com.suman.fourthassignment.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.suman.fourthassignment.R;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {

    Context mContext;
    List<Contacts> contactsList;

    //constructor to receive data from the activity
    public ContactsAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_contact, parent, false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, final int position) {
        final Contacts contacts = contactsList.get(position);
        holder.btndelete.setText(contacts.getDelimgID());
        holder.img.setImageResource(contacts.getImageID());
        holder.name.setText(contacts.getName());
        holder.address.setText(contacts.getAddress());
        holder.age.setText(contacts.getAge());
        holder.gen.setText(contacts.getGender());


        holder.btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactsList.remove(position);
                notifyItemRemoved(position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }


    public class ContactsViewHolder extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView age, gen, address, name;
        private Button btndelete;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            age = itemView.findViewById(R.id.age);
            gen = itemView.findViewById(R.id.gen);
            address = itemView.findViewById(R.id.address);
            name = itemView.findViewById(R.id.name);
            btndelete = itemView.findViewById(R.id.btndelete);
        }
    }
}
