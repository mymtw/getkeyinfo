package com.paypal.pyplcheckout.threeds;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.p013v4.media.C0072d;
import android.util.Base64;
import androidx.compose.animation.C0388a;
import androidx.compose.p015ui.text.input.C1993m;
import com.cardinalcommerce.cardinalmobilesdk.enums.CardinalEnvironment;
import com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType;
import com.cardinalcommerce.cardinalmobilesdk.enums.CardinalUiType;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode;
import com.cardinalcommerce.cardinalmobilesdk.p045a.p046a.C6132d;
import com.cardinalcommerce.shared.models.enums.ButtonType;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.cardinalcommerce.shared.p065cs.p066a.C6265a;
import com.cardinalcommerce.shared.p065cs.p069e.C6272b;
import com.cardinalcommerce.shared.p065cs.p070f.C6292k;
import com.cardinalcommerce.shared.p065cs.p070f.C6297o;
import com.cardinalcommerce.shared.userinterfaces.ButtonCustomization;
import com.cardinalcommerce.shared.userinterfaces.LabelCustomization;
import com.cardinalcommerce.shared.userinterfaces.TextBoxCustomization;
import com.cardinalcommerce.shared.userinterfaces.ToolbarCustomization;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.extensions.NumberExtensionsKt;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.C19343e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0015b;
import p092e5.C6718a;
import p103f5.C6785a;
import p103f5.C6787b;
import p103f5.C6788c;
import p103f5.C6789d;
import p139i5.C6993a;
import p139i5.C6994b;
import p151j5.C7118a;
import p160k5.C7197b;
import p226r8.C7784a;
import p257u8.C8172b;
import p260v0.C8184a;

public final class ThreeDs20Info {
    private final String FONT_PAYPAL_SANS_BIG_MEDIUM = "font/pay_pal_sans_big_medium.ttf";
    private final String FONT_PAYPAL_SANS_BIG_REGULAR = "font/pay_pal_sans_big_regular.ttf";
    private final String FONT_PAYPAL_SANS_SMALL_REGULAR = "font/pay_pal_sans_small_regular.ttf";

    private final String getColorHexString(int i) {
        return C0015b.m90i("#", C0388a.m1049e(new Object[]{Integer.valueOf(Color.red(i))}, 1, "%02X", "format(format, *args)"), C0388a.m1049e(new Object[]{Integer.valueOf(Color.green(i))}, 1, "%02X", "format(format, *args)"), C0388a.m1049e(new Object[]{Integer.valueOf(Color.blue(i))}, 1, "%02X", "format(format, *args)"));
    }

