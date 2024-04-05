package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.push.CartRefreshDelegate;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.C14811s9;
import com.google.android.gms.internal.measurement.zzcf;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19543e0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p514bk.C14088a;
import p568fn.C17782b;

/* renamed from: com.google.android.gms.measurement.internal.k7 */
public final class C15018k7 extends C15042n4 {

    /* renamed from: h */
    public static final String[] f33635h = {"firebase_", "google_", "ga_"};

    /* renamed from: i */
    public static final String[] f33636i = {"_err"};

    /* renamed from: d */
    public SecureRandom f33637d;

    /* renamed from: e */
    public final AtomicLong f33638e = new AtomicLong(0);

    /* renamed from: f */
    public int f33639f;

    /* renamed from: g */
    public Integer f33640g = null;

    public C15018k7(C15103u3 u3Var) {
        super(u3Var);
    }

    /* renamed from: P */
    public static boolean m24468P(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: R */
    public static boolean m24469R(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: S */
    public static boolean m24470S(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m24471T(android.content.Context r4) {
        /*
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15018k7.m24471T(android.content.Context):boolean");
    }

    /* renamed from: U */
    public static boolean m24472U(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: V */
    public static boolean m24473V(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* renamed from: W */
    public static byte[] m24474W(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: X */
    public static final boolean m24475X(int i, Bundle bundle) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: a0 */
    public static boolean m24476a0(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String U : strArr) {
            if (m24472U(str, U)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    /* renamed from: h0 */
    public static long m24477h0(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i = 0;
        Preconditions.checkState(length > 0);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    /* renamed from: m */
    public static String m24478m(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: n */
    public static MessageDigest m24479n() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: p */
    public static ArrayList<Bundle> m24480p(List<zzab> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzab next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.zza);
            bundle.putString(CartRefreshDelegate.ARG_ORIGIN, next.zzb);
            bundle.putLong("creation_timestamp", next.zzd);
            bundle.putString("name", next.zzc.zzb);
            C19421p.m32950o0(bundle, Preconditions.checkNotNull(next.zzc.zza()));
            bundle.putBoolean("active", next.zze);
            String str = next.zzf;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzat zzat = next.zzg;
            if (zzat != null) {
                bundle.putString("timed_out_event_name", zzat.zza);
                zzar zzar = zzat.zzb;
                if (zzar != null) {
                    bundle.putBundle("timed_out_event_params", zzar.zzc());
                }
            }
            bundle.putLong("trigger_timeout", next.zzh);
            zzat zzat2 = next.zzi;
            if (zzat2 != null) {
                bundle.putString("triggered_event_name", zzat2.zza);
                zzar zzar2 = zzat2.zzb;
                if (zzar2 != null) {
                    bundle.putBundle("triggered_event_params", zzar2.zzc());
                }
            }
            bundle.putLong("triggered_timestamp", next.zzc.zzc);
            bundle.putLong("time_to_live", next.zzj);
            zzat zzat3 = next.zzk;
            if (zzat3 != null) {
                bundle.putString("expired_event_name", zzat3.zza);
                zzar zzar3 = zzat3.zzb;
                if (zzar3 != null) {
                    bundle.putBundle("expired_event_params", zzar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: s */
    public static void m24481s(C15061p5 p5Var, Bundle bundle, boolean z) {
        if (!(bundle == null || p5Var == null)) {
            if (!bundle.containsKey("_sc") || z) {
                String str = p5Var.f33749a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = p5Var.f33750b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", p5Var.f33751c);
                return;
            }
            z = false;
        }
        if (bundle != null && p5Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: v */
    public static void m24482v(C15009j7 j7Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m24475X(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        j7Var.zza(str, bundle);
    }

    /* renamed from: A */
    public final void mo52187A(zzcf zzcf, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33727j.mo52238b(e, "Error returning byte array to wrapper");
        }
    }

    /* renamed from: B */
    public final void mo52188B(zzcf zzcf, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33727j.mo52238b(e, "Error returning int value to wrapper");
        }
    }

    /* renamed from: C */
    public final void mo52189C(zzcf zzcf, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33727j.mo52238b(e, "Error returning long value to wrapper");
        }
    }

    /* renamed from: D */
    public final void mo52190D(zzcf zzcf, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33727j.mo52238b(e, "Error returning string value to wrapper");
        }
    }

    /* renamed from: E */
    public final void mo52191E(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i;
        String str4;
        int i2;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            ((C15103u3) this.f33681b).getClass();
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i3 = 0;
            while (it.hasNext()) {
                String str6 = (String) it.next();
                if (list2 == null || !list2.contains(str6)) {
                    i = !z ? mo52208e0(str6) : 0;
                    if (i == 0) {
                        i = mo52207d0(str6);
                    }
                } else {
                    i = 0;
                }
                if (i != 0) {
                    mo52220r(bundle2, i, str6, i == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (m24468P(bundle2.get(str6))) {
                        ((C15103u3) this.f33681b).mo52016b().f33729l.mo52240d(str5, str3, str6, "Nested Bundle parameters are not allowed; discarded. event name, param name, child param name");
                        i2 = 22;
                        str4 = str6;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i2 = mo52196J(str, str2, str6, bundle2.get(str6), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        mo52220r(bundle2, i2, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (m24470S(str4) && !m24476a0(str4, C14088a.f31031l) && (i3 = i3 + 1) > 0) {
                        ((C15103u3) this.f33681b).mo52016b().f33726i.mo52239c(((C15103u3) this.f33681b).f33884n.mo52142d(str5), "Item cannot contain custom parameters", ((C15103u3) this.f33681b).f33884n.mo52140b(bundle2));
                        m24475X(23, bundle2);
                        bundle2.remove(str4);
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public final boolean mo52192F(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            Preconditions.checkNotNull(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(((C15103u3) this.f33681b).f33873c)) {
                ((C15103u3) this.f33681b).mo52016b().f33726i.mo52238b(C15049o2.m24575p(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
            }
            return false;
        }
        C14811s9.m23933a();
        if (((C15103u3) this.f33681b).f33878h.mo51973p((String) null, C14959e2.f33398c0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            Preconditions.checkNotNull(str2);
            if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            ((C15103u3) this.f33681b).mo52016b().f33726i.mo52238b(C15049o2.m24575p(str2), "Invalid admob_app_id. Analytics disabled.");
            return false;
        }
        if (TextUtils.isEmpty(((C15103u3) this.f33681b).f33873c)) {
            ((C15103u3) this.f33681b).mo52016b().f33726i.mo52237a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    /* renamed from: G */
    public final boolean mo52193G(int i, String str, String str2) {
        if (str2 == null) {
            ((C15103u3) this.f33681b).mo52016b().f33726i.mo52238b(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            ((C15103u3) this.f33681b).mo52016b().f33726i.mo52240d(str, Integer.valueOf(i), str2, "Name is too long. Type, maximum supported length, name");
            return false;
        }
    }

    /* renamed from: H */
    public final boolean mo52194H(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            ((C15103u3) this.f33681b).mo52016b().f33726i.mo52238b(str, "Name is required and can't be null. Type");
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = f33635h;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                ((C15103u3) this.f33681b).mo52016b().f33726i.mo52239c(str, "Name starts with reserved prefix. Type, name", str2);
                return false;
            }
        }
        if (strArr == null || !m24476a0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m24476a0(str2, strArr2)) {
            return true;
        }
        ((C15103u3) this.f33681b).mo52016b().f33726i.mo52239c(str, "Name is reserved. Type, name", str2);
        return false;
    }

    /* renamed from: I */
    public final boolean mo52195I(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                ((C15103u3) this.f33681b).mo52016b().f33729l.mo52240d(str, str2, Integer.valueOf(obj2.length()), "Value is too long; discarded. Value kind, name, value length");
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ea  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo52196J(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            r14 = this;
            r7 = r14
            r8 = r17
            r0 = r18
            r1 = r19
            r14.mo51995g()
            boolean r2 = m24468P(r18)
            java.lang.String r3 = "param"
            r4 = 0
            if (r2 == 0) goto L_0x00b4
            if (r22 == 0) goto L_0x00b1
            java.lang.String[] r2 = p514bk.C14088a.f31030k
            boolean r2 = m24476a0(r8, r2)
            if (r2 != 0) goto L_0x0020
            r0 = 20
            return r0
        L_0x0020:
            com.google.android.gms.measurement.internal.o4 r2 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.i6 r2 = r2.mo52333u()
            r2.mo51995g()
            r2.mo51946h()
            boolean r5 = r2.mo52129o()
            if (r5 != 0) goto L_0x0035
            goto L_0x0049
        L_0x0035:
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.k7 r2 = r2.mo52335w()
            int r2 = r2.mo52210g0()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r5) goto L_0x0049
            r0 = 25
            return r0
        L_0x0049:
            com.google.android.gms.measurement.internal.o4 r2 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            r2.getClass()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0059
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x0064
        L_0x0059:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x00b4
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x0064:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L_0x00b4
            com.google.android.gms.measurement.internal.o4 r9 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r9 = (com.google.android.gms.measurement.internal.C15103u3) r9
            com.google.android.gms.measurement.internal.o2 r9 = r9.mo52016b()
            com.google.android.gms.measurement.internal.m2 r9 = r9.f33729l
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            r9.mo52240d(r3, r8, r5, r10)
            com.google.android.gms.measurement.internal.o4 r5 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5
            r5.getClass()
            if (r2 == 0) goto L_0x0094
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r5 = r2.length
            if (r5 <= r6) goto L_0x00ad
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00ad
        L_0x0094:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00ad
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            if (r5 <= r6) goto L_0x00ad
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r6)
            r5.<init>(r2)
            r1.putParcelableArrayList(r8, r5)
        L_0x00ad:
            r1 = 17
            r9 = r1
            goto L_0x00b5
        L_0x00b1:
            r0 = 21
            return r0
        L_0x00b4:
            r9 = r4
        L_0x00b5:
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.d r1 = r1.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C14959e2.f33385S
            r10 = r15
            boolean r1 = r1.mo51973p(r15, r2)
            if (r1 == 0) goto L_0x00ca
            boolean r1 = m24469R(r16)
            if (r1 != 0) goto L_0x00d0
        L_0x00ca:
            boolean r1 = m24469R(r17)
            if (r1 == 0) goto L_0x00da
        L_0x00d0:
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            r1.getClass()
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00e3
        L_0x00da:
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            r1.getClass()
            r1 = 100
        L_0x00e3:
            boolean r1 = r14.mo52195I(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00ea
            return r9
        L_0x00ea:
            if (r22 == 0) goto L_0x017d
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x0102
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo52191E(r1, r2, r3, r4, r5, r6)
            goto L_0x017c
        L_0x0102:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x013a
            r11 = r0
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            int r12 = r11.length
            r13 = r4
        L_0x010b:
            if (r13 >= r12) goto L_0x017c
            r0 = r11[r13]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0127
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33729l
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.mo52239c(r0, r2, r8)
            goto L_0x017d
        L_0x0127:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo52191E(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x010b
        L_0x013a:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x017d
            r11 = r0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r12 = r11.size()
            r13 = r4
        L_0x0146:
            if (r13 >= r12) goto L_0x017c
            java.lang.Object r0 = r11.get(r13)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0169
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33729l
            if (r0 == 0) goto L_0x0161
            java.lang.Class r0 = r0.getClass()
            goto L_0x0163
        L_0x0161:
            java.lang.String r0 = "null"
        L_0x0163:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.mo52239c(r0, r2, r8)
            goto L_0x017d
        L_0x0169:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo52191E(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x0146
        L_0x017c:
            return r9
        L_0x017d:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15018k7.mo52196J(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: K */
    public final void mo52197K() {
        mo51995g();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                ((C15103u3) this.f33681b).mo52016b().f33727j.mo52237a("Utils falling back to Random for random id");
            }
        }
        this.f33638e.set(nextLong);
    }

    /* renamed from: L */
    public final boolean mo52198L(String str, String str2) {
        if (str2 == null) {
            ((C15103u3) this.f33681b).mo52016b().f33726i.mo52238b(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            ((C15103u3) this.f33681b).mo52016b().f33726i.mo52238b(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    ((C15103u3) this.f33681b).mo52016b().f33726i.mo52239c(str, "Name must start with a letter or _ (underscore). Type, name", str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    ((C15103u3) this.f33681b).mo52016b().f33726i.mo52239c(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: M */
    public final boolean mo52199M(String str, String str2) {
        if (str2 == null) {
            ((C15103u3) this.f33681b).mo52016b().f33726i.mo52238b(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            ((C15103u3) this.f33681b).mo52016b().f33726i.mo52238b(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                ((C15103u3) this.f33681b).mo52016b().f33726i.mo52239c(str, "Name must start with a letter. Type, name", str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    ((C15103u3) this.f33681b).mo52016b().f33726i.mo52239c(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: N */
    public final boolean mo52200N(String str) {
        mo51995g();
        if (Wrappers.packageManager(((C15103u3) this.f33681b).f33872b).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        ((C15103u3) this.f33681b).mo52016b().f33731n.mo52238b(str, "Permission not granted");
        return false;
    }

    /* renamed from: O */
    public final boolean mo52201O(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String h = ((C15103u3) this.f33681b).f33878h.mo51965h("debug.firebase.analytics.app");
        ((C15103u3) this.f33681b).getClass();
        return h.equals(str);
    }

    @VisibleForTesting
    /* renamed from: Q */
    public final boolean mo52202Q(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e, "Error obtaining certificate");
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e2, "Package name not found");
            return true;
        }
    }

    /* renamed from: Y */
    public final int mo52203Y(String str) {
        if ("_ldl".equals(str)) {
            ((C15103u3) this.f33681b).getClass();
            return RecyclerView.C3084b0.FLAG_MOVED;
        } else if (AnalyticsLogDatabaseHelper.f19040ID.equals(str)) {
            ((C15103u3) this.f33681b).getClass();
            return 256;
        } else if (!((C15103u3) this.f33681b).f33878h.mo51973p((String) null, C14959e2.f33396b0) || !"_lgclid".equals(str)) {
            ((C15103u3) this.f33681b).getClass();
            return 36;
        } else {
            ((C15103u3) this.f33681b).getClass();
            return 100;
        }
    }

    /* renamed from: Z */
    public final Object mo52204Z(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m24478m(i, obj.toString(), z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle k0 = mo52214k0((Bundle) parcelable);
                    if (!k0.isEmpty()) {
                        arrayList.add(k0);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: b0 */
    public final int mo52205b0(Object obj, String str) {
        return "_ldl".equals(str) ? mo52195I("user property referrer", str, mo52203Y(str), obj) : mo52195I("user property", str, mo52203Y(str), obj) ? 0 : 7;
    }

    /* renamed from: c0 */
    public final int mo52206c0(String str) {
        if (!mo52198L("event", str)) {
            return 2;
        }
        if (!mo52194H("event", C17782b.f38638i, C17782b.f38639j, str)) {
            return 13;
        }
        ((C15103u3) this.f33681b).getClass();
        return !mo52193G(40, "event", str) ? 2 : 0;
    }

    /* renamed from: d0 */
    public final int mo52207d0(String str) {
        if (!mo52198L("event param", str)) {
            return 3;
        }
        if (!mo52194H("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        ((C15103u3) this.f33681b).getClass();
        return !mo52193G(40, "event param", str) ? 3 : 0;
    }

    /* renamed from: e0 */
    public final int mo52208e0(String str) {
        if (!mo52199M("event param", str)) {
            return 3;
        }
        if (!mo52194H("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        ((C15103u3) this.f33681b).getClass();
        return !mo52193G(40, "event param", str) ? 3 : 0;
    }

    /* renamed from: f0 */
    public final int mo52209f0(String str) {
        if (!mo52198L("user property", str)) {
            return 6;
        }
        if (!mo52194H("user property", C19543e0.f43494g, (String[]) null, str)) {
            return 15;
        }
        ((C15103u3) this.f33681b).getClass();
        return !mo52193G(24, "user property", str) ? 6 : 0;
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* renamed from: g0 */
    public final int mo52210g0() {
        if (this.f33640g == null) {
            this.f33640g = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(((C15103u3) this.f33681b).f33872b) / 1000);
        }
        return this.f33640g.intValue();
    }

    /* renamed from: h */
    public final boolean mo51952h() {
        return true;
    }

    /* renamed from: i0 */
    public final long mo52211i0() {
        long andIncrement;
        long j;
        if (this.f33638e.get() == 0) {
            synchronized (this.f33638e) {
                long nextLong = new Random(System.nanoTime() ^ ((C15103u3) this.f33681b).f33885o.currentTimeMillis()).nextLong();
                int i = this.f33639f + 1;
                this.f33639f = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f33638e) {
            this.f33638e.compareAndSet(-1, 1);
            andIncrement = this.f33638e.getAndIncrement();
        }
        return andIncrement;
    }

    /* renamed from: j0 */
    public final Bundle mo52212j0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str4 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str2 = uri.getQueryParameter("utm_medium");
                    str = uri.getQueryParameter("gclid");
                } else {
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("source", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("medium", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("gclid", str);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString(ResponseConstants.CONTENT, queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                ((C15103u3) this.f33681b).mo52016b().f33727j.mo52238b(e, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    /* renamed from: k */
    public final Object mo52213k(Object obj, String str) {
        int i = 256;
        if ("_ev".equals(str)) {
            ((C15103u3) this.f33681b).getClass();
            return mo52204Z(256, obj, true, true);
        }
        if (m24469R(str)) {
            ((C15103u3) this.f33681b).getClass();
        } else {
            ((C15103u3) this.f33681b).getClass();
            i = 100;
        }
        return mo52204Z(i, obj, false, true);
    }

    /* renamed from: k0 */
    public final Bundle mo52214k0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object k = mo52213k(bundle.get(next), next);
                if (k == null) {
                    ((C15103u3) this.f33681b).mo52016b().f33729l.mo52238b(((C15103u3) this.f33681b).f33884n.mo52143e(next), "Param value can't be null");
                } else {
                    mo52223w(bundle2, k, next);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: l */
    public final Object mo52215l(Object obj, String str) {
        return "_ldl".equals(str) ? mo52204Z(mo52203Y(str), obj, true, false) : mo52204Z(mo52203Y(str), obj, false, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo52216l0(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = p568fn.C17782b.f38641l
            boolean r13 = m24476a0(r10, r0)
            if (r11 == 0) goto L_0x00f9
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.o4 r0 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f33878h
            int r8 = r0.mo51967j()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x0030:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0049
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            r0 = r17
            goto L_0x0058
        L_0x0049:
            if (r24 != 0) goto L_0x0050
            int r0 = r9.mo52208e0(r7)
            goto L_0x0052
        L_0x0050:
            r0 = r17
        L_0x0052:
            if (r0 != 0) goto L_0x0058
            int r0 = r9.mo52207d0(r7)
        L_0x0058:
            if (r0 == 0) goto L_0x0069
            r1 = 3
            if (r0 != r1) goto L_0x005f
            r1 = r7
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            r9.mo52220r(r15, r0, r7, r1)
            r15.remove(r7)
            r12 = r8
            goto L_0x00f2
        L_0x0069:
            java.lang.Object r4 = r11.get(r7)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r7
            r5 = r15
            r6 = r23
            r14 = r7
            r7 = r24
            r12 = r8
            r8 = r13
            int r0 = r0.mo52196J(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L_0x008a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.mo52220r(r15, r1, r14, r0)
            goto L_0x00a6
        L_0x008a:
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x00a6
            r1 = 21
            if (r0 != r1) goto L_0x009a
            r7 = r10
            goto L_0x009b
        L_0x009a:
            r7 = r14
        L_0x009b:
            java.lang.Object r1 = r11.get(r14)
            r9.mo52220r(r15, r0, r7, r1)
            r15.remove(r14)
            goto L_0x00f2
        L_0x00a6:
            boolean r0 = m24470S(r14)
            if (r0 == 0) goto L_0x00f2
            int r0 = r18 + 1
            if (r0 <= r12) goto L_0x00f0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 48
            r1.<init>(r2)
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = " params"
            r1.append(r2)
            com.google.android.gms.measurement.internal.o4 r2 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33726i
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.o4 r3 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.j2 r3 = r3.f33884n
            java.lang.String r3 = r3.mo52142d(r10)
            com.google.android.gms.measurement.internal.o4 r4 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.j2 r4 = r4.f33884n
            java.lang.String r4 = r4.mo52140b(r11)
            r2.mo52239c(r3, r1, r4)
            r1 = 5
            m24475X(r1, r15)
            r15.remove(r14)
        L_0x00f0:
            r18 = r0
        L_0x00f2:
            r8 = r12
            r12 = r23
            goto L_0x0030
        L_0x00f7:
            r14 = r15
            goto L_0x00fa
        L_0x00f9:
            r14 = 0
        L_0x00fa:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15018k7.mo52216l0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* renamed from: m0 */
    public final zzat mo52217m0(String str, String str2, Bundle bundle, String str3, long j, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo52206c0(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            Bundle l0 = mo52216l0(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
            if (z) {
                l0 = mo52214k0(l0);
            }
            Preconditions.checkNotNull(l0);
            return new zzat(str2, new zzar(l0), str3, j);
        }
        ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(((C15103u3) this.f33681b).f33884n.mo52144f(str2), "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }

    @EnsuresNonNull({"this.secureRandom"})
    /* renamed from: o */
    public final SecureRandom mo52218o() {
        mo51995g();
        if (this.f33637d == null) {
            this.f33637d = new SecureRandom();
        }
        return this.f33637d;
    }

    /* renamed from: q */
    public final void mo52219q(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            ((C15103u3) this.f33681b).mo52016b().f33727j.mo52238b(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: r */
    public final void mo52220r(Bundle bundle, int i, String str, Object obj) {
        if (m24475X(i, bundle)) {
            ((C15103u3) this.f33681b).getClass();
            bundle.putString("_ev", m24478m(40, str, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) obj.toString().length());
                }
            }
        }
    }

    /* renamed from: t */
    public final void mo52221t(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    ((C15103u3) this.f33681b).mo52335w().mo52223w(bundle, bundle2.get(next), next);
                }
            }
        }
    }

    /* renamed from: u */
    public final void mo52222u(C15058p2 p2Var, int i) {
        Iterator it = new TreeSet(p2Var.f33746d.keySet()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (m24470S(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                ((C15103u3) this.f33681b).mo52016b().f33726i.mo52239c(((C15103u3) this.f33681b).f33884n.mo52142d(p2Var.f33743a), sb.toString(), ((C15103u3) this.f33681b).f33884n.mo52140b(p2Var.f33746d));
                m24475X(5, p2Var.f33746d);
                p2Var.f33746d.remove(str);
            }
        }
    }

    /* renamed from: w */
    public final void mo52223w(Bundle bundle, Object obj, String str) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                ((C15103u3) this.f33681b).mo52016b().f33729l.mo52239c(((C15103u3) this.f33681b).f33884n.mo52143e(str), "Not putting event parameter. Invalid value type. name, type", obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* renamed from: x */
    public final void mo52224x(zzcf zzcf, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33727j.mo52238b(e, "Error returning boolean value to wrapper");
        }
    }

    /* renamed from: y */
    public final void mo52225y(zzcf zzcf, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33727j.mo52238b(e, "Error returning bundle list to wrapper");
        }
    }

    /* renamed from: z */
    public final void mo52226z(zzcf zzcf, Bundle bundle) {
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33727j.mo52238b(e, "Error returning bundle value to wrapper");
        }
    }
}
