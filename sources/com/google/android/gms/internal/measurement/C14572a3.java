package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.a3 */
public final class C14572a3 extends C14819t5<C14572a3, C14888z2> implements C14808s6 {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final C14572a3 zze;
    private boolean zzA;
    private String zzB = "";
    private long zzC;
    private int zzD;
    private String zzE = "";
    private String zzF = "";
    private boolean zzG;
    private C14891z5<C14727m2> zzH;
    private String zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM;
    private long zzN;
    private long zzO;
    private String zzP;
    private String zzQ;
    private int zzR;
    private String zzS;
    private C14624e3 zzT;
    private C14867x5 zzU;
    private long zzV;
    private long zzW;
    private String zzX;
    private String zzY;
    private int zzZ;
    private boolean zzaa;
    private String zzab;
    private boolean zzac;
    private C14852w2 zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private C14891z5<C14779q2> zzi;
    private C14891z5<C14702k3> zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private int zzt;
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private long zzx;
    private long zzy;
    private String zzz = "";

    static {
        C14572a3 a3Var = new C14572a3();
        zze = a3Var;
        C14819t5.m23959l(C14572a3.class, a3Var);
    }

    public C14572a3() {
        C14576a7<Object> a7Var = C14576a7.f32742e;
        this.zzi = a7Var;
        this.zzj = a7Var;
        this.zzH = a7Var;
        this.zzI = "";
        this.zzM = "";
        this.zzP = "";
        this.zzQ = "";
        this.zzS = "";
        this.zzU = C14831u5.f33095e;
        this.zzX = "";
        this.zzY = "";
        this.zzab = "";
    }

    /* renamed from: A0 */
    public static /* synthetic */ void m23251A0(C14572a3 a3Var, long j) {
        a3Var.zzf |= 4;
        a3Var.zzl = j;
    }

    /* renamed from: B0 */
    public static /* synthetic */ void m23252B0(C14572a3 a3Var, long j) {
        a3Var.zzf |= 8;
        a3Var.zzm = j;
    }

    /* renamed from: C0 */
    public static /* synthetic */ void m23253C0(C14572a3 a3Var, long j) {
        a3Var.zzf |= 16;
        a3Var.zzn = j;
    }

    /* renamed from: D0 */
    public static /* synthetic */ void m23254D0(C14572a3 a3Var) {
        a3Var.zzf &= -17;
        a3Var.zzn = 0;
    }

    /* renamed from: E0 */
    public static /* synthetic */ void m23255E0(C14572a3 a3Var, long j) {
        a3Var.zzf |= 32;
        a3Var.zzo = j;
    }

    /* renamed from: F0 */
    public static /* synthetic */ void m23256F0(C14572a3 a3Var) {
        a3Var.zzf &= -33;
        a3Var.zzo = 0;
    }

    /* renamed from: G0 */
    public static /* synthetic */ void m23257G0(C14572a3 a3Var) {
        a3Var.zzf |= 64;
        a3Var.zzp = "android";
    }

    /* renamed from: H */
    public static /* synthetic */ void m23258H(C14572a3 a3Var, long j) {
        a3Var.zzf |= 1073741824;
        a3Var.zzO = j;
    }

    /* renamed from: H0 */
    public static /* synthetic */ void m23259H0(C14572a3 a3Var, String str) {
        str.getClass();
        a3Var.zzf |= 128;
        a3Var.zzq = str;
    }

    /* renamed from: I */
    public static /* synthetic */ void m23260I(C14572a3 a3Var) {
        a3Var.zzf &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
        a3Var.zzP = zze.zzP;
    }

    /* renamed from: I0 */
    public static /* synthetic */ void m23261I0(C14572a3 a3Var, String str) {
        str.getClass();
        a3Var.zzf |= 256;
        a3Var.zzr = str;
    }

    /* renamed from: J */
    public static /* synthetic */ void m23262J(C14572a3 a3Var, int i) {
        a3Var.zzg |= 2;
        a3Var.zzR = i;
    }

    /* renamed from: J0 */
    public static /* synthetic */ void m23263J0(C14572a3 a3Var, String str) {
        str.getClass();
        a3Var.zzf |= RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN;
        a3Var.zzs = str;
    }

    /* renamed from: K */
    public static /* synthetic */ void m23264K(C14572a3 a3Var, int i, C14779q2 q2Var) {
        a3Var.mo50303R0();
        a3Var.zzi.set(i, q2Var);
    }

    /* renamed from: K0 */
    public static /* synthetic */ void m23265K0(C14572a3 a3Var, int i) {
        a3Var.zzf |= RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        a3Var.zzt = i;
    }

    /* renamed from: L */
    public static /* synthetic */ void m23266L(C14572a3 a3Var, String str) {
        str.getClass();
        a3Var.zzg |= 4;
        a3Var.zzS = str;
    }

