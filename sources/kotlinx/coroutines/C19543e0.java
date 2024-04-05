package kotlinx.coroutines;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.compose.foundation.layout.C0731e;
import androidx.compose.foundation.layout.C0733f;
import androidx.compose.foundation.layout.C0754q;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.material.C1183f0;
import androidx.compose.material.C1259v;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.colorspace.C1502a;
import androidx.compose.p015ui.graphics.colorspace.C1504b;
import androidx.compose.p015ui.graphics.colorspace.C1505c;
import androidx.compose.p015ui.graphics.colorspace.C1506d;
import androidx.compose.p015ui.graphics.colorspace.C1507e;
import androidx.compose.p015ui.graphics.colorspace.C1512i;
import androidx.compose.p015ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p015ui.graphics.colorspace.Rgb;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.text.android.C1923f;
import androidx.compose.runtime.C1302d;
import androidx.core.view.C2320n0;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.Constants;
import com.appboy.p043ui.C4940R;
import com.braze.models.inappmessage.MessageButton;
import com.etsy.android.R;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.InfoModal;
import com.etsy.android.lib.models.apiv3.cart.PaymentMethod;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.paymentmethod.ChangePaymentMethodFragment;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopSectionListingsKey;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.stylekit.CenteredImageSpan;
import com.etsy.android.stylekit.views.C9069r;
import com.google.android.datatransport.C6495c;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.C14720l8;
import com.google.android.gms.measurement.internal.C14921a0;
import com.google.android.gms.measurement.internal.C14941c2;
import com.google.android.gms.measurement.internal.C14950d2;
import com.google.android.gms.measurement.internal.C14959e2;
import com.google.android.gms.measurement.internal.C15099u;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.play.core.internal.C15702n;
import com.google.gson.internal.C16790g;
import dagger.android.C17550a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.C19389t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import kotlinx.coroutines.internal.C19722g;
import kotlinx.coroutines.internal.C19733q;
import kotlinx.coroutines.internal.C19736t;
import p003a2.C0015b;
import p007a6.C0039a;
import p008a7.C0041a;
import p022b2.C3469a;
import p093e6.C6720b;
import p098f0.C6767e;
import p104f6.C6792a;
import p152j6.C7122c;
import p152j6.C7148f;
import p152j6.C7149g;
import p179m5.C7336h;
import p189n5.C7452a;
import p190n6.C7485a;
import p199o6.C7621b;
import p199o6.C7623d;
import p209p6.C7676c;
import p209p6.C7686e;
import p223r5.C7748b;
import p223r5.C7759g0;
import p244t5.C7959a;
import p255u5.C8166a;
import p267v7.C8212a;
import p267v7.C8217e;
import p285x5.C8323b;
import p289y0.C8352d;
import p303z5.C8452a;
import p343ee.C12693a;
import p453tf.C13423m;
import p514bk.C14088a;
import p524cn.C14172a;
import p550dl.C17578d;
import p550dl.C17583i;
import p568fn.C17782b;
import p594jh.C17948m0;
import p595ji.C18000l;
import p628nj.C18263b;
import p634np.C18290b;
import p687uj.C18588d;
import p687uj.C18600p;
import p715xn.C18822c;
import p715xn.C18823d;
import p737cr.C18982a;
import p737cr.C18984c;
import p737cr.C18985d;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p772tq.C20203a;

/* renamed from: kotlinx.coroutines.e0 */
public class C19543e0 implements C0733f, C3469a, C15702n, C18822c, C6495c, C17550a, C18290b, C14941c2, C16790g, C12693a, C18000l {

    /* renamed from: b */
    public static final C19543e0 f43489b = new C19543e0();

    /* renamed from: c */
    public static final C1923f f43490c = new C1923f();

    /* renamed from: d */
    public static final int[] f43491d = {R.attr.ambientEnabled, R.attr.cameraBearing, R.attr.cameraMaxZoomPreference, R.attr.cameraMinZoomPreference, R.attr.cameraTargetLat, R.attr.cameraTargetLng, R.attr.cameraTilt, R.attr.cameraZoom, R.attr.latLngBoundsNorthEastLatitude, R.attr.latLngBoundsNorthEastLongitude, R.attr.latLngBoundsSouthWestLatitude, R.attr.latLngBoundsSouthWestLongitude, R.attr.liteMode, R.attr.mapType, R.attr.uiCompass, R.attr.uiMapToolbar, R.attr.uiRotateGestures, R.attr.uiScrollGestures, R.attr.uiScrollGesturesDuringRotateOrZoom, R.attr.uiTiltGestures, R.attr.uiZoomControls, R.attr.uiZoomGestures, R.attr.useViewLifecycle, R.attr.zOrderOnTop};

    /* renamed from: e */
    public static final /* synthetic */ C19543e0 f43492e = new C19543e0();

    /* renamed from: f */
    public static final /* synthetic */ C19543e0 f43493f = new C19543e0();

