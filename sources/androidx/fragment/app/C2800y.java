package androidx.fragment.app;

import android.support.p013v4.media.C0070b;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C2751c0;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.lib.conversation.MessageDraft;
import p213q2.C7717a;

@Deprecated
/* renamed from: androidx.fragment.app.y */
public abstract class C2800y extends C7717a {

    /* renamed from: d */
    public final FragmentManager f6358d;

    /* renamed from: e */
    public final int f6359e;

    /* renamed from: f */
    public C2740a f6360f = null;

    /* renamed from: g */
    public Fragment f6361g = null;

    /* renamed from: h */
    public boolean f6362h;

    public C2800y(FragmentManager fragmentManager, int i) {
        this.f6358d = fragmentManager;
        this.f6359e = i;
    }

    /* renamed from: h */
    public final void mo10623h(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f6360f == null) {
            FragmentManager fragmentManager = this.f6358d;
            this.f6360f = C0070b.m182c(fragmentManager, fragmentManager);
        }
        this.f6360f.mo10484f(fragment);
        if (fragment.equals(this.f6361g)) {
            this.f6361g = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public final void mo10624i() {
        C2740a aVar = this.f6360f;
        if (aVar != null) {
            if (!this.f6362h) {
                try {
                    this.f6362h = true;
                    if (!aVar.f6252i) {
                        aVar.f6253j = false;
                        aVar.f6218s.mo10405y(aVar, true);
                        this.f6362h = false;
                    } else {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                } catch (Throwable th) {
                    this.f6362h = false;
                    throw th;
                }
            }
            this.f6360f = null;
        }
    }

    /* renamed from: n */
    public final Object mo10625n(ViewGroup viewGroup, int i) {
        if (this.f6360f == null) {
            FragmentManager fragmentManager = this.f6358d;
            this.f6360f = C0070b.m182c(fragmentManager, fragmentManager);
        }
        long v = mo10632v(i);
        int id = viewGroup.getId();
        Fragment C = this.f6358d.mo10353C("android:switcher:" + id + MessageDraft.IMAGE_DELIMITER + v);
        if (C != null) {
            C2740a aVar = this.f6360f;
            aVar.getClass();
            aVar.mo10528b(new C2751c0.C2752a(C, 7));
        } else {
            C = mo10631u(i);
            C2740a aVar2 = this.f6360f;
            int id2 = viewGroup.getId();
            int id3 = viewGroup.getId();
            aVar2.mo10485g(id2, C, "android:switcher:" + id3 + MessageDraft.IMAGE_DELIMITER + v, 1);
        }
        if (C != this.f6361g) {
            C.setMenuVisibility(false);
            if (this.f6359e == 1) {
                this.f6360f.mo10491o(C, Lifecycle.State.STARTED);
            } else {
                C.setUserVisibleHint(false);
            }
        }
        return C;
    }

    /* renamed from: o */
    public final boolean mo10626o(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: q */
    public final void mo10627q() {
    }

    /* renamed from: r */
    public final void mo10628r() {
    }

    /* renamed from: s */
    public void mo10629s(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f6361g;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f6359e == 1) {
                    if (this.f6360f == null) {
                        FragmentManager fragmentManager = this.f6358d;
                        this.f6360f = C0070b.m182c(fragmentManager, fragmentManager);
                    }
                    this.f6360f.mo10491o(this.f6361g, Lifecycle.State.STARTED);
                } else {
                    this.f6361g.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f6359e == 1) {
                if (this.f6360f == null) {
                    FragmentManager fragmentManager2 = this.f6358d;
                    this.f6360f = C0070b.m182c(fragmentManager2, fragmentManager2);
                }
                this.f6360f.mo10491o(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f6361g = fragment;
        }
    }

    /* renamed from: t */
    public final void mo10630t(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    /* renamed from: u */
    public abstract Fragment mo10631u(int i);

    /* renamed from: v */
    public long mo10632v(int i) {
        return (long) i;
    }
}
