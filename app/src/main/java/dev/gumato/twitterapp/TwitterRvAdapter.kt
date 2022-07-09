package dev.gumato.twitterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter(var twitterList: List<Twitter>): RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_list_item,parent,false)
        return  TwitterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter = twitterList.get(position)
        holder.tvHandle.text = currentTwitter.Handle
        holder.tvName.text = currentTwitter.Name
        holder.tvTweet.text = currentTwitter.Tweet
        holder.tvNum1.text = currentTwitter.Num1
        holder.tvNum2.text = currentTwitter.Num2
        holder.tvNum2.text = currentTwitter.Num3
    }

    override fun getItemCount(): Int {
        return  twitterList.size
    }
}
class TwitterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
        var tvName = itemView.findViewById<TextView>(R.id.tvName)
        var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
        var tvNum1 = itemView.findViewById<TextView>(R.id.tvNum1)
        var tvNum2 = itemView.findViewById<TextView>(R.id.tvNum2)
        var tvNum3 = itemView.findViewById<TextView>(R.id.tvNum3)
        var imgGume = itemView.findViewById<ImageView>(R.id.imgGume)
        var imgReplies = itemView.findViewById<ImageView>(R.id.imgReplies)
        var imgRetweet = itemView.findViewById<ImageView>(R.id.imgRetweet)
        var imgLikes = itemView.findViewById<ImageView>(R.id.imgLikes)
        var imgShare = itemView.findViewById<ImageView>(R.id.imgShare)

}