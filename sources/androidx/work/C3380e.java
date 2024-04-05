package androidx.work;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.work.e */
public final class C3380e {

    /* renamed from: b */
    public static final String f7897b = C3422l.m8214e("Data");

    /* renamed from: c */
    public static final C3380e f7898c;

    /* renamed from: a */
    public HashMap f7899a;

    /* renamed from: androidx.work.e$a */
    public static final class C3381a {

        /* renamed from: a */
        public HashMap f7900a = new HashMap();

        /* renamed from: a */
        public final C3380e mo12846a() {
            C3380e eVar = new C3380e(this.f7900a);
            C3380e.m8119b(eVar);
            return eVar;
        }

        /* renamed from: b */
        public final void mo12847b(Object obj, String str) {
            if (obj == null) {
                this.f7900a.put(str, (Object) null);
                return;
            }
            Class<?> cls = obj.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                this.f7900a.put(str, obj);
                return;
            }
            int i = 0;
            if (cls == boolean[].class) {
                HashMap hashMap = this.f7900a;
                boolean[] zArr = (boolean[]) obj;
                String str2 = C3380e.f7897b;
                Boolean[] boolArr = new Boolean[zArr.length];
                while (i < zArr.length) {
                    boolArr[i] = Boolean.valueOf(zArr[i]);
                    i++;
                }
                hashMap.put(str, boolArr);
            } else if (cls == byte[].class) {
                HashMap hashMap2 = this.f7900a;
                byte[] bArr = (byte[]) obj;
                String str3 = C3380e.f7897b;
                Byte[] bArr2 = new Byte[bArr.length];
                while (i < bArr.length) {
                    bArr2[i] = Byte.valueOf(bArr[i]);
                    i++;
                }
                hashMap2.put(str, bArr2);
            } else if (cls == int[].class) {
                HashMap hashMap3 = this.f7900a;
                int[] iArr = (int[]) obj;
                String str4 = C3380e.f7897b;
                Integer[] numArr = new Integer[iArr.length];
                while (i < iArr.length) {
                    numArr[i] = Integer.valueOf(iArr[i]);
                    i++;
                }
                hashMap3.put(str, numArr);
            } else if (cls == long[].class) {
                HashMap hashMap4 = this.f7900a;
                long[] jArr = (long[]) obj;
                String str5 = C3380e.f7897b;
                Long[] lArr = new Long[jArr.length];
                while (i < jArr.length) {
                    lArr[i] = Long.valueOf(jArr[i]);
                    i++;
                }
                hashMap4.put(str, lArr);
            } else if (cls == float[].class) {
                HashMap hashMap5 = this.f7900a;
                float[] fArr = (float[]) obj;
                String str6 = C3380e.f7897b;
                Float[] fArr2 = new Float[fArr.length];
                while (i < fArr.length) {
                    fArr2[i] = Float.valueOf(fArr[i]);
                    i++;
                }
                hashMap5.put(str, fArr2);
            } else if (cls == double[].class) {
                HashMap hashMap6 = this.f7900a;
                double[] dArr = (double[]) obj;
                String str7 = C3380e.f7897b;
                Double[] dArr2 = new Double[dArr.length];
                while (i < dArr.length) {
                    dArr2[i] = Double.valueOf(dArr[i]);
                    i++;
                }
                hashMap6.put(str, dArr2);
            } else {
                throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
            }
        }

