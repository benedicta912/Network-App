package com.chinye.networkapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chinye.networkapp.databinding.UserItemBinding
import com.chinye.networkapp.models.User

class UserAdapter(var users: List<User>):
RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    class UserViewHolder(private val binding: UserItemBinding):
            RecyclerView.ViewHolder(binding.root){
              fun bindUser(user: User){
                  binding.apply {
                      nameText.text = user.name
                      emailText.text = user.email
                      streetText.text = user.address.street
                  }

              }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = UserItemBinding.inflate(LayoutInflater.from(parent.context))
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bindUser(users[position])
    }

    override fun getItemCount(): Int {
      return users.size
    }
}