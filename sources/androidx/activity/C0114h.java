package androidx.activity;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.RemoteException;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.ExtractedText;
import android.webkit.MimeTypeMap;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0426g;
import androidx.compose.animation.core.C0432j;
import androidx.compose.animation.core.C0435k0;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.C0552c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.relocation.C0879a;
import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1521g;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.node.C1737d;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.input.TextFieldValue;
import androidx.compose.runtime.C1302d;
import androidx.core.internal.view.SupportMenu;
import androidx.datastore.preferences.protobuf.C2606m;
import androidx.lifecycle.C2880m0;
import androidx.preference.C3039b;
import com.appboy.p043ui.C4940R;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.images.C5442a;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.inappmessage.C5492j;
import com.braze.p044ui.inappmessage.factories.C5651e;
import com.braze.p044ui.inappmessage.views.InAppMessageBaseView;
import com.braze.p044ui.inappmessage.views.InAppMessageImageView;
import com.braze.p044ui.inappmessage.views.InAppMessageModalView;
import com.bugsnag.android.C5816o1;
import com.bugsnag.android.C5935y;
import com.bumptech.glide.Glide;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.etsy.android.R;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.core.img.GlideRequests;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.dialog.SingleListingCheckoutSADialog;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.FavoritesTabKey;
import com.facebook.internal.FeatureManager;
import com.google.android.gms.internal.measurement.C14720l8;
import com.google.android.gms.measurement.internal.C14941c2;
import com.google.android.gms.measurement.internal.C14950d2;
import com.google.android.gms.measurement.internal.C14959e2;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.android.play.core.internal.C15705q;
import com.google.gson.internal.C16790g;
import com.paypal.openid.ClientAuthentication;
import dagger.android.C17550a;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import kotlin.text.C19459m;
import kotlinx.coroutines.C19543e0;
import p001a0.C0005b;
import p003a2.C0015b;
import p114g4.C6876n;
import p174m0.C7280a;
import p174m0.C7290i;
import p174m0.C7292j;
import p174m0.C7293k;
import p288y.C8341a;
import p288y.C8343c;
import p288y.C8345d;
import p288y.C8347f;
import p309ad.C8504a;
import p339dg.C12655a;
import p343ee.C12693a;
import p401mg.C13080a;
import p568fn.C17782b;
import p628nj.C18263b;
import p634np.C18290b;
import retrofit2.C20089b;
import retrofit2.C20092d;
import retrofit2.C20145v;

/* renamed from: androidx.activity.h */
public final class C0114h implements C18290b, C8504a, C17550a, C6876n, C5935y, C14941c2, C15705q, C16790g, C20092d, C12693a, ClientAuthentication, FeatureManager.C12256a {

    /* renamed from: b */
    public static final int[] f165b = {16843534, R.attr.selectableItemBackground};

    /* renamed from: c */
    public static final int[] f166c = {16843247, 16843248, 16843249, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn};

    /* renamed from: d */
    public static final int[] f167d = {16843250, 16843251, 16843252, 16843253, 16843254, 16843255, R.attr.dialogIcon, R.attr.dialogLayout, R.attr.dialogMessage, R.attr.dialogTitle, R.attr.negativeButtonText, R.attr.positiveButtonText};

    /* renamed from: e */
    public static final int[] f168e = {R.attr.useSimpleSummaryProvider};

    /* renamed from: f */
    public static final int[] f169f = {16842930, 16843256, R.attr.entries, R.attr.entryValues, R.attr.useSimpleSummaryProvider};

    /* renamed from: g */
    public static final int[] f170g = {16842930, 16843256, R.attr.entries, R.attr.entryValues};

    /* renamed from: h */
    public static final int[] f171h = {16842754, 16842765, 16842766, 16842994, 16843233, 16843238, 16843240, 16843241, 16843242, 16843243, 16843244, 16843245, 16843246, 16843491, 16844124, 16844129, R.attr.allowDividerAbove, R.attr.allowDividerBelow, R.attr.defaultValue, R.attr.dependency, R.attr.enableCopying, R.attr.enabled, R.attr.fragment, R.attr.icon, R.attr.iconSpaceReserved, R.attr.isPreferenceVisible, R.attr.key, R.attr.layout, R.attr.order, R.attr.persistent, R.attr.selectable, R.attr.shouldDisableView, R.attr.singleLineTitle, R.attr.summary, R.attr.title, R.attr.widgetLayout};

    /* renamed from: i */
    public static final int[] f172i = {16842994, 16843049, 16843050, R.attr.allowDividerAfterLastItem};

    /* renamed from: j */
    public static final int[] f173j = {16842994, 16843049, 16843050, R.attr.allowDividerAfterLastItem};

    /* renamed from: k */
    public static final int[] f174k = {16843239, R.attr.initialExpandedChildrenCount, R.attr.orderingFromXml};

    /* renamed from: l */
    public static final int[] f175l = {16843039, 16843040, R.attr.maxHeight, R.attr.maxWidth};

    /* renamed from: m */
    public static final int[] f176m = {16842994, 16843062, R.attr.adjustable, R.attr.min, R.attr.seekBarIncrement, R.attr.showSeekBarValue, R.attr.updatesContinuously};

    /* renamed from: n */
    public static final int[] f177n = {16843247, 16843248, 16843249, 16843627, 16843628, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn, R.attr.switchTextOff, R.attr.switchTextOn};

    /* renamed from: o */
    public static final int[] f178o = {16843247, 16843248, 16843249, 16843627, 16843628, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn, R.attr.switchTextOff, R.attr.switchTextOn};

    /* renamed from: p */
    public static final C0114h f179p = new C0114h();

    /* renamed from: q */
    public static final /* synthetic */ C0114h f180q = new C0114h();

    /* renamed from: r */
    public static final int[] f181r = {R.attr.elevation};

    /* renamed from: s */
    public static final C15588c1 f182s = new C15588c1();