    private final void setUiCustomisation(Context context, C7118a aVar) {
        int i = C17165R.color.white_color;
        Object obj = C8184a.f17966a;
        String colorHexString = getColorHexString(C8184a.C8188d.m16468a(context, i));
        String colorHexString2 = getColorHexString(C8184a.C8188d.m16468a(context, C17165R.color.gray_color_700));
        String colorHexString3 = getColorHexString(C8184a.C8188d.m16468a(context, C17165R.color.gray_color_600));
        String colorHexString4 = getColorHexString(C8184a.C8188d.m16468a(context, C17165R.color.blue_color_600));
        String colorHexString5 = getColorHexString(C8184a.C8188d.m16468a(context, C17165R.color.gray_color_400));
        int dp = NumberExtensionsKt.getDp(Float.valueOf(context.getResources().getDimension(C17165R.dimen.text_size_body2)));
        int dp2 = NumberExtensionsKt.getDp(Float.valueOf(context.getResources().getDimension(C17165R.dimen.dash_width)));
        int dp3 = NumberExtensionsKt.getDp(Float.valueOf(context.getResources().getDimension(C17165R.dimen.text_size_three_ds_label)));
        UiCustomization uiCustomization = new UiCustomization();
        ToolbarCustomization toolbarCustomization = new ToolbarCustomization();
        toolbarCustomization.setBackgroundColor(colorHexString);
        toolbarCustomization.setHeaderText(context.getString(C17165R.string.paypal_checkout_3ds_secure_authentication));
        toolbarCustomization.setButtonText(context.getString(C17165R.string.cancel));
        toolbarCustomization.setTextFontSize(dp);
        toolbarCustomization.setTextFontName(this.FONT_PAYPAL_SANS_BIG_REGULAR);
        toolbarCustomization.setTextColor(colorHexString2);
        uiCustomization.setToolbarCustomization(toolbarCustomization);
        LabelCustomization labelCustomization = new LabelCustomization();
        labelCustomization.setHeadingTextColor(colorHexString2);
        labelCustomization.setHeadingTextFontName(this.FONT_PAYPAL_SANS_BIG_REGULAR);
        labelCustomization.setHeadingTextFontSize(dp3);
        labelCustomization.setTextFontName(this.FONT_PAYPAL_SANS_SMALL_REGULAR);
        labelCustomization.setTextFontSize(dp);
        labelCustomization.setTextColor(colorHexString3);
        uiCustomization.setLabelCustomization(labelCustomization);
        ButtonCustomization buttonCustomization = new ButtonCustomization();
        buttonCustomization.setBackgroundColor(colorHexString4);
        Resources resources = context.getResources();
        int i2 = C17165R.dimen.three_ds_button_corner_radius;
        buttonCustomization.setCornerRadius(resources.getDimensionPixelSize(i2));
        buttonCustomization.setTextFontName(this.FONT_PAYPAL_SANS_BIG_MEDIUM);
        buttonCustomization.setTextFontSize(dp);
        buttonCustomization.setTextColor(colorHexString);
        uiCustomization.setButtonCustomization(buttonCustomization, ButtonType.VERIFY);
        ButtonCustomization buttonCustomization2 = new ButtonCustomization();
        buttonCustomization2.setBackgroundColor(colorHexString);
        buttonCustomization2.setCornerRadius(context.getResources().getDimensionPixelSize(i2));
        buttonCustomization2.setTextFontSize(dp);
        buttonCustomization2.setTextColor(colorHexString4);
        buttonCustomization2.setTextFontName(this.FONT_PAYPAL_SANS_BIG_MEDIUM);
        uiCustomization.setButtonCustomization(buttonCustomization2, ButtonType.RESEND);
        TextBoxCustomization textBoxCustomization = new TextBoxCustomization();
        textBoxCustomization.setBorderColor(colorHexString5);
        textBoxCustomization.setBorderWidth(dp2);
        textBoxCustomization.setCornerRadius(context.getResources().getDimensionPixelSize(C17165R.dimen.three_ds_text_corner_radius));
        textBoxCustomization.setTextFontName(this.FONT_PAYPAL_SANS_SMALL_REGULAR);
        uiCustomization.setTextBoxCustomization(textBoxCustomization);
        aVar.f15826f = uiCustomization;
    }

    public final Object continueChallenge(String str, String str2, Activity activity, C19340c<? super ValidateResponseAlias> cVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C19343e eVar = new C19343e(C19388s.m32873m0(cVar));
        continueChallenge(str, str2, activity, (C7197b) new ThreeDs20Info$continueChallenge$2$1(eVar, ref$ObjectRef));
        Object a = eVar.mo71808a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a;
    }

