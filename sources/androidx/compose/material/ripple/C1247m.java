package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.compose.p015ui.graphics.C1545s;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.material.ripple.m */
public final class C1247m extends RippleDrawable {

    /* renamed from: b */
    public final boolean f2607b;

    /* renamed from: c */
    public C1545s f2608c;

    /* renamed from: d */
    public Integer f2609d;

    /* renamed from: e */
    public boolean f2610e;

    /* renamed from: androidx.compose.material.ripple.m$a */
    public static final class C1248a {

        /* renamed from: a */
        public static final C1248a f2611a = new C1248a();

        /* renamed from: a */
        public final void mo5339a(RippleDrawable rippleDrawable, int i) {
            C19383o.m32797g(rippleDrawable, "ripple");
            rippleDrawable.setRadius(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1247m(boolean z) {
        super(ColorStateList.valueOf(-16777216), (Drawable) null, z ? new ColorDrawable(-1) : null);
        this.f2607b = z;
    }

    public final Rect getDirtyBounds() {
        if (!this.f2607b) {
            this.f2610e = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        C19383o.m32796f(dirtyBounds, "super.getDirtyBounds()");
        this.f2610e = false;
        return dirtyBounds;
    }

    public final boolean isProjected() {
        return this.f2610e;
    }
}
