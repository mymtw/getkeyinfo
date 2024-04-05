package p678ti;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.Log;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.google.common.primitives.Ints;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p504ai.C13983i;
import p513bj.C14049b0;
import p513bj.C14075p;

/* renamed from: ti.c */
public final class C18553c {

    /* renamed from: a */
    public final String f40844a;

    /* renamed from: b */
    public final int f40845b;

    /* renamed from: c */
    public final Integer f40846c;

    /* renamed from: d */
    public final float f40847d;

    /* renamed from: e */
    public final boolean f40848e;

    /* renamed from: f */
    public final boolean f40849f;

    /* renamed from: g */
    public final boolean f40850g;

    /* renamed from: h */
    public final boolean f40851h;

    /* renamed from: ti.c$a */
    public static final class C18554a {

        /* renamed from: a */
        public final int f40852a;

        /* renamed from: b */
        public final int f40853b;

        /* renamed from: c */
        public final int f40854c;

        /* renamed from: d */
        public final int f40855d;

        /* renamed from: e */
        public final int f40856e;

        /* renamed from: f */
        public final int f40857f;

        /* renamed from: g */
        public final int f40858g;

        /* renamed from: h */
        public final int f40859h;

        /* renamed from: i */
        public final int f40860i;

        public C18554a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f40852a = i;
            this.f40853b = i2;
            this.f40854c = i3;
            this.f40855d = i4;
            this.f40856e = i5;
            this.f40857f = i6;
            this.f40858g = i7;
            this.f40859h = i8;
            this.f40860i = i9;
        }
    }

    /* renamed from: ti.c$b */
    public static final class C18555b {

        /* renamed from: a */
        public static final Pattern f40861a = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: b */
        public static final Pattern f40862b = Pattern.compile(C14049b0.m21640m("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: c */
        public static final Pattern f40863c = Pattern.compile(C14049b0.m21640m("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: d */
        public static final Pattern f40864d = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public static PointF m31312a(String str) {
            String str2;
            String str3;
            Matcher matcher = f40862b.matcher(str);
            Matcher matcher2 = f40863c.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb = new StringBuilder(str.length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(str);
                    sb.append("'");
                    Log.i("SsaStyle.Overrides", sb.toString());
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            str2.getClass();
            float parseFloat = Float.parseFloat(str2.trim());
            str3.getClass();
            return new PointF(parseFloat, Float.parseFloat(str3.trim()));
        }
    }

    public C18553c(String str, int i, Integer num, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f40844a = str;
        this.f40845b = i;
        this.f40846c = num;
        this.f40847d = f;
        this.f40848e = z;
        this.f40849f = z2;
        this.f40850g = z3;
        this.f40851h = z4;
    }

    /* renamed from: a */
    public static int m31309a(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        Log.w("SsaStyle", valueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(valueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    /* renamed from: b */
    public static boolean m31310b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            C14075p.m21700l("SsaStyle", C13983i.m21492k(C0391c.m1055a(str, 33), "Failed to parse boolean value: '", str, "'"), e);
            return false;
        }
    }

    /* renamed from: c */
    public static Integer m31311c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C14075p.m21691c(parseLong <= UnsignedInteger.INT_MASK);
            return Integer.valueOf(Color.argb(Ints.m26383a(((parseLong >> 24) & 255) ^ 255), Ints.m26383a(parseLong & 255), Ints.m26383a((parseLong >> 8) & 255), Ints.m26383a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            C14075p.m21700l("SsaStyle", C13983i.m21492k(C0391c.m1055a(str, 36), "Failed to parse color expression: '", str, "'"), e);
            return null;
        }
    }
}
