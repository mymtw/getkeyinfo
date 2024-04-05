package p280x0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import com.google.logging.type.LogSeverity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import p021b1.C3456e;
import p405nc.C13110a;

/* renamed from: x0.d */
public final class C8286d {

    /* renamed from: x0.d$a */
    public interface C8287a {
    }

    /* renamed from: x0.d$b */
    public static final class C8288b implements C8287a {

        /* renamed from: a */
        public final C8289c[] f18159a;

        public C8288b(C8289c[] cVarArr) {
            this.f18159a = cVarArr;
        }
    }

    /* renamed from: x0.d$c */
    public static final class C8289c {

        /* renamed from: a */
        public final String f18160a;

        /* renamed from: b */
        public int f18161b;

        /* renamed from: c */
        public boolean f18162c;

        /* renamed from: d */
        public String f18163d;

        /* renamed from: e */
        public int f18164e;

        /* renamed from: f */
        public int f18165f;

        public C8289c(int i, int i2, int i3, String str, String str2, boolean z) {
            this.f18160a = str;
            this.f18161b = i;
            this.f18162c = z;
            this.f18163d = str2;
            this.f18164e = i2;
            this.f18165f = i3;
        }
    }

    /* renamed from: x0.d$d */
    public static final class C8290d implements C8287a {

        /* renamed from: a */
        public final C3456e f18166a;

        /* renamed from: b */
        public final int f18167b;

        /* renamed from: c */
        public final int f18168c;

        /* renamed from: d */
        public final String f18169d;

        public C8290d(C3456e eVar, int i, int i2, String str) {
            this.f18166a = eVar;
            this.f18168c = i;
            this.f18167b = i2;
            this.f18169d = str;
        }
    }

    /* renamed from: a */
    public static C8287a m16579a(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C13110a.f28827e);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C13110a.f28828f);
                                int i = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i = 1;
                                }
                                int i2 = obtainAttributes2.getInt(i, LogSeverity.WARNING_VALUE);
                                boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                                int i3 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i3 = 3;
                                }
                                int i4 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i4 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i4);
                                int i5 = obtainAttributes2.getInt(i3, 0);
                                int i6 = obtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = obtainAttributes2.getResourceId(i6, 0);
                                String string6 = obtainAttributes2.getString(i6);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    m16581c(xmlResourceParser);
                                }
                                arrayList.add(new C8289c(i2, i5, resourceId2, string6, string5, z));
                            } else {
                                m16581c(xmlResourceParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new C8288b((C8289c[]) arrayList.toArray(new C8289c[arrayList.size()]));
                    }
                } else {
                    while (xmlResourceParser.next() != 3) {
                        m16581c(xmlResourceParser);
                    }
                    return new C8290d(new C3456e(string, string2, string3, m16580b(resources2, resourceId)), integer, integer2, string4);
                }
            } else {
                m16581c(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static List<List<byte[]>> m16580b(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: c */
    public static void m16581c(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
