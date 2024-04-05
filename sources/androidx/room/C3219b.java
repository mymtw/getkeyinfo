package androidx.room;

import android.database.Cursor;
import androidx.preference.Preference;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import p112g2.C6831a;
import p146j.C7096a;
import p594jh.C17909f;

/* renamed from: androidx.room.b */
public final /* synthetic */ class C3219b implements C7096a, Preference.C3009c, C6599q.C6600a, C17909f {

    /* renamed from: b */
    public final /* synthetic */ int f7489b;

    public /* synthetic */ C3219b(int i) {
        this.f7489b = i;
    }

    public final Object apply(Object obj) {
        switch (this.f7489b) {
            case 0:
                return Boolean.valueOf(((C6831a) obj).mo18967q0());
            default:
                Cursor cursor = (Cursor) obj;
                C6493a aVar = C6599q.f14568g;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
        }
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        return ConfigPreferencesHelper.m34843setUpFeaturesOverridePreference$lambda2(preference, obj);
    }
}
