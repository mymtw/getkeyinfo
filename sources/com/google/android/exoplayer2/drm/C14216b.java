package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.emoji2.text.C2675f;
import androidx.profileinstaller.C3067i;
import com.braze.p044ui.inappmessage.views.C5699e;
import com.etsy.android.p327ui.shop.C11141e;
import com.google.android.exoplayer2.source.C14344i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p427qb.C13281a;
import p513bj.C14049b0;
import p635oh.C18291a;

/* renamed from: com.google.android.exoplayer2.drm.b */
public interface C14216b {

    /* renamed from: com.google.android.exoplayer2.drm.b$a */
    public static class C14217a {

        /* renamed from: a */
        public final int f31564a;

        /* renamed from: b */
        public final C14344i.C14345a f31565b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C14218a> f31566c;

        /* renamed from: com.google.android.exoplayer2.drm.b$a$a */
        public static final class C14218a {

            /* renamed from: a */
            public Handler f31567a;

            /* renamed from: b */
            public C14216b f31568b;

            public C14218a(Handler handler, C14216b bVar) {
                this.f31567a = handler;
                this.f31568b = bVar;
            }
        }

        public C14217a() {
            this(new CopyOnWriteArrayList(), 0, (C14344i.C14345a) null);
        }

        /* renamed from: a */
        public final void mo47329a() {
            Iterator<C14218a> it = this.f31566c.iterator();
            while (it.hasNext()) {
                C14218a next = it.next();
                C14049b0.m21624E(next.f31567a, new C5699e(1, this, next.f31568b));
            }
        }

        /* renamed from: b */
        public final void mo47330b() {
            Iterator<C14218a> it = this.f31566c.iterator();
            while (it.hasNext()) {
                C14218a next = it.next();
                C14049b0.m21624E(next.f31567a, new C13281a(2, this, next.f31568b));
            }
        }

        /* renamed from: c */
        public final void mo47331c() {
            Iterator<C14218a> it = this.f31566c.iterator();
            while (it.hasNext()) {
                C14218a next = it.next();
                C14049b0.m21624E(next.f31567a, new C3067i(4, this, next.f31568b));
            }
        }

        /* renamed from: d */
        public final void mo47332d(int i) {
            Iterator<C14218a> it = this.f31566c.iterator();
            while (it.hasNext()) {
                C14218a next = it.next();
                C14049b0.m21624E(next.f31567a, new C18291a(this, next.f31568b, i));
            }
        }

        /* renamed from: e */
        public final void mo47333e(Exception exc) {
            Iterator<C14218a> it = this.f31566c.iterator();
            while (it.hasNext()) {
                C14218a next = it.next();
                C14049b0.m21624E(next.f31567a, new C2675f(this, 2, next.f31568b, exc));
            }
        }

        /* renamed from: f */
        public final void mo47334f() {
            Iterator<C14218a> it = this.f31566c.iterator();
            while (it.hasNext()) {
                C14218a next = it.next();
                C14049b0.m21624E(next.f31567a, new C11141e(1, this, next.f31568b));
            }
        }

        public C14217a(CopyOnWriteArrayList<C14218a> copyOnWriteArrayList, int i, C14344i.C14345a aVar) {
            this.f31566c = copyOnWriteArrayList;
            this.f31564a = i;
            this.f31565b = aVar;
        }
    }

    /* renamed from: A */
    void mo47323A(int i, C14344i.C14345a aVar, int i2) {
    }

    /* renamed from: B */
    void mo47324B(int i, C14344i.C14345a aVar) {
    }

    /* renamed from: D */
    void mo47325D(int i, C14344i.C14345a aVar) {
    }

    /* renamed from: c */
    void mo47326c(int i, C14344i.C14345a aVar) {
    }

    /* renamed from: n */
    void mo47327n(int i, C14344i.C14345a aVar, Exception exc) {
    }

    /* renamed from: v */
    void mo47328v(int i, C14344i.C14345a aVar) {
    }
}