    public final void setUp(Context context, boolean z, boolean z2) {
        String str;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C7118a aVar = new C7118a();
        aVar.f15824d = z2 ? CardinalEnvironment.STAGING : CardinalEnvironment.PRODUCTION;
        aVar.f15827g = z;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(CardinalRenderType.OTP);
        jSONArray.put(CardinalRenderType.SINGLE_SELECT);
        jSONArray.put(CardinalRenderType.MULTI_SELECT);
        jSONArray.put(CardinalRenderType.OOB);
        aVar.f15823c = jSONArray;
        aVar.f15822b = CardinalUiType.NATIVE;
        setUiCustomisation(context, aVar);
        aVar.f15821a = 8000;
        C6718a.m13109a().getClass();
        Class<C6718a> cls = C6718a.class;
        boolean z3 = true;
        boolean z4 = !cls.getName().equals(cls.getName());
        C6787b bVar = C6718a.f14812c;
        bVar.getClass();
        C6132d dVar = C6787b.f14934l;
        C6132d dVar2 = C6132d.Configured;
        if (C1993m.f4511z[dVar.mo17206a()][dVar2.mo17206a()]) {
            C6993a aVar2 = C6787b.f14935m;
            boolean z5 = aVar.f15829i;
            aVar2.getClass();
            C8172b.f17937b = z5;
            C6993a aVar3 = C6787b.f14935m;
            StringBuilder h = C0072d.m201h("SDKAppID: ");
            h.append(C6787b.m13171b(context));
            aVar3.mo19175a("CardinalConfigure", h.toString(), (String) null);
            C6787b.f14934l = dVar2;
            C6787b.f14933k = C6994b.f15532a[aVar.f15824d.ordinal()] != 1 ? "https://centinelapi.cardinalcommerce.com/V1/" : "https://centinelapistag.cardinalcommerce.com/V1/";
            bVar.f14943f = aVar;
            if (!z4) {
                Class<C6787b> cls2 = C6787b.class;
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                int i = 1;
                while (true) {
                    if (i >= stackTrace.length) {
                        str = null;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.getClassName().equals(cls2.getName()) && stackTraceElement.getClassName().indexOf("java.lang.Thread") != 0) {
                        str = stackTraceElement.getClassName();
                        break;
                    }
                    i++;
                }
                if (str.equals(cls.getName())) {
                    z3 = false;
                }
            }
            C6787b.f14936n = z3;
            C6787b.f14935m.mo19175a("CardinalConfigure", "LASSO started", (String) null);
            C7784a d = C7784a.m15038d();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("EnableQuickAuth", Boolean.FALSE);
                jSONObject.putOpt("Environment", aVar.f15824d);
                jSONObject.putOpt("ProxyAddress", "");
                jSONObject.putOpt("RenderType", aVar.f15823c);
                jSONObject.putOpt("Timeout", Integer.valueOf(aVar.f15821a));
                jSONObject.putOpt("UiType", aVar.f15822b);
                jSONObject.putOpt("EnableDFSync", Boolean.valueOf(aVar.f15827g));
                jSONObject.putOpt("EnableLogging", Boolean.valueOf(aVar.f15829i));
                if (!aVar.f15825e.equals("")) {
                    jSONObject.putOpt("ThreeDSRequestorAppURL", aVar.f15825e);
                }
            } catch (JSONException e) {
                C6993a aVar4 = aVar.f15828h;
                String arrays = Arrays.toString(e.getStackTrace());
                aVar4.getClass();
                aVar4.mo19177d(String.valueOf(10610), arrays, (String) null);
            }
            boolean z6 = C6787b.f14936n;
            d.getClass();
            C7784a.f17219c.mo17823a(context, jSONObject);
            C6292k kVar = new C6292k(context, z6);
            d.f17221b = kVar;
            C7784a.f17219c.mo17825a(kVar);
            return;
        }
        C6993a aVar5 = C6787b.f14935m;
        StringBuilder h2 = C0072d.m201h("Error: Current State, Next state  :");
        h2.append(C6787b.f14934l);
        h2.append(", ");
        h2.append(dVar2);
        String sb = h2.toString();
        aVar5.getClass();
        aVar5.mo19177d(String.valueOf(10101), sb, (String) null);
    }

    private final void continueChallenge(String str, String str2, Activity activity, C7197b bVar) {
        C6789d dVar;
        CardinalActionCode cardinalActionCode;
        C6718a.m13109a().getClass();
        C6787b bVar2 = C6718a.f14812c;
        if (bVar != null) {
            bVar2.f14940c = bVar;
            C6132d dVar2 = C6787b.f14934l;
            C6132d dVar3 = C6132d.Continue;
            if (!C1993m.f4511z[dVar2.mo17206a()][dVar3.mo17206a()]) {
                C6993a aVar = C6787b.f14935m;
                StringBuilder h = C0072d.m201h("Invalid Transition: An error occurred during Cardinal Init.");
                h.append(C6787b.f14934l);
                h.append(", ");
                h.append(dVar3);
                String sb = h.toString();
                String str3 = bVar2.f14942e.f14957d;
                aVar.getClass();
                aVar.mo19177d(String.valueOf(10601), sb, str3);
                cardinalActionCode = CardinalActionCode.ERROR;
                dVar = new C6789d(10601);
            } else if (str == null || str.isEmpty()) {
                cardinalActionCode = CardinalActionCode.ERROR;
                dVar = new C6789d(10603);
            } else if (str2 == null || str2.isEmpty()) {
                cardinalActionCode = CardinalActionCode.ERROR;
                dVar = new C6789d(10604);
            } else if (activity == null || activity.getApplicationContext() == null) {
                cardinalActionCode = CardinalActionCode.ERROR;
                dVar = new C6789d(10609);
            } else {
                try {
                    bVar2.f14938a = activity;
                    C6993a aVar2 = C6787b.f14935m;
                    aVar2.mo19175a("CardinalContinue", "Continue started with transactionID: " + str, bVar2.f14942e.f14957d);
                    C6272b bVar3 = new C6272b(new String(Base64.decode(str2, 0), StandardCharsets.UTF_8));
                    if (bVar3.f13762a.mo17805a()) {
                        C19382n.f43257g = false;
                        bVar2.f14943f.getClass();
                        CountDownTimer countDownTimer = C6787b.f14932j;
                        if (countDownTimer != null) {
                            countDownTimer.cancel();
                        }
                        bVar2.f14938a.runOnUiThread(new C6785a(bVar2));
                        bVar2.f14944g = activity.getApplicationContext();
                        C6297o b = C6297o.m12685b(activity.getApplicationContext());
                        C6265a aVar3 = C6265a.CARDINAL;
                        C7118a aVar4 = bVar2.f14943f;
                        b.mo17851d(aVar3, aVar4.f15826f, bVar2, bVar2.f14942e, bVar2.f14941d, str, C6994b.f15532a[aVar4.f15824d.ordinal()] != 1 ? "https://centinelapi.cardinalcommerce.com/V1/" : "https://centinelapistag.cardinalcommerce.com/V1/", bVar2.f14943f.f15825e);
                        C6788c.m13180Q0(bVar3, bVar2.f14938a, bVar2.f14943f, bVar2.f14940c, bVar2.f14942e.f14957d);
                        C6787b.f14934l = dVar3;
                        return;
                    }
                    C6993a aVar5 = C6787b.f14935m;
                    String str4 = bVar2.f14942e.f14957d;
                    aVar5.getClass();
                    aVar5.mo19177d(String.valueOf(10606), "Payload Validation failed.", str4);
                    bVar2.mo18925c(CardinalActionCode.ERROR, new C6789d(10606), activity);
                    return;
                } catch (UnsupportedOperationException | JSONException e) {
                    C6993a aVar6 = C6787b.f14935m;
                    String localizedMessage = e.getLocalizedMessage();
                    String str5 = bVar2.f14942e.f14957d;
                    aVar6.getClass();
                    aVar6.mo19177d(String.valueOf(10610), localizedMessage, str5);
                    cardinalActionCode = CardinalActionCode.ERROR;
                    dVar = new C6789d(10605);
                }
            }
            bVar2.mo18925c(cardinalActionCode, dVar, activity);
            return;
        }
        bVar2.getClass();
        C6993a aVar7 = C6787b.f14935m;
        aVar7.getClass();
        aVar7.mo19177d(String.valueOf(10602), "Invalid Cardinal Validate Receiver.", (String) null);
        throw new InvalidInputException("InvalidInputException", new Throwable("Null CardinalValidateReceiver received on cca_continue"));
    }
}
