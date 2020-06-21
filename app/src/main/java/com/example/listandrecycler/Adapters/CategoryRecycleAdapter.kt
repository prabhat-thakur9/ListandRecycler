package com.example.listandrecycler.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listandrecycler.Model.Category
import com.example.listandrecycler.R
import com.example.listandrecycler.Services.DataService.categories
import kotlinx.android.synthetic.main.layout_list_view.view.*

class CategoryRecycleAdapter(val context: Context, val categories:List<Category>):RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view=LayoutInflater.from(context).inflate(R.layout.layout_list_view,null,false)
        return  Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindcategory(categories[position],context)
    }
    inner class Holder(itemView: View?):RecyclerView.ViewHolder(itemView!!){
        val imageView=itemView?.findViewById<ImageView>(R.id.categoryImage)
        val textView=itemView?.findViewById<TextView>(R.id.categorytext)
        fun bindcategory(category: Category,context: Context) {
            val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
            imageView?.setImageResource(resourceId)
            textView?.text=(category.title)
        }}
}