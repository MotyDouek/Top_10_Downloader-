package com.moty.top10downloader

import android.content.Context
import android.view.LayoutInflater
import android.widget.ArrayAdapter

class FeedAdapter(context: Context, val resource: Int): ArrayAdapter<FeedEntry>(context, resource) {
    private val TAG = "FeedAdapter"
    private val inflater = LayoutInflater.from(context)
}