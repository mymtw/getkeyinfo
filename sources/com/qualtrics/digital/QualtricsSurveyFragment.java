package com.qualtrics.digital;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.etsy.android.R;

public class QualtricsSurveyFragment extends Fragment {
    private static final String ACTIONSETID = "actionSetID";
    private static final String CREATIVEID = "creativeID";
    private static final String INTERCEPTID = "interceptID";
    private static final String URL = "URL";
    private String actionSetID;
    private String creativeID;
    private String interceptID;
    private String targetURL;
    private WebView webView;

    public static QualtricsSurveyFragment newInstance(String str, String str2, String str3, String str4) {
        QualtricsSurveyFragment qualtricsSurveyFragment = new QualtricsSurveyFragment();
        Bundle bundle = new Bundle(4);
        bundle.putString(URL, str);
        bundle.putString(INTERCEPTID, str2);
        bundle.putString(CREATIVEID, str3);
        bundle.putString(ACTIONSETID, str4);
        qualtricsSurveyFragment.setArguments(bundle);
        return qualtricsSurveyFragment;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getActivity().getWindow().setSoftInputMode(16);
        this.interceptID = getArguments().getString(INTERCEPTID);
        this.creativeID = getArguments().getString(CREATIVEID);
        this.actionSetID = getArguments().getString(ACTIONSETID);
        this.targetURL = getArguments().getString(URL);
        WebView webView2 = new WebView(getActivity());
        this.webView = webView2;
        webView2.setBackgroundColor(-1);
        this.webView.getSettings().setJavaScriptEnabled(true);
        WebView webView3 = this.webView;
        getActivity();
        webView3.addJavascriptInterface(new C17295b0(), "android");
        this.webView.getSettings().setDomStorageEnabled(true);
        this.webView.getSettings().setLoadWithOverviewMode(true);
        this.webView.getSettings().setUseWideViewPort(true);
        this.webView.setWebViewClient(new C17291a());
        this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.webView.setFocusable(true);
        this.webView.setFocusableInTouchMode(true);
        this.webView.requestLayout();
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setFitsSystemWindows(true);
        linearLayout.setBackgroundColor(-1);
        linearLayout.addView(this.webView);
        linearLayout.setFocusable(true);
        linearLayout.setFocusableInTouchMode(true);
        this.webView.loadUrl(this.targetURL);
        return linearLayout;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            if (shouldRecordClick()) {
                C17318x.m29067a().mo68225d(this.interceptID, this.creativeID, this.actionSetID);
            }
            ActionBar supportActionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo1170G();
                supportActionBar.mo1196y(R.drawable.ic_close_black_24dp);
                supportActionBar.mo1190s(true);
                supportActionBar.mo1193v(false);
            }
        }
    }

    public void onStart() {
        super.onStart();
        if (!isHidden() && shouldRecordClick()) {
            C17318x.m29067a().mo68225d(this.interceptID, this.creativeID, this.actionSetID);
        }
    }

    public boolean shouldRecordClick() {
        return (this.interceptID == null || this.creativeID == null || this.actionSetID == null) ? false : true;
    }

    /* renamed from: com.qualtrics.digital.QualtricsSurveyFragment$a */
    public class C17291a extends WebViewClient {
        public final void onPageFinished(WebView webView, String str) {
            webView.loadUrl("javascript:window.addEventListener('message', function(postMessage) {var postMsgData = postMessage.data.split('|');if (postMsgData.includes('QualtricsEOS')) {android.postMessage(postMsgData.find(value => /^SV_/.match(value)))}})");
            Log.i("Qualtrics", "Page has loaded");
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceError.getDescription() != null) {
                StringBuilder h = C0072d.m201h("There was an error reported when loading the survey: ");
                h.append(webResourceError.getDescription().toString());
                Log.e("Qualtrics", h.toString());
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            Log.e("Qualtrics", "There was an error reported when loading the survey: " + str);
        }
    }
}
