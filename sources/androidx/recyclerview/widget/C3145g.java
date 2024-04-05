package androidx.recyclerview.widget;

import android.support.p013v4.media.C0069a;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.g */
public final class C3145g {

    /* renamed from: a */
    public final C3147b f7229a;

    /* renamed from: b */
    public final C3146a f7230b = new C3146a();

    /* renamed from: c */
    public final ArrayList f7231c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.g$a */
    public static class C3146a {

        /* renamed from: a */
        public long f7232a = 0;

        /* renamed from: b */
        public C3146a f7233b;

        /* renamed from: a */
        public final void mo11858a(int i) {
            if (i >= 64) {
                C3146a aVar = this.f7233b;
                if (aVar != null) {
                    aVar.mo11858a(i - 64);
                    return;
                }
                return;
            }
            this.f7232a &= ~(1 << i);
        }

        /* renamed from: b */
        public final int mo11859b(int i) {
            C3146a aVar = this.f7233b;
            if (aVar == null) {
                return i >= 64 ? Long.bitCount(this.f7232a) : Long.bitCount(this.f7232a & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.f7232a & ((1 << i) - 1));
            }
            return Long.bitCount(this.f7232a) + aVar.mo11859b(i - 64);
        }

        /* renamed from: c */
        public final void mo11860c() {
            if (this.f7233b == null) {
                this.f7233b = new C3146a();
            }
        }

        /* renamed from: d */
        public final boolean mo11861d(int i) {
            if (i < 64) {
                return (this.f7232a & (1 << i)) != 0;
            }
            mo11860c();
            return this.f7233b.mo11861d(i - 64);
        }

        /* renamed from: e */
        public final void mo11862e(int i, boolean z) {
            if (i >= 64) {
                mo11860c();
                this.f7233b.mo11862e(i - 64, z);
                return;
            }
            long j = this.f7232a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f7232a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                mo11865h(i);
            } else {
                mo11858a(i);
            }
            if (z2 || this.f7233b != null) {
                mo11860c();
                this.f7233b.mo11862e(0, z2);
            }
        }

        /* renamed from: f */
        public final boolean mo11863f(int i) {
            if (i >= 64) {
                mo11860c();
                return this.f7233b.mo11863f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f7232a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f7232a = j3;
            long j4 = j - 1;
            this.f7232a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C3146a aVar = this.f7233b;
            if (aVar != null) {
                if (aVar.mo11861d(0)) {
                    mo11865h(63);
                }
                this.f7233b.mo11863f(0);
            }
            return z;
        }

        /* renamed from: g */
        public final void mo11864g() {
            this.f7232a = 0;
            C3146a aVar = this.f7233b;
            if (aVar != null) {
                aVar.mo11864g();
            }
        }

        /* renamed from: h */
        public final void mo11865h(int i) {
            if (i >= 64) {
                mo11860c();
                this.f7233b.mo11865h(i - 64);
                return;
            }
            this.f7232a |= 1 << i;
        }

        public final String toString() {
            if (this.f7233b == null) {
                return Long.toBinaryString(this.f7232a);
            }
            return this.f7233b.toString() + "xx" + Long.toBinaryString(this.f7232a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    public interface C3147b {
    }

    public C3145g(RecyclerView.C3087e eVar) {
        this.f7229a = eVar;
    }

    /* renamed from: a */
    public final void mo11845a(View view, int i, boolean z) {
        int a = i < 0 ? ((RecyclerView.C3087e) this.f7229a).mo11613a() : mo11850f(i);
        this.f7230b.mo11862e(a, z);
        if (z) {
            mo11853i(view);
        }
        RecyclerView.C3087e eVar = (RecyclerView.C3087e) this.f7229a;
        RecyclerView.this.addView(view, a);
        RecyclerView.this.dispatchChildAttached(view);
    }

    /* renamed from: b */
    public final void mo11846b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a = i < 0 ? ((RecyclerView.C3087e) this.f7229a).mo11613a() : mo11850f(i);
        this.f7230b.mo11862e(a, z);
        if (z) {
            mo11853i(view);
        }
        RecyclerView.C3087e eVar = (RecyclerView.C3087e) this.f7229a;
        eVar.getClass();
        RecyclerView.C3084b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(C0069a.m173d(RecyclerView.this, sb));
            }
        }
        RecyclerView.this.attachViewToParent(view, a, layoutParams);
    }

    /* renamed from: c */
    public final void mo11847c(int i) {
        RecyclerView.C3084b0 childViewHolderInt;
        int f = mo11850f(i);
        this.f7230b.mo11863f(f);
        RecyclerView.C3087e eVar = (RecyclerView.C3087e) this.f7229a;
        View childAt = RecyclerView.this.getChildAt(f);
        if (!(childAt == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) == null)) {
            if (!childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(256);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(C0069a.m173d(RecyclerView.this, sb));
            }
        }
        RecyclerView.this.detachViewFromParent(f);
    }

    /* renamed from: d */
    public final View mo11848d(int i) {
        return RecyclerView.this.getChildAt(mo11850f(i));
    }

    /* renamed from: e */
    public final int mo11849e() {
        return ((RecyclerView.C3087e) this.f7229a).mo11613a() - this.f7231c.size();
    }

    /* renamed from: f */
    public final int mo11850f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = ((RecyclerView.C3087e) this.f7229a).mo11613a();
        int i2 = i;
        while (i2 < a) {
            int b = i - (i2 - this.f7230b.mo11859b(i2));
            if (b == 0) {
                while (this.f7230b.mo11861d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: g */
    public final View mo11851g(int i) {
        return RecyclerView.this.getChildAt(i);
    }

    /* renamed from: h */
    public final int mo11852h() {
        return ((RecyclerView.C3087e) this.f7229a).mo11613a();
    }

    /* renamed from: i */
    public final void mo11853i(View view) {
        this.f7231c.add(view);
        RecyclerView.C3087e eVar = (RecyclerView.C3087e) this.f7229a;
        eVar.getClass();
        RecyclerView.C3084b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    /* renamed from: j */
    public final int mo11854j(View view) {
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild != -1 && !this.f7230b.mo11861d(indexOfChild)) {
            return indexOfChild - this.f7230b.mo11859b(indexOfChild);
        }
        return -1;
    }

    /* renamed from: k */
    public final boolean mo11855k(View view) {
        return this.f7231c.contains(view);
    }

    /* renamed from: l */
    public final void mo11856l(View view) {
        if (this.f7231c.remove(view)) {
            RecyclerView.C3087e eVar = (RecyclerView.C3087e) this.f7229a;
            eVar.getClass();
            RecyclerView.C3084b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }
    }

    public final String toString() {
        return this.f7230b.toString() + ", hidden list:" + this.f7231c.size();
    }
}
