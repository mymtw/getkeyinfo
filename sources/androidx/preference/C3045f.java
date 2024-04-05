package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;

/* renamed from: androidx.preference.f */
public final class C3045f {

    /* renamed from: a */
    public Context f6936a;

    /* renamed from: b */
    public long f6937b = 0;

    /* renamed from: c */
    public SharedPreferences f6938c;

    /* renamed from: d */
    public SharedPreferences.Editor f6939d;

    /* renamed from: e */
    public boolean f6940e;

    /* renamed from: f */
    public String f6941f;

    /* renamed from: g */
    public int f6942g;

    /* renamed from: h */
    public PreferenceScreen f6943h;

    /* renamed from: i */
    public C3048c f6944i;

    /* renamed from: j */
    public C3046a f6945j;

    /* renamed from: k */
    public C3047b f6946k;

    /* renamed from: androidx.preference.f$a */
    public interface C3046a {
        void onDisplayPreferenceDialog(Preference preference);
    }

    /* renamed from: androidx.preference.f$b */
    public interface C3047b {
        void onNavigateToScreen(PreferenceScreen preferenceScreen);
    }

    /* renamed from: androidx.preference.f$c */
    public interface C3048c {
        boolean onPreferenceTreeClick(Preference preference);
    }

    public C3045f(Context context) {
        this.f6936a = context;
        this.f6941f = context.getPackageName() + "_preferences";
        this.f6938c = null;
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo11204a() {
        if (!this.f6940e) {
            return mo11205b().edit();
        }
        if (this.f6939d == null) {
            this.f6939d = mo11205b().edit();
        }
        return this.f6939d;
    }

    /* renamed from: b */
    public final SharedPreferences mo11205b() {
        if (this.f6938c == null) {
            this.f6938c = this.f6936a.getSharedPreferences(this.f6941f, this.f6942g);
        }
        return this.f6938c;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final PreferenceScreen mo11206c(Context context, int i, PreferenceScreen preferenceScreen) {
        this.f6940e = true;
        C3044e eVar = new C3044e(context, this);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            PreferenceGroup c = eVar.mo11202c(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) c;
            preferenceScreen2.mo11060m(this);
            SharedPreferences.Editor editor = this.f6939d;
            if (editor != null) {
                editor.apply();
            }
            this.f6940e = false;
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}
