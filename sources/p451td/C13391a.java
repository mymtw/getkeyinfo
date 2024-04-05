package p451td;

import com.etsy.android.stylekit.views.CollageContentToggle;
import kotlin.C19394m;
import p753kq.C19857l;

/* renamed from: td.a */
public final class C13391a implements CollageContentToggle.C9030a {

    /* renamed from: b */
    public final /* synthetic */ C19857l<Boolean, C19394m> f29323b;

    /* renamed from: c */
    public final /* synthetic */ CollageContentToggle f29324c;

    public C13391a(C19857l<? super Boolean, C19394m> lVar, CollageContentToggle collageContentToggle) {
        this.f29323b = lVar;
        this.f29324c = collageContentToggle;
    }

    public final void onAnimationComplete() {
        this.f29323b.invoke(Boolean.valueOf(this.f29324c.isExpanded()));
    }

    public final void onCollapse() {
    }

    public final void onExpanded() {
    }

    public final void onPopOut() {
    }
}
