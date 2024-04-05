package p399me;

import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.stylekit.views.CollageContentToggle;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: me.h */
public final class C13058h implements CollageContentToggle.C9030a {

    /* renamed from: b */
    public final String f28714b;

    /* renamed from: c */
    public final C19857l<C10813l, C19394m> f28715c;

    public C13058h(String str, C19857l<? super C10813l, C19394m> lVar) {
        C19383o.m32797g(str, "groupId");
        C19383o.m32797g(lVar, "onEvent");
        this.f28714b = str;
        this.f28715c = lVar;
    }

    public final void onAnimationComplete() {
    }

    public final void onCollapse() {
        this.f28715c.invoke(new C10813l.C10817d(this.f28714b, false));
    }

    public final void onExpanded() {
        this.f28715c.invoke(new C10813l.C10817d(this.f28714b, true));
    }

    public final void onPopOut() {
    }
}
