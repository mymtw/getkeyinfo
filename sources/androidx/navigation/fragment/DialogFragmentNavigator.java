package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.C2951b;
import androidx.navigation.C2964h;
import androidx.navigation.C2971m;
import androidx.navigation.C2990p;
import java.util.HashSet;
import kotlin.reflect.C19421p;
import p003a2.C0023f;

@C2990p.C2991a("dialog")
public final class DialogFragmentNavigator extends C2990p<C2960a> {

    /* renamed from: a */
    public final Context f6712a;

    /* renamed from: b */
    public final FragmentManager f6713b;

    /* renamed from: c */
    public int f6714c = 0;

    /* renamed from: d */
    public final HashSet<String> f6715d = new HashSet<>();

    /* renamed from: e */
    public C2885q f6716e = new C2885q() {
        public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                DialogFragment dialogFragment = (DialogFragment) sVar;
                if (!dialogFragment.requireDialog().isShowing()) {
                    NavHostFragment.findNavController(dialogFragment).mo10945e();
                }
            }
        }
    };

    /* renamed from: androidx.navigation.fragment.DialogFragmentNavigator$a */
    public static class C2960a extends C2964h implements C2951b {

        /* renamed from: j */
        public String f6717j;

        public C2960a(C2990p<? extends C2960a> pVar) {
            super(pVar);
        }

        /* renamed from: g */
        public final void mo10954g(Context context, AttributeSet attributeSet) {
            super.mo10954g(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C19421p.f43312b);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.f6717j = string;
            }
            obtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        this.f6712a = context;
        this.f6713b = fragmentManager;
    }

    /* renamed from: a */
    public final C2964h mo10951a() {
        return new C2960a(this);
    }

    /* renamed from: b */
    public final C2964h mo10952b(C2964h hVar, Bundle bundle, C2971m mVar) {
        C2960a aVar = (C2960a) hVar;
        if (this.f6713b.mo10360M()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String str = aVar.f6717j;
        if (str != null) {
            if (str.charAt(0) == '.') {
                str = this.f6712a.getPackageName() + str;
            }
            Fragment a = this.f6713b.mo10357G().mo10411a(this.f6712a.getClassLoader(), str);
            if (DialogFragment.class.isAssignableFrom(a.getClass())) {
                DialogFragment dialogFragment = (DialogFragment) a;
                dialogFragment.setArguments(bundle);
                dialogFragment.getLifecycle().mo10733a(this.f6716e);
                FragmentManager fragmentManager = this.f6713b;
                StringBuilder h = C0072d.m201h("androidx-nav-fragment:navigator:dialog:");
                int i = this.f6714c;
                this.f6714c = i + 1;
                h.append(i);
                dialogFragment.show(fragmentManager, h.toString());
                return aVar;
            }
            StringBuilder h2 = C0072d.m201h("Dialog destination ");
            String str2 = aVar.f6717j;
            if (str2 != null) {
                throw new IllegalArgumentException(C0023f.m110k(h2, str2, " is not an instance of DialogFragment"));
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    /* renamed from: c */
    public final void mo10961c(Bundle bundle) {
        this.f6714c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
        for (int i = 0; i < this.f6714c; i++) {
            FragmentManager fragmentManager = this.f6713b;
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.mo10353C("androidx-nav-fragment:navigator:dialog:" + i);
            if (dialogFragment != null) {
                dialogFragment.getLifecycle().mo10733a(this.f6716e);
            } else {
                HashSet<String> hashSet = this.f6715d;
                hashSet.add("androidx-nav-fragment:navigator:dialog:" + i);
            }
        }
    }

    /* renamed from: d */
    public final Bundle mo10962d() {
        if (this.f6714c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f6714c);
        return bundle;
    }

    /* renamed from: e */
    public final boolean mo10953e() {
        if (this.f6714c == 0) {
            return false;
        }
        if (this.f6713b.mo10360M()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        FragmentManager fragmentManager = this.f6713b;
        StringBuilder h = C0072d.m201h("androidx-nav-fragment:navigator:dialog:");
        int i = this.f6714c - 1;
        this.f6714c = i;
        h.append(i);
        Fragment C = fragmentManager.mo10353C(h.toString());
        if (C != null) {
            C.getLifecycle().mo10735c(this.f6716e);
            ((DialogFragment) C).dismiss();
        }
        return true;
    }
}
