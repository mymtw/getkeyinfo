package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SystemGestureExclusionKt$excludeFromSystemGestureR$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ C0649l $modifier;

    /* renamed from: androidx.compose.foundation.SystemGestureExclusionKt$excludeFromSystemGestureR$1$a */
    public static final class C0545a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ C0649l f1289a;

        public C0545a(C0649l lVar) {
            this.f1289a = lVar;
        }

        public final void dispose() {
            this.f1289a.mo3877a((Rect) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SystemGestureExclusionKt$excludeFromSystemGestureR$1(C0649l lVar) {
        super(1);
        this.$modifier = lVar;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        return new C0545a(this.$modifier);
    }
}
