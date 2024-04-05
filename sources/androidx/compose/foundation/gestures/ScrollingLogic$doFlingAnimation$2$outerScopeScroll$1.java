package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.Lambda;
import p288y.C8343c;
import p753kq.C19857l;

public final class ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 extends Lambda implements C19857l<C8343c, C8343c> {
    public final /* synthetic */ C0614l $$this$scroll;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(ScrollingLogic scrollingLogic, C0614l lVar) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$$this$scroll = lVar;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return new C8343c(m34678invokeMKHz9U(((C8343c) obj).f18299a));
    }

    /* renamed from: invoke-MK-Hz9U  reason: not valid java name */
    public final long m34678invokeMKHz9U(long j) {
        ScrollingLogic scrollingLogic = this.this$0;
        long a = scrollingLogic.mo3817a(this.$$this$scroll, scrollingLogic.f1345b ? C8343c.m16646g(j, -1.0f) : j, (C8343c) null, 2);
        if (this.this$0.f1345b) {
            a = C8343c.m16646g(a, -1.0f);
        }
        return C8343c.m16644e(j, a);
    }
}
