package p186n2;

import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;

/* renamed from: n2.e0 */
public final class C7394e0 extends C7425p {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f16515a;

    /* renamed from: b */
    public final /* synthetic */ View f16516b;

    /* renamed from: c */
    public final /* synthetic */ View f16517c;

    /* renamed from: d */
    public final /* synthetic */ C7398f0 f16518d;

    public C7394e0(C7398f0 f0Var, ViewGroup viewGroup, View view, View view2) {
        this.f16518d = f0Var;
        this.f16515a = viewGroup;
        this.f16516b = view;
        this.f16517c = view2;
    }

    public final void onTransitionEnd(C7418m mVar) {
        this.f16517c.setTag(R.id.save_overlay_view, (Object) null);
        this.f16515a.getOverlay().remove(this.f16516b);
        mVar.mo19793z(this);
    }

    public final void onTransitionPause(C7418m mVar) {
        this.f16515a.getOverlay().remove(this.f16516b);
    }

    public final void onTransitionResume(C7418m mVar) {
        if (this.f16516b.getParent() == null) {
            this.f16515a.getOverlay().add(this.f16516b);
        } else {
            this.f16518d.cancel();
        }
    }
}
