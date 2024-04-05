package kotlin.jvm.internal;

import android.content.Context;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.appcompat.widget.C0326j;
import androidx.appcompat.widget.C0355u0;
import androidx.compose.foundation.gestures.C0613k;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.lazy.layout.C0837b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.p015ui.graphics.C1517e0;
import androidx.compose.p015ui.graphics.C1520f0;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1538o0;
import androidx.compose.p015ui.graphics.C1540p0;
import androidx.compose.p015ui.graphics.C1603w;
import androidx.compose.p015ui.graphics.SimpleGraphicsLayerModifier;
import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.C1640l;
import androidx.compose.p015ui.input.pointer.C1644p;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.semantics.C1904k;
import androidx.compose.p015ui.semantics.NodeLocationHolder;
import androidx.compose.p015ui.text.font.C1950f;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.C2783s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2850d;
import androidx.lifecycle.C2866i0;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.Constants;
import com.bugsnag.android.ErrorType;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8697k;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.C8699m;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.lib.models.editable.EditableListing;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.shippingmethod.ChangeShippingMethodFragment;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CartWithSavedKey;
import com.etsy.android.p327ui.search.filters.refactor.C10789b;
import com.etsy.android.p327ui.search.filters.refactor.category.C10797c;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.gms.internal.measurement.C14598c3;
import com.google.android.gms.internal.measurement.C14633f;
import com.google.android.gms.internal.measurement.C14646g;
import com.google.android.gms.internal.measurement.C14672i;
import com.google.android.gms.internal.measurement.C14720l8;
import com.google.android.gms.internal.measurement.C14724m;
import com.google.android.gms.internal.measurement.C14737n;
import com.google.android.gms.internal.measurement.C14763p;
import com.google.android.gms.internal.measurement.C14813t;
import com.google.android.gms.internal.measurement.C14825u;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.measurement.internal.C14941c2;
import com.google.android.gms.measurement.internal.C14950d2;
import com.google.android.gms.measurement.internal.C14959e2;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.material.shape.C15408d;
import dagger.android.C17550a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.collections.C19323p;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C19344xa50de660;
import kotlin.coroutines.intrinsics.C19345xa50de661;
import kotlin.coroutines.intrinsics.C19346xa50de662;
import kotlin.coroutines.intrinsics.C19347xa50de663;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.C19421p;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19830v;
import kotlinx.coroutines.C19838x1;
import kotlinx.coroutines.channels.C19515q;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.C19729m;
import kotlinx.coroutines.internal.C19736t;
import org.apache.commons.lang3.ClassUtils;
import p001a0.C0005b;
import p003a2.C0015b;
import p128h6.C6955a;
import p128h6.C6956b;
import p173m.C7279a;
import p174m0.C7285e;
import p174m0.C7286f;
import p219r.C7734e;
import p244t5.C7984h1;
import p244t5.C7998m0;
import p244t5.C8018s1;
import p244t5.C8036y1;
import p267v7.C8217e;
import p273w4.C8239h;
import p273w4.C8240i;
import p276w7.C8260c;
import p276w7.C8261d;
import p280x0.C8292f;
import p288y.C8343c;
import p343ee.C12693a;
import p441sb.C13367a;
import p517bn.C14118i;
import p604kj.C18096a;
import p605kk.C18116a;
import p605kk.C18122f;
import p605kk.C18123g;
import p605kk.C18126j;
import p628nj.C18263b;
import p634np.C18290b;
import p683tn.C18567f;
import p753kq.C19857l;
import p753kq.C19861p;
import p764pq.C20053e;
import p764pq.C20055g;
import p764pq.C20057i;
import p768rq.C20153b;
import p772tq.C20203a;

/* renamed from: kotlin.jvm.internal.s */
public class C19388s implements C18290b, C0613k, C8239h, C18567f, C1950f.C1951a, C18116a, C17550a, C14941c2, C12693a, C18122f {

    /* renamed from: b */
    public static final C19388s f43271b = new C19388s();

    /* renamed from: c */
    public static final int[] f43272c = {16842755, R.attr.action, R.attr.data, R.attr.dataPattern, R.attr.targetPackage};

    /* renamed from: d */
    public static final int[] f43273d = {R.attr.navGraph};

    /* renamed from: e */
    public static final int[] f43274e = {R.attr.graph};

    /* renamed from: f */
    public static final /* synthetic */ C19388s f43275f = new C19388s();

    /* renamed from: g */
    public static final /* synthetic */ C19388s f43276g = new C19388s();

    /* renamed from: h */
    public static final int[] f43277h = {R.attr.swipeRefreshLayoutProgressSpinnerBackgroundColor};

    /* renamed from: i */
    public static final /* synthetic */ C19388s f43278i = new C19388s();

    /* renamed from: j */
    public static final C19736t f43279j = new C19736t("NONE");

    /* renamed from: k */
    public static final C19736t f43280k = new C19736t("PENDING");

    /* renamed from: l */
    public static final C19736t f43281l = new C19736t("CONDITION_FALSE");

    /* renamed from: m */
    public static final C19736t f43282m = new C19736t("LIST_EMPTY");

    public /* synthetic */ C19388s() {
    }