    /* renamed from: g */
    public static final String[] f43494g = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* renamed from: h */
    public static final String[] f43495h = {"_ln", "_fot", "_fvt", "_ldl", AnalyticsLogDatabaseHelper.f19040ID, "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* renamed from: i */
    public static final C19736t f43496i = new C19736t("NO_DECISION");

    /* renamed from: j */
    public static final C19736t f43497j = new C19736t("RETRY_ATOMIC");

    /* renamed from: A */
    public static int m33285A(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: B */
    public static final C1436d m33286B(C1436d dVar, C1530k0 k0Var) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(k0Var, "shape");
        return C19388s.m32869k0(dVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, k0Var, true, 59391);
    }

    /* renamed from: C */
    public static final C1436d m33287C(C1436d dVar) {
        C19383o.m32797g(dVar, "<this>");
        return C19388s.m32869k0(dVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (C1530k0) null, true, 61439);
    }

    /* renamed from: D */
    public static C1183f0 m33288D(long j, long j2, float f, long j3, long j4, float f2, C1302d dVar, int i) {
        long j5;
        long j6;
        long j7;
        long j8;
        C1302d dVar2 = dVar;
        int i2 = i;
        dVar2.mo5465u(-1032127534);
        long i3 = (i2 & 1) != 0 ? ((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5362i() : j;
        long j9 = (i2 & 2) != 0 ? i3 : j2;
        float f3 = (i2 & 4) != 0 ? 0.54f : f;
        long j10 = (i2 & 8) != 0 ? ((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5363j() : j3;
        long e = (i2 & 16) != 0 ? ((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5358e() : j4;
        float f4 = (i2 & 32) != 0 ? 0.38f : f2;
        if ((i2 & 64) != 0) {
            j6 = i3;
            j5 = C18263b.m30808C(C1545s.m3356b(i3, m33299P(dVar)), ((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5363j());
        } else {
            j6 = i3;
            j5 = 0;
        }
        long C = (i2 & 128) != 0 ? C18263b.m30808C(C1545s.m3356b(j9, m33299P(dVar)), ((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5363j()) : 0;
        if ((i2 & 256) != 0) {
            j7 = j10;
            j8 = C18263b.m30808C(C1545s.m3356b(j10, m33299P(dVar)), ((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5363j());
        } else {
            j7 = j10;
            j8 = 0;
        }
        C1183f0 f0Var = new C1183f0(j6, C1545s.m3356b(j9, f3), j7, C1545s.m3356b(e, f4), j5, C1545s.m3356b(C, f3), j8, C1545s.m3356b((i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? C18263b.m30808C(C1545s.m3356b(e, m33299P(dVar)), ((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5363j()) : 0, f4));
        dVar.mo5406H();
        return f0Var;
    }

    /* renamed from: E */
    public static int m33289E(byte b, byte b2) {
        return (b & 255) - (b2 & 255);
    }

    /* renamed from: F */
    public static final boolean m33290F(C1512i iVar, C1512i iVar2) {
        C19383o.m32797g(iVar, Constants.APPBOY_PUSH_CONTENT_KEY);
        C19383o.m32797g(iVar2, "b");
        if (iVar == iVar2) {
            return true;
        }
        return Math.abs(iVar.f3285a - iVar2.f3285a) < 0.001f && Math.abs(iVar.f3286b - iVar2.f3286b) < 0.001f;
    }

    /* renamed from: G */
    public static C1507e m33291G(C1505c cVar, C1505c cVar2, int i) {
        if ((i & 1) != 0) {
            cVar2 = ColorSpaces.f3226c;
        }
        C19383o.m32797g(cVar, "$this$connect");
        C19383o.m32797g(cVar2, "destination");
        if (cVar == cVar2) {
            return new C1506d(cVar);
        }
        long j = cVar.f3266b;
        long j2 = C1504b.f3260a;
        return (!C1504b.m3215a(j, j2) || !C1504b.m3215a(cVar2.f3266b, j2)) ? new C1507e(cVar, cVar2, 0) : new C1507e.C1508a((Rgb) cVar, (Rgb) cVar2, 0);
    }

    /* renamed from: H */
    public static float m33292H(float f, float f2, C1302d dVar) {
        dVar.mo5465u(-1528360391);
        long j = ((C1545s) dVar.mo5410J(ContentColorKt.f2199a)).f3366a;
        if (!((C1259v) dVar.mo5410J(ColorsKt.f2187a)).mo5364k() ? ((double) C18263b.m30843f0(j)) >= 0.5d : ((double) C18263b.m30843f0(j)) <= 0.5d) {
            f = f2;
        }
        dVar.mo5406H();
        return f;
    }

    /* renamed from: I */
    public static C19388s m33293I(int i) {
        return i != 0 ? i != 1 ? new C17583i() : new C17578d() : new C17583i();
    }

    /* renamed from: J */
    public static final void m33294J(Throwable th, C19340c cVar) {
        cVar.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
        throw th;
    }

    /* renamed from: K */
    public static final int m33295K(Number number, Context context) {
        C19383o.m32797g(number, "<this>");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return (int) TypedValue.applyDimension(1, number.floatValue(), context.getResources().getDisplayMetrics());
    }

    /* renamed from: M */
    public static final String m33296M(long j) {
        String str;
        if (j <= ((long) -999500000)) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= ((long) -999500)) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < ((long) 999500)) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < ((long) 999500000)) {
            str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        return C0388a.m1049e(new Object[]{str}, 1, "%6s", "java.lang.String.format(format, *args)");
    }

    /* renamed from: N */
    public static final Drawable m33297N(Context context, MessageButton messageButton, int i, int i2, boolean z) {
        Drawable drawable = context.getResources().getDrawable(C4940R.C4941drawable.com_braze_inappmessage_button_background);
        C19383o.m32796f(drawable, "context.resources.getDrawable(drawableId)");
        drawable.mutate();
        Drawable findDrawableByLayerId = ((RippleDrawable) drawable).findDrawableByLayerId(C4940R.C4942id.f11133xf483b01a);
        if (findDrawableByLayerId != null) {
            GradientDrawable gradientDrawable = (GradientDrawable) findDrawableByLayerId;
            if (z) {
                i = i2;
            }
            gradientDrawable.setStroke(i, messageButton.f11838k);
            gradientDrawable.setColor(messageButton.f11836i);
            return drawable;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
    }

    /* renamed from: O */
    public static final C2320n0 m33298O(ViewGroup viewGroup) {
        C19383o.m32797g(viewGroup, "<this>");
        return new C2320n0(viewGroup);
    }

    /* renamed from: P */
    public static float m33299P(C1302d dVar) {
        dVar.mo5465u(621183615);
        float H = m33292H(0.38f, 0.38f, dVar);
        dVar.mo5406H();
        return H;
    }

    /* renamed from: R */
    public static final String m33300R(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: S */
    public static float m33301S(C1302d dVar) {
        dVar.mo5465u(629162431);
        float H = m33292H(1.0f, 0.87f, dVar);
        dVar.mo5406H();
        return H;
    }

    /* renamed from: T */
    public static float m33302T(C1302d dVar) {
        dVar.mo5465u(1999054879);
        float H = m33292H(0.74f, 0.6f, dVar);
        dVar.mo5406H();
        return H;
    }

    /* renamed from: U */
    public static String m33303U(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", new Object[]{"https://console.firebase.google.com", str, str2});
    }

    /* renamed from: V */
    public static SimpleDateFormat m33304V(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else if (i == 3) {
            str = "M/d/yy";
        } else {
            throw new IllegalArgumentException(C0015b.m88g("Unknown DateFormat style: ", i));
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else if (i2 == 3) {
            str2 = "h:mm a";
        } else {
            throw new IllegalArgumentException(C0015b.m88g("Unknown DateFormat style: ", i2));
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    /* renamed from: X */
    public static final float[] m33305X(float[] fArr) {
        float[] fArr2 = fArr;
        C19383o.m32797g(fArr2, "m");
        float f = fArr2[0];
        float f2 = fArr2[3];
        float f3 = fArr2[6];
        float f4 = fArr2[1];
        float f5 = fArr2[4];
        float f6 = fArr2[7];
        float f7 = fArr2[2];
        float f8 = fArr2[5];
        float f9 = fArr2[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr3 = new float[fArr2.length];
        fArr3[0] = f10 / f13;
        fArr3[1] = f11 / f13;
        fArr3[2] = f12 / f13;
        fArr3[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr3[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr3[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr3[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr3[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr3[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr3;
    }

    /* renamed from: Y */
    public static final boolean m33306Y(Collection collection) {
        return !(collection == null || collection.isEmpty());
    }

    /* renamed from: Z */
    public static Object m33307Z(Object obj) {
        if (!(obj instanceof List)) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : (Iterable) obj) {
            Long valueOf = next instanceof Double ? Long.valueOf((long) ((Number) next).doubleValue()) : next instanceof Long ? (Long) next : next instanceof Integer ? Long.valueOf((long) ((Number) next).intValue()) : next instanceof EtsyId ? Long.valueOf(((EtsyId) next).getIdAsLongDeprecated()) : next instanceof String ? C19456j.m33017U0((String) next) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        return arrayList;
    }

    /* renamed from: a0 */
    public static String m33308a0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* renamed from: b0 */
    public static final C6767e m33309b0(C19846a aVar) {
        C19383o.m32797g(aVar, "defaultFactory");
        return new C6767e(aVar);
    }

    /* renamed from: c0 */
    public static final float[] m33310c0(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        C19383o.m32797g(fArr3, "lhs");
        C19383o.m32797g(fArr4, "rhs");
        float f = fArr3[3];
        float f2 = fArr4[1];
        float f3 = f * f2;
        float f4 = fArr3[6];
        float f5 = fArr4[2];
        float f6 = f4 * f5;
        float f7 = fArr3[1];
        float f8 = fArr4[0];
        float f9 = fArr3[4];
        float f10 = f2 * f9;
        float f11 = fArr3[7];
        float f12 = f11 * f5;
        float f13 = fArr3[5];
        float f14 = fArr4[1] * f13;
        float f15 = fArr3[8];
        float f16 = f5 * f15;
        float f17 = fArr3[0];
        float f18 = fArr4[4];
        float f19 = (f * f18) + (fArr4[3] * f17);
        float f20 = fArr4[5];
        float f21 = fArr3[1];
        float f22 = fArr4[3];
        float f23 = f9 * f18;
        float f24 = fArr3[2];
        float f25 = f13 * fArr4[4];
        float f26 = f17 * fArr4[6];
        float f27 = fArr3[3];
        float f28 = fArr4[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr4[8];
        float f31 = fArr4[6];
        float f32 = f11 * f30;
        float f33 = f15 * f30;
        return new float[]{f6 + f3 + (fArr3[0] * fArr4[0]), f12 + f10 + (f7 * f8), f16 + f14 + (fArr3[2] * f8), (f4 * f20) + f19, (f11 * f20) + f23 + (f21 * f22), (f20 * f15) + f25 + (f22 * f24), (f4 * f30) + f29, f32 + (fArr3[4] * f28) + (f21 * f31), f33 + (fArr3[5] * fArr4[7]) + (f24 * f31)};
    }

    /* renamed from: d0 */
    public static final float[] m33311d0(float[] fArr, float[] fArr2) {
        C19383o.m32797g(fArr2, "rhs");
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f, fArr2[4] * f2, fArr2[5] * f3, f * fArr2[6], f2 * fArr2[7], f3 * fArr2[8]};
    }

    /* renamed from: e0 */
    public static final void m33312e0(float[] fArr, float[] fArr2) {
        C19383o.m32797g(fArr, "lhs");
        C19383o.m32797g(fArr2, "rhs");
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f4 = fArr[2] * f;
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + f4;
    }

    /* renamed from: f0 */
    public static final String m33313f0(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        C19383o.m32796f(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    /* renamed from: g0 */
    public static final void m33314g0(int i, int i2, Object[] objArr) {
        C19383o.m32797g(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* renamed from: h0 */
    public static void m33315h0(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).setElevation(f);
        }
    }

    /* renamed from: i0 */
    public static void m33316i0(View view) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            m33317j0(view, (MaterialShapeDrawable) background);
        }
    }

    /* renamed from: j0 */
    public static void m33317j0(View view, MaterialShapeDrawable materialShapeDrawable) {
        if (materialShapeDrawable.isElevationOverlayEnabled()) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                f += C2364y.C2373i.m5262i((View) parent);
            }
            materialShapeDrawable.setParentAbsoluteElevation(f);
        }
    }

    /* renamed from: k0 */
    public static final void m33318k0(TextView textView, String str, InfoModal infoModal, C19846a aVar) {
        TextView textView2 = textView;
        String str2 = str;
        C19383o.m32797g(textView2, "paymentSubtitle");
        C19383o.m32797g(str2, "text");
        Context context = textView.getContext();
        if (C19459m.m33036e1(str2, PaymentMethod.SUBTEXT_ARG_1, false)) {
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            Context context2 = context;
            CenteredImageSpan centeredImageSpan = new CenteredImageSpan(context2, R.drawable.ic_etsy_klarna_logo_vector, 0, (Integer) null, 12, (DefaultConstructorMarker) null);
            CenteredImageSpan centeredImageSpan2 = r3;
            CenteredImageSpan centeredImageSpan3 = new CenteredImageSpan(context2, R.drawable.clg_ic_help_small, 0, (Integer) null, 12, (DefaultConstructorMarker) null);
            Spanned fromHtml = Html.fromHtml(str2, 0);
            SpannableStringBuilder append = new SpannableStringBuilder().append(fromHtml);
            C19383o.m32796f(fromHtml, "spanned");
            append.setSpan(centeredImageSpan, C19459m.m33043l1(fromHtml, PaymentMethod.SUBTEXT_ARG_1, 0, false, 6), C19459m.m33043l1(fromHtml, PaymentMethod.SUBTEXT_ARG_1, 0, false, 6) + 4, 0);
            append.setSpan(centeredImageSpan2, C19459m.m33046o1(fromHtml, PaymentMethod.SUBTEXT_ARG_2, 0, 6), C19459m.m33046o1(fromHtml, PaymentMethod.SUBTEXT_ARG_2, 0, 6) + 4, 0);
            textView2.setText(append);
            textView2.setOnClickListener(new C9069r(2, aVar, infoModal));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            String spannableStringBuilder = append.toString();
            C19383o.m32796f(spannableStringBuilder, "spannable.toString()");
            String string = context.getString(R.string.klarna_ic_etsy_klarna_logo_vector_desc);
            C19383o.m32796f(string, "context.getString(R.stri…_klarna_logo_vector_desc)");
            textView2.setContentDescription(C19457k.m33023a1(C19457k.m33023a1(spannableStringBuilder, PaymentMethod.SUBTEXT_ARG_1, string, false), PaymentMethod.SUBTEXT_ARG_2, "", false));
            return;
        }
        textView.setText(str);
    }

    /* renamed from: l */
    public static int m33319l(C0041a aVar, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        C7623d a = ((C7485a) aVar).mo19824a();
        return a == null ? bigInteger2.bitLength() : a.f16913d.bitLength();
    }

    /* renamed from: l0 */
    public static final void m33320l0(C19857l lVar, C19340c cVar) {
        try {
            C19382n.m32784z0((C19857l) null, Result.m35480constructorimpl(C19394m.f43287a), C19388s.m32873m0(C19388s.m32841Q(lVar, cVar)));
        } catch (Throwable th) {
            m33294J(th, cVar);
            throw null;
        }
    }

    /* renamed from: m */
    public static C7148f m33321m(C7959a aVar) {
        C7149g gVar = (C7149g) C7452a.f16656I.get(aVar);
        C7148f fVar = null;
        C7148f b = gVar == null ? null : gVar.mo19447b();
        if (b != null) {
            return b;
        }
        C7149g gVar2 = (C7149g) C7122c.f15864y.get(aVar);
        C7148f b2 = gVar2 != null ? gVar2.mo19447b() : null;
        if (b2 == null) {
            b2 = C6720b.m13114a(aVar);
        }
        if (b2 == null) {
            C7149g gVar3 = (C7149g) C6792a.f14973p.get(aVar);
            b2 = gVar3 != null ? gVar3.mo19447b() : null;
        }
        if (b2 == null) {
            C7149g gVar4 = (C7149g) C8166a.f17925c.get(aVar);
            b2 = gVar4 == null ? null : gVar4.mo19447b();
        }
        if (b2 == null) {
            C7759g0 g0Var = (C7759g0) C8323b.f18268b.get(aVar);
            b2 = g0Var == null ? null : new C7148f(g0Var.f17188f, g0Var.f17190h, g0Var.f17191i, g0Var.f17192j, g0Var.mo20320b());
        }
        if (b2 != null) {
            return b2;
        }
        C7149g gVar5 = (C7149g) C8452a.f18476d.get(aVar);
        if (gVar5 != null) {
            fVar = gVar5.mo19447b();
        }
        return fVar;
    }

    /* renamed from: m0 */
    public static final void m33322m0(C19861p pVar, Object obj, C19340c cVar, C19857l lVar) {
        try {
            C19382n.m32784z0(lVar, Result.m35480constructorimpl(C19394m.f43287a), C19388s.m32873m0(C19388s.m32843R(pVar, obj, cVar)));
        } catch (Throwable th) {
            m33294J(th, cVar);
            throw null;
        }
    }

    /* renamed from: n */
    public static String m33323n(String str, BigInteger bigInteger, C7623d dVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = C8217e.f18044a;
        C7686e s = dVar.f16912c.mo20121b(bigInteger).mo20140s();
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(m33328q(s, dVar));
        stringBuffer.append("]");
        stringBuffer.append(str2);
        stringBuffer.append("            X: ");
        s.mo20139r();
        stringBuffer.append(s.f17049b.mo20092a().toString(16));
        stringBuffer.append(str2);
        stringBuffer.append("            Y: ");
        stringBuffer.append(s.mo20137p().mo20092a().toString(16));
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    /* renamed from: n0 */
    public static final void m33324n0(C19861p pVar, Object obj, C19340c cVar) {
        C19383o.m32797g(cVar, "completion");
        try {
            C19389t.m32910d(2, pVar);
            Object invoke = pVar.invoke(obj, cVar);
            if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                cVar.resumeWith(Result.m35480constructorimpl(invoke));
            }
        } catch (Throwable th) {
            cVar.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
        }
    }

    /* renamed from: o0 */
    public static final Object m33325o0(C19733q qVar, C19733q qVar2, C19861p pVar) {
        Object obj;
        Object o0;
        try {
            C19389t.m32910d(2, pVar);
            obj = pVar.invoke(qVar2, qVar);
        } catch (Throwable th) {
            obj = new C19830v(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (obj == coroutineSingletons || (o0 = qVar.mo72525o0(obj)) == C14088a.f31033n) {
            return coroutineSingletons;
        }
        if (!(o0 instanceof C19830v)) {
            return C14088a.m21796y(o0);
        }
        throw ((C19830v) o0).f43842a;
    }

    /* renamed from: p */
    public static String m33326p(String str, C7686e eVar, C7623d dVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = C8217e.f18044a;
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(m33328q(eVar, dVar));
        stringBuffer.append("]");
        stringBuffer.append(str2);
        stringBuffer.append("            X: ");
        eVar.mo20139r();
        stringBuffer.append(eVar.f17049b.mo20092a().toString(16));
        stringBuffer.append(str2);
        stringBuffer.append("            Y: ");
        stringBuffer.append(eVar.mo20137p().mo20092a().toString(16));
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0099  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33327p0(int r7, java.lang.Object r8, androidx.compose.p015ui.text.font.C1950f r9, androidx.compose.p015ui.text.font.C1959m r10, int r11) {
        /*
            java.lang.String r0 = "typeface"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "font"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            java.lang.String r0 = "requestedWeight"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            boolean r0 = r8 instanceof android.graphics.Typeface
            if (r0 != 0) goto L_0x0014
            return r8
        L_0x0014:
            r0 = 1
            r1 = 0
            if (r7 != r0) goto L_0x001a
            r2 = r0
            goto L_0x001b
        L_0x001a:
            r2 = r1
        L_0x001b:
            r3 = 2
            if (r2 != 0) goto L_0x0028
            if (r7 != r3) goto L_0x0022
            r2 = r0
            goto L_0x0023
        L_0x0022:
            r2 = r1
        L_0x0023:
            if (r2 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r2 = r1
            goto L_0x0029
        L_0x0028:
            r2 = r0
        L_0x0029:
            if (r2 == 0) goto L_0x0049
            androidx.compose.ui.text.font.m r2 = r9.mo7535b()
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r10)
            if (r2 != 0) goto L_0x0049
            androidx.compose.ui.text.font.m r2 = androidx.compose.p015ui.text.font.C1959m.f4411e
            int r4 = r10.compareTo(r2)
            if (r4 < 0) goto L_0x0049
            androidx.compose.ui.text.font.m r4 = r9.mo7535b()
            int r2 = r4.compareTo(r2)
            if (r2 >= 0) goto L_0x0049
            r2 = r0
            goto L_0x004a
        L_0x0049:
            r2 = r1
        L_0x004a:
            if (r7 != r0) goto L_0x004e
            r4 = r0
            goto L_0x004f
        L_0x004e:
            r4 = r1
        L_0x004f:
            r5 = 3
            if (r4 != 0) goto L_0x005c
            if (r7 != r5) goto L_0x0056
            r7 = r0
            goto L_0x0057
        L_0x0056:
            r7 = r1
        L_0x0057:
            if (r7 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r7 = r1
            goto L_0x005d
        L_0x005c:
            r7 = r0
        L_0x005d:
            if (r7 == 0) goto L_0x006c
            int r7 = r9.mo7536d()
            if (r11 != r7) goto L_0x0067
            r7 = r0
            goto L_0x0068
        L_0x0067:
            r7 = r1
        L_0x0068:
            if (r7 != 0) goto L_0x006c
            r7 = r0
            goto L_0x006d
        L_0x006c:
            r7 = r1
        L_0x006d:
            if (r7 != 0) goto L_0x0072
            if (r2 != 0) goto L_0x0072
            return r8
        L_0x0072:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r4 >= r6) goto L_0x0099
            if (r7 == 0) goto L_0x0083
            if (r11 != r0) goto L_0x007e
            r7 = r0
            goto L_0x007f
        L_0x007e:
            r7 = r1
        L_0x007f:
            if (r7 == 0) goto L_0x0083
            r7 = r0
            goto L_0x0084
        L_0x0083:
            r7 = r1
        L_0x0084:
            if (r7 == 0) goto L_0x008a
            if (r2 == 0) goto L_0x008a
            r0 = r5
            goto L_0x0092
        L_0x008a:
            if (r2 == 0) goto L_0x008d
            goto L_0x0092
        L_0x008d:
            if (r7 == 0) goto L_0x0091
            r0 = r3
            goto L_0x0092
        L_0x0091:
            r0 = r1
        L_0x0092:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r8, r0)
            goto L_0x00b9
        L_0x0099:
            if (r2 == 0) goto L_0x009e
            int r10 = r10.f4417b
            goto L_0x00a4
        L_0x009e:
            androidx.compose.ui.text.font.m r10 = r9.mo7535b()
            int r10 = r10.f4417b
        L_0x00a4:
            if (r7 == 0) goto L_0x00a9
            if (r11 != r0) goto L_0x00b0
            goto L_0x00b1
        L_0x00a9:
            int r7 = r9.mo7536d()
            if (r7 != r0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r0 = r1
        L_0x00b1:
            androidx.compose.ui.text.font.w r7 = androidx.compose.p015ui.text.font.C1971w.f4428a
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            android.graphics.Typeface r7 = r7.mo7588a(r8, r10, r0)
        L_0x00b9:
            java.lang.String r8 = "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }"
            kotlin.jvm.internal.C19383o.m32796f(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19543e0.m33327p0(int, java.lang.Object, androidx.compose.ui.text.font.f, androidx.compose.ui.text.font.m, int):java.lang.Object");
    }

    /* renamed from: q */
    public static String m33328q(C7686e eVar, C7623d dVar) {
        C7676c cVar = dVar.f16910a;
        C7686e eVar2 = dVar.f16912c;
        int i = 0;
        byte[] g = eVar.mo20127g(false);
        if (cVar != null) {
            byte[] j = C8212a.m16503j(g, cVar.f17024b.mo20111t(), cVar.f17025c.mo20111t(), eVar2.mo20127g(false));
            C7336h hVar = new C7336h(256);
            hVar.mo19525b(j, j.length);
            byte[] bArr = new byte[20];
            hVar.mo19522a(20, bArr);
            StringBuffer stringBuffer = new StringBuffer();
            while (i != 20) {
                if (i > 0) {
                    stringBuffer.append(MessageDraft.IMAGE_DELIMITER);
                }
                char[] cArr = C0114h.f188y;
                stringBuffer.append(cArr[(bArr[i] >>> 4) & 15]);
                stringBuffer.append(cArr[bArr[i] & 15]);
                i++;
            }
            return stringBuffer.toString();
        }
        C7336h hVar2 = new C7336h(256);
        hVar2.mo19525b(g, g.length);
        byte[] bArr2 = new byte[20];
        hVar2.mo19522a(20, bArr2);
        StringBuffer stringBuffer2 = new StringBuffer();
        while (i != 20) {
            if (i > 0) {
                stringBuffer2.append(MessageDraft.IMAGE_DELIMITER);
            }
            char[] cArr2 = C0114h.f188y;
            stringBuffer2.append(cArr2[(bArr2[i] >>> 4) & 15]);
            stringBuffer2.append(cArr2[bArr2[i] & 15]);
            i++;
        }
        return stringBuffer2.toString();
    }

    /* renamed from: q0 */
    public static final String m33329q0(C19340c cVar) {
        Object obj;
        if (cVar instanceof C19722g) {
            return cVar.toString();
        }
        try {
            obj = Result.m35480constructorimpl(cVar + '@' + m33300R(cVar));
        } catch (Throwable th) {
            obj = Result.m35480constructorimpl(C0761x.m1673J(th));
        }
        Throwable r2 = Result.m35483exceptionOrNullimpl(obj);
        String str = obj;
        if (r2 != null) {
            str = cVar.getClass().getName() + '@' + m33300R(cVar);
        }
        return (String) str;
    }

    /* renamed from: r */
    public static C7759g0 m33330r(C0041a aVar, C7623d dVar) {
        if (!(dVar instanceof C7621b)) {
            return new C7759g0(dVar.f16910a, dVar.f16912c, dVar.f16913d, dVar.f16914e, dVar.f16911b);
        }
        C7621b bVar = (C7621b) dVar;
        return new C7748b(m33332s(bVar.f16908f), bVar.f16910a, bVar.f16912c, bVar.f16913d, bVar.f16914e, bVar.f16911b);
    }

    /* renamed from: r0 */
    public static final C0754q m33331r0(C8352d dVar) {
        return new C0754q(dVar.f18320a, dVar.f18321b, dVar.f18322c, dVar.f18323d);
    }

    /* renamed from: s */
    public static C7959a m33332s(String str) {
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                return new C7959a(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        C7959a aVar = (C7959a) C7122c.f15863x.get(C8217e.m16510b(str));
        if (aVar == null) {
            aVar = (C7959a) C6720b.f14821H.get(C8217e.m16510b(str));
        }
        if (aVar == null) {
            aVar = (C7959a) C0039a.f91a.get(C8217e.m16509a(str));
        }
        if (aVar == null) {
            aVar = (C7959a) C6792a.f14972o.get(C8217e.m16510b(str));
        }
        if (aVar == null) {
            aVar = (C7959a) C8166a.f17924b.get(C8217e.m16510b(str));
        }
        if (aVar == null) {
            aVar = C8323b.m16619b(str);
        }
        return aVar == null ? (C7959a) C8452a.f18475c.get(C8217e.m16510b(str)) : aVar;
    }

    /* renamed from: s0 */
    public static final double m33333s0(long j) {
        return (((double) (j >>> 11)) * ((double) RecyclerView.C3084b0.FLAG_MOVED)) + ((double) (j & 2047));
    }

    /* renamed from: t */
    public static final void m33334t(C18982a aVar, C18984c cVar, String str) {
        C18985d.f42322j.getClass();
        Logger logger = C18985d.f42321i;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f42319f);
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C19383o.m32796f(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.f42311c);
        logger.fine(sb.toString());
    }

    /* renamed from: t0 */
    public static void m33335t0(C18823d dVar, StringBuilder sb) {
        char charAt = sb.charAt(0);
        int charAt2 = (sb.charAt(1) * '(') + (charAt * 1600) + sb.charAt(2) + 1;
        dVar.f41677e.append(new String(new char[]{(char) (charAt2 / 256), (char) (charAt2 % 256)}));
        sb.delete(0, 3);
    }

    /* renamed from: u */
    public static C1505c m33336u(C1505c cVar) {
        C1512i iVar = C17782b.f38633d;
        C1502a.C1503a aVar = C1502a.f3258b;
        C19383o.m32797g(cVar, "<this>");
        if (!C1504b.m3215a(cVar.f3266b, C1504b.f3260a)) {
            return cVar;
        }
        Rgb rgb = (Rgb) cVar;
        if (m33290F(rgb.f3246d, iVar)) {
            return cVar;
        }
        float[] c0 = m33310c0(m33345z(aVar.f3259a, rgb.f3246d.mo6315a(), iVar.mo6315a()), rgb.f3251i);
        return new Rgb(rgb.f3265a, rgb.f3250h, iVar, c0, rgb.f3253k, rgb.f3255m, rgb.f3247e, rgb.f3248f, rgb.f3249g, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33337u0(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            androidx.compose.p015ui.text.input.C1993m.m4379y(r0)
            kotlin.coroutines.c r7 = kotlin.jvm.internal.C19388s.m32873m0(r7)
            boolean r1 = r7 instanceof kotlinx.coroutines.internal.C19722g
            r2 = 0
            if (r1 == 0) goto L_0x0013
            kotlinx.coroutines.internal.g r7 = (kotlinx.coroutines.internal.C19722g) r7
            goto L_0x0014
        L_0x0013:
            r7 = r2
        L_0x0014:
            if (r7 != 0) goto L_0x001a
            kotlin.m r7 = kotlin.C19394m.f43287a
            goto L_0x008f
        L_0x001a:
            kotlinx.coroutines.CoroutineDispatcher r1 = r7.f43663e
            boolean r1 = r1.mo10805C0(r0)
            r3 = 1
            if (r1 == 0) goto L_0x002f
            kotlin.m r1 = kotlin.C19394m.f43287a
            r7.f43665g = r1
            r7.f43712d = r3
            kotlinx.coroutines.CoroutineDispatcher r1 = r7.f43663e
            r1.mo72075B0(r0, r7)
            goto L_0x008d
        L_0x002f:
            kotlinx.coroutines.f2 r1 = new kotlinx.coroutines.f2
            r1.<init>()
            kotlin.coroutines.CoroutineContext r0 = r0.plus(r1)
            kotlin.m r4 = kotlin.C19394m.f43287a
            r7.f43665g = r4
            r7.f43712d = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = r7.f43663e
            r5.mo72075B0(r0, r7)
            boolean r0 = r1.f43507b
            if (r0 == 0) goto L_0x008d
            kotlinx.coroutines.t0 r0 = kotlinx.coroutines.C19845z1.m33859a()
            kotlinx.coroutines.internal.a<kotlinx.coroutines.l0<?>> r1 = r0.f43824e
            r5 = 0
            if (r1 != 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            int r6 = r1.f43654b
            int r1 = r1.f43655c
            if (r6 != r1) goto L_0x0059
        L_0x0057:
            r1 = r3
            goto L_0x005a
        L_0x0059:
            r1 = r5
        L_0x005a:
            if (r1 == 0) goto L_0x005d
            goto L_0x007f
        L_0x005d:
            boolean r1 = r0.mo72660H0()
            if (r1 == 0) goto L_0x006b
            r7.f43665g = r4
            r7.f43712d = r3
            r0.mo72658F0(r7)
            goto L_0x0080
        L_0x006b:
            r0.mo72659G0(r3)
            r7.run()     // Catch:{ all -> 0x0078 }
        L_0x0071:
            boolean r1 = r0.mo72662J0()     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x0071
            goto L_0x007c
        L_0x0078:
            r1 = move-exception
            r7.mo72555e(r1, r2)     // Catch:{ all -> 0x0088 }
        L_0x007c:
            r0.mo72657E0(r3)
        L_0x007f:
            r3 = r5
        L_0x0080:
            if (r3 == 0) goto L_0x0085
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            goto L_0x008f
        L_0x0085:
            kotlin.m r7 = kotlin.C19394m.f43287a
            goto L_0x008f
        L_0x0088:
            r7 = move-exception
            r0.mo72657E0(r3)
            throw r7
        L_0x008d:
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
        L_0x008f:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r7 != r0) goto L_0x0094
            return r7
        L_0x0094:
            kotlin.m r7 = kotlin.C19394m.f43287a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19543e0.m33337u0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* renamed from: v */
    public static final Object[] m33338v(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* renamed from: v0 */
    public static String m33339v0(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", sb2.length() != 0 ? "Exception during lenientFormat for ".concat(sb2) : new String("Exception during lenientFormat for "), e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 9 + name2.length());
                    C0391c.m1061h(sb3, "<", sb2, " threw ", name2);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb4 = new StringBuilder((length * 16) + str.length());
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                sb4.append(str, i3, str.length());
            } else {
                sb4.append(str, i3, indexOf);
                sb4.append(objArr[i]);
                i3 = indexOf + 2;
                i++;
            }
        }
        sb4.append(str, i3, str.length());
        if (i < length2) {
            sb4.append(" [");
            sb4.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb4.append(", ");
                sb4.append(objArr[i4]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    /* renamed from: w */
    public static String m33340w(C7959a aVar) {
        String str = (String) C7122c.f15865z.get(aVar);
        if (str == null) {
            str = (String) C6720b.f14823J.get(aVar);
        }
        if (str == null) {
            str = (String) C0039a.f92b.get(aVar);
        }
        if (str == null) {
            str = (String) C6792a.f14974q.get(aVar);
        }
        if (str == null) {
            str = (String) C8166a.f17926d.get(aVar);
        }
        if (str == null) {
            str = C8323b.m16618a(aVar);
        }
        if (str == null) {
            str = (String) C8452a.f18477e.get(aVar);
        }
        return str == null ? (String) C7452a.f16657J.get(aVar) : str;
    }

    /* renamed from: w0 */
    public static boolean m33341w0(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    /* renamed from: x */
    public static X509Certificate m33342x(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        if (generateCertificate instanceof X509Certificate) {
            return (X509Certificate) generateCertificate;
        }
        StringBuilder h = C0072d.m201h("Not a X.509 certificate: ");
        h.append(generateCertificate.getType());
        throw new CertificateException(h.toString());
    }

    /* renamed from: x0 */
    public static boolean m33343x0(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6) {
            if (i2 != 6 && i2 != 5) {
                return true;
            }
            i = 6;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* renamed from: y */
    public static void m33344y(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: z */
    public static final float[] m33345z(float[] fArr, float[] fArr2, float[] fArr3) {
        C19383o.m32797g(fArr, "matrix");
        m33312e0(fArr, fArr2);
        m33312e0(fArr, fArr3);
        return m33310c0(m33305X(fArr), m33311d0(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    /* renamed from: L */
    public int mo70277L(StringBuilder sb, char c) {
        if (c == ' ') {
            sb.append(3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c < ' ') {
            sb.append(0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append(1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append(1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append(1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return mo70277L(sb, (char) (c - 128)) + 2;
        } else {
            sb.append(2);
            sb.append((char) (c - '`'));
            return 2;
        }
    }

    /* renamed from: Q */
    public int mo70278Q() {
        return 1;
    }

    /* renamed from: W */
    public void mo70279W(C18823d dVar, StringBuilder sb) {
        int length = sb.length() % 3;
        int a = dVar.mo70268a() + ((sb.length() / 3) << 1);
        dVar.mo70271d(a);
        int i = dVar.f41680h.f41688b - a;
        if (length == 2) {
            sb.append(0);
            while (sb.length() >= 3) {
                m33335t0(dVar, sb);
            }
            if (dVar.mo70270c()) {
                dVar.mo70272e(254);
            }
        } else if (i == 1 && length == 1) {
            while (sb.length() >= 3) {
                m33335t0(dVar, sb);
            }
            if (dVar.mo70270c()) {
                dVar.mo70272e(254);
            }
            dVar.f41678f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                m33335t0(dVar, sb);
            }
            if (i > 0 || dVar.mo70270c()) {
                dVar.mo70272e(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        dVar.f41679g = 0;
    }

    /* renamed from: a */
    public void mo45793a(C18823d dVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!dVar.mo70270c()) {
                break;
            }
            char b = dVar.mo70269b();
            dVar.f41678f++;
            int L = mo70277L(sb, b);
            int a = dVar.mo70268a() + ((sb.length() / 3) << 1);
            dVar.mo70271d(a);
            int i = dVar.f41680h.f41688b - a;
            if (!dVar.mo70270c()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    int length = sb.length();
                    sb.delete(length - L, length);
                    dVar.f41678f--;
                    L = mo70277L(sb2, dVar.mo70269b());
                    dVar.f41680h = null;
                }
                while (sb.length() % 3 == 1 && ((L <= 3 && i != 1) || L > 3)) {
                    int length2 = sb.length();
                    sb.delete(length2 - L, length2);
                    dVar.f41678f--;
                    L = mo70277L(sb2, dVar.mo70269b());
                    dVar.f41680h = null;
                }
            } else if (sb.length() % 3 == 0) {
                if (C0761x.m1745t0(dVar.f41678f, mo70278Q(), dVar.f41673a) != mo70278Q()) {
                    dVar.f41679g = 0;
                    break;
                }
            }
        }
        mo70279W(dVar, sb);
    }

    public Object apply(Object obj) {
        C14172a aVar = (C14172a) obj;
        aVar.getClass();
        C18600p pVar = C18588d.f41058a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            pVar.mo70111a(byteArrayOutputStream, aVar);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: c */
    public void mo47680c() {
    }

    /* renamed from: d */
    public boolean mo4158d(ClassLoader classLoader, File file, File file2, boolean z) {
        return C15099u.m24634g(classLoader, file, file2, z, new C0114h(), ResponseConstants.PATH, new C13423m());
    }

    /* renamed from: e */
    public void mo4159e(ClassLoader classLoader, HashSet hashSet) {
        C14921a0.m24234a(classLoader, hashSet, new C20203a());
    }

    /* renamed from: f */
    public int mo47681f(long j) {
        return 0;
    }

    /* renamed from: g */
    public C1436d mo4116g(C1436d dVar, C1432b bVar) {
        C19383o.m32797g(dVar, "<this>");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new C0731e(bVar, false));
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo1133h(Object obj) {
        ChangePaymentMethodFragment changePaymentMethodFragment = (ChangePaymentMethodFragment) obj;
    }

    /* renamed from: i */
    public Object mo1134i() {
        return new TreeMap();
    }

    public boolean isReady() {
        return true;
    }

    /* renamed from: j */
    public int mo47683j(C17948m0 m0Var, DecoderInputBuffer decoderInputBuffer, int i) {
        decoderInputBuffer.f39937b = 4;
        return -4;
    }

    /* renamed from: k */
    public ArrayList mo19k(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        FragmentNavigationKey fragmentNavigationKey2 = fragmentNavigationKey;
        C19383o.m32797g(fragmentNavigationKey2, "key");
        ArrayList arrayList = new ArrayList();
        if (fragmentNavigationKey2 instanceof ShopSectionListingsKey) {
            if (!z) {
                arrayList.add(new HomePagerKey(fragmentNavigationKey.getReferrer(), (Bundle) null, false, 6, (DefaultConstructorMarker) null));
                arrayList.add(new ShopHomeKey(fragmentNavigationKey.getReferrer(), new EtsyId(((ShopSectionListingsKey) fragmentNavigationKey2).getShopId()), (ShopHomeConfig) null, (Map) null, (String) null, (String) null, (EtsyId) null, false, (String) null, (Bundle) null, 1020, (DefaultConstructorMarker) null));
            }
            arrayList.add(fragmentNavigationKey2);
            return arrayList;
        }
        throw new UnsupportedNavigationException("Invalid key " + fragmentNavigationKey2 + " provided to " + this);
    }

    /* renamed from: o */
    public int mo21o() {
        return R.id.menu_bottom_nav_home;
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Long.valueOf(C14720l8.f32933c.zza().zzd());
    }
}
