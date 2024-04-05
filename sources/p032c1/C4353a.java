package p032c1;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;
import p032c1.C4356c;

/* renamed from: c1.a */
public final class C4353a {

    /* renamed from: d */
    public static final String f9581d = Character.toString(8206);

    /* renamed from: e */
    public static final String f9582e = Character.toString(8207);

    /* renamed from: f */
    public static final C4353a f9583f;

    /* renamed from: g */
    public static final C4353a f9584g;

    /* renamed from: a */
    public final boolean f9585a;

    /* renamed from: b */
    public final int f9586b;

    /* renamed from: c */
    public final C4355b f9587c;

    /* renamed from: c1.a$a */
    public static class C4354a {

        /* renamed from: e */
        public static final byte[] f9588e = new byte[1792];

        /* renamed from: a */
        public final CharSequence f9589a;

        /* renamed from: b */
        public final int f9590b;

        /* renamed from: c */
        public int f9591c;

        /* renamed from: d */
        public char f9592d;

        static {
            for (int i = 0; i < 1792; i++) {
                f9588e[i] = Character.getDirectionality(i);
            }
        }

        public C4354a(CharSequence charSequence) {
            this.f9589a = charSequence;
            this.f9590b = charSequence.length();
        }

        /* renamed from: a */
        public final byte mo14298a() {
            char charAt = this.f9589a.charAt(this.f9591c - 1);
            this.f9592d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f9589a, this.f9591c);
                this.f9591c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f9591c--;
            char c = this.f9592d;
            return c < 1792 ? f9588e[c] : Character.getDirectionality(c);
        }
    }

    static {
        C4356c.C4360d dVar = C4356c.f9595c;
        f9583f = new C4353a(false, 2, dVar);
        f9584g = new C4353a(true, 2, dVar);
    }

    public C4353a(boolean z, int i, C4356c.C4360d dVar) {
        this.f9585a = z;
        this.f9586b = i;
        this.f9587c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m10041a(java.lang.CharSequence r9) {
        /*
            c1.a$a r0 = new c1.a$a
            r0.<init>(r9)
            r9 = 0
            r0.f9591c = r9
            r1 = -1
            r2 = 1
            r3 = r9
            r4 = r3
            r5 = r4
        L_0x000d:
            int r6 = r0.f9591c
            int r7 = r0.f9590b
            if (r6 >= r7) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            java.lang.CharSequence r7 = r0.f9589a
            char r6 = r7.charAt(r6)
            r0.f9592d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x0039
            java.lang.CharSequence r6 = r0.f9589a
            int r7 = r0.f9591c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f9591c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f9591c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x004d
        L_0x0039:
            int r6 = r0.f9591c
            int r6 = r6 + r2
            r0.f9591c = r6
            char r6 = r0.f9592d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x0049
            byte[] r7 = p032c1.C4353a.C4354a.f9588e
            byte r6 = r7[r6]
            goto L_0x004d
        L_0x0049:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004d:
            if (r6 == 0) goto L_0x006b
            if (r6 == r2) goto L_0x0068
            r7 = 2
            if (r6 == r7) goto L_0x0068
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0060;
                case 17: goto L_0x0060;
                case 18: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x006e
        L_0x005c:
            int r5 = r5 + -1
            r4 = r9
            goto L_0x000d
        L_0x0060:
            int r5 = r5 + 1
            r4 = r2
            goto L_0x000d
        L_0x0064:
            int r5 = r5 + 1
            r4 = r1
            goto L_0x000d
        L_0x0068:
            if (r5 != 0) goto L_0x006e
            goto L_0x0088
        L_0x006b:
            if (r5 != 0) goto L_0x006e
            goto L_0x008c
        L_0x006e:
            r3 = r5
            goto L_0x000d
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            if (r4 == 0) goto L_0x0077
            r9 = r4
            goto L_0x0091
        L_0x0077:
            int r4 = r0.f9591c
            if (r4 <= 0) goto L_0x0091
            byte r4 = r0.mo14298a()
            switch(r4) {
                case 14: goto L_0x008a;
                case 15: goto L_0x008a;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0077
        L_0x0086:
            if (r3 != r5) goto L_0x008e
        L_0x0088:
            r9 = r2
            goto L_0x0091
        L_0x008a:
            if (r3 != r5) goto L_0x008e
        L_0x008c:
            r9 = r1
            goto L_0x0091
        L_0x008e:
            int r5 = r5 + -1
            goto L_0x0077
        L_0x0091:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c1.C4353a.m10041a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return 1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m10042b(java.lang.CharSequence r6) {
        /*
            c1.a$a r0 = new c1.a$a
            r0.<init>(r6)
            int r6 = r0.f9590b
            r0.f9591c = r6
            r6 = 0
            r1 = r6
        L_0x000b:
            r2 = r1
        L_0x000c:
            int r3 = r0.f9591c
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.mo14298a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0029:
            if (r1 != r2) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r1 != r2) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r2 = r2 + -1
            goto L_0x000c
        L_0x0032:
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r6 = r4
            goto L_0x0041
        L_0x0036:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            r6 = -1
            goto L_0x0041
        L_0x003d:
            if (r1 != 0) goto L_0x000c
        L_0x003f:
            r1 = r2
            goto L_0x000b
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c1.C4353a.m10042b(java.lang.CharSequence):int");
    }

    /* renamed from: c */
    public static C4353a m10043c() {
        Locale locale = Locale.getDefault();
        int i = C4361d.f9600a;
        boolean z = true;
        if (TextUtils.getLayoutDirectionFromLocale(locale) != 1) {
            z = false;
        }
        return z ? f9584g : f9583f;
    }

    /* renamed from: d */
    public final SpannableStringBuilder mo14296d(CharSequence charSequence, C4355b bVar) {
        if (charSequence == null) {
            return null;
        }
        boolean z = false;
        boolean b = ((C4356c.C4359c) bVar).mo14301b(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f9586b & 2) != 0) {
            z = true;
        }
        String str = "";
        if (z) {
            boolean b2 = (b ? C4356c.f9594b : C4356c.f9593a).mo14301b(charSequence.length(), charSequence);
            spannableStringBuilder.append((this.f9585a || (!b2 && m10041a(charSequence) != 1)) ? (!this.f9585a || (b2 && m10041a(charSequence) != -1)) ? str : f9582e : f9581d);
        }
        if (b != this.f9585a) {
            spannableStringBuilder.append(b ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b3 = (b ? C4356c.f9594b : C4356c.f9593a).mo14301b(charSequence.length(), charSequence);
        if (!this.f9585a && (b3 || m10042b(charSequence) == 1)) {
            str = f9581d;
        } else if (this.f9585a && (!b3 || m10042b(charSequence) == -1)) {
            str = f9582e;
        }
        spannableStringBuilder.append(str);
        return spannableStringBuilder;
    }

    /* renamed from: e */
    public final String mo14297e(String str) {
        C4355b bVar = this.f9587c;
        if (str == null) {
            return null;
        }
        return mo14296d(str, bVar).toString();
    }
}
