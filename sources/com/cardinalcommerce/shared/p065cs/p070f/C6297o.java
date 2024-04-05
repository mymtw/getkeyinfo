package com.cardinalcommerce.shared.p065cs.p070f;

import android.content.Context;
import android.content.Intent;
import android.support.p013v4.media.C0072d;
import androidx.preference.C3039b;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.cardinalmobilesdk.p045a.p047c.C6139d;
import com.cardinalcommerce.emvco.p063a.p064e.C6260c;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.cardinalcommerce.shared.p065cs.p066a.C6265a;
import com.cardinalcommerce.shared.p065cs.p069e.C6272b;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.Arrays;
import kotlin.jvm.internal.C19382n;
import org.json.JSONException;
import p103f5.C6787b;
import p103f5.C6789d;
import p103f5.C6791f;
import p115g5.C6881a;
import p115g5.C6882b;
import p163k8.C7208a;
import p182m8.C7353a;
import p201o8.C7636a;
import p201o8.C7637b;
import p237s8.C7906b;
import p247t8.C8045c;
import p257u8.C8171a;
import p257u8.C8172b;

/* renamed from: com.cardinalcommerce.shared.cs.f.o */
public final class C6297o implements C6881a, C7208a {

    /* renamed from: n */
    public static C6297o f13985n;

    /* renamed from: o */
    public static C6265a f13986o;

    /* renamed from: a */
    public C7906b f13987a;

    /* renamed from: b */
    public String f13988b;

    /* renamed from: c */
    public UiCustomization f13989c;

    /* renamed from: d */
    public C8172b f13990d;

    /* renamed from: e */
    public C6791f f13991e;

    /* renamed from: f */
    public String f13992f;

    /* renamed from: g */
    public String f13993g;

    /* renamed from: h */
    public String f13994h;

    /* renamed from: i */
    public C6882b f13995i;

    /* renamed from: j */
    public Context f13996j;

    /* renamed from: k */
    public C6260c f13997k;

    /* renamed from: l */
    public C6139d f13998l;

    /* renamed from: m */
    public String f13999m = "";

    public C6297o(Context context) {
        this.f13996j = context.getApplicationContext();
        this.f13990d = C8172b.m16432f();
    }

    /* renamed from: b */
    public static synchronized C6297o m12685b(Context context) {
        C6297o oVar;
        synchronized (C6297o.class) {
            if (f13985n == null) {
                if (context != null) {
                    f13985n = new C6297o(context.getApplicationContext());
                } else {
                    throw new InvalidInputException("InvalidInputException", new Throwable("Caught in UIInteractionFactory getInstance(), null Context passed"));
                }
            }
            oVar = f13985n;
        }
        return oVar;
    }

