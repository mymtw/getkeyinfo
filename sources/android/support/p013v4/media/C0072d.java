package android.support.p013v4.media;

import androidx.compose.foundation.interaction.C0641k;
import androidx.compose.runtime.ComposerImpl;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p248tp.C8071s;
import p456ua.C13461f;
import p644ph.C18349h;
import p644ph.C18353k;
import p725zh.C18898a;

/* renamed from: android.support.v4.media.d */
public final /* synthetic */ class C0072d implements C18353k {
    /* renamed from: b */
    public static int m196b(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* renamed from: c */
    public static int m197c(JsonParser jsonParser, String str, String str2, String str3) {
        C19383o.m32797g(jsonParser, str);
        C19383o.m32797g(str2, str3);
        return str2.hashCode();
    }

    /* renamed from: e */
    public static C0641k m198e(ComposerImpl composerImpl) {
        C0641k kVar = new C0641k();
        composerImpl.mo5407H0(kVar);
        return kVar;
    }

    /* renamed from: f */
    public static SingleSubscribeOn m199f(C13461f fVar, C8071s sVar) {
        fVar.getClass();
        return sVar.mo20660i(C13461f.m21235b());
    }

    /* renamed from: g */
    public static String m200g(int i, String str, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: h */
    public static StringBuilder m201h(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: i */
    public static Map m202i(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    /* renamed from: d */
    public C18349h[] mo38d() {
        return new C18349h[]{new C18898a()};
    }
}