        /* renamed from: c */
        public final void mo12848c(HashMap hashMap) {
            for (Map.Entry entry : hashMap.entrySet()) {
                mo12847b(entry.getValue(), (String) entry.getKey());
            }
        }
    }

    static {
        C3380e eVar = new C3380e(new HashMap());
        m8119b(eVar);
        f7898c = eVar;
    }

    public C3380e() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[SYNTHETIC, Splitter:B:25:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a A[SYNTHETIC, Splitter:B:34:0x006a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C3380e m8118a(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L_0x007f
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0045, ClassNotFoundException -> 0x0043, all -> 0x0041 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0045, ClassNotFoundException -> 0x0043, all -> 0x0041 }
            int r7 = r3.readInt()     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
        L_0x001b:
            if (r7 <= 0) goto L_0x002b
            java.lang.String r4 = r3.readUTF()     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
            java.lang.Object r5 = r3.readObject()     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
            r1.put(r4, r5)     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
            int r7 = r7 + -1
            goto L_0x001b
        L_0x002b:
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0035
        L_0x002f:
            r7 = move-exception
            java.lang.String r3 = f7897b
            android.util.Log.e(r3, r0, r7)
        L_0x0035:
            r2.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0060
        L_0x0039:
            r7 = move-exception
            goto L_0x005b
        L_0x003b:
            r7 = move-exception
            goto L_0x0066
        L_0x003d:
            r7 = move-exception
            goto L_0x0049
        L_0x003f:
            r7 = move-exception
            goto L_0x0049
        L_0x0041:
            r1 = move-exception
            goto L_0x0068
        L_0x0043:
            r3 = move-exception
            goto L_0x0046
        L_0x0045:
            r3 = move-exception
        L_0x0046:
            r6 = r3
            r3 = r7
            r7 = r6
        L_0x0049:
            java.lang.String r4 = f7897b     // Catch:{ all -> 0x003b }
            android.util.Log.e(r4, r0, r7)     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0035
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0035
        L_0x0054:
            r7 = move-exception
            java.lang.String r3 = f7897b
            android.util.Log.e(r3, r0, r7)
            goto L_0x0035
        L_0x005b:
            java.lang.String r2 = f7897b
            android.util.Log.e(r2, r0, r7)
        L_0x0060:
            androidx.work.e r7 = new androidx.work.e
            r7.<init>((java.util.HashMap) r1)
            return r7
        L_0x0066:
            r1 = r7
            r7 = r3
        L_0x0068:
            if (r7 == 0) goto L_0x0074
            r7.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0074
        L_0x006e:
            r7 = move-exception
            java.lang.String r3 = f7897b
            android.util.Log.e(r3, r0, r7)
        L_0x0074:
            r2.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x007e
        L_0x0078:
            r7 = move-exception
            java.lang.String r2 = f7897b
            android.util.Log.e(r2, r0, r7)
        L_0x007e:
            throw r1
        L_0x007f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C3380e.m8118a(byte[]):androidx.work.e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[SYNTHETIC, Splitter:B:30:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091 A[SYNTHETIC, Splitter:B:41:0x0091] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m8119b(androidx.work.C3380e r5) {
        /*
            java.lang.String r0 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x006d }
            r3.<init>(r1)     // Catch:{ IOException -> 0x006d }
            java.util.HashMap r2 = r5.f7899a     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            int r2 = r2.size()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeInt(r2)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.HashMap r5 = r5.f7899a     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
        L_0x0020:
            boolean r2 = r5.hasNext()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r5.next()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object r4 = r2.getKey()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeUTF(r4)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeObject(r2)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            goto L_0x0020
        L_0x003d:
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r5 = move-exception
            java.lang.String r2 = f7897b
            android.util.Log.e(r2, r0, r5)
        L_0x0047:
            r1.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x0051
        L_0x004b:
            r5 = move-exception
            java.lang.String r2 = f7897b
            android.util.Log.e(r2, r0, r5)
        L_0x0051:
            int r5 = r1.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r5 > r0) goto L_0x005e
            byte[] r5 = r1.toByteArray()
            return r5
        L_0x005e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        L_0x0066:
            r5 = move-exception
            goto L_0x008f
        L_0x0068:
            r5 = move-exception
            r2 = r3
            goto L_0x006e
        L_0x006b:
            r5 = move-exception
            goto L_0x008e
        L_0x006d:
            r5 = move-exception
        L_0x006e:
            java.lang.String r3 = f7897b     // Catch:{ all -> 0x006b }
            android.util.Log.e(r3, r0, r5)     // Catch:{ all -> 0x006b }
            byte[] r5 = r1.toByteArray()     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0083
            r2.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x0083
        L_0x007d:
            r2 = move-exception
            java.lang.String r3 = f7897b
            android.util.Log.e(r3, r0, r2)
        L_0x0083:
            r1.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x008d
        L_0x0087:
            r1 = move-exception
            java.lang.String r2 = f7897b
            android.util.Log.e(r2, r0, r1)
        L_0x008d:
            return r5
        L_0x008e:
            r3 = r2
        L_0x008f:
            if (r3 == 0) goto L_0x009b
            r3.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x009b
        L_0x0095:
            r2 = move-exception
            java.lang.String r3 = f7897b
            android.util.Log.e(r3, r0, r2)
        L_0x009b:
            r1.close()     // Catch:{ IOException -> 0x009f }
            goto L_0x00a5
        L_0x009f:
            r1 = move-exception
            java.lang.String r2 = f7897b
            android.util.Log.e(r2, r0, r1)
        L_0x00a5:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C3380e.m8119b(androidx.work.e):byte[]");
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || C3380e.class != obj.getClass()) {
            return false;
        }
        C3380e eVar = (C3380e) obj;
        Set<String> keySet = this.f7899a.keySet();
        if (!keySet.equals(eVar.f7899a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f7899a.get(str);
            Object obj3 = eVar.f7899a.get(str);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f7899a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f7899a.isEmpty()) {
            for (String str : this.f7899a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f7899a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C3380e(C3380e eVar) {
        this.f7899a = new HashMap(eVar.f7899a);
    }

    public C3380e(HashMap hashMap) {
        this.f7899a = new HashMap(hashMap);
    }
}
