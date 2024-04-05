package androidx.compose.material.ripple;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.activity.C0114h;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.material.ripple.C1247m;
import androidx.compose.p015ui.graphics.C1545s;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p288y.C8343c;
import p628nj.C18263b;
import p753kq.C19846a;

public final class RippleHostView extends View {
    public static final C1234a Companion = new C1234a();
    private static final long MinimumRippleStateChangeTime = 5;
    private static final int[] PressedState = {16842919, 16842910};
    private static final long ResetRippleDelayDuration = 50;
    private static final int[] RestingState = new int[0];
    private Boolean bounded;
    private Long lastRippleStateChangeTimeMillis;
    private C19846a<C19394m> onInvalidateRipple;
    private Runnable resetRippleRunnable;
    private C1247m ripple;

    /* renamed from: androidx.compose.material.ripple.RippleHostView$a */
    public static final class C1234a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RippleHostView(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    private final void createRipple(boolean z) {
        C1247m mVar = new C1247m(z);
        setBackground(mVar);
        this.ripple = mVar;
    }

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.lastRippleStateChangeTimeMillis;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0);
        if (z || longValue >= 5) {
            int[] iArr = z ? PressedState : RestingState;
            C1247m mVar = this.ripple;
            if (mVar != null) {
                mVar.setState(iArr);
            }
        } else {
            C1242h hVar = new C1242h(this, 0);
            this.resetRippleRunnable = hVar;
            postDelayed(hVar, ResetRippleDelayDuration);
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(currentAnimationTimeMillis);
    }

    /* access modifiers changed from: private */
    /* renamed from: setRippleState$lambda-2  reason: not valid java name */
    public static final void m34768setRippleState$lambda2(RippleHostView rippleHostView) {
        C19383o.m32797g(rippleHostView, "this$0");
        C1247m mVar = rippleHostView.ripple;
        if (mVar != null) {
            mVar.setState(RestingState);
        }
        rippleHostView.resetRippleRunnable = null;
    }

    /* renamed from: addRipple-KOepWvA  reason: not valid java name */
    public final void m34769addRippleKOepWvA(C0643m mVar, boolean z, long j, int i, long j2, float f, C19846a<C19394m> aVar) {
        C0643m mVar2 = mVar;
        boolean z2 = z;
        C19846a<C19394m> aVar2 = aVar;
        C19383o.m32797g(mVar, "interaction");
        C19383o.m32797g(aVar2, "onInvalidateRipple");
        if (this.ripple == null || !C19383o.m32792b(Boolean.valueOf(z), this.bounded)) {
            createRipple(z);
            this.bounded = Boolean.valueOf(z);
        }
        C1247m mVar3 = this.ripple;
        C19383o.m32794d(mVar3);
        this.onInvalidateRipple = aVar2;
        m34770updateRipplePropertiesbiQXAtU(j, i, j2, f);
        if (z2) {
            mVar3.setHotspot(C8343c.m16642c(mVar2.f1381a), C8343c.m16643d(mVar2.f1381a));
        } else {
            mVar3.setHotspot((float) mVar3.getBounds().centerX(), (float) mVar3.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void disposeRipple() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            C19383o.m32794d(runnable2);
            runnable2.run();
        } else {
            C1247m mVar = this.ripple;
            if (mVar != null) {
                mVar.setState(RestingState);
            }
        }
        C1247m mVar2 = this.ripple;
        if (mVar2 != null) {
            mVar2.setVisible(false, false);
            unscheduleDrawable(mVar2);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        C19383o.m32797g(drawable, "who");
        C19846a<C19394m> aVar = this.onInvalidateRipple;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void refreshDrawableState() {
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* renamed from: updateRippleProperties-biQXAtU  reason: not valid java name */
    public final void m34770updateRipplePropertiesbiQXAtU(long j, int i, long j2, float f) {
        C1247m mVar = this.ripple;
        if (mVar != null) {
            Integer num = mVar.f2609d;
            if (num == null || num.intValue() != i) {
                mVar.f2609d = Integer.valueOf(i);
                C1247m.C1248a.f2611a.mo5339a(mVar, i);
            }
            if (Build.VERSION.SDK_INT < 28) {
                f *= (float) 2;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            long b = C1545s.m3356b(j2, f);
            C1545s sVar = mVar.f2608c;
            if (!(sVar == null ? false : C1545s.m3357c(sVar.f3366a, b))) {
                mVar.f2608c = new C1545s(b);
                mVar.setColor(ColorStateList.valueOf(C18263b.m30859o0(b)));
            }
            Rect y0 = C0114h.m330y0(C0005b.m40h(C8343c.f18295b, j));
            setLeft(y0.left);
            setTop(y0.top);
            setRight(y0.right);
            setBottom(y0.bottom);
            mVar.setBounds(y0);
        }
    }
}
