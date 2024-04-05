package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C14571a2;
import com.google.android.gms.internal.measurement.C14839v1;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.q7 */
public abstract class C15072q7 {

    /* renamed from: a */
    public final String f33786a;

    /* renamed from: b */
    public final int f33787b;

    /* renamed from: c */
    public Boolean f33788c;

    /* renamed from: d */
    public Boolean f33789d;

    /* renamed from: e */
    public Long f33790e;

    /* renamed from: f */
    public Long f33791f;

    public C15072q7(String str, int i) {
        this.f33786a = str;
        this.f33787b = i;
    }

    @VisibleForTesting
    /* renamed from: d */
    public static Boolean m24604d(BigDecimal bigDecimal, C14839v1 v1Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(v1Var);
        if (v1Var.mo50940x()) {
            boolean z = true;
            if (v1Var.mo50935C() != 1) {
                if (v1Var.mo50935C() == 5) {
                    if (!v1Var.mo50934B() || !v1Var.mo50933A()) {
                        return null;
                    }
                } else if (!v1Var.mo50941y()) {
                    return null;
                }
                int C = v1Var.mo50935C();
                if (v1Var.mo50935C() == 5) {
                    if (C14991h7.m24379J(v1Var.mo50938v()) && C14991h7.m24379J(v1Var.mo50937u())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(v1Var.mo50938v());
                            bigDecimal3 = new BigDecimal(v1Var.mo50937u());
                            bigDecimal2 = bigDecimal5;
                            bigDecimal4 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!C14991h7.m24379J(v1Var.mo50936t())) {
                    return null;
                } else {
                    try {
                        bigDecimal4 = new BigDecimal(v1Var.mo50936t());
                        bigDecimal2 = null;
                        bigDecimal3 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (C == 5) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                }
                int i = C - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 || bigDecimal2 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        } else if (bigDecimal4 == null) {
                            return null;
                        } else {
                            if (d != ShadowDrawableWrapper.COS_45) {
                                if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                            if (bigDecimal.compareTo(bigDecimal4) != 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    } else if (bigDecimal4 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: e */
    public static Boolean m24605e(String str, C14571a2 a2Var, C15049o2 o2Var) {
        List<String> list;
        Preconditions.checkNotNull(a2Var);
        if (str == null || !a2Var.mo50289z() || a2Var.mo50281A() == 1) {
            return null;
        }
        if (a2Var.mo50281A() == 7) {
            if (a2Var.mo50283r() == 0) {
                return null;
            }
        } else if (!a2Var.mo50288y()) {
            return null;
        }
        int A = a2Var.mo50281A();
        boolean w = a2Var.mo50286w();
        String u = (w || A == 2 || A == 7) ? a2Var.mo50284u() : a2Var.mo50284u().toUpperCase(Locale.ENGLISH);
        if (a2Var.mo50283r() == 0) {
            list = null;
        } else {
            list = a2Var.mo50285v();
            if (!w) {
                ArrayList arrayList = new ArrayList(list.size());
                for (String upperCase : list) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = A == 2 ? u : null;
        if (A == 7) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (u == null) {
            return null;
        }
        if (!w && A != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (A - 1) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, true != w ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (o2Var == null) {
                        return null;
                    }
                    o2Var.f33727j.mo52238b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(u));
            case 3:
                return Boolean.valueOf(str.endsWith(u));
            case 4:
                return Boolean.valueOf(str.contains(u));
            case 5:
                return Boolean.valueOf(str.equals(u));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    @VisibleForTesting
    /* renamed from: f */
    public static Boolean m24606f(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: a */
    public abstract int mo52287a();

    /* renamed from: b */
    public abstract boolean mo52288b();

    /* renamed from: c */
    public abstract boolean mo52289c();
}
