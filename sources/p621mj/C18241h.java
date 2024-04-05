package p621mj;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p621mj.C18233a;

/* renamed from: mj.h */
public final class C18241h implements C18233a.C18234a {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f39988a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflater f39989b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f39990c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f39991d;

    /* renamed from: e */
    public final /* synthetic */ C18233a f39992e;

    public C18241h(C18233a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f39992e = aVar;
        this.f39988a = frameLayout;
        this.f39989b = layoutInflater;
        this.f39990c = viewGroup;
        this.f39991d = bundle;
    }

    public final int zaa() {
        return 2;
    }

    /* renamed from: zaa  reason: collision with other method in class */
    public final void m35476zaa() {
        this.f39988a.removeAllViews();
        this.f39988a.addView(this.f39992e.f39975b.mo51362b(this.f39989b, this.f39990c, this.f39991d));
    }
}
