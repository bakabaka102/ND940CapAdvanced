package com.example.android.politicalpreparedness.election.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter

@BindingAdapter("bindLinkToView")
fun TextView.linkToView(url: String?) {
    this.text = HtmlCompat.fromHtml("<u>$url</u>", HtmlCompat.FROM_HTML_MODE_COMPACT)
    if (url.isNullOrBlank()) {
        this.visibility = View.VISIBLE
        return
    }
    this.setOnClickListener {
        this.context.setIntent(url)
    }
}

private fun Context.setIntent(url: String) {
    val uri = Uri.parse(url)
    val intent = Intent(Intent.ACTION_VIEW, uri)
    this.startActivity(intent)
}