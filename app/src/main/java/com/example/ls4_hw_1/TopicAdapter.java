    package com.example.ls4_hw_1;

    import static android.content.ContentValues.TAG;

    import android.content.ContentResolver;
    import android.content.Context;
    import android.graphics.Bitmap;
    import android.graphics.BitmapFactory;
    import android.graphics.Color;
    import android.net.Uri;
    import android.util.Log;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.ImageView;
    import android.widget.TextView;

    import androidx.annotation.NonNull;
    import androidx.recyclerview.widget.RecyclerView;

    import com.squareup.picasso.Picasso;

    import java.util.ArrayList;

    public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.MyViewHolder> {
        private ArrayList<Topic> topicArrayList;
        private Context context;

        public TopicAdapter(ArrayList<Topic> topicArrayList, Context context) {
            this.topicArrayList = topicArrayList;
            this.context = context;
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.custom_layout_hienthiitem, parent, false);

            MyViewHolder myViewHolder = new MyViewHolder(view);
            return myViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

            Topic topic = topicArrayList.get(position);
            holder.txtHeader.setText(topic.getHeader());
            holder.txtFan.setText(topic.getFan());
            holder.txtNewPost.setText(topic.getPost());
            holder.txtGroup.setText(topic.getGroup());
            holder.imv.setImageResource(topic.getImg());

    //        Picasso.with(context).load(uri).into(holder.imv);



            int id = topic.getIdGroup();
            if (id == 1) holder.txtGroup.setTextColor(Color.rgb(126,121,121));
            else if(id == 2) holder.txtGroup.setTextColor(Color.rgb(255,152,0));
            else if (id == 3) holder.txtGroup.setTextColor(Color.rgb(0,204,255));

        }

        @Override
        public int getItemCount() {
            return topicArrayList.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder{
            private TextView txtHeader;
            private TextView txtFan;
            private TextView txtNewPost;
            private TextView txtGroup;
            private ImageView imv;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                txtHeader = itemView.findViewById(R.id.txtHeader);
                txtFan = itemView.findViewById(R.id.txtFan);
                txtNewPost = itemView.findViewById(R.id.txtNewPost);
                txtGroup = itemView.findViewById(R.id.txtGroup);
                imv = itemView.findViewById(R.id.imv);



            }
        }

    }
