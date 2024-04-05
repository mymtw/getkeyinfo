package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.C0194a;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p193o.C7496d;

/* renamed from: androidx.appcompat.app.f */
public abstract class C0156f {

    /* renamed from: b */
    public static int f386b = -100;

    /* renamed from: c */
    public static final C7496d<WeakReference<C0156f>> f387c = new C7496d<>();

    /* renamed from: d */
    public static final Object f388d = new Object();

    /* renamed from: u */
    public static void m489u(C0156f fVar) {
        synchronized (f388d) {
            Iterator<WeakReference<C0156f>> it = f387c.iterator();
            while (it.hasNext()) {
                C0156f fVar2 = (C0156f) it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: z */
    public static void m490z(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f386b != i) {
            f386b = i;
            synchronized (f388d) {
                Iterator<WeakReference<C0156f>> it = f387c.iterator();
                while (it.hasNext()) {
                    C0156f fVar = (C0156f) it.next().get();
                    if (fVar != null) {
                        fVar.mo1313d();
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public abstract void mo1288A(Toolbar toolbar);

    /* renamed from: B */
    public void mo1289B(int i) {
    }

    /* renamed from: C */
    public abstract void mo1290C(CharSequence charSequence);

    /* renamed from: D */
    public abstract C0194a mo1291D(C0194a.C0195a aVar);

    /* renamed from: c */
    public abstract void mo1312c(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: d */
    public abstract boolean mo1313d();

    /* renamed from: e */
    public Context mo1314e(Context context) {
        return context;
    }

    /* renamed from: f */
    public abstract <T extends View> T mo1315f(int i);

    /* renamed from: g */
    public abstract AppCompatDelegateImpl.C0138b mo1316g();

    /* renamed from: h */
    public int mo1317h() {
        return -100;
    }

    /* renamed from: i */
    public abstract MenuInflater mo1318i();

    /* renamed from: j */
    public abstract ActionBar mo1319j();

    /* renamed from: k */
    public abstract void mo1320k();

    /* renamed from: l */
    public abstract void mo1321l();

    /* renamed from: m */
    public abstract void mo1322m(Configuration configuration);

    /* renamed from: n */
    public abstract void mo1323n();

    /* renamed from: o */
    public abstract void mo1324o();

    /* renamed from: p */
    public abstract void mo1327p();

    /* renamed from: q */
    public abstract void mo1328q();

    /* renamed from: r */
    public abstract void mo1329r();

    /* renamed from: s */
    public abstract void mo1330s();

    /* renamed from: t */
    public abstract void mo1331t();

    /* renamed from: v */
    public abstract boolean mo1332v(int i);

    /* renamed from: w */
    public abstract void mo1333w(int i);

    /* renamed from: x */
    public abstract void mo1334x(View view);

    /* renamed from: y */
    public abstract void mo1335y(View view, ViewGroup.LayoutParams layoutParams);
}
