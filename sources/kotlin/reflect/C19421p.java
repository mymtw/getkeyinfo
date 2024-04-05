package kotlin.reflect;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.MediaBrowserCompat;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.C0114h;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0487v;
import androidx.compose.animation.C0488w;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0442o;
import androidx.compose.animation.core.C0444p;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.AndroidOverscrollKt;
import androidx.compose.foundation.C1029v;
import androidx.compose.foundation.C1030w;
import androidx.compose.foundation.OverscrollConfigurationKt;
import androidx.compose.foundation.gestures.C0599a;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.text.C0956j;
import androidx.compose.p015ui.graphics.C1514d;
import androidx.compose.p015ui.graphics.C1525i;
import androidx.compose.p015ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p015ui.graphics.colorspace.Rgb;
import androidx.compose.p015ui.input.key.C1611a;
import androidx.compose.p015ui.input.pointer.C1640l;
import androidx.compose.p015ui.input.pointer.C1644p;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.state.ToggleableState;
import androidx.compose.p015ui.text.C1934c;
import androidx.compose.p015ui.text.C1936e;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.runtime.C1302d;
import com.appboy.p043ui.C4940R;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.Orientation;
import com.braze.images.C5442a;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.inappmessage.C5489g;
import com.braze.p044ui.inappmessage.factories.C5648b;
import com.braze.p044ui.inappmessage.views.InAppMessageBaseView;
import com.braze.p044ui.inappmessage.views.InAppMessageFullView;
import com.braze.p044ui.inappmessage.views.InAppMessageImageView;
import com.braze.p044ui.support.ViewUtils;
import com.bugsnag.android.C5816o1;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.etsy.android.R;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.logger.referrers.Referrer;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.GenericHelpKey;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentData;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zze;
import com.google.android.gms.internal.measurement.C14720l8;
import com.google.android.gms.measurement.internal.C14921a0;
import com.google.android.gms.measurement.internal.C14941c2;
import com.google.android.gms.measurement.internal.C14950d2;
import com.google.android.gms.measurement.internal.C14959e2;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.android.play.core.internal.C15702n;
import com.google.firebase.appindexing.FirebaseAppIndexingException;
import com.google.firebase.appindexing.FirebaseAppIndexingInvalidArgumentException;
import com.google.firebase.appindexing.FirebaseAppIndexingTooManyArgumentsException;
import com.google.firebase.appindexing.zza;
import com.google.firebase.appindexing.zzb;
import com.google.gson.internal.C16790g;
import java.io.Closeable;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C19285c;
import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.internal.C19736t;
import org.json.JSONArray;
import p001a0.C0005b;
import p007a6.C0040b;
import p026b6.C3481b;
import p036c5.C4410a;
import p114g4.C6876n;
import p150j4.C7114e;
import p161k6.C7199b;
import p169l5.C7267c;
import p174m0.C7282b;
import p174m0.C7287g;
import p179m5.C7331c;
import p179m5.C7332d;
import p179m5.C7333e;
import p179m5.C7334f;
import p179m5.C7335g;
import p222r4.C7745b;
import p244t5.C8037z;
import p264v4.C8203c;
import p288y.C8343c;
import p309ad.C8508d;
import p356ge.C12788a;
import p363he.C12822e;
import p453tf.C13418j;
import p453tf.C13442y;
import p568fn.C17782b;
import p634np.C18290b;
import p753kq.C19857l;

/* renamed from: kotlin.reflect.p */
public class C19421p implements C18290b, C6876n, C5816o1, C14941c2, C16790g, C8508d, C8203c, C15702n {

    /* renamed from: A */
    public static final int[] f43299A = {R.attr.animate_relativeTo, R.attr.drawPath, R.attr.motionPathRotate, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.transitionEasing};

    /* renamed from: B */
    public static final int[] f43300B = {R.attr.onHide, R.attr.onShow};

    /* renamed from: C */
    public static final int[] f43301C = {R.attr.applyMotionScene, R.attr.currentState, R.attr.layoutDescription, R.attr.motionDebug, R.attr.motionProgress, R.attr.showPaths};

    /* renamed from: D */
    public static final int[] f43302D = {R.attr.defaultDuration, R.attr.layoutDuringTransition};

    /* renamed from: E */
    public static final int[] f43303E = {R.attr.telltales_tailColor, R.attr.telltales_tailScale, R.attr.telltales_velocityMode};

    /* renamed from: F */
    public static final int[] f43304F = {R.attr.clickAction, R.attr.targetId};

    /* renamed from: G */
    public static final int[] f43305G = {R.attr.dragDirection, R.attr.dragScale, R.attr.dragThreshold, R.attr.limitBoundsTo, R.attr.maxAcceleration, R.attr.maxVelocity, R.attr.moveWhenScrollAtTop, R.attr.nestedScrollFlags, R.attr.onTouchUp, R.attr.touchAnchorId, R.attr.touchAnchorSide, R.attr.touchRegionId};

    /* renamed from: H */
    public static final int[] f43306H = {16842972, 16843551, R.attr.layout_constraintTag, R.attr.motionProgress, R.attr.visibilityMode};

    /* renamed from: I */
    public static final int[] f43307I = {16842960, R.attr.constraints};

    /* renamed from: J */
    public static final int[] f43308J = {R.attr.defaultState};

    /* renamed from: K */
    public static final int[] f43309K = {16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840};

    /* renamed from: L */
    public static final int[] f43310L = {16842960, R.attr.autoTransition, R.attr.constraintSetEnd, R.attr.constraintSetStart, R.attr.duration, R.attr.layoutDuringTransition, R.attr.motionInterpolator, R.attr.pathMotionArc, R.attr.staggered, R.attr.transitionDisable, R.attr.transitionFlags};

    /* renamed from: M */
    public static final int[] f43311M = {R.attr.constraints, R.attr.region_heightLessThan, R.attr.region_heightMoreThan, R.attr.region_widthLessThan, R.attr.region_widthMoreThan};

    /* renamed from: b */
    public static final int[] f43312b = {16842755};

    /* renamed from: c */
    public static final int[] f43313c = {16842755};

    /* renamed from: d */
    public static final int[] f43314d = {R.attr.defaultNavHost};

    /* renamed from: e */
    public static final C19421p f43315e = new C19421p();

    /* renamed from: f */
    public static zze f43316f;

    /* renamed from: g */
    public static final /* synthetic */ C19421p f43317g = new C19421p();

    /* renamed from: h */
    public static final C0956j f43318h = new C0956j();

    /* renamed from: i */
    public static boolean f43319i;

    /* renamed from: j */
    public static C19421p f43320j;

    /* renamed from: k */
    public static final C19340c[] f43321k = new C19340c[0];

    /* renamed from: l */
    public static final C19736t f43322l = new C19736t("REMOVE_PREPARED");

