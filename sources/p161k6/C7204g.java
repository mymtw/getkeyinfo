package p161k6;

import androidx.appcompat.widget.C0326j;
import com.appboy.Constants;
import com.google.android.play.core.appupdate.C15567i;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import p081d6.C6665d;
import p244t5.C7959a;
import p244t5.C7976f0;
import p244t5.C7983h0;
import p244t5.C7984h1;
import p244t5.C7998m0;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;
import p244t5.C8027v1;
import p244t5.C8036y1;
import p267v7.C8217e;
import p276w7.C8260c;
import p276w7.C8261d;

/* renamed from: k6.g */
public class C7204g extends C8005o1 {

    /* renamed from: h */
    public static final Hashtable f15990h;

    /* renamed from: i */
    public static final Boolean f15991i = new Boolean(true);

    /* renamed from: j */
    public static final Boolean f15992j = new Boolean(false);

    /* renamed from: b */
    public Vector f15993b = new Vector();

    /* renamed from: c */
    public Vector f15994c = new Vector();

    /* renamed from: d */
    public Vector f15995d = new Vector();

    /* renamed from: e */
    public C8021t1 f15996e;

    /* renamed from: f */
    public boolean f15997f;

    /* renamed from: g */
    public int f15998g;

    static {
        C7959a aVar = new C7959a("2.5.4.6");
        C7959a aVar2 = new C7959a("2.5.4.10");
        C7959a aVar3 = new C7959a("2.5.4.11");
        C7959a aVar4 = new C7959a("2.5.4.12");
        C7959a aVar5 = new C7959a("2.5.4.3");
        C7959a aVar6 = new C7959a("2.5.4.5");
        C7959a aVar7 = new C7959a("2.5.4.9");
        C7959a aVar8 = new C7959a("2.5.4.7");
        C7959a aVar9 = new C7959a("2.5.4.8");
        C7959a aVar10 = new C7959a("2.5.4.4");
        C7959a aVar11 = new C7959a("2.5.4.42");
        C7959a aVar12 = new C7959a("2.5.4.43");
        C7959a aVar13 = new C7959a("2.5.4.44");
        C7959a aVar14 = new C7959a("2.5.4.45");
        C7959a aVar15 = new C7959a("2.5.4.15");
        C7959a aVar16 = new C7959a("2.5.4.17");
        C7959a aVar17 = new C7959a("2.5.4.46");
        C7959a aVar18 = new C7959a("2.5.4.65");
        C7959a aVar19 = new C7959a("1.3.6.1.5.5.7.9.1");
        C7959a aVar20 = new C7959a("1.3.6.1.5.5.7.9.2");
        C7959a aVar21 = new C7959a("1.3.6.1.5.5.7.9.3");
        C7959a aVar22 = new C7959a("1.3.6.1.5.5.7.9.4");
        C7959a aVar23 = new C7959a("1.3.6.1.5.5.7.9.5");
        C7959a aVar24 = new C7959a("1.3.36.8.3.14");
        C7959a aVar25 = new C7959a("2.5.4.16");
        new C7959a("2.5.4.54");
        C7959a aVar26 = C7205h.f15999a;
        C7959a aVar27 = C7205h.f16000b;
        C7959a aVar28 = C6665d.f14703t0;
        C7959a aVar29 = aVar26;
        C7959a aVar30 = aVar14;
        C7959a aVar31 = C6665d.f14704u0;
        C7959a aVar32 = C6665d.f14705v0;
        C7959a aVar33 = new C7959a("0.9.2342.19200300.100.1.25");
        C7959a aVar34 = aVar13;
        C7959a aVar35 = new C7959a("0.9.2342.19200300.100.1.1");
        Hashtable hashtable = new Hashtable();
        f15990h = hashtable;
        C7959a aVar36 = aVar12;
        Hashtable hashtable2 = new Hashtable();
        Hashtable hashtable3 = new Hashtable();
        Hashtable hashtable4 = new Hashtable();
        C7959a aVar37 = aVar11;
        hashtable.put(aVar, "C");
        hashtable.put(aVar2, "O");
        hashtable.put(aVar4, "T");
        hashtable.put(aVar3, "OU");
        C7959a aVar38 = aVar4;
        hashtable.put(aVar5, "CN");
        hashtable.put(aVar8, "L");
        Object obj = "L";
        hashtable.put(aVar9, "ST");
        hashtable.put(aVar6, "SERIALNUMBER");
        hashtable.put(aVar28, "E");
        hashtable.put(aVar33, "DC");
        hashtable.put(aVar35, "UID");
        C7959a aVar39 = aVar6;
        hashtable.put(aVar7, "STREET");
        C7959a aVar40 = aVar35;
        hashtable.put(aVar10, "SURNAME");
        C7959a aVar41 = aVar10;
        hashtable.put(aVar37, "GIVENNAME");
        hashtable.put(aVar36, "INITIALS");
        hashtable.put(aVar34, "GENERATION");
        hashtable.put(aVar32, "unstructuredAddress");
        hashtable.put(aVar31, "unstructuredName");
        hashtable.put(aVar30, "UniqueIdentifier");
        hashtable.put(aVar17, "DN");
        hashtable.put(aVar18, "Pseudonym");
        hashtable.put(aVar25, "PostalAddress");
        hashtable.put(aVar24, "NameAtBirth");
        hashtable.put(aVar22, "CountryOfCitizenship");
        hashtable.put(aVar23, "CountryOfResidence");
        hashtable.put(aVar21, "Gender");
        hashtable.put(aVar20, "PlaceOfBirth");
        hashtable.put(aVar19, "DateOfBirth");
        hashtable.put(aVar16, "PostalCode");
        hashtable.put(aVar15, "BusinessCategory");
        hashtable.put(aVar29, "TelephoneNumber");
        hashtable.put(aVar27, "Name");
        Hashtable hashtable5 = hashtable2;
        hashtable5.put(aVar, "C");
        C7959a aVar42 = aVar2;
        hashtable5.put(aVar42, "O");
        hashtable5.put(aVar3, "OU");
        Object obj2 = "CN";
        hashtable5.put(aVar5, obj2);
        C7959a aVar43 = aVar5;
        hashtable5.put(aVar8, obj);
        Object obj3 = "ST";
        hashtable5.put(aVar9, obj3);
        hashtable5.put(aVar7, "STREET");
        hashtable5.put(aVar33, "DC");
        C7959a aVar44 = aVar40;
        hashtable5.put(aVar44, "UID");
        Hashtable hashtable6 = hashtable3;
        hashtable6.put(aVar, "C");
        hashtable6.put(aVar42, "O");
        hashtable6.put(aVar3, "OU");
        C7959a aVar45 = aVar43;
        hashtable6.put(aVar45, obj2);
        hashtable6.put(aVar8, obj);
        hashtable6.put(aVar9, obj3);
        hashtable6.put(aVar7, "STREET");
        Hashtable hashtable7 = hashtable4;
        hashtable7.put("c", aVar);
        hashtable7.put("o", aVar42);
        hashtable7.put(Constants.APPBOY_PUSH_TITLE_KEY, aVar38);
        hashtable7.put("ou", aVar3);
        hashtable7.put("cn", aVar45);
        hashtable7.put("l", aVar8);
        hashtable7.put("st", aVar9);
        C7959a aVar46 = aVar39;
        hashtable7.put("sn", aVar46);
        hashtable7.put("serialnumber", aVar46);
        hashtable7.put("street", aVar7);
        C7959a aVar47 = aVar28;
        hashtable7.put("emailaddress", aVar47);
        hashtable7.put("dc", aVar33);
        hashtable7.put("e", aVar47);
        hashtable7.put("uid", aVar44);
        hashtable7.put("surname", aVar41);
        hashtable7.put("givenname", aVar37);
        hashtable7.put("initials", aVar36);
        hashtable7.put("generation", aVar34);
        hashtable7.put("unstructuredaddress", aVar32);
        hashtable7.put("unstructuredname", aVar31);
        hashtable7.put("uniqueidentifier", aVar30);
        hashtable7.put("dn", aVar17);
        hashtable7.put("pseudonym", aVar18);
        hashtable7.put("postaladdress", aVar25);
        hashtable7.put("nameofbirth", aVar24);
        hashtable7.put("countryofcitizenship", aVar22);
        hashtable7.put("countryofresidence", aVar23);
        hashtable7.put("gender", aVar21);
        hashtable7.put("placeofbirth", aVar20);
        hashtable7.put("dateofbirth", aVar19);
        hashtable7.put("postalcode", aVar16);
        hashtable7.put("businesscategory", aVar15);
        hashtable7.put("telephonenumber", aVar29);
        hashtable7.put("name", aVar27);
    }

