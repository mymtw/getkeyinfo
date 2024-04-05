package com.facebook.share.internal;

import com.facebook.LoggingBehavior;
import com.facebook.share.internal.C12348b;
import p365hg.C12845c0;
import p365hg.C12889o;
import p453tf.C13426p;

/* renamed from: com.facebook.share.internal.j */
public final class C12374j implements C12348b.C12364o {

    /* renamed from: a */
    public final /* synthetic */ C12348b f27577a;

    /* renamed from: com.facebook.share.internal.j$a */
    public class C12375a implements C13426p.C13427a {

        /* renamed from: a */
        public final /* synthetic */ C12348b.C12360k f27578a;

        /* renamed from: b */
        public final /* synthetic */ C12348b.C12355f f27579b;

        public C12375a(C12348b.C12360k kVar, C12348b.C12355f fVar) {
            this.f27578a = kVar;
            this.f27579b = fVar;
        }

        /* renamed from: a */
        public final void mo39759a(C13426p pVar) {
            C12348b.C12360k kVar = this.f27578a;
            if (((C12348b.C12351c) kVar).f27534d == null && this.f27579b.f27534d == null) {
                C12348b bVar = C12374j.this.f27577a;
                boolean a = kVar.mo39765a();
                C12348b.C12355f fVar = this.f27579b;
                String str = fVar.f27539e;
                String str2 = fVar.f27540f;
                String str3 = fVar.f27541g;
                String str4 = fVar.f27542h;
                String b = this.f27578a.mo39766b();
                C12889o oVar = C12348b.f27504o;
                bVar.mo39758n(a, str, str2, str3, str4, b);
                return;
            }
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            C12889o oVar2 = C12348b.f27504o;
            C12845c0.m20491d(loggingBehavior, "Unable to refresh like state for id: '%s'", C12374j.this.f27577a.f27512a);
        }
    }

    public C12374j(C12348b bVar) {
        this.f27577a = bVar;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.facebook.share.internal.b$h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete() {
        /*
            r5 = this;
            int[] r0 = com.facebook.share.internal.C12348b.C12350b.f27530a
            com.facebook.share.internal.b r1 = r5.f27577a
            com.facebook.share.widget.LikeView$ObjectType r1 = r1.f27513b
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x001b
            com.facebook.share.internal.b$h r0 = new com.facebook.share.internal.b$h
            com.facebook.share.internal.b r1 = r5.f27577a
            java.lang.String r2 = r1.f27520i
            com.facebook.share.widget.LikeView$ObjectType r3 = r1.f27513b
            r0.<init>(r2, r3)
            goto L_0x0024
        L_0x001b:
            com.facebook.share.internal.b$j r0 = new com.facebook.share.internal.b$j
            com.facebook.share.internal.b r1 = r5.f27577a
            java.lang.String r2 = r1.f27520i
            r0.<init>(r2)
        L_0x0024:
            com.facebook.share.internal.b$f r1 = new com.facebook.share.internal.b$f
            com.facebook.share.internal.b r2 = r5.f27577a
            java.lang.String r3 = r2.f27520i
            com.facebook.share.widget.LikeView$ObjectType r4 = r2.f27513b
            r1.<init>(r3, r4)
            tf.p r2 = new tf.p
            r2.<init>()
            com.facebook.GraphRequest r3 = r0.f27531a
            r2.add(r3)
            com.facebook.GraphRequest r3 = r1.f27531a
            r2.add(r3)
            com.facebook.share.internal.j$a r3 = new com.facebook.share.internal.j$a
            r3.<init>(r0, r1)
            r2.mo46094c(r3)
            r2.mo46097e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C12374j.onComplete():void");
    }
}
