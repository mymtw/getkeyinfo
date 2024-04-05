package android.support.p013v4.media;

import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.compose.p015ui.platform.C1834g1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.UUID;
import kotlin.jvm.internal.C19383o;
import p174m0.C7284d;
import p244t5.C7959a;
import p466vc.C13573c;

/* renamed from: android.support.v4.media.a */
public final /* synthetic */ class C0069a {
    /* renamed from: a */
    public static int m170a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    /* renamed from: b */
    public static int m171b(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    /* renamed from: c */
    public static View m172c(ViewGroup viewGroup, String str, C13573c cVar, String str2, ViewGroup viewGroup2, int i, boolean z) {
        C19383o.m32797g(viewGroup, str);
        C19383o.m32797g(cVar, str2);
        return C0114h.m305j0(viewGroup2, i, z);
    }

    /* renamed from: d */
    public static String m173d(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    /* renamed from: e */
    public static String m174e(String str) {
        String uuid = UUID.randomUUID().toString();
        C19383o.m32796f(uuid, str);
        return uuid;
    }

    /* renamed from: f */
    public static String m175f(String str, int i, String str2) {
        return str + i + str2;
    }

    /* renamed from: g */
    public static StringBuilder m176g(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb;
    }

    /* renamed from: h */
    public static StringBuilder m177h(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* renamed from: i */
    public static C7959a m178i(String str) {
        return new C7959a(str).mo20504A();
    }

    /* renamed from: j */
    public static void m179j(float f, C1834g1 g1Var, String str) {
        g1Var.mo7222b(new C7284d(f), str);
    }

    /* renamed from: k */
    public static void m180k(Parcel parcel, int i, Long l) {
        parcel.writeInt(i);
        parcel.writeLong(l.longValue());
    }
}
