package androidx.profileinstaller;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.conversation.MessageDraft;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import p003a2.C0015b;
import p003a2.C0023f;

/* renamed from: androidx.profileinstaller.m */
public final class C3071m {

    /* renamed from: a */
    public static final byte[] f6990a = {112, 114, 111, 0};

    /* renamed from: b */
    public static final byte[] f6991b = {112, 114, 109, 0};

    /* renamed from: a */
    public static byte[] m7234a(C3058c[] cVarArr, byte[] bArr) throws IOException {
        int i = 0;
        int i2 = 0;
        for (C3058c cVar : cVarArr) {
            i2 += (((((cVar.f6972g * 2) + 8) - 1) & -8) / 8) + (cVar.f6970e * 2) + m7235b(cVar.f6966a, bArr, cVar.f6967b).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f6971f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, C3072n.f6994c)) {
            int length = cVarArr.length;
            while (i < length) {
                C3058c cVar2 = cVarArr[i];
                m7245l(byteArrayOutputStream, cVar2, m7235b(cVar2.f6966a, bArr, cVar2.f6967b));
                m7247n(byteArrayOutputStream, cVar2);
                m7244k(byteArrayOutputStream, cVar2);
                m7246m(byteArrayOutputStream, cVar2);
                i++;
            }
        } else {
            for (C3058c cVar3 : cVarArr) {
                m7245l(byteArrayOutputStream, cVar3, m7235b(cVar3.f6966a, bArr, cVar3.f6967b));
            }
            int length2 = cVarArr.length;
            while (i < length2) {
                C3058c cVar4 = cVarArr[i];
                m7247n(byteArrayOutputStream, cVar4);
                m7244k(byteArrayOutputStream, cVar4);
                m7246m(byteArrayOutputStream, cVar4);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        StringBuilder h = C0072d.m201h("The bytes saved do not match expectation. actual=");
        h.append(byteArrayOutputStream.size());
        h.append(" expected=");
        h.append(i2);
        throw new IllegalStateException(h.toString());
    }

    /* renamed from: b */
    public static String m7235b(String str, byte[] bArr, String str2) {
        byte[] bArr2 = C3072n.f6996e;
        String str3 = "!";
        String str4 = (!Arrays.equals(bArr, bArr2) && !Arrays.equals(bArr, C3072n.f6995d)) ? str3 : MessageDraft.IMAGE_DELIMITER;
        if (str.length() <= 0) {
            if (str3.equals(str4)) {
                return str2.replace(MessageDraft.IMAGE_DELIMITER, str3);
            }
            if (MessageDraft.IMAGE_DELIMITER.equals(str4)) {
                str2 = str2.replace(str3, MessageDraft.IMAGE_DELIMITER);
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains(str3) || str2.contains(MessageDraft.IMAGE_DELIMITER)) {
                if (str3.equals(str4)) {
                    return str2.replace(MessageDraft.IMAGE_DELIMITER, str3);
                }
                if (MessageDraft.IMAGE_DELIMITER.equals(str4)) {
                    str2 = str2.replace(str3, MessageDraft.IMAGE_DELIMITER);
                }
                return str2;
            } else if (str2.endsWith(".apk")) {
                return str2;
            } else {
                StringBuilder h = C0072d.m201h(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, C3072n.f6995d)) {
                    str3 = MessageDraft.IMAGE_DELIMITER;
                }
                return C0023f.m110k(h, str3, str2);
            }
        }
    }

    /* renamed from: c */
    public static int m7236c(int i, int i2, int i3) {
        if (i == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        } else if (i == 2) {
            return i2;
        } else {
            if (i == 4) {
                return i2 + i3;
            }
            throw new IllegalStateException(C0015b.m88g("Unexpected flag: ", i));
        }
    }

