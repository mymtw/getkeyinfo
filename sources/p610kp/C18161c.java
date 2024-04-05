package p610kp;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.C0326j;
import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import androidx.room.C3243m;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.p327ui.listing.p329ui.toppanel.favoriteinfo.confetti.ConfettiView;
import com.facebook.internal.FeatureManager;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19986l;
import p260v0.C8184a;
import p453tf.C13418j;
import p474wd.C13823a;
import p474wd.C13824b;
import p561eo.C17730c;
import p577go.C17805c;
import p617lo.C18209a;
import p699vn.C18666a;
import p699vn.C18667b;
import p707wn.C18753a;

/* renamed from: kp.c */
public final class C18161c implements C18209a, C19986l, FeatureManager.C12256a {

    /* renamed from: A */
    public static final int[] f39658A = {16843296};

    /* renamed from: B */
    public static final int[] f39659B = {16842964, 16843191, 16843192, 16843193, 16843194, 16843237, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.cornerRadius, R.attr.elevation, R.attr.icon, R.attr.iconGravity, R.attr.iconPadding, R.attr.iconSize, R.attr.iconTint, R.attr.iconTintMode, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth};

    /* renamed from: C */
    public static final int[] f39660C = {R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection};

    /* renamed from: D */
    public static final int[] f39661D = {16843277, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.nestedScrollable, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle};

    /* renamed from: E */
    public static final int[] f39662E = {16843191, 16843192, 16843193, 16843194, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor};

    /* renamed from: F */
    public static final int[] f39663F = {16843237, R.attr.cardForegroundColor, R.attr.checkedIcon, R.attr.checkedIconMargin, R.attr.checkedIconSize, R.attr.checkedIconTint, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.state_dragged, R.attr.strokeColor, R.attr.strokeWidth};

    /* renamed from: G */
    public static final int[] f39664G = {R.attr.buttonTint, R.attr.useMaterialThemeColors};

    /* renamed from: H */
    public static final int[] f39665H = {R.attr.dividerColor, R.attr.dividerInsetEnd, R.attr.dividerInsetStart, R.attr.dividerThickness};

    /* renamed from: I */
    public static final int[] f39666I = {R.attr.buttonTint, R.attr.useMaterialThemeColors};

