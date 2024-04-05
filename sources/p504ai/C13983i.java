package p504ai;

import android.content.Context;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import com.google.android.exoplayer2.mediacodec.C14246c;
import com.google.android.exoplayer2.mediacodec.C14247d;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.C16685e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.C19356i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p112g2.C6838e;
import p146j.C7096a;
import p209p6.C7681d;
import p287xp.C8335c;
import p513bj.C14049b0;
import p594jh.C17909f;
import p644ph.C18349h;
import p644ph.C18353k;
import p669sh.C18505a;
import p753kq.C19861p;

/* renamed from: ai.i */
public final /* synthetic */ class C13983i implements C14247d, C7096a, C17909f, MediaCodecUtil.C14239f, C16685e.C16686a, C8335c, C18353k {
    /* renamed from: f */
    public static int m21487f(long j, int i, int i2) {
        return (C19356i.m32678a(j) + i) * i2;
    }

    /* renamed from: g */
    public static int m21488g(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    /* renamed from: h */
    public static View m21489h(ViewGroup viewGroup, String str, int i, ViewGroup viewGroup2, boolean z) {
        C19383o.m32797g(viewGroup, str);
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    /* renamed from: i */
    public static C1295a1 m21490i(ComposerImpl composerImpl, C1843j1 j1Var, C19861p pVar, ComposerImpl composerImpl2) {
        Updater.m2571b(composerImpl, j1Var, pVar);
        composerImpl.mo5430c();
        return new C1295a1(composerImpl2);
    }

    /* renamed from: j */
    public static Object m21491j(zzbl zzbl, ArrayList arrayList, int i, int i2) {
        C19388s.m32840P0(zzbl.name(), arrayList, i);
        return arrayList.get(i2);
    }

    /* renamed from: k */
    public static String m21492k(int i, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: l */
    public static String m21493l(Object obj, StringBuilder sb, String str) {
        sb.append(obj.getClass().getName());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: m */
    public static String m21494m(String str, Object obj, String str2) {
        return str + obj + str2;
    }

    /* renamed from: n */
    public static StringBuilder m21495n(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    /* renamed from: o */
    public static LinkedHashMap m21496o(Context context, String str) {
        C19383o.m32797g(context, str);
        return new LinkedHashMap();
    }

    /* renamed from: p */
    public static C7681d m21497p(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        return dVar.mo20104m().mo20094c(dVar2).mo20094c(dVar3);
    }

    /* renamed from: q */
    public static void m21498q(int i, HashMap hashMap, String str, int i2, String str2, int i3, String str3, int i4, String str4) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
        hashMap.put(str3, Integer.valueOf(i3));
        hashMap.put(str4, Integer.valueOf(i4));
    }

    /* renamed from: r */
    public static void m21499r(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    public Object apply(Object obj) {
        return Long.valueOf(((C6838e) obj).mo18971W());
    }

    public Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        C19383o.m32797g(bool, "t1");
        C19383o.m32797g(bool2, "t2");
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    /* renamed from: b */
    public List mo46797b(String str, boolean z, boolean z2) {
        return MediaCodecUtil.m22259d(str, z, z2);
    }

    /* renamed from: c */
    public String mo3367c(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.m27354a(installerPackageName) : "";
    }

    /* renamed from: d */
    public C18349h[] mo38d() {
        return new C18349h[]{new C18505a()};
    }

    /* renamed from: e */
    public int mo3372e(Object obj) {
        Pattern pattern = MediaCodecUtil.f31669a;
        String str = ((C14246c) obj).f31692a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (C14049b0.f30913a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
