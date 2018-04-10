package com.connect.dsb;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

 public class EventAdapter extends RecyclerView.Adapter<EventAdapter.MyViewHolder> {
     TextView titlee;
     ImageView events;
     CardView cardView;
    private Context context;
    private List<EventBean> list;
   // Dialog mdialog;

    public EventAdapter(Context context, List<EventBean> list) {
        this.context = context;
        this.list = list;
    }

    @SuppressLint("ResourceType")
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater=LayoutInflater.from(context);
       // view=layoutInflater.inflate(R.id.linear,parent,false);
        view=layoutInflater.inflate(R.layout.event_cardview_item  ,parent,false);
//        AlertDialog.Builder builder=new AlertDialog.Builder(context);
//        builder.setTitle("Events");

        return new MyViewHolder(view);

    }

     @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.titlee.setText(list.get(position).getTitle());
        holder.events.setImageResource(list.get(position).getThumbnail());

        //set click listener
      //  mdialog=new Dialog(context);
//        mdialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
//        mdialog.setContentView(View.inflate().inflate(R.layout.event_cardview_item
//                , null));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView textViewclose;
//                mdialog.setContentView(R.layout.custom_popup);


                final Dialog mdialog = new Dialog(context);
                mdialog.setContentView(R.layout.custom_popup);
                textViewclose=(TextView)mdialog.findViewById(R.id.close);
                TextView title = (TextView) mdialog.findViewById(R.id.titlee);
                TextView category = (TextView) mdialog.findViewById(R.id.category);
                TextView description = (TextView) mdialog.findViewById(R.id.description);
               // title.setText(titlee);
                ImageView imageView=(ImageView)mdialog.findViewById(R.id.image);
                imageView.setImageResource(list.get(position).getThumbnail());
                title.setText(list.get(position).getTitle());
                category.setText(list.get(position).getCategory());
                description.setText(list.get(position).getDescription());


                textViewclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mdialog.dismiss();
                    }
                });
                mdialog.show();




//                showPopup(v);
//                Intent intent=new Intent(context,custom_popup.class);
//                intent.putExtra("title",list.get(position).getTitle());
//                intent.putExtra("Description",list.get(position).getDescription());
//                intent.putExtra("thumbnail",list.get(position).getThumbnail());
//                context.startActivity(intent);




            }
        });



    }
//
//    public void showPopup(View view )
//    {
//        TextView textViewclose;
//        mdialog.setContentView(R.layout.custom_popup);
//        mdialog.setTitle("events");
//        textViewclose=(TextView)mdialog.findViewById(R.id.close);
//        final Dialog dialog = new Dialog(context);
//        dialog.setContentView(R.layout.custom_popup);
//        TextView title = (TextView) dialog.findViewById(R.id.titlee);
//        ImageView imageView=(ImageView)dialog.findViewById(R.id.image);
//        imageView.setImageResource(R.drawable.image1);
//
//        textViewclose.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mdialog.dismiss();
//            }
//        });
//        mdialog.show();
//    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView titlee;
        ImageView events;
        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);
            titlee=(TextView)itemView.findViewById(R.id.event_title);
            events=(ImageView)itemView.findViewById(R.id.events);
            cardView=(CardView)itemView.findViewById(R.id.card_view);




        }
    }
}
