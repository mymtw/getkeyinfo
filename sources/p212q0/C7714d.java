package p212q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import kotlin.reflect.C19421p;

/* renamed from: q0.d */
public final class C7714d {

    /* renamed from: a */
    public int f17101a = -1;

    /* renamed from: b */
    public SparseArray<C7715a> f17102b = new SparseArray<>();

    /* renamed from: q0.d$a */
    public static class C7715a {

        /* renamed from: a */
        public int f17103a;

        /* renamed from: b */
        public ArrayList<C7716b> f17104b = new ArrayList<>();

        /* renamed from: c */
        public int f17105c = -1;

        public C7715a(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C19421p.f43307I);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f17103a = obtainStyledAttributes.getResourceId(index, this.f17103a);
                } else if (index == 1) {
                    this.f17105c = obtainStyledAttributes.getResourceId(index, this.f17105c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17105c);
                    context.getResources().getResourceName(this.f17105c);
                    ResponseConstants.LAYOUT.equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final int mo20182a(float f, float f2) {
            for (int i = 0; i < this.f17104b.size(); i++) {
                if (this.f17104b.get(i).mo20183a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: q0.d$b */
    public static class C7716b {

        /* renamed from: a */
        public float f17106a = Float.NaN;

        /* renamed from: b */
        public float f17107b = Float.NaN;

        /* renamed from: c */
        public float f17108c = Float.NaN;

        /* renamed from: d */
        public float f17109d = Float.NaN;

        /* renamed from: e */
        public int f17110e = -1;

        public C7716b(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C19421p.f43311M);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f17110e = obtainStyledAttributes.getResourceId(index, this.f17110e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17110e);
                    context.getResources().getResourceName(this.f17110e);
                    ResponseConstants.LAYOUT.equals(resourceTypeName);
                } else if (index == 1) {
                    this.f17109d = obtainStyledAttributes.getDimension(index, this.f17109d);
                } else if (index == 2) {
                    this.f17107b = obtainStyledAttributes.getDimension(index, this.f17107b);
                } else if (index == 3) {
                    this.f17108c = obtainStyledAttributes.getDimension(index, this.f17108c);
                } else if (index == 4) {
                    this.f17106a = obtainStyledAttributes.getDimension(index, this.f17106a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final boolean mo20183a(float f, float f2) {
            if (!Float.isNaN(this.f17106a) && f < this.f17106a) {
                return false;
            }
            if (!Float.isNaN(this.f17107b) && f2 < this.f17107b) {
                return false;
            }
            if (Float.isNaN(this.f17108c) || f <= this.f17108c) {
                return Float.isNaN(this.f17109d) || f2 <= this.f17109d;
            }
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7714d(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f17101a = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r9.f17102b = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r11)
            int[] r2 = kotlin.reflect.C19421p.f43308J
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r2)
            int r2 = r1.getIndexCount()
            r3 = 0
            r4 = r3
        L_0x0022:
            if (r4 >= r2) goto L_0x0035
            int r5 = r1.getIndex(r4)
            if (r5 != 0) goto L_0x0032
            int r6 = r9.f17101a
            int r5 = r1.getResourceId(r5, r6)
            r9.f17101a = r5
        L_0x0032:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x0035:
            r1.recycle()
            r1 = 0
            int r2 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
        L_0x003d:
            r4 = 1
            if (r2 == r4) goto L_0x00bf
            if (r2 == 0) goto L_0x00ae
            java.lang.String r5 = "StateSet"
            r6 = 3
            r7 = 2
            if (r2 == r7) goto L_0x0058
            if (r2 == r6) goto L_0x004c
            goto L_0x00b1
        L_0x004c:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            boolean r2 = r5.equals(r2)     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            if (r2 == 0) goto L_0x00b1
            goto L_0x00bf
        L_0x0058:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            int r8 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            switch(r8) {
                case 80204913: goto L_0x0080;
                case 1301459538: goto L_0x0076;
                case 1382829617: goto L_0x006e;
                case 1901439077: goto L_0x0064;
                default: goto L_0x0063;
            }     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
        L_0x0063:
            goto L_0x008a
        L_0x0064:
            java.lang.String r5 = "Variant"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            if (r2 == 0) goto L_0x008a
            r2 = r6
            goto L_0x008b
        L_0x006e:
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            if (r2 == 0) goto L_0x008a
            r2 = r4
            goto L_0x008b
        L_0x0076:
            java.lang.String r5 = "LayoutDescription"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            if (r2 == 0) goto L_0x008a
            r2 = r3
            goto L_0x008b
        L_0x0080:
            java.lang.String r5 = "State"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            if (r2 == 0) goto L_0x008a
            r2 = r7
            goto L_0x008b
        L_0x008a:
            r2 = r0
        L_0x008b:
            if (r2 == 0) goto L_0x00b1
            if (r2 == r4) goto L_0x00b1
            if (r2 == r7) goto L_0x00a1
            if (r2 == r6) goto L_0x0094
            goto L_0x00b1
        L_0x0094:
            q0.d$b r2 = new q0.d$b     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            r2.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            if (r1 == 0) goto L_0x00b1
            java.util.ArrayList<q0.d$b> r4 = r1.f17104b     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            r4.add(r2)     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            goto L_0x00b1
        L_0x00a1:
            q0.d$a r1 = new q0.d$a     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            r1.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            android.util.SparseArray<q0.d$a> r2 = r9.f17102b     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            int r4 = r1.f17103a     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            r2.put(r4, r1)     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            goto L_0x00b1
        L_0x00ae:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
        L_0x00b1:
            int r2 = r11.next()     // Catch:{ XmlPullParserException -> 0x00bb, IOException -> 0x00b6 }
            goto L_0x003d
        L_0x00b6:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00bf
        L_0x00bb:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p212q0.C7714d.<init>(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* renamed from: a */
    public final int mo20181a(int i) {
        int i2;
        int a;
        float f = (float) -1;
        if (-1 == i) {
            C7715a valueAt = i == -1 ? this.f17102b.valueAt(0) : this.f17102b.get(-1);
            if (valueAt == null || -1 == (a = valueAt.mo20182a(f, f))) {
                return -1;
            }
            i2 = a == -1 ? valueAt.f17105c : valueAt.f17104b.get(a).f17110e;
        } else {
            C7715a aVar = this.f17102b.get(i);
            if (aVar == null) {
                return -1;
            }
            int a2 = aVar.mo20182a(f, f);
            i2 = a2 == -1 ? aVar.f17105c : aVar.f17104b.get(a2).f17110e;
        }
        return i2;
    }
}
