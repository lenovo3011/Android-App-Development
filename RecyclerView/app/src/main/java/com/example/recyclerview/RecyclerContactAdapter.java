package com.example.recyclerview;

import static android.widget.Toast.LENGTH_SHORT;

import static androidx.core.content.res.TypedArrayUtils.getText;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {
    Context context ;
    private int lastPosition = -1 ;
    ArrayList<ContactModel> arrContacts ;
     RecyclerContactAdapter (Context context, ArrayList<ContactModel> arrContacts) {
        this.context = context ;
        this.arrContacts = arrContacts ;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false) ;
        ViewHolder viewHolder = new ViewHolder(view) ;
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgContact.setImageResource(arrContacts.get(position).img);
        holder.txtName.setText(arrContacts.get(position).name);
        holder.txtNumber.setText(arrContacts.get(position).number);
        holder.index.setText((arrContacts.get(position).index));
        setAnimation(holder.itemView, position);
        holder.row.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Dialog d2 = new Dialog(context) ;
                d2.setContentView(R.layout.addcontact);
                EditText name = d2.findViewById(R.id.name) ;
                TextView t1 = d2.findViewById(R.id.t1) ;
                EditText number = d2.findViewById(R.id.number) ;
                Button update = d2.findViewById(R.id.save) ;
                d2.show();
                update.setText("Update");
                t1.setText("Update Contact");
                name.setText(arrContacts.get(position).name);
                number.setText(arrContacts.get(position).number) ;
                update.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name1 = name.getText().toString() ;
                        String number1 = number.getText().toString() ;

                        if (!name1.isEmpty() && !number1.isEmpty()) {
                            Toast.makeText(context, "Contact Updated", LENGTH_SHORT).show();
                            d2.dismiss();

                       }

                        else (Toast.makeText(context , "Missing inputs" , LENGTH_SHORT)).show() ;

                        arrContacts.set(position, new ContactModel(R.drawable.baseline_account_box_24, name1, number1, arrContacts.size() + 1 +"")) ;
                        notifyItemChanged(position);

                    }
                });
            }
        });
        holder.row.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle("Delete contact")
                        .setMessage("Are you really want to delete this contact ? ")
                        .setIcon(R.drawable.delete)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            arrContacts.remove(position) ;
                            notifyItemRemoved(position);
                            Toast.makeText(context , "Contact Deleted" , LENGTH_SHORT ) .show () ;
                            }
                        })

                         .setNegativeButton("No", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 Toast.makeText(context, "Operation Cancelled" , LENGTH_SHORT).show();

                             }
                         });
                builder.show();
                return true;
            }
        });


    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtNumber, index ;
        ImageView imgContact ;
        CardView row ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.contactname) ;
            txtNumber = itemView.findViewById(R.id.contactnumber) ;
            imgContact = itemView.findViewById(R.id.image) ;
            index = itemView.findViewById(R.id.index) ;
            row = itemView.findViewById(R.id.row) ;

        }
    }


    private void setAnimation (View viewanimation , int position) {
         if (position>lastPosition) {

         Animation slidein = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left) ;
         viewanimation.startAnimation(slidein);    }
            lastPosition = position ;
     }

}
