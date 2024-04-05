package p277w8;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.room.C3259y;
import androidx.security.crypto.C3272a;
import androidx.security.crypto.EncryptedSharedPreferences;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p072ad.AdImpressionsDatabase;
import com.etsy.android.p327ui.C9097a0;
import com.etsy.android.p327ui.cart.C9241a;
import com.etsy.android.p327ui.search.filters.refactor.C10812k;
import com.etsy.android.p327ui.shop.C11129a1;
import com.etsy.android.p327ui.user.C11358a;
import com.google.android.play.core.appupdate.C15562d;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import dagger.internal.C17555d;
import java.security.KeyStore;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p001a0.C0005b;
import p040c9.C4479c;
import p235s6.C7823a0;
import p478x9.C13852b;
import p568fn.C17782b;
import p628nj.C18263b;
import p740eq.C19011a;

/* renamed from: w8.i */
public final class C8271i implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f18133a;

    /* renamed from: b */
    public final C19011a f18134b;

    /* renamed from: c */
    public final Object f18135c;

    public /* synthetic */ C8271i(Object obj, C19011a aVar, int i) {
        this.f18133a = i;
        this.f18135c = obj;
        this.f18134b = aVar;
    }

    /* renamed from: a */
    public static C11358a m16554a(C1993m mVar, C8731g gVar) {
        mVar.getClass();
        C19383o.m32797g(gVar, "retrofit");
        Object b = gVar.f19177a.mo74387b(C11358a.class);
        C19383o.m32796f(b, "retrofit.v3moshiRetrofit…CartEndpoint::class.java)");
        return (C11358a) b;
    }

    public final Object get() {
        switch (this.f18133a) {
            case 0:
                Context context = (Context) this.f18134b.get();
                ((C0761x) this.f18135c).getClass();
                C19383o.m32797g(context, ResponseConstants.CONTEXT);
                return C3259y.m7913a(context, AdImpressionsDatabase.class, "AdImpressions").mo11987b();
            case 1:
                ((C4479c) this.f18135c).getClass();
                C9097a0 a0Var = (C9097a0) ((C8731g) this.f18134b.get()).f19177a.mo74387b(C9097a0.class);
                C17782b.m29841G(a0Var);
                return a0Var;
            case 2:
                Context context2 = (Context) this.f18134b.get();
                ((C7823a0) this.f18135c).getClass();
                C19383o.m32797g(context2, ResponseConstants.CONTEXT);
                KeyGenParameterSpec keyGenParameterSpec = C3272a.f7598a;
                if (keyGenParameterSpec.getKeySize() != 256) {
                    StringBuilder h = C0072d.m201h("invalid key size, want 256 bits got ");
                    h.append(keyGenParameterSpec.getKeySize());
                    h.append(" bits");
                    throw new IllegalArgumentException(h.toString());
                } else if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                    StringBuilder h2 = C0072d.m201h("invalid block mode, want GCM got ");
                    h2.append(Arrays.toString(keyGenParameterSpec.getBlockModes()));
                    throw new IllegalArgumentException(h2.toString());
                } else if (keyGenParameterSpec.getPurposes() != 3) {
                    StringBuilder h3 = C0072d.m201h("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
                    h3.append(keyGenParameterSpec.getPurposes());
                    throw new IllegalArgumentException(h3.toString());
                } else if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                    StringBuilder h4 = C0072d.m201h("invalid padding mode, want NoPadding got ");
                    h4.append(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
                    throw new IllegalArgumentException(h4.toString());
                } else if (!keyGenParameterSpec.isUserAuthenticationRequired() || keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() >= 1) {
                    String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                    KeyStore instance = KeyStore.getInstance(BaseSecureKeyWrapper.ANDROID_KEYSTORE);
                    instance.load((KeyStore.LoadStoreParameter) null);
                    if (!instance.containsAlias(keystoreAlias)) {
                        KeyGenerator instance2 = KeyGenerator.getInstance("AES", BaseSecureKeyWrapper.ANDROID_KEYSTORE);
                        instance2.init(keyGenParameterSpec);
                        instance2.generateKey();
                    }
                    SharedPreferences create = EncryptedSharedPreferences.create("SecureEtsyUserPrefs", keyGenParameterSpec.getKeystoreAlias(), context2, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
                    C19383o.m32796f(create, "create(\n        \"SecureE…nScheme.AES256_GCM,\n    )");
                    return create;
                } else {
                    throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                }
            case 3:
                C8731g gVar = (C8731g) this.f18134b.get();
                ((C19388s) this.f18135c).getClass();
                C19383o.m32797g(gVar, "configuredV3MoshiRetrofit");
                Object b = gVar.f19177a.mo74387b(C9241a.class);
                C19383o.m32796f(b, "configuredV3MoshiRetrofi…ountEndpoint::class.java)");
                return (C9241a) b;
            case 4:
                C13852b bVar = (C13852b) this.f18134b.get();
                ((C0005b) this.f18135c).getClass();
                C19383o.m32797g(bVar, "deepLinkHostChecker");
                return bVar;
            case 5:
                C8731g gVar2 = (C8731g) this.f18134b.get();
                ((C18263b) this.f18135c).getClass();
                C19383o.m32797g(gVar2, "configuredV3MoshiRetrofit");
                Object b2 = gVar2.f19177a.mo74387b(C10812k.class);
                C19383o.m32796f(b2, "configuredV3MoshiRetrofi…tersEndpoint::class.java)");
                return (C10812k) b2;
            case 6:
                C8731g gVar3 = (C8731g) this.f18134b.get();
                ((C15562d) this.f18135c).getClass();
                C19383o.m32797g(gVar3, "retrofit");
                Object b3 = gVar3.f19177a.mo74387b(C11129a1.class);
                C19383o.m32796f(b3, "retrofit.v3moshiRetrofit…iewsEndpoint::class.java)");
                return (C11129a1) b3;
            default:
                return m16554a((C1993m) this.f18135c, (C8731g) this.f18134b.get());
        }
    }
}
