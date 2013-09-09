package com.path.di;

import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 * for transition
 */
public class Injector {
    public static Agent agent;
    public interface Agent {
        public void injectMembersWithoutViews(Object object);
        public void injectViewMembers(android.app.Activity object);
        public void injectViewMembers(Fragment object);
    }
}
