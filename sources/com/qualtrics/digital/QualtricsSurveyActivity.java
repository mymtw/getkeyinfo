package com.qualtrics.digital;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.etsy.android.R;

public class QualtricsSurveyActivity extends AppCompatActivity {
    public ViewGroup linearLayout;

    public void finish() {
        if (isTaskRoot()) {
            getApplicationContext().startActivity(getApplicationContext().getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName()));
            return;
        }
        super.finish();
        overridePendingTransition(17432576, 17432577);
    }

    public void onBackPressed() {
        if (isTaskRoot()) {
            getApplicationContext().startActivity(getApplicationContext().getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName()));
            return;
        }
        super.onBackPressed();
        overridePendingTransition(17432576, 17432577);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            overridePendingTransition(17432576, 17432577);
            String stringExtra = getIntent().getStringExtra("targetURL");
            String stringExtra2 = getIntent().getStringExtra("interceptID");
            String stringExtra3 = getIntent().getStringExtra("creativeID");
            String stringExtra4 = getIntent().getStringExtra("actionSetID");
            if (stringExtra == null) {
                Log.e("Qualtrics", "Could not get target URL from intent");
            }
            setTheme(2132018119);
            if (getSupportActionBar() != null) {
                getSupportActionBar().mo1196y(R.drawable.ic_close_black_24dp);
                getSupportActionBar().mo1190s(true);
                getSupportActionBar().mo1193v(false);
            }
            getWindow().setSoftInputMode(16);
            this.linearLayout = new LinearLayout(this);
            this.linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            ((LinearLayout) this.linearLayout).setOrientation(1);
            this.linearLayout.setFitsSystemWindows(true);
            this.linearLayout.setBackgroundColor(-1);
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setId(View.generateViewId());
            this.linearLayout.addView(frameLayout);
            getFragmentManager().beginTransaction().add(frameLayout.getId(), QualtricsSurveyFragment.newInstance(stringExtra, stringExtra2, stringExtra3, stringExtra4)).commit();
            setContentView((View) this.linearLayout);
        } catch (Throwable th) {
            C17318x.m29067a().mo68224c(th);
        }
    }

    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }
}
