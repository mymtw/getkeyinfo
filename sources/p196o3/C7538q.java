package p196o3;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.ref.WeakReference;
import p193o.C7507j;

/* renamed from: o3.q */
public final class C7538q {

    /* renamed from: a */
    public static final LinearInterpolator f16795a = new LinearInterpolator();

    /* renamed from: b */
    public static C7507j<WeakReference<Interpolator>> f16796b;

    /* renamed from: c */
    public static JsonReader.C4854a f16797c = JsonReader.C4854a.m10470a(Constants.APPBOY_PUSH_TITLE_KEY, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY, "e", "o", "i", "h", ResponseConstants.f19136TO, "ti");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: android.view.animation.Interpolator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> p214q3.C7718a<T> m14519a(com.airbnb.lottie.parser.moshi.JsonReader r16, com.airbnb.lottie.C4828c r17, float r18, p196o3.C7528h0<T> r19, boolean r20) throws java.io.IOException {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            if (r20 == 0) goto L_0x0119
            java.lang.Class<o3.q> r3 = p196o3.C7538q.class
            r16.mo14626b()
            r6 = 0
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r15 = r13
            r7 = 0
            r14 = 0
        L_0x0016:
            boolean r12 = r16.mo14629f()
            if (r12 == 0) goto L_0x0058
            com.airbnb.lottie.parser.moshi.JsonReader$a r12 = f16797c
            int r12 = r0.mo14637r(r12)
            switch(r12) {
                case 0: goto L_0x0052;
                case 1: goto L_0x004d;
                case 2: goto L_0x0048;
                case 3: goto L_0x0043;
                case 4: goto L_0x003e;
                case 5: goto L_0x0033;
                case 6: goto L_0x002e;
                case 7: goto L_0x0029;
                default: goto L_0x0025;
            }
        L_0x0025:
            r16.mo14639u()
            goto L_0x0016
        L_0x0029:
            android.graphics.PointF r13 = p196o3.C7536p.m14516b(r0, r1)
            goto L_0x0016
        L_0x002e:
            android.graphics.PointF r15 = p196o3.C7536p.m14516b(r0, r1)
            goto L_0x0016
        L_0x0033:
            int r7 = r16.mo14633i()
            r12 = 1
            if (r7 != r12) goto L_0x003c
            r7 = r12
            goto L_0x0016
        L_0x003c:
            r7 = 0
            goto L_0x0016
        L_0x003e:
            android.graphics.PointF r9 = p196o3.C7536p.m14516b(r0, r1)
            goto L_0x0016
        L_0x0043:
            android.graphics.PointF r8 = p196o3.C7536p.m14516b(r0, r1)
            goto L_0x0016
        L_0x0048:
            java.lang.Object r10 = r2.mo19999a(r0, r1)
            goto L_0x0016
        L_0x004d:
            java.lang.Object r11 = r2.mo19999a(r0, r1)
            goto L_0x0016
        L_0x0052:
            double r4 = r16.mo14632h()
            float r14 = (float) r4
            goto L_0x0016
        L_0x0058:
            r16.mo14628e()
            if (r7 == 0) goto L_0x0062
            android.view.animation.LinearInterpolator r0 = f16795a
            r12 = r11
            goto L_0x0107
        L_0x0062:
            if (r8 == 0) goto L_0x0103
            if (r9 == 0) goto L_0x0103
            float r0 = r8.x
            float r2 = -r1
            float r0 = p206p3.C7658d.m14697b(r0, r2, r1)
            r8.x = r0
            float r0 = r8.y
            r4 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r5 = 1120403456(0x42c80000, float:100.0)
            float r0 = p206p3.C7658d.m14697b(r0, r4, r5)
            r8.y = r0
            float r0 = r9.x
            float r0 = p206p3.C7658d.m14697b(r0, r2, r1)
            r9.x = r0
            float r0 = r9.y
            float r0 = p206p3.C7658d.m14697b(r0, r4, r5)
            r9.y = r0
            float r2 = r8.x
            float r4 = r8.y
            float r5 = r9.x
            android.graphics.PathMeasure r7 = p206p3.C7659e.f16963a
            r7 = 0
            int r12 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x009e
            r12 = 527(0x20f, float:7.38E-43)
            float r12 = (float) r12
            float r12 = r12 * r2
            int r2 = (int) r12
            goto L_0x00a0
        L_0x009e:
            r2 = 17
        L_0x00a0:
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x00a9
            int r2 = r2 * 31
            float r2 = (float) r2
            float r2 = r2 * r4
            int r2 = (int) r2
        L_0x00a9:
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x00b2
            int r2 = r2 * 31
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = (int) r2
        L_0x00b2:
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x00bb
            int r2 = r2 * 31
            float r2 = (float) r2
            float r2 = r2 * r0
            int r2 = (int) r2
        L_0x00bb:
            monitor-enter(r3)
            o.j<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r0 = f16796b     // Catch:{ all -> 0x0100 }
            if (r0 != 0) goto L_0x00c7
            o.j r0 = new o.j     // Catch:{ all -> 0x0100 }
            r0.<init>()     // Catch:{ all -> 0x0100 }
            f16796b = r0     // Catch:{ all -> 0x0100 }
        L_0x00c7:
            o.j<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r0 = f16796b     // Catch:{ all -> 0x0100 }
            java.lang.Object r0 = r0.mo19993f(r2, r6)     // Catch:{ all -> 0x0100 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x0100 }
            monitor-exit(r3)     // Catch:{ all -> 0x0100 }
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r4 = r0.get()
            r6 = r4
            android.view.animation.Interpolator r6 = (android.view.animation.Interpolator) r6
        L_0x00d9:
            if (r0 == 0) goto L_0x00dd
            if (r6 != 0) goto L_0x0105
        L_0x00dd:
            float r0 = r8.x
            float r0 = r0 / r1
            float r4 = r8.y
            float r4 = r4 / r1
            float r5 = r9.x
            float r5 = r5 / r1
            float r6 = r9.y
            float r6 = r6 / r1
            android.view.animation.PathInterpolator r1 = new android.view.animation.PathInterpolator
            r1.<init>(r0, r4, r5, r6)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00fe }
            r0.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00fe }
            monitor-enter(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00fe }
            o.j<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r4 = f16796b     // Catch:{ all -> 0x00fb }
            r4.mo19994h(r2, r0)     // Catch:{ all -> 0x00fb }
            monitor-exit(r3)     // Catch:{ all -> 0x00fb }
            goto L_0x00fe
        L_0x00fb:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00fb }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00fe }
        L_0x00fe:
            r6 = r1
            goto L_0x0105
        L_0x0100:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0100 }
            throw r0
        L_0x0103:
            android.view.animation.LinearInterpolator r6 = f16795a
        L_0x0105:
            r0 = r6
            r12 = r10
        L_0x0107:
            q3.a r1 = new q3.a
            r2 = 0
            r9 = r1
            r10 = r17
            r6 = r13
            r13 = r0
            r3 = r15
            r15 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.f17125m = r3
            r1.f17126n = r6
            return r1
        L_0x0119:
            java.lang.Object r0 = r2.mo19999a(r0, r1)
            q3.a r1 = new q3.a
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p196o3.C7538q.m14519a(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.c, float, o3.h0, boolean):q3.a");
    }
}
