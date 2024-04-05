package com.etsy.android.uikit;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.etsy.android.R;

public abstract class BasePreferenceActivity extends BaseActivity {
    public void initActionBar() {
        setSupportActionBar((Toolbar) findViewById(R.id.app_bar_toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo1190s(true);
            supportActionBar.mo1192u(true);
            supportActionBar.mo1165B();
            supportActionBar.mo1168E(getString(R.string.config));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_base_preference);
        initActionBar();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (getSupportFragmentManager().mo10355E() > 0) {
            if (!(getCurrentFocus() == null || getCurrentFocus().getWindowToken() == null)) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
            }
            getSupportFragmentManager().mo10363P();
            return true;
        }
        finish();
        return true;
    }
}
