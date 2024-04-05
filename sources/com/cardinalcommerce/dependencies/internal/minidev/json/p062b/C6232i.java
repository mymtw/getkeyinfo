package com.cardinalcommerce.dependencies.internal.minidev.json.p062b;

/* renamed from: com.cardinalcommerce.dependencies.internal.minidev.json.b.i */
public class C6232i extends Exception {

    /* renamed from: a */
    private int f13563a;

    /* renamed from: b */
    private Object f13564b;

    /* renamed from: c */
    private int f13565c;

    public C6232i(int i, int i2, Object obj) {
        super(m12448a(i, i2, obj));
        this.f13565c = i;
        this.f13563a = i2;
        this.f13564b = obj;
    }

    public C6232i(int i, Throwable th) {
        super(m12448a(i, 2, th), th);
        this.f13565c = i;
        this.f13563a = 2;
        this.f13564b = th;
    }

    /* renamed from: a */
    public static String m12448a(int i, int i2, Object obj) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            sb.append("Unexpected character (");
            sb.append(obj);
            str = ") at position ";
        } else {
            if (i2 == 1) {
                str2 = "Unexpected token ";
            } else if (i2 == 2) {
                sb.append("Unexpected exception ");
                sb.append(obj);
                str = " occur at position ";
            } else if (i2 == 3) {
                sb.append("Unexpected End Of File position ");
                sb.append(i);
                sb.append(": ");
                sb.append(obj);
                return sb.toString();
            } else if (i2 == 4) {
                str2 = "Unexpected unicode escape sequence ";
            } else if (i2 == 5) {
                str2 = "Unexpected duplicate key:";
            } else if (i2 == 6) {
                str2 = "Unexpected leading 0 in digit for token:";
            } else {
                str = "Unkown error at position ";
            }
            sb.append(str2);
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i);
            sb.append(".");
            return sb.toString();
        }
        sb.append(str);
        sb.append(i);
        sb.append(".");
        return sb.toString();
    }
}
