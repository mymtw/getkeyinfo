package androidx.compose.p015ui.platform;

import android.graphics.Rect;
import androidx.compose.p015ui.semantics.SemanticsNode;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.C19383o;
import p173m.C7279a;
import p288y.C8345d;

/* renamed from: androidx.compose.ui.platform.d */
public final class C1823d extends C1812a {

    /* renamed from: e */
    public static C1823d f4079e;

    /* renamed from: f */
    public static final ResolvedTextDirection f4080f = ResolvedTextDirection.Rtl;

    /* renamed from: g */
    public static final ResolvedTextDirection f4081g = ResolvedTextDirection.Ltr;

    /* renamed from: c */
    public C2021q f4082c;

    /* renamed from: d */
    public SemanticsNode f4083d;

    public C1823d() {
        new Rect();
    }

    /* renamed from: a */
    public final int[] mo7194a(int i) {
        int i2;
        if (mo7180d().length() <= 0 || i >= mo7180d().length()) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.f4083d;
            if (semanticsNode != null) {
                C8345d d = semanticsNode.mo7305d();
                int l = C7279a.m13954l(d.f18304d - d.f18302b);
                if (i <= 0) {
                    i = 0;
                }
                C2021q qVar = this.f4082c;
                if (qVar != null) {
                    int f = qVar.mo7744f(i);
                    C2021q qVar2 = this.f4082c;
                    if (qVar2 != null) {
                        float k = qVar2.mo7750k(f) + ((float) l);
                        C2021q qVar3 = this.f4082c;
                        if (qVar3 != null) {
                            if (k < qVar3.mo7750k(qVar3.f4590b.f4365f - 1)) {
                                C2021q qVar4 = this.f4082c;
                                if (qVar4 != null) {
                                    i2 = qVar4.mo7745g(k);
                                } else {
                                    C19383o.m32805o("layoutResult");
                                    throw null;
                                }
                            } else {
                                C2021q qVar5 = this.f4082c;
                                if (qVar5 != null) {
                                    i2 = qVar5.f4590b.f4365f;
                                } else {
                                    C19383o.m32805o("layoutResult");
                                    throw null;
                                }
                            }
                            return mo7179c(i, mo7202e(i2 - 1, f4081g) + 1);
                        }
                        C19383o.m32805o("layoutResult");
                        throw null;
                    }
                    C19383o.m32805o("layoutResult");
                    throw null;
                }
                C19383o.m32805o("layoutResult");
                throw null;
            }
            C19383o.m32805o("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final int[] mo7195b(int i) {
        int i2;
        if (mo7180d().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.f4083d;
            if (semanticsNode != null) {
                C8345d d = semanticsNode.mo7305d();
                int l = C7279a.m13954l(d.f18304d - d.f18302b);
                int length = mo7180d().length();
                if (length <= i) {
                    i = length;
                }
                C2021q qVar = this.f4082c;
                if (qVar != null) {
                    int f = qVar.mo7744f(i);
                    C2021q qVar2 = this.f4082c;
                    if (qVar2 != null) {
                        float k = qVar2.mo7750k(f) - ((float) l);
                        if (k > 0.0f) {
                            C2021q qVar3 = this.f4082c;
                            if (qVar3 != null) {
                                i2 = qVar3.mo7745g(k);
                            } else {
                                C19383o.m32805o("layoutResult");
                                throw null;
                            }
                        } else {
                            i2 = 0;
                        }
                        if (i == mo7180d().length() && i2 < f) {
                            i2++;
                        }
                        return mo7179c(mo7202e(i2, f4080f), i);
                    }
                    C19383o.m32805o("layoutResult");
                    throw null;
                }
                C19383o.m32805o("layoutResult");
                throw null;
            }
            C19383o.m32805o("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final int mo7202e(int i, ResolvedTextDirection resolvedTextDirection) {
        C2021q qVar = this.f4082c;
        if (qVar != null) {
            int j = qVar.mo7749j(i);
            C2021q qVar2 = this.f4082c;
            if (qVar2 == null) {
                C19383o.m32805o("layoutResult");
                throw null;
            } else if (resolvedTextDirection != qVar2.mo7752m(j)) {
                C2021q qVar3 = this.f4082c;
                if (qVar3 != null) {
                    return qVar3.mo7749j(i);
                }
                C19383o.m32805o("layoutResult");
                throw null;
            } else {
                C2021q qVar4 = this.f4082c;
                if (qVar4 != null) {
                    return qVar4.mo7742e(i, false) - 1;
                }
                C19383o.m32805o("layoutResult");
                throw null;
            }
        } else {
            C19383o.m32805o("layoutResult");
            throw null;
        }
    }
}
