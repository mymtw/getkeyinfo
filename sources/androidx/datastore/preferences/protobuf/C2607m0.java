package androidx.datastore.preferences.protobuf;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.m0 */
public final class C2607m0 {
    /* renamed from: a */
    public static final String m6161a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m6162b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m6162b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m6162b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C15588c1.m25316a0(ByteString.copyFromUtf8((String) obj)));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof ByteString) {
                sb.append(": \"");
                sb.append(C15588c1.m25316a0((ByteString) obj));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof GeneratedMessageLite) {
                sb.append(" {");
                m6163c((GeneratedMessageLite) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m6162b(sb, i4, "key", entry.getKey());
                m6162b(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01cd, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01de, code lost:
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01f0, code lost:
        if (((java.lang.Double) r11).doubleValue() == com.google.android.material.shadow.ShadowDrawableWrapper.COS_45) goto L_0x0222;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m6163c(androidx.datastore.preferences.protobuf.C2602k0 r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>()
            java.lang.Class r6 = r18.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L_0x0020:
            java.lang.String r10 = "get"
            if (r9 >= r7) goto L_0x004f
            r11 = r6[r9]
            java.lang.String r12 = r11.getName()
            r4.put(r12, r11)
            java.lang.Class[] r12 = r11.getParameterTypes()
            int r12 = r12.length
            if (r12 != 0) goto L_0x004c
            java.lang.String r12 = r11.getName()
            r3.put(r12, r11)
            java.lang.String r12 = r11.getName()
            boolean r10 = r12.startsWith(r10)
            if (r10 == 0) goto L_0x004c
            java.lang.String r10 = r11.getName()
            r5.add(r10)
        L_0x004c:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x004f:
            java.util.Iterator r5 = r5.iterator()
        L_0x0053:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0241
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ""
            java.lang.String r9 = r6.replaceFirst(r10, r7)
            java.lang.String r11 = "List"
            boolean r12 = r9.endsWith(r11)
            r13 = 1
            if (r12 == 0) goto L_0x00bf
            java.lang.String r12 = "OrBuilderList"
            boolean r12 = r9.endsWith(r12)
            if (r12 != 0) goto L_0x00bf
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x00bf
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r9.substring(r8, r13)
            java.lang.String r12 = r12.toLowerCase()
            r11.append(r12)
            int r12 = r9.length()
            int r12 = r12 + -4
            java.lang.String r12 = r9.substring(r13, r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.Object r12 = r3.get(r6)
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r12 == 0) goto L_0x00bf
            java.lang.Class r14 = r12.getReturnType()
            java.lang.Class<java.util.List> r15 = java.util.List.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x00bf
            java.lang.String r6 = m6161a(r11)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.m5605o(r0, r12, r7)
            m6162b(r1, r2, r6, r7)
            goto L_0x0053
        L_0x00bf:
            java.lang.String r11 = "Map"
            boolean r12 = r9.endsWith(r11)
            if (r12 == 0) goto L_0x0123
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x0123
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r9.substring(r8, r13)
            java.lang.String r12 = r12.toLowerCase()
            r11.append(r12)
            int r12 = r9.length()
            int r12 = r12 + -3
            java.lang.String r12 = r9.substring(r13, r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.Object r6 = r3.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L_0x0123
            java.lang.Class r12 = r6.getReturnType()
            java.lang.Class<java.util.Map> r14 = java.util.Map.class
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x0123
            java.lang.Class<java.lang.Deprecated> r12 = java.lang.Deprecated.class
            boolean r12 = r6.isAnnotationPresent(r12)
            if (r12 != 0) goto L_0x0123
            int r12 = r6.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 == 0) goto L_0x0123
            java.lang.String r7 = m6161a(r11)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.m5605o(r0, r6, r9)
            m6162b(r1, r2, r7, r6)
            goto L_0x0053
        L_0x0123:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "set"
            r6.append(r11)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r4.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 != 0) goto L_0x013e
            goto L_0x0053
        L_0x013e:
            java.lang.String r6 = "Bytes"
            boolean r6 = r9.endsWith(r6)
            if (r6 == 0) goto L_0x0163
            java.lang.StringBuilder r6 = android.support.p013v4.media.C0072d.m201h(r10)
            int r11 = r9.length()
            int r11 = r11 + -5
            java.lang.String r11 = r9.substring(r8, r11)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            boolean r6 = r3.containsKey(r6)
            if (r6 == 0) goto L_0x0163
            goto L_0x0053
        L_0x0163:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = r9.substring(r8, r13)
            java.lang.String r11 = r11.toLowerCase()
            r6.append(r11)
            java.lang.String r11 = r9.substring(r13)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.Object r11 = r3.get(r11)
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "has"
            r12.append(r14)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            java.lang.Object r9 = r3.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r11 == 0) goto L_0x0053
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.Object r11 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.m5605o(r0, r11, r12)
            if (r9 != 0) goto L_0x022a
            boolean r9 = r11 instanceof java.lang.Boolean
            if (r9 == 0) goto L_0x01c2
            r7 = r11
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r7 = r7 ^ r13
            goto L_0x0225
        L_0x01c2:
            boolean r9 = r11 instanceof java.lang.Integer
            if (r9 == 0) goto L_0x01d0
            r7 = r11
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L_0x0224
            goto L_0x0222
        L_0x01d0:
            boolean r9 = r11 instanceof java.lang.Float
            if (r9 == 0) goto L_0x01e1
            r7 = r11
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0224
            goto L_0x0222
        L_0x01e1:
            boolean r9 = r11 instanceof java.lang.Double
            if (r9 == 0) goto L_0x01f3
            r7 = r11
            java.lang.Double r7 = (java.lang.Double) r7
            double r14 = r7.doubleValue()
            r16 = 0
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 != 0) goto L_0x0224
            goto L_0x0222
        L_0x01f3:
            boolean r9 = r11 instanceof java.lang.String
            if (r9 == 0) goto L_0x01fc
            boolean r7 = r11.equals(r7)
            goto L_0x0225
        L_0x01fc:
            boolean r7 = r11 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r7 == 0) goto L_0x0207
            androidx.datastore.preferences.protobuf.ByteString r7 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
            boolean r7 = r11.equals(r7)
            goto L_0x0225
        L_0x0207:
            boolean r7 = r11 instanceof androidx.datastore.preferences.protobuf.C2602k0
            if (r7 == 0) goto L_0x0215
            r7 = r11
            androidx.datastore.preferences.protobuf.k0 r7 = (androidx.datastore.preferences.protobuf.C2602k0) r7
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r7 = r7.mo9462d()
            if (r11 != r7) goto L_0x0224
            goto L_0x0222
        L_0x0215:
            boolean r7 = r11 instanceof java.lang.Enum
            if (r7 == 0) goto L_0x0224
            r7 = r11
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
            if (r7 != 0) goto L_0x0224
        L_0x0222:
            r7 = r13
            goto L_0x0225
        L_0x0224:
            r7 = r8
        L_0x0225:
            if (r7 != 0) goto L_0x0228
            goto L_0x0236
        L_0x0228:
            r13 = r8
            goto L_0x0236
        L_0x022a:
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.m5605o(r0, r9, r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r13 = r7.booleanValue()
        L_0x0236:
            if (r13 == 0) goto L_0x0053
            java.lang.String r6 = m6161a(r6)
            m6162b(r1, r2, r6, r11)
            goto L_0x0053
        L_0x0241:
            boolean r3 = r0 instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite.C2523c
            if (r3 == 0) goto L_0x026d
            r3 = r0
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$c r3 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.C2523c) r3
            androidx.datastore.preferences.protobuf.s<androidx.datastore.preferences.protobuf.GeneratedMessageLite$d> r3 = r3.extensions
            java.util.Iterator r3 = r3.mo9884k()
        L_0x024e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x026d
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$d r5 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.C2524d) r5
            r5.getClass()
            java.lang.Object r4 = r4.getValue()
            java.lang.String r5 = "[0]"
            m6162b(r1, r2, r5, r4)
            goto L_0x024e
        L_0x026d:
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r0
            androidx.datastore.preferences.protobuf.e1 r0 = r0.unknownFields
            if (r0 == 0) goto L_0x028b
        L_0x0273:
            int r3 = r0.f5861a
            if (r8 >= r3) goto L_0x028b
            int[] r3 = r0.f5862b
            r3 = r3[r8]
            int r3 = r3 >>> 3
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object[] r4 = r0.f5863c
            r4 = r4[r8]
            m6162b(r1, r2, r3, r4)
            int r8 = r8 + 1
            goto L_0x0273
        L_0x028b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2607m0.m6163c(androidx.datastore.preferences.protobuf.k0, java.lang.StringBuilder, int):void");
    }
}
