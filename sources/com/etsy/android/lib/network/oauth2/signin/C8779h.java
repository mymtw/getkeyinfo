package com.etsy.android.lib.network.oauth2.signin;

import android.os.Bundle;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.network.oauth2.SignInError;
import com.facebook.AccessToken;
import com.facebook.C12243b;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.C12311e;
import com.facebook.login.C12321f;
import kotlin.Pair;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p248tp.C8072t;
import p453tf.C13417i;

/* renamed from: com.etsy.android.lib.network.oauth2.signin.h */
public final class C8779h implements C13417i<C12321f> {

    /* renamed from: a */
    public final /* synthetic */ C8781i f19321a;

    /* renamed from: b */
    public final /* synthetic */ C8072t<C8772a> f19322b;

    /* renamed from: com.etsy.android.lib.network.oauth2.signin.h$a */
    public static final class C8780a implements GraphRequest.C12197d {

        /* renamed from: a */
        public final /* synthetic */ C8072t<C8772a> f19323a;

        /* renamed from: b */
        public final /* synthetic */ C12321f f19324b;

        public C8780a(C8072t<C8772a> tVar, C12321f fVar) {
            this.f19323a = tVar;
            this.f19324b = fVar;
        }

        /* renamed from: a */
        public final void mo30107a(JSONObject jSONObject) {
            try {
                C19383o.m32794d(jSONObject);
                String string = jSONObject.getString("email");
                C8072t<C8772a> tVar = this.f19323a;
                C19383o.m32796f(string, "email");
                tVar.onSuccess(new C8772a(string, this.f19324b.f27459a.getToken()));
            } catch (JSONException e) {
                this.f19323a.tryOnError(e);
            } catch (NullPointerException e2) {
                this.f19323a.tryOnError(e2);
            }
        }
    }

    public C8779h(C8781i iVar, C8072t<C8772a> tVar) {
        this.f19321a = iVar;
        this.f19322b = tVar;
    }

    /* renamed from: a */
    public final void mo30104a(C12321f fVar) {
        C19383o.m32797g(fVar, "result");
        GraphRequest.C12196c cVar = GraphRequest.f27224o;
        AccessToken accessToken = fVar.f27459a;
        C8780a aVar = new C8780a(this.f19322b, fVar);
        cVar.getClass();
        GraphRequest graphRequest = new GraphRequest(accessToken, "me", (Bundle) null, (HttpMethod) null, new C12243b(aVar), 32);
        graphRequest.f27228d = C19382n.m32717K(new Pair("fields", "email"));
        graphRequest.mo39227d();
        C8781i iVar = this.f19321a;
        C12311e eVar = iVar.f19327c;
        CallbackManagerImpl callbackManagerImpl = iVar.f19326b;
        eVar.getClass();
        C12311e.m20142h(callbackManagerImpl);
    }

    /* renamed from: b */
    public final void mo30105b(FacebookException facebookException) {
        this.f19322b.tryOnError(SignInError.FacebookError.INSTANCE);
        C8781i iVar = this.f19321a;
        C12311e eVar = iVar.f19327c;
        CallbackManagerImpl callbackManagerImpl = iVar.f19326b;
        eVar.getClass();
        C12311e.m20142h(callbackManagerImpl);
    }

    public final void onCancel() {
        LogCatKt.m17045a().mo21312f("Facebook sign in cancelled");
        this.f19322b.tryOnError(SignInError.UserCancel.INSTANCE);
        C8781i iVar = this.f19321a;
        C12311e eVar = iVar.f19327c;
        CallbackManagerImpl callbackManagerImpl = iVar.f19326b;
        eVar.getClass();
        C12311e.m20142h(callbackManagerImpl);
    }
}