    /* renamed from: m */
    public static final char[] f43323m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: n */
    public static final int[] f43324n = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animate_relativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};

    /* renamed from: o */
    public static final int[] f43325o = {16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843840, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_optimizationLevel};

    /* renamed from: p */
    public static final int[] f43326p = {R.attr.content, R.attr.placeholder_emptyVisibility};

    /* renamed from: q */
    public static final int[] f43327q = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843189, 16843190, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animate_relativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.deriveConstraintsFrom, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.transitionEasing, R.attr.transitionPathRotate};

    /* renamed from: r */
    public static final int[] f43328r = {R.attr.attributeName, R.attr.customBoolean, R.attr.customColorDrawableValue, R.attr.customColorValue, R.attr.customDimension, R.attr.customFloatValue, R.attr.customIntegerValue, R.attr.customPixelDimension, R.attr.customStringValue};

    /* renamed from: s */
    public static final int[] f43329s = {R.attr.altSrc, R.attr.brightness, R.attr.contrast, R.attr.crossfade, R.attr.overlay, R.attr.round, R.attr.roundPercent, R.attr.saturation, R.attr.warmth};

    /* renamed from: t */
    public static final int[] f43330t = {16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transitionEasing, R.attr.transitionPathRotate};

    /* renamed from: u */
    public static final int[] f43331u = {16843551, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.waveOffset, R.attr.wavePeriod, R.attr.waveShape, R.attr.waveVariesBy};

    /* renamed from: v */
    public static final int[] f43332v = {R.attr.curveFit, R.attr.drawPath, R.attr.framePosition, R.attr.keyPositionType, R.attr.motionTarget, R.attr.pathMotionArc, R.attr.percentHeight, R.attr.percentWidth, R.attr.percentX, R.attr.percentY, R.attr.sizePercent, R.attr.transitionEasing};

    /* renamed from: w */
    public static final int[] f43333w = {16843551, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.waveDecay, R.attr.waveOffset, R.attr.wavePeriod, R.attr.waveShape};

    /* renamed from: x */
    public static final int[] f43334x = {R.attr.framePosition, R.attr.motionTarget, R.attr.motion_postLayoutCollision, R.attr.motion_triggerOnCollision, R.attr.onCross, R.attr.onNegativeCross, R.attr.onPositiveCross, R.attr.triggerId, R.attr.triggerReceiver, R.attr.triggerSlack};

    /* renamed from: y */
    public static final int[] f43335y = {16842948, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843701, 16843702, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.maxHeight, R.attr.maxWidth, R.attr.minHeight, R.attr.minWidth};

    /* renamed from: z */
    public static final int[] f43336z = {R.attr.mock_diagonalsColor, R.attr.mock_label, R.attr.mock_labelBackgroundColor, R.attr.mock_labelColor, R.attr.mock_showDiagonals, R.attr.mock_showLabel};

    /* renamed from: A */
    public static final float m32913A(C1640l lVar, boolean z) {
        long z2 = m32961z(lVar, z);
        float f = 0.0f;
        if (C8343c.m16640a(z2, C8343c.f18297d)) {
            return 0.0f;
        }
        List<C1644p> list = lVar.f3651a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C1644p pVar = list.get(i2);
            if (pVar.f3659d && pVar.f3662g) {
                i++;
                f = C8343c.m16641b(C8343c.m16644e(z ? pVar.f3658c : pVar.f3661f, z2)) + f;
            }
        }
        return f / ((float) i);
    }

    /* renamed from: B */
    public static final long m32914B(C1640l lVar) {
        long z = m32961z(lVar, true);
        return C8343c.m16640a(z, C8343c.f18297d) ? C8343c.f18295b : C8343c.m16644e(z, m32961z(lVar, false));
    }

    /* renamed from: C */
    public static final float m32915C(C1640l lVar) {
        C1640l lVar2 = lVar;
        List<C1644p> list = lVar2.f3651a;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            C1644p pVar = list.get(i);
            if (!pVar.f3662g || !pVar.f3659d) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        float f = 0.0f;
        if (i2 < 2) {
            return 0.0f;
        }
        long z = m32961z(lVar2, true);
        long z2 = m32961z(lVar2, false);
        List<C1644p> list2 = lVar2.f3651a;
        int size2 = list2.size();
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i4 = 0;
        while (i4 < size2) {
            C1644p pVar2 = list2.get(i4);
            if (pVar2.f3659d && pVar2.f3662g) {
                long j = pVar2.f3658c;
                long e = C8343c.m16644e(pVar2.f3661f, z2);
                long e2 = C8343c.m16644e(j, z);
                float x = m32959x(e2) - m32959x(e);
                float b = C8343c.m16641b(C8343c.m16645f(e2, e)) / 2.0f;
                if (x > 180.0f) {
                    x -= 360.0f;
                } else if (x < -180.0f) {
                    x += 360.0f;
                }
                f3 += x * b;
                f2 += b;
            }
            i4++;
            f = 0.0f;
        }
        return (f2 > f ? 1 : (f2 == f ? 0 : -1)) == 0 ? f : f3 / f2;
    }

    /* renamed from: D */
    public static final float m32916D(C1640l lVar) {
        boolean z = true;
        float A = m32913A(lVar, true);
        float A2 = m32913A(lVar, false);
        if (A == 0.0f) {
            return 1.0f;
        }
        if (A2 != 0.0f) {
            z = false;
        }
        if (z) {
            return 1.0f;
        }
        return A / A2;
    }

    /* renamed from: E */
    public static final void m32917E(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C17782b.m29886t(th, th2);
        }
    }

    /* renamed from: F */
    public static final void m32918F(Throwable th) {
        HashMap hashMap;
        FeatureManager.Feature feature;
        if (f43319i && th != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th.getStackTrace();
            C19383o.m32796f(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                C19383o.m32796f(stackTraceElement, "it");
                String className = stackTraceElement.getClassName();
                C19383o.m32796f(className, "it.className");
                synchronized (FeatureManager.f27345b) {
                    hashMap = FeatureManager.f27344a;
                    if (hashMap.isEmpty()) {
                        hashMap.put(FeatureManager.Feature.AAM, new String[]{"com.facebook.appevents.aam."});
                        hashMap.put(FeatureManager.Feature.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                        hashMap.put(FeatureManager.Feature.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                        hashMap.put(FeatureManager.Feature.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                        hashMap.put(FeatureManager.Feature.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                        hashMap.put(FeatureManager.Feature.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                        hashMap.put(FeatureManager.Feature.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        hashMap.put(FeatureManager.Feature.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        hashMap.put(FeatureManager.Feature.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                        hashMap.put(FeatureManager.Feature.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        hashMap.put(FeatureManager.Feature.IapLogging, new String[]{"com.facebook.appevents.iap."});
                        hashMap.put(FeatureManager.Feature.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                    }
                }
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        feature = FeatureManager.Feature.Unknown;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    feature = (FeatureManager.Feature) entry.getKey();
                    String[] strArr = (String[]) entry.getValue();
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (C19457k.m33025c1(className, strArr[i], false)) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                if (feature != FeatureManager.Feature.Unknown) {
                    C19383o.m32797g(feature, "feature");
                    C13418j.m21106b().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.toKey(), "12.3.0").apply();
                    hashSet.add(feature.toString());
                }
            }
            String str = C13418j.f29381a;
            if (C13442y.m21140c() && (!hashSet.isEmpty())) {
                new InstrumentData(new JSONArray(hashSet)).mo39442b();
            }
        }
    }

    /* renamed from: I */
    public static C0599a m32919I(C1302d dVar) {
        dVar.mo5465u(1107739818);
        float f = C0488w.f1232a;
        dVar.mo5465u(904445851);
        C7282b bVar = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
        Float valueOf = Float.valueOf(bVar.getDensity());
        dVar.mo5465u(1157296644);
        boolean I = dVar.mo5408I(valueOf);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new C0444p(new C0487v(bVar));
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        C0442o oVar = (C0442o) v;
        dVar.mo5406H();
        dVar.mo5465u(1157296644);
        boolean I2 = dVar.mo5408I(oVar);
        Object v2 = dVar.mo5467v();
        if (I2 || v2 == C1302d.C1303a.f2828a) {
            v2 = new C0599a(oVar);
            dVar.mo5454o(v2);
        }
        dVar.mo5406H();
        C0599a aVar = (C0599a) v2;
        dVar.mo5406H();
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.cardinalcommerce.shared.p065cs.p069e.C6276i m32920J(com.cardinalcommerce.shared.p065cs.p069e.C6272b r4) {
        /*
            com.cardinalcommerce.shared.cs.e.i r0 = new com.cardinalcommerce.shared.cs.e.i
            r0.<init>()
            java.lang.String r1 = r4.mo17770a()
            boolean r1 = com.google.android.play.core.assetpacks.C15588c1.m25345s(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = "ThreeDSServerTransID"
            r0.mo17804a(r2, r1)
        L_0x0015:
            java.lang.String r1 = r4.mo17795z()
            boolean r1 = com.google.android.play.core.assetpacks.C15588c1.m25345s(r1)
            if (r1 != 0) goto L_0x0024
            java.lang.String r1 = "AcsCounterAtoS"
            r0.mo17804a(r2, r1)
        L_0x0024:
            java.lang.String r1 = r4.mo17771b()
            boolean r1 = com.google.android.play.core.assetpacks.C15588c1.m25345s(r1)
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = "AcsTransID"
            r0.mo17804a(r2, r1)
        L_0x0033:
            java.lang.String r1 = r4.mo17776g()
            boolean r1 = com.google.android.play.core.assetpacks.C15588c1.m25345s(r1)
            if (r1 != 0) goto L_0x0043
            java.lang.String r1 = "ChallengeCompletionInd"
        L_0x003f:
            r0.mo17804a(r2, r1)
            goto L_0x005d
        L_0x0043:
            java.lang.String r1 = r4.mo17776g()
            java.lang.String r3 = "Y"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.mo17792w()
            r3 = 1
            boolean r1 = com.google.android.play.core.assetpacks.C15588c1.m25343r(r3, r1)
            if (r1 != 0) goto L_0x005d
            java.lang.String r1 = "TransStatus"
            goto L_0x003f
        L_0x005d:
            java.lang.String r1 = r4.mo17786q()
            boolean r1 = com.google.android.play.core.assetpacks.C15588c1.m25345s(r1)
            if (r1 != 0) goto L_0x006c
            java.lang.String r1 = "MessageVersion"
            r0.mo17804a(r2, r1)
        L_0x006c:
            java.lang.String r4 = r4.mo17790u()
            boolean r4 = com.google.android.play.core.assetpacks.C15588c1.m25345s(r4)
            if (r4 != 0) goto L_0x007b
            java.lang.String r4 = "SdkTransID"
            r0.mo17804a(r2, r4)
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.C19421p.m32920J(com.cardinalcommerce.shared.cs.e.b):com.cardinalcommerce.shared.cs.e.i");
    }

    /* renamed from: K */
    public static final float m32921K(C2021q qVar, int i, boolean z, boolean z2) {
        C19383o.m32797g(qVar, "<this>");
        boolean z3 = false;
        if (qVar.mo7738a(((!z || z2) && (z || !z2)) ? Math.max(i - 1, 0) : i) == qVar.mo7752m(i)) {
            z3 = true;
        }
        C1934c cVar = qVar.f4590b;
        cVar.mo7469c(i);
        C1936e eVar = (C1936e) cVar.f4367h.get(i == cVar.f4360a.f4271a.length() ? C17782b.m29859Y(cVar.f4367h) : C1993m.m4340A(i, cVar.f4367h));
        return eVar.f4368a.mo7484m(eVar.mo7493b(i), z3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f A[LOOP:0: B:1:0x0002->B:15:0x001f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x001e A[SYNTHETIC] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m32922L(int r5, int r6) {
        /*
            r0 = 1
            r1 = r0
        L_0x0002:
            r2 = 2
            if (r1 > r2) goto L_0x0022
            int r3 = r5 + r1
            int r3 = r3 % 3
            if (r3 == 0) goto L_0x0015
            r4 = 0
            if (r3 == r0) goto L_0x0017
            if (r3 == r2) goto L_0x0011
            goto L_0x001c
        L_0x0011:
            r2 = r6 & 2
            if (r2 == 0) goto L_0x001c
        L_0x0015:
            r4 = r0
            goto L_0x001c
        L_0x0017:
            r2 = r6 & 1
            if (r2 == 0) goto L_0x001c
            goto L_0x0015
        L_0x001c:
            if (r4 == 0) goto L_0x001f
            return r3
        L_0x001f:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0022:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.C19421p.m32922L(int, int):int");
    }

    /* renamed from: M */
    public static boolean m32923M(Bundle bundle, Bundle bundle2) {
        int i;
        int i2;
        int i3;
        int i4 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i5 = bundle2 == null ? -1 : bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i6 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        int i7 = bundle2 == null ? -1 : bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        int i8 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i4 == -1 || i6 == -1) {
            i = Integer.MAX_VALUE;
            i2 = 0;
        } else {
            i2 = i4 * i6;
            i = (i6 + i2) - 1;
        }
        if (i5 == -1 || i7 == -1) {
            i3 = 0;
        } else {
            i3 = i5 * i7;
            i8 = (i7 + i3) - 1;
        }
        return i >= i3 && i8 >= i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0175, code lost:
        if (r0.equals("video/mp2t") == false) goto L_0x0062;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m32924N(java.lang.String r21) {
        /*
            r0 = r21
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.ArrayList<bj.m$a> r2 = p513bj.C14065m.f30951a
            int r2 = r21.hashCode()
            r3 = 2
            r4 = 1
            r5 = 0
            switch(r2) {
                case -1007807498: goto L_0x002a;
                case -586683234: goto L_0x001f;
                case 187090231: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            r2 = r1
            goto L_0x0034
        L_0x0014:
            java.lang.String r2 = "audio/mp3"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x001d
            goto L_0x0012
        L_0x001d:
            r2 = r3
            goto L_0x0034
        L_0x001f:
            java.lang.String r2 = "audio/x-wav"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x0028
            goto L_0x0012
        L_0x0028:
            r2 = r4
            goto L_0x0034
        L_0x002a:
            java.lang.String r2 = "audio/x-flac"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x0033
            goto L_0x0012
        L_0x0033:
            r2 = r5
        L_0x0034:
            java.lang.String r6 = "audio/mpeg"
            java.lang.String r7 = "audio/wav"
            java.lang.String r8 = "audio/flac"
            switch(r2) {
                case 0: goto L_0x0042;
                case 1: goto L_0x0040;
                case 2: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0043
        L_0x003e:
            r0 = r6
            goto L_0x0043
        L_0x0040:
            r0 = r7
            goto L_0x0043
        L_0x0042:
            r0 = r8
        L_0x0043:
            int r2 = r0.hashCode()
            r9 = 14
            r10 = 13
            r11 = 12
            r12 = 11
            r13 = 10
            r14 = 9
            r15 = 8
            r16 = 7
            r17 = 6
            r18 = 5
            r19 = 4
            r20 = 3
            switch(r2) {
                case -2123537834: goto L_0x0185;
                case -1662384011: goto L_0x0179;
                case -1662384007: goto L_0x016f;
                case -1662095187: goto L_0x0162;
                case -1606874997: goto L_0x0155;
                case -1487394660: goto L_0x0148;
                case -1248337486: goto L_0x013b;
                case -1004728940: goto L_0x012e;
                case -387023398: goto L_0x0121;
                case -43467528: goto L_0x0114;
                case 13915911: goto L_0x0107;
                case 187078296: goto L_0x00fa;
                case 187078297: goto L_0x00ed;
                case 187078669: goto L_0x00e0;
                case 187090232: goto L_0x00d4;
                case 187091926: goto L_0x00c7;
                case 187099443: goto L_0x00bc;
                case 1331848029: goto L_0x00af;
                case 1503095341: goto L_0x00a2;
                case 1504578661: goto L_0x0095;
                case 1504619009: goto L_0x008a;
                case 1504831518: goto L_0x007f;
                case 1505118770: goto L_0x0072;
                case 2039520277: goto L_0x0065;
                default: goto L_0x0062;
            }
        L_0x0062:
            r3 = r1
            goto L_0x0190
        L_0x0065:
            java.lang.String r2 = "video/x-matroska"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x006e
            goto L_0x0062
        L_0x006e:
            r3 = 23
            goto L_0x0190
        L_0x0072:
            java.lang.String r2 = "audio/webm"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x007b
            goto L_0x0062
        L_0x007b:
            r3 = 22
            goto L_0x0190
        L_0x007f:
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0086
            goto L_0x0062
        L_0x0086:
            r3 = 21
            goto L_0x0190
        L_0x008a:
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0091
            goto L_0x0062
        L_0x0091:
            r3 = 20
            goto L_0x0190
        L_0x0095:
            java.lang.String r2 = "audio/eac3"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x009e
            goto L_0x0062
        L_0x009e:
            r3 = 19
            goto L_0x0190
        L_0x00a2:
            java.lang.String r2 = "audio/3gpp"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00ab
            goto L_0x0062
        L_0x00ab:
            r3 = 18
            goto L_0x0190
        L_0x00af:
            java.lang.String r2 = "video/mp4"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00b8
            goto L_0x0062
        L_0x00b8:
            r3 = 17
            goto L_0x0190
        L_0x00bc:
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x00c3
            goto L_0x0062
        L_0x00c3:
            r3 = 16
            goto L_0x0190
        L_0x00c7:
            java.lang.String r2 = "audio/ogg"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00d0
            goto L_0x0062
        L_0x00d0:
            r3 = 15
            goto L_0x0190
        L_0x00d4:
            java.lang.String r2 = "audio/mp4"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00dd
            goto L_0x0062
        L_0x00dd:
            r3 = r9
            goto L_0x0190
        L_0x00e0:
            java.lang.String r2 = "audio/amr"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00ea
            goto L_0x0062
        L_0x00ea:
            r3 = r10
            goto L_0x0190
        L_0x00ed:
            java.lang.String r2 = "audio/ac4"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00f7
            goto L_0x0062
        L_0x00f7:
            r3 = r11
            goto L_0x0190
        L_0x00fa:
            java.lang.String r2 = "audio/ac3"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0104
            goto L_0x0062
        L_0x0104:
            r3 = r12
            goto L_0x0190
        L_0x0107:
            java.lang.String r2 = "video/x-flv"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0111
            goto L_0x0062
        L_0x0111:
            r3 = r13
            goto L_0x0190
        L_0x0114:
            java.lang.String r2 = "application/webm"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x011e
            goto L_0x0062
        L_0x011e:
            r3 = r14
            goto L_0x0190
        L_0x0121:
            java.lang.String r2 = "audio/x-matroska"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x012b
            goto L_0x0062
        L_0x012b:
            r3 = r15
            goto L_0x0190
        L_0x012e:
            java.lang.String r2 = "text/vtt"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0138
            goto L_0x0062
        L_0x0138:
            r3 = r16
            goto L_0x0190
        L_0x013b:
            java.lang.String r2 = "application/mp4"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0145
            goto L_0x0062
        L_0x0145:
            r3 = r17
            goto L_0x0190
        L_0x0148:
            java.lang.String r2 = "image/jpeg"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0152
            goto L_0x0062
        L_0x0152:
            r3 = r18
            goto L_0x0190
        L_0x0155:
            java.lang.String r2 = "audio/amr-wb"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x015f
            goto L_0x0062
        L_0x015f:
            r3 = r19
            goto L_0x0190
        L_0x0162:
            java.lang.String r2 = "video/webm"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x016c
            goto L_0x0062
        L_0x016c:
            r3 = r20
            goto L_0x0190
        L_0x016f:
            java.lang.String r2 = "video/mp2t"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0190
            goto L_0x0062
        L_0x0179:
            java.lang.String r2 = "video/mp2p"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0183
            goto L_0x0062
        L_0x0183:
            r3 = r4
            goto L_0x0190
        L_0x0185:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x018f
            goto L_0x0062
        L_0x018f:
            r3 = r5
        L_0x0190:
            switch(r3) {
                case 0: goto L_0x01a1;
                case 1: goto L_0x01a0;
                case 2: goto L_0x019f;
                case 3: goto L_0x019e;
                case 4: goto L_0x019d;
                case 5: goto L_0x019c;
                case 6: goto L_0x019b;
                case 7: goto L_0x019a;
                case 8: goto L_0x019e;
                case 9: goto L_0x019e;
                case 10: goto L_0x0199;
                case 11: goto L_0x01a1;
                case 12: goto L_0x0198;
                case 13: goto L_0x019d;
                case 14: goto L_0x019b;
                case 15: goto L_0x0197;
                case 16: goto L_0x0196;
                case 17: goto L_0x019b;
                case 18: goto L_0x019d;
                case 19: goto L_0x01a1;
                case 20: goto L_0x0195;
                case 21: goto L_0x0194;
                case 22: goto L_0x019e;
                case 23: goto L_0x019e;
                default: goto L_0x0193;
            }
        L_0x0193:
            return r1
        L_0x0194:
            return r16
        L_0x0195:
            return r19
        L_0x0196:
            return r11
        L_0x0197:
            return r14
        L_0x0198:
            return r4
        L_0x0199:
            return r18
        L_0x019a:
            return r10
        L_0x019b:
            return r15
        L_0x019c:
            return r9
        L_0x019d:
            return r20
        L_0x019e:
            return r17
        L_0x019f:
            return r12
        L_0x01a0:
            return r13
        L_0x01a1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.C19421p.m32924N(java.lang.String):int");
    }

    /* renamed from: O */
    public static int m32925O(Map map) {
        List list = (List) map.get("Content-Type");
        return m32924N((list == null || list.isEmpty()) ? null : (String) list.get(0));
    }

    /* renamed from: P */
    public static int m32926P(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }

    /* renamed from: Q */
    public static boolean m32927Q() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ENGLISH;
        return str.toLowerCase(locale).equals("lge") || str.toLowerCase(locale).equals("samsung");
    }

    /* renamed from: R */
    public static final boolean m32928R(long j) {
        int i = C8343c.f18298e;
        return j != C8343c.f18297d;
    }

    /* renamed from: S */
    public static final long m32929S(long j, float f, long j2) {
        return m32952q(C15588c1.m25354w0(C8343c.m16642c(j), C8343c.m16642c(j2), f), C15588c1.m25354w0(C8343c.m16643d(j), C8343c.m16643d(j2), f));
    }

    /* renamed from: T */
    public static final int m32930T(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* renamed from: U */
    public static final Map m32931U(Pair pair) {
        C19383o.m32797g(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        C19383o.m32796f(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: V */
    public static final void m32932V(Context context, GenericHelpKey genericHelpKey) {
        if (context instanceof Activity) {
            C12788a.m20423b((Activity) context, genericHelpKey);
            return;
        }
        throw new UnsupportedNavigationException("Context " + context + " is not an Activity");
    }

    /* renamed from: W */
    public static final void m32933W(Context context, C12822e eVar) {
        if (context instanceof Activity) {
            C12788a.m20424c((Activity) context, eVar);
            return;
        }
        throw new UnsupportedNavigationException("Context " + context + " is not an Activity");
    }

    /* renamed from: b0 */
    public static C1030w m32934b0(C1302d dVar) {
        dVar.mo5465u(1809802212);
        AndroidOverscrollKt.C0491a aVar = AndroidOverscrollKt.f1255a;
        dVar.mo5465u(-81138291);
        Context context = (Context) dVar.mo5410J(AndroidCompositionLocals_androidKt.f3987b);
        C1029v vVar = (C1029v) dVar.mo5410J(OverscrollConfigurationKt.f1276a);
        dVar.mo5465u(511388516);
        boolean I = dVar.mo5408I(context) | dVar.mo5408I(vVar);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = vVar != null ? new AndroidEdgeEffectOverscrollEffect(context, vVar) : AndroidOverscrollKt.f1255a;
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        C1030w wVar = (C1030w) v;
        dVar.mo5406H();
        dVar.mo5406H();
        return wVar;
    }

    /* renamed from: c0 */
    public static final String m32935c0(Context context) {
        if (context == null) {
            return "";
        }
        C19285c<String> cVar = Referrer.f19131c;
        return Referrer.C8712a.m17141a(context).toString();
    }

    /* renamed from: d0 */
    public static final void m32936d0(int i, View view) {
        C19383o.m32798h(view, "$this$setPaddingBottom");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    /* renamed from: e0 */
    public static final void m32937e0(int i, View view) {
        C19383o.m32798h(view, "$this$setPaddingEnd");
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    /* renamed from: f0 */
    public static final void m32938f0(int i, View view) {
        C19383o.m32798h(view, "$this$setPaddingTop");
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    /* renamed from: g0 */
    public static final void m32939g0(boolean z) {
        if (z) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().penaltyDeathOnNetwork().build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
            return;
        }
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
    }

    /* renamed from: h0 */
    public static void m32940h0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: i0 */
    public static final Map m32941i0(Map map) {
        C19383o.m32797g(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C19383o.m32796f(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* renamed from: j0 */
    public static final void m32942j0(C19513o oVar, Object obj) {
        C19383o.m32798h(oVar, "$this$tryOffer");
        try {
            oVar.offer(obj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: k0 */
    public static final long m32943k0(long j, long j2) {
        int i;
        int d;
        int e;
        int e2 = C2022r.m4466e(j);
        int d2 = C2022r.m4465d(j);
        boolean z = false;
        if (C2022r.m4466e(j2) < C2022r.m4465d(j) && C2022r.m4466e(j) < C2022r.m4465d(j2)) {
            if (C2022r.m4466e(j2) <= C2022r.m4466e(j) && C2022r.m4465d(j) <= C2022r.m4465d(j2)) {
                e2 = C2022r.m4466e(j2);
                d2 = e2;
            } else {
                if (C2022r.m4466e(j) <= C2022r.m4466e(j2) && C2022r.m4465d(j2) <= C2022r.m4465d(j)) {
                    d = C2022r.m4465d(j2);
                    e = C2022r.m4466e(j2);
                } else {
                    int e3 = C2022r.m4466e(j2);
                    if (e2 < C2022r.m4465d(j2) && e3 <= e2) {
                        z = true;
                    }
                    if (z) {
                        e2 = C2022r.m4466e(j2);
                        i = C2022r.m4465d(j2) - C2022r.m4466e(j2);
                        d2 -= i;
                    } else {
                        d2 = C2022r.m4466e(j2);
                    }
                }
            }
            return C0005b.m47l(e2, d2);
        }
        if (d2 > C2022r.m4466e(j2)) {
            e2 -= C2022r.m4465d(j2) - C2022r.m4466e(j2);
            d = C2022r.m4465d(j2);
            e = C2022r.m4466e(j2);
        }
        return C0005b.m47l(e2, d2);
        i = d - e;
        d2 -= i;
        return C0005b.m47l(e2, d2);
    }

    /* renamed from: l0 */
    public static FirebaseAppIndexingException m32944l0(Status status, String str) {
        Preconditions.checkNotNull(status);
        String statusMessage = status.getStatusMessage();
        if (statusMessage != null && !statusMessage.isEmpty()) {
            str = statusMessage;
        }
        switch (status.getStatusCode()) {
            case 17510:
                return new FirebaseAppIndexingInvalidArgumentException(str);
            case 17511:
                return new FirebaseAppIndexingTooManyArgumentsException(str);
            case 17513:
                return new zzb(str);
            case 17514:
                return new zza(str);
            default:
                return new FirebaseAppIndexingException(str);
        }
    }

    /* renamed from: m */
    public static Animatable m32945m(float f) {
        return new Animatable(Float.valueOf(f), VectorConvertersKt.f1076a, Float.valueOf(0.01f));
    }

    /* renamed from: m0 */
    public static Object m32946m0(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()}));
    }

    /* renamed from: n */
    public static C1514d m32947n(int i, int i2, int i3, int i4) {
        boolean z = false;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        Rgb rgb = (i4 & 16) != 0 ? ColorSpaces.f3226c : null;
        C19383o.m32797g(rgb, "colorSpace");
        C15562d.m25186X(i3);
        return new C1514d(C1525i.m3303c(i, i2, i3, z, rgb));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0079 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m32948n0(int r7, byte[] r8) {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            if (r1 >= r7) goto L_0x000b
            byte r2 = r8[r1]
            if (r2 < 0) goto L_0x000b
            int r1 = r1 + 1
            goto L_0x0002
        L_0x000b:
            if (r1 < r7) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            if (r1 < r7) goto L_0x0013
        L_0x0010:
            r1 = r0
            goto L_0x0077
        L_0x0013:
            int r2 = r1 + 1
            byte r1 = r8[r1]
            if (r1 >= 0) goto L_0x007b
            r3 = -32
            r4 = -65
            if (r1 >= r3) goto L_0x002c
            if (r2 >= r7) goto L_0x0077
            r3 = -62
            if (r1 < r3) goto L_0x0076
            int r1 = r2 + 1
            byte r2 = r8[r2]
            if (r2 <= r4) goto L_0x000e
            goto L_0x0076
        L_0x002c:
            r5 = -16
            if (r1 >= r5) goto L_0x0052
            int r5 = r7 + -1
            if (r2 < r5) goto L_0x0039
            int r1 = com.google.android.gms.internal.icing.C14509i2.m23048c(r2, r7, r8)
            goto L_0x0077
        L_0x0039:
            int r5 = r2 + 1
            byte r2 = r8[r2]
            if (r2 > r4) goto L_0x0076
            r6 = -96
            if (r1 != r3) goto L_0x0045
            if (r2 < r6) goto L_0x0076
        L_0x0045:
            r3 = -19
            if (r1 != r3) goto L_0x004b
            if (r2 >= r6) goto L_0x0076
        L_0x004b:
            int r1 = r5 + 1
            byte r2 = r8[r5]
            if (r2 <= r4) goto L_0x000e
            goto L_0x0076
        L_0x0052:
            int r3 = r7 + -2
            if (r2 < r3) goto L_0x005b
            int r1 = com.google.android.gms.internal.icing.C14509i2.m23048c(r2, r7, r8)
            goto L_0x0077
        L_0x005b:
            int r3 = r2 + 1
            byte r2 = r8[r2]
            if (r2 > r4) goto L_0x0076
            int r1 = r1 << 28
            int r2 = r2 + 112
            int r2 = r2 + r1
            int r1 = r2 >> 30
            if (r1 != 0) goto L_0x0076
            int r1 = r3 + 1
            byte r2 = r8[r3]
            if (r2 > r4) goto L_0x0076
            int r2 = r1 + 1
            byte r1 = r8[r1]
            if (r1 <= r4) goto L_0x007b
        L_0x0076:
            r1 = -1
        L_0x0077:
            if (r1 != 0) goto L_0x007a
            r0 = 1
        L_0x007a:
            return r0
        L_0x007b:
            r1 = r2
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.C19421p.m32948n0(int, byte[]):boolean");
    }

    /* renamed from: o */
    public static final long m32949o(int i, int i2) {
        long j = (((long) i2) & UnsignedInteger.INT_MASK) | (((long) i) << 32);
        int i3 = C7287g.f16165c;
        return j;
    }

    /* renamed from: o0 */
    public static void m32950o0(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    /* renamed from: p */
    public static final long m32951p(int i) {
        long j = (((long) i) << 32) | (((long) 0) & UnsignedInteger.INT_MASK);
        int i2 = C1611a.f3586k;
        return j;
    }

    /* renamed from: q */
    public static final long m32952q(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & UnsignedInteger.INT_MASK) | (floatToIntBits << 32);
        int i = C8343c.f18298e;
        return floatToIntBits2;
    }

    /* renamed from: r */
    public static final ToggleableState m32953r(boolean z) {
        return z ? ToggleableState.On : ToggleableState.Off;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r0.equals("03") == false) goto L_0x0041;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.cardinalcommerce.shared.p065cs.p069e.C6276i m32954s(com.cardinalcommerce.shared.p065cs.p069e.C6272b r6) {
        /*
            java.lang.String r0 = r6.mo17774e()
            com.cardinalcommerce.shared.cs.e.i r1 = new com.cardinalcommerce.shared.cs.e.i
            r1.<init>()
            java.lang.String r2 = r6.mo17776g()
            boolean r2 = com.google.android.play.core.assetpacks.C15588c1.m25345s(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0019
            java.lang.String r2 = "ChallengeCompletionInd"
            r1.mo17804a(r3, r2)
        L_0x0019:
            boolean r2 = r1.mo17805a()
            if (r2 == 0) goto L_0x013f
            java.lang.String r2 = r6.mo17776g()
            java.lang.String r4 = "N"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x013a
            r2 = 2
            boolean r4 = com.google.android.play.core.assetpacks.C15588c1.m25343r(r2, r0)
            r1.mo17803a((boolean) r4)
            boolean r4 = r1.mo17805a()
            if (r4 == 0) goto L_0x0134
            r1 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case 1537: goto L_0x006d;
                case 1538: goto L_0x0062;
                case 1539: goto L_0x0059;
                case 1540: goto L_0x004e;
                case 1541: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            r2 = r1
            goto L_0x0077
        L_0x0043:
            java.lang.String r2 = "05"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x004c
            goto L_0x0041
        L_0x004c:
            r2 = 4
            goto L_0x0077
        L_0x004e:
            java.lang.String r2 = "04"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0057
            goto L_0x0041
        L_0x0057:
            r2 = 3
            goto L_0x0077
        L_0x0059:
            java.lang.String r4 = "03"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0077
            goto L_0x0041
        L_0x0062:
            java.lang.String r2 = "02"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x006b
            goto L_0x0041
        L_0x006b:
            r2 = 1
            goto L_0x0077
        L_0x006d:
            java.lang.String r2 = "01"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0076
            goto L_0x0041
        L_0x0076:
            r2 = r3
        L_0x0077:
            java.lang.String r0 = "ChallengeSelectInfo"
            java.lang.String r1 = "SubmitAuthenticationLabel"
            java.lang.String r4 = "ChallengeInfoText"
            switch(r2) {
                case 0: goto L_0x0115;
                case 1: goto L_0x00e9;
                case 2: goto L_0x00bd;
                case 3: goto L_0x009c;
                case 4: goto L_0x0085;
                default: goto L_0x0080;
            }
        L_0x0080:
            com.cardinalcommerce.shared.cs.e.i r6 = m32920J(r6)
            return r6
        L_0x0085:
            com.cardinalcommerce.shared.cs.e.i r0 = m32920J(r6)
            java.lang.String r6 = r6.mo17772c()
            boolean r6 = com.google.android.play.core.assetpacks.C15588c1.m25345s(r6)
            if (r6 != 0) goto L_0x009b
            r0.mo17803a((boolean) r3)
            java.lang.String r6 = "AcsHTML"
            r0.mo17802a((java.lang.String) r6)
        L_0x009b:
            return r0
        L_0x009c:
            com.cardinalcommerce.shared.cs.e.i r0 = m32920J(r6)
            java.lang.String r1 = r6.mo17779j()
            boolean r1 = com.google.android.play.core.assetpacks.C15588c1.m25271B(r1)
            if (r1 != 0) goto L_0x00ad
            r0.mo17804a(r3, r4)
        L_0x00ad:
            java.lang.String r6 = r6.mo17787r()
            boolean r6 = com.google.android.play.core.assetpacks.C15588c1.m25345s(r6)
            if (r6 != 0) goto L_0x00bc
            java.lang.String r6 = "OobContinueLabel"
            r0.mo17804a(r3, r6)
        L_0x00bc:
            return r0
        L_0x00bd:
            com.cardinalcommerce.shared.cs.e.i r2 = m32920J(r6)
            java.lang.String r5 = r6.mo17779j()
            boolean r5 = com.google.android.play.core.assetpacks.C15588c1.m25271B(r5)
            if (r5 != 0) goto L_0x00ce
            r2.mo17804a(r3, r4)
        L_0x00ce:
            java.lang.String r4 = r6.mo17791v()
            boolean r4 = com.google.android.play.core.assetpacks.C15588c1.m25271B(r4)
            if (r4 != 0) goto L_0x00db
            r2.mo17804a(r3, r1)
        L_0x00db:
            java.util.ArrayList r6 = r6.mo17781l()
            int r6 = r6.size()
            if (r6 > 0) goto L_0x00e8
            r2.mo17804a(r3, r0)
        L_0x00e8:
            return r2
        L_0x00e9:
            com.cardinalcommerce.shared.cs.e.i r2 = m32920J(r6)
            java.lang.String r5 = r6.mo17779j()
            boolean r5 = com.google.android.play.core.assetpacks.C15588c1.m25271B(r5)
            if (r5 != 0) goto L_0x00fa
            r2.mo17804a(r3, r4)
        L_0x00fa:
            java.lang.String r4 = r6.mo17791v()
            boolean r4 = com.google.android.play.core.assetpacks.C15588c1.m25271B(r4)
            if (r4 != 0) goto L_0x0107
            r2.mo17804a(r3, r1)
        L_0x0107:
            java.util.ArrayList r6 = r6.mo17781l()
            int r6 = r6.size()
            if (r6 > 0) goto L_0x0114
            r2.mo17804a(r3, r0)
        L_0x0114:
            return r2
        L_0x0115:
            com.cardinalcommerce.shared.cs.e.i r0 = m32920J(r6)
            java.lang.String r2 = r6.mo17791v()
            boolean r2 = com.google.android.play.core.assetpacks.C15588c1.m25271B(r2)
            if (r2 != 0) goto L_0x0126
            r0.mo17804a(r3, r1)
        L_0x0126:
            java.lang.String r6 = r6.mo17779j()
            boolean r6 = com.google.android.play.core.assetpacks.C15588c1.m25271B(r6)
            if (r6 != 0) goto L_0x0133
            r0.mo17804a(r3, r4)
        L_0x0133:
            return r0
        L_0x0134:
            java.lang.String r6 = "AcsUiType"
            r1.mo17802a((java.lang.String) r6)
            return r1
        L_0x013a:
            com.cardinalcommerce.shared.cs.e.i r6 = m32920J(r6)
            return r6
        L_0x013f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.C19421p.m32954s(com.cardinalcommerce.shared.cs.e.b):com.cardinalcommerce.shared.cs.e.i");
    }

    /* renamed from: t */
    public static C7199b m32955t(String str) {
        if (str.equals("SHA-1")) {
            return new C7199b(C3481b.f8104a, C8037z.f17524b);
        }
        if (str.equals("SHA-224")) {
            return new C7199b(C0040b.f96d, C8037z.f17524b);
        }
        if (str.equals("SHA-256")) {
            return new C7199b(C0040b.f93a, C8037z.f17524b);
        }
        if (str.equals("SHA-384")) {
            return new C7199b(C0040b.f94b, C8037z.f17524b);
        }
        if (str.equals("SHA-512")) {
            return new C7199b(C0040b.f95c, C8037z.f17524b);
        }
        throw new IllegalArgumentException(C0326j.m864i("unrecognised digest algorithm: ", str));
    }

    /* renamed from: u */
    public static C7267c m32956u(C7199b bVar) {
        if (bVar.f15983b.equals(C3481b.f8104a)) {
            return new C7331c();
        }
        if (bVar.f15983b.equals(C0040b.f96d)) {
            return new C7332d();
        }
        if (bVar.f15983b.equals(C0040b.f93a)) {
            return new C7333e();
        }
        if (bVar.f15983b.equals(C0040b.f94b)) {
            return new C7334f();
        }
        if (bVar.f15983b.equals(C0040b.f95c)) {
            return new C7335g();
        }
        StringBuilder h = C0072d.m201h("unrecognised OID in digest algorithm identifier: ");
        h.append(bVar.f15983b);
        throw new IllegalArgumentException(h.toString());
    }

    /* renamed from: v */
    public static final int m32957v(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: w */
    public static final void m32958w(View view, C1689j jVar, int i, C19857l lVar) {
        if (jVar != null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            float f = C0114h.m276G(jVar).f18302b;
            int i2 = rect.top;
            lVar.invoke(Integer.valueOf(((int) Math.max(f - ((float) i2), ((float) (rect.bottom - i2)) - C0114h.m276G(jVar).f18304d)) - i));
        }
    }

    /* renamed from: x */
    public static final float m32959x(long j) {
        boolean z = true;
        if (C8343c.m16642c(j) == 0.0f) {
            if (C8343c.m16643d(j) != 0.0f) {
                z = false;
            }
            if (z) {
                return 0.0f;
            }
        }
        return ((-((float) Math.atan2((double) C8343c.m16642c(j), (double) C8343c.m16643d(j)))) * 180.0f) / 3.1415927f;
    }

    /* renamed from: y */
    public static boolean m32960y(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle2 == null ? bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
    }

    /* renamed from: z */
    public static final long m32961z(C1640l lVar, boolean z) {
        long j = C8343c.f18295b;
        List<C1644p> list = lVar.f3651a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C1644p pVar = list.get(i2);
            if (pVar.f3659d && pVar.f3662g) {
                j = C8343c.m16645f(j, z ? pVar.f3658c : pVar.f3661f);
                i++;
            }
        }
        if (i == 0) {
            return C8343c.f18297d;
        }
        float f = (float) i;
        return m32952q(C8343c.m16642c(j) / f, C8343c.m16643d(j) / f);
    }

    /* renamed from: G */
    public void mo71970G() {
        throw null;
    }

    /* renamed from: H */
    public void mo71971H() {
        throw null;
    }

    /* renamed from: X */
    public void mo71972X() {
        throw null;
    }

    /* renamed from: Y */
    public void mo71973Y() {
        throw null;
    }

    /* renamed from: Z */
    public void mo71974Z() {
        throw null;
    }

    /* renamed from: a */
    public View mo1126a(Activity activity, C5483a aVar) {
        InAppMessageFullView inAppMessageFullView;
        C19383o.m32797g(activity, "activity");
        C19383o.m32797g(aVar, "inAppMessage");
        Context applicationContext = activity.getApplicationContext();
        C5489g gVar = (C5489g) aVar;
        boolean z = false;
        boolean z2 = gVar.f11813H == ImageStyle.GRAPHIC;
        if (z2) {
            View inflate = activity.getLayoutInflater().inflate(C4940R.C4943layout.com_braze_inappmessage_full_graphic, (ViewGroup) null);
            if (inflate != null) {
                inAppMessageFullView = (InAppMessageFullView) inflate;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageFullView");
            }
        } else {
            View inflate2 = activity.getLayoutInflater().inflate(C4940R.C4943layout.com_braze_inappmessage_full, (ViewGroup) null);
            if (inflate2 != null) {
                inAppMessageFullView = (InAppMessageFullView) inflate2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageFullView");
            }
        }
        InAppMessageFullView inAppMessageFullView2 = inAppMessageFullView;
        inAppMessageFullView2.createAppropriateViews(activity, gVar, z2);
        String appropriateImageUrl = InAppMessageBaseView.getAppropriateImageUrl(gVar);
        if (appropriateImageUrl == null || appropriateImageUrl.length() == 0) {
            z = true;
        }
        if (!z) {
            Braze.Companion companion = Braze.f11170m;
            C19383o.m32796f(applicationContext, "applicationContext");
            C5442a n = companion.mo15515f(applicationContext).mo15499n();
            C19383o.m32796f(appropriateImageUrl, "imageUrl");
            ImageView messageImageView = inAppMessageFullView2.getMessageImageView();
            C19383o.m32796f(messageImageView, "view.messageImageView");
            ((DefaultBrazeImageLoader) n).mo15924e(applicationContext, aVar, appropriateImageUrl, messageImageView, BrazeViewBounds.NO_BOUNDS);
        }
        inAppMessageFullView2.getFrameView().setOnClickListener((View.OnClickListener) null);
        inAppMessageFullView2.setMessageBackgroundColor(gVar.f11767r);
        inAppMessageFullView2.setFrameColor(gVar.f11814I);
        inAppMessageFullView2.setMessageButtons(gVar.f11812G);
        inAppMessageFullView2.setMessageCloseButtonColor(gVar.f11810E);
        if (!z2) {
            inAppMessageFullView2.setMessage(gVar.f11753d);
            inAppMessageFullView2.setMessageTextColor(gVar.f11766q);
            inAppMessageFullView2.setMessageHeaderText(gVar.f11811F);
            inAppMessageFullView2.setMessageHeaderTextColor(gVar.f11809D);
            inAppMessageFullView2.setMessageHeaderTextAlignment(gVar.f11815J);
            inAppMessageFullView2.setMessageTextAlign(gVar.f11763n);
            inAppMessageFullView2.resetMessageMargins(gVar.f11844A);
            ImageView messageImageView2 = inAppMessageFullView2.getMessageImageView();
            if (messageImageView2 != null) {
                ((InAppMessageImageView) messageImageView2).setToHalfParentHeight(true);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView");
            }
        }
        inAppMessageFullView2.setLargerCloseButtonClickArea(inAppMessageFullView2.getMessageCloseButtonView());
        if (ViewUtils.m11482h(activity) && gVar.mo15955I() != Orientation.ANY) {
            int longEdge = inAppMessageFullView2.getLongEdge();
            int shortEdge = inAppMessageFullView2.getShortEdge();
            if (longEdge > 0 && shortEdge > 0) {
                RelativeLayout.LayoutParams layoutParams = gVar.mo15955I() == Orientation.LANDSCAPE ? new RelativeLayout.LayoutParams(longEdge, shortEdge) : new RelativeLayout.LayoutParams(shortEdge, longEdge);
                layoutParams.addRule(13, -1);
                inAppMessageFullView2.getMessageBackgroundObject().setLayoutParams(layoutParams);
            }
        }
        inAppMessageFullView2.setupDirectionalNavigation(gVar.f11812G.size());
        View findViewById = inAppMessageFullView2.findViewById(C4940R.C4942id.com_braze_inappmessage_full_scrollview);
        if (findViewById != null) {
            findViewById.post(new C5648b(inAppMessageFullView2.findViewById(C4940R.C4942id.com_braze_inappmessage_full_all_content_parent), inAppMessageFullView2, gVar, applicationContext, findViewById));
        }
        return inAppMessageFullView2;
    }

    /* renamed from: a0 */
    public void mo71975a0() {
        throw null;
    }

    /* renamed from: b */
    public void mo16602b(String str, Throwable th) {
        C19383o.m32798h(str, "msg");
        C19383o.m32798h(th, "throwable");
        Log.w("Bugsnag", str, th);
    }

    /* renamed from: c */
    public void mo16603c(String str, Throwable th) {
        C19383o.m32798h(str, "msg");
        Log.e("Bugsnag", str, th);
    }

    /* renamed from: d */
    public boolean mo4158d(ClassLoader classLoader, File file, File file2, boolean z) {
        return C14921a0.m24235b(classLoader, file, file2, z);
    }

    /* renamed from: e */
    public void mo4159e(ClassLoader classLoader, HashSet hashSet) {
        C14921a0.m24234a(classLoader, hashSet, new C0761x());
    }

    /* renamed from: f */
    public void mo16606f(String str) {
        C19383o.m32798h(str, "msg");
        Log.i("Bugsnag", str);
    }

    /* renamed from: g */
    public void mo16607g(String str, Exception exc) {
        Log.d("Bugsnag", str, exc);
    }

    /* renamed from: h */
    public void mo16608h(String str) {
        C19383o.m32798h(str, "msg");
        Log.w("Bugsnag", str);
    }

    /* renamed from: i */
    public Object mo1134i() {
        return new TreeSet();
    }

    /* renamed from: j */
    public int mo21047j() {
        return R.string.shipping_zip_code_hint;
    }

    /* renamed from: k */
    public C6051s mo4161k(C6051s sVar, C7114e eVar) {
        byte[] bArr;
        ByteBuffer buffer = ((GifDrawable) sVar.get()).getBuffer();
        AtomicReference<byte[]> atomicReference = C4410a.f9682a;
        C4410a.C4412b bVar = (buffer.isReadOnly() || !buffer.hasArray()) ? null : new C4410a.C4412b(buffer.array(), buffer.arrayOffset(), buffer.limit());
        if (bVar != null && bVar.f9685a == 0 && bVar.f9686b == bVar.f9687c.length) {
            bArr = buffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer = buffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer.limit()];
            ByteBuffer byteBuffer = (ByteBuffer) asReadOnlyBuffer.position(0);
            asReadOnlyBuffer.get(bArr2);
            bArr = bArr2;
        }
        return new C7745b(bArr);
    }

    /* renamed from: l */
    public int mo21048l() {
        return 2;
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Long.valueOf(C14720l8.f32933c.zza().mo50686b());
    }

    /* renamed from: d */
    public void mo16604d(String str) {
        C19383o.m32798h(str, "msg");
        Log.d("Bugsnag", str);
    }

    /* renamed from: e */
    public void mo16605e(String str) {
        C19383o.m32798h(str, "msg");
        Log.e("Bugsnag", str);
    }
}
