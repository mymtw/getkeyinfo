package android.support.p013v4.media;

import androidx.activity.result.C0118a;
import androidx.compose.runtime.ComposerImpl;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6179e;
import com.etsy.android.p327ui.conversation.compose.ConversationComposeFragment;
import java.util.HashMap;
import p337de.C12647a;

/* renamed from: android.support.v4.media.c */
public final /* synthetic */ class C0071c implements C0118a {
    /* renamed from: b */
    public static int m190b(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    /* renamed from: c */
    public static String m191c(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    public static String m192d(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: e */
    public static void m193e(int i, String str, HashMap hashMap, String str2) {
        hashMap.put(str2, new C6179e(i, str));
    }

    /* renamed from: f */
    public static void m194f(ComposerImpl composerImpl, boolean z, boolean z2, boolean z3) {
        composerImpl.mo5418R(z);
        composerImpl.mo5418R(z2);
        composerImpl.mo5418R(z3);
    }

    /* renamed from: a */
    public void mo413a(Object obj) {
        ConversationComposeFragment.lambda$new$0((C12647a) obj);
    }
}
