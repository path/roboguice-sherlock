package com.github.rtyley.android.sherlock.roboguice.fragment;

import android.os.Bundle;
import android.view.View;
import com.actionbarsherlock.app.SherlockListFragment;
import com.path.di.Injector;

public abstract class RoboSherlockListFragment extends SherlockListFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Injector.agent.injectMembersWithoutViews(this);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Injector.agent.injectViewMembers(this);
    }
}
