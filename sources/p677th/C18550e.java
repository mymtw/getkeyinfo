package p677th;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p513bj.C14051c0;
import p677th.C18545b;

/* renamed from: th.e */
public final class C18550e {

    /* renamed from: a */
    public static final String[] f40830a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    public static final String[] f40831b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    public static final String[] f40832c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (java.lang.Integer.parseInt(r10) == 1) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r6 == -1) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r6 = -9223372036854775807L;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p677th.C18545b m31302a(java.lang.String r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r19
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = p513bj.C14051c0.m21657c(r0, r1)
            if (r2 == 0) goto L_0x00d6
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.m25826of()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r3
        L_0x0027:
            r0.next()
            java.lang.String r7 = "rdf:Description"
            boolean r7 = p513bj.C14051c0.m21657c(r0, r7)
            r8 = 0
            if (r7 == 0) goto L_0x00a2
            java.lang.String[] r2 = f40830a
            r5 = 0
            r6 = r5
        L_0x0037:
            r7 = 4
            r9 = 1
            if (r6 >= r7) goto L_0x004d
            r10 = r2[r6]
            java.lang.String r10 = p513bj.C14051c0.m21655a(r0, r10)
            if (r10 == 0) goto L_0x004a
            int r2 = java.lang.Integer.parseInt(r10)
            if (r2 != r9) goto L_0x004d
            goto L_0x004e
        L_0x004a:
            int r6 = r6 + 1
            goto L_0x0037
        L_0x004d:
            r9 = r5
        L_0x004e:
            if (r9 != 0) goto L_0x0051
            return r8
        L_0x0051:
            java.lang.String[] r2 = f40831b
            r6 = r5
        L_0x0054:
            if (r6 >= r7) goto L_0x006c
            r9 = r2[r6]
            java.lang.String r9 = p513bj.C14051c0.m21655a(r0, r9)
            if (r9 == 0) goto L_0x0069
            long r6 = java.lang.Long.parseLong(r9)
            r9 = -1
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x006d
            goto L_0x006c
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x0054
        L_0x006c:
            r6 = r3
        L_0x006d:
            java.lang.String[] r2 = f40832c
        L_0x006f:
            r9 = 2
            if (r5 >= r9) goto L_0x009c
            r9 = r2[r5]
            java.lang.String r9 = p513bj.C14051c0.m21655a(r0, r9)
            if (r9 == 0) goto L_0x0099
            long r11 = java.lang.Long.parseLong(r9)
            th.b$a r2 = new th.b$a
            r14 = 0
            r16 = 0
            java.lang.String r18 = "image/jpeg"
            r13 = r2
            r13.<init>(r14, r16, r18)
            th.b$a r5 = new th.b$a
            r13 = 0
            java.lang.String r15 = "video/mp4"
            r10 = r5
            r10.<init>(r11, r13, r15)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.m25828of(r2, r5)
            goto L_0x00a0
        L_0x0099:
            int r5 = r5 + 1
            goto L_0x006f
        L_0x009c:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.m25826of()
        L_0x00a0:
            r5 = r6
            goto L_0x00c3
        L_0x00a2:
            java.lang.String r7 = "Container:Directory"
            boolean r7 = p513bj.C14051c0.m21657c(r0, r7)
            if (r7 == 0) goto L_0x00b3
            java.lang.String r2 = "Container"
            java.lang.String r7 = "Item"
            com.google.common.collect.ImmutableList r2 = m31303b(r0, r2, r7)
            goto L_0x00c3
        L_0x00b3:
            java.lang.String r7 = "GContainer:Directory"
            boolean r7 = p513bj.C14051c0.m21657c(r0, r7)
            if (r7 == 0) goto L_0x00c3
            java.lang.String r2 = "GContainer"
            java.lang.String r7 = "GContainerItem"
            com.google.common.collect.ImmutableList r2 = m31303b(r0, r2, r7)
        L_0x00c3:
            boolean r7 = p513bj.C14051c0.m21656b(r0, r1)
            if (r7 == 0) goto L_0x0027
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00d0
            return r8
        L_0x00d0:
            th.b r0 = new th.b
            r0.<init>(r5, r2)
            return r0
        L_0x00d6:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Couldn't find xmp metadata"
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p677th.C18550e.m31302a(java.lang.String):th.b");
    }

    /* renamed from: b */
    public static ImmutableList<C18545b.C18546a> m31303b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.C15953a builder = ImmutableList.builder();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (C14051c0.m21657c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a = C14051c0.m21655a(xmlPullParser, concat3);
                String a2 = C14051c0.m21655a(xmlPullParser, concat4);
                String a3 = C14051c0.m21655a(xmlPullParser, concat5);
                String a4 = C14051c0.m21655a(xmlPullParser, concat6);
                if (a == null || a2 == null) {
                    return ImmutableList.m25826of();
                }
                builder.mo56633b(new C18545b.C18546a(a3 != null ? Long.parseLong(a3) : 0, a4 != null ? Long.parseLong(a4) : 0, a));
            }
        } while (!C14051c0.m21656b(xmlPullParser, concat2));
        return builder.mo56664e();
    }
}