    /* renamed from: A */
    public static short[][][] m32809A(byte[][][] bArr) {
        int length = bArr.length;
        byte[][] bArr2 = bArr[0];
        int length2 = bArr2.length;
        int[] iArr = new int[3];
        iArr[2] = bArr2[0].length;
        iArr[1] = length2;
        iArr[0] = length;
        short[][][] sArr = (short[][][]) Array.newInstance(Short.TYPE, iArr);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                for (int i3 = 0; i3 < bArr[0][0].length; i3++) {
                    sArr[i][i2][i3] = (short) (bArr[i][i2][i3] & 255);
                }
            }
        }
        return sArr;
    }

    /* renamed from: A0 */
    public static final void m32810A0(TextView textView, C13367a aVar) {
        C19383o.m32797g(textView, "<this>");
        textView.setTypeface(C8292f.m16582a(textView.getContext(), aVar.f29297a));
    }

    /* renamed from: B */
    public static byte[] m32811B(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    /* renamed from: B0 */
    public static final C20055g m32812B0(C20055g gVar, int i) {
        C19383o.m32797g(gVar, "<this>");
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        C19383o.m32797g(valueOf, ResponseConstants.STEP);
        if (z) {
            int i2 = gVar.f44414b;
            int i3 = gVar.f44415c;
            if (gVar.f44416d <= 0) {
                i = -i;
            }
            return new C20055g(i2, i3, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + ClassUtils.PACKAGE_SEPARATOR_CHAR);
    }

    /* renamed from: C */
    public static final int m32813C(int i, C7734e eVar) {
        int i2 = eVar.f17157d - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            T[] tArr = eVar.f17155b;
            int i5 = ((C0837b.C0838a) tArr[i4]).f1793a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((C0837b.C0838a) tArr[i3]).f1793a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    /* renamed from: C0 */
    public static final Shader.TileMode m32814C0(int i) {
        boolean z = false;
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3) {
            z = true;
        }
        return z ? Build.VERSION.SDK_INT >= 31 ? C1538o0.f3335a.mo6383b() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    /* renamed from: D */
    public static final String m32815D(String str, String str2) {
        C19383o.m32797g(str, "<this>");
        if (C19457k.m33025c1(str, str2, false)) {
            return str;
        }
        if (C19457k.m33025c1(str, "/etsyapps/v3", false)) {
            StringBuilder h = C0072d.m201h(str2);
            h.append(C19459m.m33050s1(str, "/etsyapps/v3"));
            return h.toString();
        } else if (C19457k.m33025c1(str, "/", false)) {
            return C0326j.m864i(str2, str);
        } else {
            return str2 + JsonPointer.SEPARATOR + str;
        }
    }

    /* renamed from: D0 */
    public static final C20057i m32816D0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C20057i(i, i2 - 1);
        }
        C20057i iVar = C20057i.f44421e;
        return C20057i.f44421e;
    }

    /* renamed from: E */
    public static String m32817E(C7984h1 h1Var) {
        String b = C8217e.m16510b(m32872m(h1Var));
        if (b.length() > 0 && b.charAt(0) == '#') {
            try {
                C8018s1 m = C8018s1.m16138m(C8260c.m16545a(b.substring(1)));
                if (m instanceof C8036y1) {
                    b = C8217e.m16510b(((C8036y1) m).mo20515b());
                }
            } catch (IOException e) {
                throw new IllegalStateException("unknown encoding in name: " + e);
            }
        }
        if (b.length() > 1) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 < b.length() && b.charAt(i) == '\\' && b.charAt(i2) == ' ') {
                    i += 2;
                } else {
                    int length = b.length() - 1;
                }
            }
            int length2 = b.length() - 1;
            while (true) {
                int i3 = length2 - 1;
                if (i3 > 0 && b.charAt(i3) == '\\' && b.charAt(length2) == ' ') {
                    length2 -= 2;
                } else if (i > 0 || length2 < b.length() - 1) {
                    b = b.substring(i, length2 + 1);
                }
            }
            b = b.substring(i, length2 + 1);
        }
        if (b.indexOf("  ") < 0) {
            return b;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char charAt = b.charAt(0);
        stringBuffer.append(charAt);
        for (int i4 = 1; i4 < b.length(); i4++) {
            char charAt2 = b.charAt(i4);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: E0 */
    public static final void m32818E0(C8698l lVar, Map map) {
        if (lVar instanceof C8697k) {
            C8697k kVar = (C8697k) lVar;
            C8699m trackingData = kVar.getTrackingData();
            LinkedHashMap u0 = C19294b0.m32564u0(kVar.getTrackingData().f19100a, map);
            trackingData.getClass();
            trackingData.f19100a = u0;
        } else if (lVar instanceof ITrackedObject) {
            ITrackedObject iTrackedObject = (ITrackedObject) lVar;
            Map<AnalyticsProperty, Object> trackingParameters = iTrackedObject.getTrackingParameters();
            if (trackingParameters == null) {
                iTrackedObject.setTrackingParameters(C19294b0.m32558A0(map));
            } else {
                trackingParameters.putAll(map);
            }
        } else {
            RuntimeException runtimeException = new RuntimeException("addTrackingParameters(" + map + ") called on [" + lVar + "] which does not support tracking databecause it doesn't implement [SupportsTrackingData] nor the legacy [ITrackedObject]");
            CrashUtil.m17307a().mo30457b(runtimeException);
            if (C0326j.m869n(BuildTarget.Companion)) {
                throw runtimeException;
            }
        }
    }

    /* renamed from: F */
    public static void m32819F(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    /* renamed from: F0 */
    public static final void m32820F0(C8698l lVar, List list) {
        if (lVar instanceof C8697k) {
            C8699m trackingData = ((C8697k) lVar).getTrackingData();
            trackingData.getClass();
            C19383o.m32797g(list, "<set-?>");
            trackingData.f19103d = list;
        } else if (lVar instanceof ITrackedObject) {
            ((ITrackedObject) lVar).setOnSeenTrackingEvents(list);
        } else {
            RuntimeException runtimeException = new RuntimeException("writeOnSeenTrackingEvents(" + list + ") called on [" + lVar + "] which does not support tracking databecause it doesn't implement [SupportsTrackingData] nor the legacy [ITrackedObject]");
            CrashUtil.m17307a().mo30457b(runtimeException);
            if (C0326j.m869n(BuildTarget.Companion)) {
                throw runtimeException;
            }
        }
    }

    /* renamed from: G */
    public static short[] m32821G(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            sArr[i] = (short) (bArr[i] & 255);
        }
        return sArr;
    }

    /* renamed from: G0 */
    public static final void m32822G0(C8698l lVar, int i) {
        if (lVar instanceof C8697k) {
            ((C8697k) lVar).getTrackingData().f19102c = i;
        } else if (lVar instanceof ITrackedObject) {
            ((ITrackedObject) lVar).setTrackedPosition(i);
        } else {
            RuntimeException runtimeException = new RuntimeException("writeTrackedPosition(" + i + ") called on [" + lVar + "] which does not support tracking databecause it doesn't implement [SupportsTrackingData] nor the legacy [ITrackedObject]");
            CrashUtil.m17307a().mo30457b(runtimeException);
            if (C0326j.m869n(BuildTarget.Companion)) {
                throw runtimeException;
            }
        }
    }

    /* renamed from: H */
    public static void m32823H(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j14 = j11 >>> 41;
        jArr2[0] = j12 ^ j14;
        long j15 = j14 << 10;
        jArr2[1] = j15 ^ ((j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33)));
        jArr2[2] = j13;
        jArr2[3] = 2199023255551L & j11;
    }

    /* renamed from: H0 */
    public static final void m32824H0(C8698l lVar, String str) {
        if (lVar instanceof C8697k) {
            C8699m trackingData = ((C8697k) lVar).getTrackingData();
            trackingData.getClass();
            C19383o.m32797g(str, "<set-?>");
            trackingData.f19101b = str;
        } else if (lVar instanceof ITrackedObject) {
            ((ITrackedObject) lVar).setTrackingName(str);
        } else {
            RuntimeException runtimeException = new RuntimeException("writeTrackingName(" + str + ") called on [" + lVar + "] which does not support tracking databecause it doesn't implement [SupportsTrackingData] nor the legacy [ITrackedObject]");
            CrashUtil.m17307a().mo30457b(runtimeException);
            if (C0326j.m869n(BuildTarget.Companion)) {
                throw runtimeException;
            }
        }
    }

    /* renamed from: I */
    public static void m32825I(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        m32849U(jArr, jArr2, jArr4);
        m32823H(jArr4, jArr3);
    }

    /* renamed from: I0 */
    public static double m32826I0(double d) {
        int i;
        if (Double.isNaN(d)) {
            return ShadowDrawableWrapper.COS_45;
        }
        if (Double.isInfinite(d) || d == ShadowDrawableWrapper.COS_45 || i == 0) {
            return d;
        }
        return Math.floor(Math.abs(d)) * ((double) (i > 0 ? 1 : -1));
    }

    /* renamed from: J */
    public static final void m32827J(C19515q qVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th);
            }
        }
        qVar.mo72134a(cancellationException);
    }

    /* renamed from: J0 */
    public static int m32828J0(double d) {
        int i;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == ShadowDrawableWrapper.COS_45) {
            return 0;
        }
        return (int) ((long) ((Math.floor(Math.abs(d)) * ((double) (i > 0 ? 1 : -1))) % 4.294967296E9d));
    }

    /* renamed from: K */
    public static final double m32829K(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + ClassUtils.PACKAGE_SEPARATOR_CHAR);
    }

    /* renamed from: K0 */
    public static void m32830K0(C14598c3 c3Var) {
        int J0 = m32828J0(c3Var.mo50402e("runtime.counter").zzh().doubleValue() + 1.0d);
        if (J0 <= 1000000) {
            c3Var.mo50404g("runtime.counter", new C14672i(Double.valueOf((double) J0)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: L */
    public static final float m32831L(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + ClassUtils.PACKAGE_SEPARATOR_CHAR);
    }

    /* renamed from: L0 */
    public static long m32832L0(double d) {
        return ((long) m32828J0(d)) & UnsignedInteger.INT_MASK;
    }

    /* renamed from: M */
    public static final int m32833M(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + ClassUtils.PACKAGE_SEPARATOR_CHAR);
    }

    /* renamed from: M0 */
    public static zzbl m32834M0(String str) {
        zzbl zzbl = null;
        if (str != null && !str.isEmpty()) {
            zzbl = zzbl.zza(Integer.parseInt(str));
        }
        if (zzbl != null) {
            return zzbl;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    /* renamed from: N */
    public static final long m32835N(long j, long j2) {
        if (0 > j2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(j2);
            sb.append(" is less than minimum ");
            throw new IllegalArgumentException(C0015b.m91j(sb, 0, ClassUtils.PACKAGE_SEPARATOR_CHAR));
        } else if (j < 0) {
            return 0;
        } else {
            return j > j2 ? j2 : j;
        }
    }

    /* renamed from: N0 */
    public static Object m32836N0(C14763p pVar) {
        if (C14763p.f33034h0.equals(pVar)) {
            return null;
        }
        if (C14763p.f33033g0.equals(pVar)) {
            return "";
        }
        if (pVar instanceof C14724m) {
            return m32838O0((C14724m) pVar);
        }
        if (!(pVar instanceof C14633f)) {
            return !pVar.zzh().isNaN() ? pVar.zzh() : pVar.zzi();
        }
        ArrayList arrayList = new ArrayList();
        C14633f fVar = (C14633f) pVar;
        fVar.getClass();
        int i = 0;
        while (true) {
            if (!(i < fVar.mo50490m())) {
                return arrayList;
            }
            if (i < fVar.mo50490m()) {
                int i2 = i + 1;
                Object N0 = m32836N0(fVar.mo50491n(i));
                if (N0 != null) {
                    arrayList.add(N0);
                }
                i = i2;
            } else {
                throw new NoSuchElementException(C0072d.m200g(32, "Out of bounds index: ", i));
            }
        }
    }

    /* renamed from: O */
    public static final Comparable m32837O(Comparable comparable, C20053e eVar) {
        C19383o.m32797g(comparable, "<this>");
        C19383o.m32797g(eVar, "range");
        if (!eVar.isEmpty()) {
            return (!eVar.mo74314a(comparable, eVar.mo74309c()) || eVar.mo74314a(eVar.mo74309c(), comparable)) ? (!eVar.mo74314a(eVar.mo74311g(), comparable) || eVar.mo74314a(comparable, eVar.mo74311g())) ? comparable : eVar.mo74311g() : eVar.mo74309c();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + eVar + ClassUtils.PACKAGE_SEPARATOR_CHAR);
    }

    /* renamed from: O0 */
    public static HashMap m32838O0(C14724m mVar) {
        HashMap hashMap = new HashMap();
        mVar.getClass();
        Iterator it = new ArrayList(mVar.f32939b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object N0 = m32836N0(mVar.mo50489l(str));
            if (N0 != null) {
                hashMap.put(str, N0);
            }
        }
        return hashMap;
    }

    /* renamed from: P */
    public static final int m32839P(float f) {
        return ((int) ((float) (f >= 0.0f ? Math.ceil((double) f) : Math.floor((double) f)))) * -1;
    }

    /* renamed from: P0 */
    public static void m32840P0(String str, List list, int i) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: Q */
    public static final C19340c m32841Q(C19857l lVar, C19340c cVar) {
        C19383o.m32797g(lVar, "<this>");
        C19383o.m32797g(cVar, "completion");
        if (lVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) lVar).create(cVar);
        }
        CoroutineContext context = cVar.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new C19344xa50de660(cVar, lVar) : new C19345xa50de661(cVar, context, lVar);
    }

    /* renamed from: Q0 */
    public static void m32842Q0(String str, List list, int i) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: R */
    public static final C19340c m32843R(C19861p pVar, Object obj, C19340c cVar) {
        C19383o.m32797g(pVar, "<this>");
        C19383o.m32797g(cVar, "completion");
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(obj, cVar);
        }
        CoroutineContext context = cVar.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new C19346xa50de662(cVar, pVar, obj) : new C19347xa50de663(cVar, context, pVar, obj);
    }

    /* renamed from: R0 */
    public static void m32844R0(String str, ArrayList arrayList, int i) {
        if (arrayList.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(arrayList.size())}));
        }
    }

    /* renamed from: S */
    public static void m32845S(Object obj, String str, String str2) {
        Log.d(m32864h0(str), String.format(str2, new Object[]{obj}));
    }

    /* renamed from: S0 */
    public static boolean m32846S0(C14763p pVar) {
        if (pVar == null) {
            return false;
        }
        Double zzh = pVar.zzh();
        return !zzh.isNaN() && zzh.doubleValue() >= ShadowDrawableWrapper.COS_45 && zzh.equals(Double.valueOf(Math.floor(zzh.doubleValue())));
    }

    /* renamed from: T */
    public static void m32847T(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        m32871l0(jArr, jArr3);
        m32823H(jArr3, jArr2);
    }

    /* renamed from: T0 */
    public static boolean m32848T0(C14763p pVar, C14763p pVar2) {
        if (!pVar.getClass().equals(pVar2.getClass())) {
            return false;
        }
        if ((pVar instanceof C14825u) || (pVar instanceof C14737n)) {
            return true;
        }
        if (!(pVar instanceof C14672i)) {
            return pVar instanceof C14813t ? pVar.zzi().equals(pVar2.zzi()) : pVar instanceof C14646g ? pVar.zzg().equals(pVar2.zzg()) : pVar == pVar2;
        }
        if (Double.isNaN(pVar.zzh().doubleValue()) || Double.isNaN(pVar2.zzh().doubleValue())) {
            return false;
        }
        return pVar.zzh().equals(pVar2.zzh());
    }

    /* renamed from: U */
    public static void m32849U(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        m32855a0(jArr, jArr4);
        m32855a0(jArr2, jArr5);
        long[] jArr6 = jArr3;
        m32877p(jArr4[0], jArr5[0], jArr6, 0);
        m32877p(jArr4[1], jArr5[1], jArr6, 1);
        m32877p(jArr4[2], jArr5[2], jArr6, 2);
        m32877p(jArr4[3], jArr5[3], jArr6, 3);
        int i = 5;
        while (i > 0) {
            int i2 = i - 1;
            jArr3[i] = jArr3[i] ^ jArr3[i2];
            i = i2;
        }
        m32877p(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        m32877p(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i3 = 7; i3 > 1; i3--) {
            jArr3[i3] = jArr3[i3] ^ jArr3[i3 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        m32877p(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        m32877p(j, j3, jArr7, 0);
        m32877p(j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = jArr3[3] ^ (j5 ^ j6);
        jArr3[3] = j9;
        long j10 = jArr3[4] ^ (j7 ^ j6);
        jArr3[4] = j10;
        long j11 = jArr3[5] ^ j7;
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 59);
        jArr3[1] = (j13 >>> 5) ^ (j8 << 54);
        jArr3[2] = (j8 >>> 10) ^ (j9 << 49);
        jArr3[3] = (j9 >>> 15) ^ (j10 << 44);
        jArr3[4] = (j10 >>> 20) ^ (j11 << 39);
        jArr3[5] = (j11 >>> 25) ^ (j14 << 34);
        jArr3[6] = (j14 >>> 30) ^ (j15 << 29);
        jArr3[7] = j15 >>> 35;
    }

    /* renamed from: V */
    public static void m32850V(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException(C0326j.m864i("Bundle must contain ", str));
        }
    }

    /* renamed from: W */
    public static final LinkedHashMap m32851W(String str) {
        List x1 = C19459m.m33055x1(C19459m.m33029B1(RFC1522Codec.SEP, str, ""), new char[]{'&'}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object next : x1) {
            String str2 = (String) next;
            int i = 0;
            for (int i2 = 0; i2 < str2.length(); i2++) {
                if (str2.charAt(i2) == '=') {
                    i++;
                }
            }
            if (i == 1) {
                arrayList.add(next);
            }
        }
        int T = C19421p.m32930T(C19322o.m32624F0(arrayList));
        if (T < 16) {
            T = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(T);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List x12 = C19459m.m33055x1((String) it.next(), new char[]{'='}, 2, 2);
            Pair pair = new Pair((String) x12.get(0), (String) x12.get(1));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* renamed from: X */
    public static final LayoutNode m32852X(LayoutNode layoutNode, C19857l lVar) {
        C19383o.m32797g(layoutNode, "<this>");
        if (((Boolean) lVar.invoke(layoutNode)).booleanValue()) {
            return layoutNode;
        }
        C7734e.C7735a aVar = (C7734e.C7735a) layoutNode.mo6764u();
        int i = aVar.f17158b.f17157d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode X = m32852X((LayoutNode) aVar.get(i2), lVar);
            if (X != null) {
                return X;
            }
        }
        return null;
    }

    /* renamed from: Y */
    public static final void m32853Y(LayoutNode layoutNode, List list) {
        ArrayList arrayList;
        C19383o.m32797g(layoutNode, "<this>");
        C19383o.m32797g(list, ResponseConstants.LIST);
        if (layoutNode.mo6696c()) {
            ArrayList arrayList2 = new ArrayList();
            C7734e.C7735a aVar = (C7734e.C7735a) layoutNode.mo6764u();
            int i = aVar.f17158b.f17157d;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode2 = (LayoutNode) aVar.get(i2);
                if (layoutNode2.mo6696c()) {
                    arrayList2.add(new NodeLocationHolder(layoutNode, layoutNode2));
                }
            }
            try {
                NodeLocationHolder.ComparisonStrategy comparisonStrategy = NodeLocationHolder.f4177f;
                NodeLocationHolder.ComparisonStrategy comparisonStrategy2 = NodeLocationHolder.ComparisonStrategy.Stripe;
                C19383o.m32797g(comparisonStrategy2, "<set-?>");
                NodeLocationHolder.f4177f = comparisonStrategy2;
                arrayList = C19327t.m32661q1(arrayList2);
                C19323p.m32626H0(arrayList);
            } catch (IllegalArgumentException unused) {
                NodeLocationHolder.ComparisonStrategy comparisonStrategy3 = NodeLocationHolder.f4177f;
                NodeLocationHolder.ComparisonStrategy comparisonStrategy4 = NodeLocationHolder.ComparisonStrategy.Location;
                C19383o.m32797g(comparisonStrategy4, "<set-?>");
                NodeLocationHolder.f4177f = comparisonStrategy4;
                arrayList = C19327t.m32661q1(arrayList2);
                C19323p.m32626H0(arrayList);
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(((NodeLocationHolder) arrayList.get(i3)).f4179c);
            }
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                LayoutNode layoutNode3 = (LayoutNode) arrayList3.get(i4);
                C1904k T = C18263b.m30825T(layoutNode3);
                if (T != null) {
                    list.add(T);
                } else {
                    m32853Y(layoutNode3, list);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = r0.f3919b;
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p015ui.node.LayoutNodeWrapper m32854Z(androidx.compose.p015ui.node.LayoutNode r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            androidx.compose.ui.semantics.k r0 = p628nj.C18263b.m30824S(r1)
            if (r0 != 0) goto L_0x000f
            androidx.compose.ui.semantics.k r0 = p628nj.C18263b.m30825T(r1)
        L_0x000f:
            if (r0 == 0) goto L_0x0015
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r0.f3919b
            if (r0 != 0) goto L_0x0017
        L_0x0015:
            androidx.compose.ui.node.d r0 = r1.f3800D
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C19388s.m32854Z(androidx.compose.ui.node.LayoutNode):androidx.compose.ui.node.LayoutNodeWrapper");
    }

    /* renamed from: a0 */
    public static void m32855a0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
    }

    /* renamed from: b0 */
    public static final void m32856b0() {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /* renamed from: c0 */
    public static final int m32857c0(TextView textView) {
        C19383o.m32797g(textView, "<this>");
        TextPaint paint = textView.getPaint();
        C19383o.m32796f(paint, "this.paint");
        float measureText = paint.measureText(Constants.APPBOY_PUSH_CONTENT_KEY, 0, 1);
        Context context = textView.getContext();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (C8914m.f19669c == 0.0f) {
            C8914m.m17348f(context);
        }
        return C7279a.m13954l(((float) Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels)) / measureText);
    }

    /* renamed from: d */
    public static final long m32858d(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & UnsignedInteger.INT_MASK) | (floatToIntBits << 32);
        int i = C7285e.f16158d;
        return floatToIntBits2;
    }

    /* renamed from: e */
    public static final long m32859e(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & UnsignedInteger.INT_MASK) | (floatToIntBits << 32);
        int i = C7286f.f16162d;
        return floatToIntBits2;
    }

    /* renamed from: e0 */
    public static final ArrayList m32860e0(FacetCount facetCount, String str) {
        if (!(facetCount == null || str == null)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(new Pair(facetCount, EmptyList.INSTANCE));
            while (!linkedList.isEmpty()) {
                Pair pair = (Pair) linkedList.pop();
                FacetCount facetCount2 = (FacetCount) pair.component1();
                List list = (List) pair.component2();
                if (C19383o.m32792b(facetCount2.getId(), str)) {
                    return C19327t.m32651g1(list, facetCount2);
                }
                ArrayList g1 = C19327t.m32651g1(list, facetCount2);
                List<FacetCount> children = facetCount2.getChildren();
                C19383o.m32796f(children, "headFacet.children");
                for (FacetCount pair2 : C19327t.m32656l1(children, new C10797c())) {
                    linkedList.addLast(new Pair(pair2, g1));
                }
            }
        }
        return null;
    }

    /* renamed from: f0 */
    public static final List m32861f0(C8698l lVar) {
        C19383o.m32797g(lVar, "<this>");
        return lVar instanceof C8697k ? ((C8697k) lVar).getTrackingData().f19103d : lVar instanceof ITrackedObject ? ((ITrackedObject) lVar).getOnSeenTrackingEvents() : new ArrayList();
    }

    /* renamed from: g */
    public static final StateFlowImpl m32862g(Object obj) {
        if (obj == null) {
            obj = C20203a.f44778h;
        }
        return new StateFlowImpl(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r1 = ((com.etsy.android.lib.logger.ITrackedObject) r1).getTrackingName();
     */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m32863g0(com.etsy.android.lib.logger.C8698l r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            boolean r0 = r1 instanceof com.etsy.android.lib.logger.C8697k
            if (r0 == 0) goto L_0x0012
            com.etsy.android.lib.logger.k r1 = (com.etsy.android.lib.logger.C8697k) r1
            com.etsy.android.lib.logger.m r1 = r1.getTrackingData()
            java.lang.String r1 = r1.f19101b
            goto L_0x0020
        L_0x0012:
            boolean r0 = r1 instanceof com.etsy.android.lib.logger.ITrackedObject
            if (r0 == 0) goto L_0x001e
            com.etsy.android.lib.logger.ITrackedObject r1 = (com.etsy.android.lib.logger.ITrackedObject) r1
            java.lang.String r1 = r1.getTrackingName()
            if (r1 != 0) goto L_0x0020
        L_0x001e:
            java.lang.String r1 = ""
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C19388s.m32863g0(com.etsy.android.lib.logger.l):java.lang.String");
    }

    /* renamed from: h0 */
    public static String m32864h0(String str) {
        return C0326j.m864i("TransportRuntime.", str);
    }

    /* renamed from: i */
    public static int m32865i(int i, byte[] bArr) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 24);
    }

    /* renamed from: i0 */
    public static final C19525d0 m32866i0(C2866i0 i0Var) {
        C19383o.m32797g(i0Var, "<this>");
        C19525d0 d0Var = (C19525d0) i0Var.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (d0Var != null) {
            return d0Var;
        }
        C19838x1 j = C0005b.m44j();
        C20153b bVar = C19760n0.f43719a;
        Object tagIfAbsent = i0Var.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C2850d(j.plus(C19729m.f43681a.mo72111E0())));
        C19383o.m32796f(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (C19525d0) tagIfAbsent;
    }

    /* renamed from: j */
    public static String m32867j(EncryptionMethod encryptionMethod, Set set) {
        return "Unsupported JWE encryption method " + encryptionMethod + ", must be " + m32870l(set);
    }

    /* renamed from: j0 */
    public static final C1436d m32868j0(C1436d dVar, C19857l lVar) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(lVar, "block");
        C19857l<C1859o0, C19394m> lVar2 = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new BlockGraphicsLayerModifier(lVar));
    }

    /* renamed from: k0 */
    public static C1436d m32869k0(C1436d dVar, float f, float f2, float f3, float f4, float f5, C1530k0 k0Var, boolean z, int i) {
        C1436d dVar2 = dVar;
        int i2 = i;
        float f6 = (i2 & 1) != 0 ? 1.0f : f;
        float f7 = (i2 & 2) != 0 ? 1.0f : f2;
        float f8 = (i2 & 4) != 0 ? 1.0f : f3;
        float f9 = (i2 & 16) != 0 ? 0.0f : f4;
        float f10 = (i2 & 256) != 0 ? 0.0f : f5;
        float f11 = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? 8.0f : 0.0f;
        long j = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? C1540p0.f3337b : 0;
        C1530k0 k0Var2 = (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? C1517e0.f3292a : k0Var;
        boolean z2 = (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z;
        long j2 = (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? C1603w.f3569a : 0;
        long j3 = (i2 & 32768) != 0 ? C1603w.f3569a : 0;
        C19383o.m32797g(dVar2, "$this$graphicsLayer");
        C19383o.m32797g(k0Var2, "shape");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar2.mo6148i0(new SimpleGraphicsLayerModifier(f6, f7, f8, 0.0f, f9, 0.0f, 0.0f, 0.0f, f10, f11, j, k0Var2, z2, (C1520f0) null, j2, j3));
    }

    /* renamed from: l */
    public static String m32870l(Set set) {
        String str;
        StringBuilder sb = new StringBuilder();
        Object[] array = set.toArray();
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                if (i < array.length - 1) {
                    str = ", ";
                } else if (i == array.length - 1) {
                    str = " or ";
                }
                sb.append(str);
            }
            sb.append(array[i].toString());
        }
        return sb.toString();
    }

    /* renamed from: l0 */
    public static void m32871l0(long[] jArr, long[] jArr2) {
        C0114h.m331z(jArr2, 0, jArr[0]);
        C0114h.m331z(jArr2, 2, jArr[1]);
        C0114h.m331z(jArr2, 4, jArr[2]);
        long j = jArr[3];
        jArr2[6] = C0114h.m277H((int) j);
        jArr2[7] = ((long) C0114h.m269B((int) (j >>> 32))) & UnsignedInteger.INT_MASK;
    }

    /* renamed from: m */
    public static String m32872m(C7984h1 h1Var) {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        if (!(h1Var instanceof C8036y1) || (h1Var instanceof C7998m0)) {
            try {
                stringBuffer.append('#');
                byte[] a = h1Var.mo12996i().mo20561a("DER");
                C8261d dVar = C8260c.f18096a;
                stringBuffer.append(C8217e.m16511c(C8260c.m16546b(0, a.length, a)));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String b = ((C8036y1) h1Var).mo20515b();
            if (b.length() > 0 && b.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(b);
        }
        int length = stringBuffer.length();
        int i3 = 2;
        if (!(stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#')) {
            i3 = 0;
        }
        while (i != length) {
            char charAt = stringBuffer.charAt(i);
            if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            stringBuffer.insert(i, "\\");
            i += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' ') {
                stringBuffer.insert(i2, "\\");
                i2 += 2;
            }
        }
        int length2 = stringBuffer.length() - 1;
        while (length2 >= 0 && stringBuffer.charAt(length2) == ' ') {
            stringBuffer.insert(length2, '\\');
            length2--;
        }
        return stringBuffer.toString();
    }

    /* renamed from: m0 */
    public static final C19340c m32873m0(C19340c cVar) {
        C19340c<Object> intercepted;
        C19383o.m32797g(cVar, "<this>");
        ContinuationImpl continuationImpl = cVar instanceof ContinuationImpl ? (ContinuationImpl) cVar : null;
        return (continuationImpl == null || (intercepted = continuationImpl.intercepted()) == null) ? cVar : intercepted;
    }

    /* renamed from: n */
    public static void m32874n(int i, int i2, byte[] bArr) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* renamed from: n0 */
    public static final C10789b m32875n0(FacetCount facetCount, int i, boolean z, String str, List list) {
        C19383o.m32797g(facetCount, "<this>");
        C19383o.m32797g(list, "facetPathDescription");
        String id = facetCount.getId();
        String valueOf = String.valueOf(facetCount.getName());
        String Z0 = C19327t.m32644Z0(list, EditableListing.CATEGORY_PATH_JOIN_STRING, (String) null, (String) null, (C19857l) null, 62);
        C19383o.m32796f(id, "id");
        return new C10789b(id, valueOf, z, str, i, Z0);
    }

    /* renamed from: o0 */
    public static void m32876o0(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof C0355u0) {
                    editorInfo.hintText = ((C0355u0) parent).mo3172a();
                    return;
                }
            }
        }
    }

    /* renamed from: p */
    public static void m32877p(long j, long j2, long[] jArr, int i) {
        long j3 = j;
        long[] jArr2 = new long[8];
        jArr2[1] = j2;
        long j4 = j2 << 1;
        jArr2[2] = j4;
        long j5 = j4 ^ j2;
        jArr2[3] = j5;
        long j6 = j4 << 1;
        jArr2[4] = j6;
        jArr2[5] = j6 ^ j2;
        long j7 = j5 << 1;
        jArr2[6] = j7;
        jArr2[7] = j7 ^ j2;
        int i2 = (int) j3;
        long j8 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j9 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j3 >>> i3);
            long j10 = jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (576460752303423487L & j8);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j8 >>> 59) ^ (j9 << 5));
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0358 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0196  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p015ui.graphics.painter.Painter m32878p0(int r39, androidx.compose.runtime.C1302d r40) {
        /*
            r0 = r39
            r1 = r40
            r2 = 473971343(0x1c403a8f, float:6.3603156E-22)
            r1.mo5465u(r2)
            androidx.compose.runtime.l1 r2 = androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt.f3987b
            java.lang.Object r2 = r1.mo5410J(r2)
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.Resources r3 = r2.getResources()
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo5465u(r4)
            java.lang.Object r4 = r40.mo5467v()
            androidx.compose.runtime.d$a$a r5 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r4 != r5) goto L_0x002c
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            r1.mo5454o(r4)
        L_0x002c:
            r40.mo5406H()
            android.util.TypedValue r4 = (android.util.TypedValue) r4
            r6 = 1
            r3.getValue(r0, r4, r6)
            java.lang.CharSequence r4 = r4.string
            r7 = 0
            r8 = 0
            if (r4 == 0) goto L_0x0045
            java.lang.String r9 = ".xml"
            boolean r9 = kotlin.text.C19459m.m33038g1(r4, r9)
            if (r9 != r6) goto L_0x0045
            r9 = r6
            goto L_0x0046
        L_0x0045:
            r9 = r8
        L_0x0046:
            java.lang.String r10 = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG"
            if (r9 == 0) goto L_0x03bf
            r4 = -738265321(0xffffffffd3fef717, float:-2.19013435E12)
            r1.mo5465u(r4)
            android.content.res.Resources$Theme r2 = r2.getTheme()
            java.lang.String r4 = "context.theme"
            kotlin.jvm.internal.C19383o.m32796f(r2, r4)
            r4 = 2112503116(0x7dea3d4c, float:3.8919703E37)
            r1.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt.f3988c
            java.lang.Object r4 = r1.mo5410J(r4)
            h0.b r4 = (p122h0.C6906b) r4
            h0.b$b r5 = new h0.b$b
            r5.<init>(r2, r0)
            r4.getClass()
            java.util.HashMap<h0.b$b, java.lang.ref.WeakReference<h0.b$a>> r9 = r4.f15284a
            java.lang.Object r9 = r9.get(r5)
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            if (r9 == 0) goto L_0x007f
            java.lang.Object r7 = r9.get()
            h0.b$a r7 = (p122h0.C6906b.C6907a) r7
        L_0x007f:
            if (r7 != 0) goto L_0x03b2
            android.content.res.XmlResourceParser r0 = r3.getXml(r0)
            java.lang.String r7 = "res.getXml(id)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r7)
            int r7 = r0.next()
        L_0x008e:
            r9 = 2
            if (r7 == r9) goto L_0x0098
            if (r7 == r6) goto L_0x0098
            int r7 = r0.next()
            goto L_0x008e
        L_0x0098:
            if (r7 != r9) goto L_0x03aa
            java.lang.String r7 = r0.getName()
            java.lang.String r11 = "vector"
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r11)
            if (r7 == 0) goto L_0x03a4
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r0)
            a0.a r10 = new a0.a
            r10.<init>(r0)
            java.lang.String r11 = "attrs"
            kotlin.jvm.internal.C19383o.m32796f(r7, r11)
            int[] r11 = p001a0.C0005b.f4b
            android.content.res.TypedArray r11 = r10.mo7e(r3, r2, r7, r11)
            java.lang.String r12 = "autoMirrored"
            boolean r12 = p280x0.C8299j.m16595h(r0, r12)
            r13 = 5
            if (r12 != 0) goto L_0x00c6
            r23 = r8
            goto L_0x00cc
        L_0x00c6:
            boolean r12 = r11.getBoolean(r13, r8)
            r23 = r12
        L_0x00cc:
            int r12 = r11.getChangingConfigurations()
            r10.mo9f(r12)
            java.lang.String r12 = "viewportWidth"
            r15 = 7
            r14 = 0
            float r18 = r10.mo4b(r11, r12, r15, r14)
            java.lang.String r12 = "viewportHeight"
            r8 = 8
            float r19 = r10.mo4b(r11, r12, r8, r14)
            int r12 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x0389
            int r12 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x036e
            r12 = 3
            float r16 = r11.getDimension(r12, r14)
            int r15 = r11.getChangingConfigurations()
            r10.mo9f(r15)
            float r15 = r11.getDimension(r9, r14)
            int r14 = r11.getChangingConfigurations()
            r10.mo9f(r14)
            boolean r14 = r11.hasValue(r6)
            if (r14 == 0) goto L_0x0130
            android.util.TypedValue r14 = new android.util.TypedValue
            r14.<init>()
            r11.getValue(r6, r14)
            int r14 = r14.type
            if (r14 != r9) goto L_0x0117
            long r20 = androidx.compose.p015ui.graphics.C1545s.f3364i
            goto L_0x0132
        L_0x0117:
            android.content.res.ColorStateList r14 = p280x0.C8299j.m16589b(r11, r0, r2)
            int r8 = r11.getChangingConfigurations()
            r10.mo9f(r8)
            if (r14 == 0) goto L_0x012d
            int r8 = r14.getDefaultColor()
            long r20 = p628nj.C18263b.m30834b(r8)
            goto L_0x0132
        L_0x012d:
            long r20 = androidx.compose.p015ui.graphics.C1545s.f3364i
            goto L_0x0132
        L_0x0130:
            long r20 = androidx.compose.p015ui.graphics.C1545s.f3364i
        L_0x0132:
            r8 = 6
            r14 = -1
            int r9 = r11.getInt(r8, r14)
            int r8 = r11.getChangingConfigurations()
            r10.mo9f(r8)
            r8 = 9
            if (r9 == r14) goto L_0x015c
            if (r9 == r12) goto L_0x0159
            if (r9 == r13) goto L_0x015c
            if (r9 == r8) goto L_0x0156
            switch(r9) {
                case 14: goto L_0x0153;
                case 15: goto L_0x0150;
                case 16: goto L_0x014d;
                default: goto L_0x014c;
            }
        L_0x014c:
            goto L_0x015c
        L_0x014d:
            r9 = 12
            goto L_0x015d
        L_0x0150:
            r9 = 14
            goto L_0x015d
        L_0x0153:
            r9 = 13
            goto L_0x015d
        L_0x0156:
            r22 = r8
            goto L_0x015f
        L_0x0159:
            r22 = r12
            goto L_0x015f
        L_0x015c:
            r9 = r13
        L_0x015d:
            r22 = r9
        L_0x015f:
            android.util.DisplayMetrics r9 = r3.getDisplayMetrics()
            float r9 = r9.density
            float r16 = r16 / r9
            android.util.DisplayMetrics r9 = r3.getDisplayMetrics()
            float r9 = r9.density
            float r9 = r15 / r9
            r11.recycle()
            androidx.compose.ui.graphics.vector.c$a r11 = new androidx.compose.ui.graphics.vector.c$a
            java.lang.String r15 = ""
            r8 = 0
            r14 = r11
            r17 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r22, r23)
            r9 = 0
        L_0x017e:
            int r14 = r0.getEventType()
            if (r14 == r6) goto L_0x0193
            int r14 = r0.getDepth()
            if (r14 >= r6) goto L_0x0191
            int r14 = r0.getEventType()
            if (r14 != r12) goto L_0x0191
            goto L_0x0193
        L_0x0191:
            r14 = 0
            goto L_0x0194
        L_0x0193:
            r14 = r6
        L_0x0194:
            if (r14 != 0) goto L_0x0358
            org.xmlpull.v1.XmlPullParser r14 = r10.f2a
            int r14 = r14.getEventType()
            java.lang.String r15 = "group"
            r6 = 2
            if (r14 == r6) goto L_0x01c0
            if (r14 == r12) goto L_0x01a5
            goto L_0x0249
        L_0x01a5:
            org.xmlpull.v1.XmlPullParser r6 = r10.f2a
            java.lang.String r6 = r6.getName()
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r15, r6)
            if (r6 == 0) goto L_0x0249
            int r9 = r9 + 1
            r6 = 0
        L_0x01b4:
            if (r6 >= r9) goto L_0x01bc
            r11.mo6448e()
            int r6 = r6 + 1
            goto L_0x01b4
        L_0x01bc:
            r8 = 0
            r9 = 0
            goto L_0x024a
        L_0x01c0:
            org.xmlpull.v1.XmlPullParser r6 = r10.f2a
            java.lang.String r6 = r6.getName()
            if (r6 == 0) goto L_0x0249
            int r14 = r6.hashCode()
            r12 = -1649314686(0xffffffff9db17482, float:-4.6971976E-21)
            java.lang.String r17 = ""
            if (r14 == r12) goto L_0x030f
            r12 = 3433509(0x346425, float:4.811371E-39)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r14 == r12) goto L_0x0240
            r12 = 98629247(0x5e0f67f, float:2.1155407E-35)
            if (r14 == r12) goto L_0x01e0
            goto L_0x01e6
        L_0x01e0:
            boolean r6 = r6.equals(r15)
            if (r6 != 0) goto L_0x01e8
        L_0x01e6:
            r12 = 7
            goto L_0x0249
        L_0x01e8:
            int[] r6 = p001a0.C0005b.f5c
            android.content.res.TypedArray r6 = r10.mo7e(r3, r2, r7, r6)
            java.lang.String r12 = "rotation"
            r14 = 0
            float r26 = r10.mo4b(r6, r12, r13, r14)
            r12 = 1
            float r27 = r6.getFloat(r12, r14)
            int r12 = r6.getChangingConfigurations()
            r10.mo9f(r12)
            r12 = 2
            float r28 = r6.getFloat(r12, r14)
            int r12 = r6.getChangingConfigurations()
            r10.mo9f(r12)
            java.lang.String r12 = "scaleX"
            r15 = 3
            float r29 = r10.mo4b(r6, r12, r15, r8)
            java.lang.String r12 = "scaleY"
            r15 = 4
            float r30 = r10.mo4b(r6, r12, r15, r8)
            java.lang.String r8 = "translateX"
            r12 = 6
            float r31 = r10.mo4b(r6, r8, r12, r14)
            java.lang.String r8 = "translateY"
            r12 = 7
            float r32 = r10.mo4b(r6, r8, r12, r14)
            r8 = 0
            java.lang.String r14 = r10.mo6d(r6, r8)
            if (r14 != 0) goto L_0x0233
            r25 = r17
            goto L_0x0235
        L_0x0233:
            r25 = r14
        L_0x0235:
            r6.recycle()
            kotlin.collections.EmptyList r33 = androidx.compose.p015ui.graphics.vector.C1583j.f3538a
            r24 = r11
            r24.mo6445a(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0249
        L_0x0240:
            r12 = 7
            java.lang.String r14 = "path"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x024f
        L_0x0249:
            r8 = 0
        L_0x024a:
            r12 = 1
            r13 = 13
            goto L_0x034f
        L_0x024f:
            int[] r6 = p001a0.C0005b.f6d
            android.content.res.TypedArray r6 = r10.mo7e(r3, r2, r7, r6)
            org.xmlpull.v1.XmlPullParser r14 = r10.f2a
            java.lang.String r15 = "pathData"
            boolean r14 = p280x0.C8299j.m16595h(r14, r15)
            if (r14 == 0) goto L_0x0307
            r14 = 0
            java.lang.String r15 = r10.mo6d(r6, r14)
            if (r15 != 0) goto L_0x0269
            r37 = r17
            goto L_0x026b
        L_0x0269:
            r37 = r15
        L_0x026b:
            r14 = 2
            java.lang.String r15 = r10.mo6d(r6, r14)
            java.util.List r38 = androidx.compose.p015ui.graphics.vector.C1583j.m3418a(r15)
            java.lang.String r15 = "fillColor"
            r13 = 1
            x0.c r15 = r10.mo3a(r6, r2, r15, r13)
            java.lang.String r12 = "fillAlpha"
            r14 = 12
            float r25 = r10.mo4b(r6, r12, r14, r8)
            java.lang.String r12 = "strokeLineCap"
            r8 = 8
            r14 = -1
            int r12 = r10.mo5c(r6, r12, r8, r14)
            r8 = 2
            if (r12 == 0) goto L_0x029a
            if (r12 == r13) goto L_0x0297
            if (r12 == r8) goto L_0x0294
            goto L_0x029a
        L_0x0294:
            r33 = r8
            goto L_0x029c
        L_0x0297:
            r33 = r13
            goto L_0x029c
        L_0x029a:
            r33 = 0
        L_0x029c:
            java.lang.String r12 = "strokeLineJoin"
            r8 = 9
            int r12 = r10.mo5c(r6, r12, r8, r14)
            if (r12 == 0) goto L_0x02ae
            if (r12 == r13) goto L_0x02ab
            r34 = 2
            goto L_0x02b0
        L_0x02ab:
            r34 = 1
            goto L_0x02b0
        L_0x02ae:
            r34 = 0
        L_0x02b0:
            r12 = 10
            java.lang.String r13 = "strokeMiterLimit"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r28 = r10.mo4b(r6, r13, r12, r8)
            java.lang.String r12 = "strokeColor"
            r13 = 3
            x0.c r12 = r10.mo3a(r6, r2, r12, r13)
            r13 = 11
            java.lang.String r14 = "strokeAlpha"
            float r26 = r10.mo4b(r6, r14, r13, r8)
            java.lang.String r13 = "strokeWidth"
            r14 = 4
            float r27 = r10.mo4b(r6, r13, r14, r8)
            java.lang.String r13 = "trimPathEnd"
            r14 = 6
            float r30 = r10.mo4b(r6, r13, r14, r8)
            java.lang.String r8 = "trimPathOffset"
            r13 = 7
            r14 = 0
            float r31 = r10.mo4b(r6, r8, r13, r14)
            java.lang.String r8 = "trimPathStart"
            r13 = 5
            float r29 = r10.mo4b(r6, r8, r13, r14)
            java.lang.String r8 = "fillType"
            r13 = 13
            r14 = 0
            int r8 = r10.mo5c(r6, r8, r13, r14)
            r6.recycle()
            androidx.compose.ui.graphics.m r35 = com.google.android.play.core.appupdate.C15562d.m25181S(r15)
            androidx.compose.ui.graphics.m r36 = com.google.android.play.core.appupdate.C15562d.m25181S(r12)
            if (r8 != 0) goto L_0x02ff
            r32 = 0
            goto L_0x0301
        L_0x02ff:
            r32 = 1
        L_0x0301:
            r24 = r11
            r24.mo6446b(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            goto L_0x0319
        L_0x0307:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No path data available"
            r0.<init>(r1)
            throw r0
        L_0x030f:
            r13 = 13
            java.lang.String r8 = "clip-path"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x031c
        L_0x0319:
            r8 = 0
            r12 = 1
            goto L_0x034f
        L_0x031c:
            int[] r6 = p001a0.C0005b.f7e
            android.content.res.TypedArray r6 = r10.mo7e(r3, r2, r7, r6)
            r8 = 0
            java.lang.String r12 = r10.mo6d(r6, r8)
            if (r12 != 0) goto L_0x032c
            r25 = r17
            goto L_0x032e
        L_0x032c:
            r25 = r12
        L_0x032e:
            r12 = 1
            java.lang.String r14 = r10.mo6d(r6, r12)
            java.util.List r33 = androidx.compose.p015ui.graphics.vector.C1583j.m3418a(r14)
            r6.recycle()
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 1065353216(0x3f800000, float:1.0)
            r30 = 1065353216(0x3f800000, float:1.0)
            r31 = 0
            r32 = 0
            r24 = r11
            r24.mo6445a(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r9 = r9 + 1
        L_0x034f:
            r0.next()
            r6 = r12
            r8 = 0
            r12 = 3
            r13 = 5
            goto L_0x017e
        L_0x0358:
            h0.b$a r7 = new h0.b$a
            androidx.compose.ui.graphics.vector.c r0 = r11.mo6447d()
            int r2 = r10.f3b
            r7.<init>(r0, r2)
            java.util.HashMap<h0.b$b, java.lang.ref.WeakReference<h0.b$a>> r0 = r4.f15284a
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r7)
            r0.put(r5, r2)
            goto L_0x03b2
        L_0x036e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r11.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = "<VectorGraphic> tag requires viewportHeight > 0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0389:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r11.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = "<VectorGraphic> tag requires viewportWidth > 0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x03a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x03aa:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        L_0x03b2:
            androidx.compose.ui.graphics.vector.c r0 = r7.f15285a
            r40.mo5406H()
            androidx.compose.ui.graphics.vector.VectorPainter r0 = androidx.compose.p015ui.graphics.vector.VectorPainterKt.m3393b(r0, r1)
            r40.mo5406H()
            goto L_0x03f4
        L_0x03bf:
            r2 = -738265196(0xffffffffd3fef794, float:-2.19015073E12)
            r1.mo5465u(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r39)
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo5465u(r6)
            boolean r4 = r1.mo5408I(r4)
            boolean r2 = r1.mo5408I(r2)
            r2 = r2 | r4
            java.lang.Object r4 = r40.mo5467v()
            if (r2 != 0) goto L_0x03e0
            if (r4 != r5) goto L_0x03e7
        L_0x03e0:
            androidx.compose.ui.graphics.d r4 = p628nj.C18263b.m30833a0(r3, r0)     // Catch:{ all -> 0x03f8 }
            r1.mo5454o(r4)
        L_0x03e7:
            r40.mo5406H()
            androidx.compose.ui.graphics.x r4 = (androidx.compose.p015ui.graphics.C1604x) r4
            androidx.compose.ui.graphics.painter.a r0 = new androidx.compose.ui.graphics.painter.a
            r0.<init>(r4)
            r40.mo5406H()
        L_0x03f4:
            r40.mo5406H()
            return r0
        L_0x03f8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C19388s.m32878p0(int, androidx.compose.runtime.d):androidx.compose.ui.graphics.painter.Painter");
    }

    /* renamed from: q */
    public static void m32879q(StringBuffer stringBuffer, C6955a aVar, Hashtable hashtable) {
        String str = (String) hashtable.get(aVar.f15433b);
        if (str == null) {
            str = aVar.f15433b.f17434b;
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(m32872m(aVar.f15434c));
    }

    /* renamed from: q0 */
    public static final int m32880q0(C8698l lVar) {
        if (lVar instanceof C8697k) {
            return ((C8697k) lVar).getTrackingData().f19102c;
        }
        if (lVar instanceof ITrackedObject) {
            return ((ITrackedObject) lVar).getTrackedPosition();
        }
        return -1;
    }

    /* renamed from: r */
    public static void m32881r(StringBuffer stringBuffer, C6956b bVar, Hashtable hashtable) {
        if (bVar.mo19115g()) {
            C6955a[] m = bVar.mo19117m();
            boolean z = true;
            for (int i = 0; i != m.length; i++) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append('+');
                }
                m32879q(stringBuffer, m[i], hashtable);
            }
        } else if (bVar.mo19116l() != null) {
            m32879q(stringBuffer, bVar.mo19116l(), hashtable);
        }
    }

    /* renamed from: r0 */
    public static final Map m32882r0(C8698l lVar) {
        if (lVar instanceof C8697k) {
            return C19294b0.m32568y0(((C8697k) lVar).getTrackingData().f19100a);
        }
        if (lVar instanceof ITrackedObject) {
            Map<AnalyticsProperty, Object> trackingParameters = ((ITrackedObject) lVar).getTrackingParameters();
            return trackingParameters != null ? C19294b0.m32568y0(trackingParameters) : C19294b0.m32559p0();
        }
        C8694h a = LogCatKt.m17045a();
        a.mo21306a("readTrackingParameters() called on [" + lVar + "] which does not support tracking databecause it doesn't implement [SupportsTrackingData] nor the legacy [ITrackedObject]");
        return C19294b0.m32559p0();
    }

    /* renamed from: s */
    public static void m32883s(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[8];
        m32871l0(jArr, jArr3);
        while (true) {
            m32823H(jArr3, jArr2);
            i--;
            if (i > 0) {
                m32871l0(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: s0 */
    public static final Object m32884s0(Object obj) {
        return obj instanceof C19830v ? Result.m35480constructorimpl(C0761x.m1673J(((C19830v) obj).f43842a)) : Result.m35480constructorimpl(obj);
    }

    /* renamed from: t */
    public static boolean m32885t(C6955a aVar, C6955a aVar2) {
        if (aVar == aVar2) {
            return true;
        }
        return aVar != null && aVar2 != null && aVar.f15433b.equals(aVar2.f15433b) && m32817E(aVar.f15434c).equals(m32817E(aVar2.f15434c));
    }

    /* renamed from: t0 */
    public static final String m32886t0(Set set) {
        C19383o.m32798h(set, "errorTypes");
        if (set.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(set));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((ErrorType) it.next()).getDesc$bugsnag_android_core_release());
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            String str = it2.next();
            while (it2.hasNext()) {
                str = ((String) str) + ',' + ((String) it2.next());
            }
            return (String) str;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    /* renamed from: u */
    public static boolean m32887u(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= sArr[length] == sArr2[length];
        }
        return z;
    }

    /* renamed from: u0 */
    public static final void m32888u0(Group group, boolean z) {
        C19383o.m32797g(group, "<this>");
        int[] referencedIds = group.getReferencedIds();
        C19383o.m32796f(referencedIds, "referencedIds");
        for (int findViewById : referencedIds) {
            group.getRootView().findViewById(findViewById).setEnabled(z);
        }
    }

    /* renamed from: v */
    public static boolean m32889v(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= m32887u(sArr[length], sArr2[length]);
        }
        return z;
    }

    /* renamed from: v0 */
    public static final void m32890v0(Group group, boolean z, C19857l lVar) {
        C19383o.m32797g(group, "<this>");
        int[] referencedIds = group.getReferencedIds();
        C19383o.m32796f(referencedIds, "referencedIds");
        for (int findViewById : referencedIds) {
            View findViewById2 = group.getRootView().findViewById(findViewById);
            if (findViewById2 != null) {
                ViewExtensions.m12867k(findViewById2, z, lVar);
            }
        }
    }

    /* renamed from: w */
    public static byte[] m32891w(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            bArr[i] = (byte) sArr[i];
        }
        return bArr;
    }

    /* renamed from: w0 */
    public static final void m32892w0(Fragment fragment, String str, Bundle bundle) {
        C19383o.m32797g(fragment, "<this>");
        fragment.getParentFragmentManager().mo10373Z(bundle, str);
    }

    /* renamed from: x */
    public static byte[][] m32893x(short[][] sArr) {
        int length = sArr.length;
        int[] iArr = new int[2];
        iArr[1] = sArr[0].length;
        iArr[0] = length;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                bArr[i][i2] = (byte) sArr[i][i2];
            }
        }
        return bArr;
    }

    /* renamed from: x0 */
    public static final void m32894x0(Fragment fragment, String str, C19861p pVar) {
        C19383o.m32797g(fragment, "<this>");
        fragment.getParentFragmentManager().mo10375a0(str, fragment, new C2783s(pVar, 0));
    }

    /* renamed from: y */
    public static short[][] m32895y(byte[][] bArr) {
        int length = bArr.length;
        int[] iArr = new int[2];
        iArr[1] = bArr[0].length;
        iArr[0] = length;
        short[][] sArr = (short[][]) Array.newInstance(Short.TYPE, iArr);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                sArr[i][i2] = (short) (bArr[i][i2] & 255);
            }
        }
        return sArr;
    }

    /* renamed from: y0 */
    public static final void m32896y0(C8698l lVar, String str) {
        C19383o.m32797g(lVar, "<this>");
        C19383o.m32797g(str, "value");
        m32824H0(lVar, str);
    }

    /* renamed from: z */
    public static byte[][][] m32897z(short[][][] sArr) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        int length2 = sArr2.length;
        int[] iArr = new int[3];
        iArr[2] = sArr2[0].length;
        iArr[1] = length2;
        iArr[0] = length;
        byte[][][] bArr = (byte[][][]) Array.newInstance(Byte.TYPE, iArr);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                for (int i3 = 0; i3 < sArr[0][0].length; i3++) {
                    bArr[i][i2][i3] = (byte) sArr[i][i2][i3];
                }
            }
        }
        return bArr;
    }

    /* renamed from: z0 */
    public static final void m32898z0(C8698l lVar, Map map) {
        C19383o.m32797g(lVar, "<this>");
        if (lVar instanceof C8697k) {
            C8699m trackingData = ((C8697k) lVar).getTrackingData();
            trackingData.getClass();
            trackingData.f19100a = map;
        } else if (lVar instanceof ITrackedObject) {
            ((ITrackedObject) lVar).setTrackingParameters(C19294b0.m32558A0(map));
        } else {
            RuntimeException runtimeException = new RuntimeException("writeTrackingParameters(" + map + ") called on [" + lVar + "] which does not support tracking databecause it doesn't implement [SupportsTrackingData] nor the legacy [ITrackedObject]");
            CrashUtil.m17307a().mo30457b(runtimeException);
            if (C0326j.m869n(BuildTarget.Companion)) {
                throw runtimeException;
            }
        }
    }

    /* renamed from: a */
    public void mo20841a(C8240i iVar) {
    }

    /* renamed from: b */
    public long mo3861b(C1631c cVar, C1640l lVar) {
        C19383o.m32797g(cVar, "$this$calculateMouseWheelScroll");
        List<C1644p> list = lVar.f3651a;
        C8343c cVar2 = new C8343c(C8343c.f18295b);
        int size = list.size();
        int i = 0;
        while (i < size) {
            i++;
            cVar2 = new C8343c(C8343c.m16645f(cVar2.f18299a, list.get(i).f3664i));
        }
        return C8343c.m16646g(cVar2.f18299a, -cVar.mo3789B0((float) 64));
    }

    /* renamed from: c */
    public void mo20843c(C8240i iVar) {
        iVar.onStart();
    }

    /* renamed from: d0 */
    public void mo68906d0(float f, float f2, C15408d dVar) {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02d5  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p699vn.C18667b mo4160f(java.lang.String r18, com.google.zxing.BarcodeFormat r19, java.util.EnumMap r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r18.isEmpty()
            if (r2 != 0) goto L_0x043e
            com.google.zxing.BarcodeFormat r2 = com.google.zxing.BarcodeFormat.DATA_MATRIX
            r3 = r19
            if (r3 != r2) goto L_0x042e
            com.google.zxing.datamatrix.encoder.SymbolShapeHint r2 = com.google.zxing.datamatrix.encoder.SymbolShapeHint.FORCE_NONE
            r3 = 0
            com.google.zxing.EncodeHintType r4 = com.google.zxing.EncodeHintType.DATA_MATRIX_SHAPE
            java.lang.Object r4 = r1.get(r4)
            com.google.zxing.datamatrix.encoder.SymbolShapeHint r4 = (com.google.zxing.datamatrix.encoder.SymbolShapeHint) r4
            if (r4 == 0) goto L_0x001e
            r2 = r4
        L_0x001e:
            com.google.zxing.EncodeHintType r4 = com.google.zxing.EncodeHintType.MIN_SIZE
            java.lang.Object r4 = r1.get(r4)
            tn.a r4 = (p683tn.C18561a) r4
            if (r4 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r4 = r3
        L_0x002a:
            com.google.zxing.EncodeHintType r5 = com.google.zxing.EncodeHintType.MAX_SIZE
            java.lang.Object r1 = r1.get(r5)
            tn.a r1 = (p683tn.C18561a) r1
            if (r1 == 0) goto L_0x0035
            r3 = r1
        L_0x0035:
            r1 = 6
            xn.c[] r1 = new p715xn.C18822c[r1]
            ke.a r5 = new ke.a
            r5.<init>()
            r6 = 0
            r1[r6] = r5
            kotlinx.coroutines.e0 r5 = new kotlinx.coroutines.e0
            r5.<init>()
            r7 = 1
            r1[r7] = r5
            xn.g r5 = new xn.g
            r5.<init>()
            r8 = 2
            r1[r8] = r5
            xn.h r5 = new xn.h
            r5.<init>()
            r9 = 3
            r1[r9] = r5
            tq.a r5 = new tq.a
            r5.<init>()
            r10 = 4
            r1[r10] = r5
            tf.m r5 = new tf.m
            r5.<init>()
            r11 = 5
            r1[r11] = r5
            xn.d r5 = new xn.d
            r5.<init>(r0)
            r5.f41674b = r2
            r5.f41675c = r4
            r5.f41676d = r3
            java.lang.String r12 = "[)>\u001e05\u001d"
            boolean r12 = r0.startsWith(r12)
            java.lang.String r13 = "\u001e\u0004"
            if (r12 == 0) goto L_0x0091
            boolean r12 = r0.endsWith(r13)
            if (r12 == 0) goto L_0x0091
            r0 = 236(0xec, float:3.31E-43)
            r5.mo70272e(r0)
            r5.f41681i = r8
            int r0 = r5.f41678f
            int r0 = r0 + 7
            r5.f41678f = r0
            goto L_0x00ac
        L_0x0091:
            java.lang.String r12 = "[)>\u001e06\u001d"
            boolean r12 = r0.startsWith(r12)
            if (r12 == 0) goto L_0x00ac
            boolean r0 = r0.endsWith(r13)
            if (r0 == 0) goto L_0x00ac
            r0 = 237(0xed, float:3.32E-43)
            r5.mo70272e(r0)
            r5.f41681i = r8
            int r0 = r5.f41678f
            int r0 = r0 + 7
            r5.f41678f = r0
        L_0x00ac:
            r0 = r6
        L_0x00ad:
            boolean r12 = r5.mo70270c()
            if (r12 == 0) goto L_0x00c1
            r12 = r1[r0]
            r12.mo45793a(r5)
            int r12 = r5.f41679g
            if (r12 < 0) goto L_0x00ad
            r0 = -1
            r5.f41679g = r0
            r0 = r12
            goto L_0x00ad
        L_0x00c1:
            int r1 = r5.mo70268a()
            int r12 = r5.mo70268a()
            r5.mo70271d(r12)
            xn.f r12 = r5.f41680h
            int r12 = r12.f41688b
            r13 = 254(0xfe, float:3.56E-43)
            if (r1 >= r12) goto L_0x00dd
            if (r0 == 0) goto L_0x00dd
            if (r0 == r11) goto L_0x00dd
            if (r0 == r10) goto L_0x00dd
            r5.mo70272e(r13)
        L_0x00dd:
            java.lang.StringBuilder r0 = r5.f41677e
            int r1 = r0.length()
            r11 = 129(0x81, float:1.81E-43)
            if (r1 >= r12) goto L_0x00ea
            r0.append(r11)
        L_0x00ea:
            int r1 = r0.length()
            if (r1 >= r12) goto L_0x0105
            int r1 = r0.length()
            int r1 = r1 + r7
            int r1 = r1 * 149
            int r1 = r1 % 253
            int r1 = r1 + r7
            int r1 = r1 + r11
            if (r1 > r13) goto L_0x00fe
            goto L_0x0100
        L_0x00fe:
            int r1 = r1 + -254
        L_0x0100:
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x00ea
        L_0x0105:
            java.lang.StringBuilder r0 = r5.f41677e
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            xn.f r1 = p715xn.C18825f.m31810f(r1, r2, r4, r3)
            int[] r2 = p715xn.C18824e.f41682a
            int r2 = r0.length()
            int r3 = r1.f41688b
            if (r2 != r3) goto L_0x0426
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r4 = r1.f41689c
            int r3 = r3 + r4
            r2.<init>(r3)
            r2.append(r0)
            int r3 = r1.mo70265c()
            if (r3 != r7) goto L_0x0139
            int r3 = r1.f41689c
            java.lang.String r0 = p715xn.C18824e.m31809a(r3, r0)
            r2.append(r0)
            goto L_0x01a0
        L_0x0139:
            int r4 = r2.capacity()
            r2.setLength(r4)
            int[] r4 = new int[r3]
            int[] r5 = new int[r3]
            int[] r11 = new int[r3]
            r12 = r6
        L_0x0147:
            if (r12 >= r3) goto L_0x0164
            int r13 = r12 + 1
            int r14 = r1.mo70264a(r13)
            r4[r12] = r14
            int r14 = r1.f41694h
            r5[r12] = r14
            r11[r12] = r6
            if (r12 <= 0) goto L_0x0162
            int r14 = r12 + -1
            r14 = r11[r14]
            r15 = r4[r12]
            int r14 = r14 + r15
            r11[r12] = r14
        L_0x0162:
            r12 = r13
            goto L_0x0147
        L_0x0164:
            r11 = r6
        L_0x0165:
            if (r11 >= r3) goto L_0x01a0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = r4[r11]
            r12.<init>(r13)
            r13 = r11
        L_0x016f:
            int r14 = r1.f41688b
            if (r13 >= r14) goto L_0x017c
            char r14 = r0.charAt(r13)
            r12.append(r14)
            int r13 = r13 + r3
            goto L_0x016f
        L_0x017c:
            java.lang.String r12 = r12.toString()
            r13 = r5[r11]
            java.lang.String r12 = p715xn.C18824e.m31809a(r13, r12)
            r14 = r6
            r13 = r11
        L_0x0188:
            r15 = r5[r11]
            int r15 = r15 * r3
            if (r13 >= r15) goto L_0x019d
            int r15 = r1.f41688b
            int r15 = r15 + r13
            int r16 = r14 + 1
            char r14 = r12.charAt(r14)
            r2.setCharAt(r15, r14)
            int r13 = r13 + r3
            r14 = r16
            goto L_0x0188
        L_0x019d:
            int r11 = r11 + 1
            goto L_0x0165
        L_0x01a0:
            java.lang.String r0 = r2.toString()
            xn.b r2 = new xn.b
            int r3 = r1.mo70273b()
            int r4 = r1.f41690d
            int r3 = r3 * r4
            int r4 = r1.mo70275e()
            int r5 = r1.f41691e
            int r4 = r4 * r5
            r2.<init>(r3, r4, r0)
            r3 = r6
            r4 = r3
            r0 = r10
        L_0x01ba:
            int r5 = r2.f41670b
            r11 = 8
            if (r0 != r5) goto L_0x01f7
            if (r3 != 0) goto L_0x01f7
            int r12 = r4 + 1
            int r5 = r5 + -1
            r2.mo70266a(r5, r6, r4, r7)
            int r5 = r2.f41670b
            int r5 = r5 - r7
            r2.mo70266a(r5, r7, r4, r8)
            int r5 = r2.f41670b
            int r5 = r5 - r7
            r2.mo70266a(r5, r8, r4, r9)
            int r5 = r2.f41671c
            int r5 = r5 - r8
            r2.mo70266a(r6, r5, r4, r10)
            int r5 = r2.f41671c
            int r5 = r5 - r7
            r13 = 5
            r2.mo70266a(r6, r5, r4, r13)
            int r5 = r2.f41671c
            int r5 = r5 - r7
            r13 = 6
            r2.mo70266a(r7, r5, r4, r13)
            int r5 = r2.f41671c
            int r5 = r5 - r7
            r13 = 7
            r2.mo70266a(r8, r5, r4, r13)
            int r5 = r2.f41671c
            int r5 = r5 - r7
            r2.mo70266a(r9, r5, r4, r11)
            r4 = r12
        L_0x01f7:
            int r5 = r2.f41670b
            int r12 = r5 + -2
            if (r0 != r12) goto L_0x0239
            if (r3 != 0) goto L_0x0239
            int r12 = r2.f41671c
            int r12 = r12 % r10
            if (r12 == 0) goto L_0x0239
            int r12 = r4 + 1
            int r5 = r5 + -3
            r2.mo70266a(r5, r6, r4, r7)
            int r5 = r2.f41670b
            int r5 = r5 - r8
            r2.mo70266a(r5, r6, r4, r8)
            int r5 = r2.f41670b
            int r5 = r5 - r7
            r2.mo70266a(r5, r6, r4, r9)
            int r5 = r2.f41671c
            int r5 = r5 - r10
            r2.mo70266a(r6, r5, r4, r10)
            int r5 = r2.f41671c
            int r5 = r5 - r9
            r13 = 5
            r2.mo70266a(r6, r5, r4, r13)
            int r5 = r2.f41671c
            int r5 = r5 - r8
            r13 = 6
            r2.mo70266a(r6, r5, r4, r13)
            int r5 = r2.f41671c
            int r5 = r5 - r7
            r13 = 7
            r2.mo70266a(r6, r5, r4, r13)
            int r5 = r2.f41671c
            int r5 = r5 - r7
            r2.mo70266a(r7, r5, r4, r11)
            r4 = r12
        L_0x0239:
            int r5 = r2.f41670b
            int r12 = r5 + -2
            if (r0 != r12) goto L_0x027b
            if (r3 != 0) goto L_0x027b
            int r12 = r2.f41671c
            int r12 = r12 % r11
            if (r12 != r10) goto L_0x027b
            int r12 = r4 + 1
            int r5 = r5 + -3
            r2.mo70266a(r5, r6, r4, r7)
            int r5 = r2.f41670b
            int r5 = r5 - r8
            r2.mo70266a(r5, r6, r4, r8)
            int r5 = r2.f41670b
            int r5 = r5 - r7
            r2.mo70266a(r5, r6, r4, r9)
            int r5 = r2.f41671c
            int r5 = r5 - r8
            r2.mo70266a(r6, r5, r4, r10)
            int r5 = r2.f41671c
            int r5 = r5 - r7
            r13 = 5
            r2.mo70266a(r6, r5, r4, r13)
            int r5 = r2.f41671c
            int r5 = r5 - r7
            r13 = 6
            r2.mo70266a(r7, r5, r4, r13)
            int r5 = r2.f41671c
            int r5 = r5 - r7
            r13 = 7
            r2.mo70266a(r8, r5, r4, r13)
            int r5 = r2.f41671c
            int r5 = r5 - r7
            r2.mo70266a(r9, r5, r4, r11)
            r4 = r12
        L_0x027b:
            int r5 = r2.f41670b
            int r12 = r5 + 4
            if (r0 != r12) goto L_0x02c0
            if (r3 != r8) goto L_0x02c0
            int r12 = r2.f41671c
            int r12 = r12 % r11
            if (r12 != 0) goto L_0x02c0
            int r12 = r4 + 1
            int r5 = r5 + -1
            r2.mo70266a(r5, r6, r4, r7)
            int r5 = r2.f41670b
            int r5 = r5 - r7
            int r13 = r2.f41671c
            int r13 = r13 - r7
            r2.mo70266a(r5, r13, r4, r8)
            int r5 = r2.f41671c
            int r5 = r5 - r9
            r2.mo70266a(r6, r5, r4, r9)
            int r5 = r2.f41671c
            int r5 = r5 - r8
            r2.mo70266a(r6, r5, r4, r10)
            int r5 = r2.f41671c
            int r5 = r5 - r7
            r13 = 5
            r2.mo70266a(r6, r5, r4, r13)
            int r5 = r2.f41671c
            int r5 = r5 - r9
            r13 = 6
            r2.mo70266a(r7, r5, r4, r13)
            int r5 = r2.f41671c
            int r5 = r5 - r8
            r13 = 7
            r2.mo70266a(r7, r5, r4, r13)
            int r5 = r2.f41671c
            int r5 = r5 - r7
            r2.mo70266a(r7, r5, r4, r11)
            r4 = r12
        L_0x02c0:
            int r5 = r2.f41670b
            if (r0 >= r5) goto L_0x02db
            if (r3 < 0) goto L_0x02db
            byte[] r5 = r2.f41672d
            int r11 = r2.f41671c
            int r11 = r11 * r0
            int r11 = r11 + r3
            byte r5 = r5[r11]
            if (r5 < 0) goto L_0x02d2
            r5 = r7
            goto L_0x02d3
        L_0x02d2:
            r5 = r6
        L_0x02d3:
            if (r5 != 0) goto L_0x02db
            int r5 = r4 + 1
            r2.mo70267b(r0, r3, r4)
            r4 = r5
        L_0x02db:
            int r0 = r0 + -2
            int r3 = r3 + 2
            if (r0 < 0) goto L_0x02e5
            int r5 = r2.f41671c
            if (r3 < r5) goto L_0x02c0
        L_0x02e5:
            int r0 = r0 + 1
            int r3 = r3 + 3
        L_0x02e9:
            if (r0 < 0) goto L_0x0302
            int r5 = r2.f41671c
            if (r3 >= r5) goto L_0x0302
            byte[] r11 = r2.f41672d
            int r5 = r5 * r0
            int r5 = r5 + r3
            byte r5 = r11[r5]
            if (r5 < 0) goto L_0x02f9
            r5 = r7
            goto L_0x02fa
        L_0x02f9:
            r5 = r6
        L_0x02fa:
            if (r5 != 0) goto L_0x0302
            int r5 = r4 + 1
            r2.mo70267b(r0, r3, r4)
            r4 = r5
        L_0x0302:
            int r0 = r0 + 2
            int r3 = r3 + -2
            int r5 = r2.f41670b
            if (r0 >= r5) goto L_0x030c
            if (r3 >= 0) goto L_0x02e9
        L_0x030c:
            int r0 = r0 + 3
            int r3 = r3 + 1
            if (r0 < r5) goto L_0x01ba
            int r11 = r2.f41671c
            if (r3 < r11) goto L_0x01ba
            int r0 = r11 + -1
            int r3 = r5 + -1
            byte[] r4 = r2.f41672d
            int r3 = r3 * r11
            int r3 = r3 + r0
            byte r0 = r4[r3]
            if (r0 < 0) goto L_0x0324
            r0 = r7
            goto L_0x0325
        L_0x0324:
            r0 = r6
        L_0x0325:
            if (r0 != 0) goto L_0x0337
            int r0 = r11 + -1
            int r3 = r5 + -1
            int r3 = r3 * r11
            int r3 = r3 + r0
            byte r0 = (byte) r7
            r4[r3] = r0
            int r3 = r11 + -2
            int r5 = r5 - r8
            int r5 = r5 * r11
            int r5 = r5 + r3
            r4[r5] = r0
        L_0x0337:
            int r0 = r1.mo70273b()
            int r3 = r1.f41690d
            int r0 = r0 * r3
            int r3 = r1.mo70275e()
            int r4 = r1.f41691e
            int r3 = r3 * r4
            bo.b r4 = new bo.b
            int r5 = r1.mo70274d()
            int r9 = r1.mo70275e()
            int r10 = r1.f41691e
            int r9 = r9 * r10
            int r10 = r1.mo70275e()
            int r10 = r10 << r7
            int r9 = r9 + r10
            r4.<init>(r5, r9)
            r5 = r6
            r9 = r5
        L_0x035d:
            if (r5 >= r3) goto L_0x03d0
            int r10 = r1.f41691e
            int r10 = r5 % r10
            if (r10 != 0) goto L_0x037d
            r10 = r6
            r11 = r10
        L_0x0367:
            int r12 = r1.mo70274d()
            if (r10 >= r12) goto L_0x037b
            int r12 = r10 % 2
            if (r12 != 0) goto L_0x0373
            r12 = r7
            goto L_0x0374
        L_0x0373:
            r12 = r6
        L_0x0374:
            r4.mo47036c(r11, r9, r12)
            int r11 = r11 + r7
            int r10 = r10 + 1
            goto L_0x0367
        L_0x037b:
            int r9 = r9 + 1
        L_0x037d:
            r10 = r6
            r11 = r10
        L_0x037f:
            if (r10 >= r0) goto L_0x03b3
            int r12 = r1.f41690d
            int r12 = r10 % r12
            if (r12 != 0) goto L_0x038c
            r4.mo47036c(r11, r9, r7)
            int r11 = r11 + 1
        L_0x038c:
            byte[] r12 = r2.f41672d
            int r13 = r2.f41671c
            int r13 = r13 * r5
            int r13 = r13 + r10
            byte r12 = r12[r13]
            if (r12 != r7) goto L_0x0398
            r12 = r7
            goto L_0x0399
        L_0x0398:
            r12 = r6
        L_0x0399:
            r4.mo47036c(r11, r9, r12)
            int r11 = r11 + r7
            int r12 = r1.f41690d
            int r13 = r10 % r12
            int r12 = r12 - r7
            if (r13 != r12) goto L_0x03b0
            int r12 = r5 % 2
            if (r12 != 0) goto L_0x03aa
            r12 = r7
            goto L_0x03ab
        L_0x03aa:
            r12 = r6
        L_0x03ab:
            r4.mo47036c(r11, r9, r12)
            int r11 = r11 + 1
        L_0x03b0:
            int r10 = r10 + 1
            goto L_0x037f
        L_0x03b3:
            int r9 = r9 + 1
            int r10 = r1.f41691e
            int r11 = r5 % r10
            int r10 = r10 - r7
            if (r11 != r10) goto L_0x03cd
            r10 = r6
            r11 = r10
        L_0x03be:
            int r12 = r1.mo70274d()
            if (r10 >= r12) goto L_0x03cb
            r4.mo47036c(r11, r9, r7)
            int r11 = r11 + r7
            int r10 = r10 + 1
            goto L_0x03be
        L_0x03cb:
            int r9 = r9 + 1
        L_0x03cd:
            int r5 = r5 + 1
            goto L_0x035d
        L_0x03d0:
            int r0 = r4.f31150b
            int r1 = r4.f31151c
            r2 = 200(0xc8, float:2.8E-43)
            int r3 = java.lang.Math.max(r2, r0)
            int r5 = java.lang.Math.max(r2, r1)
            int r9 = r3 / r0
            int r10 = r5 / r1
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = r0 * r9
            int r3 = r3 - r10
            int r3 = r3 / r8
            int r10 = r1 * r9
            int r5 = r5 - r10
            int r5 = r5 / r8
            if (r2 < r1) goto L_0x03f9
            if (r2 >= r0) goto L_0x03f3
            goto L_0x03f9
        L_0x03f3:
            vn.b r8 = new vn.b
            r8.<init>(r2, r2)
            goto L_0x0400
        L_0x03f9:
            vn.b r8 = new vn.b
            r8.<init>(r0, r1)
            r3 = r6
            r5 = r3
        L_0x0400:
            int[] r2 = r8.f41281e
            int r2 = r2.length
            r10 = r6
        L_0x0404:
            if (r10 >= r2) goto L_0x040d
            int[] r11 = r8.f41281e
            r11[r10] = r6
            int r10 = r10 + 1
            goto L_0x0404
        L_0x040d:
            r2 = r6
        L_0x040e:
            if (r2 >= r1) goto L_0x0425
            r11 = r3
            r10 = r6
        L_0x0412:
            if (r10 >= r0) goto L_0x0421
            byte r12 = r4.mo47034a(r10, r2)
            if (r12 != r7) goto L_0x041d
            r8.mo70176c(r11, r5, r9, r9)
        L_0x041d:
            int r10 = r10 + 1
            int r11 = r11 + r9
            goto L_0x0412
        L_0x0421:
            int r2 = r2 + 1
            int r5 = r5 + r9
            goto L_0x040e
        L_0x0425:
            return r8
        L_0x0426:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The number of codewords does not match the selected symbol"
            r0.<init>(r1)
            throw r0
        L_0x042e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r19)
            java.lang.String r2 = "Can only encode DATA_MATRIX, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x043e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Found empty contents"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C19388s.mo4160f(java.lang.String, com.google.zxing.BarcodeFormat, java.util.EnumMap):vn.b");
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo1133h(Object obj) {
        ChangeShippingMethodFragment changeShippingMethodFragment = (ChangeShippingMethodFragment) obj;
    }

    /* renamed from: k */
    public ArrayList mo19k(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        C19383o.m32797g(fragmentNavigationKey, "key");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CartWithSavedKey(fragmentNavigationKey.getReferrer(), (String) null, (Bundle) null, 6, (DefaultConstructorMarker) null));
        arrayList.add(fragmentNavigationKey);
        return arrayList;
    }

    /* renamed from: o */
    public int mo21o() {
        return R.id.menu_bottom_nav_cart;
    }

    public Object then(C18123g gVar) {
        Object obj = C14118i.f31103b;
        return 403;
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Long.valueOf(C14720l8.f32933c.zza().mo50687c());
    }

    public /* synthetic */ C19388s(Context context) {
    }

    public C18123g then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = C18096a.f39507h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return C18126j.m30617e((Object) null);
        }
        return C18126j.m30617e(bundle);
    }
}
