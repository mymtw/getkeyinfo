package p305z7;

import java.io.IOException;

/* renamed from: z7.h */
public final class C8466h {

    /* renamed from: a */
    public static final C8471e f18491a = new C8471e();

    /* renamed from: b */
    public static final C8467a f18492b = new C8467a();

    /* renamed from: z7.h$a */
    public static class C8467a implements C8473g {
        /* renamed from: a */
        public final void mo21035a(Appendable appendable, String str) {
            String str2;
            try {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt == 12) {
                        str2 = "\\f";
                    } else if (charAt == 13) {
                        str2 = "\\r";
                    } else if (charAt == '\"') {
                        str2 = "\\\"";
                    } else if (charAt == '/') {
                        str2 = "\\/";
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case 8:
                                str2 = "\\b";
                                break;
                            case 9:
                                str2 = "\\t";
                                break;
                            case 10:
                                str2 = "\\n";
                                break;
                            default:
                                if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 12) & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 8) & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                    charAt = "0123456789ABCDEF".charAt((charAt >> 0) & 15);
                                }
                                appendable.append(charAt);
                                continue;
                        }
                    } else {
                        str2 = "\\\\";
                    }
                    appendable.append(str2);
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Error");
            }
        }
    }

    /* renamed from: z7.h$b */
    public static class C8468b implements C8473g {
        /* renamed from: a */
        public final void mo21035a(Appendable appendable, String str) {
            String str2;
            try {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt == 12) {
                        str2 = "\\f";
                    } else if (charAt == 13) {
                        str2 = "\\r";
                    } else if (charAt == '\"') {
                        str2 = "\\\"";
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case 8:
                                str2 = "\\b";
                                break;
                            case 9:
                                str2 = "\\t";
                                break;
                            case 10:
                                str2 = "\\n";
                                break;
                            default:
                                if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 12) & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 8) & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                    charAt = "0123456789ABCDEF".charAt((charAt >> 0) & 15);
                                }
                                appendable.append(charAt);
                                continue;
                        }
                    } else {
                        str2 = "\\\\";
                    }
                    appendable.append(str2);
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Exeption");
            }
        }
    }

    /* renamed from: z7.h$c */
    public static class C8469c implements C8472f {
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0054, code lost:
            if (r3 == '.') goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
            r7 = r7 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0058, code lost:
            if (r7 < r1) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x005b, code lost:
            r3 = r10.charAt(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
            if (r3 < '0') goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0061, code lost:
            if (r3 <= '9') goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
            if (r7 != r1) goto L_0x0066;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0065, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0068, code lost:
            if (r3 == 'E') goto L_0x006e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x006c, code lost:
            if (r3 != 'e') goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x006e, code lost:
            r7 = r7 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0070, code lost:
            if (r7 != r1) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0072, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0073, code lost:
            r3 = r10.charAt(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0079, code lost:
            if (r3 == '+') goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x007b, code lost:
            if (r3 != '-') goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x007d, code lost:
            r7 = r7 + 1;
            r10.charAt(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0082, code lost:
            if (r7 != r1) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0084, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0085, code lost:
            if (r7 < r1) goto L_0x0088;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0088, code lost:
            r3 = r10.charAt(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x008c, code lost:
            if (r3 < '0') goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x008e, code lost:
            if (r3 <= '9') goto L_0x0091;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0091, code lost:
            r7 = r7 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0094, code lost:
            if (r7 != r1) goto L_0x0097;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0096, code lost:
            return true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo21036a(java.lang.String r10) {
            /*
                r9 = this;
                r0 = 0
                if (r10 != 0) goto L_0x0004
                return r0
            L_0x0004:
                int r1 = r10.length()
                r2 = 1
                if (r1 != 0) goto L_0x000c
                return r2
            L_0x000c:
                java.lang.String r3 = r10.trim()
                if (r3 == r10) goto L_0x0013
                return r2
            L_0x0013:
                char r3 = r10.charAt(r0)
                boolean r4 = p305z7.C8466h.m16902b(r3)
                if (r4 != 0) goto L_0x00bc
                boolean r3 = p305z7.C8466h.m16903c(r3)
                if (r3 == 0) goto L_0x0025
                goto L_0x00bc
            L_0x0025:
                r3 = r2
            L_0x0026:
                if (r3 < r1) goto L_0x0098
                boolean r3 = p305z7.C8466h.m16901a(r10)
                if (r3 == 0) goto L_0x002f
                return r2
            L_0x002f:
                char r3 = r10.charAt(r0)
                r4 = 45
                r5 = 57
                r6 = 48
                if (r3 < r6) goto L_0x003d
                if (r3 <= r5) goto L_0x003f
            L_0x003d:
                if (r3 != r4) goto L_0x0097
            L_0x003f:
                r7 = r2
            L_0x0040:
                if (r7 < r1) goto L_0x0043
                goto L_0x004f
            L_0x0043:
                char r3 = r10.charAt(r7)
                if (r3 < r6) goto L_0x004f
                if (r3 <= r5) goto L_0x004c
                goto L_0x004f
            L_0x004c:
                int r7 = r7 + 1
                goto L_0x0040
            L_0x004f:
                if (r7 != r1) goto L_0x0052
                return r2
            L_0x0052:
                r8 = 46
                if (r3 != r8) goto L_0x0058
            L_0x0056:
                int r7 = r7 + 1
            L_0x0058:
                if (r7 < r1) goto L_0x005b
                goto L_0x0063
            L_0x005b:
                char r3 = r10.charAt(r7)
                if (r3 < r6) goto L_0x0063
                if (r3 <= r5) goto L_0x0056
            L_0x0063:
                if (r7 != r1) goto L_0x0066
                return r2
            L_0x0066:
                r8 = 69
                if (r3 == r8) goto L_0x006e
                r8 = 101(0x65, float:1.42E-43)
                if (r3 != r8) goto L_0x0082
            L_0x006e:
                int r7 = r7 + 1
                if (r7 != r1) goto L_0x0073
                return r0
            L_0x0073:
                char r3 = r10.charAt(r7)
                r8 = 43
                if (r3 == r8) goto L_0x007d
                if (r3 != r4) goto L_0x0082
            L_0x007d:
                int r7 = r7 + 1
                r10.charAt(r7)
            L_0x0082:
                if (r7 != r1) goto L_0x0085
                return r0
            L_0x0085:
                if (r7 < r1) goto L_0x0088
                goto L_0x0094
            L_0x0088:
                char r3 = r10.charAt(r7)
                if (r3 < r6) goto L_0x0094
                if (r3 <= r5) goto L_0x0091
                goto L_0x0094
            L_0x0091:
                int r7 = r7 + 1
                goto L_0x0085
            L_0x0094:
                if (r7 != r1) goto L_0x0097
                return r2
            L_0x0097:
                return r0
            L_0x0098:
                char r4 = r10.charAt(r3)
                r5 = 125(0x7d, float:1.75E-43)
                if (r4 == r5) goto L_0x00ae
                r5 = 93
                if (r4 == r5) goto L_0x00ae
                r5 = 44
                if (r4 == r5) goto L_0x00ae
                r5 = 58
                if (r4 == r5) goto L_0x00ae
                r5 = r0
                goto L_0x00af
            L_0x00ae:
                r5 = r2
            L_0x00af:
                if (r5 != 0) goto L_0x00bc
                boolean r4 = p305z7.C8466h.m16903c(r4)
                if (r4 == 0) goto L_0x00b8
                goto L_0x00bc
            L_0x00b8:
                int r3 = r3 + 1
                goto L_0x0026
            L_0x00bc:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p305z7.C8466h.C8469c.mo21036a(java.lang.String):boolean");
        }
    }

    /* renamed from: z7.h$d */
    public static class C8470d implements C8472f {
        /* renamed from: a */
        public final boolean mo21036a(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char charAt = str.charAt(0);
            if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
                return true;
            }
            for (int i = 0; i < length; i++) {
                char charAt2 = str.charAt(i);
                if ((charAt2 == 13 || charAt2 == 10 || charAt2 == 9 || charAt2 == ' ') || C8466h.m16902b(charAt2)) {
                    return true;
                }
                if ((charAt2 == 8 || charAt2 == 12 || charAt2 == 10) || C8466h.m16903c(charAt2)) {
                    return true;
                }
            }
            return C8466h.m16901a(str);
        }
    }

    /* renamed from: z7.h$e */
    public static class C8471e implements C8472f {
        /* renamed from: a */
        public final boolean mo21036a(String str) {
            return true;
        }
    }

    /* renamed from: z7.h$f */
    public interface C8472f {
        /* renamed from: a */
        boolean mo21036a(String str);
    }

    /* renamed from: z7.h$g */
    public interface C8473g {
        /* renamed from: a */
        void mo21035a(Appendable appendable, String str);
    }

    static {
        new C8470d();
        new C8469c();
        new C8468b();
    }

    /* renamed from: a */
    public static boolean m16901a(String str) {
        String str2;
        if (str.length() < 3) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt == 'n') {
            str2 = "null";
        } else if (charAt == 't') {
            str2 = "true";
        } else if (charAt == 'f') {
            str2 = "false";
        } else if (charAt != 'N') {
            return false;
        } else {
            str2 = "NaN";
        }
        return str.equals(str2);
    }

    /* renamed from: b */
    public static boolean m16902b(char c) {
        return c == '{' || c == '[' || c == ',' || c == '}' || c == ']' || c == ':' || c == '\'' || c == '\"';
    }

    /* renamed from: c */
    public static boolean m16903c(char c) {
        if (c >= 0 && c <= 31) {
            return true;
        }
        if (c < 127 || c > 159) {
            return c >= 8192 && c <= 8447;
        }
        return true;
    }
}
