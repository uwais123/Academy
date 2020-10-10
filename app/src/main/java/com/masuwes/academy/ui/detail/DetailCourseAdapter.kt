package com.masuwes.academy.ui.detail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.masuwes.academy.R
import com.masuwes.academy.data.ModuleEntity
import kotlinx.android.synthetic.main.items_module_list.view.*

class DetailCourseAdapter: RecyclerView.Adapter<DetailCourseAdapter.ViewHolder>() {

    private val listModule = ArrayList<ModuleEntity>()

    fun setModules(modules: List<ModuleEntity>?) {
        if (modules == null) return
        listModule.clear()
        listModule.addAll(modules)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailCourseAdapter.ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.items_module_list, parent, false)
        )

    override fun onBindViewHolder(holder: DetailCourseAdapter.ViewHolder, position: Int) {
        val data = listModule[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listModule.size

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bind(module: ModuleEntity) {
            with(itemView) {
                text_module_title.text = module.title
            }
        }
    }

}















