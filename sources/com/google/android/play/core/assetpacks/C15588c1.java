package com.google.android.play.core.assetpacks;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.C0114h;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.core.C0411a;
import androidx.compose.animation.core.C0436l;
import androidx.compose.animation.core.C0448r;
import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.C1030w;
import androidx.compose.foundation.interaction.C0634d;
import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.foundation.layout.C0760w;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.layout.PaddingModifier;
import androidx.compose.foundation.layout.PaddingValuesModifier;
import androidx.compose.foundation.layout.SpacerMeasurePolicy;
import androidx.compose.foundation.text.selection.C1011g;
import androidx.compose.foundation.text.selection.SelectionMode;
import androidx.compose.material.C1166a2;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ZIndexModifier;
import androidx.compose.p015ui.graphics.C1532l0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.layout.C1676d0;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1703q;
import androidx.compose.p015ui.node.C1750p;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.android.C1922e;
import androidx.compose.p015ui.text.font.C1946b;
import androidx.compose.p015ui.text.font.C1948d;
import androidx.compose.p015ui.text.font.C1954h;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.font.C1968t;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.C2606m;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.room.C3238i0;
import androidx.room.RoomDatabase;
import androidx.work.C3436p;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d;
import com.etsy.android.R;
import com.etsy.android.extensions.UnexpectedResultException;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.YouKey;
import com.etsy.android.p327ui.user.addresses.C11462y;
import com.etsy.android.p327ui.user.addresses.C11463z;
import com.facebook.internal.FeatureManager;
import com.google.android.gms.internal.measurement.C14598c3;
import com.google.android.gms.internal.measurement.C14685j;
import com.google.android.gms.internal.measurement.C14711l;
import com.google.android.gms.internal.measurement.C14763p;
import com.google.android.gms.internal.measurement.C14813t;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.play.core.internal.C15686c0;
import com.google.android.play.core.internal.C15704p;
import com.google.android.play.core.internal.zzbx;
import com.google.gson.internal.C16790g;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.security.spec.ECParameterSpec;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.C19394m;
import kotlin.jvm.internal.C19375g;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.text.C19459m;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.C19757m0;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19837x0;
import kotlinx.coroutines.C19838x1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C19729m;
import kotlinx.coroutines.internal.C19736t;
import p001a0.C0005b;
import p010a9.C0048b;
import p036c5.C4410a;
import p150j4.C7108a;
import p150j4.C7114e;
import p152j6.C7146d;
import p152j6.C7148f;
import p174m0.C7282b;
import p174m0.C7283c;
import p174m0.C7284d;
import p179m5.C7336h;
import p199o6.C7622c;
import p209p6.C7676c;
import p223r5.C7778y;
import p244t5.C7959a;
import p244t5.C8037z;
import p250u0.C8085d;
import p267v7.C8212a;
import p287xp.C8339g;
import p288y.C8345d;
import p343ee.C12693a;
import p453tf.C13418j;
import p513bj.C14049b0;
import p513bj.C14078s;
import p568fn.C17782b;
import p614ll.C18200b;
import p634np.C18290b;
import p694vi.C18652f;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;
import p768rq.C20153b;

/* renamed from: com.google.android.play.core.assetpacks.c1 */
public class C15588c1 implements C18290b, C7108a, C15686c0, C15704p, C8339g, C16790g, C12693a, FeatureManager.C12256a {

    /* renamed from: b */
    public static C15635o0 f35076b;

    /* renamed from: c */
    public static final byte[] f35077c = {0, 0, 0, 1};

    /* renamed from: d */
    public static final String[] f35078d = {"", "A", "B", "C"};

    /* renamed from: e */
    public static ICameraUpdateFactoryDelegate f35079e;

    /* renamed from: f */
    public static final int[] f35080f = {R.attr.lottie_autoPlay, R.attr.lottie_colorFilter, R.attr.lottie_enableMergePathsForKitKatAndAbove, R.attr.lottie_fallbackRes, R.attr.lottie_fileName, R.attr.lottie_imageAssetsFolder, R.attr.lottie_loop, R.attr.lottie_progress, R.attr.lottie_rawRes, R.attr.lottie_renderMode, R.attr.lottie_repeatCount, R.attr.lottie_repeatMode, R.attr.lottie_scale, R.attr.lottie_speed, R.attr.lottie_url};

    /* renamed from: g */
    public static final long[] f35081g = {0, 50, 50, 50};

    /* renamed from: h */
    public static final C15588c1 f35082h = new C15588c1();

    /* renamed from: i */
    public static final int[] f35083i = {16843036, 16843156, 16843157, 16843158, 16843532, 16843533};

    /* renamed from: j */
    public static final int[] f35084j = {16842960, 16843161};

    /* renamed from: k */
    public static final int[] f35085k = {16843161, 16843849, 16843850, 16843851};

    /* renamed from: l */
    public static final int[] f35086l = {16843036, 16843156, 16843157, 16843158, 16843532, 16843533};

    /* renamed from: m */
    public static final int[] f35087m = {16843161};

    /* renamed from: n */
    public static final byte[] f35088n = {0, 0, 0, 1};

    /* renamed from: o */
    public static final byte[] f35089o = {0, 0, 0, 0};

    /* renamed from: p */
    public static final byte[] f35090p = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    /* renamed from: q */
    public static final int[] f35091q = new int[0];

    /* renamed from: r */
    public static final Object[] f35092r = new Object[0];

    /* renamed from: s */
    public static final C19736t f35093s = new C19736t("CLOSED");

    /* renamed from: t */
    public static final int[] f35094t = {R.attr.keylines, R.attr.statusBarBackground};

