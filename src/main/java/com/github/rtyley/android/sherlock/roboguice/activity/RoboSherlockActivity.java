/*
 * Copyright 2012 Jake Wharton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.github.rtyley.android.sherlock.roboguice.activity;

import android.os.Bundle;
import com.actionbarsherlock.app.SherlockActivity;
import com.path.di.Injector;

/**
 * An example of how to make your own Robo-enabled Sherlock activity. Feel free
 * to do with with any of the other Sherlock activity types!
 */
public class RoboSherlockActivity extends SherlockActivity {
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
