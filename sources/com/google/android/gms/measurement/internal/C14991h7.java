package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C14571a2;
import com.google.android.gms.internal.measurement.C14572a3;
import com.google.android.gms.internal.measurement.C14650g3;
import com.google.android.gms.internal.measurement.C14665h5;
import com.google.android.gms.internal.measurement.C14666h6;
import com.google.android.gms.internal.measurement.C14676i3;
import com.google.android.gms.internal.measurement.C14702k3;
import com.google.android.gms.internal.measurement.C14722la;
import com.google.android.gms.internal.measurement.C14727m2;
import com.google.android.gms.internal.measurement.C14753o2;
import com.google.android.gms.internal.measurement.C14756o5;
import com.google.android.gms.internal.measurement.C14766p2;
import com.google.android.gms.internal.measurement.C14779q2;
import com.google.android.gms.internal.measurement.C14782q5;
import com.google.android.gms.internal.measurement.C14803s1;
import com.google.android.gms.internal.measurement.C14816t2;
import com.google.android.gms.internal.measurement.C14828u2;
import com.google.android.gms.internal.measurement.C14839v1;
import com.google.android.gms.internal.measurement.C14863x1;
import com.google.android.gms.internal.measurement.C14876y2;
import com.google.android.gms.internal.measurement.C14879y5;
import com.google.android.gms.internal.measurement.C14888z2;
import com.google.android.gms.internal.measurement.C14891z5;
import com.google.android.gms.internal.measurement.zzkh;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.h7 */
public final class C14991h7 extends C14928a7 {
    public C14991h7(C14973f7 f7Var) {
        super(f7Var);
    }

