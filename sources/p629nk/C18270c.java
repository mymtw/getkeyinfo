package p629nk;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.p013v4.media.C0071c;
import androidx.appcompat.widget.C0326j;

/* renamed from: nk.c */
public final class C18270c {

    /* renamed from: a */
    public long f40098a;

    /* renamed from: b */
    public long f40099b;

    /* renamed from: c */
    public TimeInterpolator f40100c;

    /* renamed from: d */
    public int f40101d;

    /* renamed from: e */
    public int f40102e;

    public C18270c(long j) {
        this.f40100c = null;
        this.f40101d = 0;
        this.f40102e = 1;
        this.f40098a = j;
        this.f40099b = 150;
    }

    /* renamed from: a */
    public final void mo69817a(Animator animator) {
        animator.setStartDelay(this.f40098a);
        animator.setDuration(this.f40099b);
        animator.setInterpolator(mo69818b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f40101d);
            valueAnimator.setRepeatMode(this.f40102e);
        }
    }

    /* renamed from: b */
    public final TimeInterpolator mo69818b() {
        TimeInterpolator timeInterpolator = this.f40100c;
        return timeInterpolator != null ? timeInterpolator : C18268a.f40092b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18270c)) {
            return false;
        }
        C18270c cVar = (C18270c) obj;
        if (this.f40098a == cVar.f40098a && this.f40099b == cVar.f40099b && this.f40101d == cVar.f40101d && this.f40102e == cVar.f40102e) {
            return mo69818b().getClass().equals(cVar.mo69818b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f40098a;
        long j2 = this.f40099b;
        return ((((mo69818b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f40101d) * 31) + this.f40102e;
    }

    public final String toString() {
        StringBuilder k = C0326j.m866k(10);
        k.append(C18270c.class.getName());
        k.append('{');
        k.append(Integer.toHexString(System.identityHashCode(this)));
        k.append(" delay: ");
        k.append(this.f40098a);
        k.append(" duration: ");
        k.append(this.f40099b);
        k.append(" interpolator: ");
        k.append(mo69818b().getClass());
        k.append(" repeatCount: ");
        k.append(this.f40101d);
        k.append(" repeatMode: ");
        return C0071c.m191c(k, this.f40102e, "}\n");
    }

    public C18270c(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f40101d = 0;
        this.f40102e = 1;
        this.f40098a = j;
        this.f40099b = j2;
        this.f40100c = timeInterpolator;
    }
}