    /* renamed from: J */
    public static final int[] f39667J = {R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: K */
    public static final int[] f39668K = {16843958, 16844159, R.attr.lineHeight};

    /* renamed from: L */
    public static final int[] f39669L = {16842804, 16844159, R.attr.lineHeight};

    /* renamed from: M */
    public static final int[] f39670M = {R.attr.clockIcon, R.attr.keyboardIcon};

    /* renamed from: N */
    public static final int[] f39671N = {R.attr.navigationIconTint, R.attr.subtitleCentered, R.attr.titleCentered};

    /* renamed from: O */
    public static final int[] f39672O = {16843093, 16843097, 16843173, R.attr.marginHorizontal, R.attr.shapeAppearance};

    /* renamed from: P */
    public static final int[] f39673P = {R.attr.backgroundTint, R.attr.elevation, R.attr.itemActiveIndicatorStyle, R.attr.itemBackground, R.attr.itemIconSize, R.attr.itemIconTint, R.attr.itemPaddingBottom, R.attr.itemPaddingTop, R.attr.itemRippleColor, R.attr.itemTextAppearanceActive, R.attr.itemTextAppearanceInactive, R.attr.itemTextColor, R.attr.labelVisibilityMode, R.attr.menu};

    /* renamed from: Q */
    public static final int[] f39674Q = {R.attr.headerLayout, R.attr.itemMinHeight, R.attr.menuGravity};

    /* renamed from: R */
    public static final int[] f39675R = {16842931, 16842964, 16842973, 16843039, R.attr.bottomInsetScrimEnabled, R.attr.dividerInsetEnd, R.attr.dividerInsetStart, R.attr.drawerLayoutCornerSize, R.attr.elevation, R.attr.headerLayout, R.attr.itemBackground, R.attr.itemHorizontalPadding, R.attr.itemIconPadding, R.attr.itemIconSize, R.attr.itemIconTint, R.attr.itemMaxLines, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemShapeFillColor, R.attr.itemShapeInsetBottom, R.attr.itemShapeInsetEnd, R.attr.itemShapeInsetStart, R.attr.itemShapeInsetTop, R.attr.itemTextAppearance, R.attr.itemTextColor, R.attr.itemVerticalPadding, R.attr.menu, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.subheaderColor, R.attr.subheaderInsetEnd, R.attr.subheaderInsetStart, R.attr.subheaderTextAppearance, R.attr.topInsetScrimEnabled};

    /* renamed from: S */
    public static final int[] f39676S = {R.attr.materialCircleRadius};

    /* renamed from: T */
    public static final int[] f39677T = {R.attr.minSeparation, R.attr.values};

    /* renamed from: V */
    public static final int[] f39678V = {R.attr.insetForeground};

    /* renamed from: W */
    public static final int[] f39679W = {R.attr.behavior_overlapTop};

    /* renamed from: X */
    public static final int[] f39680X = {R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight};

    /* renamed from: Y */
    public static final int[] f39681Y = {R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingEnd, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingStart, R.attr.contentPaddingTop, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth};

    /* renamed from: Z */
    public static final int[] f39682Z = {16842766, 16842788, 16843078, 16843486, 16843487, R.attr.haloColor, R.attr.haloRadius, R.attr.labelBehavior, R.attr.labelStyle, R.attr.thumbColor, R.attr.thumbElevation, R.attr.thumbRadius, R.attr.thumbStrokeColor, R.attr.thumbStrokeWidth, R.attr.tickColor, R.attr.tickColorActive, R.attr.tickColorInactive, R.attr.tickVisible, R.attr.trackColor, R.attr.trackColorActive, R.attr.trackColorInactive, R.attr.trackHeight};

    /* renamed from: b */
    public static final int[] f39683b = {R.attr.brandId, R.attr.interceptId, R.attr.zoneId};

    /* renamed from: c */
    public static final int[] f39684c = {16842964, 16843919, 16844096, R.attr.elevation, R.attr.expanded, R.attr.liftOnScroll, R.attr.liftOnScrollTargetViewId, R.attr.statusBarForeground};

    /* renamed from: d */
    public static final int[] f39685d = {R.attr.layout_scrollEffect, R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator};

    /* renamed from: e */
    public static final int[] f39686e = {R.attr.backgroundColor, R.attr.badgeGravity, R.attr.badgeRadius, R.attr.badgeTextColor, R.attr.badgeWidePadding, R.attr.badgeWithTextRadius, R.attr.horizontalOffset, R.attr.horizontalOffsetWithText, R.attr.maxCharacterCount, R.attr.number, R.attr.verticalOffset, R.attr.verticalOffsetWithText};

    /* renamed from: f */
    public static final int[] f39687f = {16843065, R.attr.hideAnimationBehavior, R.attr.indicatorColor, R.attr.minHideDelay, R.attr.showAnimationBehavior, R.attr.showDelay, R.attr.trackColor, R.attr.trackCornerRadius, R.attr.trackThickness};

    /* renamed from: g */
    public static final int[] f39688g = {R.attr.backgroundTint, R.attr.elevation, R.attr.fabAlignmentMode, R.attr.fabAnimationMode, R.attr.fabCradleMargin, R.attr.fabCradleRoundedCornerRadius, R.attr.fabCradleVerticalOffset, R.attr.hideOnScroll, R.attr.navigationIconTint, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets};

    /* renamed from: h */
    public static final int[] f39689h = {16843072, R.attr.itemHorizontalTranslationEnabled};

    /* renamed from: i */
    public static final int[] f39690i = {16843039, 16843040, 16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: j */
    public static final int[] f39691j = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};

    /* renamed from: j1 */
    public static final int[] f39692j1 = {R.attr.useMaterialThemeColors};

    /* renamed from: k */
    public static final int[] f39693k = {16842804, 16842901, 16842904, 16842923, 16843039, 16843087, 16843237, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding};

    /* renamed from: k0 */
    public static final int[] f39694k0 = {16843039, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth};

    /* renamed from: k1 */
    public static final int[] f39695k1 = {16842754, 16842994, 16843087};

    /* renamed from: l */
    public static final int[] f39696l = {R.attr.checkedChip, R.attr.chipSpacing, R.attr.chipSpacingHorizontal, R.attr.chipSpacingVertical, R.attr.selectionRequired, R.attr.singleLine, R.attr.singleSelection};

    /* renamed from: l1 */
    public static final int[] f39697l1 = {R.attr.tabBackground, R.attr.tabContentStart, R.attr.tabGravity, R.attr.tabIconTint, R.attr.tabIconTintMode, R.attr.tabIndicator, R.attr.tabIndicatorAnimationDuration, R.attr.tabIndicatorAnimationMode, R.attr.tabIndicatorColor, R.attr.tabIndicatorFullWidth, R.attr.tabIndicatorGravity, R.attr.tabIndicatorHeight, R.attr.tabInlineLabel, R.attr.tabMaxWidth, R.attr.tabMinWidth, R.attr.tabMode, R.attr.tabPadding, R.attr.tabPaddingBottom, R.attr.tabPaddingEnd, R.attr.tabPaddingStart, R.attr.tabPaddingTop, R.attr.tabRippleColor, R.attr.tabSelectedTextColor, R.attr.tabTextAppearance, R.attr.tabTextColor, R.attr.tabUnboundedRipple};

    /* renamed from: m */
    public static final int[] f39698m = {R.attr.indicatorDirectionCircular, R.attr.indicatorInset, R.attr.indicatorSize};

    /* renamed from: m1 */
    public static final int[] f39699m1 = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};

