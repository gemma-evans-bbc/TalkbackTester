package uk.co.bbc.talkbacktester

import android.os.Bundle
import android.preference.PreferenceFragment
import android.support.v4.app.Fragment
import android.support.v7.preference.PreferenceFragmentCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.HeaderViewListAdapter
import kotlinx.android.synthetic.main.list_heading_item.*
import kotlinx.android.synthetic.main.list_heading_item.view.*
import kotlinx.android.synthetic.main.list_view_example.*


class PreferenceFragmentExampleFragment : PreferenceFragmentCompat() {



    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences)
    }
}