    /* renamed from: d */
    public static int[] m7237d(ByteArrayInputStream byteArrayInputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += C3059d.m7226e(byteArrayInputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    /* renamed from: e */
    public static C3058c[] m7238e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C3058c[] cVarArr) throws IOException {
        byte[] bArr3 = C3072n.f6997f;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(C3072n.f6992a, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int d = (int) C3059d.m7225d(fileInputStream, 1);
                byte[] c = C3059d.m7224c(fileInputStream, (int) C3059d.m7225d(fileInputStream, 4), (int) C3059d.m7225d(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
                    try {
                        C3058c[] f = m7239f(byteArrayInputStream, d, cVarArr);
                        byteArrayInputStream.close();
                        return f;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, C3072n.f6998g)) {
            int e = C3059d.m7226e(fileInputStream);
            byte[] c2 = C3059d.m7224c(fileInputStream, (int) C3059d.m7225d(fileInputStream, 4), (int) C3059d.m7225d(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(c2);
                try {
                    C3058c[] g = m7240g(byteArrayInputStream2, bArr2, e, cVarArr);
                    byteArrayInputStream2.close();
                    return g;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    /* renamed from: f */
    public static C3058c[] m7239f(ByteArrayInputStream byteArrayInputStream, int i, C3058c[] cVarArr) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C3058c[0];
        }
        if (i == cVarArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i3 = 0; i3 < i; i3++) {
                int e = C3059d.m7226e(byteArrayInputStream);
                iArr[i3] = C3059d.m7226e(byteArrayInputStream);
                strArr[i3] = new String(C3059d.m7223b(byteArrayInputStream, e), StandardCharsets.UTF_8);
            }
            while (i2 < i) {
                C3058c cVar = cVarArr[i2];
                if (cVar.f6967b.equals(strArr[i2])) {
                    int i4 = iArr[i2];
                    cVar.f6970e = i4;
                    cVar.f6973h = m7237d(byteArrayInputStream, i4);
                    i2++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    /* renamed from: g */
    public static C3058c[] m7240g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C3058c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C3058c[0];
        }
        if (i == cVarArr.length) {
            int i2 = 0;
            while (i2 < i) {
                C3059d.m7226e(byteArrayInputStream);
                String str = new String(C3059d.m7223b(byteArrayInputStream, C3059d.m7226e(byteArrayInputStream)), StandardCharsets.UTF_8);
                long d = C3059d.m7225d(byteArrayInputStream, 4);
                int e = C3059d.m7226e(byteArrayInputStream);
                C3058c cVar = null;
                if (cVarArr.length > 0) {
                    int indexOf = str.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str.indexOf(MessageDraft.IMAGE_DELIMITER);
                    }
                    String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= cVarArr.length) {
                            break;
                        } else if (cVarArr[i3].f6967b.equals(substring)) {
                            cVar = cVarArr[i3];
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (cVar != null) {
                    cVar.f6969d = d;
                    int[] d2 = m7237d(byteArrayInputStream, e);
                    if (Arrays.equals(bArr, C3072n.f6996e)) {
                        cVar.f6970e = e;
                        cVar.f6973h = d2;
                    }
                    i2++;
                } else {
                    throw new IllegalStateException(C0326j.m864i("Missing profile key: ", str));
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    /* renamed from: h */
    public static C3058c[] m7241h(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, C3072n.f6993b)) {
            int d = (int) C3059d.m7225d(fileInputStream, 1);
            byte[] c = C3059d.m7224c(fileInputStream, (int) C3059d.m7225d(fileInputStream, 4), (int) C3059d.m7225d(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
                try {
                    C3058c[] i = m7242i(byteArrayInputStream, str, d);
                    byteArrayInputStream.close();
                    return i;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    /* renamed from: i */
    public static C3058c[] m7242i(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i2 = i;
        if (byteArrayInputStream.available() == 0) {
            return new C3058c[0];
        }
        C3058c[] cVarArr = new C3058c[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int e = C3059d.m7226e(byteArrayInputStream);
            int e2 = C3059d.m7226e(byteArrayInputStream);
            String str2 = str;
            cVarArr[i3] = new C3058c(str2, new String(C3059d.m7223b(byteArrayInputStream2, e), StandardCharsets.UTF_8), C3059d.m7225d(byteArrayInputStream2, 4), e2, (int) C3059d.m7225d(byteArrayInputStream2, 4), (int) C3059d.m7225d(byteArrayInputStream2, 4), new int[e2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i2) {
            C3058c cVar = cVarArr[i4];
            int available = byteArrayInputStream.available() - cVar.f6971f;
            int i5 = 0;
            while (byteArrayInputStream.available() > available) {
                i5 += C3059d.m7226e(byteArrayInputStream);
                cVar.f6974i.put(Integer.valueOf(i5), 1);
                for (int e3 = C3059d.m7226e(byteArrayInputStream); e3 > 0; e3--) {
                    C3059d.m7226e(byteArrayInputStream);
                    int d = (int) C3059d.m7225d(byteArrayInputStream2, 1);
                    if (!(d == 6 || d == 7)) {
                        while (d > 0) {
                            C3059d.m7225d(byteArrayInputStream2, 1);
                            for (int d2 = (int) C3059d.m7225d(byteArrayInputStream2, 1); d2 > 0; d2--) {
                                C3059d.m7226e(byteArrayInputStream);
                            }
                            d--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                cVar.f6973h = m7237d(byteArrayInputStream2, cVar.f6970e);
                BitSet valueOf = BitSet.valueOf(C3059d.m7223b(byteArrayInputStream2, ((((cVar.f6972g * 2) + 8) - 1) & -8) / 8));
                int i6 = 0;
                while (true) {
                    int i7 = cVar.f6972g;
                    if (i6 >= i7) {
                        break;
                    }
                    int i8 = valueOf.get(m7236c(2, i6, i7)) ? 2 : 0;
                    if (valueOf.get(m7236c(4, i6, i7))) {
                        i8 |= 4;
                    }
                    if (i8 != 0) {
                        Integer num = cVar.f6974i.get(Integer.valueOf(i6));
                        if (num == null) {
                            num = 0;
                        }
                        cVar.f6974i.put(Integer.valueOf(i6), Integer.valueOf(num.intValue() | i8));
                    }
                    i6++;
                }
                i4++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return cVarArr;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    public static boolean m7243j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C3058c[] cVarArr) throws IOException {
        Throwable th;
        Throwable th2;
        ArrayList arrayList;
        int i;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th3;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        C3058c[] cVarArr2 = cVarArr;
        int i2 = 0;
        if (Arrays.equals(bArr2, C3072n.f6992a)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                C3059d.m7228g(byteArrayOutputStream5, cVarArr2.length);
                int i3 = 2;
                int i4 = 2;
                for (C3058c cVar : cVarArr2) {
                    C3059d.m7227f(byteArrayOutputStream5, cVar.f6968c, 4);
                    C3059d.m7227f(byteArrayOutputStream5, cVar.f6969d, 4);
                    C3059d.m7227f(byteArrayOutputStream5, (long) cVar.f6972g, 4);
                    String b = m7235b(cVar.f6966a, C3072n.f6992a, cVar.f6967b);
                    int length = b.getBytes(StandardCharsets.UTF_8).length;
                    C3059d.m7228g(byteArrayOutputStream5, length);
                    i4 = i4 + 4 + 4 + 4 + 2 + (length * 1);
                    byteArrayOutputStream5.write(b.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i4 == byteArray.length) {
                    C3073o oVar = new C3073o(FileSectionType.DEX_FILES, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList2.add(oVar);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < cVarArr2.length) {
                        try {
                            C3058c cVar2 = cVarArr2[i5];
                            C3059d.m7228g(byteArrayOutputStream6, i5);
                            C3059d.m7228g(byteArrayOutputStream6, cVar2.f6970e);
                            i6 = i6 + 2 + 2 + (cVar2.f6970e * 2);
                            m7244k(byteArrayOutputStream6, cVar2);
                            i5++;
                        } catch (Throwable th5) {
                            th2.addSuppressed(th5);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i6 == byteArray2.length) {
                        C3073o oVar2 = new C3073o(FileSectionType.CLASSES, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList2.add(oVar2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < cVarArr2.length) {
                            try {
                                C3058c cVar3 = cVarArr2[i7];
                                int i9 = i2;
                                for (Map.Entry<Integer, Integer> value : cVar3.f6974i.entrySet()) {
                                    i9 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                m7246m(byteArrayOutputStream2, cVar3);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                m7247n(byteArrayOutputStream3, cVar3);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                C3059d.m7228g(byteArrayOutputStream7, i7);
                                int length2 = byteArray3.length + i3 + byteArray4.length;
                                int i10 = i8 + 2 + 4;
                                ArrayList arrayList4 = arrayList3;
                                C3059d.m7227f(byteArrayOutputStream7, (long) length2, 4);
                                C3059d.m7228g(byteArrayOutputStream7, i9);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i8 = i10 + length2;
                                i7++;
                                arrayList3 = arrayList4;
                                i2 = 0;
                                i3 = 2;
                            } catch (Throwable th6) {
                                Throwable th7 = th6;
                                try {
                                    byteArrayOutputStream7.close();
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                }
                                throw th7;
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i8 == byteArray5.length) {
                            C3073o oVar3 = new C3073o(FileSectionType.METHODS, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList2.add(oVar3);
                            long j = (long) 4;
                            long size = j + j + 4 + ((long) (arrayList2.size() * 16));
                            C3059d.m7227f(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i11 = 0;
                            while (i11 < arrayList2.size()) {
                                C3073o oVar4 = (C3073o) arrayList2.get(i11);
                                C3059d.m7227f(byteArrayOutputStream4, oVar4.f6999a.getValue(), 4);
                                C3059d.m7227f(byteArrayOutputStream4, size, 4);
                                if (oVar4.f7001c) {
                                    byte[] bArr3 = oVar4.f7000b;
                                    long length3 = (long) bArr3.length;
                                    byte[] a = C3059d.m7222a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a);
                                    C3059d.m7227f(byteArrayOutputStream4, (long) a.length, 4);
                                    C3059d.m7227f(byteArrayOutputStream4, length3, 4);
                                    i = a.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(oVar4.f7000b);
                                    C3059d.m7227f(byteArrayOutputStream4, (long) oVar4.f7000b.length, 4);
                                    C3059d.m7227f(byteArrayOutputStream4, 0, 4);
                                    i = oVar4.f7000b.length;
                                }
                                size += (long) i;
                                i11++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i12));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th9) {
                th.addSuppressed(th9);
            }
        } else {
            byte[] bArr4 = C3072n.f6993b;
            if (Arrays.equals(bArr2, bArr4)) {
                byte[] a2 = m7234a(cVarArr2, bArr4);
                C3059d.m7227f(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                C3059d.m7227f(byteArrayOutputStream4, (long) a2.length, 4);
                byte[] a3 = C3059d.m7222a(a2);
                C3059d.m7227f(byteArrayOutputStream4, (long) a3.length, 4);
                byteArrayOutputStream4.write(a3);
                return true;
            } else if (Arrays.equals(bArr2, C3072n.f6995d)) {
                C3059d.m7227f(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                for (C3058c cVar4 : cVarArr2) {
                    String b2 = m7235b(cVar4.f6966a, C3072n.f6995d, cVar4.f6967b);
                    C3059d.m7228g(byteArrayOutputStream4, b2.getBytes(StandardCharsets.UTF_8).length);
                    C3059d.m7228g(byteArrayOutputStream4, cVar4.f6973h.length);
                    C3059d.m7227f(byteArrayOutputStream4, (long) (cVar4.f6974i.size() * 4), 4);
                    C3059d.m7227f(byteArrayOutputStream4, cVar4.f6968c, 4);
                    byteArrayOutputStream4.write(b2.getBytes(StandardCharsets.UTF_8));
                    for (Integer intValue : cVar4.f6974i.keySet()) {
                        C3059d.m7228g(byteArrayOutputStream4, intValue.intValue());
                        C3059d.m7228g(byteArrayOutputStream4, 0);
                    }
                    for (int g : cVar4.f6973h) {
                        C3059d.m7228g(byteArrayOutputStream4, g);
                    }
                }
                return true;
            } else {
                byte[] bArr5 = C3072n.f6994c;
                if (Arrays.equals(bArr2, bArr5)) {
                    byte[] a4 = m7234a(cVarArr2, bArr5);
                    C3059d.m7227f(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                    C3059d.m7227f(byteArrayOutputStream4, (long) a4.length, 4);
                    byte[] a5 = C3059d.m7222a(a4);
                    C3059d.m7227f(byteArrayOutputStream4, (long) a5.length, 4);
                    byteArrayOutputStream4.write(a5);
                    return true;
                } else if (!Arrays.equals(bArr2, C3072n.f6996e)) {
                    return false;
                } else {
                    C3059d.m7228g(byteArrayOutputStream4, cVarArr2.length);
                    for (C3058c cVar5 : cVarArr2) {
                        String b3 = m7235b(cVar5.f6966a, C3072n.f6996e, cVar5.f6967b);
                        C3059d.m7228g(byteArrayOutputStream4, b3.getBytes(StandardCharsets.UTF_8).length);
                        C3059d.m7228g(byteArrayOutputStream4, cVar5.f6974i.size());
                        C3059d.m7228g(byteArrayOutputStream4, cVar5.f6973h.length);
                        C3059d.m7227f(byteArrayOutputStream4, cVar5.f6968c, 4);
                        byteArrayOutputStream4.write(b3.getBytes(StandardCharsets.UTF_8));
                        for (Integer intValue2 : cVar5.f6974i.keySet()) {
                            C3059d.m7228g(byteArrayOutputStream4, intValue2.intValue());
                        }
                        for (int g2 : cVar5.f6973h) {
                            C3059d.m7228g(byteArrayOutputStream4, g2);
                        }
                    }
                    return true;
                }
            }
        }
        throw th;
        throw th3;
        throw th4;
        throw th2;
    }

    /* renamed from: k */
    public static void m7244k(ByteArrayOutputStream byteArrayOutputStream, C3058c cVar) throws IOException {
        int i = 0;
        for (int valueOf : cVar.f6973h) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            C3059d.m7228g(byteArrayOutputStream, valueOf2.intValue() - i);
            i = valueOf2.intValue();
        }
    }

    /* renamed from: l */
    public static void m7245l(ByteArrayOutputStream byteArrayOutputStream, C3058c cVar, String str) throws IOException {
        C3059d.m7228g(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        C3059d.m7228g(byteArrayOutputStream, cVar.f6970e);
        C3059d.m7227f(byteArrayOutputStream, (long) cVar.f6971f, 4);
        C3059d.m7227f(byteArrayOutputStream, cVar.f6968c, 4);
        C3059d.m7227f(byteArrayOutputStream, (long) cVar.f6972g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: m */
    public static void m7246m(ByteArrayOutputStream byteArrayOutputStream, C3058c cVar) throws IOException {
        byte[] bArr = new byte[(((((cVar.f6972g * 2) + 8) - 1) & -8) / 8)];
        for (Map.Entry next : cVar.f6974i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int c = m7236c(2, intValue, cVar.f6972g);
                int i = c / 8;
                bArr[i] = (byte) ((1 << (c % 8)) | bArr[i]);
            }
            if ((intValue2 & 4) != 0) {
                int c2 = m7236c(4, intValue, cVar.f6972g);
                int i2 = c2 / 8;
                bArr[i2] = (byte) ((1 << (c2 % 8)) | bArr[i2]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: n */
    public static void m7247n(ByteArrayOutputStream byteArrayOutputStream, C3058c cVar) throws IOException {
        int i = 0;
        for (Map.Entry next : cVar.f6974i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            if ((((Integer) next.getValue()).intValue() & 1) != 0) {
                C3059d.m7228g(byteArrayOutputStream, intValue - i);
                C3059d.m7228g(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }
}
