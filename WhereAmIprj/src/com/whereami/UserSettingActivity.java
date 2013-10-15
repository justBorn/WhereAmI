package com.whereami;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.whereiam.R;

public class UserSettingActivity extends PreferenceActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		addPreferencesFromResource(R.xml.settings);

	}
}