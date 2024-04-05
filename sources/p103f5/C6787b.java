package p103f5;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CountDownTimer;
import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.cardinalmobilesdk.p045a.p046a.C6132d;
import com.cardinalcommerce.cardinalmobilesdk.p045a.p047c.C6136b;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.cardinalcommerce.shared.p065cs.utils.CCInitProvider;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONException;
import p115g5.C6882b;
import p139i5.C6993a;
import p151j5.C7118a;
import p160k5.C7196a;
import p160k5.C7197b;
import p257u8.C8177f;

/* renamed from: f5.b */
public final class C6787b implements C6882b {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: i */
    public static C6787b f14931i;

    /* renamed from: j */
    public static CountDownTimer f14932j;

    /* renamed from: k */
    public static String f14933k;

    /* renamed from: l */
    public static C6132d f14934l;

    /* renamed from: m */
    public static C6993a f14935m;

    /* renamed from: n */
    public static boolean f14936n;

    /* renamed from: o */
    public static final Object f14937o = new Object();

    /* renamed from: a */
    public Activity f14938a;

    /* renamed from: b */
    public C7196a f14939b;

    /* renamed from: c */
    public C7197b f14940c;

    /* renamed from: d */
    public String f14941d;

    /* renamed from: e */
    public C6791f f14942e;

    /* renamed from: f */
    public C7118a f14943f;

    /* renamed from: g */
    public Context f14944g;

    /* renamed from: h */
    public boolean f14945h = true;

    /* renamed from: a */
    public static synchronized C6787b m13170a() {
        C6787b bVar;
        synchronized (C6787b.class) {
            if (f14931i == null) {
                synchronized (f14937o) {
                    if (f14931i == null) {
                        f14931i = new C6787b();
                        f14934l = C6132d.New;
                        f14935m = C6993a.m13555g();
                    }
                }
            }
            bVar = f14931i;
        }
        return bVar;
    }

    /* renamed from: b */
    public static String m13171b(Context context) {
        long j;
        C8177f a = C8177f.m16444a(context);
        String e = a.mo20810e("SDKAppID", (String) null);
        long d = a.mo20809d();
        try {
            j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException unused) {
            C6993a aVar = f14935m;
            aVar.getClass();
            aVar.mo19177d(String.valueOf(10220), "Internal Error.", (String) null);
            j = 0;
        }
        if (e != null && d != 0 && d == j) {
            return e;
        }
        String uuid = UUID.randomUUID().toString();
        a.mo20808c("SDKAppID", uuid);
        a.mo20807b(j);
        return uuid;
    }

    /* renamed from: j */
    public static String m13172j() {
        return m13171b(CCInitProvider.m12770a());
    }

    /* renamed from: c */
    public final void mo18925c(CardinalActionCode cardinalActionCode, C6789d dVar, Context context) {
        if (this.f14940c != null) {
            CountDownTimer countDownTimer = f14932j;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                f14932j = null;
            }
            ValidateResponse validateResponse = new ValidateResponse(false, cardinalActionCode, dVar);
            f14935m.mo19179h(dVar, this.f14942e.f14957d);
            f14935m.mo19180i(this.f14943f.f15824d.toString());
            this.f14940c.onValidated(context, validateResponse, "");
            f14934l = C6132d.Validated;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Null CardinalValidateReceiver received on cca_continue"));
    }

    /* renamed from: d */
    public final void mo18926d(ValidateResponse validateResponse, String str) {
        C6993a aVar = f14935m;
        StringBuilder h = C0072d.m201h("Stepup validated with action code: ");
        h.append(validateResponse.getActionCode());
        aVar.mo19175a("CardinalContinue", h.toString(), this.f14942e.f14957d);
        CountDownTimer countDownTimer = f14932j;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        f14932j = null;
        f14934l = C6132d.Validated;
        f14935m.mo19180i(this.f14943f.f15824d.toString());
        this.f14940c.onValidated(this.f14944g, validateResponse, str);
    }

    /* renamed from: e */
    public final void mo18927e(C6789d dVar) {
        this.f14945h = true;
        ValidateResponse validateResponse = new ValidateResponse(false, CardinalActionCode.ERROR, dVar);
        f14935m.mo19180i(this.f14943f.f15824d.toString());
        this.f14939b.onValidated(validateResponse, (String) null);
    }

    /* renamed from: f */
    public final void mo18928f(C6791f fVar) {
        C6791f fVar2 = this.f14942e;
        if (fVar2 == null || !fVar2.f14957d.equals(fVar.f14957d) || !this.f14945h) {
            this.f14942e = fVar;
            if (!this.f14943f.f15827g) {
                mo18930h(fVar);
            }
            try {
                new C6136b(this, this.f14942e, this.f14943f.f15821a).execute(new Void[0]);
                this.f14943f.getClass();
            } catch (JSONException e) {
                C6993a aVar = f14935m;
                String arrays = Arrays.toString(e.getStackTrace());
                String str = this.f14942e.f14957d;
                aVar.getClass();
                aVar.mo19177d(String.valueOf(10217), arrays, str);
                mo18929g(new C6789d(10215));
            }
        } else {
            mo18930h(this.f14942e);
        }
    }

    /* renamed from: g */
    public final void mo18929g(C6789d dVar) {
        if (this.f14943f.f15827g) {
            this.f14945h = true;
            f14935m.mo19179h(dVar, this.f14942e.f14957d);
            ValidateResponse validateResponse = new ValidateResponse(false, CardinalActionCode.ERROR, dVar);
            f14935m.mo19180i(this.f14943f.f15824d.toString());
            this.f14939b.onValidated(validateResponse, (String) null);
        }
    }

    /* renamed from: h */
    public final void mo18930h(C6791f fVar) {
        f14935m.mo19175a("CardinalInit", "Init completed", fVar.f14957d);
        f14934l = C6132d.InitCompleted;
        f14935m.mo19180i(this.f14943f.f15824d.toString());
        this.f14939b.onSetupCompleted(fVar.f14957d);
    }

    /* renamed from: i */
    public final void mo18931i(C6789d dVar) {
        if (this.f14939b != null) {
            ValidateResponse validateResponse = new ValidateResponse(false, CardinalActionCode.ERROR, dVar);
            C7118a aVar = this.f14943f;
            if (aVar != null) {
                f14935m.mo19180i(aVar.f15824d.toString());
            } else {
                f14935m.mo19175a("CardinalInit", "ConfigParameters are null", (String) null);
            }
            this.f14939b.onValidated(validateResponse, "");
        }
    }
}
