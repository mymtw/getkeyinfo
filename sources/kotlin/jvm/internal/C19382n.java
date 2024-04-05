package kotlin.jvm.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.C0114h;
import androidx.compose.animation.C0388a;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.PainterModifier;
import androidx.compose.p015ui.focus.FocusModifier;
import androidx.compose.p015ui.graphics.C1491b;
import androidx.compose.p015ui.graphics.C1493c;
import androidx.compose.p015ui.graphics.C1514d;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.painter.Painter;
import androidx.compose.p015ui.graphics.vector.C1553c;
import androidx.compose.p015ui.input.pointer.C1640l;
import androidx.compose.p015ui.layout.C1667b;
import androidx.compose.p015ui.layout.C1670c;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1302d;
import androidx.core.view.C2332t0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.work.C3436p;
import androidx.work.Worker;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p051a.C6153i;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p051a.C6154j;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.minidev.json.p062b.C6232i;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.cardinalcommerce.shared.p065cs.p069e.C6272b;
import com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeHTMLView;
import com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import com.etsy.android.R;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.DynamicAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.sdl.DelegateSdlEvent;
import com.etsy.android.lib.models.cardviewelement.stats.SdlEvent;
import com.etsy.android.lib.network.oauth2.AccessTokens;
import com.etsy.android.lib.network.oauth2.OAuth2AccessToken;
import com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayload;
import com.etsy.android.lib.network.oauth2.XAuthAccessToken;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.p327ui.core.review.bottomsheet.ListingVideoReviewBottomSheetFragment;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CartWithSavedKey;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.android.gms.internal.measurement.C14720l8;
import com.google.android.gms.measurement.internal.C14941c2;
import com.google.android.gms.measurement.internal.C14950d2;
import com.google.android.gms.measurement.internal.C14959e2;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.assetpacks.C15645q2;
import com.google.android.play.core.internal.zzbx;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import dagger.android.C17550a;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19318k;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.collections.EmptySet;
import kotlin.reflect.C19421p;
import kotlin.text.C19459m;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.internal.C19736t;
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent$registerEventListener$layoutListener$1;
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent$setEventListener$2;
import org.apache.commons.lang3.ClassUtils;
import p009a8.C0042a;
import p010a9.C0048b;
import p103f5.C6790e;
import p103f5.C6791f;
import p151j5.C7119b;
import p174m0.C7282b;
import p191n7.C7486a;
import p191n7.C7487b;
import p191n7.C7490e;
import p199o6.C7630k;
import p199o6.C7632m;
import p223r5.C7766m;
import p223r5.C7767n;
import p223r5.C7768o;
import p288y.C8343c;
import p343ee.C12693a;
import p440s9.C13366a;
import p504ai.C13983i;
import p568fn.C17782b;
import p634np.C18290b;
import p643op.C18335a;
import p689ul.C18604b;
import p733ar.C18974a;
import p733ar.C18975b;
import p736cq.C18981a;
import p753kq.C19857l;

/* renamed from: kotlin.jvm.internal.n */
public class C19382n implements C2332t0, C17550a, C18290b, C14941c2, C18604b, C12693a {

    /* renamed from: b */
    public static final /* synthetic */ C19382n f43252b = new C19382n();

    /* renamed from: c */
    public static final /* synthetic */ C19382n f43253c = new C19382n();

    /* renamed from: d */
    public static final C19736t f43254d = new C19736t("UNDEFINED");

    /* renamed from: e */
    public static final C19736t f43255e = new C19736t("REUSABLE_CLAIMED");

    /* renamed from: f */
    public static Context f43256f;

    /* renamed from: g */
    public static boolean f43257g;

    /* renamed from: h */
    public static C1553c f43258h;

    /* renamed from: i */
    public static final int[] f43259i = {-1, -1, -1, -3};

    /* renamed from: j */
    public static final int[] f43260j = {1, 0, 0, 4, -2, -1, 3, -4};

    /* renamed from: k */
    public static final int[] f43261k = {-1, -1, -1, -5, 1, 0, -4, 3};

    /* renamed from: l */
    public static final int[] f43262l = {R.attr.resize_mode};