    /* renamed from: n */
    public static final int[] f39700n = {R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor};

    /* renamed from: n1 */
    public static final int[] f39701n1 = {R.attr.textInputLayoutFocusedRectEnabled};

    /* renamed from: o */
    public static final int[] f39702o = {R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize};

    /* renamed from: o1 */
    public static final int[] f39703o1 = {16842766, 16842906, 16843039, 16843071, 16843088, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMode, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};

    /* renamed from: p */
    public static final int[] f39704p = {R.attr.collapsedTitleGravity, R.attr.collapsedTitleTextAppearance, R.attr.collapsedTitleTextColor, R.attr.contentScrim, R.attr.expandedTitleGravity, R.attr.expandedTitleMargin, R.attr.expandedTitleMarginBottom, R.attr.expandedTitleMarginEnd, R.attr.expandedTitleMarginStart, R.attr.expandedTitleMarginTop, R.attr.expandedTitleTextAppearance, R.attr.expandedTitleTextColor, R.attr.extraMultilineHeightEnabled, R.attr.forceApplySystemWindowInsetTop, R.attr.maxLines, R.attr.scrimAnimationDuration, R.attr.scrimVisibleHeightTrigger, R.attr.statusBarScrim, R.attr.title, R.attr.titleCollapseMode, R.attr.titleEnabled, R.attr.titlePositionInterpolator, R.attr.toolbarId};

    /* renamed from: p1 */
    public static final int[] f39705p1 = {16842804, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};

    /* renamed from: q */
    public static final int[] f39706q = {R.attr.layout_collapseMode, R.attr.layout_collapseParallaxMultiplier};

    /* renamed from: q1 */
    public static final int[] f39707q1 = {16842804, 16842904, 16842965, 16842998, 16843071, 16843072, 16843087, R.attr.backgroundTint};

    /* renamed from: r */
    public static final int[] f39708r = {R.attr.collapsedSize, R.attr.elevation, R.attr.extendMotionSpec, R.attr.hideMotionSpec, R.attr.showMotionSpec, R.attr.shrinkMotionSpec};

    /* renamed from: r1 */
    public static final /* synthetic */ int f39709r1 = 0;

    /* renamed from: s */
    public static final int[] f39710s = {R.attr.behavior_autoHide, R.attr.behavior_autoShrink};

    /* renamed from: s1 */
    public static final int[] f39711s1 = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: t */
    public static final int[] f39712t = {16842766, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.borderWidth, R.attr.elevation, R.attr.ensureMinTouchTargetSize, R.attr.fabCustomSize, R.attr.fabSize, R.attr.hideMotionSpec, R.attr.hoveredFocusedTranslationZ, R.attr.maxImageSize, R.attr.pressedTranslationZ, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.useCompatPadding};

    /* renamed from: t1 */
    public static final int[] f39713t1 = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: u */
    public static final int[] f39714u = {R.attr.behavior_autoHide};

    /* renamed from: u1 */
    public static final int[] f39715u1 = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    /* renamed from: v */
    public static final int[] f39716v = {R.attr.horizontalSpacing, R.attr.itemSpacing, R.attr.lineSpacing, R.attr.verticalSpacing, R.attr.verticallyCenterRow};

    /* renamed from: v1 */
    public static final C18161c f39717v1 = new C18161c();

    /* renamed from: w */
    public static final int[] f39718w = {16843017, 16843264, R.attr.foregroundInsidePadding};

    /* renamed from: w1 */
    public static final int[] f39719w1 = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: x */
    public static final int[] f39720x = {R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets};

