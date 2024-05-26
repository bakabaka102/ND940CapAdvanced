package com.example.android.politicalpreparedness.basecontent

import android.os.Bundle

interface IBaseFragment {

    fun initData(data: Bundle?)

    /**
     * Init views in screen (e.g., a adapter, layout manager for RecycleView).
     */
    fun initViews()

    /**
     * Declare listener on views (e.g., listen click on button, view)
     */
    fun initActions()

    /**
     * Observe states from ViewModel to update views.
     * Make sure that this method is called after [initViews]
     * because the views are need to ready to display data.
     */
    fun initObservers()
}