    /* renamed from: a */
    public final void mo17848a(C6272b bVar) {
        if (!bVar.mo17774e().equalsIgnoreCase(this.f13988b) || !bVar.mo17776g().equalsIgnoreCase("N")) {
            Context context = this.f13996j;
            UiCustomization uiCustomization = this.f13989c;
            if (C19382n.f43257g) {
                return;
            }
            if (bVar.mo17792w().equalsIgnoreCase("Y") || bVar.mo17792w().equalsIgnoreCase("N")) {
                bVar.mo17790u();
                bVar.mo17792w();
                if (C19382n.f43256f != null) {
                    Intent intent = new Intent("finish_activity");
                    C19382n.f43257g = true;
                    C19382n.f43256f.sendBroadcast(intent);
                }
                C7353a.m14124b().getClass();
                throw null;
            } else if (bVar.mo17776g().equalsIgnoreCase("N")) {
                C19382n.m32775v(context, bVar, uiCustomization);
            } else {
                bVar.mo17792w();
                throw null;
            }
        } else {
            this.f13987a.mo17858a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo17849a(String str, C15588c1 c1Var) {
        C7353a.m14124b().getClass();
        if (str.equals("ProtocolError")) {
            C7636a aVar = (C7636a) c1Var;
            throw null;
        } else if (str.equals("RunTimeError")) {
            C7637b bVar = (C7637b) c1Var;
            throw null;
        } else if (str.equals("TimeOutError")) {
            throw null;
        } else if (!str.equals("CancelTimeout")) {
            this.f13987a.mo17857a();
        } else {
            C6265a aVar2 = C6265a.EMVCO;
            throw null;
        }
    }

    /* renamed from: c */
    public final void mo17850c(ValidateResponse validateResponse, String str) {
        C7906b bVar = this.f13987a;
        if (bVar != null) {
            bVar.mo17857a();
        }
        ((C6787b) this.f13995i).mo18926d(validateResponse, str);
    }

    /* renamed from: d */
    public final void mo17851d(C6265a aVar, UiCustomization uiCustomization, C6787b bVar, C6791f fVar, String str, String str2, String str3, String str4) {
        f13986o = aVar;
        this.f13989c = uiCustomization;
        this.f13991e = fVar;
        this.f13992f = str;
        this.f13993g = str2;
        this.f13994h = str3;
        this.f13995i = bVar;
        this.f13999m = str4;
        this.f13990d.mo19175a("CardinalContinue", "UI Interaction Factory Configured", fVar.f14957d);
    }

    /* renamed from: e */
    public final void mo17852e(C8045c cVar, C7906b bVar, String str) {
        ValidateResponse validateResponse;
        this.f13987a = bVar;
        this.f13988b = str;
        if (f13986o == C6265a.EMVCO) {
            this.f13990d.mo19175a("EMVCoDoChallenge", "UI Interaction Factory sendUserResponse EMVCo", (String) null);
            try {
                this.f13997k = new C6260c(this, cVar);
            } catch (JSONException e) {
                C8172b bVar2 = this.f13990d;
                String valueOf = String.valueOf(11417);
                StringBuilder h = C0072d.m201h("Error while creating new ChallengeTask \n");
                h.append(e.getLocalizedMessage());
                bVar2.mo19177d(valueOf, h.toString(), (String) null);
                mo17849a("", new C15588c1());
            }
            C6260c cVar2 = this.f13997k;
            if (cVar2 != null) {
                cVar2.execute(new Void[0]);
                this.f13990d.mo19175a("EMVCoDoChallenge", "Challenge Task started 02", (String) null);
                return;
            }
            return;
        }
        this.f13990d.mo19175a("CardinalContinue", "UI Interaction Factory sendUserResponse", this.f13991e.f14957d);
        if (this.f13996j != null) {
            if (cVar == null) {
                validateResponse = new ValidateResponse(false, CardinalActionCode.ERROR, new C6789d(10713));
            } else {
                C6791f fVar = this.f13991e;
                if (fVar != null) {
                    String str2 = fVar.f14957d;
                    if (str2 != null) {
                        C8172b bVar3 = this.f13990d;
                        bVar3.mo19175a("CardinalContinue", "In Stepup user Input. SessionId : " + str2, str2);
                        if (cVar.f17542b.mo17805a()) {
                            cVar.f17558r = C3039b.m7190y(this.f13992f);
                            cVar.f17557q = C3039b.m7190y(str2);
                            cVar.f17556p = C3039b.m7190y(this.f13993g);
                            if (!this.f13999m.equals("")) {
                                cVar.f17554n = C3039b.m7190y(this.f13999m);
                            }
                            C6139d dVar = new C6139d(cVar, this, this.f13994h);
                            this.f13998l = dVar;
                            dVar.execute(new Void[0]);
                        } else {
                            validateResponse = new ValidateResponse(false, CardinalActionCode.ERROR, new C6789d(10703));
                        }
                    } else {
                        this.f13990d.mo19177d(String.valueOf(10711), "Internal Error", (String) null);
                        validateResponse = new ValidateResponse(false, CardinalActionCode.ERROR, new C6789d(10711));
                    }
                } else {
                    validateResponse = new ValidateResponse(false, CardinalActionCode.ERROR, new C6789d(10711));
                }
            }
            if (this.f13996j != null) {
                ((C6787b) this.f13995i).mo18926d(validateResponse, "");
            }
        }
        if (C3039b.m7186u(cVar.f17545e)) {
            return;
        }
        if (Arrays.equals(cVar.f17545e, C8171a.f17933f) || Arrays.equals(cVar.f17545e, C8171a.f17934g)) {
            bVar.mo17857a();
        }
    }
}
