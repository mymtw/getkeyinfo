package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;

/* renamed from: androidx.fragment.app.r */
public abstract class C2782r<E> extends C2779o {

    /* renamed from: b */
    public final Activity f6333b;

    /* renamed from: c */
    public final Context f6334c;

    /* renamed from: d */
    public final Handler f6335d;

    /* renamed from: e */
    public final C2796v f6336e = new C2796v();

    public C2782r(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.f6333b = fragmentActivity;
        if (fragmentActivity != null) {
            this.f6334c = fragmentActivity;
            this.f6335d = handler;
            return;
        }
        throw new NullPointerException("context == null");
    }

    /* renamed from: d */
    public abstract FragmentActivity mo10330d();

    /* renamed from: e */
    public abstract LayoutInflater mo10331e();

    /* renamed from: f */
    public abstract boolean mo10332f(String str);

    /* renamed from: g */
    public abstract void mo10333g();
}
