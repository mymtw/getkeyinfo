package p001a0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p013v4.media.C0069a;
import android.text.format.DateUtils;
import android.util.Log;
import androidx.activity.C0114h;
import androidx.compose.material.C1168b0;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.layout.C1694l0;
import androidx.compose.p015ui.layout.C1698n0;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.font.C1960n;
import androidx.compose.p015ui.text.font.C1967s;
import androidx.compose.p015ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.C1296b;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1324g;
import androidx.compose.runtime.ComposerImpl;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6177d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6194p;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6195q;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6202v;
import com.etsy.android.R;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ReviewImage;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.favorites.search.FavoriteSearchAnalytics;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.collagecompose.C12158i;
import com.etsy.collagecompose.C12159j;
import com.etsy.collagecompose.C12160k;
import com.etsy.collagecompose.ColorsKt;
import com.etsy.collagecompose.DimensKt;
import com.etsy.collagecompose.TypographyKt;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentData;
import com.google.android.play.core.internal.C15689e;
import com.google.android.play.core.internal.zzab;
import com.google.android.play.core.review.C15736c;
import com.google.android.play.core.review.C15739f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlin.text.C19456j;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import kotlin.text.Regex;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19838x1;
import kotlinx.coroutines.internal.C19736t;
import okhttp3.C20009t;
import okhttp3.TlsVersion;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.C14138b;
import p081d6.C6662a;
import p129h7.C6958a;
import p141i7.C6996a;
import p161k6.C7199b;
import p162k7.C7206a;
import p171l7.C7277c;
import p173m.C7279a;
import p174m0.C7284d;
import p179m5.C7336h;
import p181m7.C7339a;
import p181m7.C7346h;
import p181m7.C7347i;
import p181m7.C7348j;
import p181m7.C7349k;
import p181m7.C7351m;
import p223r5.C7766m;
import p223r5.C7770q;
import p244t5.C7959a;
import p244t5.C7964b0;
import p244t5.C8027v1;
import p267v7.C8212a;
import p267v7.C8217e;
import p288y.C8343c;
import p288y.C8345d;
import p288y.C8347f;
import p309ad.C8509e;
import p338df.C12654e;
import p343ee.C12693a;
import p365hg.C12869i0;
import p378jg.C12981a;
import p378jg.C12985e;
import p387la.C13005a;
import p393lg.C13022a;
import p401mg.C13080a;
import p415of.C13184m;
import p415of.C13185n;
import p415of.C13186o;
import p416og.C13192a;
import p453tf.C13418j;
import p453tf.C13426p;
import p453tf.C13442y;
import p568fn.C17782b;
import p628nj.C18263b;
import p634np.C18290b;
import p747hr.C19084h;
import retrofit2.C20145v;

/* renamed from: a0.b */
public final class C0005b implements C18290b, C1698n0, C1967s, C15689e, C8509e, C12693a, FeatureManager.C12256a {