    /* renamed from: u */
    public static final int[] f35095u = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};

    /* renamed from: v */
    public static final int[] f35096v = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    /* renamed from: w */
    public static final C15588c1 f35097w = new C15588c1();

    /* renamed from: A */
    public static boolean m25269A(int i, String str) {
        return str.equals("") || str.length() <= i;
    }

    /* renamed from: A0 */
    public static final C1436d m25270A0(C1436d dVar, C19857l lVar) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(lVar, "onGloballyPositioned");
        C19857l<C1859o0, C19394m> lVar2 = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new C1676d0(lVar));
    }

    /* renamed from: B */
    public static boolean m25271B(String str) {
        if (str.equals("")) {
            return false;
        }
        return !str.equals("");
    }

    /* renamed from: C */
    public static final int m25272C(int i, int i2, int[] iArr) {
        C19383o.m32797g(iArr, "<this>");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* renamed from: C0 */
    public static final int m25273C0(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: D */
    public static String m25274D(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: D0 */
    public static final C1436d m25275D0(C1436d dVar, C1030w wVar) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(wVar, "overscrollEffect");
        return dVar.mo6148i0(wVar.mo3581e());
    }

    /* renamed from: E */
    public static String m25276E(C14078s sVar) {
        sVar.mo46945j(24);
        int e = sVar.mo46940e(2);
        boolean d = sVar.mo46939d();
        int e2 = sVar.mo46940e(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (sVar.mo46939d()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = sVar.mo46940e(8);
        }
        int e3 = sVar.mo46940e(8);
        Object[] objArr = new Object[5];
        objArr[0] = f35078d[e];
        objArr[1] = Integer.valueOf(e2);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Character.valueOf(d ? 'H' : 'L');
        objArr[4] = Integer.valueOf(e3);
        StringBuilder sb = new StringBuilder(C14049b0.m21640m("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0) {
            int i5 = i3 - 1;
            if (iArr[i5] != 0) {
                break;
            }
            i3 = i5;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i6])}));
        }
        return sb.toString();
    }

    /* renamed from: E0 */
    public static final C1436d m25277E0(C1436d dVar, C0759v vVar) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(vVar, "paddingValues");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new PaddingValuesModifier(vVar));
    }

    /* renamed from: F */
    public static int m25278F(int i, int i2) {
        int i3 = i ^ i2;
        return ((~i3) & (i3 - 1)) >>> 63;
    }

    /* renamed from: F0 */
    public static final C1436d m25279F0(C1436d dVar, float f) {
        C19383o.m32797g(dVar, "$this$padding");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new PaddingModifier(f, f, f, f));
    }

    /* renamed from: G */
    public static void m25280G(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int i2 = i;
        int i3 = 16;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            int i4 = iArr[16 + i3];
            iArr2[i3 + 0] = (i2 << -9) | (i4 >>> 9);
            i2 = i4;
        }
        int c = C2606m.m6136c(16, iArr, iArr2) + ((i2 << -9) >>> 23) + (i >>> 9);
        if (c > 511 || (c == 511 && C2606m.m6110E(16, iArr2, f35096v))) {
            c = (C2606m.m6115J(iArr2) + c) & 511;
        }
        iArr2[16] = c;
    }

    /* renamed from: G0 */
    public static final C1436d m25281G0(C1436d dVar, float f, float f2) {
        C19383o.m32797g(dVar, "$this$padding");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new PaddingModifier(f, f2, f, f2));
    }

    /* renamed from: H */
    public static void m25282H(int[] iArr, int[] iArr2, int[] iArr3) {
        int T = (C2606m.m6125T(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (T < 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= 16) {
                    i = -1;
                    break;
                }
                int i3 = iArr3[i2] - 1;
                iArr3[i2] = i3;
                if (i3 != -1) {
                    break;
                }
                i2++;
            }
            T = (T + i) & 511;
        }
        iArr3[16] = T;
    }

    /* renamed from: H0 */
    public static C1436d m25283H0(C1436d dVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = (float) 0;
        }
        if ((i & 2) != 0) {
            f2 = (float) 0;
        }
        return m25281G0(dVar, f, f2);
    }

    /* renamed from: I */
    public static void m25284I(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j11 = j8 ^ (j9 >>> 2);
        long j12 = jArr[11];
        long j13 = j5 ^ (j12 << 39);
        long j14 = (j6 ^ (j9 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j15 = j10 ^ (j12 >>> 2);
        long j16 = jArr[10];
        long j17 = j4 ^ (j16 << 39);
        long j18 = j13 ^ ((j16 >>> 25) ^ (j16 << 62));
        long j19 = j14 ^ (j16 >>> 2);
        long j20 = jArr[9];
        long j21 = j3 ^ (j20 << 39);
        long j22 = j17 ^ ((j20 >>> 25) ^ (j20 << 62));
        long j23 = j18 ^ (j20 >>> 2);
        long j24 = jArr[8];
        long j25 = j ^ (j11 << 39);
        long j26 = (j21 ^ ((j24 >>> 25) ^ (j24 << 62))) ^ (j11 >>> 2);
        long j27 = j15 >>> 25;
        jArr2[0] = j25 ^ j27;
        long j28 = j27 << 23;
        jArr2[1] = j28 ^ ((j2 ^ (j24 << 39)) ^ ((j11 >>> 25) ^ (j11 << 62)));
        jArr2[2] = j26;
        jArr2[3] = j22 ^ (j24 >>> 2);
        jArr2[4] = j23;
        jArr2[5] = j19;
        jArr2[6] = j15 & 33554431;
    }

    /* renamed from: I0 */
    public static final C1436d m25285I0(C1436d dVar, float f, float f2, float f3, float f4) {
        C19383o.m32797g(dVar, "$this$padding");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new PaddingModifier(f, f2, f3, f4));
    }

    /* renamed from: J */
    public static void m25286J(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        m25315Z(jArr, jArr2, jArr4);
        m25284I(jArr4, jArr3);
    }

    /* renamed from: J0 */
    public static C1436d m25287J0(C1436d dVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = (float) 0;
        }
        if ((i & 2) != 0) {
            f2 = (float) 0;
        }
        if ((i & 4) != 0) {
            f3 = (float) 0;
        }
        if ((i & 8) != 0) {
            f4 = (float) 0;
        }
        return m25285I0(dVar, f, f2, f3, f4);
    }

    /* renamed from: K */
    public static final float m25288K(C0759v vVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(vVar, "<this>");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? vVar.mo4152c(layoutDirection) : vVar.mo4151b(layoutDirection);
    }

    /* renamed from: K0 */
    public static void m25289K0(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    /* renamed from: L */
    public static final float m25290L(C0759v vVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(vVar, "<this>");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? vVar.mo4151b(layoutDirection) : vVar.mo4152c(layoutDirection);
    }

    /* renamed from: L0 */
    public static final C1750p m25291L0(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "<this>");
        C1750p pVar = layoutNode.f3823h;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }

    /* renamed from: M */
    public static void m25292M() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                Log.e("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
            } else {
                return;
            }
        }
    }

    /* renamed from: M0 */
    public static C18652f m25293M0(C18652f fVar, String[] strArr, Map map) {
        int i = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C18652f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C18652f fVar2 = new C18652f();
                int length = strArr.length;
                while (i < length) {
                    fVar2.mo70161a((C18652f) map.get(strArr[i]));
                    i++;
                }
                return fVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            fVar.mo70161a((C18652f) map.get(strArr[0]));
            return fVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                fVar.mo70161a((C18652f) map.get(strArr[i]));
                i++;
            }
        }
        return fVar;
    }

    /* renamed from: N */
    public static int m25294N(Context context, String str) {
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (!(Process.myUid() == myUid && Objects.equals(context.getPackageName(), packageName))) {
                i = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c = C8085d.m16267c(context);
                i = C8085d.m16265a(c, permissionToOp, Binder.getCallingUid(), packageName);
                if (i == 0) {
                    i = C8085d.m16265a(c, permissionToOp, myUid, C8085d.m16266b(context));
                }
            } else {
                i = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
            }
            if (i != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* renamed from: N0 */
    public static final float m25295N0(float f) {
        String format = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        C19383o.m32796f(format, "format(locale, this, *args)");
        return Float.parseFloat(format);
    }

    /* renamed from: O */
    public static final String m25296O(int i) {
        if (i < 1000) {
            return String.valueOf(i);
        }
        double d = (double) i;
        int log = (int) (Math.log(d) / Math.log(1000.0d));
        String format = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d / Math.pow(1000.0d, (double) log))}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        String t1 = C19459m.m33051t1(format, ".0");
        char charAt = "kMGT".charAt(log - 1);
        return t1 + charAt;
    }

    /* renamed from: O0 */
    public static void m25297O0(View view, C2887s sVar) {
        view.setTag(R.id.view_tree_lifecycle_owner, sVar);
    }

    /* renamed from: P */
    public static int m25298P(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        m25292M();
        m25353w(35633, glCreateProgram, str);
        m25353w(35632, glCreateProgram, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram));
            Log.e("GlUtil", valueOf.length() != 0 ? "Unable to link shader program: \n".concat(valueOf) : new String("Unable to link shader program: \n"));
        }
        m25292M();
        return glCreateProgram;
    }

    /* renamed from: P0 */
    public static void m25299P0(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(C0072d.m200g(15, "csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* renamed from: Q */
    public static final C0436l m25300Q(double d) {
        return d < ShadowDrawableWrapper.COS_45 ? new C0436l(ShadowDrawableWrapper.COS_45, Math.sqrt(Math.abs(d))) : new C0436l(Math.sqrt(d), ShadowDrawableWrapper.COS_45);
    }

    /* renamed from: Q0 */
    public static final void m25301Q0(PointF pointF, MotionEvent motionEvent) {
        C19383o.m32797g(pointF, "<this>");
        C19383o.m32797g(motionEvent, "event");
        if (motionEvent.getPointerCount() == 2) {
            float x = motionEvent.getX(0);
            float y = motionEvent.getY(1) + motionEvent.getY(0);
            float f = (float) 2;
            pointF.set((motionEvent.getX(1) + x) / f, y / f);
        }
    }

    /* renamed from: R */
    public static FloatBuffer m25302R(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* renamed from: R0 */
    public static boolean m25303R0(int i) {
        if (i >= 0 && i < 101) {
            return Math.random() * ((double) 100) < ((double) i);
        }
        throw new IllegalArgumentException("Sample rate for doSampled must be an integer between 0 and 100 (inclusive)".toString());
    }

    /* renamed from: S */
    public static final C1954h m25304S(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return new C1954h(new C1946b(context), C1948d.m4269a(context));
    }

    /* renamed from: S0 */
    public static final String m25305S0(int i, C1302d dVar) {
        dVar.mo5410J(AndroidCompositionLocals_androidKt.f3986a);
        Resources resources = ((Context) dVar.mo5410J(AndroidCompositionLocals_androidKt.f3987b)).getResources();
        C19383o.m32796f(resources, "LocalContext.current.resources");
        String string = resources.getString(i);
        C19383o.m32796f(string, "resources.getString(id)");
        return string;
    }

    /* renamed from: T */
    public static void m25306T(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[33];
        m25317b0(iArr, iArr3);
        m25280G(iArr3, iArr2);
    }

    /* renamed from: T0 */
    public static final C1436d m25307T0(C1436d dVar, float f) {
        C19383o.m32797g(dVar, "<this>");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new ZIndexModifier(f));
    }

    /* renamed from: U */
    public static boolean m25308U(int i, String str) {
        return str.equals("") || str.length() == i;
    }

    /* renamed from: U0 */
    public static C14763p m25309U0(C14711l lVar, C14813t tVar, C14598c3 c3Var, ArrayList arrayList) {
        if (lVar.mo50483c(tVar.f33085b)) {
            C14763p l = lVar.mo50489l(tVar.f33085b);
            if (l instanceof C14685j) {
                return ((C14685j) l).mo50553b(c3Var, arrayList);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{tVar.f33085b}));
        } else if ("hasOwnProperty".equals(tVar.f33085b)) {
            C19388s.m32840P0("hasOwnProperty", arrayList, 1);
            return lVar.mo50483c(c3Var.mo50400c((C14763p) arrayList.get(0)).zzi()) ? C14763p.f33038m0 : C14763p.f33039n0;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{tVar.f33085b}));
        }
    }

    /* renamed from: V */
    public static boolean m25310V(String str) {
        return Pattern.compile("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$").matcher(str).matches();
    }

    /* renamed from: V0 */
    public static void m25311V0(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: W */
    public static byte[] m25312W(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < 16; i++) {
                byte b = (byte) ((bArr[i] << 1) & 254);
                bArr2[i] = b;
                if (i < 15) {
                    bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    /* renamed from: X */
    public static final void m25313X(Runnable runnable, int i) {
        if (m25303R0(i)) {
            runnable.run();
        }
    }

    /* renamed from: Y */
    public static final void m25314Y(C19846a aVar, int i) {
        if (m25303R0(i)) {
            aVar.invoke();
        }
    }

    /* renamed from: Z */
    public static void m25315Z(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        m25321d0(jArr, jArr4);
        m25321d0(jArr2, jArr5);
        for (int i = 0; i < 7; i++) {
            long j = jArr5[i];
            long[] jArr6 = new long[8];
            jArr6[1] = j;
            long j2 = j << 1;
            jArr6[2] = j2;
            long j3 = j2 ^ j;
            jArr6[3] = j3;
            long j4 = j2 << 1;
            jArr6[4] = j4;
            jArr6[5] = j4 ^ j;
            long j5 = j3 << 1;
            jArr6[6] = j5;
            jArr6[7] = j5 ^ j;
            for (int i2 = 0; i2 < 7; i2++) {
                long j6 = jArr4[i2];
                int i3 = (int) j6;
                long j7 = jArr6[i3 & 7] ^ (jArr6[(i3 >>> 3) & 7] << 3);
                int i4 = 54;
                long j8 = 0;
                do {
                    int i5 = (int) (j6 >>> i4);
                    long j9 = jArr6[i5 & 7] ^ (jArr6[(i5 >>> 3) & 7] << 3);
                    j7 ^= j9 << i4;
                    j8 ^= j9 >>> (-i4);
                    i4 -= 6;
                } while (i4 > 0);
                int i6 = i + i2;
                jArr3[i6] = jArr3[i6] ^ (j7 & 576460752303423487L);
                int i7 = i6 + 1;
                jArr3[i7] = jArr3[i7] ^ ((j8 << 5) ^ (j7 >>> 59));
            }
        }
        long j10 = jArr3[0];
        long j11 = jArr3[1];
        long j12 = jArr3[2];
        long j13 = jArr3[3];
        long j14 = jArr3[4];
        long j15 = jArr3[5];
        long j16 = jArr3[6];
        long j17 = jArr3[7];
        long j18 = jArr3[8];
        long j19 = jArr3[9];
        long j20 = jArr3[10];
        long j21 = jArr3[11];
        long j22 = jArr3[12];
        long j23 = jArr3[13];
        jArr3[0] = j10 ^ (j11 << 59);
        jArr3[1] = (j11 >>> 5) ^ (j12 << 54);
        jArr3[2] = (j12 >>> 10) ^ (j13 << 49);
        jArr3[3] = (j13 >>> 15) ^ (j14 << 44);
        jArr3[4] = (j14 >>> 20) ^ (j15 << 39);
        jArr3[5] = (j15 >>> 25) ^ (j16 << 34);
        jArr3[6] = (j16 >>> 30) ^ (j17 << 29);
        jArr3[7] = (j17 >>> 35) ^ (j18 << 24);
        jArr3[8] = (j18 >>> 40) ^ (j19 << 19);
        jArr3[9] = (j19 >>> 45) ^ (j20 << 14);
        jArr3[10] = (j20 >>> 50) ^ (j21 << 9);
        jArr3[11] = ((j21 >>> 55) ^ (j22 << 4)) ^ (j23 << 63);
        jArr3[12] = (j22 >>> 60) ^ (j23 >>> 1);
        jArr3[13] = 0;
    }

    /* renamed from: a0 */
    public static String m25316a0(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte byteAt = byteString.byteAt(i);
            if (byteAt == 34) {
                sb.append("\\\"");
            } else if (byteAt == 39) {
                sb.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (byteAt >= 32 && byteAt <= 126) {
                            sb.append((char) byteAt);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb.append((char) ((byteAt & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: b0 */
    public static void m25317b0(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        C3436p.m8232F(iArr, iArr2);
        long j = UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr3[8]) & UnsignedInteger.INT_MASK;
        int i = 16;
        int i2 = 0;
        int i3 = 7;
        int i4 = 16;
        while (true) {
            int i5 = i3 - 1;
            long j3 = j & ((long) iArr3[i3 + 8]);
            long j4 = j3 * j3;
            int i6 = i - 1;
            iArr4[i4 + i6] = (i2 << 31) | ((int) (j4 >>> 33));
            i = i6 - 1;
            iArr4[i4 + i] = (int) (j4 >>> 1);
            i2 = (int) j4;
            if (i5 <= 0) {
                break;
            }
            j = UnsignedInteger.INT_MASK;
            i4 = 16;
            i3 = i5;
        }
        long j5 = j2 * j2;
        iArr4[16] = (int) j5;
        long j6 = ((long) iArr3[9]) & UnsignedInteger.INT_MASK;
        long j7 = UnsignedInteger.INT_MASK & ((long) iArr4[18]);
        long j8 = (j6 * j2) + ((((long) (i2 << 31)) & UnsignedInteger.INT_MASK) | (j5 >>> 33));
        int i7 = (int) j8;
        iArr4[17] = (((int) (j5 >>> 32)) & 1) | (i7 << 1);
        int i8 = i7 >>> 31;
        long j9 = ((long) iArr3[10]) & UnsignedInteger.INT_MASK;
        long j10 = j6;
        long j11 = ((long) iArr4[19]) & UnsignedInteger.INT_MASK;
        long j12 = ((long) iArr4[20]) & UnsignedInteger.INT_MASK;
        long j13 = (j9 * j2) + j7 + (j8 >>> 32);
        int i9 = (int) j13;
        iArr4[18] = i8 | (i9 << 1);
        long b = C0070b.m181b(j9, j10, j13 >>> 32, j11);
        long j14 = j12 + (b >>> 32);
        long j15 = b & UnsignedInteger.INT_MASK;
        long j16 = ((long) iArr3[11]) & UnsignedInteger.INT_MASK;
        long j17 = (((long) iArr4[21]) & UnsignedInteger.INT_MASK) + (j14 >>> 32);
        long j18 = j14 & UnsignedInteger.INT_MASK;
        long j19 = j17 & UnsignedInteger.INT_MASK;
        long j20 = (j16 * j2) + j15;
        int i10 = (int) j20;
        iArr4[19] = (i9 >>> 31) | (i10 << 1);
        int i11 = i10 >>> 31;
        long b2 = C0070b.m181b(j16, j10, j20 >>> 32, j18);
        long b3 = C0070b.m181b(j16, j9, b2 >>> 32, j19);
        long j21 = b2 & UnsignedInteger.INT_MASK;
        long j22 = (((long) iArr4[22]) & UnsignedInteger.INT_MASK) + (j17 >>> 32) + (b3 >>> 32);
        long j23 = b3 & UnsignedInteger.INT_MASK;
        long j24 = ((long) iArr3[12]) & UnsignedInteger.INT_MASK;
        long j25 = (((long) iArr4[23]) & UnsignedInteger.INT_MASK) + (j22 >>> 32);
        long j26 = j22 & UnsignedInteger.INT_MASK;
        long j27 = (((long) iArr4[24]) & UnsignedInteger.INT_MASK) + (j25 >>> 32);
        long j28 = j25 & UnsignedInteger.INT_MASK;
        long j29 = (j24 * j2) + j21;
        int i12 = (int) j29;
        iArr4[20] = i11 | (i12 << 1);
        int i13 = i12 >>> 31;
        long b4 = C0070b.m181b(j24, j10, j29 >>> 32, j23);
        long b5 = C0070b.m181b(j24, j9, b4 >>> 32, j26);
        long j30 = b4 & UnsignedInteger.INT_MASK;
        long j31 = j16;
        long b6 = C0070b.m181b(j24, j31, b5 >>> 32, j28);
        long j32 = b5 & UnsignedInteger.INT_MASK;
        long j33 = j27 + (b6 >>> 32);
        long j34 = b6 & UnsignedInteger.INT_MASK;
        long j35 = ((long) iArr3[13]) & UnsignedInteger.INT_MASK;
        long j36 = (((long) iArr4[25]) & UnsignedInteger.INT_MASK) + (j33 >>> 32);
        long j37 = j33 & UnsignedInteger.INT_MASK;
        long j38 = (((long) iArr4[26]) & UnsignedInteger.INT_MASK) + (j36 >>> 32);
        long j39 = j36 & UnsignedInteger.INT_MASK;
        long j40 = (j35 * j2) + j30;
        int i14 = (int) j40;
        iArr4[21] = i13 | (i14 << 1);
        int i15 = i14 >>> 31;
        long b7 = C0070b.m181b(j35, j10, j40 >>> 32, j32);
        long b8 = C0070b.m181b(j35, j9, b7 >>> 32, j34);
        long j41 = b7 & UnsignedInteger.INT_MASK;
        long j42 = j35;
        long b9 = C0070b.m181b(j42, j31, b8 >>> 32, j37);
        long j43 = b8 & UnsignedInteger.INT_MASK;
        long b10 = C0070b.m181b(j42, j24, b9 >>> 32, j39);
        long j44 = b9 & UnsignedInteger.INT_MASK;
        long j45 = j38 + (b10 >>> 32);
        long j46 = b10 & UnsignedInteger.INT_MASK;
        long j47 = ((long) iArr3[14]) & UnsignedInteger.INT_MASK;
        long j48 = (((long) iArr4[27]) & UnsignedInteger.INT_MASK) + (j45 >>> 32);
        long j49 = j45 & UnsignedInteger.INT_MASK;
        long j50 = (((long) iArr4[28]) & UnsignedInteger.INT_MASK) + (j48 >>> 32);
        long j51 = j48 & UnsignedInteger.INT_MASK;
        long j52 = (j47 * j2) + j41;
        int i16 = (int) j52;
        iArr4[22] = i15 | (i16 << 1);
        int i17 = i16 >>> 31;
        long b11 = C0070b.m181b(j47, j10, j52 >>> 32, j43);
        long b12 = C0070b.m181b(j47, j9, b11 >>> 32, j44);
        long j53 = b11 & UnsignedInteger.INT_MASK;
        long j54 = j47;
        long b13 = C0070b.m181b(j54, j16, b12 >>> 32, j46);
        long j55 = b12 & UnsignedInteger.INT_MASK;
        long b14 = C0070b.m181b(j54, j24, b13 >>> 32, j49);
        long j56 = b13 & UnsignedInteger.INT_MASK;
        long b15 = C0070b.m181b(j54, j35, b14 >>> 32, j51);
        long j57 = b14 & UnsignedInteger.INT_MASK;
        long j58 = j50 + (b15 >>> 32);
        long j59 = b15 & UnsignedInteger.INT_MASK;
        long j60 = ((long) iArr3[15]) & UnsignedInteger.INT_MASK;
        long j61 = (((long) iArr4[29]) & UnsignedInteger.INT_MASK) + (j58 >>> 32);
        long j62 = j58 & UnsignedInteger.INT_MASK;
        long j63 = (((long) iArr4[30]) & UnsignedInteger.INT_MASK) + (j61 >>> 32);
        long j64 = j61 & UnsignedInteger.INT_MASK;
        long j65 = (j2 * j60) + j53;
        int i18 = (int) j65;
        iArr4[23] = i17 | (i18 << 1);
        long j66 = j60;
        long b16 = C0070b.m181b(j10, j66, j65 >>> 32, j55);
        long b17 = C0070b.m181b(j66, j9, b16 >>> 32, j56);
        long j67 = j60;
        long b18 = C0070b.m181b(j67, j16, b17 >>> 32, j57);
        long b19 = C0070b.m181b(j67, j24, b18 >>> 32, j59);
        long b20 = C0070b.m181b(j67, j35, b19 >>> 32, j62);
        long j68 = b20;
        long b21 = C0070b.m181b(j60, j47, b20 >>> 32, j64);
        long j69 = j63 + (b21 >>> 32);
        int i19 = (int) b16;
        iArr4[24] = (i18 >>> 31) | (i19 << 1);
        int i20 = (int) b17;
        iArr4[25] = (i19 >>> 31) | (i20 << 1);
        int i21 = i20 >>> 31;
        int i22 = (int) b18;
        iArr4[26] = i21 | (i22 << 1);
        int i23 = i22 >>> 31;
        int i24 = (int) b19;
        iArr4[27] = i23 | (i24 << 1);
        int i25 = i24 >>> 31;
        int i26 = (int) j68;
        iArr4[28] = i25 | (i26 << 1);
        int i27 = i26 >>> 31;
        int i28 = (int) b21;
        iArr4[29] = i27 | (i28 << 1);
        int i29 = i28 >>> 31;
        int i30 = (int) j69;
        iArr4[30] = i29 | (i30 << 1);
        iArr4[31] = (i30 >>> 31) | ((iArr4[31] + ((int) (j69 >>> 32))) << 1);
        int c = C3436p.m8241c(iArr4, iArr4);
        int a = C3436p.m8239a(24, 16, C3436p.m8239a(0, 8, 0, iArr4, iArr4) + c, iArr4, iArr4) + c;
        int[] iArr5 = new int[8];
        C3436p.m8244f(iArr3, iArr3, iArr5);
        int[] iArr6 = new int[16];
        C3436p.m8232F(iArr5, iArr6);
        C2606m.m6144j(32, C2606m.m6113H(16, 8, iArr6, iArr4) + a, iArr4, 24);
        int i31 = iArr3[16];
        long j70 = ((long) (i31 << 1)) & UnsignedInteger.INT_MASK;
        long j71 = 0;
        int i32 = 0;
        while (true) {
            int i33 = i32 + 16;
            long j72 = ((((long) iArr3[0 + i32]) & UnsignedInteger.INT_MASK) * j70) + (((long) iArr4[i33]) & UnsignedInteger.INT_MASK) + j71;
            iArr4[i33] = (int) j72;
            long j73 = j72 >>> 32;
            i32++;
            if (i32 >= 16) {
                iArr4[32] = (i31 * i31) + ((int) j73);
                return;
            }
            j71 = j73;
        }
    }

    /* renamed from: c */
    public static final C7283c m25318c(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return new C7283c(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }

    /* renamed from: c0 */
    public static String m25319c0(List list) {
        C19383o.m32797g(list, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            boolean z = true;
            i++;
            if (i > 1) {
                sb.append(",");
            }
            if (obj != null) {
                z = obj instanceof CharSequence;
            }
            if (z) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append(String.valueOf(obj));
            }
        }
        sb.append("");
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb2;
    }

    /* renamed from: d */
    public static C1968t m25320d(int i, C1959m mVar) {
        C19383o.m32797g(mVar, "weight");
        return new C1968t(i, mVar, 0, 0);
    }

    /* renamed from: d0 */
    public static void m25321d0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    /* renamed from: e */
    public static C0760w m25322e(float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = (float) 0;
        }
        float f4 = (i & 2) != 0 ? (float) 0 : 0.0f;
        if ((i & 4) != 0) {
            f2 = (float) 0;
        }
        if ((i & 8) != 0) {
            f3 = (float) 0;
        }
        return new C0760w(f, f4, f2, f3);
    }

    /* renamed from: e0 */
    public static final Bitmap m25323e0(View view) {
        C19383o.m32797g(view, "<this>");
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        C19383o.m32796f(createBitmap, "returnedBitmap");
        return createBitmap;
    }

    /* renamed from: f */
    public static final void m25324f(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "modifier");
        dVar2.mo5465u(-72882467);
        SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.f1439a;
        dVar2.mo5465u(-1323940314);
        C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
        LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
        C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
        ComposeUiNode.f3776c0.getClass();
        C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
        ComposableLambdaImpl a = C1700o.m3617a(dVar);
        int i2 = (((((i << 3) & 112) | 384) << 9) & 7168) | 6;
        if (dVar2.mo5446k() instanceof C1299c) {
            dVar2.mo5392A();
            if (dVar2.mo5436f()) {
                dVar2.mo5450m(aVar);
            } else {
                dVar2.mo5452n();
            }
            dVar2.mo5394B();
            Updater.m2571b(dVar2, spacerMeasurePolicy, ComposeUiNode.Companion.f3781e);
            Updater.m2571b(dVar2, bVar, ComposeUiNode.Companion.f3780d);
            Updater.m2571b(dVar2, layoutDirection, ComposeUiNode.Companion.f3782f);
            a.invoke(C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar2, Integer.valueOf((i2 >> 3) & 112));
            dVar2.mo5465u(2058660585);
            dVar2.mo5465u(1142320198);
            if (((i2 >> 9) & 14 & 11) == 2 && dVar2.mo5442i()) {
                dVar2.mo5396C();
            }
            C0048b.m166e(dVar2);
            return;
        }
        C0005b.m45j0();
        throw null;
    }

    /* renamed from: f0 */
    public static C2887s m25325f0(View view) {
        C2887s sVar = (C2887s) view.getTag(R.id.view_tree_lifecycle_owner);
        if (sVar != null) {
            return sVar;
        }
        ViewParent parent = view.getParent();
        while (sVar == null && (parent instanceof View)) {
            View view2 = (View) parent;
            sVar = (C2887s) view2.getTag(R.id.view_tree_lifecycle_owner);
            parent = view2.getParent();
        }
        return sVar;
    }

    /* renamed from: g0 */
    public static final C1011g m25326g0(long j, boolean z, long j2, C2021q qVar) {
        int i = C2022r.f4596c;
        int i2 = (int) (j >> 32);
        return new C1011g(new C1011g.C1012a(qVar.mo7738a(i2), i2, j2), new C1011g.C1012a(qVar.mo7738a(Math.max(C2022r.m4464c(j) - 1, 0)), C2022r.m4464c(j), j2), z);
    }

    /* renamed from: h */
    public static int m25327h(int i, int i2) {
        return (int) ((((long) i) - ((long) i2)) >>> 63);
    }

    /* renamed from: h0 */
    public static final Rect m25328h0(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        TextPaint textPaint2 = textPaint;
        CharSequence charSequence2 = charSequence;
        int i3 = i;
        int i4 = i2;
        Class<MetricAffectingSpan> cls = MetricAffectingSpan.class;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (spanned.nextSpanTransition(i3 + -1, i4, cls) != i4) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint3 = new TextPaint();
                while (i3 < i4) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i4, cls);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, cls);
                    textPaint3.set(textPaint2);
                    C19383o.m32796f(metricAffectingSpanArr, "spans");
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint3);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        C1922e.m4216a(textPaint3, charSequence2, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint3.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            C1922e.m4216a(textPaint2, charSequence2, i3, i4, rect3);
        } else {
            textPaint2.getTextBounds(charSequence.toString(), i3, i4, rect3);
        }
        return rect3;
    }

    /* renamed from: i0 */
    public static final LifecycleCoroutineScopeImpl m25329i0(C2887s sVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        C19383o.m32797g(sVar, "<this>");
        Lifecycle lifecycle = sVar.getLifecycle();
        C19383o.m32796f(lifecycle, "lifecycle");
        while (true) {
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.f6425a.get();
            if (lifecycleCoroutineScopeImpl == null) {
                boolean z = true;
                C19838x1 j = C0005b.m44j();
                C20153b bVar = C19760n0.f43719a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, j.plus(C19729m.f43681a.mo72111E0()));
                AtomicReference<Object> atomicReference = lifecycle.f6425a;
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, lifecycleCoroutineScopeImpl)) {
                        if (atomicReference.get() != null) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    lifecycleCoroutineScopeImpl.mo10743d();
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    /* renamed from: j */
    public static C7146d m25330j(ECParameterSpec eCParameterSpec, boolean z) {
        if (eCParameterSpec instanceof C7622c) {
            C7622c cVar = (C7622c) eCParameterSpec;
            C7959a s = C19543e0.m33332s(cVar.f16909a);
            if (s == null) {
                s = new C7959a(cVar.f16909a);
            }
            return new C7146d(s);
        } else if (eCParameterSpec == null) {
            return new C7146d(C8037z.f17524b);
        } else {
            C7676c g = C6171d.m12351g(eCParameterSpec.getCurve());
            return new C7146d(new C7148f(g, C6171d.m12353i(g, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
    }

    /* renamed from: j0 */
    public static final int m25331j0(C2021q qVar, C8345d dVar, long j) {
        int length = qVar.f4589a.f4556a.length();
        if (dVar.mo20926a(j)) {
            return C19388s.m32833M(qVar.mo7751l(j), 0, length);
        }
        if (SelectionMode.Vertical.m34731compare3MmeM6k$foundation_release(j, dVar) < 0) {
            return 0;
        }
        return length;
    }

    /* renamed from: k0 */
    public static final CoroutineDispatcher m25332k0(RoomDatabase roomDatabase) {
        C19383o.m32797g(roomDatabase, "<this>");
        Map<String, Object> map = roomDatabase.f7470k;
        C19383o.m32796f(map, "backingFieldMap");
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            Executor executor = roomDatabase.f7461b;
            C19383o.m32796f(executor, "queryExecutor");
            CoroutineDispatcher coroutineDispatcher = null;
            C19757m0 m0Var = executor instanceof C19757m0 ? (C19757m0) executor : null;
            if (m0Var != null) {
                coroutineDispatcher = m0Var.f43716b;
            }
            obj = coroutineDispatcher == null ? new C19837x0(executor) : coroutineDispatcher;
            map.put("QueryDispatcher", obj);
        }
        return (CoroutineDispatcher) obj;
    }

    /* renamed from: l */
    public static String m25333l(BigInteger bigInteger, C7778y yVar) {
        byte[] i = C8212a.m16502i(bigInteger.toByteArray(), yVar.f17208b.toByteArray(), yVar.f17207a.toByteArray());
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

    /* renamed from: l0 */
    public static final View m25334l0(Activity activity) {
        C19383o.m32797g(activity, "<this>");
        View findViewById = activity.findViewById(16908290);
        C19383o.m32796f(findViewById, "findViewById<View>(android.R.id.content)");
        return findViewById;
    }

    /* renamed from: m */
    public static void m25335m(int[] iArr) {
        int i = iArr[16];
        int x = C2606m.m6158x(16, i >>> 9, iArr) + (i & 511);
        if (x > 511 || (x == 511 && C2606m.m6110E(16, iArr, f35096v))) {
            x = (C2606m.m6115J(iArr) + x) & 511;
        }
        iArr[16] = x;
    }

    /* renamed from: m0 */
    public static final CoroutineDispatcher m25336m0(RoomDatabase roomDatabase) {
        C19383o.m32797g(roomDatabase, "<this>");
        Map<String, Object> map = roomDatabase.f7470k;
        C19383o.m32796f(map, "backingFieldMap");
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            C3238i0 i0Var = roomDatabase.f7462c;
            C19383o.m32796f(i0Var, "transactionExecutor");
            CoroutineDispatcher coroutineDispatcher = null;
            C19757m0 m0Var = i0Var instanceof C19757m0 ? (C19757m0) i0Var : null;
            if (m0Var != null) {
                coroutineDispatcher = m0Var.f43716b;
            }
            obj = coroutineDispatcher == null ? new C19837x0(i0Var) : coroutineDispatcher;
            map.put("TransactionDispatcher", obj);
        }
        return (CoroutineDispatcher) obj;
    }

    /* renamed from: n0 */
    public static void m25337n0(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 6; i++) {
            C0114h.m331z(jArr2, i << 1, jArr[i]);
        }
        jArr2[12] = C0114h.m277H((int) jArr[6]);
    }

    /* renamed from: o0 */
    public static boolean m25338o0(List list) {
        return list != null && !list.isEmpty();
    }

    /* renamed from: p */
    public static void m25339p(int[] iArr, int[] iArr2, int[] iArr3) {
        int e = C2606m.m6139e(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (e > 511 || (e == 511 && C2606m.m6110E(16, iArr3, f35096v))) {
            e = (C2606m.m6115J(iArr3) + e) & 511;
        }
        iArr3[16] = e;
    }

    /* renamed from: p0 */
    public static boolean m25340p0(View view) {
        if (view != null) {
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        return false;
    }

    /* renamed from: q */
    public static void m25341q(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[13];
        m25337n0(jArr, jArr3);
        while (true) {
            m25284I(jArr3, jArr2);
            i--;
            if (i > 0) {
                m25337n0(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: q0 */
    public static final boolean m25342q0(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        C19383o.m32797g(fArr3, "$this$invertTo");
        C19383o.m32797g(fArr4, "other");
        float f = fArr3[0];
        float f2 = fArr3[1];
        float f3 = fArr3[2];
        float f4 = fArr3[3];
        float f5 = fArr3[4];
        float f6 = fArr3[5];
        float f7 = fArr3[6];
        float f8 = fArr3[7];
        float f9 = fArr3[8];
        float f10 = fArr3[9];
        float f11 = fArr3[10];
        float f12 = fArr3[11];
        float f13 = fArr3[12];
        float f14 = fArr3[13];
        float f15 = fArr3[14];
        float f16 = fArr3[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 == 0.0f) {
            return false;
        }
        float f30 = 1.0f / f29;
        fArr4[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
        fArr4[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
        fArr4[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
        fArr4[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
        float f31 = -f5;
        fArr4[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
        fArr4[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
        float f32 = -f13;
        fArr4[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
        fArr4[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
        fArr4[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
        fArr4[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
        fArr4[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
        fArr4[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
        fArr4[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
        fArr4[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
        fArr4[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
        fArr4[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        return true;
    }

    /* renamed from: r */
    public static boolean m25343r(int i, String str) {
        return !str.equals("") && str.length() == i;
    }

    /* renamed from: r0 */
    public static final boolean m25344r0(Activity activity) {
        C19383o.m32797g(activity, "<this>");
        Rect rect = new Rect();
        m25334l0(activity).getWindowVisibleDisplayFrame(rect);
        return m25334l0(activity).getHeight() - rect.height() > C19543e0.m33295K(50, activity);
    }

    /* renamed from: s */
    public static boolean m25345s(String str) {
        return !str.equals("");
    }

    /* renamed from: s0 */
    public static boolean m25346s0(Context context) {
        return ((InputMethodManager) context.getSystemService("input_method")).isActive();
    }

    /* renamed from: t */
    public static boolean m25347t(String str) {
        return str.length() == 36;
    }

    /* renamed from: t0 */
    public static final boolean m25348t0(Long l) {
        return l != null && l.longValue() > 0;
    }

    /* renamed from: u */
    public static final C1338j0 m25349u(boolean z, boolean z2, C0639i iVar, C1166a2 a2Var, float f, float f2, C1302d dVar, int i) {
        C1342k1 k1Var;
        dVar.mo5465u(1097899920);
        C1338j0 a = C0634d.m1441a(iVar, dVar, (i >> 6) & 14);
        C1342k1<C1545s> b = a2Var.mo5223b(z, z2, iVar, dVar, (i & 14) | (i & 112) | (i & 896) | (i & 7168));
        if (!((Boolean) a.getValue()).booleanValue()) {
            f = f2;
        }
        if (z) {
            dVar.mo5465u(1685712037);
            k1Var = C0411a.m1105a(f, C0761x.m1706Z0(150, 0, (C0448r) null, 6), dVar, 48);
            dVar.mo5406H();
        } else {
            dVar.mo5465u(1685712135);
            k1Var = C0761x.m1664E0(new C7284d(f2), dVar);
            dVar.mo5406H();
        }
        C1338j0 E0 = C0761x.m1664E0(new C0556g(((C7284d) k1Var.getValue()).f16155b, new C1532l0(b.getValue().f3366a)), dVar);
        dVar.mo5406H();
        return E0;
    }

    /* renamed from: u0 */
    public static final C19375g m25350u0(Object[] objArr) {
        C19383o.m32797g(objArr, "array");
        return new C19375g(objArr);
    }

    /* renamed from: v */
    public static final LinkedHashMap m25351v(C11462y yVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ResponseConstants.COUNTRY_ID, String.valueOf(yVar.f25307g));
        linkedHashMap.put(ResponseConstants.FIRST_LINE, yVar.f25302b);
        linkedHashMap.put("city", yVar.f25304d);
        linkedHashMap.put("state", yVar.f25305e);
        linkedHashMap.put(ResponseConstants.ZIP, yVar.f25306f);
        linkedHashMap.put(ResponseConstants.IS_DEFAULT_SHIPPING, String.valueOf(yVar.f25309i));
        linkedHashMap.put("name", yVar.f25301a);
        linkedHashMap.put(ResponseConstants.SECOND_LINE, yVar.f25303c);
        linkedHashMap.put(ResponseConstants.PHONE, String.valueOf(yVar.f25308h));
        linkedHashMap.put("verification_state", String.valueOf(yVar.f25310j));
        return linkedHashMap;
    }

    /* renamed from: v0 */
    public static final C1436d m25352v0(C1436d dVar, C19862q qVar) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(qVar, "measure");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new C1703q(qVar));
    }

    /* renamed from: w */
    public static void m25353w(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            StringBuilder sb = new StringBuilder(C0391c.m1055a(str, C0391c.m1055a(glGetShaderInfoLog, 10)));
            sb.append(glGetShaderInfoLog);
            sb.append(", source: ");
            sb.append(str);
            Log.e("GlUtil", sb.toString());
        }
        GLES20.glAttachShader(i2, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        m25292M();
    }

    /* renamed from: w0 */
    public static final float m25354w0(float f, float f2, float f3) {
        return (f3 * f2) + ((((float) 1) - f3) * f);
    }

    /* renamed from: x */
    public static byte m25355x(int i) {
        int h = m25327h(i, 26);
        int y = m25357y(i, 25) & m25327h(i, 52);
        int y2 = m25357y(i, 51) & m25327h(i, 62);
        int F = m25278F(i, 62);
        int F2 = m25278F(i, 63);
        int i2 = i + 0 + 65;
        int i3 = (i - 26) + 97;
        int i4 = (i - 52) + 48;
        return (byte) ((i4 ^ ((0 ^ i4) & (y2 - 1))) | (((h - 1) & (0 ^ i2)) ^ i2) | (((y - 1) & (0 ^ i3)) ^ i3) | (((F - 1) & 45) ^ 45) | (((F2 - 1) & 95) ^ 95));
    }

    /* renamed from: x0 */
    public static final String m25356x0(float f, Integer num) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        if (num != null) {
            numberInstance.setMinimumFractionDigits(num.intValue());
            numberInstance.setMaximumFractionDigits(num.intValue());
        }
        String format = numberInstance.format(Float.valueOf(f));
        C19383o.m32796f(format, "formatter.format(this)");
        return format;
    }

    /* renamed from: y */
    public static int m25357y(int i, int i2) {
        return (int) ((((long) i2) - ((long) i)) >>> 63);
    }

    /* renamed from: y0 */
    public static final Point m25358y0(View view) {
        C19383o.m32797g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    /* renamed from: z */
    public static void m25359z(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        int[] iArr6 = new int[33];
        C3436p.m8230D(iArr4, iArr5, iArr6);
        long j = ((long) iArr5[8]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr5[9]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr5[10]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr5[11]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr5[12]) & UnsignedInteger.INT_MASK;
        long j6 = ((long) iArr5[13]) & UnsignedInteger.INT_MASK;
        long j7 = ((long) iArr5[14]) & UnsignedInteger.INT_MASK;
        long j8 = ((long) iArr5[15]) & UnsignedInteger.INT_MASK;
        long j9 = ((long) iArr4[8]) & UnsignedInteger.INT_MASK;
        long j10 = 0;
        long j11 = (j9 * j) + 0;
        long j12 = j;
        iArr6[16] = (int) j11;
        long j13 = (j9 * j2) + (j11 >>> 32);
        iArr6[17] = (int) j13;
        long j14 = (j9 * j3) + (j13 >>> 32);
        iArr6[18] = (int) j14;
        long j15 = (j9 * j4) + (j14 >>> 32);
        iArr6[19] = (int) j15;
        long j16 = (j9 * j5) + (j15 >>> 32);
        iArr6[20] = (int) j16;
        long j17 = (j9 * j6) + (j16 >>> 32);
        iArr6[21] = (int) j17;
        long j18 = (j9 * j7) + (j17 >>> 32);
        iArr6[22] = (int) j18;
        long j19 = (j9 * j8) + (j18 >>> 32);
        iArr6[23] = (int) j19;
        iArr6[24] = (int) (j19 >>> 32);
        int i = 1;
        int i2 = 1;
        int i3 = 16;
        while (i2 < 8) {
            i3 += i;
            int i4 = i2;
            long j20 = ((long) iArr[i2 + 8]) & UnsignedInteger.INT_MASK;
            int i5 = i3 + 0;
            long j21 = j20;
            long j22 = (j20 * j12) + (((long) iArr6[i5]) & UnsignedInteger.INT_MASK) + 0;
            iArr6[i5] = (int) j22;
            int i6 = i3 + 1;
            int[] iArr7 = iArr6;
            long j23 = (j21 * j2) + (((long) iArr6[i6]) & UnsignedInteger.INT_MASK) + (j22 >>> 32);
            iArr7[i6] = (int) j23;
            int i7 = i3 + 2;
            long j24 = (j21 * j3) + (((long) iArr7[i7]) & UnsignedInteger.INT_MASK) + (j23 >>> 32);
            iArr7[i7] = (int) j24;
            int i8 = i3 + 3;
            long j25 = (j21 * j4) + (((long) iArr7[i8]) & UnsignedInteger.INT_MASK) + (j24 >>> 32);
            iArr7[i8] = (int) j25;
            int i9 = i3 + 4;
            long j26 = (j21 * j5) + (((long) iArr7[i9]) & UnsignedInteger.INT_MASK) + (j25 >>> 32);
            iArr7[i9] = (int) j26;
            int i10 = i3 + 5;
            long j27 = (j21 * j6) + (((long) iArr7[i10]) & UnsignedInteger.INT_MASK) + (j26 >>> 32);
            iArr7[i10] = (int) j27;
            int i11 = i3 + 6;
            long j28 = (j21 * j7) + (((long) iArr7[i11]) & UnsignedInteger.INT_MASK) + (j27 >>> 32);
            iArr7[i11] = (int) j28;
            int i12 = i3 + 7;
            long j29 = (j21 * j8) + (((long) iArr7[i12]) & UnsignedInteger.INT_MASK) + (j28 >>> 32);
            iArr7[i12] = (int) j29;
            iArr7[i3 + 8] = (int) (j29 >>> 32);
            i2 = i4 + 1;
            j2 = j2;
            iArr6 = iArr7;
            i = 1;
        }
        int[] iArr8 = iArr;
        int[] iArr9 = iArr6;
        int c = C3436p.m8241c(iArr9, iArr9);
        int i13 = 0;
        int a = C3436p.m8239a(24, 16, C3436p.m8239a(0, 8, 0, iArr9, iArr9) + c, iArr9, iArr9) + c;
        int[] iArr10 = new int[8];
        int[] iArr11 = new int[8];
        int[] iArr12 = iArr2;
        boolean z = C3436p.m8244f(iArr8, iArr8, iArr10) != C3436p.m8244f(iArr12, iArr12, iArr11);
        int[] iArr13 = new int[16];
        C3436p.m8230D(iArr10, iArr11, iArr13);
        C2606m.m6144j(32, a + (z ? C2606m.m6138d(16, iArr13, iArr9, 8) : C2606m.m6113H(16, 8, iArr13, iArr9)), iArr9, 24);
        int i14 = iArr8[16];
        int i15 = iArr12[16];
        long j30 = ((long) i14) & UnsignedInteger.INT_MASK;
        long j31 = ((long) i15) & UnsignedInteger.INT_MASK;
        while (true) {
            int i16 = i13 + 16;
            long j32 = j30;
            long j33 = ((((long) iArr8[i13]) & UnsignedInteger.INT_MASK) * j31) + ((((long) iArr12[i13]) & UnsignedInteger.INT_MASK) * j30) + (((long) iArr9[i16]) & UnsignedInteger.INT_MASK) + j10;
            iArr9[i16] = (int) j33;
            long j34 = j33 >>> 32;
            i13++;
            if (i13 >= 16) {
                iArr9[32] = (i14 * i15) + ((int) j34);
                m25280G(iArr9, iArr3);
                return;
            }
            int[] iArr14 = iArr3;
            j10 = j34;
            j30 = j32;
        }
    }

    /* renamed from: z0 */
    public static void m25360z0(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: B0 */
    public void mo21278B0(String str) {
        throw null;
    }

    /* renamed from: a */
    public boolean mo5754a(Object obj, File file, C7114e eVar) {
        try {
            C4410a.m10113c((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }

    public Object apply(Object obj) {
        C19383o.m32797g(obj, "item");
        C11463z.C11464a aVar = (C11463z.C11464a) (!(obj instanceof C11463z.C11464a) ? null : obj);
        if (aVar != null) {
            return aVar;
        }
        StringBuilder h = C0072d.m201h("Expected value of type ");
        h.append(C11463z.C11464a.class.getSimpleName());
        h.append(", but it was ");
        h.append(obj.getClass().getSimpleName());
        throw new UnexpectedResultException(h.toString());
    }

    /* renamed from: g */
    public boolean mo7680g(Object obj, File file, File file2) {
        Class<?> cls = obj.getClass();
        try {
            return new File(String.class.cast(C19382n.m32728P0(cls, "optimizedPathFor", File.class, File.class).invoke((Object) null, new Object[]{file, file2}))).exists();
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to invoke static method %s on type %s", new Object[]{"optimizedPathFor", cls}), e);
        }
    }

    /* renamed from: i */
    public Object mo1134i() {
        return new LinkedHashMap();
    }

    /* renamed from: k */
    public ArrayList mo19k(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        C19383o.m32797g(fragmentNavigationKey, "key");
        if (fragmentNavigationKey instanceof YouKey) {
            return C17782b.m29888u(fragmentNavigationKey);
        }
        throw new UnsupportedNavigationException("Invalid key " + fragmentNavigationKey + " provided to " + this);
    }

    /* renamed from: n */
    public void mo20n(boolean z) {
        if (z) {
            C13418j.f29396p = true;
        }
    }

    /* renamed from: o */
    public int mo21o() {
        return R.id.menu_bottom_nav_home;
    }

    public /* synthetic */ Object zza() {
        return new C18200b();
    }
}
