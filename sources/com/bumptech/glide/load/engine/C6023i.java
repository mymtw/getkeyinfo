package com.bumptech.glide.load.engine;

import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.bumptech.glide.load.data.C5970e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p077d1.C6620d;
import p080d5.C6652a;
import p150j4.C7114e;
import p150j4.C7115f;
import p264v4.C8203c;

/* renamed from: com.bumptech.glide.load.engine.i */
public final class C6023i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class<DataType> f12923a;

    /* renamed from: b */
    public final List<? extends C7115f<DataType, ResourceType>> f12924b;

    /* renamed from: c */
    public final C8203c<ResourceType, Transcode> f12925c;

    /* renamed from: d */
    public final C6620d<List<Throwable>> f12926d;

    /* renamed from: e */
    public final String f12927e;

    public C6023i(Class cls, Class cls2, Class cls3, List list, C8203c cVar, C6652a.C6655c cVar2) {
        this.f12923a = cls;
        this.f12924b = list;
        this.f12925c = cVar;
        this.f12926d = cVar2;
        StringBuilder h = C0072d.m201h("Failed DecodePath{");
        h.append(cls.getSimpleName());
        h.append("->");
        h.append(cls2.getSimpleName());
        h.append("->");
        h.append(cls3.getSimpleName());
        h.append("}");
        this.f12927e = h.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.bumptech.glide.load.engine.s<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.bumptech.glide.load.engine.s<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.bumptech.glide.load.engine.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.bumptech.glide.load.engine.r<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.bumptech.glide.load.engine.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.bumptech.glide.load.engine.s<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.bumptech.glide.load.engine.s<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.bumptech.glide.load.engine.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: com.bumptech.glide.load.engine.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.engine.C6051s mo16962a(int r18, int r19, p150j4.C7114e r20, com.bumptech.glide.load.data.C5970e r21, com.bumptech.glide.load.engine.DecodeJob.C5987c r22) throws com.bumptech.glide.load.engine.GlideException {
        /*
            r17 = this;
            r7 = r17
            r0 = r22
            d1.d<java.util.List<java.lang.Throwable>> r1 = r7.f12926d
            java.lang.Object r1 = r1.mo18807b()
            androidx.activity.C0114h.m281L(r1)
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            r1 = r17
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r8
            com.bumptech.glide.load.engine.s r1 = r1.mo16963b(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x013f }
            d1.d<java.util.List<java.lang.Throwable>> r2 = r7.f12926d
            r2.mo18806a(r8)
            com.bumptech.glide.load.engine.DecodeJob r2 = com.bumptech.glide.load.engine.DecodeJob.this
            com.bumptech.glide.load.DataSource r0 = r0.f12834a
            r2.getClass()
            java.lang.Object r3 = r1.get()
            java.lang.Class r15 = r3.getClass()
            com.bumptech.glide.load.DataSource r3 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r4 = 0
            if (r0 == r3) goto L_0x004a
            com.bumptech.glide.load.engine.h<R> r3 = r2.f12806b
            j4.h r3 = r3.mo16961f(r15)
            com.bumptech.glide.GlideContext r5 = r2.f12813i
            int r6 = r2.f12817m
            int r8 = r2.f12818n
            com.bumptech.glide.load.engine.s r5 = r3.mo17034a(r5, r1, r6, r8)
            r14 = r3
            goto L_0x004c
        L_0x004a:
            r5 = r1
            r14 = r4
        L_0x004c:
            boolean r3 = r1.equals(r5)
            if (r3 != 0) goto L_0x0055
            r1.mo16990b()
        L_0x0055:
            com.bumptech.glide.load.engine.h<R> r1 = r2.f12806b
            com.bumptech.glide.GlideContext r1 = r1.f12907c
            com.bumptech.glide.Registry r1 = r1.getRegistry()
            y4.d r1 = r1.f12728d
            java.lang.Class r3 = r5.mo16992d()
            j4.g r1 = r1.mo20973a(r3)
            r3 = 0
            r6 = 1
            if (r1 == 0) goto L_0x006d
            r1 = r6
            goto L_0x006e
        L_0x006d:
            r1 = r3
        L_0x006e:
            if (r1 == 0) goto L_0x0095
            com.bumptech.glide.load.engine.h<R> r1 = r2.f12806b
            com.bumptech.glide.GlideContext r1 = r1.f12907c
            com.bumptech.glide.Registry r1 = r1.getRegistry()
            y4.d r1 = r1.f12728d
            java.lang.Class r4 = r5.mo16992d()
            j4.g r4 = r1.mo20973a(r4)
            if (r4 == 0) goto L_0x008b
            j4.e r1 = r2.f12820p
            com.bumptech.glide.load.EncodeStrategy r1 = r4.mo17027b(r1)
            goto L_0x0097
        L_0x008b:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Class r1 = r5.mo16992d()
            r0.<init>(r1)
            throw r0
        L_0x0095:
            com.bumptech.glide.load.EncodeStrategy r1 = com.bumptech.glide.load.EncodeStrategy.NONE
        L_0x0097:
            com.bumptech.glide.load.engine.h<R> r8 = r2.f12806b
            j4.b r9 = r2.f12829y
            java.util.ArrayList r8 = r8.mo16957b()
            int r10 = r8.size()
            r11 = r3
        L_0x00a4:
            if (r11 >= r10) goto L_0x00b9
            java.lang.Object r12 = r8.get(r11)
            o4.n$a r12 = (p197o4.C7588n.C7589a) r12
            j4.b r12 = r12.f16853a
            boolean r12 = r12.equals(r9)
            if (r12 == 0) goto L_0x00b6
            r8 = r6
            goto L_0x00ba
        L_0x00b6:
            int r11 = r11 + 1
            goto L_0x00a4
        L_0x00b9:
            r8 = r3
        L_0x00ba:
            r8 = r8 ^ r6
            com.bumptech.glide.load.engine.j r9 = r2.f12819o
            boolean r0 = r9.mo16968d(r8, r0, r1)
            if (r0 == 0) goto L_0x0136
            if (r4 == 0) goto L_0x0128
            int[] r0 = com.bumptech.glide.load.engine.DecodeJob.C5985a.f12833c
            int r8 = r1.ordinal()
            r0 = r0[r8]
            if (r0 == r6) goto L_0x0104
            r8 = 2
            if (r0 != r8) goto L_0x00ed
            com.bumptech.glide.load.engine.u r0 = new com.bumptech.glide.load.engine.u
            com.bumptech.glide.load.engine.h<R> r1 = r2.f12806b
            com.bumptech.glide.GlideContext r1 = r1.f12907c
            com.bumptech.glide.load.engine.bitmap_recycle.b r9 = r1.getArrayPool()
            j4.b r10 = r2.f12829y
            j4.b r11 = r2.f12814j
            int r12 = r2.f12817m
            int r13 = r2.f12818n
            j4.e r1 = r2.f12820p
            r8 = r0
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x010d
        L_0x00ed:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown strategy: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0104:
            com.bumptech.glide.load.engine.e r0 = new com.bumptech.glide.load.engine.e
            j4.b r1 = r2.f12829y
            j4.b r8 = r2.f12814j
            r0.<init>(r1, r8)
        L_0x010d:
            d5.a$c r1 = com.bumptech.glide.load.engine.C6049r.f13009f
            java.lang.Object r1 = r1.mo18807b()
            com.bumptech.glide.load.engine.r r1 = (com.bumptech.glide.load.engine.C6049r) r1
            androidx.activity.C0114h.m281L(r1)
            r1.f13013e = r3
            r1.f13012d = r6
            r1.f13011c = r5
            com.bumptech.glide.load.engine.DecodeJob$d<?> r2 = r2.f12811g
            r2.f12836a = r0
            r2.f12837b = r4
            r2.f12838c = r1
            r5 = r1
            goto L_0x0136
        L_0x0128:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r1 = r5.get()
            java.lang.Class r1 = r1.getClass()
            r0.<init>(r1)
            throw r0
        L_0x0136:
            v4.c<ResourceType, Transcode> r0 = r7.f12925c
            r1 = r20
            com.bumptech.glide.load.engine.s r0 = r0.mo4161k(r5, r1)
            return r0
        L_0x013f:
            r0 = move-exception
            r1 = r0
            d1.d<java.util.List<java.lang.Throwable>> r0 = r7.f12926d
            r0.mo18806a(r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C6023i.mo16962a(int, int, j4.e, com.bumptech.glide.load.data.e, com.bumptech.glide.load.engine.DecodeJob$c):com.bumptech.glide.load.engine.s");
    }

    /* renamed from: b */
    public final C6051s<ResourceType> mo16963b(C5970e<DataType> eVar, int i, int i2, C7114e eVar2, List<Throwable> list) throws GlideException {
        int size = this.f12924b.size();
        C6051s<ResourceType> sVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C7115f fVar = (C7115f) this.f12924b.get(i3);
            try {
                if (fVar.mo17023a(eVar.mo16842a(), eVar2)) {
                    sVar = fVar.mo17024b(eVar.mo16842a(), i, i2, eVar2);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(fVar);
                }
                list.add(e);
            }
            if (sVar != null) {
                break;
            }
        }
        if (sVar != null) {
            return sVar;
        }
        throw new GlideException(this.f12927e, (List<Throwable>) new ArrayList(list));
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DecodePath{ dataClass=");
        h.append(this.f12923a);
        h.append(", decoders=");
        h.append(this.f12924b);
        h.append(", transcoder=");
        h.append(this.f12925c);
        h.append('}');
        return h.toString();
    }
}
