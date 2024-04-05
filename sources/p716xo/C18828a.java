package p716xo;

import com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent;
import com.paypal.android.platform.authsdk.authcommon.ChallengeParserRegistry;
import com.paypal.android.platform.authsdk.authcommon.ChallengeRegistry;
import com.paypal.android.platform.authsdk.authcommon.model.ClientConfig;
import com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;

/* renamed from: xo.a */
public final class C18828a implements AuthCoreComponent {

    /* renamed from: a */
    public final PartnerAuthEngine f41695a;

    /* renamed from: b */
    public final C20009t f41696b;

    /* renamed from: c */
    public final ClientConfig f41697c;

    public C18828a(PartnerAuthEngine partnerAuthEngine, C20009t tVar, ClientConfig clientConfig) {
        C19383o.m32797g(partnerAuthEngine, "authEngine");
        C19383o.m32797g(clientConfig, "clientConfig");
        this.f41695a = partnerAuthEngine;
        this.f41696b = tVar;
        this.f41697c = clientConfig;
    }

    public final ChallengeParserRegistry getChallengeParserRegistry() {
        return this.f41695a;
    }

    public final ChallengeRegistry getChallengeRegistry() {
        return this.f41695a;
    }

    public final ClientConfig getClientConfig() {
        return this.f41697c;
    }

    public final C20009t getOkHttpClient() {
        return this.f41696b;
    }
}
