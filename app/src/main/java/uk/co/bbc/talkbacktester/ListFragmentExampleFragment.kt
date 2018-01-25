package uk.co.bbc.talkbacktester

import android.content.Context
import android.os.Bundle
import android.support.v4.app.ListFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter

class ListFragmentExampleFragment : ListFragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        listAdapter =  ArrayAdapter<String>(context, R.layout.list_item, R.id.list_item_text_view, getResources().getStringArray(R.array.colours))

    }

}