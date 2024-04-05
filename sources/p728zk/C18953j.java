package p728zk;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.IndeterminateDrawable;

/* renamed from: zk.j */
public abstract class C18953j<T extends Animator> {

    /* renamed from: a */
    public IndeterminateDrawable f42256a;

    /* renamed from: b */
    public final float[] f42257b;

    /* renamed from: c */
    public final int[] f42258c;

    public C18953j(int i) {
        this.f42257b = new float[(i * 2)];
        this.f42258c = new int[i];
    }

    /* renamed from: a */
    public abstract void mo70384a();

    /* renamed from: b */
    public abstract void mo70385b();

    /* renamed from: c */
    public abstract void mo70386c(Animatable2Compat.C3306a aVar);

    /* renamed from: d */
    public abstract void mo70387d();

    /* renamed from: e */
    public abstract void mo70388e();

    /* renamed from: f */
    public abstract void mo70389f();
}
