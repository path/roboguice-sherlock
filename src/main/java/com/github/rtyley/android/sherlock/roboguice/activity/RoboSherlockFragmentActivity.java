package com.github.rtyley.android.sherlock.roboguice.activity;

import android.os.Bundle;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.path.di.Injector;

public class RoboSherlockFragmentActivity extends SherlockFragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Injector.agent.injectMembersWithoutViews(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Injector.agent.injectViewMembers(this);
    }

}