    /* renamed from: y */
    public static final int[] f39721y = {R.attr.indeterminateAnimationType, R.attr.indicatorDirectionLinear};

    /* renamed from: z */
    public static final int[] f39722z = {R.attr.backgroundInsetBottom, R.attr.backgroundInsetEnd, R.attr.backgroundInsetStart, R.attr.backgroundInsetTop};

    public /* synthetic */ C18161c() {
    }

    /* renamed from: c */
    public static int m30659c(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int read = inputStream.read(bArr, 0 + i, length - i);
            if (read < 0) {
                break;
            }
            i += read;
        }
        return i;
    }

    /* renamed from: d */
    public static void m30660d(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & UnsignedInteger.INT_MASK;
            long j3 = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = ((((long) iArr[1]) & UnsignedInteger.INT_MASK) - j2) + (j3 >> 32);
            iArr[1] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (((long) iArr[2]) & UnsignedInteger.INT_MASK);
                iArr[2] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = (((long) iArr[3]) & UnsignedInteger.INT_MASK) + j2 + j5;
            iArr[3] = (int) j7;
            long j8 = (UnsignedInteger.INT_MASK & ((long) iArr[4])) + j2 + (j7 >> 32);
            iArr[4] = (int) j8;
            j = j8 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && C2606m.m6159y(12, iArr, 5) != 0) || (iArr[11] == -1 && C2606m.m6121P(12, iArr, f39711s1))) {
            m30662f(iArr);
        }
    }

    /* renamed from: e */
    public static void m30661e(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[24];
        C3039b.m7140I(iArr, iArr3);
        while (true) {
            m30664h(iArr3, iArr2);
            i--;
            if (i > 0) {
                C3039b.m7140I(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public static void m30662f(int[] iArr) {
        long j = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + 1;
        iArr[0] = (int) j;
        long j2 = ((((long) iArr[1]) & UnsignedInteger.INT_MASK) - 1) + (j >> 32);
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[2]) & UnsignedInteger.INT_MASK);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = (((long) iArr[3]) & UnsignedInteger.INT_MASK) + 1 + j3;
        iArr[3] = (int) j5;
        long j6 = (UnsignedInteger.INT_MASK & ((long) iArr[4])) + 1 + (j5 >> 32);
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            C2606m.m6159y(12, iArr, 5);
        }
    }

    /* renamed from: g */
    public static void m30663g(ConfettiView confettiView) {
        ConfettiView confettiView2 = confettiView;
        C19383o.m32797g(confettiView2, "confettiView");
        ViewExtensions.m12869m(confettiView);
        AnimatorSet animatorSet = new AnimatorSet();
        for (ImageView next : confettiView.getSuccessConfetti()) {
            Pair<Float, Float> centerPoint = confettiView2.centerPoint(next);
            Pair<Float, Float> randomPoint = confettiView2.randomPoint(next);
            next.setX(centerPoint.getFirst().floatValue());
            next.setY(centerPoint.getSecond().floatValue());
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(next, "translationX", new float[]{randomPoint.getFirst().floatValue()});
            ofFloat.setDuration(1200);
            ofFloat.setInterpolator(new DecelerateInterpolator(0.6f));
            ofFloat.setStartDelay(0);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(next, "translationY", new float[]{randomPoint.getSecond().floatValue()});
            ofFloat2.setDuration(1200);
            ofFloat2.setInterpolator(new DecelerateInterpolator(0.6f));
            ofFloat2.setStartDelay(0);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(next, "alpha", new float[]{1.0f});
            ofFloat3.setDuration(200);
            ofFloat3.setStartDelay(0);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(next, "alpha", new float[]{0.0f});
            ofFloat4.setDuration(400);
            ofFloat4.setStartDelay(500);
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4);
        }
        animatorSet.start();
        ImageView successRipple = confettiView.getSuccessRipple();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(2.0f);
        Paint paint = shapeDrawable.getPaint();
        Context context = successRipple.getContext();
        Object obj = C8184a.f17966a;
        paint.setColor(C8184a.C8188d.m16468a(context, R.color.sixty_percent_white));
        shapeDrawable.setIntrinsicWidth(40);
        shapeDrawable.setIntrinsicHeight(40);
        successRipple.setImageDrawable(shapeDrawable);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{2.0f, 4.0f});
        ofFloat5.setDuration(1200);
        ofFloat5.addUpdateListener(new C13823a(shapeDrawable));
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(new float[]{0.5f, 1.6f});
        ofFloat6.setDuration(1200);
        ofFloat6.addUpdateListener(new C13824b(shapeDrawable));
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(successRipple, "scaleX", new float[]{0.5f, 1.6f});
        ofFloat7.setDuration(1200);
        ofFloat7.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(successRipple, "scaleY", new float[]{0.5f, 1.6f});
        ofFloat8.setDuration(1200);
        ofFloat8.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(successRipple, "alpha", new float[]{1.0f});
        ofFloat9.setDuration(200);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(successRipple, "alpha", new float[]{0.0f});
        ofFloat10.setDuration(400);
        ofFloat10.setStartDelay(500);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat7).with(ofFloat8).with(ofFloat9).with(ofFloat5).with(ofFloat6).with(ofFloat10);
        animatorSet2.start();
    }

    /* renamed from: h */
    public static void m30664h(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[16]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr[17]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr[18]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr[19]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr[20]) & UnsignedInteger.INT_MASK;
        long j6 = ((long) iArr[21]) & UnsignedInteger.INT_MASK;
        long j7 = j4;
        long j8 = ((long) iArr[22]) & UnsignedInteger.INT_MASK;
        long j9 = j3;
        long j10 = ((long) iArr[23]) & UnsignedInteger.INT_MASK;
        long j11 = j;
        long j12 = ((((long) iArr[12]) & UnsignedInteger.INT_MASK) + j5) - 1;
        long j13 = j5;
        long j14 = (((long) iArr[13]) & UnsignedInteger.INT_MASK) + j8;
        long j15 = (((long) iArr[14]) & UnsignedInteger.INT_MASK) + j8 + j10;
        long j16 = (((long) iArr[15]) & UnsignedInteger.INT_MASK) + j10;
        long j17 = j2 + j6;
        long j18 = j6 - j10;
        long j19 = j12 + j18;
        long j20 = j8 - j10;
        long j21 = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + j19 + 0;
        iArr3[0] = (int) j21;
        long j22 = (((((long) iArr[1]) & UnsignedInteger.INT_MASK) + j10) - j12) + j14 + (j21 >> 32);
        iArr3[1] = (int) j22;
        long j23 = (((((long) iArr[2]) & UnsignedInteger.INT_MASK) - j6) - j14) + j15 + (j22 >> 32);
        iArr3[2] = (int) j23;
        long j24 = ((((long) iArr[3]) & UnsignedInteger.INT_MASK) - j15) + j16 + j19 + (j23 >> 32);
        iArr3[3] = (int) j24;
        long j25 = (((((((long) iArr[4]) & UnsignedInteger.INT_MASK) + j11) + j6) + j14) - j16) + j19 + (j24 >> 32);
        iArr3[4] = (int) j25;
        long j26 = ((((long) iArr[5]) & UnsignedInteger.INT_MASK) - j11) + j14 + j15 + j17 + (j25 >> 32);
        iArr3[5] = (int) j26;
        long j27 = (((((long) iArr[6]) & UnsignedInteger.INT_MASK) + j9) - j2) + j15 + j16 + (j26 >> 32);
        iArr3[6] = (int) j27;
        long j28 = ((((((long) iArr[7]) & UnsignedInteger.INT_MASK) + j11) + j7) - j9) + j16 + (j27 >> 32);
        iArr3[7] = (int) j28;
        long j29 = (((((((long) iArr[8]) & UnsignedInteger.INT_MASK) + j11) + j2) + j13) - j7) + (j28 >> 32);
        iArr3[8] = (int) j29;
        long j30 = (((((long) iArr[9]) & UnsignedInteger.INT_MASK) + j9) - j13) + j17 + (j29 >> 32);
        iArr3[9] = (int) j30;
        long j31 = ((((((long) iArr[10]) & UnsignedInteger.INT_MASK) + j9) + j7) - j18) + j20 + (j30 >> 32);
        iArr3[10] = (int) j31;
        long j32 = ((((((long) iArr[11]) & UnsignedInteger.INT_MASK) + j7) + j13) - j20) + (j31 >> 32);
        iArr3[11] = (int) j32;
        m30660d((int) ((j32 >> 32) + 1), iArr3);
    }

    /* renamed from: i */
    public static void m30665i(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[24];
        C3039b.m7139H(iArr, iArr2, iArr4);
        m30664h(iArr4, iArr3);
    }

    /* renamed from: j */
    public static void m30666j(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[24];
        C3039b.m7140I(iArr, iArr3);
        m30664h(iArr3, iArr2);
    }

    /* renamed from: k */
    public static void m30667k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C2606m.m6125T(12, iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & UnsignedInteger.INT_MASK) - 1;
            iArr3[0] = (int) j;
            long j2 = (((long) iArr3[1]) & UnsignedInteger.INT_MASK) + 1 + (j >> 32);
            iArr3[1] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr3[2]) & UnsignedInteger.INT_MASK);
                iArr3[2] = (int) j4;
                j3 = j4 >> 32;
            }
            long j5 = ((((long) iArr3[3]) & UnsignedInteger.INT_MASK) - 1) + j3;
            iArr3[3] = (int) j5;
            long j6 = ((UnsignedInteger.INT_MASK & ((long) iArr3[4])) - 1) + (j5 >> 32);
            iArr3[4] = (int) j6;
            if ((j6 >> 32) != 0) {
                C2606m.m6134b(12, iArr3, 5);
            }
        }
    }

    /* renamed from: l */
    public static void m30668l(C18667b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                bVar.mo70175b(i5, i4);
                bVar.mo70175b(i5, i6);
                bVar.mo70175b(i4, i5);
                bVar.mo70175b(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        bVar.mo70175b(i7, i7);
        int i8 = i7 + 1;
        bVar.mo70175b(i8, i7);
        bVar.mo70175b(i7, i8);
        int i9 = i + i2;
        bVar.mo70175b(i9, i7);
        bVar.mo70175b(i9, i8);
        bVar.mo70175b(i9, i9 - 1);
    }

    /* renamed from: m */
    public static C18666a m30669m(C18666a aVar, int i, int i2) {
        C18753a aVar2;
        int i3 = aVar.f41277c / i2;
        if (i2 == 4) {
            aVar2 = C18753a.f41527j;
        } else if (i2 == 6) {
            aVar2 = C18753a.f41526i;
        } else if (i2 == 8) {
            aVar2 = C18753a.f41529l;
        } else if (i2 == 10) {
            aVar2 = C18753a.f41525h;
        } else if (i2 == 12) {
            aVar2 = C18753a.f41524g;
        } else {
            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
        }
        C3243m mVar = new C3243m(aVar2);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = aVar.f41277c / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= aVar.mo70170d((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        mVar.mo12040a(i4 - i3, iArr);
        C18666a aVar3 = new C18666a();
        aVar3.mo70167b(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            aVar3.mo70167b(iArr[i9], i2);
        }
        return aVar3;
    }

    /* renamed from: o */
    public static long m30670o(C17730c cVar) {
        MediaFormat h = cVar.f38541a.mo69606h(cVar.f38547g);
        if (!h.containsKey("durationUs")) {
            return -1;
        }
        long j = h.getLong("durationUs");
        cVar.f38541a.getSelection().getClass();
        return Math.min(j, Long.MAX_VALUE) - Math.max(0, 0);
    }

    /* renamed from: p */
    public static C18666a m30671p(int i, C18666a aVar) {
        C18666a aVar2 = new C18666a();
        int i2 = aVar.f41277c;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || aVar.mo70170d(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                aVar2.mo70167b(i8, i);
            } else if (i8 == 0) {
                aVar2.mo70167b(i5 | 1, i);
            } else {
                aVar2.mo70167b(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return aVar2;
    }

    /* renamed from: a */
    public List mo69706a(String str) {
        C19383o.m32797g(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            C19383o.m32796f(allByName, "InetAddress.getAllByName(hostname)");
            return C19318k.m32620l1(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException(C0326j.m864i("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    /* renamed from: b */
    public void mo60324b(C17805c cVar, C17805c cVar2) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2 = cVar.f38707b;
        if (byteBuffer2 == null || (byteBuffer = cVar2.f38707b) == null) {
            throw new IllegalArgumentException("Source or target frame doesn't have a buffer, cannot process it!");
        }
        byteBuffer.put(byteBuffer2);
        cVar2.f38707b.flip();
        MediaCodec.BufferInfo bufferInfo = cVar2.f38708c;
        bufferInfo.offset = 0;
        MediaCodec.BufferInfo bufferInfo2 = cVar.f38708c;
        bufferInfo.size = bufferInfo2.size;
        bufferInfo.presentationTimeUs = bufferInfo2.presentationTimeUs;
        bufferInfo.flags = bufferInfo2.flags;
    }

    /* renamed from: n */
    public void mo20n(boolean z) {
        if (z) {
            C13418j.f29395o = true;
        }
    }

    public void release() {
    }

    public /* synthetic */ C18161c(int i) {
    }
}
