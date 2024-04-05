package p244t5;

import java.io.InputStream;

/* renamed from: t5.p */
public final class C8006p extends InputStream {

    /* renamed from: b */
    public final C8033x1 f17496b;

    /* renamed from: c */
    public boolean f17497c = true;

    /* renamed from: d */
    public InputStream f17498d;

    public C8006p(C8033x1 x1Var) {
        this.f17496b = x1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read() {
        /*
            r4 = this;
            java.io.InputStream r0 = r4.f17498d
            r1 = -1
            if (r0 != 0) goto L_0x001a
            boolean r0 = r4.f17497c
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            t5.x1 r0 = r4.f17496b
            t5.h1 r0 = r0.mo20587b()
            t5.q1 r0 = (p244t5.C8011q1) r0
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            r2 = 0
            r4.f17497c = r2
            r2 = r4
            goto L_0x0035
        L_0x001a:
            r0 = r4
        L_0x001b:
            java.io.InputStream r2 = r0.f17498d
            int r2 = r2.read()
            if (r2 < 0) goto L_0x0024
            return r2
        L_0x0024:
            t5.x1 r2 = r0.f17496b
            t5.h1 r2 = r2.mo20587b()
            t5.q1 r2 = (p244t5.C8011q1) r2
            if (r2 != 0) goto L_0x0032
            r2 = 0
            r0.f17498d = r2
            return r1
        L_0x0032:
            r3 = r2
            r2 = r0
            r0 = r3
        L_0x0035:
            java.io.InputStream r0 = r0.mo20530b()
            r2.f17498d = r0
            r0 = r2
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: p244t5.C8006p.read():int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002c A[EDGE_INSN: B:22:0x002c->B:15:0x002c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002b A[SYNTHETIC] */
    public final int read(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f17498d
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            boolean r0 = r7.f17497c
            if (r0 != 0) goto L_0x000b
            return r1
        L_0x000b:
            t5.x1 r0 = r7.f17496b
            t5.h1 r0 = r0.mo20587b()
            t5.q1 r0 = (p244t5.C8011q1) r0
            if (r0 != 0) goto L_0x0016
            return r1
        L_0x0016:
            r7.f17497c = r2
            r3 = r2
            r2 = r7
            goto L_0x0043
        L_0x001b:
            r0 = r7
        L_0x001c:
            java.io.InputStream r3 = r0.f17498d
            int r4 = r9 + r2
            int r5 = r10 - r2
            int r3 = r3.read(r8, r4, r5)
            if (r3 < 0) goto L_0x002c
            int r2 = r2 + r3
            if (r2 != r10) goto L_0x001c
            return r2
        L_0x002c:
            t5.x1 r3 = r0.f17496b
            t5.h1 r3 = r3.mo20587b()
            t5.q1 r3 = (p244t5.C8011q1) r3
            if (r3 != 0) goto L_0x003f
            r8 = 0
            r0.f17498d = r8
            r8 = 1
            if (r2 >= r8) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            return r1
        L_0x003f:
            r6 = r2
            r2 = r0
            r0 = r3
            r3 = r6
        L_0x0043:
            java.io.InputStream r0 = r0.mo20530b()
            r2.f17498d = r0
            r0 = r2
            r2 = r3
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: p244t5.C8006p.read(byte[], int, int):int");
    }
}