    /* renamed from: m */
    public static final int[] f43263m = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.bar_gravity, R.attr.bar_height, R.attr.buffered_color, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.touch_target_height, R.attr.unplayed_color};

    /* renamed from: n */
    public static final int[] f43264n = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.bar_gravity, R.attr.bar_height, R.attr.buffered_color, R.attr.controller_layout_id, R.attr.fastforward_increment, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.repeat_toggle_modes, R.attr.rewind_increment, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.show_fastforward_button, R.attr.show_next_button, R.attr.show_previous_button, R.attr.show_rewind_button, R.attr.show_shuffle_button, R.attr.show_timeout, R.attr.time_bar_min_update_interval, R.attr.touch_target_height, R.attr.unplayed_color};

    /* renamed from: o */
    public static final int[] f43265o = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.auto_show, R.attr.bar_height, R.attr.buffered_color, R.attr.controller_layout_id, R.attr.default_artwork, R.attr.fastforward_increment, R.attr.hide_during_ads, R.attr.hide_on_touch, R.attr.keep_content_on_player_reset, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.player_layout_id, R.attr.repeat_toggle_modes, R.attr.resize_mode, R.attr.rewind_increment, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.show_buffering, R.attr.show_shuffle_button, R.attr.show_timeout, R.attr.shutter_background_color, R.attr.surface_type, R.attr.time_bar_min_update_interval, R.attr.touch_target_height, R.attr.unplayed_color, R.attr.use_artwork, R.attr.use_controller};

    /* renamed from: p */
    public static final int[] f43266p = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.animation_enabled, R.attr.bar_gravity, R.attr.bar_height, R.attr.buffered_color, R.attr.controller_layout_id, R.attr.fastforward_increment, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.repeat_toggle_modes, R.attr.rewind_increment, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.show_fastforward_button, R.attr.show_next_button, R.attr.show_previous_button, R.attr.show_rewind_button, R.attr.show_shuffle_button, R.attr.show_subtitle_button, R.attr.show_timeout, R.attr.show_vr_button, R.attr.time_bar_min_update_interval, R.attr.touch_target_height, R.attr.unplayed_color};

    /* renamed from: q */
    public static final int[] f43267q = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.animation_enabled, R.attr.auto_show, R.attr.bar_gravity, R.attr.bar_height, R.attr.buffered_color, R.attr.controller_layout_id, R.attr.default_artwork, R.attr.fastforward_increment, R.attr.hide_during_ads, R.attr.hide_on_touch, R.attr.keep_content_on_player_reset, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.player_layout_id, R.attr.repeat_toggle_modes, R.attr.resize_mode, R.attr.rewind_increment, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.show_buffering, R.attr.show_shuffle_button, R.attr.show_subtitle_button, R.attr.show_timeout, R.attr.show_vr_button, R.attr.shutter_background_color, R.attr.surface_type, R.attr.time_bar_min_update_interval, R.attr.touch_target_height, R.attr.unplayed_color, R.attr.use_artwork, R.attr.use_controller};

    /* renamed from: A */
    public static void m32697A(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[8];
        m32752i0(jArr, jArr3);
        while (true) {
            m32727P(jArr3, jArr2);
            i--;
            if (i > 0) {
                m32752i0(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: A0 */
    public static final Object m32698A0(FocusModifier focusModifier, int i, C19857l lVar) {
        C1667b bVar = focusModifier.f3157i;
        if (bVar == null) {
            return null;
        }
        int i2 = 5;
        boolean z = false;
        if (!(i == 5)) {
            if (i == 6) {
                i2 = 6;
            } else {
                if (i == 3) {
                    i2 = 3;
                } else {
                    if (i == 4) {
                        i2 = 4;
                    } else {
                        if (i == 1) {
                            i2 = 2;
                        } else {
                            if (i == 2) {
                                z = true;
                            }
                            if (z) {
                                i2 = 1;
                            } else {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
                            }
                        }
                    }
                }
            }
        }
        return bVar.mo4250a(lVar, i2);
    }

    /* renamed from: B */
    public static final void m32699B(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(C0070b.m183e("Index ", i, " is out of bounds. The list has ", size, " elements."));
        }
    }

    /* renamed from: B0 */
    public static final void m32700B0(FragmentActivity fragmentActivity, C18974a aVar) {
        fragmentActivity.getApplication().registerActivityLifecycleCallbacks(new KeyboardVisibilityEvent$setEventListener$2(m32780x0(fragmentActivity, aVar), fragmentActivity, fragmentActivity));
    }

    /* renamed from: C */
    public static final void m32701C(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException(C0070b.m183e("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
        } else if (i < 0) {
            throw new IndexOutOfBoundsException(C0069a.m175f("fromIndex (", i, ") is less than 0."));
        } else if (i2 > size) {
            throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }

    /* renamed from: C0 */
    public static final Set m32702C0(Object obj) {
        Set singleton = Collections.singleton(obj);
        C19383o.m32796f(singleton, "singleton(element)");
        return singleton;
    }

    /* renamed from: D */
    public static long m32703D(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m32707F(j2, j)));
        return j2;
    }

    /* renamed from: D0 */
    public static final Set m32704D0(Object... objArr) {
        return objArr.length > 0 ? C19318k.m32621m1(objArr) : EmptySet.INSTANCE;
    }

    /* renamed from: E */
    public static long m32705E(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m32707F(j2, j)));
        return j2;
    }

    /* renamed from: E0 */
    public static final boolean m32706E0() {
        return Build.VERSION.SDK_INT >= 33;
    }

    /* renamed from: F */
    public static long m32707F(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: F0 */
    public static final AccessTokens m32708F0(OAuth2AccessTokenPayload oAuth2AccessTokenPayload) {
        C19383o.m32797g(oAuth2AccessTokenPayload, "<this>");
        OAuth2AccessToken.C8740a aVar = OAuth2AccessToken.Companion;
        String str = oAuth2AccessTokenPayload.f19186a;
        aVar.getClass();
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        String F1 = C19459m.m33033F1(str, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        if (!C19383o.m32792b(F1, str)) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            new C8890e0();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis()) + oAuth2AccessTokenPayload.f19188c;
            String str2 = oAuth2AccessTokenPayload.f19186a;
            String str3 = oAuth2AccessTokenPayload.f19189d;
            String str4 = oAuth2AccessTokenPayload.f19187b;
            Set set = oAuth2AccessTokenPayload.f19192g;
            if (set == null) {
                set = EmptySet.INSTANCE;
            }
            return new AccessTokens(new OAuth2AccessToken(str2, str3, seconds, str4, F1, set), new XAuthAccessToken(oAuth2AccessTokenPayload.f19190e, oAuth2AccessTokenPayload.f19191f, F1));
        }
        throw new IllegalArgumentException("User id was not found in access token.");
    }

    /* renamed from: G */
    public static final void m32709G(Appendable appendable, Object obj, C19857l lVar) {
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    /* renamed from: G0 */
    public static final void m32710G0(C1640l lVar, long j, C19857l lVar2, boolean z) {
        MotionEvent a = lVar.mo6609a();
        if (a != null) {
            int action = a.getAction();
            if (z) {
                a.setAction(3);
            }
            a.offsetLocation(-C8343c.m16642c(j), -C8343c.m16643d(j));
            lVar2.invoke(a);
            a.offsetLocation(C8343c.m16642c(j), C8343c.m16643d(j));
            a.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }

    /* renamed from: H */
    public static void m32711H(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        C3436p.m8263z(iArr, iArr2, iArr4);
        m32721M(iArr4, iArr3);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.etsy.android.lib.network.oauth2.OAuth2Error m32712H0(com.etsy.android.lib.network.oauth2.OAuth2ErrorPayLoad r3) {
        /*
            com.etsy.android.lib.network.oauth2.OAuth2Error$a r0 = com.etsy.android.lib.network.oauth2.OAuth2Error.Companion
            java.lang.String r1 = r3.f19197a
            java.lang.String r2 = r3.f19198b
            r0.getClass()
            java.lang.String r0 = "errorType"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            java.lang.String r0 = "errorDescription"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -847806252: goto L_0x007c;
                case -837157364: goto L_0x0070;
                case -835880527: goto L_0x0064;
                case -632018157: goto L_0x0042;
                case -190904121: goto L_0x0036;
                case 1330404726: goto L_0x002a;
                case 2117379143: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0088
        L_0x001c:
            java.lang.String r0 = "invalid_request"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0026
            goto L_0x0088
        L_0x0026:
            com.etsy.android.lib.network.oauth2.OAuth2Error$ErrorType r0 = com.etsy.android.lib.network.oauth2.OAuth2Error.ErrorType.InvalidRequest
            goto L_0x008a
        L_0x002a:
            java.lang.String r0 = "unauthorized_client"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0033
            goto L_0x0088
        L_0x0033:
            com.etsy.android.lib.network.oauth2.OAuth2Error$ErrorType r0 = com.etsy.android.lib.network.oauth2.OAuth2Error.ErrorType.UnauthorizedClient
            goto L_0x008a
        L_0x0036:
            java.lang.String r0 = "unsupported_grant_type"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003f
            goto L_0x0088
        L_0x003f:
            com.etsy.android.lib.network.oauth2.OAuth2Error$ErrorType r0 = com.etsy.android.lib.network.oauth2.OAuth2Error.ErrorType.UnsupportedGrantType
            goto L_0x008a
        L_0x0042:
            java.lang.String r0 = "invalid_client"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004b
            goto L_0x0088
        L_0x004b:
            java.lang.String r0 = "ato_reset"
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r2, r0)
            if (r0 == 0) goto L_0x0056
            com.etsy.android.lib.network.oauth2.OAuth2Error$ErrorType r0 = com.etsy.android.lib.network.oauth2.OAuth2Error.ErrorType.InvalidClientAtoReset
            goto L_0x008a
        L_0x0056:
            java.lang.String r0 = "ato_locked_out"
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r2, r0)
            if (r0 == 0) goto L_0x0061
            com.etsy.android.lib.network.oauth2.OAuth2Error$ErrorType r0 = com.etsy.android.lib.network.oauth2.OAuth2Error.ErrorType.InvalidClientAtoLockedOut
            goto L_0x008a
        L_0x0061:
            com.etsy.android.lib.network.oauth2.OAuth2Error$ErrorType r0 = com.etsy.android.lib.network.oauth2.OAuth2Error.ErrorType.InvalidClient
            goto L_0x008a
        L_0x0064:
            java.lang.String r0 = "invalid_token"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x006d
            goto L_0x0088
        L_0x006d:
            com.etsy.android.lib.network.oauth2.OAuth2Error$ErrorType r0 = com.etsy.android.lib.network.oauth2.OAuth2Error.ErrorType.InvalidToken
            goto L_0x008a
        L_0x0070:
            java.lang.String r0 = "invalid_scope"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0079
            goto L_0x0088
        L_0x0079:
            com.etsy.android.lib.network.oauth2.OAuth2Error$ErrorType r0 = com.etsy.android.lib.network.oauth2.OAuth2Error.ErrorType.InvalidScope
            goto L_0x008a
        L_0x007c:
            java.lang.String r0 = "invalid_grant"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0085
            goto L_0x0088
        L_0x0085:
            com.etsy.android.lib.network.oauth2.OAuth2Error$ErrorType r0 = com.etsy.android.lib.network.oauth2.OAuth2Error.ErrorType.InvalidGrant
            goto L_0x008a
        L_0x0088:
            com.etsy.android.lib.network.oauth2.OAuth2Error$ErrorType r0 = com.etsy.android.lib.network.oauth2.OAuth2Error.ErrorType.UnexpectedError
        L_0x008a:
            com.etsy.android.lib.network.oauth2.OAuth2Error r1 = new com.etsy.android.lib.network.oauth2.OAuth2Error
            java.lang.String r2 = r3.f19198b
            java.lang.String r3 = r3.f19199c
            if (r3 != 0) goto L_0x0094
            java.lang.String r3 = ""
        L_0x0094:
            r1.<init>(r0, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C19382n.m32712H0(com.etsy.android.lib.network.oauth2.OAuth2ErrorPayLoad):com.etsy.android.lib.network.oauth2.OAuth2Error");
    }

    /* renamed from: I */
    public static void m32713I(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    /* renamed from: I0 */
    public static final ArrayList m32714I0(List list) {
        Map map;
        C19383o.m32797g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (C19383o.m32792b(((SdlEvent) next).getClientEventTrigger(), "seen")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SdlEvent sdlEvent = (SdlEvent) it.next();
            Map<String, Object> clientEventProperties = sdlEvent.getClientEventProperties();
            if (clientEventProperties != null) {
                map = new LinkedHashMap(C19421p.m32930T(clientEventProperties.size()));
                for (Map.Entry entry : clientEventProperties.entrySet()) {
                    map.put(new DynamicAnalyticsProperty((String) entry.getKey()), entry.getValue());
                }
            } else {
                map = null;
            }
            String clientEventName = sdlEvent.getClientEventName();
            if (map == null) {
                map = C19294b0.m32559p0();
            }
            arrayList2.add(new C8696j(clientEventName, map));
        }
        return C19327t.m32661q1(arrayList2);
    }

    /* renamed from: J */
    public static void m32715J(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    /* renamed from: J0 */
    public static String m32716J0(int i) {
        boolean z = false;
        if (i == 0) {
            return "Blocking";
        }
        if (i == 1) {
            return "Optional";
        }
        if (i == 2) {
            z = true;
        }
        if (z) {
            return "Async";
        }
        return "Invalid(value=" + i + ')';
    }

    /* renamed from: K */
    public static final Bundle m32717K(Pair... pairArr) {
        C19383o.m32797g(pairArr, "pairs");
        Bundle bundle = new Bundle(pairArr.length);
        int length = pairArr.length;
        int i = 0;
        while (i < length) {
            Pair pair = pairArr[i];
            i++;
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 == null) {
                bundle.putString(str, (String) null);
            } else if (component2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) component2).booleanValue());
            } else if (component2 instanceof Byte) {
                bundle.putByte(str, ((Number) component2).byteValue());
            } else if (component2 instanceof Character) {
                bundle.putChar(str, ((Character) component2).charValue());
            } else if (component2 instanceof Double) {
                bundle.putDouble(str, ((Number) component2).doubleValue());
            } else if (component2 instanceof Float) {
                bundle.putFloat(str, ((Number) component2).floatValue());
            } else if (component2 instanceof Integer) {
                bundle.putInt(str, ((Number) component2).intValue());
            } else if (component2 instanceof Long) {
                bundle.putLong(str, ((Number) component2).longValue());
            } else if (component2 instanceof Short) {
                bundle.putShort(str, ((Number) component2).shortValue());
            } else if (component2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) component2);
            } else if (component2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) component2);
            } else if (component2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) component2);
            } else if (component2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) component2);
            } else if (component2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) component2);
            } else if (component2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) component2);
            } else if (component2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) component2);
            } else if (component2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) component2);
            } else if (component2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) component2);
            } else if (component2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) component2);
            } else if (component2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) component2);
            } else if (component2 instanceof Object[]) {
                Class<?> componentType = component2.getClass().getComponentType();
                C19383o.m32794d(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) component2);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) component2);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) component2);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) component2);
                } else {
                    String canonicalName = componentType.getCanonicalName();
                    throw new IllegalArgumentException("Illegal value array type " + canonicalName + " for key \"" + str + JsonFactory.DEFAULT_QUOTE_CHAR);
                }
            } else if (component2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) component2);
            } else if (component2 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) component2);
            } else if (component2 instanceof Size) {
                bundle.putSize(str, (Size) component2);
            } else if (component2 instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) component2);
            } else {
                String canonicalName2 = component2.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + canonicalName2 + " for key \"" + str + JsonFactory.DEFAULT_QUOTE_CHAR);
            }
        }
        return bundle;
    }

    /* renamed from: K0 */
    public static final ArrayList m32718K0(List list) {
        Map map;
        Object obj;
        C19383o.m32797g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (C19383o.m32792b(((DelegateSdlEvent) next).getClientEventTrigger(), "seen")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DelegateSdlEvent delegateSdlEvent = (DelegateSdlEvent) it.next();
            Map<String, Object> clientEventProperties = delegateSdlEvent.getClientEventProperties();
            if (clientEventProperties != null) {
                ArrayList arrayList3 = new ArrayList(clientEventProperties.size());
                for (Map.Entry next2 : clientEventProperties.entrySet()) {
                    String str = (String) next2.getKey();
                    if (C19383o.m32792b(str, ResponseConstants.LISTING_IDS)) {
                        obj = C19543e0.m33307Z(next2.getValue());
                    } else if (C19383o.m32792b(str, "mmx_request_uuid_map")) {
                        obj = next2.getValue();
                        if (obj instanceof Map) {
                            Map map2 = (Map) obj;
                            LinkedHashMap linkedHashMap = new LinkedHashMap(C19421p.m32930T(map2.size()));
                            for (Map.Entry entry : map2.entrySet()) {
                                linkedHashMap.put(entry.getKey(), C19543e0.m33307Z(entry.getValue()));
                            }
                            obj = linkedHashMap;
                        }
                    } else {
                        obj = next2.getValue();
                    }
                    arrayList3.add(new Pair(new DynamicAnalyticsProperty((String) next2.getKey()), obj));
                }
                map = C19294b0.m32567x0(arrayList3);
            } else {
                map = null;
            }
            String clientEventName = delegateSdlEvent.getClientEventName();
            if (map == null) {
                map = C19294b0.m32559p0();
            }
            arrayList2.add(new C8696j(clientEventName, map));
        }
        return C19327t.m32661q1(arrayList2);
    }

    /* renamed from: L */
    public static long m32719L(JSONObject jSONObject, String str) {
        Number number = (Number) m32756l(jSONObject, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException(C0048b.m163a("JSON object member with key \"", str, "\" is missing or null"), 0);
    }

    /* renamed from: L0 */
    public static Object m32720L0(Object obj, String str, Class cls, Class cls2, Serializable serializable) {
        try {
            return cls.cast(m32728P0(obj.getClass(), str, cls2).invoke(obj, new Object[]{serializable}));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: M */
    public static void m32721M(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[0]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr[1]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr[2]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr[3]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr[4]) & UnsignedInteger.INT_MASK;
        long j6 = ((long) iArr[5]) & UnsignedInteger.INT_MASK;
        long j7 = ((long) iArr[6]) & UnsignedInteger.INT_MASK;
        long j8 = ((long) iArr[7]) & UnsignedInteger.INT_MASK;
        long j9 = j4 + j8;
        long j10 = j7 + (j8 << 1);
        long j11 = j3 + j10;
        long j12 = j6 + (j10 << 1);
        long j13 = j2 + j12;
        long j14 = j5 + (j12 << 1);
        long j15 = j + j14;
        iArr3[0] = (int) j15;
        long j16 = j13 + (j15 >>> 32);
        iArr3[1] = (int) j16;
        long j17 = j11 + (j16 >>> 32);
        iArr3[2] = (int) j17;
        long j18 = j9 + (j14 << 1) + (j17 >>> 32);
        iArr3[3] = (int) j18;
        m32769s((int) (j18 >>> 32), iArr3);
    }

    /* renamed from: M0 */
    public static Object m32722M0(Object obj, String str, Class cls, ArrayList arrayList, Class cls2, File file, Class cls3, ArrayList arrayList2) {
        try {
            return Object[].class.cast(m32728P0(obj.getClass(), str, cls, cls2, cls3).invoke(obj, new Object[]{arrayList, file, arrayList2}));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: N */
    public static void m32723N(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    /* renamed from: N0 */
    public static Object m32724N0(Class cls, String str) {
        try {
            return Boolean.class.cast(m32728P0(cls, "isDexOptNeeded", String.class).invoke((Object) null, new Object[]{str}));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to invoke static method %s on type %s", new Object[]{"isDexOptNeeded", cls}), e);
        }
    }

    /* renamed from: O */
    public static void m32725O(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        m32739a0(jArr, jArr2, jArr4);
        m32723N(jArr4, jArr3);
    }

    /* renamed from: O0 */
    public static Field m32726O0(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new zzbx(String.format("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }

    /* renamed from: P */
    public static void m32727P(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j15 = j14 >>> 47;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = j13;
        long j16 = j15 << 30;
        jArr2[2] = j16 ^ (((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47));
        jArr2[3] = 140737488355327L & j14;
    }

    /* renamed from: P0 */
    public static Method m32728P0(Class cls, String str, Class... clsArr) {
        Class cls2 = cls;
        while (cls2 != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new zzbx(String.format("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }

    /* renamed from: Q */
    public static void m32729Q(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        m32740b0(jArr, jArr2, jArr4);
        m32727P(jArr4, jArr3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r1 = (r1 = r5.mo70458f()).mo72745l();
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final okhttp3.C19932b0 m32730R(okhttp3.C20018z r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            okhttp3.a0 r5 = r5.f44368i
            r0 = 0
            if (r5 == 0) goto L_0x001b
            lr.i r1 = r5.mo70458f()
            if (r1 == 0) goto L_0x001b
            lr.f r1 = r1.mo72745l()
            if (r1 == 0) goto L_0x001b
            lr.f r1 = r1.clone()
            goto L_0x001c
        L_0x001b:
            r1 = r0
        L_0x001c:
            if (r1 == 0) goto L_0x0030
            okhttp3.a0$b r0 = okhttp3.C19928a0.f43959c
            okhttp3.r r2 = r5.mo70457e()
            long r3 = r5.mo70456d()
            r0.getClass()
            okhttp3.b0 r0 = new okhttp3.b0
            r0.<init>(r2, r3, r1)
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C19382n.m32730R(okhttp3.z):okhttp3.b0");
    }

    /* renamed from: S */
    public static final int m32731S(long j, long j2) {
        boolean p0 = m32764p0(j);
        return p0 != m32764p0(j2) ? p0 ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)));
    }

    /* renamed from: T */
    public static final void m32732T(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(C0070b.m183e("toIndex (", i, ") is greater than size (", i2, ")."));
        }
    }

    /* renamed from: U */
    public static void m32733U(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        C3436p.m8262y(iArr, iArr3);
        m32721M(iArr3, iArr2);
    }

    /* renamed from: V */
    public static void m32734V(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C3436p.m8235I(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & UnsignedInteger.INT_MASK) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & UnsignedInteger.INT_MASK);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & UnsignedInteger.INT_MASK);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            iArr3[3] = (int) (((UnsignedInteger.INT_MASK & ((long) iArr3[3])) - 2) + j2);
        }
    }

    /* renamed from: W */
    public static final float m32735W(int i, C1302d dVar) {
        return ((Context) dVar.mo5410J(AndroidCompositionLocals_androidKt.f3987b)).getResources().getDimension(i) / ((C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e)).getDensity();
    }

    /* renamed from: X */
    public static float m32736X(float f, float f2, float f3, float f4) {
        double d = (double) (0.0f - f);
        double d2 = (double) (0.0f - f2);
        float hypot = (float) Math.hypot(d, d2);
        double d3 = (double) (f3 - f);
        float hypot2 = (float) Math.hypot(d3, d2);
        double d4 = (double) (f4 - f2);
        float hypot3 = (float) Math.hypot(d3, d4);
        float hypot4 = (float) Math.hypot(d, d4);
        return (hypot <= hypot2 || hypot <= hypot3 || hypot <= hypot4) ? (hypot2 <= hypot3 || hypot2 <= hypot4) ? hypot3 > hypot4 ? hypot3 : hypot4 : hypot2 : hypot;
    }

    /* renamed from: Y */
    public static URI m32737Y(JSONObject jSONObject, String str) {
        String str2 = (String) m32756l(jSONObject, str, String.class);
        if (str2 == null) {
            return null;
        }
        try {
            return new URI(str2);
        } catch (URISyntaxException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    /* renamed from: Z */
    public static void m32738Z(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        m32752i0(jArr, jArr3);
        m32727P(jArr3, jArr2);
    }

    /* renamed from: a0 */
    public static void m32739a0(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((jArr2[1] << 7) ^ (j4 >>> 57)) & 144115188075855871L;
        long j6 = 144115188075855871L & j4;
        long[] jArr4 = new long[6];
        long[] jArr5 = jArr4;
        m32773u(j3, j6, jArr4, 0);
        m32773u(j2, j5, jArr5, 2);
        m32773u(j3 ^ j2, j6 ^ j5, jArr5, 4);
        long j7 = jArr5[1] ^ jArr5[2];
        long j8 = jArr5[0];
        long j9 = jArr5[3];
        long j10 = (jArr5[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr5[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    /* renamed from: b0 */
    public static void m32740b0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        m32745e0(jArr, jArr4);
        m32745e0(jArr2, jArr5);
        long[] jArr6 = jArr3;
        m32783z(jArr4[0], jArr5[0], jArr6, 0);
        m32783z(jArr4[1], jArr5[1], jArr6, 1);
        m32783z(jArr4[2], jArr5[2], jArr6, 2);
        m32783z(jArr4[3], jArr5[3], jArr6, 3);
        int i = 5;
        while (i > 0) {
            int i2 = i - 1;
            jArr3[i] = jArr3[i] ^ jArr3[i2];
            i = i2;
        }
        m32783z(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        m32783z(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i3 = 7; i3 > 1; i3--) {
            jArr3[i3] = jArr3[i3] ^ jArr3[i3 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        m32783z(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        m32783z(j, j3, jArr7, 0);
        m32783z(j2, j4, jArr7, 1);
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
        jArr3[0] = j12 ^ (j13 << 60);
        jArr3[1] = (j13 >>> 4) ^ (j8 << 56);
        jArr3[2] = (j8 >>> 8) ^ (j9 << 52);
        jArr3[3] = (j9 >>> 12) ^ (j10 << 48);
        jArr3[4] = (j10 >>> 16) ^ (j11 << 44);
        jArr3[5] = (j11 >>> 20) ^ (j14 << 40);
        jArr3[6] = (j14 >>> 24) ^ (j15 << 36);
        jArr3[7] = j15 >>> 28;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r10 = r8.getDeclaredMethods();
        kotlin.jvm.internal.C19383o.m32796f(r10, "declaredMethods");
        r2 = r10.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        if (r1 < r2) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        r3 = r10[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        if (kotlin.jvm.internal.C19383o.m32792b(r3.getName(), r9) != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0096 */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Method m32741c0(java.lang.Class r8, java.lang.String r9, java.lang.Object... r10) {
        /*
            r0 = 0
            r1 = 0
            int r2 = r10.length     // Catch:{ ReflectiveOperationException -> 0x0096 }
            if (r2 != 0) goto L_0x0007
            r2 = 1
            goto L_0x0011
        L_0x0007:
            int r2 = r2 + r1
            double r2 = (double) r2     // Catch:{ ReflectiveOperationException -> 0x0096 }
            r4 = 4624633867356078080(0x402e000000000000, double:15.0)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            int r2 = (int) r2     // Catch:{ ReflectiveOperationException -> 0x0096 }
        L_0x0011:
            androidx.compose.ui.platform.f0 r3 = new androidx.compose.ui.platform.f0     // Catch:{ ReflectiveOperationException -> 0x0096 }
            r4 = 4
            r3.<init>((int) r4)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ ReflectiveOperationException -> 0x0096 }
            r4.<init>()     // Catch:{ ReflectiveOperationException -> 0x0096 }
            int r5 = r10.length     // Catch:{ ReflectiveOperationException -> 0x0096 }
            r6 = r1
        L_0x001e:
            if (r6 >= r5) goto L_0x0032
            r7 = r10[r6]     // Catch:{ ReflectiveOperationException -> 0x0096 }
            if (r7 == 0) goto L_0x0029
            java.lang.Class r7 = r7.getClass()     // Catch:{ ReflectiveOperationException -> 0x0096 }
            goto L_0x002a
        L_0x0029:
            r7 = r0
        L_0x002a:
            if (r7 == 0) goto L_0x002f
            r4.add(r7)     // Catch:{ ReflectiveOperationException -> 0x0096 }
        L_0x002f:
            int r6 = r6 + 1
            goto L_0x001e
        L_0x0032:
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.lang.Object[] r10 = r4.toArray(r10)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            if (r10 == 0) goto L_0x0090
            r3.mo7210b(r10)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.lang.Class<androidx.compose.runtime.d> r10 = androidx.compose.runtime.C1302d.class
            r3.mo7209a(r10)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ ReflectiveOperationException -> 0x0096 }
            r3.mo7209a(r10)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            pq.i r5 = new pq.i     // Catch:{ ReflectiveOperationException -> 0x0096 }
            r5.<init>(r1, r2)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ ReflectiveOperationException -> 0x0096 }
            int r6 = kotlin.collections.C19322o.m32624F0(r5)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            r2.<init>(r6)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            pq.h r5 = r5.iterator()     // Catch:{ ReflectiveOperationException -> 0x0096 }
        L_0x005b:
            boolean r6 = r5.f44419d     // Catch:{ ReflectiveOperationException -> 0x0096 }
            if (r6 == 0) goto L_0x0066
            r5.nextInt()     // Catch:{ ReflectiveOperationException -> 0x0096 }
            r2.add(r10)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            goto L_0x005b
        L_0x0066:
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.lang.Object[] r10 = r2.toArray(r10)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            if (r10 == 0) goto L_0x008a
            r3.mo7210b(r10)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.lang.Object r10 = r3.f4088a     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ ReflectiveOperationException -> 0x0096 }
            int r10 = r10.size()     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.lang.Object r2 = r3.f4088a     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.lang.Object[] r10 = r2.toArray(r10)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.lang.Class[] r10 = (java.lang.Class[]) r10     // Catch:{ ReflectiveOperationException -> 0x0096 }
            java.lang.reflect.Method r10 = m32749g0(r8, r9, r10)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            goto L_0x00b4
        L_0x008a:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ ReflectiveOperationException -> 0x0096 }
            r10.<init>(r4)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            throw r10     // Catch:{ ReflectiveOperationException -> 0x0096 }
        L_0x0090:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ ReflectiveOperationException -> 0x0096 }
            r10.<init>(r4)     // Catch:{ ReflectiveOperationException -> 0x0096 }
            throw r10     // Catch:{ ReflectiveOperationException -> 0x0096 }
        L_0x0096:
            java.lang.reflect.Method[] r10 = r8.getDeclaredMethods()     // Catch:{ ReflectiveOperationException -> 0x00b3 }
            java.lang.String r2 = "declaredMethods"
            kotlin.jvm.internal.C19383o.m32796f(r10, r2)     // Catch:{ ReflectiveOperationException -> 0x00b3 }
            int r2 = r10.length     // Catch:{ ReflectiveOperationException -> 0x00b3 }
        L_0x00a0:
            if (r1 >= r2) goto L_0x00b3
            r3 = r10[r1]     // Catch:{ ReflectiveOperationException -> 0x00b3 }
            java.lang.String r4 = r3.getName()     // Catch:{ ReflectiveOperationException -> 0x00b3 }
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r9)     // Catch:{ ReflectiveOperationException -> 0x00b3 }
            if (r4 == 0) goto L_0x00b0
            r0 = r3
            goto L_0x00b3
        L_0x00b0:
            int r1 = r1 + 1
            goto L_0x00a0
        L_0x00b3:
            r10 = r0
        L_0x00b4:
            if (r10 == 0) goto L_0x00b7
            return r10
        L_0x00b7:
            java.lang.NoSuchMethodException r10 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = r8.getName()
            r0.append(r8)
            r8 = 46
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            r10.<init>(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C19382n.m32741c0(java.lang.Class, java.lang.String, java.lang.Object[]):java.lang.reflect.Method");
    }

    /* renamed from: d */
    public static final C1491b m32742d(C1514d dVar) {
        Canvas canvas = C1493c.f3222a;
        C1491b bVar = new C1491b();
        bVar.f3219a = new Canvas(C15562d.m25197j(dVar));
        return bVar;
    }

    /* renamed from: d0 */
    public static void m32743d0(long[] jArr, long[] jArr2) {
        C0114h.m331z(jArr2, 0, jArr[0]);
        C0114h.m331z(jArr2, 2, jArr[1]);
    }

    /* renamed from: e */
    public static int m32744e(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: e0 */
    public static void m32745e0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 1152921504606846975L;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
    }

    /* renamed from: f */
    public static int m32746f(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (m32744e(i) >= m32744e(i2)) {
            i ^= i2 << (m32744e(i) - m32744e(i2));
        }
        return i;
    }

    /* renamed from: f0 */
    public static final String m32747f0(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb = new StringBuilder();
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            boolean z = false;
            for (Signature byteArray : signatureArr) {
                instance.update(byteArray.toByteArray());
                sb.append(Base64.encodeToString(instance.digest(), 0));
                sb.append(MessageDraft.IMAGE_DELIMITER);
            }
            if (sb.length() > 0) {
                z = true;
            }
            if (z) {
                sb.setLength(sb.length() - 1);
            }
            String sb2 = sb.toString();
            C19383o.m32796f(sb2, "sb.toString()");
            return sb2;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: g */
    public static int m32748g(int i, int i2, int i3) {
        int f = m32746f(i, i3);
        int f2 = m32746f(i2, i3);
        int i4 = 0;
        if (f2 != 0) {
            int e = 1 << m32744e(i3);
            while (f != 0) {
                if (((byte) (f & 1)) == 1) {
                    i4 ^= f2;
                }
                f >>>= 1;
                f2 <<= 1;
                if (f2 >= e) {
                    f2 ^= i3;
                }
            }
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if (r4 == false) goto L_0x0077;
     */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Method m32749g0(java.lang.Class r12, java.lang.String r13, java.lang.Class... r14) {
        /*
            int r0 = r14.length
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r0)
            java.lang.Class[] r14 = (java.lang.Class[]) r14
            java.lang.reflect.Method[] r12 = r12.getDeclaredMethods()
            java.lang.String r0 = "declaredMethods"
            kotlin.jvm.internal.C19383o.m32796f(r12, r0)
            int r0 = r12.length
            r1 = 0
            r2 = r1
        L_0x0013:
            if (r2 >= r0) goto L_0x007e
            r3 = r12[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r13, r4)
            r5 = 1
            if (r4 == 0) goto L_0x0077
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.String r6 = "it.parameterTypes"
            kotlin.jvm.internal.C19383o.m32796f(r4, r6)
            int r6 = r4.length
            int r7 = r14.length
            if (r6 != r7) goto L_0x0073
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r4.length
            r6.<init>(r7)
            int r7 = r4.length
            r8 = r1
            r9 = r8
        L_0x0038:
            if (r8 >= r7) goto L_0x004f
            r10 = r4[r8]
            int r11 = r9 + 1
            r9 = r14[r9]
            boolean r9 = r10.isAssignableFrom(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r6.add(r9)
            int r8 = r8 + 1
            r9 = r11
            goto L_0x0038
        L_0x004f:
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L_0x0056
            goto L_0x006e
        L_0x0056:
            java.util.Iterator r4 = r6.iterator()
        L_0x005a:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x006e
            java.lang.Object r6 = r4.next()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x005a
            r4 = r1
            goto L_0x006f
        L_0x006e:
            r4 = r5
        L_0x006f:
            if (r4 == 0) goto L_0x0073
            r4 = r5
            goto L_0x0074
        L_0x0073:
            r4 = r1
        L_0x0074:
            if (r4 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r5 = r1
        L_0x0078:
            if (r5 == 0) goto L_0x007b
            goto L_0x007f
        L_0x007b:
            int r2 = r2 + 1
            goto L_0x0013
        L_0x007e:
            r3 = 0
        L_0x007f:
            if (r3 == 0) goto L_0x0082
            return r3
        L_0x0082:
            java.lang.NoSuchMethodException r12 = new java.lang.NoSuchMethodException
            java.lang.String r14 = " not found"
            java.lang.String r13 = androidx.appcompat.widget.C0326j.m864i(r13, r14)
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C19382n.m32749g0(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: h0 */
    public static List m32750h0(JSONObject jSONObject, String str) {
        String[] strArr;
        JSONArray jSONArray = (JSONArray) m32756l(jSONObject, str, JSONArray.class);
        if (jSONArray == null) {
            strArr = null;
        } else {
            try {
                strArr = (String[]) jSONArray.toArray(new String[0]);
            } catch (ArrayStoreException unused) {
                throw new ParseException(C0048b.m163a("JSON object member with key \"", str, "\" is not an array of strings"), 0);
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: i */
    public static JSONObject m32751i(String str) {
        try {
            Object a = new C0042a().mo71a(str);
            if (a instanceof JSONObject) {
                return (JSONObject) a;
            }
            throw new ParseException("JSON entity is not an object", 0);
        } catch (C6232i e) {
            StringBuilder h = C0072d.m201h("Invalid JSON: ");
            h.append(e.getMessage());
            throw new ParseException(h.toString(), 0);
        } catch (Exception e2) {
            StringBuilder h2 = C0072d.m201h("Unexpected exception: ");
            h2.append(e2.getMessage());
            throw new ParseException(h2.toString(), 0);
        }
    }

    /* renamed from: i0 */
    public static void m32752i0(long[] jArr, long[] jArr2) {
        C0114h.m331z(jArr2, 0, jArr[0]);
        C0114h.m331z(jArr2, 2, jArr[1]);
        C0114h.m331z(jArr2, 4, jArr[2]);
        long j = jArr[3];
        jArr2[6] = C0114h.m277H((int) j);
        jArr2[7] = ((long) C0114h.m269B((int) (j >>> 32))) & UnsignedInteger.INT_MASK;
    }

    /* renamed from: j */
    public static C6791f m32753j(String str) {
        String optString;
        String m;
        String str2;
        String queryParameter;
        C6791f fVar = new C6791f();
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        fVar.f14955b = jSONObject.optInt("ErrorNumber", 0);
        fVar.f14956c = jSONObject.optString("Message", "");
        if (!(fVar.f14955b != 0 || (optString = jSONObject.optString("CardinalJWT", "")) == null || (m = m32758m(optString)) == null)) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(m);
            jSONObject2.optString(AuthenticationTokenClaims.JSON_KEY_ISS, "");
            jSONObject2.optString(AuthenticationTokenClaims.JSON_KEY_IAT, "");
            jSONObject2.optString(AuthenticationTokenClaims.JSON_KEY_EXP, "");
            jSONObject2.optString(AuthenticationTokenClaims.JSON_KEY_JIT, "");
            fVar.f14957d = jSONObject2.optString("ConsumerSessionId", "");
            jSONObject2.optString("ReferenceId", "");
            jSONObject2.optString(AuthenticationTokenClaims.JSON_KEY_AUD, "");
            jSONObject2.optString(AuthenticationTokenClaims.JSON_KEY_JIT, "");
            jSONObject2.optString(AuthenticationTokenClaims.JSON_KEY_JIT, "");
            String optString2 = jSONObject2.optString("Payload", "");
            C7119b bVar = new C7119b();
            if (!optString2.equals("")) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(optString2);
                String optString3 = jSONObject3.optString("DeviceFingerprintingURL", "");
                C6790e eVar = new C6790e();
                if (!optString3.equals("")) {
                    Uri parse = Uri.parse(optString3);
                    String scheme = parse.getScheme();
                    String authority = parse.getAuthority();
                    String path = parse.getPath();
                    Objects.requireNonNull(path);
                    String[] split = path.split("/");
                    StringBuilder n = C13983i.m21495n(scheme, "://", authority, "/");
                    n.append(split[1]);
                    String sb = n.toString();
                    String queryParameter2 = parse.getQueryParameter("orgUnitId");
                    if (queryParameter2 != null) {
                        eVar.f14949a = queryParameter2;
                    }
                    String queryParameter3 = parse.getQueryParameter("referenceId");
                    if (queryParameter3 != null) {
                        eVar.f14950b = queryParameter3;
                    }
                    String queryParameter4 = parse.getQueryParameter("threatmetrix");
                    if (queryParameter4 != null) {
                        boolean booleanValue = Boolean.valueOf(queryParameter4).booleanValue();
                        eVar.f14951c = Boolean.valueOf(booleanValue);
                        if (booleanValue && (queryParameter = parse.getQueryParameter("tmEventType")) != null && !queryParameter.isEmpty()) {
                            eVar.f14952d = queryParameter;
                        }
                    }
                    String queryParameter5 = parse.getQueryParameter("geolocation");
                    if (queryParameter5 != null) {
                        Boolean.valueOf(queryParameter5);
                    }
                    eVar.f14953e = sb;
                }
                bVar.f15830a = eVar;
                jSONObject3.optBoolean("EnabledCCA", false);
                jSONObject3.optBoolean("EnabledDiscover", false);
                jSONObject3.optBoolean("EnabledPaypal", false);
                bVar.f15831b = jSONObject3.optInt("ErrorNumber", 0);
                str2 = jSONObject3.optString("ErrorDescription", "");
            } else {
                bVar.f15831b = 10214;
                str2 = "Cardinal Init Response Error. Missing field :Payload";
            }
            bVar.f15832c = str2;
            fVar.f14954a = bVar;
        }
        return fVar;
    }

    /* renamed from: j0 */
    public static final HashSet m32754j0(Object... objArr) {
        HashSet hashSet = new HashSet(C19421p.m32930T(objArr.length));
        C19318k.m32619k1(hashSet, objArr);
        return hashSet;
    }

    /* renamed from: k0 */
    public static void m32755k0(Fragment fragment) {
        C18335a aVar;
        if (fragment != null) {
            Fragment fragment2 = fragment;
            while (true) {
                fragment2 = fragment2.getParentFragment();
                if (fragment2 != null) {
                    if (fragment2 instanceof C18335a) {
                        aVar = (C18335a) fragment2;
                        break;
                    }
                } else {
                    FragmentActivity activity = fragment.getActivity();
                    if (activity instanceof C18335a) {
                        aVar = (C18335a) activity;
                    } else if (activity.getApplication() instanceof C18335a) {
                        aVar = (C18335a) activity.getApplication();
                    } else {
                        throw new IllegalArgumentException(String.format("No injector was found for %s", new Object[]{fragment.getClass().getCanonicalName()}));
                    }
                }
            }
            if (Log.isLoggable("dagger.android.support", 3)) {
                Log.d("dagger.android.support", String.format("An injector for %s was found in %s", new Object[]{fragment.getClass().getCanonicalName(), aVar.getClass().getCanonicalName()}));
            }
            C17550a<Object> androidInjector = aVar.androidInjector();
            C17782b.m29836D(androidInjector, "%s.androidInjector() returned null", aVar.getClass());
            androidInjector.mo1133h(fragment);
            return;
        }
        throw new NullPointerException("fragment");
    }

    /* renamed from: l */
    public static Object m32756l(JSONObject jSONObject, String str, Class cls) {
        if (jSONObject.get(str) == null) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        throw new ParseException(C0048b.m163a("Unexpected type of JSON object member with key \"", str, "\""), 0);
    }

    /* renamed from: l0 */
    public static void m32757l0(Worker worker) {
        C19383o.m32797g(worker, "worker");
        if (worker instanceof C13366a) {
            Context context = worker.f7853b;
            C19383o.m32796f(context, "worker.applicationContext");
            if (context instanceof C18335a) {
                C17550a<Object> androidInjector = ((C18335a) context).androidInjector();
                C19383o.m32795e(androidInjector, context.getClass() + ".workerInjector() returned null");
                androidInjector.mo1133h(worker);
                return;
            }
            throw new RuntimeException(C0388a.m1049e(new Object[]{context.getClass().getCanonicalName(), C18335a.class.getCanonicalName()}, 2, "%s does not implement %s", "format(format, *args)"));
        }
    }

    /* renamed from: m */
    public static String m32758m(String str) {
        String[] split = str.split("\\.");
        if (split.length <= 1) {
            return null;
        }
        byte[] decode = Base64.decode(split[1], 8);
        if (decode != null) {
            return new String(decode, StandardCharsets.UTF_8);
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Null decodedBytes"));
    }

    /* renamed from: m0 */
    public static void m32759m0(String str, String str2, C1302d dVar, Object... objArr) {
        C19383o.m32797g(str, "className");
        C19383o.m32797g(str2, "methodName");
        C19383o.m32797g(dVar, "composer");
        C19383o.m32797g(objArr, "args");
        try {
            Class<?> cls = Class.forName(str);
            Method c0 = m32741c0(cls, str2, Arrays.copyOf(objArr, objArr.length));
            c0.setAccessible(true);
            if (Modifier.isStatic(c0.getModifiers())) {
                m32761n0(c0, (Object) null, dVar, Arrays.copyOf(objArr, objArr.length));
            } else {
                m32761n0(c0, cls.getConstructor(new Class[0]).newInstance(new Object[0]), dVar, Arrays.copyOf(objArr, objArr.length));
            }
        } catch (ReflectiveOperationException e) {
            throw new ClassNotFoundException("Composable Method '" + str + ClassUtils.PACKAGE_SEPARATOR_CHAR + str2 + "' not found", e);
        }
    }

    /* renamed from: n */
    public static Cipher m32760n(SecretKeySpec secretKeySpec, boolean z, byte[] bArr, Provider provider) {
        Cipher cipher;
        if (provider == null) {
            try {
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            } catch (Exception e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } else {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", provider);
        }
        SecretKeySpec secretKeySpec2 = new SecretKeySpec(secretKeySpec.getEncoded(), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        if (z) {
            cipher.init(1, secretKeySpec2, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec2, ivParameterSpec);
        }
        return cipher;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m32761n0(java.lang.reflect.Method r11, java.lang.Object r12, androidx.compose.runtime.C1302d r13, java.lang.Object... r14) {
        /*
            java.lang.Class[] r0 = r11.getParameterTypes()
            java.lang.String r1 = "parameterTypes"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            int r1 = r0.length
            r2 = -1
            int r1 = r1 + r2
            if (r1 < 0) goto L_0x0020
        L_0x000e:
            int r3 = r1 + -1
            r4 = r0[r1]
            java.lang.Class<androidx.compose.runtime.d> r5 = androidx.compose.runtime.C1302d.class
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r5)
            if (r4 == 0) goto L_0x001b
            goto L_0x0021
        L_0x001b:
            if (r3 >= 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r1 = r3
            goto L_0x000e
        L_0x0020:
            r1 = r2
        L_0x0021:
            r0 = 0
            r3 = 1
            if (r12 == 0) goto L_0x0027
            r4 = r3
            goto L_0x0028
        L_0x0027:
            r4 = r0
        L_0x0028:
            if (r1 != 0) goto L_0x002c
            r4 = r3
            goto L_0x0036
        L_0x002c:
            int r4 = r4 + r1
            double r4 = (double) r4
            r6 = 4624633867356078080(0x402e000000000000, double:15.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
        L_0x0036:
            int r5 = r1 + 1
            int r4 = r4 + r5
            java.lang.Class[] r6 = r11.getParameterTypes()
            int r6 = r6.length
            if (r6 == r4) goto L_0x0042
            r7 = r3
            goto L_0x0043
        L_0x0042:
            r7 = r0
        L_0x0043:
            if (r7 == 0) goto L_0x004f
            double r7 = (double) r1
            r9 = 4629418941960159232(0x403f000000000000, double:31.0)
            double r7 = r7 / r9
            double r7 = java.lang.Math.ceil(r7)
            int r7 = (int) r7
            goto L_0x0050
        L_0x004f:
            r7 = r0
        L_0x0050:
            int r7 = r7 + r4
            if (r7 != r6) goto L_0x0055
            r7 = r3
            goto L_0x0056
        L_0x0055:
            r7 = r0
        L_0x0056:
            if (r7 == 0) goto L_0x0146
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = r0
        L_0x005b:
            if (r8 >= r6) goto L_0x013e
            if (r8 < 0) goto L_0x0063
            if (r8 >= r1) goto L_0x0063
            r9 = r3
            goto L_0x0064
        L_0x0063:
            r9 = r0
        L_0x0064:
            if (r9 == 0) goto L_0x010a
            if (r8 < 0) goto L_0x0075
            java.lang.String r9 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r14, r9)
            int r9 = r14.length
            int r9 = r9 + r2
            if (r8 > r9) goto L_0x0075
            r9 = r14[r8]
            goto L_0x012c
        L_0x0075:
            java.lang.Class[] r9 = r11.getParameterTypes()
            r9 = r9[r8]
            java.lang.String r10 = "parameterTypes[idx]"
            kotlin.jvm.internal.C19383o.m32796f(r9, r10)
            java.lang.String r9 = r9.getName()
            int r10 = r9.hashCode()
            switch(r10) {
                case -1325958191: goto L_0x00f8;
                case 104431: goto L_0x00ea;
                case 3039496: goto L_0x00dc;
                case 3052374: goto L_0x00cc;
                case 3327612: goto L_0x00bb;
                case 64711720: goto L_0x00ae;
                case 97526364: goto L_0x009d;
                case 109413500: goto L_0x008d;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x0108
        L_0x008d:
            java.lang.String r10 = "short"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0097
            goto L_0x0108
        L_0x0097:
            java.lang.Short r9 = java.lang.Short.valueOf(r0)
            goto L_0x012c
        L_0x009d:
            java.lang.String r10 = "float"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00a7
            goto L_0x0108
        L_0x00a7:
            r9 = 0
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            goto L_0x012c
        L_0x00ae:
            java.lang.String r10 = "boolean"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00b7
            goto L_0x0108
        L_0x00b7:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L_0x012c
        L_0x00bb:
            java.lang.String r10 = "long"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00c4
            goto L_0x0108
        L_0x00c4:
            r9 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            goto L_0x012c
        L_0x00cc:
            java.lang.String r10 = "char"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00d5
            goto L_0x0108
        L_0x00d5:
            r9 = 48
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            goto L_0x012c
        L_0x00dc:
            java.lang.String r10 = "byte"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00e5
            goto L_0x0108
        L_0x00e5:
            java.lang.Byte r9 = java.lang.Byte.valueOf(r0)
            goto L_0x012c
        L_0x00ea:
            java.lang.String r10 = "int"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00f3
            goto L_0x0108
        L_0x00f3:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            goto L_0x012c
        L_0x00f8:
            java.lang.String r10 = "double"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0101
            goto L_0x0108
        L_0x0101:
            r9 = 0
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            goto L_0x012c
        L_0x0108:
            r9 = 0
            goto L_0x012c
        L_0x010a:
            if (r8 != r1) goto L_0x010e
            r9 = r13
            goto L_0x012c
        L_0x010e:
            if (r5 > r8) goto L_0x0114
            if (r8 >= r4) goto L_0x0114
            r9 = r3
            goto L_0x0115
        L_0x0114:
            r9 = r0
        L_0x0115:
            if (r9 == 0) goto L_0x011c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            goto L_0x012c
        L_0x011c:
            if (r4 > r8) goto L_0x0122
            if (r8 >= r6) goto L_0x0122
            r9 = r3
            goto L_0x0123
        L_0x0122:
            r9 = r0
        L_0x0123:
            if (r9 == 0) goto L_0x0132
            r9 = 2097151(0x1fffff, float:2.938734E-39)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        L_0x012c:
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x005b
        L_0x0132:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unexpected index"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x013e:
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r7, r6)
            r11.invoke(r12, r13)
            return
        L_0x0146:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Check failed."
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C19382n.m32761n0(java.lang.reflect.Method, java.lang.Object, androidx.compose.runtime.d, java.lang.Object[]):void");
    }

    /* renamed from: o0 */
    public static final boolean m32762o0(Configuration configuration) {
        C19383o.m32797g(configuration, "<this>");
        return (configuration.uiMode & 48) == 32;
    }

    /* renamed from: p */
    public static C7486a m32763p(C7487b bVar, C7490e eVar) {
        C7487b bVar2 = bVar;
        C7490e eVar2 = eVar;
        int i = bVar2.f16692a;
        int i2 = 1 << i;
        int[] iArr = eVar2.f16698c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            length = -1;
        }
        int[] iArr2 = new int[2];
        iArr2[1] = i2;
        int i3 = 0;
        iArr2[0] = length;
        Class cls = Integer.TYPE;
        int[][] iArr3 = (int[][]) Array.newInstance(cls, iArr2);
        int[] iArr4 = new int[2];
        iArr4[1] = i2;
        iArr4[0] = length;
        int[][] iArr5 = (int[][]) Array.newInstance(cls, iArr4);
        for (int i4 = 0; i4 < i2; i4++) {
            int[] iArr6 = iArr5[0];
            int[] iArr7 = eVar2.f16698c;
            int i5 = eVar2.f16697b;
            int i6 = iArr7[i5];
            while (true) {
                i5--;
                if (i5 < 0) {
                    break;
                }
                i6 = eVar2.f16696a.mo19830b(i6, i4) ^ eVar2.f16698c[i5];
            }
            iArr6[i4] = bVar2.mo19829a(i6);
        }
        for (int i7 = 1; i7 < length; i7++) {
            for (int i8 = 0; i8 < i2; i8++) {
                iArr5[i7][i8] = bVar2.mo19830b(iArr5[i7 - 1][i8], i8);
            }
        }
        int i9 = 0;
        while (i9 < length) {
            int i10 = i3;
            while (i10 < i2) {
                for (int i11 = i3; i11 <= i9; i11++) {
                    int[] iArr8 = iArr3[i9];
                    iArr8[i10] = bVar2.mo19830b(iArr5[i11][i10], eVar2.mo19839a((length + i11) - i9)) ^ iArr8[i10];
                }
                i10++;
                i3 = 0;
            }
            i9++;
            i3 = 0;
        }
        int[] iArr9 = new int[2];
        iArr9[1] = (i2 + 31) >>> 5;
        iArr9[0] = length * i;
        int[][] iArr10 = (int[][]) Array.newInstance(Integer.TYPE, iArr9);
        for (int i12 = 0; i12 < i2; i12++) {
            int i13 = i12 >>> 5;
            int i14 = 1 << (i12 & 31);
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = iArr3[i15][i12];
                for (int i17 = 0; i17 < i; i17++) {
                    if (((i16 >>> i17) & 1) != 0) {
                        int[] iArr11 = iArr10[(((i15 + 1) * i) - i17) - 1];
                        iArr11[i13] = iArr11[i13] ^ i14;
                    }
                }
            }
        }
        return new C7486a(i2, iArr10);
    }

    /* renamed from: p0 */
    public static final boolean m32764p0(long j) {
        return ((int) (j & UnsignedInteger.INT_MASK)) != 0;
    }

    /* renamed from: q */
    public static C7767n m32765q(PrivateKey privateKey) {
        if (privateKey instanceof C6153i) {
            C6153i iVar = (C6153i) privateKey;
            C7632m mVar = ((C7630k) iVar.mo17246a()).f16917a;
            return new C7767n(iVar.mo17247b(), new C7766m(mVar.f16921a, mVar.f16922b, mVar.f16923c));
        }
        throw new InvalidKeyException("can't identify GOST3410 private key.");
    }

    /* renamed from: q0 */
    public static boolean m32766q0(Uri uri) {
        return uri != null && ResponseConstants.CONTENT.equals(uri.getScheme()) && ResponseConstants.MEDIA.equals(uri.getAuthority());
    }

    /* renamed from: r */
    public static C7768o m32767r(PublicKey publicKey) {
        if (publicKey instanceof C6154j) {
            C6154j jVar = (C6154j) publicKey;
            C7632m mVar = ((C7630k) jVar.mo17248a()).f16917a;
            return new C7768o(jVar.mo17249b(), new C7766m(mVar.f16921a, mVar.f16922b, mVar.f16923c));
        }
        StringBuilder h = C0072d.m201h("can't identify GOST3410 public key: ");
        h.append(publicKey.getClass().getName());
        throw new InvalidKeyException(h.toString());
    }

    /* renamed from: r0 */
    public static Base64URL m32768r0(JSONObject jSONObject, String str) {
        String str2 = (String) m32756l(jSONObject, str, String.class);
        if (str2 == null) {
            return null;
        }
        return new Base64URL(str2);
    }

    /* renamed from: s */
    public static void m32769s(int i, int[] iArr) {
        while (i != 0) {
            long j = ((long) i) & UnsignedInteger.INT_MASK;
            long j2 = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & UnsignedInteger.INT_MASK);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & UnsignedInteger.INT_MASK);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = (UnsignedInteger.INT_MASK & ((long) iArr[3])) + (j << 1) + j3;
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }

    /* renamed from: s0 */
    public static long m32770s0(long j, long j2) {
        long j3 = j * j2;
        if (((j | j2) >>> 31) == 0 || j3 / j == j2) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: t */
    public static void m32771t(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        C3436p.m8262y(iArr, iArr3);
        while (true) {
            m32721M(iArr3, iArr2);
            i--;
            if (i > 0) {
                C3436p.m8262y(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: t0 */
    public static C1436d m32772t0(C1436d dVar, Painter painter, C1428a aVar, C1670c cVar, float f, C1546t tVar, int i) {
        boolean z = (i & 2) != 0;
        if ((i & 4) != 0) {
            aVar = C1428a.C1429a.f3108d;
        }
        C1428a aVar2 = aVar;
        if ((i & 8) != 0) {
            cVar = C1670c.C1671a.f3713b;
        }
        C1670c cVar2 = cVar;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            tVar = null;
        }
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(painter, "painter");
        C19383o.m32797g(aVar2, ResponseConstants.ALIGNMENT);
        C19383o.m32797g(cVar2, "contentScale");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new PainterModifier(painter, z, aVar2, cVar2, f2, tVar));
    }

    /* renamed from: u */
    public static void m32773u(long j, long j2, long[] jArr, int i) {
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
        long j8 = jArr2[((int) j3) & 7];
        long j9 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j3 >>> i2);
            long j10 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j8 ^= j10 << i2;
            j9 ^= j10 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 144115188075855871L & j8;
        jArr[i + 1] = (((((j3 & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j9) << 7) ^ (j8 >>> 57);
    }

    /* renamed from: u0 */
    public static void m32774u0(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 - j;
                if (j3 < 0) {
                    C18981a.m32123b(new IllegalStateException(C0073e.m205e("More produced than requested: ", j3)));
                    j3 = 0;
                }
            } else {
                return;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    /* renamed from: v */
    public static void m32775v(Context context, C6272b bVar, UiCustomization uiCustomization) {
        Intent intent;
        Intent intent2;
        f43256f = context;
        String e = bVar.mo17774e();
        e.getClass();
        char c = 65535;
        switch (e.hashCode()) {
            case 1537:
                if (e.equals("01")) {
                    c = 0;
                    break;
                }
                break;
            case 1538:
                if (e.equals("02")) {
                    c = 1;
                    break;
                }
                break;
            case 1539:
                if (e.equals("03")) {
                    c = 2;
                    break;
                }
                break;
            case 1540:
                if (e.equals("04")) {
                    c = 3;
                    break;
                }
                break;
            case 1541:
                if (e.equals("05")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                intent2 = new Intent(context.getApplicationContext(), ChallengeNativeView.class);
                break;
            case 4:
                intent2 = new Intent(context.getApplicationContext(), ChallengeHTMLView.class);
                break;
            default:
                intent = null;
                break;
        }
        intent = intent2;
        if (intent != null) {
            intent.putExtra("StepUpData", bVar);
            intent.putExtra("UiCustomization", uiCustomization);
            intent.addFlags(268435456).addFlags(67108864);
            f43256f.startActivity(intent);
        }
    }

    /* renamed from: v0 */
    public static long m32776v0(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                C18981a.m32123b(new IllegalStateException(C0073e.m205e("More produced than requested: ", j3)));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    /* renamed from: w */
    public static void m32777w(int[] iArr) {
        long j = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & UnsignedInteger.INT_MASK);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & UnsignedInteger.INT_MASK);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) ((UnsignedInteger.INT_MASK & ((long) iArr[3])) + 2 + j2);
    }

    /* renamed from: w0 */
    public static final boolean m32778w0() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: x */
    public static void m32779x(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + (((long) iArr2[0]) & UnsignedInteger.INT_MASK) + 0;
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & UnsignedInteger.INT_MASK) + (((long) iArr2[1]) & UnsignedInteger.INT_MASK) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & UnsignedInteger.INT_MASK) + (((long) iArr2[2]) & UnsignedInteger.INT_MASK) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & UnsignedInteger.INT_MASK) + (((long) iArr2[3]) & UnsignedInteger.INT_MASK) + (j3 >>> 32);
        int i = (int) j4;
        iArr3[3] = i;
        if (((int) (j4 >>> 32)) != 0 || ((i >>> 1) >= 2147483646 && C3436p.m8255r(iArr3, f43259i))) {
            m32777w(iArr3);
        }
    }

    /* renamed from: x0 */
    public static C18975b m32780x0(FragmentActivity fragmentActivity, C18974a aVar) {
        if (fragmentActivity != null) {
            Window window = fragmentActivity.getWindow();
            C19383o.m32796f(window, "activity.window");
            if (((window.getAttributes().softInputMode & 240) & 48) != 48) {
                View findViewById = fragmentActivity.findViewById(16908290);
                C19383o.m32796f(findViewById, "activity.findViewById(android.R.id.content)");
                View rootView = ((ViewGroup) findViewById).getRootView();
                C19383o.m32796f(rootView, "getContentRoot(activity).rootView");
                KeyboardVisibilityEvent$registerEventListener$layoutListener$1 keyboardVisibilityEvent$registerEventListener$layoutListener$1 = new KeyboardVisibilityEvent$registerEventListener$layoutListener$1(fragmentActivity, aVar);
                rootView.getViewTreeObserver().addOnGlobalLayoutListener(keyboardVisibilityEvent$registerEventListener$layoutListener$1);
                return new C18975b(fragmentActivity, keyboardVisibilityEvent$registerEventListener$layoutListener$1);
            }
            throw new IllegalArgumentException("Parameter:activity window SoftInputMethod is SOFT_INPUT_ADJUST_NOTHING. In this case window will not be resized".toString());
        }
        throw new NullPointerException("Parameter:activity must not be null");
    }

    /* renamed from: y */
    public static void m32781y(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[4];
        m32743d0(jArr, jArr3);
        while (true) {
            m32723N(jArr3, jArr2);
            i--;
            if (i > 0) {
                m32743d0(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: y0 */
    public static final ColorStateList m32782y0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttributes(styledAttrs)");
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            obtainStyledAttributes.recycle();
            return colorStateList;
        }
        throw new IllegalStateException();
    }

    /* renamed from: z */
    public static void m32783z(long j, long j2, long[] jArr, int i) {
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
        jArr[i] = jArr[i] ^ (1152921504606846975L & j8);
        int i5 = i + 1;
        jArr[i5] = ((((((j3 & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5) ^ j9) << 4) ^ (j8 >>> 60)) ^ jArr[i5];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r0.mo72221E0() != false) goto L_0x00a1;
     */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m32784z0(p753kq.C19857l r6, java.lang.Object r7, kotlin.coroutines.C19340c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.internal.C19722g
            if (r0 == 0) goto L_0x00c5
            kotlinx.coroutines.internal.g r8 = (kotlinx.coroutines.internal.C19722g) r8
            java.lang.Throwable r0 = kotlin.Result.m35483exceptionOrNullimpl(r7)
            r1 = 0
            if (r0 != 0) goto L_0x0017
            if (r6 == 0) goto L_0x0015
            kotlinx.coroutines.w r0 = new kotlinx.coroutines.w
            r0.<init>(r6, r7)
            goto L_0x001d
        L_0x0015:
            r0 = r7
            goto L_0x001d
        L_0x0017:
            kotlinx.coroutines.v r6 = new kotlinx.coroutines.v
            r6.<init>(r0, r1)
            r0 = r6
        L_0x001d:
            kotlinx.coroutines.CoroutineDispatcher r6 = r8.f43663e
            kotlin.coroutines.CoroutineContext r2 = r8.getContext()
            boolean r6 = r6.mo10805C0(r2)
            r2 = 1
            if (r6 == 0) goto L_0x0039
            r8.f43665g = r0
            r8.f43712d = r2
            kotlinx.coroutines.CoroutineDispatcher r6 = r8.f43663e
            kotlin.coroutines.CoroutineContext r7 = r8.getContext()
            r6.mo7108A0(r7, r8)
            goto L_0x00c8
        L_0x0039:
            kotlinx.coroutines.t0 r6 = kotlinx.coroutines.C19845z1.m33859a()
            boolean r3 = r6.mo72660H0()
            if (r3 == 0) goto L_0x004c
            r8.f43665g = r0
            r8.f43712d = r2
            r6.mo72658F0(r8)
            goto L_0x00c8
        L_0x004c:
            r6.mo72659G0(r2)
            r3 = 0
            kotlin.coroutines.CoroutineContext r4 = r8.getContext()     // Catch:{ all -> 0x0078 }
            kotlinx.coroutines.g1$b r5 = kotlinx.coroutines.C19699g1.C19701b.f43635b     // Catch:{ all -> 0x0078 }
            kotlin.coroutines.CoroutineContext$a r4 = r4.get(r5)     // Catch:{ all -> 0x0078 }
            kotlinx.coroutines.g1 r4 = (kotlinx.coroutines.C19699g1) r4     // Catch:{ all -> 0x0078 }
            if (r4 == 0) goto L_0x007a
            boolean r5 = r4.isActive()     // Catch:{ all -> 0x0078 }
            if (r5 != 0) goto L_0x007a
            java.util.concurrent.CancellationException r1 = r4.mo72398h()     // Catch:{ all -> 0x0078 }
            r8.mo72452a(r0, r1)     // Catch:{ all -> 0x0078 }
            kotlin.Result$Failure r0 = androidx.compose.foundation.layout.C0761x.m1673J(r1)     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)     // Catch:{ all -> 0x0078 }
            r8.resumeWith(r0)     // Catch:{ all -> 0x0078 }
            r1 = r2
            goto L_0x007a
        L_0x0078:
            r7 = move-exception
            goto L_0x00b9
        L_0x007a:
            if (r1 != 0) goto L_0x00b2
            kotlin.coroutines.c<T> r0 = r8.f43664f     // Catch:{ all -> 0x0078 }
            java.lang.Object r1 = r8.f43666h     // Catch:{ all -> 0x0078 }
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()     // Catch:{ all -> 0x0078 }
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.m33530c(r4, r1)     // Catch:{ all -> 0x0078 }
            kotlinx.coroutines.internal.t r5 = kotlinx.coroutines.internal.ThreadContextKt.f43649a     // Catch:{ all -> 0x0078 }
            if (r1 == r5) goto L_0x0091
            kotlinx.coroutines.d2 r0 = kotlinx.coroutines.CoroutineContextKt.m33063d(r0, r4, r1)     // Catch:{ all -> 0x0078 }
            goto L_0x0092
        L_0x0091:
            r0 = r3
        L_0x0092:
            kotlin.coroutines.c<T> r5 = r8.f43664f     // Catch:{ all -> 0x00a5 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x00a5 }
            kotlin.m r7 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x00a1
            boolean r7 = r0.mo72221E0()     // Catch:{ all -> 0x0078 }
            if (r7 == 0) goto L_0x00b2
        L_0x00a1:
            kotlinx.coroutines.internal.ThreadContextKt.m33528a(r4, r1)     // Catch:{ all -> 0x0078 }
            goto L_0x00b2
        L_0x00a5:
            r7 = move-exception
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r0.mo72221E0()     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x00b1
        L_0x00ae:
            kotlinx.coroutines.internal.ThreadContextKt.m33528a(r4, r1)     // Catch:{ all -> 0x0078 }
        L_0x00b1:
            throw r7     // Catch:{ all -> 0x0078 }
        L_0x00b2:
            boolean r7 = r6.mo72662J0()     // Catch:{ all -> 0x0078 }
            if (r7 != 0) goto L_0x00b2
            goto L_0x00bc
        L_0x00b9:
            r8.mo72555e(r7, r3)     // Catch:{ all -> 0x00c0 }
        L_0x00bc:
            r6.mo72657E0(r2)
            goto L_0x00c8
        L_0x00c0:
            r7 = move-exception
            r6.mo72657E0(r2)
            throw r7
        L_0x00c5:
            r8.resumeWith(r7)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C19382n.m32784z0(kq.l, java.lang.Object, kotlin.coroutines.c):void");
    }

    /* renamed from: a */
    public void mo46667a(Exception exc) {
        C15645q2.f35294f.mo52246f(String.format("Could not sync active asset packs. %s", new Object[]{exc}), new Object[0]);
    }

    /* renamed from: b */
    public void mo1391b() {
    }

    /* renamed from: c */
    public void mo3011c(View view) {
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo1133h(Object obj) {
        ListingVideoReviewBottomSheetFragment listingVideoReviewBottomSheetFragment = (ListingVideoReviewBottomSheetFragment) obj;
    }

    /* renamed from: k */
    public ArrayList mo19k(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        C19383o.m32797g(fragmentNavigationKey, "key");
        if (fragmentNavigationKey instanceof CartWithSavedKey) {
            return C17782b.m29888u(fragmentNavigationKey);
        }
        throw new UnsupportedNavigationException("Key " + fragmentNavigationKey + " is not supported by " + this);
    }

    /* renamed from: o */
    public int mo21o() {
        return R.id.menu_bottom_nav_cart;
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Long.valueOf(C14720l8.f32933c.zza().zzi());
    }
}
