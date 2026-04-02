package test_project.clean

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Test_C2 : Fragment() {
    private var root: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        root = View(requireContext())
        return root!!
    }

    override fun onDestroyView() {
        root = null
        super.onDestroyView()
    }
}