    public C7204g() {
    }

    public C7204g(C8021t1 t1Var) {
        Vector vector;
        this.f15996e = t1Var;
        Enumeration w = t1Var.mo20524w();
        while (w.hasMoreElements()) {
            C8027v1 q = C8027v1.m16171q(((C7984h1) w.nextElement()).mo12996i());
            int i = 0;
            while (true) {
                if (i < q.mo20580v()) {
                    C8021t1 s = C8021t1.m16151s(((C7984h1) q.f17510b.elementAt(i)).mo12996i());
                    if (s.mo20525y() == 2) {
                        this.f15993b.addElement(C7959a.m15938q(s.mo20523q(0)));
                        C7984h1 q2 = s.mo20523q(1);
                        if (!(q2 instanceof C8036y1) || (q2 instanceof C7998m0)) {
                            try {
                                Vector vector2 = this.f15994c;
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                byte[] a = q2.mo12996i().mo20561a("DER");
                                C8261d dVar = C8260c.f18096a;
                                byte[] b = C8260c.m16546b(0, a.length, a);
                                int length = b.length;
                                char[] cArr = new char[length];
                                for (int i2 = 0; i2 != length; i2++) {
                                    cArr[i2] = (char) (b[i2] & 255);
                                }
                                sb.append(new String(cArr));
                                vector2.addElement(sb.toString());
                            } catch (IOException unused) {
                                throw new IllegalArgumentException("cannot encode value");
                            }
                        } else {
                            String b2 = ((C8036y1) q2).mo20515b();
                            if (b2.length() <= 0 || b2.charAt(0) != '#') {
                                vector = this.f15994c;
                            } else {
                                vector = this.f15994c;
                                b2 = C0326j.m864i("\\", b2);
                            }
                            vector.addElement(b2);
                        }
                        this.f15995d.addElement(i != 0 ? f15991i : f15992j);
                        i++;
                    } else {
                        throw new IllegalArgumentException("badly sized pair");
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public static void m13868e(StringBuffer stringBuffer, Hashtable hashtable, C7959a aVar, String str) {
        int i;
        String str2 = (String) hashtable.get(aVar);
        if (str2 == null) {
            str2 = aVar.f17434b;
        }
        stringBuffer.append(str2);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (i < length2 && stringBuffer.charAt(i) == ' ') {
            stringBuffer.insert(i, "\\");
            length = i + 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 > i && stringBuffer.charAt(length2) == ' ') {
                stringBuffer.insert(length2, '\\');
            }
        }
        while (i <= length2) {
            char charAt = stringBuffer.charAt(i);
            if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            stringBuffer.insert(i, "\\");
            i += 2;
            length2++;
        }
    }

    /* renamed from: g */
    public static String m13869g(String str) {
        String b = C8217e.m16510b(str.trim());
        if (b.length() <= 0 || b.charAt(0) != '#') {
            return b;
        }
        try {
            C8018s1 m = C8018s1.m16138m(C8260c.m16545a(b.substring(1)));
            return m instanceof C8036y1 ? C8217e.m16510b(((C8036y1) m).mo20515b().trim()) : b;
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: " + e);
        }
    }

    /* renamed from: l */
    public static String m13870l(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i = 1;
            while (i < str.length()) {
                char charAt2 = str.charAt(i);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 1
            if (r14 != r13) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r14 instanceof p161k6.C7204g
            r2 = 0
            if (r1 != 0) goto L_0x000e
            boolean r1 = r14 instanceof p244t5.C8021t1
            if (r1 != 0) goto L_0x000e
            return r2
        L_0x000e:
            r1 = r14
            t5.h1 r1 = (p244t5.C7984h1) r1
            t5.s1 r1 = r1.mo12996i()
            t5.s1 r3 = r13.mo12996i()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0020
            return r0
        L_0x0020:
            if (r14 == 0) goto L_0x0045
            boolean r1 = r14 instanceof p161k6.C7204g     // Catch:{ IllegalArgumentException -> 0x00d2 }
            if (r1 == 0) goto L_0x0027
            goto L_0x0045
        L_0x0027:
            boolean r1 = r14 instanceof p128h6.C6957c     // Catch:{ IllegalArgumentException -> 0x00d2 }
            if (r1 == 0) goto L_0x003b
            k6.g r1 = new k6.g     // Catch:{ IllegalArgumentException -> 0x00d2 }
            h6.c r14 = (p128h6.C6957c) r14     // Catch:{ IllegalArgumentException -> 0x00d2 }
            t5.s1 r14 = r14.mo12996i()     // Catch:{ IllegalArgumentException -> 0x00d2 }
            t5.t1 r14 = p244t5.C8021t1.m16151s(r14)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            r1.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            goto L_0x0048
        L_0x003b:
            k6.g r1 = new k6.g     // Catch:{ IllegalArgumentException -> 0x00d2 }
            t5.t1 r14 = p244t5.C8021t1.m16151s(r14)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            r1.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            goto L_0x0048
        L_0x0045:
            r1 = r14
            k6.g r1 = (p161k6.C7204g) r1     // Catch:{ IllegalArgumentException -> 0x00d2 }
        L_0x0048:
            java.util.Vector r14 = r13.f15993b
            int r14 = r14.size()
            java.util.Vector r3 = r1.f15993b
            int r3 = r3.size()
            if (r14 == r3) goto L_0x0057
            return r2
        L_0x0057:
            boolean[] r3 = new boolean[r14]
            java.util.Vector r4 = r13.f15993b
            java.lang.Object r4 = r4.elementAt(r2)
            java.util.Vector r5 = r1.f15993b
            java.lang.Object r5 = r5.elementAt(r2)
            boolean r4 = r4.equals(r5)
            r5 = -1
            if (r4 == 0) goto L_0x0070
            r5 = r14
            r6 = r0
            r4 = r2
            goto L_0x0073
        L_0x0070:
            int r4 = r14 + -1
            r6 = r5
        L_0x0073:
            if (r4 == r5) goto L_0x00d1
            java.util.Vector r7 = r13.f15993b
            java.lang.Object r7 = r7.elementAt(r4)
            t5.a r7 = (p244t5.C7959a) r7
            java.util.Vector r8 = r13.f15994c
            java.lang.Object r8 = r8.elementAt(r4)
            java.lang.String r8 = (java.lang.String) r8
            r9 = r2
        L_0x0086:
            if (r9 >= r14) goto L_0x00cb
            boolean r10 = r3[r9]
            if (r10 == 0) goto L_0x008d
            goto L_0x00c8
        L_0x008d:
            java.util.Vector r10 = r1.f15993b
            java.lang.Object r10 = r10.elementAt(r9)
            t5.a r10 = (p244t5.C7959a) r10
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x00c8
            java.util.Vector r10 = r1.f15994c
            java.lang.Object r10 = r10.elementAt(r9)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = m13869g(r8)
            java.lang.String r10 = m13869g(r10)
            boolean r12 = r11.equals(r10)
            if (r12 != 0) goto L_0x00c1
            java.lang.String r11 = m13870l(r11)
            java.lang.String r10 = m13870l(r10)
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00c1
            r10 = r2
            goto L_0x00c2
        L_0x00c1:
            r10 = r0
        L_0x00c2:
            if (r10 == 0) goto L_0x00c8
            r3[r9] = r0
            r7 = r0
            goto L_0x00cc
        L_0x00c8:
            int r9 = r9 + 1
            goto L_0x0086
        L_0x00cb:
            r7 = r2
        L_0x00cc:
            if (r7 != 0) goto L_0x00cf
            return r2
        L_0x00cf:
            int r4 = r4 + r6
            goto L_0x0073
        L_0x00d1:
            return r0
        L_0x00d2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p161k6.C7204g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (this.f15997f) {
            return this.f15998g;
        }
        this.f15997f = true;
        for (int i = 0; i != this.f15993b.size(); i++) {
            String l = m13870l(m13869g((String) this.f15994c.elementAt(i)));
            int hashCode = this.f15998g ^ this.f15993b.elementAt(i).hashCode();
            this.f15998g = hashCode;
            this.f15998g = l.hashCode() ^ hashCode;
        }
        return this.f15998g;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        if (this.f15996e == null) {
            C15567i iVar = new C15567i(2);
            C15567i iVar2 = new C15567i(2);
            if (this.f15993b.size() == 0) {
                iVar.mo55343b(new C7983h0(iVar2));
                this.f15996e = new C7976f0(iVar);
            } else {
                new Vector().addElement((C7959a) this.f15993b.elementAt(0));
                String str = (String) this.f15994c.elementAt(0);
                throw null;
            }
        }
        return this.f15996e;
    }

    public final String toString() {
        Hashtable hashtable = f15990h;
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        for (int i = 0; i < this.f15993b.size(); i++) {
            if (((Boolean) this.f15995d.elementAt(i)).booleanValue()) {
                stringBuffer2.append('+');
                m13868e(stringBuffer2, hashtable, (C7959a) this.f15993b.elementAt(i), (String) this.f15994c.elementAt(i));
            } else {
                stringBuffer2 = new StringBuffer();
                m13868e(stringBuffer2, hashtable, (C7959a) this.f15993b.elementAt(i), (String) this.f15994c.elementAt(i));
                vector.addElement(stringBuffer2);
            }
        }
        boolean z = true;
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            stringBuffer.append(vector.elementAt(i2).toString());
        }
        return stringBuffer.toString();
    }
}
