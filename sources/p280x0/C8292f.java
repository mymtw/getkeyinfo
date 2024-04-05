package p280x0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: x0.f */
public final class C8292f {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f18172a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<C8294b, SparseArray<C8293a>> f18173b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f18174c = new Object();

    /* renamed from: x0.f$a */
    public static class C8293a {

        /* renamed from: a */
        public final ColorStateList f18175a;

        /* renamed from: b */
        public final Configuration f18176b;

        public C8293a(ColorStateList colorStateList, Configuration configuration) {
            this.f18175a = colorStateList;
            this.f18176b = configuration;
        }
    }

    /* renamed from: x0.f$b */
    public static final class C8294b {

        /* renamed from: a */
        public final Resources f18177a;

        /* renamed from: b */
        public final Resources.Theme f18178b;

        public C8294b(Resources resources, Resources.Theme theme) {
            this.f18177a = resources;
            this.f18178b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8294b.class != obj.getClass()) {
                return false;
            }
            C8294b bVar = (C8294b) obj;
            return this.f18177a.equals(bVar.f18177a) && Objects.equals(this.f18178b, bVar.f18178b);
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{this.f18177a, this.f18178b});
        }
    }

    /* renamed from: x0.f$c */
    public static abstract class C8295c {
        /* renamed from: a */
        public final void mo20893a(int i) {
            new Handler(Looper.getMainLooper()).post(new C8297h(this, i));
        }

        /* renamed from: b */
        public final void mo20894b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new C8296g(this, typeface));
        }

        /* renamed from: c */
        public abstract void mo3119c(int i);

        /* renamed from: d */
        public abstract void mo3120d(Typeface typeface);
    }

    /* renamed from: a */
    public static Typeface m16582a(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m16583b(context, i, new TypedValue(), 0, (C8295c) null, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca A[ADDED_TO_REGION] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m16583b(android.content.Context r15, int r16, android.util.TypedValue r17, int r18, p280x0.C8292f.C8295c r19, boolean r20, boolean r21) {
        /*
            r8 = r16
            r0 = r17
            r7 = r18
            r9 = r19
            android.content.res.Resources r10 = r15.getResources()
            r1 = 1
            r10.getValue(r8, r0, r1)
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00ec
            java.lang.String r12 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r12.startsWith(r0)
            r13 = -3
            r14 = 0
            if (r0 != 0) goto L_0x002b
            if (r9 == 0) goto L_0x00c8
            r9.mo20893a(r13)
            goto L_0x00c8
        L_0x002b:
            o.g<java.lang.String, android.graphics.Typeface> r0 = p289y0.C8356g.f18328b
            java.lang.String r1 = p289y0.C8356g.m16679b(r10, r8, r7)
            java.lang.Object r1 = r0.get(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0041
            if (r9 == 0) goto L_0x003e
            r9.mo20894b(r1)
        L_0x003e:
            r14 = r1
            goto L_0x00c8
        L_0x0041:
            if (r21 == 0) goto L_0x0045
            goto L_0x00c8
        L_0x0045:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x00ae, IOException -> 0x0098 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x00ae, IOException -> 0x0098 }
            if (r1 == 0) goto L_0x0076
            android.content.res.XmlResourceParser r0 = r10.getXml(r8)     // Catch:{ XmlPullParserException -> 0x00ae, IOException -> 0x0098 }
            x0.d$a r2 = p280x0.C8286d.m16579a(r0, r10)     // Catch:{ XmlPullParserException -> 0x00ae, IOException -> 0x0098 }
            if (r2 != 0) goto L_0x0067
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x00ae, IOException -> 0x0098 }
            if (r9 == 0) goto L_0x00c8
            r9.mo20893a(r13)     // Catch:{ XmlPullParserException -> 0x00ae, IOException -> 0x0098 }
            goto L_0x00c8
        L_0x0067:
            r1 = r15
            r3 = r10
            r4 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            android.graphics.Typeface r14 = p289y0.C8356g.m16678a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ XmlPullParserException -> 0x00ae, IOException -> 0x0098 }
            goto L_0x00c8
        L_0x0076:
            y0.m r1 = p289y0.C8356g.f18327a     // Catch:{ XmlPullParserException -> 0x00ae, IOException -> 0x0098 }
            r2 = r15
            r3 = r10
            r4 = r16
            r5 = r12
            r6 = r18
            android.graphics.Typeface r1 = r1.mo20946c(r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x00ae, IOException -> 0x0098 }
            if (r1 == 0) goto L_0x008c
            java.lang.String r2 = p289y0.C8356g.m16679b(r10, r8, r7)     // Catch:{ XmlPullParserException -> 0x00ae, IOException -> 0x0098 }
            r0.put(r2, r1)     // Catch:{ XmlPullParserException -> 0x00ae, IOException -> 0x0098 }
        L_0x008c:
            if (r9 == 0) goto L_0x003e
            if (r1 == 0) goto L_0x0094
            r9.mo20894b(r1)     // Catch:{ XmlPullParserException -> 0x00ae, IOException -> 0x0098 }
            goto L_0x003e
        L_0x0094:
            r9.mo20893a(r13)     // Catch:{ XmlPullParserException -> 0x00ae, IOException -> 0x0098 }
            goto L_0x003e
        L_0x0098:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto L_0x00c3
        L_0x00ae:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        L_0x00c3:
            if (r9 == 0) goto L_0x00c8
            r9.mo20893a(r13)
        L_0x00c8:
            if (r14 != 0) goto L_0x00eb
            if (r9 != 0) goto L_0x00eb
            if (r21 == 0) goto L_0x00cf
            goto L_0x00eb
        L_0x00cf:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r16)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00eb:
            return r14
        L_0x00ec:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.String r2 = "Resource \""
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            java.lang.String r3 = r10.getResourceName(r8)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r16)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p280x0.C8292f.m16583b(android.content.Context, int, android.util.TypedValue, int, x0.f$c, boolean, boolean):android.graphics.Typeface");
    }
}
