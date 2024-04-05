package com.qualtrics.digital;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.google.gson.C16708i;
import com.qualtrics.digital.QualtricsPopOverFragment;

public class QualtricsPopOverActivity extends AppCompatActivity implements QualtricsPopOverFragment.C17290a {
    private String mActionSetID;
    private String mAppPackageName;
    private String mCreativeID;
    private FrameLayout mFragmentContainer;
    private String mInterceptID;
    private Fragment mPlaystoreFragment;
    private String mPlaystoreURL;
    private C17312r mPopOverCreative;
    private Fragment mSurveyFragment;
    private String mURL;

    private void setCustomPropertyForButtonPressed(String str) {
        C17314t tVar = C17315u.m29063a().f37842a;
        this.mPopOverCreative.getClass();
        throw null;
    }

    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            getSupportActionBar().mo1186o(new ColorDrawable(-1));
            getSupportActionBar().mo1179h();
            getWindow().setSoftInputMode(16);
            this.mAppPackageName = getPackageName();
            String stringExtra = getIntent().getStringExtra("creative");
            this.mPopOverCreative = (C17312r) new C16708i().mo59458e(C17312r.class, stringExtra);
            this.mURL = getIntent().getStringExtra("url");
            this.mInterceptID = getIntent().getStringExtra("interceptID");
            this.mCreativeID = getIntent().getStringExtra("creativeID");
            this.mActionSetID = getIntent().getStringExtra("actionSetID");
            this.mPlaystoreURL = "https://play.google.com/store/apps/details?id=" + this.mAppPackageName;
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            this.mFragmentContainer = frameLayout;
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.mFragmentContainer.setId(View.generateViewId());
            linearLayout.addView(this.mFragmentContainer);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            this.mPlaystoreFragment = QualtricsSurveyFragment.newInstance(this.mPlaystoreURL, this.mInterceptID, this.mCreativeID, this.mActionSetID);
            this.mSurveyFragment = QualtricsSurveyFragment.newInstance(this.mURL, this.mInterceptID, this.mCreativeID, this.mActionSetID);
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().add(this.mFragmentContainer.getId(), this.mSurveyFragment).hide(this.mSurveyFragment).commit();
            fragmentManager.beginTransaction().add(this.mFragmentContainer.getId(), QualtricsPopOverFragment.newInstance(stringExtra, i)).commit();
            setContentView((View) linearLayout);
            overridePendingTransition(17432576, 0);
        } catch (Throwable th) {
            C17318x.m29067a().mo68224c(th);
            finish();
        }
    }

    public void onCreativeButtonPressed(String str) {
        if ((str.toLowerCase().equals("positive") || str.toLowerCase().equals("target")) && this.mURL != null) {
            getFragmentManager().beginTransaction().setCustomAnimations(17498112, 0).replace(this.mFragmentContainer.getId(), this.mSurveyFragment).show(this.mSurveyFragment).commit();
            setCustomPropertyForButtonPressed("target");
        } else if (str.toLowerCase().equals("appreviews")) {
            StringBuilder h = C0072d.m201h("market://details?id=");
            h.append(this.mAppPackageName);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(h.toString()));
            intent.addFlags(1208483840);
            try {
                startActivity(intent);
                finish();
            } catch (Exception unused) {
                getFragmentManager().beginTransaction().setCustomAnimations(17498112, 0).replace(this.mFragmentContainer.getId(), this.mPlaystoreFragment).commit();
            }
            setCustomPropertyForButtonPressed("appreviews");
        } else {
            finish();
            setCustomPropertyForButtonPressed(ServerDrivenAction.TYPE_DISMISS);
        }
    }

    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 17432577);
    }

    public boolean onSupportNavigateUp() {
        finish();
        overridePendingTransition(0, 17432577);
        return false;
    }
}
