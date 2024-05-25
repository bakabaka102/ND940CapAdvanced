package com.example.android.politicalpreparedness.basecontent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<VB : ViewDataBinding> : Fragment(), IBaseFragment {

    private var _mFragmentBinding: VB? = null
    protected val mFragmentBinding get() = _mFragmentBinding!!

    abstract fun layoutViewDataBinding(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _mFragmentBinding =
            DataBindingUtil.inflate(layoutInflater, layoutViewDataBinding(), container, false)
        //initViewModel()
        return _mFragmentBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData(arguments)
        initViews()
        initActions()
        initObservers()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _mFragmentBinding = null
    }

}