    /* renamed from: b */
    public static final int[] f4b = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};

    /* renamed from: c */
    public static final int[] f5c = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};

    /* renamed from: d */
    public static final int[] f6d = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};

    /* renamed from: e */
    public static final int[] f7e = {16842755, 16843781};

    /* renamed from: f */
    public static final C0005b f8f = new C0005b();

    /* renamed from: g */
    public static SharedPreferences f9g;

    /* renamed from: h */
    public static final /* synthetic */ C0005b f10h = new C0005b();

    /* renamed from: i */
    public static Context f11i;

    /* renamed from: j */
    public static final C0005b f12j = new C0005b();

    /* renamed from: k */
    public static final int[] f13k = {R.attr.buttonSize, R.attr.colorScheme, R.attr.scopeUris};

    /* renamed from: l */
    public static final C0005b f14l = new C0005b();

    /* renamed from: m */
    public static final C19736t f15m = new C19736t("REMOVED_TASK");

    /* renamed from: n */
    public static final C19736t f16n = new C19736t("CLOSED_EMPTY");

    /* renamed from: o */
    public static final int[] f17o = {R.attr.alignmentMode, R.attr.columnCount, R.attr.columnOrderPreserved, R.attr.orientation, R.attr.rowCount, R.attr.rowOrderPreserved, R.attr.useDefaultMargins};

    /* renamed from: p */
    public static final int[] f18p = {16842996, 16842997, 16842998, 16842999, 16843000, 16843001, 16843002, R.attr.layout_column, R.attr.layout_columnSpan, R.attr.layout_columnWeight, R.attr.layout_gravity, R.attr.layout_row, R.attr.layout_rowSpan, R.attr.layout_rowWeight};

    /* renamed from: A */
    public static final int m7A(ArrayList arrayList, int i, int i2) {
        int n0 = m51n0(arrayList, i, i2);
        return n0 >= 0 ? n0 : -(n0 + 1);
    }

    /* renamed from: B */
    public static final int m8B(int i, int[] iArr) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    /* renamed from: C */
    public static final int m9C(int i, int[] iArr) {
        int i2 = i * 5;
        return m27U(iArr[i2 + 1] >> 30) + iArr[i2 + 4];
    }

    /* renamed from: D */
    public static final Object[] m10D(int i, Object[] objArr) {
        Object[] objArr2 = new Object[(objArr.length - 2)];
        C19318k.m32605W0(objArr, objArr2, 0, 0, i, 6);
        C19318k.m32603U0(objArr, i, objArr2, i + 2, objArr.length);
        return objArr2;
    }

    /* renamed from: E */
    public static final Object[] m11E(int i, Object[] objArr) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        C19318k.m32605W0(objArr, objArr2, 0, 0, i, 6);
        C19318k.m32603U0(objArr, i, objArr2, i + 1, objArr.length);
        return objArr2;
    }

    /* renamed from: F */
    public static final int m12F(int i, int[] iArr) {
        int i2 = i * 5;
        return m27U(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    /* renamed from: G */
    public static final void m13G(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
            iArr[(i * 5) + 3] = i2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: H */
    public static final void m14H(int i, int i2, int[] iArr) {
        if (i2 >= 0 && i2 < 67108863) {
            int i3 = (i * 5) + 1;
            iArr[i3] = i2 | (iArr[i3] & -67108864);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: I */
    public static final C1436d m15I(C1436d dVar, float f) {
        C19383o.m32797g(dVar, "<this>");
        return !((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ? C19388s.m32869k0(dVar, 0.0f, 0.0f, f, 0.0f, 0.0f, (C1530k0) null, true, 61435) : dVar;
    }

    /* renamed from: J */
    public static int m16J(C14138b bVar, boolean z) {
        int i = z ? bVar.f31151c : bVar.f31150b;
        int i2 = z ? bVar.f31150b : bVar.f31151c;
        byte[][] bArr = bVar.f31149a;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b2 = z ? bArr[i4][i6] : bArr[i6][i4];
                if (b2 == b) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 = C0069a.m171b(i5, -5, 3, i3);
                    }
                    i5 = 1;
                    b = b2;
                }
            }
            if (i5 >= 5) {
                i3 = C0069a.m171b(i5, -5, 3, i3);
            }
        }
        return i3;
    }

    /* renamed from: K */
    public static final boolean m17K(C13185n nVar) {
        boolean z;
        List<? extends C13184m> listSections = nVar.getListSections();
        C19383o.m32796f(listSections, "listSections");
        if (!listSections.isEmpty()) {
            for (C13184m mVar : listSections) {
                C19383o.m32796f(mVar, "it");
                List<C13186o> items = mVar.getItems();
                C19383o.m32796f(items, "this.items");
                if (!items.isEmpty()) {
                    Iterator<T> it = items.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!(((C13186o) it.next()) instanceof ListingCard)) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = true;
                continue;
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: L */
    public static String m18L(BigInteger bigInteger, C7766m mVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String str = C8217e.f18044a;
        stringBuffer.append("GOST3410");
        stringBuffer.append(" Public Key [");
        stringBuffer.append(m57r(bigInteger, mVar));
        stringBuffer.append("]");
        stringBuffer.append(str);
        stringBuffer.append("                 Y: ");
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* renamed from: M */
    public static ReviewImage m19M(ReviewUiModel reviewUiModel, boolean z) {
        C19383o.m32797g(reviewUiModel, "review");
        ArrayList arrayList = new ArrayList();
        String listingImageSmallUrl = reviewUiModel.getListingImageSmallUrl();
        if (listingImageSmallUrl != null) {
            arrayList.add(listingImageSmallUrl);
        }
        ReviewImage reviewImage = new ReviewImage();
        String buyerAvatarUrl = reviewUiModel.getBuyerAvatarUrl();
        String str = "";
        if (buyerAvatarUrl == null) {
            buyerAvatarUrl = str;
        }
        reviewImage.setBuyerAvatarUrl(buyerAvatarUrl);
        String buyerDisplayName = reviewUiModel.getBuyerDisplayName();
        if (buyerDisplayName == null) {
            buyerDisplayName = str;
        }
        reviewImage.setBuyerName(buyerDisplayName);
        String buyerProfileUrl = reviewUiModel.getBuyerProfileUrl();
        if (buyerProfileUrl == null) {
            buyerProfileUrl = str;
        }
        reviewImage.setBuyerProfileUrl(buyerProfileUrl);
        String review = reviewUiModel.getReview();
        if (review != null) {
            str = review;
        }
        reviewImage.setReviewText(str);
        reviewImage.setTranslatedReview(reviewUiModel.getTranslatedReview());
        reviewImage.setTranslationState(reviewUiModel.getTranslationState());
        Float rating = reviewUiModel.getRating();
        String str2 = null;
        reviewImage.setReviewRating(rating != null ? Integer.valueOf((int) rating.floatValue()) : null);
        Date createdDate = reviewUiModel.getCreatedDate();
        if (createdDate != null) {
            reviewImage.setCreateDate(createdDate);
        }
        Image image = new Image();
        AppreciationPhoto appreciationPhoto = reviewUiModel.getAppreciationPhoto();
        if (appreciationPhoto != null) {
            str2 = appreciationPhoto.getUrlFullxfull();
        }
        image.setUrl(str2);
        reviewImage.setImage(image);
        Long listingId = reviewUiModel.getListingId();
        if (listingId != null) {
            reviewImage.setListingId(new EtsyId(listingId.longValue()));
        }
        reviewImage.setListingTitle(reviewUiModel.getListingTitle());
        reviewImage.setListingImages(arrayList);
        reviewImage.setListingOnly(z);
        return reviewImage;
    }

    /* renamed from: N */
    public static void m20N(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: O */
    public static void m21O(int i, int i2, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, 0, Integer.valueOf(i2)}));
        } else if (i > i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, 0, Integer.valueOf(i2)}));
        }
    }

    /* renamed from: P */
    public static void m22P(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: Q */
    public static final void m23Q(TypedArray typedArray, int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    /* renamed from: R */
    public static void m24R(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: S */
    public static void m25S(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: T */
    public static final long m26T(int i, long j) {
        int i2 = C2022r.f4596c;
        int i3 = (int) (j >> 32);
        int M = C19388s.m32833M(i3, 0, i);
        int M2 = C19388s.m32833M(C2022r.m4464c(j), 0, i);
        return (M == i3 && M2 == C2022r.m4464c(j)) ? j : m47l(M, M2);
    }

    /* renamed from: U */
    public static final int m27U(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: V */
    public static C15736c m28V(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new C15736c(new C15739f(context));
    }

    /* renamed from: W */
    public static Typeface m29W(String str, C1959m mVar, int i) {
        boolean z = true;
        if ((i == 0) && C19383o.m32792b(mVar, C1959m.f4413g)) {
            if (str == null || str.length() == 0) {
                Typeface typeface = Typeface.DEFAULT;
                C19383o.m32796f(typeface, "DEFAULT");
                return typeface;
            }
        }
        Typeface create = str == null ? Typeface.DEFAULT : Typeface.create(str, 0);
        int i2 = mVar.f4417b;
        if (i != 1) {
            z = false;
        }
        Typeface a = Typeface.create(create, i2, z);
        C19383o.m32796f(a, "create(\n            fami…ontStyle.Italic\n        )");
        return a;
    }

    /* renamed from: X */
    public static final long m30X(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }

    /* renamed from: Y */
    public static C1168b0 m31Y(C1302d dVar) {
        dVar.mo5465u(380403812);
        float f = (float) 6;
        float f2 = (float) 12;
        float f3 = (float) 8;
        float f4 = (float) 8;
        Object[] objArr = {new C7284d(f), new C7284d(f2), new C7284d(f3), new C7284d(f4)};
        dVar.mo5465u(-568225417);
        boolean z = false;
        for (int i = 0; i < 4; i++) {
            z |= dVar.mo5408I(objArr[i]);
        }
        Object v = dVar.mo5467v();
        if (z || v == C1302d.C1303a.f2828a) {
            v = new C1168b0(f, f2, f3, f4);
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        C1168b0 b0Var = (C1168b0) v;
        dVar.mo5406H();
        return b0Var;
    }

    /* renamed from: Z */
    public static final void m32Z(C20009t.C20010a aVar) {
        try {
            SSLContext instance = SSLContext.getInstance(TlsVersion.TLS_1_2.javaName());
            X509TrustManager n = new C19084h().mo70569n();
            instance.init((KeyManager[]) null, (TrustManager[]) new X509TrustManager[]{n}, (SecureRandom) null);
            SSLSocketFactory socketFactory = instance.getSocketFactory();
            C19383o.m32796f(socketFactory, "sslContext.socketFactory");
            aVar.mo72996d(new C13005a(socketFactory), n);
        } catch (Exception e) {
            LogCatKt.m17045a().mo21309d("Error enabling TLS 1.2 for OkHttpClient.Builder.", e);
        }
    }

    /* renamed from: a0 */
    public static final Map m33a0(Boolean bool) {
        return C19383o.m32792b(bool, Boolean.TRUE) ? C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.CLUSTER_SOURCE, FavoriteSearchAnalytics.CLUSTER_FROM_FAVS_COLLECTION.getAnalyticsId())) : C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.CLUSTER_SOURCE, FavoriteSearchAnalytics.CLUSTER_FROM_FAVS_LANDING.getAnalyticsId()));
    }

    /* renamed from: b0 */
    public static final ColorStateList m34b0(TypedArray typedArray, int i) {
        C19383o.m32797g(typedArray, "<this>");
        m23Q(typedArray, i);
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    /* renamed from: c0 */
    public static C12158i m35c0(C1302d dVar) {
        return (C12158i) dVar.mo5410J(ColorsKt.f27041n);
    }

    /* renamed from: d0 */
    public static C12159j m36d0(C1302d dVar) {
        return (C12159j) dVar.mo5410J(DimensKt.f27051e);
    }

    /* renamed from: e0 */
    public static final Map m37e0(C12654e eVar) {
        return C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(eVar.f27908a)), new Pair(PredefinedAnalyticsProperty.CONTENT_SOURCE, eVar.f27910c));
    }

    /* renamed from: f0 */
    public static SharedPreferences m38f0(Context context) {
        SharedPreferences sharedPreferences = f9g;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("EtsyUserPrefs", 0);
        C19383o.m32796f(sharedPreferences2, "context.getSharedPrefere…ODE_PRIVATE\n            )");
        f9g = sharedPreferences2;
        return sharedPreferences2;
    }

    /* renamed from: g0 */
    public static CharSequence m39g0(long j) {
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        instance.setTimeInMillis(j);
        int i = instance.get(1);
        instance.setTimeInMillis(System.currentTimeMillis());
        CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(j, System.currentTimeMillis(), org.apache.commons.lang3.time.DateUtils.MILLIS_PER_MINUTE, i == instance.get(1) ? 65560 : 65556);
        C19383o.m32796f(relativeTimeSpanString, "getRelativeTimeSpanStrin…H\n            }\n        )");
        return relativeTimeSpanString;
    }

    /* renamed from: h */
    public static final C8345d m40h(long j, long j2) {
        return new C8345d(C8343c.m16642c(j), C8343c.m16643d(j), C8347f.m16656d(j2) + C8343c.m16642c(j), C8347f.m16654b(j2) + C8343c.m16643d(j));
    }

    /* renamed from: h0 */
    public static C12160k m41h0(C1302d dVar) {
        return (C12160k) dVar.mo5410J(TypographyKt.f27060a);
    }

    /* renamed from: i */
    public static final long m42i(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & UnsignedInteger.INT_MASK) | (floatToIntBits << 32);
        int i = C1694l0.f3731b;
        return floatToIntBits2;
    }

    /* renamed from: i0 */
    public static final boolean m43i0(C13185n nVar) {
        List<? extends C13184m> listSections = nVar.getListSections();
        C19383o.m32796f(listSections, "listSections");
        if (!listSections.isEmpty()) {
            for (C13184m mVar : listSections) {
                C19383o.m32796f(mVar, "it");
                List<C13186o> items = mVar.getItems();
                C19383o.m32796f(items, "this.items");
                ArrayList arrayList = new ArrayList();
                for (T next : items) {
                    if (next instanceof Collection) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public static C19838x1 m44j() {
        return new C19838x1((C19699g1) null);
    }

    /* renamed from: j0 */
    public static final void m45j0() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    /* renamed from: k0 */
    public static final Integer m46k0(C20145v vVar) {
        C19383o.m32797g(vVar, "<this>");
        String a = vVar.f44614a.f44367h.mo72948a("X-Total-Count");
        if (a != null) {
            return C19456j.m33016T0(a);
        }
        return null;
    }

    /* renamed from: l */
    public static final long m47l(int i, int i2) {
        boolean z = true;
        if (i >= 0) {
            if (i2 < 0) {
                z = false;
            }
            if (z) {
                long j = (((long) i2) & UnsignedInteger.INT_MASK) | (((long) i) << 32);
                int i3 = C2022r.f4596c;
                return j;
            }
            throw new IllegalArgumentException(("end cannot negative. [end: " + i2 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ']').toString());
    }

    /* renamed from: l0 */
    public static final String m48l0(C20145v vVar) {
        C19383o.m32797g(vVar, "<this>");
        String a = vVar.f44614a.f44367h.mo72948a("Link");
        if (C18263b.m30837c0(a) && C19459m.m33036e1(a, "rel=\"next\"", false)) {
            String E1 = C19459m.m33032E1(C19459m.m33030C1(a, "<", ""), ">", "");
            if (C19457k.m33020X0(E1)) {
                return null;
            }
            return E1;
        }
        return null;
    }

    /* renamed from: m */
    public static C6662a m49m(C7770q qVar, C8027v1 v1Var) {
        C7770q qVar2 = qVar;
        if (qVar2 instanceof C6996a) {
            C6996a aVar = (C6996a) qVar2;
            return new C6662a(C7277c.m13938b(aVar.f15537b), new C7964b0(C8212a.m16504k(aVar.f15538c)), v1Var, (byte[]) null);
        } else if (qVar2 instanceof C7206a) {
            C7206a aVar2 = (C7206a) qVar2;
            return new C6662a(new C7199b(C7339a.f16302d, new C7346h(C7277c.m13939c(aVar2.f15251b))), new C7964b0(C8212a.m16504k(aVar2.f16002c)), (C8027v1) null, (byte[]) null);
        } else {
            if (qVar2 instanceof C6958a) {
                C7199b bVar = new C7199b(C7339a.f16303e);
                short[] l = C8212a.m16505l(((C6958a) qVar2).f15441b);
                byte[] bArr = new byte[(l.length * 2)];
                for (int i = 0; i != l.length; i++) {
                    short s = l[i];
                    int i2 = i * 2;
                    bArr[i2] = (byte) s;
                    bArr[i2 + 1] = (byte) (s >>> 8);
                }
                return new C6662a(bVar, new C7964b0(bArr), (C8027v1) null, (byte[]) null);
            } else if (qVar2 instanceof C6202v) {
                C6202v vVar = (C6202v) qVar2;
                C7199b bVar2 = new C7199b(C7339a.f16304f, new C7347i(vVar.f13505c.f13501c, C7277c.m13941e((String) vVar.f17194b)));
                byte[] a = vVar.mo17546a();
                int a2 = vVar.f13505c.mo17541a();
                int i3 = vVar.f13505c.f13501c;
                int a3 = (int) C6177d.m12375a(4, a);
                if (C6177d.m12378d(i3, (long) a3)) {
                    byte[] h = C6177d.m12382h(4, a2, a);
                    int i4 = a2 + 4;
                    byte[] h2 = C6177d.m12382h(i4, a2, a);
                    int i5 = i4 + a2;
                    byte[] h3 = C6177d.m12382h(i5, a2, a);
                    int i6 = i5 + a2;
                    byte[] h4 = C6177d.m12382h(i6, a2, a);
                    int i7 = i6 + a2;
                    return new C6662a(bVar2, new C7351m(a3, h, h2, h3, h4, C6177d.m12382h(i7, a.length - i7, a)), (C8027v1) null, (byte[]) null);
                }
                throw new IllegalArgumentException("index out of bounds");
            } else if (qVar2 instanceof C6195q) {
                C6195q qVar3 = (C6195q) qVar2;
                C7959a aVar3 = C7339a.f16305g;
                C6194p pVar = qVar3.f13478c;
                C7199b bVar3 = new C7199b(aVar3, new C7348j(pVar.f13476c, pVar.f13477d, C7277c.m13941e((String) qVar3.f17177b)));
                byte[] a4 = qVar3.mo17539a();
                int a5 = qVar3.f13478c.mo17538a();
                int i8 = qVar3.f13478c.f13476c;
                int i9 = (i8 + 7) / 8;
                int a6 = (int) C6177d.m12375a(i9, a4);
                if (C6177d.m12378d(i8, (long) a6)) {
                    int i10 = i9 + 0;
                    byte[] h5 = C6177d.m12382h(i10, a5, a4);
                    int i11 = i10 + a5;
                    byte[] h6 = C6177d.m12382h(i11, a5, a4);
                    int i12 = i11 + a5;
                    byte[] h7 = C6177d.m12382h(i12, a5, a4);
                    int i13 = i12 + a5;
                    byte[] h8 = C6177d.m12382h(i13, a5, a4);
                    int i14 = i13 + a5;
                    return new C6662a(bVar3, new C7349k(a6, h5, h6, h7, h8, C6177d.m12382h(i14, a4.length - i14, a4)), (C8027v1) null, (byte[]) null);
                }
                throw new IllegalArgumentException("index out of bounds");
            } else {
                throw new IOException("key parameters not recognized");
            }
        }
    }

    /* renamed from: m0 */
    public static final C1324g m50m0(C1302d dVar) {
        dVar.mo5465u(-1165786124);
        ComposerImpl.C1277b F = dVar.mo5402F();
        dVar.mo5406H();
        return F;
    }

    /* renamed from: n0 */
    public static final int m51n0(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((C1296b) arrayList.get(i4)).f2800a;
            if (i5 < 0) {
                i5 += i2;
            }
            int i6 = C19383o.m32799i(i5, i);
            if (i6 < 0) {
                i3 = i4 + 1;
            } else if (i6 <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* renamed from: o0 */
    public static final boolean m52o0(C10813l lVar) {
        C19383o.m32797g(lVar, "<this>");
        if (!(lVar instanceof C10813l.C10814a) && !(lVar instanceof C10813l.C10815b) && !(lVar instanceof C10813l.C10816c) && !(lVar instanceof C10813l.C10819f) && !(lVar instanceof C10813l.C10821h) && !(lVar instanceof C10813l.C10825l) && !(lVar instanceof C10813l.C10820g) && !(lVar instanceof C10813l.C10830q) && !(lVar instanceof C10813l.C10831r) && !(lVar instanceof C10813l.C10833t)) {
            if (lVar instanceof C10813l.C10832s) {
                return false;
            }
            if (!(lVar instanceof C10813l.C10818e)) {
                if (lVar instanceof C10813l.C10826m) {
                    return false;
                }
                if (!(lVar instanceof C10813l.C10827n) && !(lVar instanceof C10813l.C10828o)) {
                    if (lVar instanceof C10813l.C10817d) {
                        return false;
                    }
                    if (!(lVar instanceof C10813l.C10824k)) {
                        if (lVar instanceof C10813l.C10829p) {
                            return false;
                        }
                        if (!(lVar instanceof C10813l.C10822i) && !(lVar instanceof C10813l.C10823j)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: p */
    public static String m53p(BigInteger bigInteger, C7766m mVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String str = C8217e.f18044a;
        BigInteger modPow = mVar.f17197c.modPow(bigInteger, mVar.f17195a);
        stringBuffer.append("GOST3410");
        stringBuffer.append(" Private Key [");
        stringBuffer.append(m57r(modPow, mVar));
        stringBuffer.append("]");
        stringBuffer.append(str);
        stringBuffer.append("                  Y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* renamed from: p0 */
    public static final long m54p0(long j, long j2) {
        float d = C8347f.m16656d(j);
        long j3 = C1694l0.f3730a;
        boolean z = true;
        if (j2 != j3) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * d;
            float b = C8347f.m16654b(j);
            if (j2 == j3) {
                z = false;
            }
            if (z) {
                return C0114h.m319t(intBitsToFloat, Float.intBitsToFloat((int) (j2 & UnsignedInteger.INT_MASK)) * b);
            }
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    /* renamed from: q */
    public static boolean m55q(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a = curve.getA();
        BigInteger b = curve.getB();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        return bigInteger2.pow(2).mod(p).equals(bigInteger.pow(3).add(a.multiply(bigInteger)).add(b).mod(p));
    }

    /* renamed from: q0 */
    public static String m56q0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: r */
    public static String m57r(BigInteger bigInteger, C7766m mVar) {
        byte[] i = C8212a.m16502i(bigInteger.toByteArray(), mVar.f17195a.toByteArray(), mVar.f17197c.toByteArray());
        C7336h hVar = new C7336h(256);
        hVar.mo19525b(i, i.length);
        byte[] bArr = new byte[20];
        hVar.mo19522a(20, bArr);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 != 20; i2++) {
            if (i2 > 0) {
                stringBuffer.append(MessageDraft.IMAGE_DELIMITER);
            }
            char[] cArr = C0114h.f188y;
            stringBuffer.append(cArr[(bArr[i2] >>> 4) & 15]);
            stringBuffer.append(cArr[bArr[i2] & 15]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: r0 */
    public static String m58r0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: s */
    public static final boolean m59s(int i, int[] iArr) {
        return (iArr[(i * 5) + 1] & 67108864) != 0;
    }

    /* renamed from: s0 */
    public static final void m60s0(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    /* renamed from: t */
    public static final int m61t(int i, int[] iArr) {
        return iArr[(i * 5) + 4];
    }

    /* renamed from: t0 */
    public static void m62t0(String str) {
        if (Log.isLoggable("FirebaseAppIndex", 3) ? true : Log.isLoggable("FirebaseAppIndex", 3)) {
            Log.d("FirebaseAppIndex", str);
        }
    }

    /* renamed from: u */
    public static final int m63u(int i, int[] iArr) {
        return iArr[(i * 5) + 3];
    }

    /* renamed from: u0 */
    public static boolean m64u0(byte b) {
        return b > -65;
    }

    /* renamed from: v */
    public static final boolean m65v(int i, int[] iArr) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    /* renamed from: w */
    public static final boolean m66w(int i, int[] iArr) {
        return (iArr[(i * 5) + 1] & 536870912) != 0;
    }

    /* renamed from: x */
    public static final Object[] m67x(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[(objArr.length + 2)];
        C19318k.m32605W0(objArr, objArr2, 0, 0, i, 6);
        C19318k.m32603U0(objArr, i + 2, objArr2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* renamed from: y */
    public static final boolean m68y(int i, int[] iArr) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    /* renamed from: z */
    public static final void m69z(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        long t0 = C0114h.m320t0(layoutNode.f3800D);
        int l = C7279a.m13954l(C8343c.m16642c(t0));
        int l2 = C7279a.m13954l(C8343c.m16643d(t0));
        androidViewHolder.layout(l, l2, androidViewHolder.getMeasuredWidth() + l, androidViewHolder.getMeasuredHeight() + l2);
    }

    /* renamed from: a */
    public void mo12a(C1698n0.C1699a aVar) {
        C19383o.m32797g(aVar, "slotIds");
        aVar.clear();
    }

    /* renamed from: b */
    public Typeface mo13b(C1960n nVar, C1959m mVar, int i) {
        C19383o.m32797g(nVar, "name");
        C19383o.m32797g(mVar, "fontWeight");
        return m29W(nVar.f4418c, mVar, i);
    }

    /* renamed from: c */
    public boolean mo14c(String str) {
        if (str != null) {
            return new Regex("\\d{5}").matches(str);
        }
        return false;
    }

    /* renamed from: d */
    public Object mo15d(IBinder iBinder) {
        return zzab.zzb(iBinder);
    }

    /* renamed from: e */
    public int mo16e() {
        return 5;
    }

    /* renamed from: f */
    public Typeface mo17f(C1959m mVar, int i) {
        C19383o.m32797g(mVar, "fontWeight");
        return m29W((String) null, mVar, i);
    }

    /* renamed from: g */
    public boolean mo18g(Object obj, Object obj2) {
        return false;
    }

    /* renamed from: k */
    public ArrayList mo19k(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        C19383o.m32797g(fragmentNavigationKey, "key");
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add(new HomePagerKey(fragmentNavigationKey.getReferrer(), (Bundle) null, false, 6, (DefaultConstructorMarker) null));
        }
        arrayList.add(fragmentNavigationKey);
        return arrayList;
    }

    /* renamed from: n */
    public void mo20n(boolean z) {
        File[] fileArr;
        if (z) {
            synchronized (C13022a.f28677d) {
                String str = C13418j.f29381a;
                if (C13442y.m21140c()) {
                    C13022a.C13023a.m20734a();
                }
                if (C13022a.f28676c != null) {
                    Log.w(C13022a.f28675b, "Already enabled!");
                } else {
                    C13022a aVar = new C13022a(Thread.getDefaultUncaughtExceptionHandler());
                    C13022a.f28676c = aVar;
                    Thread.setDefaultUncaughtExceptionHandler(aVar);
                }
            }
            if (FeatureManager.m20100c(FeatureManager.Feature.CrashShield)) {
                C19421p.f43319i = true;
                if (C13442y.m21140c() && !C12869i0.m20587z()) {
                    File X = C17782b.m29858X();
                    if (X == null || (fileArr = X.listFiles(C12985e.f28598a)) == null) {
                        fileArr = new File[0];
                    }
                    ArrayList arrayList = new ArrayList();
                    for (File file : fileArr) {
                        C19383o.m32797g(file, ResponseConstants.FILE);
                        InstrumentData instrumentData = new InstrumentData(file);
                        if (instrumentData.mo39441a()) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("crash_shield", instrumentData.toString());
                                GraphRequest.C12196c cVar = GraphRequest.f27224o;
                                String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C13418j.m21107c()}, 1));
                                C19383o.m32796f(format, "java.lang.String.format(format, *args)");
                                C12981a aVar2 = new C12981a(instrumentData);
                                cVar.getClass();
                                arrayList.add(GraphRequest.C12196c.m20008h((AccessToken) null, format, jSONObject, aVar2));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        new C13426p((java.util.Collection<GraphRequest>) arrayList).mo46097e();
                    }
                }
                C13080a.f28756b = true;
            }
            if (FeatureManager.m20100c(FeatureManager.Feature.ThreadCheck)) {
                int i = C13192a.f29026a;
            }
        }
    }

    /* renamed from: o */
    public int mo21o() {
        return R.id.menu_bottom_nav_home;
    }
}
