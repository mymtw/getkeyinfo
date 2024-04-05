package p212q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import kotlin.reflect.C19421p;

/* renamed from: q0.a */
public final class C7709a {

    /* renamed from: a */
    public final ConstraintLayout f17086a;

    /* renamed from: b */
    public int f17087b = -1;

    /* renamed from: c */
    public int f17088c = -1;

    /* renamed from: d */
    public SparseArray<C7710a> f17089d = new SparseArray<>();

    /* renamed from: e */
    public SparseArray<C2236a> f17090e = new SparseArray<>();

    /* renamed from: q0.a$a */
    public static class C7710a {

        /* renamed from: a */
        public int f17091a;

        /* renamed from: b */
        public ArrayList<C7711b> f17092b = new ArrayList<>();

        /* renamed from: c */
        public int f17093c = -1;

        /* renamed from: d */
        public C2236a f17094d;

        public C7710a(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C19421p.f43307I);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f17091a = obtainStyledAttributes.getResourceId(index, this.f17091a);
                } else if (index == 1) {
                    this.f17093c = obtainStyledAttributes.getResourceId(index, this.f17093c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17093c);
                    context.getResources().getResourceName(this.f17093c);
                    if (ResponseConstants.LAYOUT.equals(resourceTypeName)) {
                        C2236a aVar = new C2236a();
                        this.f17094d = aVar;
                        aVar.mo8487e((ConstraintLayout) LayoutInflater.from(context).inflate(this.f17093c, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final int mo20179a(float f, float f2) {
            for (int i = 0; i < this.f17092b.size(); i++) {
                if (this.f17092b.get(i).mo20180a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: q0.a$b */
    public static class C7711b {

        /* renamed from: a */
        public float f17095a = Float.NaN;

        /* renamed from: b */
        public float f17096b = Float.NaN;

        /* renamed from: c */
        public float f17097c = Float.NaN;

        /* renamed from: d */
        public float f17098d = Float.NaN;

        /* renamed from: e */
        public int f17099e = -1;

        /* renamed from: f */
        public C2236a f17100f;

        public C7711b(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C19421p.f43311M);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f17099e = obtainStyledAttributes.getResourceId(index, this.f17099e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17099e);
                    context.getResources().getResourceName(this.f17099e);
                    if (ResponseConstants.LAYOUT.equals(resourceTypeName)) {
                        C2236a aVar = new C2236a();
                        this.f17100f = aVar;
                        aVar.mo8487e((ConstraintLayout) LayoutInflater.from(context).inflate(this.f17099e, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f17098d = obtainStyledAttributes.getDimension(index, this.f17098d);
                } else if (index == 2) {
                    this.f17096b = obtainStyledAttributes.getDimension(index, this.f17096b);
                } else if (index == 3) {
                    this.f17097c = obtainStyledAttributes.getDimension(index, this.f17097c);
                } else if (index == 4) {
                    this.f17095a = obtainStyledAttributes.getDimension(index, this.f17095a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final boolean mo20180a(float f, float f2) {
            if (!Float.isNaN(this.f17095a) && f < this.f17095a) {
                return false;
            }
            if (!Float.isNaN(this.f17096b) && f2 < this.f17096b) {
                return false;
            }
            if (Float.isNaN(this.f17097c) || f <= this.f17097c) {
                return Float.isNaN(this.f17098d) || f2 <= this.f17098d;
            }
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7709a(android.content.Context r8, androidx.constraintlayout.widget.ConstraintLayout r9, int r10) {
        /*
            r7 = this;
            r7.<init>()
            r0 = -1
            r7.f17087b = r0
            r7.f17088c = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f17089d = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f17090e = r1
            r7.f17086a = r9
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r9.getXml(r10)
            int r10 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            r1 = 0
        L_0x0025:
            r2 = 1
            if (r10 == r2) goto L_0x00ab
            if (r10 == 0) goto L_0x009a
            r3 = 2
            if (r10 == r3) goto L_0x002f
            goto L_0x009d
        L_0x002f:
            java.lang.String r10 = r9.getName()     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            int r4 = r10.hashCode()     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L_0x0065;
                case 80204913: goto L_0x005b;
                case 1382829617: goto L_0x0051;
                case 1657696882: goto L_0x0047;
                case 1901439077: goto L_0x003d;
                default: goto L_0x003c;
            }     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
        L_0x003c:
            goto L_0x006f
        L_0x003d:
            java.lang.String r4 = "Variant"
            boolean r10 = r10.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            if (r10 == 0) goto L_0x006f
            r10 = r6
            goto L_0x0070
        L_0x0047:
            java.lang.String r4 = "layoutDescription"
            boolean r10 = r10.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            if (r10 == 0) goto L_0x006f
            r10 = 0
            goto L_0x0070
        L_0x0051:
            java.lang.String r4 = "StateSet"
            boolean r10 = r10.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            if (r10 == 0) goto L_0x006f
            r10 = r2
            goto L_0x0070
        L_0x005b:
            java.lang.String r4 = "State"
            boolean r10 = r10.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            if (r10 == 0) goto L_0x006f
            r10 = r3
            goto L_0x0070
        L_0x0065:
            java.lang.String r4 = "ConstraintSet"
            boolean r10 = r10.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            if (r10 == 0) goto L_0x006f
            r10 = r5
            goto L_0x0070
        L_0x006f:
            r10 = r0
        L_0x0070:
            if (r10 == 0) goto L_0x009d
            if (r10 == r2) goto L_0x009d
            if (r10 == r3) goto L_0x008c
            if (r10 == r6) goto L_0x007f
            if (r10 == r5) goto L_0x007b
            goto L_0x009d
        L_0x007b:
            r7.mo20177a(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            goto L_0x009d
        L_0x007f:
            q0.a$b r10 = new q0.a$b     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            r10.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            if (r1 == 0) goto L_0x009d
            java.util.ArrayList<q0.a$b> r2 = r1.f17092b     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            r2.add(r10)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            goto L_0x009d
        L_0x008c:
            q0.a$a r10 = new q0.a$a     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            r10.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            android.util.SparseArray<q0.a$a> r1 = r7.f17089d     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            int r2 = r10.f17091a     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            r1.put(r2, r10)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            r1 = r10
            goto L_0x009d
        L_0x009a:
            r9.getName()     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
        L_0x009d:
            int r10 = r9.next()     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a2 }
            goto L_0x0025
        L_0x00a2:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x00ab
        L_0x00a7:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p212q0.C7709a.<init>(android.content.Context, androidx.constraintlayout.widget.ConstraintLayout, int):void");
    }

    /* renamed from: a */
    public final void mo20177a(Context context, XmlResourceParser xmlResourceParser) {
        int i;
        C2236a aVar = new C2236a();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i2))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i2);
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                aVar.mo8492l(context, xmlResourceParser);
                this.f17090e.put(i, aVar);
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo20178b(int i, float f, float f2) {
        int a;
        int i2 = this.f17087b;
        if (i2 == i) {
            C7710a valueAt = i == -1 ? this.f17089d.valueAt(0) : this.f17089d.get(i2);
            int i3 = this.f17088c;
            if ((i3 == -1 || !valueAt.f17092b.get(i3).mo20180a(f, f2)) && this.f17088c != (a = valueAt.mo20179a(f, f2))) {
                C2236a aVar = a == -1 ? null : valueAt.f17092b.get(a).f17100f;
                if (a != -1) {
                    int i4 = valueAt.f17092b.get(a).f17099e;
                }
                if (aVar != null) {
                    this.f17088c = a;
                    aVar.mo8484b(this.f17086a);
                    return;
                }
                return;
            }
            return;
        }
        this.f17087b = i;
        C7710a aVar2 = this.f17089d.get(i);
        int a2 = aVar2.mo20179a(f, f2);
        C2236a aVar3 = a2 == -1 ? aVar2.f17094d : aVar2.f17092b.get(a2).f17100f;
        if (a2 != -1) {
            int i5 = aVar2.f17092b.get(a2).f17099e;
        }
        if (aVar3 != null) {
            this.f17088c = a2;
            aVar3.mo8484b(this.f17086a);
        }
    }
}
