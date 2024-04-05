package androidx.compose.animation;

import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1306d1;
import androidx.compose.runtime.C1424y0;
import com.google.android.exoplayer2.mediacodec.C14246c;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import p145io.reactivex.internal.operators.single.SingleObserveOn;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p272w3.C8230b;
import p456ua.C13461f;
import p594jh.C17909f;

/* renamed from: androidx.compose.animation.c */
public final /* synthetic */ class C0391c implements C8230b, C17909f, MediaCodecUtil.C14239f {
    /* renamed from: a */
    public static int m1055a(String str, int i) {
        return String.valueOf(str).length() + i;
    }

    /* renamed from: b */
    public static SingleObserveOn m1056b(C13461f fVar, SingleSubscribeOn singleSubscribeOn) {
        fVar.getClass();
        return singleSubscribeOn.mo20657f(C13461f.m21236c());
    }

    /* renamed from: c */
    public static String m1057c(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: d */
    public static String m1058d(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: f */
    public static void m1059f(C1299c cVar, String str, C1306d1 d1Var, String str2, C1424y0 y0Var, String str3) {
        C19383o.m32797g(cVar, str);
        C19383o.m32797g(d1Var, str2);
        C19383o.m32797g(y0Var, str3);
    }

    /* renamed from: g */
    public static void m1060g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C19383o.m32797g(str, str2);
        C19383o.m32797g(str3, str4);
        C19383o.m32797g(str5, str6);
        C19383o.m32797g(str7, str8);
    }

    /* renamed from: h */
    public static void m1061h(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* renamed from: e */
    public int mo3372e(Object obj) {
        Pattern pattern = MediaCodecUtil.f31669a;
        return ((C14246c) obj).f31692a.startsWith("OMX.google") ? 1 : 0;
    }

    public Object get() {
        return new C20009t();
    }
}
