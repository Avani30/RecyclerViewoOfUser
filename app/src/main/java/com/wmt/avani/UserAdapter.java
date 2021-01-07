package com.wmt.avani;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {


    private List<User> userList;
    private Context context;

    private static int currentPosition = 0;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    public UserViewHolder onCreateViewHolder() {
        return onCreateViewHolder();
    }

    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.users, parent, false);
        UserViewHolder viewHolder = new UserViewHolder(v);

        return viewHolder;
    }

    @NonNull
    @Override

    public void onBindViewHolder(final UserViewHolder holder, final int position) {
        User user = userList.get(position);
        holder.textViewFname.setText(user.getFname());
        holder.textViewLname.setText(user.getLname());
        holder.textViewEmail.setText(user.getEmail());
        holder.textViewDob.setText(user.getDob());
        holder.linearLayout.setVisibility(View.GONE);

        //if the position is equals to the item position which is to be expanded
        if (currentPosition == position) {
            //creating an animation

            //toggling visibility
            holder.linearLayout.setVisibility(View.VISIBLE);

            //adding sliding effect
        }
    }

    public int getItemCount() {
        return userList.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {
        TextView textViewFname, textViewLname, textViewEmail, textViewDob;
        ImageView imageView;
        LinearLayout linearLayout;

        UserViewHolder(View itemView) {
            super(itemView);

            textViewFname = itemView.findViewById(R.id.textViewFname);
            textViewLname = itemView.findViewById(R.id.textViewLname);
            textViewEmail = itemView.findViewById(R.id.textViewEmail);
            textViewDob = itemView.findViewById(R.id.textViewDob);

            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}

