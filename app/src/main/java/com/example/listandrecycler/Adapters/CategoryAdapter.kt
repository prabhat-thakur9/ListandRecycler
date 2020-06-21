package com.example.listandrecycler.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.listandrecycler.Model.Category
import com.example.listandrecycler.R
import java.text.FieldPosition

class CategoryAdapter(context:Context,categories:List<Category>): BaseAdapter() {
    val context=context
    val categories=categories
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView:View
        val holder:ViewHolder
        holder=ViewHolder()
        if(convertView==null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.layout_list_view, null)

            holder.imageView= categoryView.findViewById(R.id.categoryImage)
            holder.textView= categoryView.findViewById(R.id.categorytext)
            categoryView.tag=holder
        }

        else{
            convertView.tag as ViewHolder
            categoryView=convertView

        }
        val category=categories[position]
        val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.imageView?.setImageResource(resourceId)
        holder.textView?.text=category.title
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
    private class ViewHolder{
        var imageView:ImageView?=null;
        var textView:TextView?=null;
    }
}