    /* renamed from: L0 */
    public static /* synthetic */ void m23267L0(C14572a3 a3Var, String str) {
        str.getClass();
        a3Var.zzf |= RecyclerView.C3084b0.FLAG_MOVED;
        a3Var.zzu = str;
    }

    /* renamed from: M */
    public static void m23268M(C14572a3 a3Var, ArrayList arrayList) {
        C14867x5 x5Var = a3Var.zzU;
        if (!((C14830u4) x5Var).f33094b) {
            C14831u5 u5Var = (C14831u5) x5Var;
            int i = u5Var.f33097d;
            int i2 = i == 0 ? 10 : i + i;
            if (i2 >= i) {
                a3Var.zzU = new C14831u5(u5Var.f33097d, Arrays.copyOf(u5Var.f33096c, i2));
            } else {
                throw new IllegalArgumentException();
            }
        }
        C14818t4.m23952g(arrayList, a3Var.zzU);
    }

    /* renamed from: M0 */
    public static /* synthetic */ void m23269M0(C14572a3 a3Var, String str) {
        str.getClass();
        a3Var.zzf |= RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT;
        a3Var.zzv = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m23270N(C14572a3 a3Var, C14779q2 q2Var) {
        a3Var.mo50303R0();
        a3Var.zzi.add(q2Var);
    }

    /* renamed from: N0 */
    public static /* synthetic */ void m23271N0(C14572a3 a3Var, String str) {
        str.getClass();
        a3Var.zzf |= 8192;
        a3Var.zzw = str;
    }

    /* renamed from: O */
    public static /* synthetic */ void m23272O(C14572a3 a3Var, long j) {
        a3Var.zzg |= 16;
        a3Var.zzV = j;
    }

    /* renamed from: O0 */
    public static /* synthetic */ void m23273O0(C14572a3 a3Var, long j) {
        a3Var.zzf |= PrimitiveArrayBuilder.SMALL_CHUNK_SIZE;
        a3Var.zzx = j;
    }

    /* renamed from: P */
    public static /* synthetic */ void m23274P(C14572a3 a3Var, long j) {
        a3Var.zzg |= 32;
        a3Var.zzW = j;
    }

    /* renamed from: P0 */
    public static /* synthetic */ void m23275P0(C14572a3 a3Var) {
        a3Var.zzf |= 32768;
        a3Var.zzy = 46000;
    }

    /* renamed from: R */
    public static /* synthetic */ void m23276R(C14572a3 a3Var, String str) {
        str.getClass();
        a3Var.zzf |= 65536;
        a3Var.zzz = str;
    }

    /* renamed from: S */
    public static /* synthetic */ void m23277S(C14572a3 a3Var) {
        a3Var.zzf &= -65537;
        a3Var.zzz = zze.zzz;
    }

    /* renamed from: T */
    public static /* synthetic */ void m23278T(C14572a3 a3Var, boolean z) {
        a3Var.zzf |= 131072;
        a3Var.zzA = z;
    }

    /* renamed from: U */
    public static /* synthetic */ void m23279U(C14572a3 a3Var) {
        a3Var.zzf &= -131073;
        a3Var.zzA = false;
    }

    /* renamed from: V */
    public static /* synthetic */ void m23280V(C14572a3 a3Var, String str) {
        str.getClass();
        a3Var.zzf |= PrimitiveArrayBuilder.MAX_CHUNK_SIZE;
        a3Var.zzB = str;
    }

    /* renamed from: W */
    public static /* synthetic */ void m23281W(C14572a3 a3Var) {
        a3Var.zzf &= -262145;
        a3Var.zzB = zze.zzB;
    }

    /* renamed from: X */
    public static /* synthetic */ void m23282X(C14572a3 a3Var, long j) {
        a3Var.zzf |= 524288;
        a3Var.zzC = j;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m23283Y(C14572a3 a3Var, int i) {
        a3Var.zzf |= 1048576;
        a3Var.zzD = i;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m23284Z(C14572a3 a3Var, String str) {
        a3Var.zzf |= 2097152;
        a3Var.zzE = str;
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m23285a0(C14572a3 a3Var) {
        a3Var.zzf &= -2097153;
        a3Var.zzE = zze.zzE;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m23286b0(C14572a3 a3Var, String str) {
        str.getClass();
        a3Var.zzf |= 4194304;
        a3Var.zzF = str;
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m23287c0(C14572a3 a3Var) {
        a3Var.zzf |= 8388608;
        a3Var.zzG = false;
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m23288d0(C14572a3 a3Var, ArrayList arrayList) {
        C14891z5<C14727m2> z5Var = a3Var.zzH;
        if (!z5Var.zzc()) {
            a3Var.zzH = C14819t5.m23957j(z5Var);
        }
        C14818t4.m23952g(arrayList, a3Var.zzH);
    }

    /* renamed from: e0 */
    public static void m23289e0(C14572a3 a3Var) {
        a3Var.zzH = C14576a7.f32742e;
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m23290f0(C14572a3 a3Var, String str) {
        str.getClass();
        a3Var.zzf |= 16777216;
        a3Var.zzI = str;
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m23291g0(C14572a3 a3Var, int i) {
        a3Var.zzf |= 33554432;
        a3Var.zzJ = i;
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m23292h0(C14572a3 a3Var) {
        a3Var.zzf |= 1;
        a3Var.zzh = 1;
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m23293i0(C14572a3 a3Var) {
        a3Var.zzf &= -268435457;
        a3Var.zzM = zze.zzM;
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m23294j0(C14572a3 a3Var, long j) {
        a3Var.zzf |= 536870912;
        a3Var.zzN = j;
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m23295r0(C14572a3 a3Var, String str) {
        str.getClass();
        a3Var.zzg |= 64;
        a3Var.zzX = str;
    }

    /* renamed from: s0 */
    public static /* synthetic */ void m23296s0(C14572a3 a3Var, String str) {
        a3Var.zzg |= 128;
        a3Var.zzY = str;
    }

    /* renamed from: t0 */
    public static /* synthetic */ void m23297t0(C14572a3 a3Var, ArrayList arrayList) {
        a3Var.mo50303R0();
        C14818t4.m23952g(arrayList, a3Var.zzi);
    }

    /* renamed from: u0 */
    public static void m23298u0(C14572a3 a3Var) {
        a3Var.zzi = C14576a7.f32742e;
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m23299v0(C14572a3 a3Var, int i) {
        a3Var.mo50303R0();
        a3Var.zzi.remove(i);
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m23300w0(C14572a3 a3Var, int i, C14702k3 k3Var) {
        a3Var.mo50304S0();
        a3Var.zzj.set(i, k3Var);
    }

    /* renamed from: x0 */
    public static /* synthetic */ void m23301x0(C14572a3 a3Var, C14702k3 k3Var) {
        a3Var.mo50304S0();
        a3Var.zzj.add(k3Var);
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m23302y0(C14572a3 a3Var, int i) {
        a3Var.mo50304S0();
        a3Var.zzj.remove(i);
    }

    /* renamed from: y1 */
    public static C14888z2 m23303y1() {
        return (C14888z2) zze.mo50871m();
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m23304z0(C14572a3 a3Var, long j) {
        a3Var.zzf |= 2;
        a3Var.zzk = j;
    }

    /* renamed from: A */
    public final String mo50290A() {
        return this.zzq;
    }

    /* renamed from: A1 */
    public final C14702k3 mo50291A1(int i) {
        return this.zzj.get(i);
    }

    /* renamed from: B */
    public final String mo50292B() {
        return this.zzp;
    }

    /* renamed from: B1 */
    public final String mo50293B1() {
        return this.zzS;
    }

    /* renamed from: C */
    public final String mo50294C() {
        return this.zzz;
    }

    /* renamed from: C1 */
    public final String mo50295C1() {
        return this.zzv;
    }

    /* renamed from: D */
    public final String mo50296D() {
        return this.zzs;
    }

    /* renamed from: D1 */
    public final String mo50297D1() {
        return this.zzB;
    }

    /* renamed from: E */
    public final C14891z5 mo50298E() {
        return this.zzH;
    }

    /* renamed from: F */
    public final C14891z5 mo50299F() {
        return this.zzi;
    }

    /* renamed from: G */
    public final C14891z5 mo50300G() {
        return this.zzj;
    }

    /* renamed from: Q */
    public final int mo50301Q() {
        return this.zzJ;
    }

    /* renamed from: Q0 */
    public final int mo50302Q0() {
        return this.zzD;
    }

    /* renamed from: R0 */
    public final void mo50303R0() {
        C14891z5<C14779q2> z5Var = this.zzi;
        if (!z5Var.zzc()) {
            this.zzi = C14819t5.m23957j(z5Var);
        }
    }

    /* renamed from: S0 */
    public final void mo50304S0() {
        C14891z5<C14702k3> z5Var = this.zzj;
        if (!z5Var.zzc()) {
            this.zzj = C14819t5.m23957j(z5Var);
        }
    }

    /* renamed from: T0 */
    public final boolean mo50305T0() {
        return (this.zzf & 524288) != 0;
    }

    /* renamed from: U0 */
    public final boolean mo50306U0() {
        return (this.zzg & 16) != 0;
    }

    /* renamed from: V0 */
    public final boolean mo50307V0() {
        return (this.zzf & 8) != 0;
    }

    /* renamed from: W0 */
    public final boolean mo50308W0() {
        return (this.zzf & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0;
    }

    /* renamed from: X0 */
    public final boolean mo50309X0() {
        return (this.zzf & 131072) != 0;
    }

    /* renamed from: Y0 */
    public final boolean mo50310Y0() {
        return (this.zzf & 32) != 0;
    }

    /* renamed from: Z0 */
    public final boolean mo50311Z0() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: a1 */
    public final boolean mo50312a1() {
        return (this.zzf & 1) != 0;
    }

    /* renamed from: b1 */
    public final boolean mo50313b1() {
        return (this.zzg & 2) != 0;
    }

    /* renamed from: c1 */
    public final boolean mo50314c1() {
        return (this.zzf & 8388608) != 0;
    }

    /* renamed from: d1 */
    public final boolean mo50315d1() {
        return (this.zzf & 4) != 0;
    }

    /* renamed from: e1 */
    public final boolean mo50316e1() {
        return (this.zzf & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0;
    }

    /* renamed from: f1 */
    public final boolean mo50317f1() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: g1 */
    public final boolean mo50318g1() {
        return (this.zzf & 32768) != 0;
    }

    /* renamed from: h1 */
    public final int mo50319h1() {
        return this.zzi.size();
    }

    /* renamed from: i1 */
    public final int mo50320i1() {
        return this.zzh;
    }

    /* renamed from: j1 */
    public final int mo50321j1() {
        return this.zzR;
    }

    /* renamed from: k0 */
    public final boolean mo50322k0() {
        return this.zzA;
    }

    /* renamed from: k1 */
    public final int mo50323k1() {
        return this.zzt;
    }

    /* renamed from: l0 */
    public final boolean mo50324l0() {
        return this.zzG;
    }

    /* renamed from: l1 */
    public final int mo50325l1() {
        return this.zzj.size();
    }

    /* renamed from: m0 */
    public final boolean mo50326m0() {
        return (this.zzf & 1073741824) != 0;
    }

    /* renamed from: m1 */
    public final long mo50327m1() {
        return this.zzO;
    }

    /* renamed from: n0 */
    public final boolean mo50328n0() {
        return (this.zzf & 33554432) != 0;
    }

    /* renamed from: n1 */
    public final long mo50329n1() {
        return this.zzN;
    }

    /* renamed from: o0 */
    public final boolean mo50330o0() {
        return (this.zzf & 1048576) != 0;
    }

    /* renamed from: o1 */
    public final long mo50331o1() {
        return this.zzC;
    }

    /* renamed from: p0 */
    public final boolean mo50332p0() {
        return (this.zzf & 536870912) != 0;
    }

    /* renamed from: p1 */
    public final long mo50333p1() {
        return this.zzV;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zze, "\u00011\u0000\u0002\u0001;1\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,", new Object[]{"zzf", "zzg", "zzh", "zzi", C14779q2.class, "zzj", C14702k3.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", C14727m2.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", C14675i2.f32878a, "zzaa", "zzab", "zzac", "zzad"});
        } else if (i2 == 3) {
            return new C14572a3();
        } else {
            if (i2 == 4) {
                return new C14888z2(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: q0 */
    public final boolean mo50334q0() {
        return (this.zzg & 128) != 0;
    }

    /* renamed from: q1 */
    public final long mo50335q1() {
        return this.zzm;
    }

    /* renamed from: r */
    public final String mo50336r() {
        return this.zzu;
    }

    /* renamed from: r1 */
    public final long mo50337r1() {
        return this.zzx;
    }

    /* renamed from: s */
    public final String mo50338s() {
        return this.zzw;
    }

    /* renamed from: s1 */
    public final long mo50339s1() {
        return this.zzo;
    }

    /* renamed from: t */
    public final String mo50340t() {
        return this.zzY;
    }

    /* renamed from: t1 */
    public final long mo50341t1() {
        return this.zzn;
    }

    /* renamed from: u */
    public final String mo50342u() {
        return this.zzr;
    }

    /* renamed from: u1 */
    public final long mo50343u1() {
        return this.zzl;
    }

    /* renamed from: v */
    public final String mo50344v() {
        return this.zzP;
    }

    /* renamed from: v1 */
    public final long mo50345v1() {
        return this.zzk;
    }

    /* renamed from: w */
    public final String mo50346w() {
        return this.zzI;
    }

    /* renamed from: w1 */
    public final long mo50347w1() {
        return this.zzy;
    }

    /* renamed from: x */
    public final String mo50348x() {
        return this.zzX;
    }

    /* renamed from: x1 */
    public final C14779q2 mo50349x1(int i) {
        return this.zzi.get(i);
    }

    /* renamed from: y */
    public final String mo50350y() {
        return this.zzF;
    }

    /* renamed from: z */
    public final String mo50351z() {
        return this.zzE;
    }
}
