package android.support.p013v4.media;

import android.database.Cursor;
import android.util.Log;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentManager;
import androidx.preference.Preference;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import java.util.List;
import p594jh.C17909f;
import p644ph.C18349h;
import p644ph.C18353k;
import p717yh.C18844d0;

/* renamed from: android.support.v4.media.b */
public final /* synthetic */ class C0070b implements C18353k, Preference.C3010d, C6599q.C6600a, C17909f {
    /* renamed from: b */
    public static long m181b(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    /* renamed from: c */
    public static C2740a m182c(FragmentManager fragmentManager, FragmentManager fragmentManager2) {
        fragmentManager.getClass();
        return new C2740a(fragmentManager2);
    }

    /* renamed from: e */
    public static String m183e(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    /* renamed from: f */
    public static String m184f(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: h */
    public static String m185h(StringBuilder sb, Throwable th, char c) {
        sb.append(th);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: i */
    public static String m186i(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: j */
    public static void m187j(String str, String str2, String str3) {
        Log.d(str3, str + str2);
    }

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        C6493a aVar = C6599q.f14568g;
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: d */
    public C18349h[] mo38d() {
        return new C18349h[]{new C18844d0()};
    }

    /* renamed from: g */
    public boolean mo412g(Preference preference) {
        return ConfigPreferencesHelper.m34847setUpTestCrashReportingPreference$lambda12(preference);
    }
}
