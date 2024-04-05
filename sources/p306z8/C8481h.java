package p306z8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.util.Base64;
import androidx.preference.Preference;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import com.google.firebase.platforminfo.C16685e;
import com.paypal.pyplcheckout.interfaces.Progression;
import com.paypal.pyplcheckout.interfaces.SDKInterceptFinishListener;
import com.paypal.pyplcheckout.interfaces.SDKInterceptor;
import com.paypal.pyplcheckout.interfaces.Status;
import java.util.ArrayList;
import p144ih.C7008a;

/* renamed from: z8.h */
public final /* synthetic */ class C8481h implements Preference.C3009c, C6599q.C6600a, C16685e.C16686a, SDKInterceptor {
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        C6493a aVar = C6599q.f14568g;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            C6556p.C6557a priority = C6556p.builder().setBackendName(cursor.getString(1)).setPriority(C7008a.m13569b(cursor.getInt(2)));
            String string = cursor.getString(3);
            arrayList.add(priority.setExtras(string == null ? null : Base64.decode(string, 0)).build());
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String mo3367c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public final void intercept(Progression progression, SDKInterceptFinishListener sDKInterceptFinishListener) {
        sDKInterceptFinishListener.onSDKInterceptComplete(Status.SUCCESS);
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        return ConfigPreferencesHelper.m34840setUpFeaturesDateOverridePreference$lambda5(preference, obj);
    }
}
