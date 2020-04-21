package com.rhinotrivaldi.eduwaste.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rhinotrivaldi.eduwaste.DetailActivity
import com.rhinotrivaldi.eduwaste.Limbah
import com.rhinotrivaldi.eduwaste.R

class ListLimbahAdapter (val listLimbah: ArrayList<Limbah>) : RecyclerView.Adapter<ListLimbahAdapter.ListViewHolder>() {



    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.layout_materi, viewGroup, false)
        return ListViewHolder(view)
    }


    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, detail, photo, advancedManagent, hazardCode) = listLimbah[position]
        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {

            val moveDetail = Intent(mContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_GAMBAR, photo)
            moveDetail.putExtra(DetailActivity.EXTRA_NAMA_LIMBAH, name)
            moveDetail.putExtra(DetailActivity.EXTRA_DETAIL_LIMBAH, detail)
            moveDetail.putExtra(DetailActivity.EXTRA_DETAIL_PENGELOLAAN, advancedManagent)
            moveDetail.putExtra(DetailActivity.EXTRA_KODE_LIMBAH, hazardCode)
            mContext.startActivity(moveDetail)
        }

        holder.tvName.text = name
        holder.tvDetail.text = detail

    }


    override fun getItemCount(): Int {
        return listLimbah.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tvNamaLimbah)
        var tvDetail: TextView = itemView.findViewById(R.id.tvLimbahDetail)
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Limbah)
    }
}