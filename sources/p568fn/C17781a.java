package p568fn;

import android.util.Log;
import java.util.Locale;

/* renamed from: fn.a */
public final class C17781a {

    /* renamed from: c */
    public static volatile C17781a f38628c;

    /* renamed from: a */
    public final C17782b f38629a;

    /* renamed from: b */
    public boolean f38630b = false;

    public C17781a() {
        C17782b bVar;
        synchronized (C17782b.class) {
            if (C17782b.f38631b == null) {
                C17782b.f38631b = new C17782b();
            }
            bVar = C17782b.f38631b;
        }
        this.f38629a = bVar;
    }

    /* renamed from: d */
    public static C17781a m29823d() {
        if (f38628c == null) {
            synchronized (C17781a.class) {
                if (f38628c == null) {
                    f38628c = new C17781a();
                }
            }
        }
        return f38628c;
    }

    /* renamed from: a */
    public final void mo69014a(String str) {
        if (this.f38630b) {
            this.f38629a.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    /* renamed from: b */
    public final void mo69015b(String str, Object... objArr) {
        if (this.f38630b) {
            C17782b bVar = this.f38629a;
            String format = String.format(Locale.ENGLISH, str, objArr);
            bVar.getClass();
            Log.d("FirebasePerformance", format);
        }
    }

    /* renamed from: c */
    public final void mo69016c(String str, Object... objArr) {
        if (this.f38630b) {
            C17782b bVar = this.f38629a;
            String format = String.format(Locale.ENGLISH, str, objArr);
            bVar.getClass();
            Log.e("FirebasePerformance", format);
        }
    }

    /* renamed from: e */
    public final void mo69017e(String str, Object... objArr) {
        if (this.f38630b) {
            C17782b bVar = this.f38629a;
            String format = String.format(Locale.ENGLISH, str, objArr);
            bVar.getClass();
            Log.i("FirebasePerformance", format);
        }
    }

    /* renamed from: f */
    public final void mo69018f(String str) {
        if (this.f38630b) {
            this.f38629a.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    /* renamed from: g */
    public final void mo69019g(String str, Object... objArr) {
        if (this.f38630b) {
            C17782b bVar = this.f38629a;
            String format = String.format(Locale.ENGLISH, str, objArr);
            bVar.getClass();
            Log.w("FirebasePerformance", format);
        }
    }
}
