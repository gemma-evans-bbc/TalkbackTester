package uk.co.bbc.talkbacktester

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.HeaderViewListAdapter
import kotlinx.android.synthetic.main.list_heading_item.*
import kotlinx.android.synthetic.main.list_heading_item.view.*
import kotlinx.android.synthetic.main.list_view_example.*


class ListViewExampleFragment : Fragment() {

    private lateinit var arrayAdapter: ArrayAdapter<String>

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        listView.adapter = ArrayAdapter<String>(context, R.layout.list_item, R.id.list_item_text_view, resources.getStringArray(R.array.colours))
        val headingView = layoutInflater.inflate(R.layout.list_heading_item, listView, false)
        headingView.list_heading_item_text_view.setText("Colours")
        listView.addHeaderView(headingView, null, false)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.list_view_example, container, false)
    }
}