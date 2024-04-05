package com.qualtrics.digital;

import android.content.SharedPreferences;
import android.util.Log;
import android.webkit.JavascriptInterface;
import androidx.appcompat.widget.C0326j;

/* renamed from: com.qualtrics.digital.b0 */
public final class C17295b0 {
    @JavascriptInterface
    public void postMessage(String str) {
        if (str == null || !str.startsWith("SV_")) {
            Log.i("Qualtrics", "Unable to set SurveyHasBeenTaken property with invalid SurveyID");
            return;
        }
        SharedPreferences a = C17315u.m29063a().f37842a.mo68223a();
        if (a != null) {
            a.edit().putLong(C0326j.m864i("QST_", str), System.currentTimeMillis()).apply();
        }
    }
}
