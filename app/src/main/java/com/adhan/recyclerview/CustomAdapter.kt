package com.adhan.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val userlist:ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(p0?.context).inflate(R.layout.list_layout,p0,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userlist.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val user:User=userlist[p1]

        p0?.textviewName?.text=user.name
        p0?.textviewAddress?.text=user.address
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
     val textviewName=itemView.findViewById(R.id.txtviewName) as TextView
     val textviewAddress=itemView.findViewById(R.id.txtviewAddress) as TextView
    }
}