    /* renamed from: C */
    public static ArrayList m24376C(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                C14816t2 v = C14828u2.m23989v();
                for (String next : bundle.keySet()) {
                    C14816t2 v2 = C14828u2.m23989v();
                    v2.mo50855q(next);
                    Object obj = bundle.get(next);
                    if (obj instanceof Long) {
                        v2.mo50854p(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        v2.mo50856r((String) obj);
                    } else if (obj instanceof Double) {
                        v2.mo50853o(((Double) obj).doubleValue());
                    }
                    if (v.f33059d) {
                        v.mo50809j();
                        v.f33059d = false;
                    }
                    C14828u2.m23986H((C14828u2) v.f33058c, (C14828u2) v2.mo50807h());
                }
                if (((C14828u2) v.f33058c).mo50885t() > 0) {
                    arrayList.add((C14828u2) v.mo50807h());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: E */
    public static ArrayList m24377E(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: H */
    public static boolean m24378H(int i, C14879y5 y5Var) {
        if (i >= ((C14666h6) y5Var).f32868d * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) ((C14666h6) y5Var).get(i / 64)).longValue()) != 0;
    }

    /* renamed from: J */
    public static boolean m24379J(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: k */
    public static final void m24380k(C14766p2 p2Var, String str, Object obj) {
        List<C14828u2> w = p2Var.mo50774w();
        int i = 0;
        while (true) {
            if (i >= w.size()) {
                i = -1;
                break;
            } else if (str.equals(w.get(i).mo50887x())) {
                break;
            } else {
                i++;
            }
        }
        C14816t2 v = C14828u2.m23989v();
        v.mo50855q(str);
        if (obj instanceof Long) {
            v.mo50854p(((Long) obj).longValue());
        } else if (obj instanceof String) {
            v.mo50856r((String) obj);
        } else if (obj instanceof Double) {
            v.mo50853o(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList C = m24376C((Bundle[]) obj);
            if (v.f33059d) {
                v.mo50809j();
                v.f33059d = false;
            }
            C14828u2.m23987I((C14828u2) v.f33058c, C);
        }
        if (i >= 0) {
            if (p2Var.f33059d) {
                p2Var.mo50809j();
                p2Var.f33059d = false;
            }
            C14779q2.m23872A((C14779q2) p2Var.f33058c, i, (C14828u2) v.mo50807h());
            return;
        }
        p2Var.mo50768q(v);
    }

    /* renamed from: l */
    public static final C14828u2 m24381l(C14779q2 q2Var, String str) {
        for (C14828u2 u2Var : q2Var.mo50801z()) {
            if (u2Var.mo50887x().equals(str)) {
                return u2Var;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    /* renamed from: m */
    public static final Serializable m24382m(C14779q2 q2Var, String str) {
        C14828u2 l = m24381l(q2Var, str);
        if (l == null) {
            return null;
        }
        if (l.mo50882O()) {
            return l.mo50888y();
        }
        if (l.mo50880M()) {
            return Long.valueOf(l.mo50886u());
        }
        if (l.mo50878K()) {
            return Double.valueOf(l.mo50883r());
        }
        if (l.mo50885t() <= 0) {
            return null;
        }
        C14891z5<C14828u2> z = l.mo50889z();
        ArrayList arrayList = new ArrayList();
        for (C14828u2 u2Var : z) {
            if (u2Var != null) {
                Bundle bundle = new Bundle();
                for (C14828u2 u2Var2 : u2Var.mo50889z()) {
                    if (u2Var2.mo50882O()) {
                        bundle.putString(u2Var2.mo50887x(), u2Var2.mo50888y());
                    } else if (u2Var2.mo50880M()) {
                        bundle.putLong(u2Var2.mo50887x(), u2Var2.mo50886u());
                    } else if (u2Var2.mo50878K()) {
                        bundle.putDouble(u2Var2.mo50887x(), u2Var2.mo50883r());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: p */
    public static final void m24383p(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: q */
    public static final String m24384q(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: r */
    public static final void m24385r(StringBuilder sb, String str, C14650g3 g3Var) {
        if (g3Var != null) {
            m24383p(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (g3Var.mo50544s() != 0) {
                m24383p(sb, 4);
                sb.append("results: ");
                int i = 0;
                for (Long next : g3Var.mo50540B()) {
                    int i2 = i + 1;
                    if (i != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i = i2;
                }
                sb.append(10);
            }
            if (g3Var.mo50546u() != 0) {
                m24383p(sb, 4);
                sb.append("status: ");
                int i3 = 0;
                for (Long l : g3Var.mo50542D()) {
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l);
                    i3 = i4;
                }
                sb.append(10);
            }
            if (g3Var.mo50543r() != 0) {
                m24383p(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i5 = 0;
                for (C14753o2 o2Var : g3Var.mo50539A()) {
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append(o2Var.mo50757y() ? Integer.valueOf(o2Var.mo50754r()) : null);
                    sb.append(MessageDraft.IMAGE_DELIMITER);
                    sb.append(o2Var.mo50756x() ? Long.valueOf(o2Var.mo50755s()) : null);
                    i5 = i6;
                }
                sb.append("}\n");
            }
            if (g3Var.mo50545t() != 0) {
                m24383p(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i7 = 0;
                for (C14676i3 i3Var : g3Var.mo50541C()) {
                    int i8 = i7 + 1;
                    if (i7 != 0) {
                        sb.append(", ");
                    }
                    sb.append(i3Var.mo50588z() ? Integer.valueOf(i3Var.mo50585s()) : null);
                    sb.append(": [");
                    int i9 = 0;
                    for (Long longValue : i3Var.mo50587w()) {
                        long longValue2 = longValue.longValue();
                        int i10 = i9 + 1;
                        if (i9 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i9 = i10;
                    }
                    sb.append("]");
                    i7 = i8;
                }
                sb.append("}\n");
            }
            m24383p(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: s */
    public static final void m24386s(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m24383p(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: t */
    public static final void m24387t(StringBuilder sb, int i, String str, C14839v1 v1Var) {
        if (v1Var != null) {
            m24383p(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (v1Var.mo50940x()) {
                int C = v1Var.mo50935C();
                m24386s(sb, i, "comparison_type", C != 1 ? C != 2 ? C != 3 ? C != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (v1Var.mo50942z()) {
                m24386s(sb, i, "match_as_float", Boolean.valueOf(v1Var.mo50939w()));
            }
            if (v1Var.mo50941y()) {
                m24386s(sb, i, "comparison_value", v1Var.mo50936t());
            }
            if (v1Var.mo50934B()) {
                m24386s(sb, i, "min_comparison_value", v1Var.mo50938v());
            }
            if (v1Var.mo50933A()) {
                m24386s(sb, i, "max_comparison_value", v1Var.mo50937u());
            }
            m24383p(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: u */
    public static int m24388u(C14888z2 z2Var, String str) {
        for (int i = 0; i < ((C14572a3) z2Var.f33058c).mo50325l1(); i++) {
            if (str.equals(((C14572a3) z2Var.f33058c).mo50291A1(i).mo50629w())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: z */
    public static C14782q5 m24389z(C14782q5 q5Var, byte[] bArr) throws zzkh {
        Class<C14665h5> cls = C14665h5.class;
        C14665h5 h5Var = C14665h5.f32863c;
        if (h5Var == null) {
            synchronized (cls) {
                h5Var = C14665h5.f32863c;
                if (h5Var == null) {
                    h5Var = C14756o5.m23820b();
                    C14665h5.f32863c = h5Var;
                }
            }
        }
        if (h5Var != null) {
            q5Var.getClass();
            q5Var.mo50812m(bArr, bArr.length, h5Var);
            return q5Var;
        }
        q5Var.getClass();
        q5Var.mo50812m(bArr, bArr.length, C14665h5.m23616a());
        return q5Var;
    }

    /* renamed from: A */
    public final String mo52105A(C14876y2 y2Var) {
        StringBuilder h = C0072d.m201h("\nbatch {\n");
        for (C14572a3 a3Var : y2Var.mo50972u()) {
            if (a3Var != null) {
                m24383p(h, 1);
                h.append("bundle {\n");
                if (a3Var.mo50312a1()) {
                    m24386s(h, 1, "protocol_version", Integer.valueOf(a3Var.mo50320i1()));
                }
                m24386s(h, 1, "platform", a3Var.mo50292B());
                if (a3Var.mo50308W0()) {
                    m24386s(h, 1, "gmp_version", Long.valueOf(a3Var.mo50337r1()));
                }
                if (a3Var.mo50318g1()) {
                    m24386s(h, 1, "uploading_gmp_version", Long.valueOf(a3Var.mo50347w1()));
                }
                if (a3Var.mo50306U0()) {
                    m24386s(h, 1, "dynamite_version", Long.valueOf(a3Var.mo50333p1()));
                }
                if (a3Var.mo50332p0()) {
                    m24386s(h, 1, "config_version", Long.valueOf(a3Var.mo50329n1()));
                }
                m24386s(h, 1, "gmp_app_id", a3Var.mo50350y());
                m24386s(h, 1, "admob_app_id", a3Var.mo50293B1());
                m24386s(h, 1, "app_id", a3Var.mo50295C1());
                m24386s(h, 1, "app_version", a3Var.mo50338s());
                if (a3Var.mo50328n0()) {
                    m24386s(h, 1, "app_version_major", Integer.valueOf(a3Var.mo50301Q()));
                }
                m24386s(h, 1, "firebase_instance_id", a3Var.mo50346w());
                if (a3Var.mo50305T0()) {
                    m24386s(h, 1, "dev_cert_hash", Long.valueOf(a3Var.mo50331o1()));
                }
                m24386s(h, 1, "app_store", a3Var.mo50336r());
                if (a3Var.mo50317f1()) {
                    m24386s(h, 1, "upload_timestamp_millis", Long.valueOf(a3Var.mo50345v1()));
                }
                if (a3Var.mo50315d1()) {
                    m24386s(h, 1, "start_timestamp_millis", Long.valueOf(a3Var.mo50343u1()));
                }
                if (a3Var.mo50307V0()) {
                    m24386s(h, 1, "end_timestamp_millis", Long.valueOf(a3Var.mo50335q1()));
                }
                if (a3Var.mo50311Z0()) {
                    m24386s(h, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(a3Var.mo50341t1()));
                }
                if (a3Var.mo50310Y0()) {
                    m24386s(h, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(a3Var.mo50339s1()));
                }
                m24386s(h, 1, "app_instance_id", a3Var.mo50297D1());
                m24386s(h, 1, "resettable_device_id", a3Var.mo50294C());
                m24386s(h, 1, "ds_id", a3Var.mo50344v());
                if (a3Var.mo50309X0()) {
                    m24386s(h, 1, "limited_ad_tracking", Boolean.valueOf(a3Var.mo50322k0()));
                }
                m24386s(h, 1, "os_version", a3Var.mo50290A());
                m24386s(h, 1, "device_model", a3Var.mo50342u());
                m24386s(h, 1, "user_default_language", a3Var.mo50296D());
                if (a3Var.mo50316e1()) {
                    m24386s(h, 1, "time_zone_offset_minutes", Integer.valueOf(a3Var.mo50323k1()));
                }
                if (a3Var.mo50330o0()) {
                    m24386s(h, 1, "bundle_sequential_index", Integer.valueOf(a3Var.mo50302Q0()));
                }
                if (a3Var.mo50314c1()) {
                    m24386s(h, 1, "service_upload", Boolean.valueOf(a3Var.mo50324l0()));
                }
                m24386s(h, 1, "health_monitor", a3Var.mo50351z());
                if (!((C15103u3) this.f33681b).f33878h.mo51973p((String) null, C14959e2.f33416l0) && a3Var.mo50326m0() && a3Var.mo50327m1() != 0) {
                    m24386s(h, 1, "android_id", Long.valueOf(a3Var.mo50327m1()));
                }
                if (a3Var.mo50313b1()) {
                    m24386s(h, 1, "retry_counter", Integer.valueOf(a3Var.mo50321j1()));
                }
                if (a3Var.mo50334q0()) {
                    m24386s(h, 1, "consent_signals", a3Var.mo50340t());
                }
                C14891z5<C14702k3> G = a3Var.mo50300G();
                if (G != null) {
                    for (C14702k3 k3Var : G) {
                        if (k3Var != null) {
                            m24383p(h, 2);
                            h.append("user_property {\n");
                            m24386s(h, 2, "set_timestamp_millis", k3Var.mo50624I() ? Long.valueOf(k3Var.mo50628t()) : null);
                            m24386s(h, 2, "name", ((C15103u3) this.f33681b).f33884n.mo52144f(k3Var.mo50629w()));
                            m24386s(h, 2, "string_value", k3Var.mo50630x());
                            m24386s(h, 2, "int_value", k3Var.mo50623H() ? Long.valueOf(k3Var.mo50627s()) : null);
                            m24386s(h, 2, "double_value", k3Var.mo50622G() ? Double.valueOf(k3Var.mo50626r()) : null);
                            m24383p(h, 2);
                            h.append("}\n");
                        }
                    }
                }
                C14891z5<C14727m2> E = a3Var.mo50298E();
                if (E != null) {
                    for (C14727m2 m2Var : E) {
                        if (m2Var != null) {
                            m24383p(h, 2);
                            h.append("audience_membership {\n");
                            if (m2Var.mo50671B()) {
                                m24386s(h, 2, "audience_id", Integer.valueOf(m2Var.mo50674r()));
                            }
                            if (m2Var.mo50672C()) {
                                m24386s(h, 2, "new_audience", Boolean.valueOf(m2Var.mo50670A()));
                            }
                            m24385r(h, "current_data", m2Var.mo50675u());
                            if (m2Var.mo50673D()) {
                                m24385r(h, "previous_data", m2Var.mo50676v());
                            }
                            m24383p(h, 2);
                            h.append("}\n");
                        }
                    }
                }
                C14891z5<C14779q2> F = a3Var.mo50299F();
                if (F != null) {
                    for (C14779q2 q2Var : F) {
                        if (q2Var != null) {
                            m24383p(h, 2);
                            h.append("event {\n");
                            m24386s(h, 2, "name", ((C15103u3) this.f33681b).f33884n.mo52142d(q2Var.mo50800y()));
                            if (q2Var.mo50793K()) {
                                m24386s(h, 2, "timestamp_millis", Long.valueOf(q2Var.mo50798u()));
                            }
                            if (q2Var.mo50792J()) {
                                m24386s(h, 2, "previous_timestamp_millis", Long.valueOf(q2Var.mo50797t()));
                            }
                            if (q2Var.mo50791I()) {
                                m24386s(h, 2, ResponseConstants.COUNT, Integer.valueOf(q2Var.mo50795r()));
                            }
                            if (q2Var.mo50796s() != 0) {
                                mo52112n(h, 2, q2Var.mo50801z());
                            }
                            m24383p(h, 2);
                            h.append("}\n");
                        }
                    }
                }
                m24383p(h, 1);
                h.append("}\n");
            }
        }
        h.append("}\n");
        return h.toString();
    }

    /* renamed from: B */
    public final String mo52106B(C14863x1 x1Var) {
        StringBuilder h = C0072d.m201h("\nproperty_filter {\n");
        if (x1Var.mo50961A()) {
            m24386s(h, 0, "filter_id", Integer.valueOf(x1Var.mo50963r()));
        }
        m24386s(h, 0, ResponseConstants.PROPERTY_NAME, ((C15103u3) this.f33681b).f33884n.mo52144f(x1Var.mo50965v()));
        String q = m24384q(x1Var.mo50966x(), x1Var.mo50967y(), x1Var.mo50968z());
        if (!q.isEmpty()) {
            m24386s(h, 0, "filter_type", q);
        }
        mo52113o(h, 1, x1Var.mo50964s());
        h.append("}\n");
        return h.toString();
    }

    /* renamed from: D */
    public final List mo52107D(C14879y5 y5Var, List list) {
        int i;
        ArrayList arrayList = new ArrayList(y5Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                ((C15103u3) this.f33681b).mo52016b().f33727j.mo52238b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    ((C15103u3) this.f33681b).mo52016b().f33727j.mo52239c(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* renamed from: F */
    public final HashMap mo52108F(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            C14722la.m23700b();
            if (!((C15103u3) this.f33681b).f33878h.mo51973p((String) null, C14959e2.f33428r0) ? (obj instanceof Bundle[]) || (obj instanceof ArrayList) || (obj instanceof Bundle) : (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (obj instanceof Parcelable[]) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(mo52108F((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(mo52108F((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(mo52108F((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: G */
    public final void mo52109G(C14816t2 t2Var, Object obj) {
        Preconditions.checkNotNull(obj);
        if (t2Var.f33059d) {
            t2Var.mo50809j();
            t2Var.f33059d = false;
        }
        C14828u2.m23981C((C14828u2) t2Var.f33058c);
        if (t2Var.f33059d) {
            t2Var.mo50809j();
            t2Var.f33059d = false;
        }
        C14828u2.m23983E((C14828u2) t2Var.f33058c);
        if (t2Var.f33059d) {
            t2Var.mo50809j();
            t2Var.f33059d = false;
        }
        C14828u2.m23985G((C14828u2) t2Var.f33058c);
        if (t2Var.f33059d) {
            t2Var.mo50809j();
            t2Var.f33059d = false;
        }
        C14828u2.m23988J((C14828u2) t2Var.f33058c);
        if (obj instanceof String) {
            t2Var.mo50856r((String) obj);
        } else if (obj instanceof Long) {
            t2Var.mo50854p(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            t2Var.mo50853o(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList C = m24376C((Bundle[]) obj);
            if (t2Var.f33059d) {
                t2Var.mo50809j();
                t2Var.f33059d = false;
            }
            C14828u2.m23987I((C14828u2) t2Var.f33058c, C);
        } else {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(obj, "Ignoring invalid (type) event param value");
        }
    }

    /* renamed from: I */
    public final boolean mo52110I(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(((C15103u3) this.f33681b).f33885o.currentTimeMillis() - j) > j2;
    }

    /* renamed from: K */
    public final byte[] mo52111K(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e, "Failed to gzip content");
            throw e;
        }
    }

    /* renamed from: j */
    public final void mo51944j() {
    }

    /* renamed from: n */
    public final void mo52112n(StringBuilder sb, int i, C14891z5 z5Var) {
        if (z5Var != null) {
            int i2 = i + 1;
            Iterator it = z5Var.iterator();
            while (it.hasNext()) {
                C14828u2 u2Var = (C14828u2) it.next();
                if (u2Var != null) {
                    m24383p(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    m24386s(sb, i2, "name", u2Var.mo50881N() ? ((C15103u3) this.f33681b).f33884n.mo52143e(u2Var.mo50887x()) : null);
                    m24386s(sb, i2, "string_value", u2Var.mo50882O() ? u2Var.mo50888y() : null);
                    m24386s(sb, i2, "int_value", u2Var.mo50880M() ? Long.valueOf(u2Var.mo50886u()) : null);
                    if (u2Var.mo50878K()) {
                        d = Double.valueOf(u2Var.mo50883r());
                    }
                    m24386s(sb, i2, "double_value", d);
                    if (u2Var.mo50885t() > 0) {
                        mo52112n(sb, i2, u2Var.mo50889z());
                    }
                    m24383p(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo52113o(StringBuilder sb, int i, C14803s1 s1Var) {
        String str;
        if (s1Var != null) {
            m24383p(sb, i);
            sb.append("filter {\n");
            if (s1Var.mo50840y()) {
                m24386s(sb, i, "complement", Boolean.valueOf(s1Var.mo50839x()));
            }
            if (s1Var.mo50834A()) {
                m24386s(sb, i, "param_name", ((C15103u3) this.f33681b).f33884n.mo52143e(s1Var.mo50838v()));
            }
            if (s1Var.mo50835B()) {
                int i2 = i + 1;
                C14571a2 u = s1Var.mo50837u();
                if (u != null) {
                    m24383p(sb, i2);
                    sb.append("string_filter {\n");
                    if (u.mo50289z()) {
                        switch (u.mo50281A()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        m24386s(sb, i2, "match_type", str);
                    }
                    if (u.mo50288y()) {
                        m24386s(sb, i2, "expression", u.mo50284u());
                    }
                    if (u.mo50287x()) {
                        m24386s(sb, i2, "case_sensitive", Boolean.valueOf(u.mo50286w()));
                    }
                    if (u.mo50283r() > 0) {
                        m24383p(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : u.mo50285v()) {
                            m24383p(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m24383p(sb, i2);
                    sb.append("}\n");
                }
            }
            if (s1Var.mo50841z()) {
                m24387t(sb, i + 1, "number_filter", s1Var.mo50836t());
            }
            m24383p(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: v */
    public final long mo52114v(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        ((C15103u3) this.f33681b).mo52335w().mo51995g();
        MessageDigest n = C15018k7.m24479n();
        if (n != null) {
            return C15018k7.m24477h0(n.digest(bArr));
        }
        ((C15103u3) this.f33681b).mo52016b().f33724g.mo52237a("Failed to get MD5");
        return 0;
    }

    /* renamed from: w */
    public final Bundle mo52115w(Map<String, Object> map, boolean z) {
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            Object obj = map.get(next);
            if (obj == null) {
                bundle.putString(next, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(next, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(next, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(next, obj.toString());
            } else if (z) {
                C14722la.m23700b();
                if (((C15103u3) this.f33681b).f33878h.mo51973p((String) null, C14959e2.f33428r0)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(mo52115w((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(next, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList arrayList4 = new ArrayList();
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList4.add(mo52115w((Map) arrayList3.get(i2), false));
                    }
                    bundle.putParcelableArrayList(next, arrayList4);
                }
            }
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        ((com.google.android.gms.measurement.internal.C15103u3) r4.f33681b).mo52016b().f33724g.mo52237a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo52116x(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.o4 r5 = r4.f33681b     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.m2 r5 = r5.f33724g     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo52237a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14991h7.mo52116x(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = r0.get("_o");
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzat mo52117y(com.google.android.gms.internal.measurement.C14581b r9) {
        /*
            r8 = this;
            java.util.HashMap r0 = r9.f32753c
            r1 = 1
            android.os.Bundle r0 = r8.mo52115w(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001a
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.toString()
            goto L_0x001c
        L_0x001a:
            java.lang.String r1 = "app"
        L_0x001c:
            r5 = r1
            java.lang.String r1 = r9.f32751a
            java.lang.String[] r2 = p568fn.C17782b.f38638i
            java.lang.String[] r3 = p568fn.C17782b.f38640k
            java.lang.String r1 = p514bk.C14088a.m21797z(r1, r2, r3)
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = r9.f32751a
        L_0x002b:
            r3 = r1
            com.google.android.gms.measurement.internal.zzat r1 = new com.google.android.gms.measurement.internal.zzat
            com.google.android.gms.measurement.internal.zzar r4 = new com.google.android.gms.measurement.internal.zzar
            r4.<init>(r0)
            long r6 = r9.f32752b
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14991h7.mo52117y(com.google.android.gms.internal.measurement.b):com.google.android.gms.measurement.internal.zzat");
    }
}
