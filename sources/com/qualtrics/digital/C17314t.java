package com.qualtrics.digital;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: com.qualtrics.digital.t */
public final class C17314t {

    /* renamed from: b */
    public static C17314t f37839b;

    /* renamed from: a */
    public Context f37840a;

    public C17314t(Context context) {
        if (context != null) {
            if (context instanceof Application) {
                this.f37840a = context;
            } else {
                this.f37840a = context.getApplicationContext();
            }
        }
    }

    /* renamed from: a */
    public final SharedPreferences mo68223a() {
        Context context = this.f37840a;
        if (context != null) {
            return context.getSharedPreferences("com.qualtrics.qualtrics.QUALTRICS", 0);
        }
        Log.e("Qualtrics", "Unable to get shared properties. Ensure the context is set");
        return null;
    }
}
