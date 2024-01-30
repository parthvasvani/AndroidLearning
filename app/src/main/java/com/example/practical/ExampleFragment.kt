package com.example.practical

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ExampleFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag,"onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(tag,"Fragment onCreateView")

        return inflater.inflate(R.layout.fragment_example,container,false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(tag,"Fragment onAttach")

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(tag,"Fragment onActivityCreated")

    }

    // Called when the fragment becomes visible to the user.
    override fun onStart() {
        super.onStart()
        Log.d(tag,"Fragment onStart")
    }

    // Called when the fragment becomes interactive to the user.
    override fun onResume() {
        super.onResume()
        Log.d(tag,"Fragment onResume")

    }

    // Called when the fragment is no longer visible to the user.
    override fun onPause() {
        super.onPause()
        Log.d(tag,"Fragment onPause")

    }

    // Called when the fragment is no longer in use.
    override fun onStop() {
        super.onStop()
        Log.d(tag,"Fragment onStop")

    }

    // Called when the fragment is detached from the activity.
    override fun onDetach() {
        super.onDetach()
        Log.d(tag,"Fragment onDetach")

    }

    // Called when the fragment is destroyed.
    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag,"Fragment onDestroy")

    }

    // Called when the fragment's view is destroyed.
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(tag,"Fragment onDestroyView")
    }
}