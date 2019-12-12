package com.suman.fourthassignment.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.suman.fourthassignment.R;

import java.util.ArrayList;
import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {

    Context mContext;
    List<Contacts> contactsList = new ArrayList<>();

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
        holder.stfullname.setText(contacts.getName());
        holder.st_age.setText(contacts.getAge());
        holder.staddress.setText(contacts.getAddress());
        holder.stgender.setText(contacts.getGender());
//        holder.delete.setImageResource(R.drawable.ic_delete);
        holder.stimage.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_delete_black_24dp));



        String gen= contacts.getGender();

        if(gen=="Male"){
            holder.stimage.setImageResource(R.drawable.male);
//            holder.imageview.setImageDrawable(mContext.getResources().getDrawable(R.drawable.man));

        }
        else if(gen=="Female"){
            holder.stimage.setImageDrawable(mContext.getResources().getDrawable(R.drawable.female));

        }
        else{
            holder.stimage.setImageDrawable(mContext.getResources().getDrawable(R.drawable.female));


        }



        holder.stimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"Hey "+contacts.getName(), Toast.LENGTH_SHORT).show();
            }
        });


        holder.stdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Contacts cn=contactsList.get(position);

                // Remove the item on remove/button click
                contactsList.remove(position);

                notifyItemRemoved(position);

                notifyItemRangeChanged(position,contactsList.size());

                // Show the removed item label
                Toast.makeText(mContext,"Removed : " + cn.getName(),Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }


    public class ContactsViewHolder extends RecyclerView.ViewHolder {

        ImageView stimage,stdelete;
        TextView stfullname,st_age,staddress,stgender;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            stimage= itemView.findViewById(R.id.stimage);
            stfullname = itemView.findViewById(R.id.stfullname);
            st_age=itemView.findViewById(R.id.st_age);
            staddress=itemView.findViewById(R.id.staddress);
            stgender =itemView.findViewById(R.id.stgender);
            stdelete=itemView.findViewById(R.id.stdelete);

        }
    }
}