    /* renamed from: t */
    public static final int[] f183t = {-21389, -2, -1, -1, -1};

    /* renamed from: u */
    public static final int[] f184u = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};

    /* renamed from: v */
    public static final int[] f185v = {-457489321, -42779, -2, -1, -1, 42777, 2};

    /* renamed from: w */
    public static final C0114h f186w = new C0114h();

    /* renamed from: x */
    public static final C0114h f187x = new C0114h();

    /* renamed from: y */
    public static char[] f188y = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: A */
    public static byte[] m267A(SecretKeySpec secretKeySpec, byte[] bArr, Provider provider) {
        Mac mac;
        if (provider != null) {
            try {
                mac = Mac.getInstance(secretKeySpec.getAlgorithm(), provider);
            } catch (NoSuchAlgorithmException e) {
                StringBuilder h = C0072d.m201h("Unsupported HMAC algorithm: ");
                h.append(e.getMessage());
                throw new JOSEException(h.toString(), e);
            } catch (InvalidKeyException e2) {
                StringBuilder h2 = C0072d.m201h("Invalid HMAC key: ");
                h2.append(e2.getMessage());
                throw new JOSEException(h2.toString(), e2);
            }
        } else {
            mac = Mac.getInstance(secretKeySpec.getAlgorithm());
        }
        mac.init(secretKeySpec);
        mac.update(bArr);
        return mac.doFinal();
    }

    /* renamed from: A0 */
    public static final ExtractedText m268A0(TextFieldValue textFieldValue) {
        C19383o.m32797g(textFieldValue, "<this>");
        ExtractedText extractedText = new ExtractedText();
        String str = textFieldValue.f4448a.f4296b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = C2022r.m4466e(textFieldValue.f4449b);
        extractedText.selectionEnd = C2022r.m4465d(textFieldValue.f4449b);
        extractedText.flags = C19459m.m33037f1(textFieldValue.f4448a.f4296b, 10) ^ true ? 1 : 0;
        return extractedText;
    }

    /* renamed from: B */
    public static int m269B(int i) {
        int i2 = i & SupportMenu.USER_MASK;
        int i3 = (i2 | (i2 << 8)) & 16711935;
        int i4 = (i3 | (i3 << 4)) & 252645135;
        int i5 = (i4 | (i4 << 2)) & 858993459;
        return (i5 | (i5 << 1)) & 1431655765;
    }

    /* renamed from: B0 */
    public static GlideRequests m270B0(Context context) {
        return (GlideRequests) Glide.with(context);
    }

    /* renamed from: C */
    public static void m271C(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        C3039b.m7159c0(iArr, iArr2, iArr4);
        m278I(iArr4, iArr3);
    }

    /* renamed from: C0 */
    public static GlideRequests m272C0(View view) {
        return (GlideRequests) Glide.with(view);
    }

    /* renamed from: D */
    public static void m273D(long[] jArr, int i, long j) {
        long j2 = ((j >>> 16) ^ j) & 4294901760L;
        long j3 = j ^ (j2 ^ (j2 << 16));
        long j4 = ((j3 >>> 8) ^ j3) & 280375465148160L;
        long j5 = j3 ^ (j4 ^ (j4 << 8));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 2) ^ j7) & 868082074056920076L;
        long j9 = j7 ^ (j8 ^ (j8 << 2));
        long j10 = ((j9 >>> 1) ^ j9) & 2459565876494606882L;
        long j11 = j9 ^ (j10 ^ (j10 << 1));
        jArr[i] = j11 & -6148914691236517206L;
        jArr[i + 1] = (j11 << 1) & -6148914691236517206L;
    }

    /* renamed from: E */
    public static final C8345d m274E(C1737d dVar) {
        C19383o.m32797g(dVar, "<this>");
        LayoutNodeWrapper O = dVar.mo6682O();
        if (O != null) {
            return O.mo6689v(dVar, true);
        }
        long j = dVar.f3724d;
        return new C8345d(0.0f, 0.0f, (float) ((int) (j >> 32)), (float) C7290i.m13995b(j));
    }

    /* renamed from: F */
    public static final C8345d m275F(C1689j jVar) {
        C19383o.m32797g(jVar, "<this>");
        return m294Y(jVar).mo6689v(jVar, true);
    }

    /* renamed from: G */
    public static final C8345d m276G(C1689j jVar) {
        C19383o.m32797g(jVar, "<this>");
        C1689j Y = m294Y(jVar);
        C8345d F = m275F(jVar);
        long t = Y.mo6688t(C19421p.m32952q(F.f18301a, F.f18302b));
        long t2 = Y.mo6688t(C19421p.m32952q(F.f18303c, F.f18302b));
        long t3 = Y.mo6688t(C19421p.m32952q(F.f18303c, F.f18304d));
        long t4 = Y.mo6688t(C19421p.m32952q(F.f18301a, F.f18304d));
        float c = C8343c.m16642c(t);
        float h0 = C18263b.m30846h0(new float[]{C8343c.m16642c(t2), C8343c.m16642c(t4), C8343c.m16642c(t3)}, c);
        float d = C8343c.m16643d(t);
        float h02 = C18263b.m30846h0(new float[]{C8343c.m16643d(t2), C8343c.m16643d(t4), C8343c.m16643d(t3)}, d);
        float c2 = C8343c.m16642c(t);
        float g0 = C18263b.m30845g0(new float[]{C8343c.m16642c(t2), C8343c.m16642c(t4), C8343c.m16642c(t3)}, c2);
        float d2 = C8343c.m16643d(t);
        return new C8345d(h0, h02, g0, C18263b.m30845g0(new float[]{C8343c.m16643d(t2), C8343c.m16643d(t4), C8343c.m16643d(t3)}, d2));
    }

    /* renamed from: H */
    public static long m277H(int i) {
        int i2 = ((i >>> 8) ^ i) & 65280;
        int i3 = i ^ (i2 ^ (i2 << 8));
        int i4 = ((i3 >>> 4) ^ i3) & 15728880;
        int i5 = i3 ^ (i4 ^ (i4 << 4));
        int i6 = ((i5 >>> 2) ^ i5) & 202116108;
        int i7 = i5 ^ (i6 ^ (i6 << 2));
        int i8 = ((i7 >>> 1) ^ i7) & 572662306;
        int i9 = i7 ^ (i8 ^ (i8 << 1));
        return ((((long) (i9 >>> 1)) & 1431655765) << 32) | (1431655765 & ((long) i9));
    }

    /* renamed from: I */
    public static void m278I(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) 21389) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr[5]) & UnsignedInteger.INT_MASK;
        long j3 = (j * j2) + (((long) iArr[0]) & UnsignedInteger.INT_MASK) + 0;
        int i = (int) j3;
        iArr3[0] = i;
        long j4 = ((long) iArr[6]) & UnsignedInteger.INT_MASK;
        long j5 = (j * j4) + j2 + (((long) iArr[1]) & UnsignedInteger.INT_MASK) + (j3 >>> 32);
        int i2 = (int) j5;
        iArr3[1] = i2;
        long j6 = ((long) iArr[7]) & UnsignedInteger.INT_MASK;
        long j7 = (j * j6) + j4 + (((long) iArr[2]) & UnsignedInteger.INT_MASK) + (j5 >>> 32);
        int i3 = (int) j7;
        iArr3[2] = i3;
        int i4 = i2;
        long j8 = ((long) iArr[8]) & UnsignedInteger.INT_MASK;
        long j9 = j;
        long j10 = (j * j8) + j6 + (((long) iArr[3]) & UnsignedInteger.INT_MASK) + (j7 >>> 32);
        int i5 = (int) j10;
        iArr3[3] = i5;
        long j11 = ((long) iArr[9]) & UnsignedInteger.INT_MASK;
        long j12 = (j9 * j11) + j8 + (((long) iArr[4]) & UnsignedInteger.INT_MASK) + (j10 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = (j12 >>> 32) + j11;
        long j14 = j13 & UnsignedInteger.INT_MASK;
        long j15 = (j9 * j14) + (((long) i) & UnsignedInteger.INT_MASK) + 0;
        iArr3[0] = (int) j15;
        long j16 = j13 >>> 32;
        long j17 = (j9 * j16) + j14 + (((long) i4) & UnsignedInteger.INT_MASK) + (j15 >>> 32);
        iArr3[1] = (int) j17;
        long j18 = j16 + (((long) i3) & UnsignedInteger.INT_MASK) + (j17 >>> 32);
        iArr3[2] = (int) j18;
        long j19 = (j18 >>> 32) + (((long) i5) & UnsignedInteger.INT_MASK);
        iArr3[3] = (int) j19;
        if (((j19 >>> 32) == 0 ? 0 : C2606m.m6155u(5, iArr3, 4)) != 0 || (iArr3[4] == -1 && C3039b.m7147Q(iArr3, f183t))) {
            C2606m.m6143i(5, 21389, iArr3);
        }
    }

    /* renamed from: J */
    public static void m279J(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((C3039b.m7167i0(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && C2606m.m6121P(10, iArr3, f184u))) && C2606m.m6136c(7, f185v, iArr3) != 0) {
            C2606m.m6159y(10, iArr3, 7);
        }
    }

    /* renamed from: K */
    public static void m280K(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: L */
    public static void m281L(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    /* renamed from: M */
    public static final void m282M(long j, Orientation orientation) {
        C19383o.m32797g(orientation, "orientation");
        boolean z = true;
        if (orientation == Orientation.Vertical) {
            if (C7280a.m13962g(j) == Integer.MAX_VALUE) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
            return;
        }
        if (C7280a.m13963h(j) == Integer.MAX_VALUE) {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
        }
    }

    /* renamed from: N */
    public static byte[] m283N(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long n0 = m309n0(0, 0, bArr3) & 67108863;
            int i = 2;
            long n02 = m309n0(3, 2, bArr3) & 67108611;
            long n03 = m309n0(6, 4, bArr3) & 67092735;
            long n04 = m309n0(9, 6, bArr3) & 66076671;
            long n05 = m309n0(12, 8, bArr3) & 1048575;
            long j = n02 * 5;
            long j2 = n03 * 5;
            long j3 = n04 * 5;
            long j4 = n05 * 5;
            int i2 = 17;
            byte[] bArr5 = new byte[17];
            long j5 = 0;
            int i3 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            while (i3 < bArr4.length) {
                int min = Math.min(16, bArr4.length - i3);
                System.arraycopy(bArr4, i3, bArr5, 0, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i2, (byte) 0);
                }
                long n06 = m309n0(0, 0, bArr5) + j9;
                long n07 = m309n0(3, i, bArr5) + j5;
                long n08 = m309n0(6, 4, bArr5) + j6;
                long n09 = m309n0(9, 6, bArr5) + j7;
                long n010 = j8 + (m309n0(12, 8, bArr5) | ((long) (bArr5[16] << 24)));
                long j10 = (n010 * j) + (n09 * j2) + (n08 * j3) + (n07 * j4) + (n06 * n0);
                long j11 = (n010 * j2) + (n09 * j3) + (n08 * j4) + (n07 * n0) + (n06 * n02);
                long j12 = (n010 * j3) + (n09 * j4) + (n08 * n0) + (n07 * n02) + (n06 * n03);
                long j13 = (n09 * n0) + (n08 * n02) + (n07 * n03) + (n06 * n04);
                long j14 = n09 * n02;
                long j15 = n010 * n0;
                long j16 = j11 + (j10 >> 26);
                long j17 = j12 + (j16 >> 26);
                long j18 = (n010 * j4) + j13 + (j17 >> 26);
                long j19 = j15 + j14 + (n08 * n03) + (n07 * n04) + (n06 * n05) + (j18 >> 26);
                long j20 = j19 >> 26;
                j8 = j19 & 67108863;
                long j21 = (j20 * 5) + (j10 & 67108863);
                long j22 = (j16 & 67108863) + (j21 >> 26);
                i3 += 16;
                j6 = j17 & 67108863;
                j7 = j18 & 67108863;
                i2 = 17;
                i = 2;
                j9 = j21 & 67108863;
                j5 = j22;
            }
            long j23 = j6 + (j5 >> 26);
            long j24 = j23 & 67108863;
            long j25 = j7 + (j23 >> 26);
            long j26 = j25 & 67108863;
            long j27 = j8 + (j25 >> 26);
            long j28 = j27 & 67108863;
            long j29 = ((j27 >> 26) * 5) + j9;
            long j30 = j29 >> 26;
            long j31 = j29 & 67108863;
            long j32 = (j5 & 67108863) + j30;
            long j33 = j31 + 5;
            long j34 = j33 & 67108863;
            long j35 = (j33 >> 26) + j32;
            long j36 = j24 + (j35 >> 26);
            long j37 = j26 + (j36 >> 26);
            long j38 = (j28 + (j37 >> 26)) - 67108864;
            long j39 = j38 >> 63;
            long j40 = j31 & j39;
            long j41 = j32 & j39;
            long j42 = j24 & j39;
            long j43 = j26 & j39;
            long j44 = j28 & j39;
            long j45 = ~j39;
            long j46 = j41 | (j35 & 67108863 & j45);
            long j47 = j42 | (j36 & 67108863 & j45);
            long j48 = j43 | (j37 & 67108863 & j45);
            long j49 = (j40 | (j34 & j45) | (j46 << 26)) & UnsignedInteger.INT_MASK;
            long j50 = ((j46 >> 6) | (j47 << 20)) & UnsignedInteger.INT_MASK;
            long j51 = ((j47 >> 12) | (j48 << 14)) & UnsignedInteger.INT_MASK;
            long j52 = ((j48 >> 18) | ((j44 | (j38 & j45)) << 8)) & UnsignedInteger.INT_MASK;
            long o0 = m310o0(16, bArr3) + j49;
            long j53 = o0 & UnsignedInteger.INT_MASK;
            long o02 = m310o0(20, bArr3) + j50 + (o0 >> 32);
            long j54 = o02 & UnsignedInteger.INT_MASK;
            long o03 = m310o0(24, bArr3) + j51 + (o02 >> 32);
            long j55 = o03 & UnsignedInteger.INT_MASK;
            long o04 = (m310o0(28, bArr3) + j52 + (o03 >> 32)) & UnsignedInteger.INT_MASK;
            byte[] bArr6 = new byte[16];
            m332z0(j53, bArr6, 0);
            m332z0(j54, bArr6, 4);
            m332z0(j55, bArr6, 8);
            m332z0(o04, bArr6, 12);
            return bArr6;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    /* renamed from: O */
    public static final long m284O(long j, long j2) {
        return C0761x.m1707a(C19388s.m32833M((int) (j2 >> 32), C7280a.m13965j(j), C7280a.m13963h(j)), C19388s.m32833M(C7290i.m13995b(j2), C7280a.m13964i(j), C7280a.m13962g(j)));
    }

    /* renamed from: P */
    public static final long m285P(long j, long j2) {
        return m313q(C19388s.m32833M(C7280a.m13965j(j2), C7280a.m13965j(j), C7280a.m13963h(j)), C19388s.m32833M(C7280a.m13963h(j2), C7280a.m13965j(j), C7280a.m13963h(j)), C19388s.m32833M(C7280a.m13964i(j2), C7280a.m13964i(j), C7280a.m13962g(j)), C19388s.m32833M(C7280a.m13962g(j2), C7280a.m13964i(j), C7280a.m13962g(j)));
    }

    /* renamed from: Q */
    public static final int m286Q(int i, long j) {
        return C19388s.m32833M(i, C7280a.m13964i(j), C7280a.m13962g(j));
    }

    /* renamed from: R */
    public static final int m287R(int i, long j) {
        return C19388s.m32833M(i, C7280a.m13965j(j), C7280a.m13963h(j));
    }

    /* renamed from: S */
    public static C0424f m288S(C0424f fVar) {
        float f = ((C0426g) fVar.f1111d).f1116a;
        long j = fVar.f1112e;
        long j2 = fVar.f1113f;
        boolean z = fVar.f1114g;
        C19383o.m32797g(fVar, "<this>");
        return new C0424f(fVar.f1109b, Float.valueOf(0.0f), new C0426g(f), j, j2, z);
    }

    /* renamed from: T */
    public static EdgeEffect m289T(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return Build.VERSION.SDK_INT >= 31 ? C0552c.f1293a.mo3712a(context, (AttributeSet) null) : new EdgeEffect(context);
    }

    /* renamed from: U */
    public static final C0432j m290U(C0435k0 k0Var, Object obj) {
        C19383o.m32797g(k0Var, "<this>");
        C0432j jVar = (C0432j) k0Var.mo3509a().invoke(obj);
        C19383o.m32797g(jVar, "<this>");
        return jVar.mo3490c();
    }

    /* renamed from: V */
    public static void m291V(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        C3039b.m7161e0(iArr, iArr3);
        m278I(iArr3, iArr2);
    }

    /* renamed from: W */
    public static void m292W(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C3039b.m7178o0(iArr, iArr2, iArr3) != 0) {
            C2606m.m6117L(5, 21389, iArr3);
        }
    }

    /* renamed from: X */
    public static final long m293X(int i, int i2, boolean z, boolean z2) {
        return i2 == 0 ? C0005b.m47l(i, i) : i == 0 ? z ? C0005b.m47l(1, 0) : C0005b.m47l(0, 1) : i == i2 ? z ? C0005b.m47l(i2 - 1, i2) : C0005b.m47l(i2, i2 - 1) : z ? !z2 ? C0005b.m47l(i - 1, i) : C0005b.m47l(i + 1, i) : !z2 ? C0005b.m47l(i, i + 1) : C0005b.m47l(i, i - 1);
    }

    /* renamed from: Y */
    public static final C1689j m294Y(C1689j jVar) {
        C1689j jVar2;
        C19383o.m32797g(jVar, "<this>");
        LayoutNodeWrapper O = jVar.mo6682O();
        LayoutNodeWrapper layoutNodeWrapper = jVar;
        while (true) {
            LayoutNodeWrapper layoutNodeWrapper2 = O;
            jVar2 = layoutNodeWrapper;
            LayoutNodeWrapper layoutNodeWrapper3 = layoutNodeWrapper2;
            if (layoutNodeWrapper3 == null) {
                break;
            }
            O = layoutNodeWrapper3.mo6682O();
            layoutNodeWrapper = layoutNodeWrapper3;
        }
        LayoutNodeWrapper layoutNodeWrapper4 = jVar2 instanceof LayoutNodeWrapper ? (LayoutNodeWrapper) jVar2 : null;
        if (layoutNodeWrapper4 == null) {
            return jVar2;
        }
        LayoutNodeWrapper layoutNodeWrapper5 = layoutNodeWrapper4.f3851g;
        while (true) {
            LayoutNodeWrapper layoutNodeWrapper6 = layoutNodeWrapper5;
            LayoutNodeWrapper layoutNodeWrapper7 = layoutNodeWrapper4;
            layoutNodeWrapper4 = layoutNodeWrapper6;
            if (layoutNodeWrapper4 == null) {
                return layoutNodeWrapper7;
            }
            layoutNodeWrapper5 = layoutNodeWrapper4.f3851g;
        }
    }

    /* renamed from: Z */
    public static C2880m0 m295Z(View view) {
        C2880m0 m0Var = (C2880m0) view.getTag(R.id.view_tree_view_model_store_owner);
        if (m0Var != null) {
            return m0Var;
        }
        ViewParent parent = view.getParent();
        while (m0Var == null && (parent instanceof View)) {
            View view2 = (View) parent;
            m0Var = (C2880m0) view2.getTag(R.id.view_tree_view_model_store_owner);
            parent = view2.getParent();
        }
        return m0Var;
    }

    /* renamed from: a0 */
    public static final ActivityManager m296a0(Context context) {
        C19383o.m32798h(context, "$this$getActivityManager");
        try {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager)) {
                systemService = null;
            }
            return (ActivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: b0 */
    public static final int m297b0(C1959m mVar, int i) {
        C19383o.m32797g(mVar, "fontWeight");
        boolean z = mVar.compareTo(C1959m.f4411e) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    /* renamed from: c0 */
    public static final long m298c0(long j) {
        return C19421p.m32952q(C8347f.m16656d(j) / 2.0f, C8347f.m16654b(j) / 2.0f);
    }

    /* renamed from: d0 */
    public static float m299d0(EdgeEffect edgeEffect) {
        C19383o.m32797g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C0552c.f1293a.mo3713b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: e0 */
    public static final String m300e0(File file) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.getPath()));
    }

    /* renamed from: f0 */
    public static final long m301f0(double d) {
        return m316r0(4294967296L, (float) d);
    }

    /* renamed from: g0 */
    public static final long m302g0(int i) {
        return m316r0(4294967296L, (float) i);
    }

    /* renamed from: h0 */
    public static final void m303h0() {
        C7292j.m13998b(0);
    }

    /* renamed from: i0 */
    public static final boolean m304i0(Spanned spanned, Class cls) {
        C19383o.m32797g(spanned, "<this>");
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* renamed from: j0 */
    public static final View m305j0(ViewGroup viewGroup, int i, boolean z) {
        C19383o.m32797g(viewGroup, "<this>");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, z);
        C19383o.m32796f(inflate, "from(context).inflate(la…tRes, this, attachToRoot)");
        return inflate;
    }

    /* renamed from: k0 */
    public static final boolean m306k0(C1492b0 b0Var, float f, float f2) {
        C8345d dVar = new C8345d(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        C1521g d = C18263b.m30838d();
        d.mo6284k(dVar);
        C1521g d2 = C18263b.m30838d();
        d2.mo6283j(b0Var, d, 1);
        boolean o = d2.mo6339o();
        d2.reset();
        d.reset();
        return !o;
    }

    /* renamed from: l0 */
    public static final boolean m307l0(long j) {
        C7293k[] kVarArr = C7292j.f16172b;
        return (j & 1095216660480L) == 0;
    }

    /* renamed from: m0 */
    public static final boolean m308m0(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float b = C8341a.m16635b(j);
        float c = C8341a.m16636c(j);
        return ((f6 * f6) / (c * c)) + ((f5 * f5) / (b * b)) <= 1.0f;
    }

    /* renamed from: n0 */
    public static long m309n0(int i, int i2, byte[] bArr) {
        return (m310o0(i, bArr) >> i2) & 67108863;
    }

    /* renamed from: o0 */
    public static long m310o0(int i, byte[] bArr) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & UnsignedInteger.INT_MASK;
    }

    /* renamed from: p */
    public static C0424f m311p(float f, float f2, int i) {
        return new C0424f(VectorConvertersKt.f1076a, Float.valueOf(f), new C0426g((i & 2) != 0 ? 0.0f : f2), (i & 4) != 0 ? Long.MIN_VALUE : 0, (i & 8) != 0 ? Long.MIN_VALUE : 0, false);
    }

    /* renamed from: p0 */
    public static final long m312p0(int i, int i2, long j) {
        int j2 = C7280a.m13965j(j) + i;
        int i3 = 0;
        if (j2 < 0) {
            j2 = 0;
        }
        int h = C7280a.m13963h(j);
        if (h != Integer.MAX_VALUE && (h = h + i) < 0) {
            h = 0;
        }
        int i4 = C7280a.m13964i(j) + i2;
        if (i4 < 0) {
            i4 = 0;
        }
        int g = C7280a.m13962g(j);
        if (g == Integer.MAX_VALUE || (g = g + i2) >= 0) {
            i3 = g;
        }
        return m313q(j2, h, i4, i3);
    }

    /* renamed from: q */
    public static final long m313q(int i, int i2, int i3, int i4) {
        boolean z = true;
        if (i2 >= i) {
            if (i4 >= i3) {
                if (i < 0 || i3 < 0) {
                    z = false;
                }
                if (z) {
                    return C7280a.C7281a.m13968b(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(C0070b.m183e("minWidth(", i, ") and minHeight(", i3, ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
    }

    /* renamed from: q0 */
    public static void m314q0(EdgeEffect edgeEffect, float f) {
        C19383o.m32797g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            C0552c.f1293a.mo3714c(edgeEffect, f, 0.0f);
        } else {
            edgeEffect.onPull(f, 0.0f);
        }
    }

    /* renamed from: r */
    public static /* synthetic */ long m315r(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return m313q(0, i, 0, i2);
    }

    /* renamed from: r0 */
    public static final long m316r0(long j, float f) {
        long floatToIntBits = j | (((long) Float.floatToIntBits(f)) & UnsignedInteger.INT_MASK);
        C7293k[] kVarArr = C7292j.f16172b;
        return floatToIntBits;
    }

    /* renamed from: s */
    public static final long m317s(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & UnsignedInteger.INT_MASK) | (floatToIntBits << 32);
        int i = C8341a.f18290b;
        return floatToIntBits2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m318s0(androidx.compose.p015ui.graphics.C1537o r12, androidx.compose.p015ui.text.C2021q r13) {
        /*
            long r0 = r13.f4591c
            r2 = 32
            long r3 = r0 >> r2
            int r3 = (int) r3
            float r3 = (float) r3
            androidx.compose.ui.text.c r4 = r13.f4590b
            float r5 = r4.f4363d
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r3 >= 0) goto L_0x0014
            r3 = r6
            goto L_0x0015
        L_0x0014:
            r3 = r5
        L_0x0015:
            if (r3 != 0) goto L_0x0031
            boolean r3 = r4.f4362c
            if (r3 != 0) goto L_0x002b
            int r0 = p174m0.C7290i.m13995b(r0)
            float r0 = (float) r0
            androidx.compose.ui.text.c r1 = r13.f4590b
            float r1 = r1.f4364e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r0 = r5
            goto L_0x002c
        L_0x002b:
            r0 = r6
        L_0x002c:
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = r5
            goto L_0x0032
        L_0x0031:
            r0 = r6
        L_0x0032:
            if (r0 == 0) goto L_0x0040
            androidx.compose.ui.text.p r0 = r13.f4589a
            int r0 = r0.f4561f
            if (r0 != r6) goto L_0x003c
            r0 = r6
            goto L_0x003d
        L_0x003c:
            r0 = r5
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            r5 = r6
        L_0x0040:
            if (r5 == 0) goto L_0x005d
            long r0 = r13.f4591c
            long r2 = r0 >> r2
            int r2 = (int) r2
            float r2 = (float) r2
            int r0 = p174m0.C7290i.m13995b(r0)
            float r0 = (float) r0
            long r3 = p288y.C8343c.f18295b
            long r0 = m319t(r2, r0)
            y.d r0 = p001a0.C0005b.m40h(r3, r0)
            r12.mo6264r()
            r12.mo6381p(r0, r6)
        L_0x005d:
            androidx.compose.ui.text.p r0 = r13.f4589a     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.text.s r0 = r0.f4557b     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.text.n r0 = r0.f4599a     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.text.style.TextDrawStyle r0 = r0.f4536a     // Catch:{ all -> 0x0086 }
            r0.mo7766d()     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.text.c r6 = r13.f4590b     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.text.p r0 = r13.f4589a     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.text.s r0 = r0.f4557b     // Catch:{ all -> 0x0086 }
            long r8 = r0.mo7758b()     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.text.p r13 = r13.f4589a     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.text.s r13 = r13.f4557b     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.text.n r13 = r13.f4599a     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.graphics.j0 r10 = r13.f4549n     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.text.style.e r11 = r13.f4548m     // Catch:{ all -> 0x0086 }
            r7 = r12
            r6.mo7468b(r7, r8, r10, r11)     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x0085
            r12.mo6261m()
        L_0x0085:
            return
        L_0x0086:
            r13 = move-exception
            if (r5 == 0) goto L_0x008c
            r12.mo6261m()
        L_0x008c:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.C0114h.m318s0(androidx.compose.ui.graphics.o, androidx.compose.ui.text.q):void");
    }

    /* renamed from: t */
    public static final long m319t(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & UnsignedInteger.INT_MASK) | (floatToIntBits << 32);
        int i = C8347f.f18315d;
        return floatToIntBits2;
    }

    /* renamed from: t0 */
    public static final long m320t0(C1689j jVar) {
        C19383o.m32797g(jVar, "<this>");
        int i = C8343c.f18298e;
        return jVar.mo6683P(C8343c.f18295b);
    }

    /* renamed from: u */
    public static long m321u(long j) {
        long j2 = ((j >>> 1) ^ j) & 2459565876494606882L;
        long j3 = j ^ (j2 ^ (j2 << 1));
        long j4 = ((j3 >>> 2) ^ j3) & 868082074056920076L;
        long j5 = j3 ^ (j4 ^ (j4 << 2));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 8) ^ j7) & 280375465148160L;
        long j9 = j7 ^ (j8 ^ (j8 << 8));
        long j10 = ((j9 >>> 16) ^ j9) & 4294901760L;
        return j9 ^ (j10 ^ (j10 << 16));
    }

    /* renamed from: u0 */
    public static final long m322u0(C1689j jVar) {
        C19383o.m32797g(jVar, "<this>");
        int i = C8343c.f18298e;
        return jVar.mo6688t(C8343c.f18295b);
    }

    /* renamed from: v */
    public static LinkedList m323v(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (i < jSONArray.size()) {
            Object obj = jSONArray.get(i);
            if (obj == null) {
                throw new ParseException(C0069a.m175f("The X.509 certificate at position ", i, " must not be null"), 0);
            } else if (obj instanceof String) {
                linkedList.add(new Base64((String) obj));
                i++;
            } else {
                throw new ParseException(C0069a.m175f("The X.509 certificate at position ", i, " must be encoded as a Base64 string"), 0);
            }
        }
        return linkedList;
    }

    /* renamed from: v0 */
    public static final Intent m324v0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, C5816o1 o1Var) {
        C19383o.m32798h(context, "$this$registerReceiverSafe");
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (SecurityException e) {
            if (o1Var == null) {
                return null;
            }
            o1Var.mo16602b("Failed to register receiver", e);
            return null;
        } catch (RemoteException e2) {
            if (o1Var == null) {
                return null;
            }
            o1Var.mo16602b("Failed to register receiver", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            if (o1Var == null) {
                return null;
            }
            o1Var.mo16602b("Failed to register receiver", e3);
            return null;
        }
    }

    /* renamed from: w */
    public static LinkedList m325w(List list) {
        X509Certificate x509Certificate;
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                try {
                    x509Certificate = C19543e0.m33342x(((Base64) list.get(i)).mo17747a());
                } catch (CertificateException unused) {
                    x509Certificate = null;
                }
                if (x509Certificate != null) {
                    linkedList.add(x509Certificate);
                } else {
                    throw new ParseException(C0015b.m88g("Invalid X.509 certificate at position ", i), 0);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: w0 */
    public static final C0879a m326w0(C1302d dVar) {
        dVar.mo5465u(-1031410916);
        View view = (View) dVar.mo5410J(AndroidCompositionLocals_androidKt.f3991f);
        dVar.mo5465u(1157296644);
        boolean I = dVar.mo5408I(view);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new C0879a(view);
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        C0879a aVar = (C0879a) v;
        dVar.mo5406H();
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
        if (r14 == 0) goto L_0x0040;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m327x(int r14, int[] r15) {
        /*
            r0 = 5
            r1 = 21389(0x538d, float:2.9972E-41)
            if (r14 == 0) goto L_0x0040
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r14
            long r6 = r6 & r4
            long r2 = r2 * r6
            r14 = 0
            r8 = r15[r14]
            long r8 = (long) r8
            long r8 = r8 & r4
            long r2 = r2 + r8
            r8 = 0
            long r2 = r2 + r8
            int r10 = (int) r2
            r15[r14] = r10
            r10 = 32
            long r2 = r2 >>> r10
            r11 = 1
            r12 = r15[r11]
            long r12 = (long) r12
            long r12 = r12 & r4
            long r6 = r6 + r12
            long r6 = r6 + r2
            int r2 = (int) r6
            r15[r11] = r2
            long r2 = r6 >>> r10
            r6 = 2
            r7 = r15[r6]
            long r11 = (long) r7
            long r4 = r4 & r11
            long r2 = r2 + r4
            int r4 = (int) r2
            r15[r6] = r4
            long r2 = r2 >>> r10
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            r14 = 3
            int r14 = androidx.datastore.preferences.protobuf.C2606m.m6155u(r0, r15, r14)
        L_0x003e:
            if (r14 != 0) goto L_0x004e
        L_0x0040:
            r14 = 4
            r14 = r15[r14]
            r2 = -1
            if (r14 != r2) goto L_0x0051
            int[] r14 = f183t
            boolean r14 = androidx.preference.C3039b.m7147Q(r15, r14)
            if (r14 == 0) goto L_0x0051
        L_0x004e:
            androidx.datastore.preferences.protobuf.C2606m.m6143i(r0, r1, r15)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.C0114h.m327x(int, int[]):void");
    }

    /* renamed from: x0 */
    public static final String m328x0(Object obj) {
        C19383o.m32797g(obj, "obj");
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('@');
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }

    /* renamed from: y */
    public static void m329y(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        C3039b.m7161e0(iArr, iArr3);
        while (true) {
            m278I(iArr3, iArr2);
            i--;
            if (i > 0) {
                C3039b.m7161e0(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: y0 */
    public static final Rect m330y0(C8345d dVar) {
        C19383o.m32797g(dVar, "<this>");
        return new Rect((int) dVar.f18301a, (int) dVar.f18302b, (int) dVar.f18303c, (int) dVar.f18304d);
    }

    /* renamed from: z */
    public static void m331z(long[] jArr, int i, long j) {
        long j2 = ((j >>> 16) ^ j) & 4294901760L;
        long j3 = j ^ (j2 ^ (j2 << 16));
        long j4 = ((j3 >>> 8) ^ j3) & 280375465148160L;
        long j5 = j3 ^ (j4 ^ (j4 << 8));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 2) ^ j7) & 868082074056920076L;
        long j9 = j7 ^ (j8 ^ (j8 << 2));
        long j10 = ((j9 >>> 1) ^ j9) & 2459565876494606882L;
        long j11 = j9 ^ (j10 ^ (j10 << 1));
        jArr[i] = j11 & 6148914691236517205L;
        jArr[i + 1] = (j11 >>> 1) & 6148914691236517205L;
    }

    /* renamed from: z0 */
    public static void m332z0(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }

    /* renamed from: a */
    public View mo1126a(Activity activity, C5483a aVar) {
        InAppMessageModalView inAppMessageModalView;
        C19383o.m32797g(activity, "activity");
        C19383o.m32797g(aVar, "inAppMessage");
        Context applicationContext = activity.getApplicationContext();
        C5492j jVar = (C5492j) aVar;
        boolean z = true;
        boolean z2 = jVar.f11813H == ImageStyle.GRAPHIC;
        if (z2) {
            View inflate = activity.getLayoutInflater().inflate(C4940R.C4943layout.com_braze_inappmessage_modal_graphic, (ViewGroup) null);
            if (inflate != null) {
                inAppMessageModalView = (InAppMessageModalView) inflate;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
            }
        } else {
            View inflate2 = activity.getLayoutInflater().inflate(C4940R.C4943layout.com_braze_inappmessage_modal, (ViewGroup) null);
            if (inflate2 != null) {
                inAppMessageModalView = (InAppMessageModalView) inflate2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
            }
        }
        inAppMessageModalView.applyInAppMessageParameters(applicationContext, jVar);
        String appropriateImageUrl = InAppMessageBaseView.getAppropriateImageUrl(jVar);
        if (!(appropriateImageUrl == null || appropriateImageUrl.length() == 0)) {
            z = false;
        }
        if (!z) {
            Braze.Companion companion = Braze.f11170m;
            C19383o.m32796f(applicationContext, "applicationContext");
            C5442a n = companion.mo15515f(applicationContext).mo15499n();
            C19383o.m32796f(appropriateImageUrl, "imageUrl");
            ImageView messageImageView = inAppMessageModalView.getMessageImageView();
            C19383o.m32796f(messageImageView, "view.messageImageView");
            ((DefaultBrazeImageLoader) n).mo15924e(applicationContext, aVar, appropriateImageUrl, messageImageView, BrazeViewBounds.IN_APP_MESSAGE_MODAL);
        }
        inAppMessageModalView.getFrameView().setOnClickListener(new C5651e(this, 0));
        inAppMessageModalView.setMessageBackgroundColor(aVar.getBackgroundColor());
        inAppMessageModalView.setFrameColor(jVar.f11814I);
        inAppMessageModalView.setMessageButtons(jVar.f11812G);
        inAppMessageModalView.setMessageCloseButtonColor(jVar.f11810E);
        if (!z2) {
            inAppMessageModalView.setMessage(aVar.getMessage());
            inAppMessageModalView.setMessageTextColor(aVar.mo15960O());
            inAppMessageModalView.setMessageHeaderText(jVar.f11811F);
            inAppMessageModalView.setMessageHeaderTextColor(jVar.f11809D);
            inAppMessageModalView.setMessageIcon(aVar.getIcon(), aVar.mo15962Q(), aVar.mo15967Y());
            inAppMessageModalView.setMessageHeaderTextAlignment(jVar.f11815J);
            inAppMessageModalView.setMessageTextAlign(jVar.f11763n);
            inAppMessageModalView.resetMessageMargins(jVar.f11844A);
            ImageView messageImageView2 = inAppMessageModalView.getMessageImageView();
            if (messageImageView2 != null) {
                ((InAppMessageImageView) messageImageView2).setAspectRatio(2.9f);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView");
            }
        }
        inAppMessageModalView.setLargerCloseButtonClickArea(inAppMessageModalView.getMessageCloseButtonView());
        inAppMessageModalView.setupDirectionalNavigation(jVar.f11812G.size());
        return inAppMessageModalView;
    }

    /* renamed from: b */
    public void mo1127b() {
    }

    /* renamed from: c */
    public String mo1128c(int i, String str) {
        if (i > str.length()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() > 3 && sb.charAt(3) != ' ') {
            sb.insert(3, ' ');
        }
        return sb.toString();
    }

    /* renamed from: d */
    public boolean mo1129d() {
        return true;
    }

    /* renamed from: e */
    public Object[] mo1130e(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
        return (Object[]) C19382n.m32722M0(obj, "makePathElements", List.class, arrayList, File.class, file, List.class, arrayList2);
    }

    /* renamed from: f */
    public String mo1131f() {
        return "unknown";
    }

    /* renamed from: g */
    public Map mo1132g(String str) {
        String encodeToString = android.util.Base64.encodeToString(str.getBytes(), 2);
        HashMap hashMap = new HashMap();
        hashMap.put("Authorization", "Basic " + encodeToString);
        hashMap.put("client_id", str);
        return hashMap;
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo1133h(Object obj) {
        SingleListingCheckoutSADialog singleListingCheckoutSADialog = (SingleListingCheckoutSADialog) obj;
    }

    /* renamed from: i */
    public Object mo1134i() {
        return new ArrayList();
    }

    /* renamed from: j */
    public void mo1135j(C20089b bVar, Throwable th) {
        StringBuilder h = C0072d.m201h("Error recording latency: ");
        h.append(th.getMessage());
        Log.e("Qualtrics", h.toString());
    }

    /* renamed from: k */
    public ArrayList mo19k(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        C19383o.m32797g(fragmentNavigationKey, "key");
        if (fragmentNavigationKey instanceof FavoritesTabKey) {
            return C17782b.m29888u(fragmentNavigationKey);
        }
        throw new UnsupportedNavigationException("Invalid key " + fragmentNavigationKey + " provided to " + this);
    }

    /* renamed from: l */
    public Map mo1136l(String str) {
        return Collections.singletonMap("client_id", str);
    }

    /* renamed from: m */
    public void mo1137m(C20089b bVar, C20145v vVar) {
        Log.i("Qualtrics", "Latency recorded");
    }

    /* renamed from: n */
    public void mo20n(boolean z) {
        if (z) {
            boolean z2 = C12655a.f27914a;
            Class<C12655a> cls = C12655a.class;
            if (!C13080a.m20762b(cls)) {
                try {
                    C12655a.f27914a = true;
                    C12655a.f27918e.mo45435b();
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            }
        }
    }

    /* renamed from: o */
    public int mo21o() {
        return R.id.menu_bottom_nav_favorites;
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Integer.valueOf((int) C14720l8.f32933c.zza().mo50690f());
    }
}
