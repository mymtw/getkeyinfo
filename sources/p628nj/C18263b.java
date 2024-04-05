package p628nj;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0730d0;
import androidx.compose.foundation.layout.C0736g0;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1514d;
import androidx.compose.p015ui.graphics.C1521g;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.graphics.C1540p0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.C1604x;
import androidx.compose.p015ui.graphics.colorspace.C1504b;
import androidx.compose.p015ui.graphics.colorspace.C1505c;
import androidx.compose.p015ui.graphics.colorspace.C1510g;
import androidx.compose.p015ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p015ui.graphics.colorspace.Rgb;
import androidx.compose.p015ui.layout.C1682g0;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.semantics.C1904k;
import androidx.compose.p015ui.semantics.C1905l;
import androidx.compose.runtime.C1296b;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1321f0;
import androidx.compose.runtime.C1416u0;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.R;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ReceiptReview;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.Review;
import com.etsy.android.lib.models.ReviewResponse;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.etsy.android.lib.models.apiv3.listing.ImageKey;
import com.etsy.android.lib.models.apiv3.listing.Video;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.conversation.details.C9529j;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.shippingaddress.ChangeShippingAddressFragment;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.C11870b;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.uikit.nav.transactions.TransactionViewModel;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.google.android.gms.internal.measurement.C14720l8;
import com.google.android.gms.measurement.internal.C14941c2;
import com.google.android.gms.measurement.internal.C14950d2;
import com.google.android.gms.measurement.internal.C14959e2;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.gson.internal.C16790g;
import com.google.gson.internal.LinkedTreeMap;
import com.google.protobuf.ByteString;
import com.squareup.moshi.C17414y;
import dagger.android.C17550a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.C19341d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.internal.C19379k;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.sequences.C19431g;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C19457k;
import kotlin.text.Regex;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.C19698g0;
import kotlinx.coroutines.C19744j0;
import kotlinx.coroutines.C19753l;
import p081d6.C6662a;
import p161k6.C7198a;
import p161k6.C7199b;
import p165l0.C7211a;
import p179m5.C7336h;
import p219r.C7734e;
import p223r5.C7756f;
import p223r5.C7760h;
import p223r5.C7770q;
import p223r5.C7774u;
import p223r5.C7776w;
import p244t5.C8005o1;
import p244t5.C8027v1;
import p267v7.C8212a;
import p267v7.C8217e;
import p276w7.C8260c;
import p297z.C8406a;
import p340ea.C12658b;
import p340ea.C12673n;
import p346fa.C12703a;
import p354gc.C12775i;
import p425q9.C13265p;
import p425q9.C13267q;
import p456ua.C13461f;
import p464va.C13552e;
import p605kk.C18116a;
import p605kk.C18123g;
import p634np.C18290b;
import p753kq.C19846a;
import p753kq.C19857l;
import p764pq.C20057i;
import p772tq.C20203a;

/* renamed from: nj.b */
public class C18263b implements C18290b, C17550a, C14941c2, C16790g, C18116a {

    /* renamed from: A */
    public static final int[] f40037A = {16843126, 16843465, R.attr.overlapAnchor};

    /* renamed from: B */
    public static final int[] f40038B = {R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle};

    /* renamed from: C */
    public static final int[] f40039C = {16842970, 16843039, 16843296, 16843364, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.voiceIcon};

    /* renamed from: D */
    public static final int[] f40040D = {16842930, 16843126, 16843131, 16843362, R.attr.popupTheme};

    /* renamed from: E */
    public static final int[] f40041E = {16843044, 16843045, 16843074, R.attr.showText, R.attr.splitTrack, R.attr.switchMinWidth, R.attr.switchPadding, R.attr.switchTextAppearance, R.attr.thumbTextPadding, R.attr.thumbTint, R.attr.thumbTintMode, R.attr.track, R.attr.trackTint, R.attr.trackTintMode};

    /* renamed from: F */
    public static final int[] f40042F = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};

    /* renamed from: G */
    public static final int[] f40043G = {16842927, 16843072, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor};

    /* renamed from: H */
    public static final int[] f40044H = {16842752, 16842970, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme};

    /* renamed from: I */
    public static final int[] f40045I = {16842964, R.attr.backgroundTint, R.attr.backgroundTintMode};

    /* renamed from: J */
    public static final int[] f40046J = {16842960, 16842994, 16842995};

    /* renamed from: K */
    public static final int[] f40047K = {16843033, 16843037, 16843041};

    /* renamed from: L */
    public static final int[] f40048L = {16842804, 16842901, 16842903, 16842904, 16842906, 16842923, 16842927, 16843039, 16843071, 16843087, 16843088, 16843091, 16843092, 16843094, 16843101, 16843117, 16843118, 16843119, 16843120, 16843121, 16843287, 16843288, 16843296, 16843660, 16843692, 16843958, 16844159};

    /* renamed from: M */
    public static final int[] f40049M = {16842931, 16842964, 16842965, 16842966, 16842967, 16842968, 16842969, 16842970, 16842972, 16842981, 16842996, 16842997, 16842998, 16842999, 16843000, 16843001, 16843002, 16843017, 16843071, 16843072, 16843137, 16843379, 16843551, 16843699, 16843700, 16843701, 16843702, 16843840, 16843848, 16843883, 16843884, 16844091, 16844092, 16844093, 16844094, R.attr.ignoreLayoutWidthAndHeight};

    /* renamed from: N */
    public static final int[] f40050N = {16842986, 16842987, 16843506};

    /* renamed from: O */
    public static C12703a f40051O;

    /* renamed from: P */
    public static C12673n f40052P;

    /* renamed from: Q */
    public static C12658b f40053Q;

    /* renamed from: R */
    public static C13267q f40054R;

    /* renamed from: S */
    public static C13461f f40055S;

    /* renamed from: T */
    public static C8591a f40056T;

    /* renamed from: V */
    public static C13265p f40057V;

    /* renamed from: W */
    public static C13552e f40058W;

    /* renamed from: X */
    public static C17414y f40059X;

    /* renamed from: Y */
    public static final /* synthetic */ C18263b f40060Y = new C18263b();

    /* renamed from: Z */
    public static final int[] f40061Z = {16842804, 16842904, R.attr.iconColor, R.attr.thumbColor};

    /* renamed from: b */
    public static volatile ClassLoader f40062b;

    /* renamed from: c */
    public static volatile Thread f40063c;

    /* renamed from: d */
    public static C1604x f40064d;

    /* renamed from: e */
    public static C1537o f40065e;

    /* renamed from: f */
    public static C8406a f40066f;

    /* renamed from: g */
    public static final int[] f40067g = {R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle};

    /* renamed from: h */
    public static final int[] f40068h = {16842931};

    /* renamed from: i */
    public static final int[] f40069i = {16843071};

    /* renamed from: j */
    public static final int[] f40070j = {R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};

    /* renamed from: j1 */
    public static final /* synthetic */ C18263b f40071j1 = new C18263b();

    /* renamed from: k */
    public static final int[] f40072k = {R.attr.expandActivityOverflowButtonDrawable, R.attr.initialActivityCount};

    /* renamed from: k0 */
    public static final int[] f40073k0 = {16842804, 16842904, R.attr.iconColor, R.attr.textPadding};

    /* renamed from: k1 */
    public static final Object[] f40074k1 = new Object[0];

    /* renamed from: l */
    public static final int[] f40075l = {16842994, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout};

    /* renamed from: m */
    public static final int[] f40076m = {16843033, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};

    /* renamed from: n */
    public static final int[] f40077n = {16843074, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode};

    /* renamed from: o */
    public static final int[] f40078o = {16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667};

    /* renamed from: p */
    public static final int[] f40079p = {16842804, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.emojiCompatEnabled, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale};

    /* renamed from: q */
    public static final int[] f40080q = {16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseContentDescription, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeTheme, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle};

    /* renamed from: r */
    public static final int[] f40081r = {R.attr.allowStacking};

    /* renamed from: s */
    public static final int[] f40082s = {16843016, R.attr.checkMarkCompat, R.attr.checkMarkTint, R.attr.checkMarkTintMode};

    /* renamed from: t */
    public static final int[] f40083t = {16843015, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode};

    /* renamed from: u */
    public static final int[] f40084u = {R.attr.arrowHeadLength, R.attr.arrowShaftLength, R.attr.barLength, R.attr.color, R.attr.drawableSize, R.attr.gapBetweenBars, R.attr.spinBars, R.attr.thickness};

    /* renamed from: v */
    public static final int[] f40085v = {16842927, 16842948, 16843046, 16843047, 16843048, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};

    /* renamed from: w */
    public static final int[] f40086w = {16843436, 16843437};

    /* renamed from: x */
    public static final int[] f40087x = {16842766, 16842960, 16843156, 16843230, 16843231, 16843232};

    /* renamed from: y */
    public static final int[] f40088y = {16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};

    /* renamed from: z */
    public static final int[] f40089z = {16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.preserveIconSpacing, R.attr.subMenuArrow};

    /* renamed from: A */
    public static final ComposableLambdaImpl m30805A(C1302d dVar, int i, Lambda lambda) {
        ComposableLambdaImpl composableLambdaImpl;
        C19383o.m32797g(dVar, "composer");
        dVar.mo5465u(i);
        Object v = dVar.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            composableLambdaImpl = new ComposableLambdaImpl(i, true);
            dVar.mo5454o(composableLambdaImpl);
        } else if (v != null) {
            composableLambdaImpl = (ComposableLambdaImpl) v;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
        }
        composableLambdaImpl.mo5862t(lambda);
        dVar.mo5406H();
        return composableLambdaImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008f  */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.Thread m30806A0() {
        /*
            java.lang.Class<nj.b> r0 = p628nj.C18263b.class
            monitor-enter(r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x009d }
            java.lang.Thread r1 = r1.getThread()     // Catch:{ all -> 0x009d }
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch:{ all -> 0x009d }
            r2 = 0
            if (r1 != 0) goto L_0x0014
            monitor-exit(r0)
            return r2
        L_0x0014:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch:{ all -> 0x009d }
            int r4 = r1.activeGroupCount()     // Catch:{ SecurityException -> 0x0074 }
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch:{ SecurityException -> 0x0074 }
            r1.enumerate(r5)     // Catch:{ SecurityException -> 0x0074 }
            r6 = 0
            r7 = r6
        L_0x0022:
            if (r7 >= r4) goto L_0x0036
            r8 = r5[r7]     // Catch:{ SecurityException -> 0x0074 }
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch:{ SecurityException -> 0x0074 }
            boolean r9 = r9.equals(r10)     // Catch:{ SecurityException -> 0x0074 }
            if (r9 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0036:
            r8 = r2
        L_0x0037:
            if (r8 != 0) goto L_0x0040
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x0074 }
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch:{ SecurityException -> 0x0074 }
        L_0x0040:
            int r1 = r8.activeCount()     // Catch:{ SecurityException -> 0x0074 }
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch:{ SecurityException -> 0x0074 }
            r8.enumerate(r4)     // Catch:{ SecurityException -> 0x0074 }
        L_0x0049:
            if (r6 >= r1) goto L_0x005d
            r5 = r4[r6]     // Catch:{ SecurityException -> 0x0074 }
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch:{ SecurityException -> 0x0074 }
            boolean r7 = r7.equals(r9)     // Catch:{ SecurityException -> 0x0074 }
            if (r7 == 0) goto L_0x005a
            goto L_0x005e
        L_0x005a:
            int r6 = r6 + 1
            goto L_0x0049
        L_0x005d:
            r5 = r2
        L_0x005e:
            if (r5 != 0) goto L_0x0098
            nj.a r1 = new nj.a     // Catch:{ SecurityException -> 0x006e }
            r1.<init>(r8)     // Catch:{ SecurityException -> 0x006e }
            r1.setContextClassLoader(r2)     // Catch:{ SecurityException -> 0x006c }
            r1.start()     // Catch:{ SecurityException -> 0x006c }
            goto L_0x0097
        L_0x006c:
            r2 = move-exception
            goto L_0x0078
        L_0x006e:
            r1 = move-exception
            r2 = r1
            r1 = r5
            goto L_0x0078
        L_0x0072:
            r1 = move-exception
            goto L_0x009b
        L_0x0074:
            r1 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
        L_0x0078:
            java.lang.String r4 = "DynamiteLoaderV2CL"
            java.lang.String r5 = "Failed to enumerate thread/threadgroup "
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0072 }
            int r6 = r2.length()     // Catch:{ all -> 0x0072 }
            if (r6 == 0) goto L_0x008f
            java.lang.String r2 = r5.concat(r2)     // Catch:{ all -> 0x0072 }
            goto L_0x0094
        L_0x008f:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0072 }
            r2.<init>(r5)     // Catch:{ all -> 0x0072 }
        L_0x0094:
            android.util.Log.w(r4, r2)     // Catch:{ all -> 0x0072 }
        L_0x0097:
            r5 = r1
        L_0x0098:
            monitor-exit(r3)     // Catch:{ all -> 0x0072 }
            monitor-exit(r0)
            return r5
        L_0x009b:
            monitor-exit(r3)     // Catch:{ all -> 0x0072 }
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p628nj.C18263b.m30806A0():java.lang.Thread");
    }

    /* renamed from: B */
    public static final ComposableLambdaImpl m30807B(Lambda lambda, int i, boolean z) {
        C19383o.m32797g(lambda, "block");
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(i, z);
        composableLambdaImpl.mo5862t(lambda);
        return composableLambdaImpl;
    }

    /* renamed from: C */
    public static final long m30808C(long j, long j2) {
        long a = C1545s.m3355a(j, C1545s.m3360f(j2));
        float d = C1545s.m3358d(j2);
        float d2 = C1545s.m3358d(a);
        float f = 1.0f - d2;
        float f2 = (d * f) + d2;
        float f3 = 0.0f;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        boolean z = true;
        float h = i == 0 ? 0.0f : (((C1545s.m3362h(j2) * d) * f) + (C1545s.m3362h(a) * d2)) / f2;
        float g = i == 0 ? 0.0f : (((C1545s.m3361g(j2) * d) * f) + (C1545s.m3361g(a) * d2)) / f2;
        float e = C1545s.m3359e(a);
        float e2 = C1545s.m3359e(j2);
        if (i != 0) {
            z = false;
        }
        if (!z) {
            f3 = (((e2 * d) * f) + (e * d2)) / f2;
        }
        return m30832a(h, g, f3, f2, C1545s.m3360f(j2));
    }

    /* renamed from: D */
    public static boolean m30809D(Collection collection, Collection collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    public static final boolean m30810E(String str) {
        C19383o.m32797g(str, "<this>");
        return new Regex("<(\"[^\"]*\"|'[^']*'|[^'\">])*>").containsMatchIn(str);
    }

    /* renamed from: F */
    public static final ReviewUiModel m30811F(ReceiptReview receiptReview, String str, String str2) {
        AppreciationPhoto appreciationPhoto;
        boolean z = false;
        Review review = receiptReview.getReviews().get(0);
        Long valueOf = Long.valueOf(receiptReview.getUserId().getIdAsLongDeprecated());
        String userDisplayName = receiptReview.getUserDisplayName();
        String userAvatarUrl = receiptReview.getUserAvatarUrl();
        Date date = receiptReview.getDate();
        Float valueOf2 = Float.valueOf((float) review.getRating());
        String reviewMessage = review.getReviewMessage();
        String translatedReview = review.getTranslatedReview();
        MachineTranslationViewState machineTranslationViewState = new MachineTranslationViewState(review.getTranslatedReview());
        String reviewLanguage = review.getReviewLanguage();
        com.etsy.android.lib.models.apiv3.AppreciationPhoto appreciationPhoto2 = review.getAppreciationPhoto();
        if (appreciationPhoto2 != null) {
            z = appreciationPhoto2.isSellerApproved();
        }
        boolean z2 = z;
        com.etsy.android.lib.models.apiv3.AppreciationPhoto appreciationPhoto3 = review.getAppreciationPhoto();
        if (appreciationPhoto3 != null) {
            Integer valueOf3 = Integer.valueOf((int) appreciationPhoto3.getCreatedDate().getTime());
            EtsyId imageId = appreciationPhoto3.getImageId();
            appreciationPhoto = new AppreciationPhoto(valueOf3, "", imageId != null ? Long.valueOf(imageId.getIdAsLongDeprecated()) : null, (ImageKey) null, Boolean.valueOf(appreciationPhoto3.isSellerApproved()), appreciationPhoto3.getStatus(), Long.valueOf(appreciationPhoto3.getTransactionId().getIdAsLongDeprecated()), appreciationPhoto3.getUrlFullxFull(), appreciationPhoto3.getUrlFullxFull(), appreciationPhoto3.getUrl170x135(), appreciationPhoto3.getUrl224xN(), appreciationPhoto3.getUrl300x300(), appreciationPhoto3.getUrl340x270(), appreciationPhoto3.getUrl570xN(), appreciationPhoto3.getUrlFullxFull(), appreciationPhoto3.getUrlFullxFull(), appreciationPhoto3.getUrl680x540(), appreciationPhoto3.getUrl75x75(), appreciationPhoto3.getUrlFullxFull());
        } else {
            appreciationPhoto = null;
        }
        Video appreciationVideo = review.getAppreciationVideo();
        Long valueOf4 = Long.valueOf(review.getTransactionId().getIdAsLongDeprecated());
        Long valueOf5 = Long.valueOf(review.getListingId().getIdAsLongDeprecated());
        String listingTitle = review.getListingTitle();
        String listingImageUrl = review.getListingImageUrl();
        String listingImageUrl2 = review.getListingImageUrl();
        String response = review.getResponse();
        ReviewResponse reviewResponse = review.getReviewResponse();
        return new ReviewUiModel(valueOf, userDisplayName, userAvatarUrl, "", date, valueOf2, reviewMessage, translatedReview, machineTranslationViewState, reviewLanguage, z2, appreciationPhoto, appreciationVideo, valueOf4, valueOf5, listingTitle, listingImageUrl, listingImageUrl2, str, str2, response, reviewResponse != null ? reviewResponse.getCreateDate() : null);
    }

    /* renamed from: G */
    public static final C2868j0 m30812G(Fragment fragment, C19379k kVar, C19846a aVar, C19846a aVar2) {
        C19383o.m32797g(fragment, "<this>");
        return new C2868j0(kVar, aVar, aVar2);
    }

    /* renamed from: H */
    public static final String m30813H(C8694h hVar, String str) {
        C19383o.m32797g(str, "<this>");
        try {
            String decode = URLDecoder.decode(str, "UTF-8");
            C19383o.m32796f(decode, "decode(this, \"UTF-8\")");
            return decode;
        } catch (UnsupportedEncodingException unused) {
            if (hVar == null) {
                return str;
            }
            hVar.mo21306a("Couldn't decode query parameter: " + str);
            return str;
        } catch (IllegalArgumentException unused2) {
            if (hVar == null) {
                return str;
            }
            hVar.mo21306a("Couldn't decode query parameter: " + str);
            return str;
        }
    }

    /* renamed from: I */
    public static final Object m30814I(long j, C19340c cVar) {
        if (j <= 0) {
            return C19394m.f43287a;
        }
        C19753l lVar = new C19753l(1, C19388s.m32873m0(cVar));
        lVar.mo72548n();
        if (j < Long.MAX_VALUE) {
            m30821P(lVar.f43710f).mo72116t(j, lVar);
        }
        Object l = lVar.mo72547l();
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : C19394m.f43287a;
    }

    /* renamed from: J */
    public static void m30815J(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        m30819N(jArr, jArr4);
        m30819N(jArr2, jArr5);
        long[] jArr6 = jArr3;
        m30844g(jArr4[0], jArr5[0], jArr6, 0);
        m30844g(jArr4[1], jArr5[1], jArr6, 1);
        m30844g(jArr4[2], jArr5[2], jArr6, 2);
        m30844g(jArr4[3], jArr5[3], jArr6, 3);
        int i = 5;
        while (i > 0) {
            int i2 = i - 1;
            jArr3[i] = jArr3[i] ^ jArr3[i2];
            i = i2;
        }
        m30844g(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        m30844g(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i3 = 7; i3 > 1; i3--) {
            jArr3[i3] = jArr3[i3] ^ jArr3[i3 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        m30844g(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        m30844g(j, j3, jArr7, 0);
        m30844g(j2, j4, jArr7, 1);
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
        jArr3[0] = j12 ^ (j13 << 49);
        jArr3[1] = (j13 >>> 15) ^ (j8 << 34);
        jArr3[2] = (j8 >>> 30) ^ (j9 << 19);
        jArr3[3] = ((j9 >>> 45) ^ (j10 << 4)) ^ (j11 << 53);
        jArr3[4] = ((j10 >>> 60) ^ (j14 << 38)) ^ (j11 >>> 11);
        jArr3[5] = (j14 >>> 26) ^ (j15 << 23);
        jArr3[6] = j15 >>> 41;
        jArr3[7] = 0;
    }

    /* renamed from: K */
    public static String m30816K(ByteString byteString) {
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

    /* renamed from: L */
    public static final void m30817L(LayoutNode layoutNode, List list) {
        C7734e<LayoutNode> x = layoutNode.mo6767x();
        int i = x.f17157d;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = x.f17155b;
            do {
                LayoutNode layoutNode2 = (LayoutNode) tArr[i2];
                C1904k T = m30825T(layoutNode2);
                if (T != null) {
                    list.add(T);
                } else {
                    m30817L(layoutNode2, list);
                }
                i2++;
            } while (i2 < i);
        }
    }

    /* renamed from: M */
    public static final Spanned m30818M(String str) {
        if (str == null) {
            return null;
        }
        return Html.fromHtml(str, 0);
    }

    /* renamed from: N */
    public static void m30819N(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    /* renamed from: O */
    public static final float[] m30820O(long j) {
        return new float[]{C1545s.m3362h(j), C1545s.m3361g(j), C1545s.m3359e(j), C1545s.m3358d(j)};
    }

    /* renamed from: P */
    public static final C19744j0 m30821P(CoroutineContext coroutineContext) {
        int i = C19341d.f43194b1;
        CoroutineContext.C19335a aVar = coroutineContext.get(C19341d.C19342a.f43195b);
        C19744j0 j0Var = aVar instanceof C19744j0 ? (C19744j0) aVar : null;
        return j0Var == null ? C19698g0.f43633a : j0Var;
    }

    /* renamed from: Q */
    public static final C12775i m30822Q(C9529j jVar) {
        if (!(jVar instanceof C9529j.C9530a)) {
            return null;
        }
        C9529j.C9530a aVar = (C9529j.C9530a) jVar;
        return new C12775i(Long.valueOf(aVar.f21113b), (String) null, (String) null, (String) null, aVar.f21112a, 14);
    }

    /* renamed from: R */
    public static final C1321f0 m30823R(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, "<this>");
        int i = C1321f0.f2885U;
        C1321f0 f0Var = (C1321f0) coroutineContext.get(C1321f0.C1322a.f2886b);
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    /* renamed from: S */
    public static final C1904k m30824S(LayoutNode layoutNode) {
        C1904k kVar;
        C19383o.m32797g(layoutNode, "<this>");
        LayoutNodeWrapper layoutNodeWrapper = layoutNode.f3801E.f3875g;
        while (layoutNodeWrapper != null && !C20203a.m34521D(layoutNodeWrapper.f3864t, 2)) {
            layoutNodeWrapper = layoutNodeWrapper.mo6793d1();
        }
        if (layoutNodeWrapper == null || (kVar = (C1904k) layoutNodeWrapper.f3864t[2]) == null) {
            return null;
        }
        LayoutNodeWrapper layoutNodeWrapper2 = kVar.f3919b;
        while (layoutNodeWrapper2 != null) {
            while (kVar != null) {
                if (((C1905l) kVar.f3920c).mo7351N0().f4247c) {
                    return kVar;
                }
                kVar = (C1904k) kVar.f3921d;
            }
            layoutNodeWrapper2 = layoutNodeWrapper2.mo6793d1();
            kVar = layoutNodeWrapper2 != null ? (C1904k) layoutNodeWrapper2.f3864t[2] : null;
        }
        return null;
    }

    /* renamed from: T */
    public static final C1904k m30825T(LayoutNode layoutNode) {
        C1904k kVar;
        C19383o.m32797g(layoutNode, "<this>");
        LayoutNodeWrapper layoutNodeWrapper = layoutNode.f3801E.f3875g;
        while (layoutNodeWrapper != null && !C20203a.m34521D(layoutNodeWrapper.f3864t, 2)) {
            layoutNodeWrapper = layoutNodeWrapper.mo6793d1();
        }
        if (layoutNodeWrapper == null || (kVar = (C1904k) layoutNodeWrapper.f3864t[2]) == null) {
            return null;
        }
        LayoutNodeWrapper layoutNodeWrapper2 = kVar.f3919b;
        while (layoutNodeWrapper2 != null) {
            if (kVar != null) {
                return kVar;
            }
            layoutNodeWrapper2 = layoutNodeWrapper2.mo6793d1();
            kVar = layoutNodeWrapper2 != null ? (C1904k) layoutNodeWrapper2.f3864t[2] : null;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a4 A[SYNTHETIC, Splitter:B:22:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0046 A[SYNTHETIC] */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.etsy.android.p327ui.conversation.details.C9529j m30826U(java.lang.String r13) {
        /*
            java.lang.String r0 = "message"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 2
            java.lang.String r2 = "\\b(?:https?://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|])"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r1)
            java.util.regex.Matcher r2 = r2.matcher(r13)
        L_0x0015:
            boolean r3 = r2.find()
            r4 = 0
            if (r3 == 0) goto L_0x0031
            int r3 = r2.start(r4)
            int r4 = r2.end(r4)
            java.lang.String r3 = r13.substring(r3, r4)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            r0.add(r3)
            goto L_0x0015
        L_0x0031:
            boolean r13 = r0.isEmpty()
            r2 = 0
            r3 = 1
            if (r13 == 0) goto L_0x003d
            kotlin.collections.EmptyList r13 = kotlin.collections.EmptyList.INSTANCE
            goto L_0x00fc
        L_0x003d:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0046:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00f4
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "url.path"
            java.lang.String r7 = "\\/listing\\/([^\\/A-Za-z]*)"
            java.lang.String r8 = "https?"
            java.lang.String r9 = "(www.*\\.etsy.com$|etsy\\.bttn\\.io)$"
            java.lang.String r10 = "urlString"
            kotlin.jvm.internal.C19383o.m32797g(r5, r10)
            java.net.URL r10 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00a0 }
            r10.<init>(r5)     // Catch:{ MalformedURLException -> 0x00a0 }
            kotlin.text.Regex r11 = new kotlin.text.Regex     // Catch:{ MalformedURLException -> 0x00a0 }
            r11.<init>((java.lang.String) r8)     // Catch:{ MalformedURLException -> 0x00a0 }
            java.lang.String r8 = r10.getProtocol()     // Catch:{ MalformedURLException -> 0x00a0 }
            java.lang.String r12 = "url.protocol"
            kotlin.jvm.internal.C19383o.m32796f(r8, r12)     // Catch:{ MalformedURLException -> 0x00a0 }
            boolean r8 = r11.matches(r8)     // Catch:{ MalformedURLException -> 0x00a0 }
            if (r8 == 0) goto L_0x00a0
            kotlin.text.Regex r8 = new kotlin.text.Regex     // Catch:{ MalformedURLException -> 0x00a0 }
            r8.<init>((java.lang.String) r9)     // Catch:{ MalformedURLException -> 0x00a0 }
            java.lang.String r9 = r10.getHost()     // Catch:{ MalformedURLException -> 0x00a0 }
            java.lang.String r11 = "url.host"
            kotlin.jvm.internal.C19383o.m32796f(r9, r11)     // Catch:{ MalformedURLException -> 0x00a0 }
            boolean r8 = r8.matches(r9)     // Catch:{ MalformedURLException -> 0x00a0 }
            if (r8 == 0) goto L_0x00a0
            kotlin.text.Regex r8 = new kotlin.text.Regex     // Catch:{ MalformedURLException -> 0x00a0 }
            r8.<init>((java.lang.String) r7)     // Catch:{ MalformedURLException -> 0x00a0 }
            java.lang.String r9 = r10.getPath()     // Catch:{ MalformedURLException -> 0x00a0 }
            kotlin.jvm.internal.C19383o.m32796f(r9, r6)     // Catch:{ MalformedURLException -> 0x00a0 }
            boolean r8 = r8.containsMatchIn(r9)     // Catch:{ MalformedURLException -> 0x00a0 }
            if (r8 == 0) goto L_0x00a0
            r8 = r3
            goto L_0x00a1
        L_0x00a0:
            r8 = r4
        L_0x00a1:
            if (r8 != 0) goto L_0x00a4
            goto L_0x00ec
        L_0x00a4:
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00ba }
            r8.<init>(r5)     // Catch:{ MalformedURLException -> 0x00ba }
            kotlin.text.Regex r9 = new kotlin.text.Regex     // Catch:{ MalformedURLException -> 0x00ba }
            r9.<init>((java.lang.String) r7)     // Catch:{ MalformedURLException -> 0x00ba }
            java.lang.String r7 = r8.getPath()     // Catch:{ MalformedURLException -> 0x00ba }
            kotlin.jvm.internal.C19383o.m32796f(r7, r6)     // Catch:{ MalformedURLException -> 0x00ba }
            kotlin.text.e r6 = kotlin.text.Regex.find$default(r9, r7, r4, r1, r2)     // Catch:{ MalformedURLException -> 0x00ba }
            goto L_0x00bb
        L_0x00ba:
            r6 = r2
        L_0x00bb:
            if (r6 == 0) goto L_0x00c2
            java.util.List r6 = r6.mo72020a()
            goto L_0x00c3
        L_0x00c2:
            r6 = r2
        L_0x00c3:
            if (r6 == 0) goto L_0x00ec
            int r7 = r6.size()
            if (r7 <= r3) goto L_0x00ec
            java.lang.Object r7 = r6.get(r3)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x00d9
            r7 = r3
            goto L_0x00da
        L_0x00d9:
            r7 = r4
        L_0x00da:
            if (r7 == 0) goto L_0x00ec
            java.lang.Object r6 = r6.get(r3)     // Catch:{ NumberFormatException -> 0x00ec }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x00ec }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x00ec }
            com.etsy.android.ui.conversation.details.j$a r8 = new com.etsy.android.ui.conversation.details.j$a
            r8.<init>(r5, r6)
            goto L_0x00ed
        L_0x00ec:
            r8 = r2
        L_0x00ed:
            if (r8 == 0) goto L_0x0046
            r13.add(r8)
            goto L_0x0046
        L_0x00f4:
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x00fc
            kotlin.collections.EmptyList r13 = kotlin.collections.EmptyList.INSTANCE
        L_0x00fc:
            boolean r0 = r13.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x010a
            java.lang.Object r13 = r13.get(r4)
            r2 = r13
            com.etsy.android.ui.conversation.details.j r2 = (com.etsy.android.p327ui.conversation.details.C9529j) r2
        L_0x010a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p628nj.C18263b.m30826U(java.lang.String):com.etsy.android.ui.conversation.details.j");
    }

    /* renamed from: V */
    public static final Object[] m30827V(int i, Class cls) {
        if (cls == null) {
            return new Object[0];
        }
        try {
            Constructor[] constructors = cls.getConstructors();
            C19383o.m32796f(constructors, "parameterProviderClass.constructors");
            int length = constructors.length;
            Constructor constructor = null;
            int i2 = 0;
            boolean z = false;
            Constructor constructor2 = null;
            while (true) {
                if (i2 < length) {
                    Constructor constructor3 = constructors[i2];
                    Class[] parameterTypes = constructor3.getParameterTypes();
                    C19383o.m32796f(parameterTypes, "it.parameterTypes");
                    if (parameterTypes.length == 0) {
                        if (z) {
                            break;
                        }
                        z = true;
                        constructor2 = constructor3;
                    }
                    i2++;
                } else if (z) {
                    constructor = constructor2;
                }
            }
            Constructor constructor4 = constructor;
            if (constructor4 != null) {
                constructor4.setAccessible(true);
                Object newInstance = constructor4.newInstance(new Object[0]);
                if (newInstance != null) {
                    C7211a aVar = (C7211a) newInstance;
                    if (i < 0) {
                        C19431g a = aVar.mo19497a();
                        int count = aVar.getCount();
                        Iterator it = a.iterator();
                        Object[] objArr = new Object[count];
                        for (int i3 = 0; i3 < count; i3++) {
                            objArr[i3] = it.next();
                        }
                        return objArr;
                    }
                    return new Object[]{SequencesKt___SequencesKt.m32983n1(aVar.mo19497a(), i)};
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
            }
            throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
        } catch (KotlinReflectionNotSupportedError unused) {
            throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }

    /* renamed from: W */
    public static final TransactionViewModel m30828W(Fragment fragment, C11869a aVar) {
        C19383o.m32797g(fragment, "<this>");
        return (TransactionViewModel) new C2870k0((C2880m0) fragment, (C2870k0.C2872b) new C11870b(aVar)).mo10829a(TransactionViewModel.class);
    }

    /* renamed from: X */
    public static final TransactionViewModel m30829X(Fragment fragment, Object obj) {
        C19383o.m32797g(fragment, "<this>");
        Bundle arguments = fragment.getArguments();
        int i = 0;
        if (arguments != null) {
            i = arguments.getInt("transaction-data", 0);
        }
        C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
        Object a = TransactionDataRepository.C11867a.m19552a().mo38342a(i);
        if (a != null) {
            obj = a;
        }
        return (TransactionViewModel) new C2870k0((C2880m0) fragment, (C2870k0.C2872b) new C11870b(obj)).mo10829a(TransactionViewModel.class);
    }

    /* renamed from: Y */
    public static final TransactionViewModel m30830Y(Fragment fragment, String str, Object obj) {
        C19383o.m32797g(fragment, "<this>");
        return (TransactionViewModel) new C2870k0((C2880m0) fragment, (C2870k0.C2872b) new C11870b(obj)).mo10830b(TransactionViewModel.class, str);
    }

    /* renamed from: Z */
    public static void m30831Z(long[] jArr, long[] jArr2) {
        C0114h.m331z(jArr2, 0, jArr[0]);
        C0114h.m331z(jArr2, 2, jArr[1]);
        C0114h.m331z(jArr2, 4, jArr[2]);
        jArr2[6] = jArr[3] & 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m30832a(float r10, float r11, float r12, float r13, androidx.compose.p015ui.graphics.colorspace.C1505c r14) {
        /*
            java.lang.String r0 = "colorSpace"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r0 = 0
            float r1 = r14.mo6295c(r0)
            float r2 = r14.mo6294b(r0)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            r3 = 1
            if (r2 > 0) goto L_0x0019
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0019
            r1 = r3
            goto L_0x001a
        L_0x0019:
            r1 = r0
        L_0x001a:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r1 == 0) goto L_0x0059
            float r1 = r14.mo6295c(r3)
            float r5 = r14.mo6294b(r3)
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0031
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x0031
            r1 = r3
            goto L_0x0032
        L_0x0031:
            r1 = r0
        L_0x0032:
            if (r1 == 0) goto L_0x0059
            r1 = 2
            float r5 = r14.mo6295c(r1)
            float r1 = r14.mo6294b(r1)
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            r1 = r3
            goto L_0x0048
        L_0x0047:
            r1 = r0
        L_0x0048:
            if (r1 == 0) goto L_0x0059
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            int r1 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            r1 = r3
            goto L_0x0055
        L_0x0054:
            r1 = r0
        L_0x0055:
            if (r1 == 0) goto L_0x0059
            r1 = r3
            goto L_0x005a
        L_0x0059:
            r1 = r0
        L_0x005a:
            if (r1 == 0) goto L_0x00f0
            boolean r1 = r14.mo6296d()
            r5 = 16
            r6 = 32
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x0089
            r14 = 1132396544(0x437f0000, float:255.0)
            float r13 = r13 * r14
            float r13 = r13 + r7
            int r13 = (int) r13
            int r13 = r13 << 24
            float r10 = r10 * r14
            float r10 = r10 + r7
            int r10 = (int) r10
            int r10 = r10 << r5
            r10 = r10 | r13
            float r11 = r11 * r14
            float r11 = r11 + r7
            int r11 = (int) r11
            int r11 = r11 << 8
            r10 = r10 | r11
            float r12 = r12 * r14
            float r12 = r12 + r7
            int r11 = (int) r12
            r10 = r10 | r11
            long r10 = (long) r10
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            long r10 = r10 << r6
            int r12 = androidx.compose.p015ui.graphics.C1545s.f3365j
            return r10
        L_0x0089:
            long r8 = r14.f3266b
            int r1 = androidx.compose.p015ui.graphics.colorspace.C1504b.f3264e
            long r8 = r8 >> r6
            int r1 = (int) r8
            r8 = 3
            if (r1 != r8) goto L_0x0094
            r1 = r3
            goto L_0x0095
        L_0x0094:
            r1 = r0
        L_0x0095:
            if (r1 == 0) goto L_0x00e4
            int r14 = r14.f3267c
            r1 = -1
            if (r14 == r1) goto L_0x009d
            r0 = r3
        L_0x009d:
            if (r0 == 0) goto L_0x00d8
            short r10 = androidx.compose.p015ui.graphics.C1547u.m3364a(r10)
            short r11 = androidx.compose.p015ui.graphics.C1547u.m3364a(r11)
            short r12 = androidx.compose.p015ui.graphics.C1547u.m3364a(r12)
            float r13 = java.lang.Math.min(r13, r2)
            float r13 = java.lang.Math.max(r4, r13)
            r0 = 1149222912(0x447fc000, float:1023.0)
            float r13 = r13 * r0
            float r13 = r13 + r7
            int r13 = (int) r13
            long r0 = (long) r10
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            r10 = 48
            long r0 = r0 << r10
            long r10 = (long) r11
            long r10 = r10 & r2
            long r10 = r10 << r6
            long r10 = r10 | r0
            long r0 = (long) r12
            long r0 = r0 & r2
            long r0 = r0 << r5
            long r10 = r10 | r0
            long r12 = (long) r13
            r0 = 1023(0x3ff, double:5.054E-321)
            long r12 = r12 & r0
            r0 = 6
            long r12 = r12 << r0
            long r10 = r10 | r12
            long r12 = (long) r14
            r0 = 63
            long r12 = r12 & r0
            long r10 = r10 | r12
            int r12 = androidx.compose.p015ui.graphics.C1545s.f3365j
            return r10
        L_0x00d8:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Unknown color space, please use a color space in ColorSpaces"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00e4:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Color only works with ColorSpaces with 3 components"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00f0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "red = "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = ", green = "
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = ", blue = "
            r0.append(r10)
            r0.append(r12)
            java.lang.String r10 = ", alpha = "
            r0.append(r10)
            r0.append(r13)
            java.lang.String r10 = " outside the range for "
            r0.append(r10)
            r0.append(r14)
            java.lang.String r10 = r0.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p628nj.C18263b.m30832a(float, float, float, float, androidx.compose.ui.graphics.colorspace.c):long");
    }

    /* renamed from: a0 */
    public static final C1514d m30833a0(Resources resources, int i) {
        Drawable drawable = resources.getDrawable(i, (Resources.Theme) null);
        if (drawable != null) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            C19383o.m32796f(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
            return new C1514d(bitmap);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
    }

    /* renamed from: b */
    public static final long m30834b(int i) {
        long j = ((long) i) << 32;
        int i2 = C1545s.f3365j;
        return j;
    }

    /* renamed from: b0 */
    public static final boolean m30835b0(String str) {
        String str2;
        C19383o.m32797g(str, "<this>");
        String[] strArr = {".jpg", ".jpeg", ".jpe", ".jfif", ".jif"};
        try {
            String file = new URL(str).getFile();
            int i = 0;
            while (true) {
                str2 = null;
                if (i >= 5) {
                    break;
                }
                str2 = strArr[i];
                C19383o.m32796f(file, ResponseConstants.FILE);
                if (C19457k.m33018V0(file, str2)) {
                    break;
                }
                i++;
            }
            return str2 != null;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static final long m30836c(long j) {
        long j2 = (j & UnsignedInteger.INT_MASK) << 32;
        int i = C1545s.f3365j;
        return j2;
    }

    /* renamed from: c0 */
    public static final boolean m30837c0(CharSequence charSequence) {
        return !(charSequence == null || C19457k.m33020X0(charSequence));
    }

    /* renamed from: d */
    public static final C1521g m30838d() {
        return new C1521g(0);
    }

    /* renamed from: d0 */
    public static final boolean m30839d0(CharSequence charSequence) {
        return !(charSequence == null || charSequence.length() == 0);
    }

    /* renamed from: e */
    public static final long m30840e(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & UnsignedInteger.INT_MASK) | (floatToIntBits << 32);
        int i = C1540p0.f3338c;
        return floatToIntBits2;
    }

    /* renamed from: e0 */
    public static final long m30841e0(long j, float f, long j2) {
        C1510g gVar = ColorSpaces.f3243t;
        long a = C1545s.m3355a(j, gVar);
        long a2 = C1545s.m3355a(j2, gVar);
        float d = C1545s.m3358d(a);
        float h = C1545s.m3362h(a);
        float g = C1545s.m3361g(a);
        float e = C1545s.m3359e(a);
        float d2 = C1545s.m3358d(a2);
        float h2 = C1545s.m3362h(a2);
        float g2 = C1545s.m3361g(a2);
        float e2 = C1545s.m3359e(a2);
        return C1545s.m3355a(m30832a(C15588c1.m25354w0(h, h2, f), C15588c1.m25354w0(g, g2, f), C15588c1.m25354w0(e, e2, f), C15588c1.m25354w0(d, d2, f), gVar), C1545s.m3360f(j2));
    }

    /* renamed from: f */
    public static String m30842f(String str, String str2, C7770q qVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String str3 = C8217e.f18044a;
        byte[] k = qVar instanceof C7776w ? C8212a.m16504k(((C7776w) qVar).f17205b) : qVar instanceof C7760h ? C8212a.m16504k(((C7760h) qVar).f17193b) : qVar instanceof C7774u ? C8212a.m16504k(((C7774u) qVar).f17203b) : C8212a.m16504k(((C7756f) qVar).f17183b);
        stringBuffer.append(str2);
        stringBuffer.append(" ");
        stringBuffer.append(str);
        stringBuffer.append(" [");
        C7336h hVar = new C7336h(256);
        hVar.mo19525b(k, k.length);
        byte[] bArr = new byte[20];
        hVar.mo19522a(20, bArr);
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i = 0; i != 20; i++) {
            if (i > 0) {
                stringBuffer2.append(MessageDraft.IMAGE_DELIMITER);
            }
            char[] cArr = C0114h.f188y;
            stringBuffer2.append(cArr[(bArr[i] >>> 4) & 15]);
            stringBuffer2.append(cArr[bArr[i] & 15]);
        }
        stringBuffer.append(stringBuffer2.toString());
        stringBuffer.append("]");
        stringBuffer.append(str3);
        stringBuffer.append("    public data: ");
        stringBuffer.append(C8217e.m16511c(C8260c.m16546b(0, k.length, k)));
        stringBuffer.append(str3);
        return stringBuffer.toString();
    }

    /* renamed from: f0 */
    public static final float m30843f0(long j) {
        C1505c f = C1545s.m3360f(j);
        long j2 = f.f3266b;
        int i = C1504b.f3264e;
        if (C1504b.m3215a(j2, C1504b.f3260a)) {
            C19857l<Double, Double> lVar = ((Rgb) f).f3256n;
            double doubleValue = lVar.invoke(Double.valueOf((double) C1545s.m3362h(j))).doubleValue();
            double doubleValue2 = lVar.invoke(Double.valueOf((double) C1545s.m3359e(j))).doubleValue() * 0.0722d;
            float doubleValue3 = (float) (doubleValue2 + (lVar.invoke(Double.valueOf((double) C1545s.m3361g(j))).doubleValue() * 0.7152d) + (doubleValue * 0.2126d));
            if (doubleValue3 <= 0.0f) {
                return 0.0f;
            }
            if (doubleValue3 >= 1.0f) {
                return 1.0f;
            }
            return doubleValue3;
        }
        StringBuilder h = C0072d.m201h("The specified color must be encoded in an RGB color space. The supplied color space is ");
        h.append(C1504b.m3216b(f.f3266b));
        throw new IllegalArgumentException(h.toString().toString());
    }

    /* renamed from: g */
    public static void m30844g(long j, long j2, long[] jArr, int i) {
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
        int i3 = 36;
        do {
            int i4 = (int) (j3 >>> i3);
            long j10 = (((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9)) ^ (jArr2[(i4 >>> 12) & 7] << 12);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (562949953421311L & j8);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j8 >>> 49) ^ (j9 << 15));
    }

    /* renamed from: g0 */
    public static final float m30845g0(float[] fArr, float f) {
        for (float max : fArr) {
            f = Math.max(f, max);
        }
        return f;
    }

    /* renamed from: h0 */
    public static final float m30846h0(float[] fArr, float f) {
        for (float min : fArr) {
            f = Math.min(f, min);
        }
        return f;
    }

    /* renamed from: i0 */
    public static final int m30847i0(Random.Default defaultR, C20057i iVar) {
        if (!iVar.isEmpty()) {
            int i = iVar.f44415c;
            if (i < Integer.MAX_VALUE) {
                return defaultR.nextInt(iVar.f44414b, i + 1);
            }
            int i2 = iVar.f44414b;
            return i2 > Integer.MIN_VALUE ? defaultR.nextInt(i2 - 1, i) + 1 : defaultR.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + iVar);
    }

    /* renamed from: j */
    public static void m30848j(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[8];
        m30831Z(jArr, jArr3);
        while (true) {
            m30876x(jArr3, jArr2);
            i--;
            if (i > 0) {
                m30831Z(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: j0 */
    public static final C1436d m30849j0(C1436d dVar, C19857l lVar) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(lVar, "onSizeChanged");
        C19857l<C1859o0, C19394m> lVar2 = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new C1682g0(lVar));
    }

    /* renamed from: k */
    public static boolean m30850k(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return !m30850k(bArr, bArr);
        }
        byte b = 0;
        for (int i = 0; i != bArr.length; i++) {
            b |= bArr[i] ^ bArr2[i];
        }
        return b == 0;
    }

    /* renamed from: k0 */
    public static final boolean m30851k0(C1416u0 u0Var, C1416u0 u0Var2) {
        boolean z;
        if (u0Var != null) {
            if (!(u0Var instanceof C1418v0) || !(u0Var2 instanceof C1418v0)) {
                return false;
            }
            C1418v0 v0Var = (C1418v0) u0Var;
            if (v0Var.f3079b != null) {
                C1296b bVar = v0Var.f3080c;
                if (bVar != null ? bVar.mo5622a() : false) {
                    z = true;
                    if (z && !C19383o.m32792b(u0Var, u0Var2) && !C19383o.m32792b(v0Var.f3080c, ((C1418v0) u0Var2).f3080c)) {
                        return false;
                    }
                }
            }
            z = false;
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static byte[] m30852l(C7198a aVar) {
        try {
            return aVar.mo20561a("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        kotlin.reflect.C19421p.m32917E(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        kotlin.reflect.C19421p.m32917E(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        throw r1;
     */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m30853l0(com.bugsnag.android.C5748g1.C5749a r5) {
        /*
            java.lang.String r0 = "streamable"
            kotlin.jvm.internal.C19383o.m32798h(r5, r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            com.bugsnag.android.g1 r1 = new com.bugsnag.android.g1     // Catch:{ all -> 0x0040 }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x0040 }
            r2.<init>(r0)     // Catch:{ all -> 0x0040 }
            r3 = 8192(0x2000, float:1.14794E-41)
            boolean r4 = r2 instanceof java.io.BufferedWriter     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x001a
            java.io.BufferedWriter r2 = (java.io.BufferedWriter) r2     // Catch:{ all -> 0x0040 }
            goto L_0x0020
        L_0x001a:
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ all -> 0x0040 }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x0040 }
            r2 = r4
        L_0x0020:
            r1.<init>(r2)     // Catch:{ all -> 0x0040 }
            r5.toStream(r1)     // Catch:{ all -> 0x0039 }
            kotlin.m r5 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0039 }
            r5 = 0
            kotlin.reflect.C19421p.m32917E(r1, r5)     // Catch:{ all -> 0x0040 }
            byte[] r1 = r0.toByteArray()     // Catch:{ all -> 0x0040 }
            kotlin.reflect.C19421p.m32917E(r0, r5)
            java.lang.String r5 = "ByteArrayOutputStream().… baos.toByteArray()\n    }"
            kotlin.jvm.internal.C19383o.m32793c(r1, r5)
            return r1
        L_0x0039:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003b }
        L_0x003b:
            r2 = move-exception
            kotlin.reflect.C19421p.m32917E(r1, r5)     // Catch:{ all -> 0x0040 }
            throw r2     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r1 = move-exception
            kotlin.reflect.C19421p.m32917E(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p628nj.C18263b.m30853l0(com.bugsnag.android.g1$a):byte[]");
    }

    /* renamed from: m */
    public static byte[] m30854m(C7199b bVar, C8005o1 o1Var) {
        try {
            return m30852l(new C7198a(bVar, o1Var));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m0 */
    public static final void m30855m0(Matrix matrix, float[] fArr) {
        float[] fArr2 = fArr;
        C19383o.m32797g(fArr2, "$this$setFrom");
        C19383o.m32797g(matrix, "matrix");
        matrix.getValues(fArr);
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        float f4 = fArr2[3];
        float f5 = fArr2[4];
        float f6 = fArr2[5];
        float f7 = fArr2[6];
        float f8 = fArr2[7];
        float f9 = fArr2[8];
        fArr2[0] = f;
        fArr2[1] = f4;
        fArr2[2] = 0.0f;
        fArr2[3] = f7;
        fArr2[4] = f2;
        fArr2[5] = f5;
        fArr2[6] = 0.0f;
        fArr2[7] = f8;
        fArr2[8] = 0.0f;
        fArr2[9] = 0.0f;
        fArr2[10] = 1.0f;
        fArr2[11] = 0.0f;
        fArr2[12] = f3;
        fArr2[13] = f6;
        fArr2[14] = 0.0f;
        fArr2[15] = f9;
    }

    /* renamed from: n */
    public static byte[] m30856n(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00de A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0125 A[SYNTHETIC] */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.text.SpannableString m30857n0(androidx.compose.p015ui.text.C1913a r21, p174m0.C7282b r22, androidx.compose.p015ui.text.font.C1952g.C1953a r23) {
        /*
            r0 = r21
            java.lang.String r1 = "density"
            r8 = r22
            kotlin.jvm.internal.C19383o.m32797g(r8, r1)
            java.lang.String r1 = "fontFamilyResolver"
            r2 = r23
            kotlin.jvm.internal.C19383o.m32797g(r2, r1)
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.String r2 = r0.f4296b
            r1.<init>(r2)
            java.util.List<androidx.compose.ui.text.a$b<androidx.compose.ui.text.n>> r9 = r0.f4297c
            int r10 = r9.size()
            r12 = 0
        L_0x001e:
            if (r12 >= r10) goto L_0x00ed
            java.lang.Object r2 = r9.get(r12)
            androidx.compose.ui.text.a$b r2 = (androidx.compose.p015ui.text.C1913a.C1916b) r2
            T r3 = r2.f4308a
            androidx.compose.ui.text.n r3 = (androidx.compose.p015ui.text.C2012n) r3
            int r15 = r2.f4309b
            int r7 = r2.f4310c
            long r4 = r3.mo7712a()
            r16 = r12
            long r11 = r3.f4537b
            androidx.compose.ui.text.font.m r6 = r3.f4538c
            androidx.compose.ui.text.font.k r2 = r3.f4539d
            androidx.compose.ui.text.style.g r14 = r3.f4545j
            k0.c r13 = r3.f4546k
            r17 = r9
            long r8 = r3.f4547l
            r18 = r10
            androidx.compose.ui.text.style.e r10 = r3.f4548m
            r19 = r8
            long r8 = r3.mo7712a()
            boolean r8 = androidx.compose.p015ui.graphics.C1545s.m3357c(r4, r8)
            if (r8 == 0) goto L_0x0055
            androidx.compose.ui.text.style.TextDrawStyle r3 = r3.f4536a
            goto L_0x0068
        L_0x0055:
            long r8 = androidx.compose.p015ui.graphics.C1545s.f3364i
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x005d
            r3 = 1
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            if (r3 == 0) goto L_0x0066
            androidx.compose.ui.text.style.b r3 = new androidx.compose.ui.text.style.b
            r3.<init>(r4)
            goto L_0x0068
        L_0x0066:
            androidx.compose.ui.text.style.TextDrawStyle$a r3 = androidx.compose.p015ui.text.style.TextDrawStyle.C2024a.f4602a
        L_0x0068:
            long r3 = r3.mo7763a()
            androidx.compose.p015ui.text.platform.extensions.C2020c.m4444c(r1, r3, r15, r7)
            r8 = r2
            r2 = r1
            r3 = r11
            r5 = r22
            r9 = r6
            r6 = r15
            r11 = r7
            androidx.compose.p015ui.text.platform.extensions.C2020c.m4445d(r2, r3, r5, r6, r7)
            if (r9 != 0) goto L_0x007e
            if (r8 == 0) goto L_0x0098
        L_0x007e:
            if (r9 != 0) goto L_0x0083
            androidx.compose.ui.text.font.m r6 = androidx.compose.p015ui.text.font.C1959m.f4413g
            goto L_0x0084
        L_0x0083:
            r6 = r9
        L_0x0084:
            if (r8 == 0) goto L_0x0089
            int r2 = r8.f4407a
            goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            int r2 = androidx.activity.C0114h.m297b0(r6, r2)
            r3.<init>(r2)
            r2 = 33
            r1.setSpan(r3, r15, r11, r2)
        L_0x0098:
            if (r10 == 0) goto L_0x00c5
            int r2 = r10.f4615a
            r3 = 1
            r4 = r3 | r2
            if (r4 != r2) goto L_0x00a3
            r2 = r3
            goto L_0x00a4
        L_0x00a3:
            r2 = 0
        L_0x00a4:
            if (r2 == 0) goto L_0x00b0
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            r4 = 33
            r1.setSpan(r2, r15, r11, r4)
        L_0x00b0:
            int r2 = r10.f4615a
            r4 = 2
            r4 = r4 | r2
            if (r4 != r2) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r3 = 0
        L_0x00b8:
            if (r3 == 0) goto L_0x00c5
            android.text.style.StrikethroughSpan r2 = new android.text.style.StrikethroughSpan
            r2.<init>()
            r3 = 33
            r1.setSpan(r2, r15, r11, r3)
            goto L_0x00c7
        L_0x00c5:
            r3 = 33
        L_0x00c7:
            if (r14 == 0) goto L_0x00d3
            android.text.style.ScaleXSpan r2 = new android.text.style.ScaleXSpan
            float r4 = r14.f4618a
            r2.<init>(r4)
            r1.setSpan(r2, r15, r11, r3)
        L_0x00d3:
            if (r13 == 0) goto L_0x00de
            androidx.compose.ui.text.platform.extensions.a r2 = androidx.compose.p015ui.text.platform.extensions.C2018a.f4585a
            java.lang.Object r2 = r2.mo7729a(r13)
            androidx.compose.p015ui.text.platform.extensions.C2020c.m4446e(r1, r2, r15, r11)
        L_0x00de:
            r2 = r19
            androidx.compose.p015ui.text.platform.extensions.C2020c.m4443b(r1, r2, r15, r11)
            int r12 = r16 + 1
            r8 = r22
            r9 = r17
            r10 = r18
            goto L_0x001e
        L_0x00ed:
            r3 = 1
            int r2 = r21.length()
            java.util.List<androidx.compose.ui.text.a$b<? extends java.lang.Object>> r0 = r0.f4299e
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r0.size()
            r4.<init>(r5)
            int r5 = r0.size()
            r6 = 0
        L_0x0102:
            if (r6 >= r5) goto L_0x0128
            java.lang.Object r7 = r0.get(r6)
            r8 = r7
            androidx.compose.ui.text.a$b r8 = (androidx.compose.p015ui.text.C1913a.C1916b) r8
            T r9 = r8.f4308a
            boolean r9 = r9 instanceof androidx.compose.p015ui.text.C2036u
            if (r9 == 0) goto L_0x011e
            int r9 = r8.f4309b
            int r8 = r8.f4310c
            r10 = 0
            boolean r8 = androidx.compose.p015ui.text.C1933b.m4232b(r10, r2, r9, r8)
            if (r8 == 0) goto L_0x011f
            r8 = r3
            goto L_0x0120
        L_0x011e:
            r10 = 0
        L_0x011f:
            r8 = r10
        L_0x0120:
            if (r8 == 0) goto L_0x0125
            r4.add(r7)
        L_0x0125:
            int r6 = r6 + 1
            goto L_0x0102
        L_0x0128:
            r10 = 0
            int r0 = r4.size()
            r11 = r10
        L_0x012e:
            if (r11 >= r0) goto L_0x0167
            java.lang.Object r2 = r4.get(r11)
            androidx.compose.ui.text.a$b r2 = (androidx.compose.p015ui.text.C1913a.C1916b) r2
            T r3 = r2.f4308a
            androidx.compose.ui.text.u r3 = (androidx.compose.p015ui.text.C2036u) r3
            int r5 = r2.f4309b
            int r2 = r2.f4310c
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r3, r6)
            boolean r6 = r3 instanceof androidx.compose.p015ui.text.C2037v
            if (r6 == 0) goto L_0x0161
            androidx.compose.ui.text.v r3 = (androidx.compose.p015ui.text.C2037v) r3
            android.text.style.TtsSpan$VerbatimBuilder r6 = new android.text.style.TtsSpan$VerbatimBuilder
            java.lang.String r3 = r3.f4624a
            r6.<init>(r3)
            android.text.style.TtsSpan r3 = r6.build()
            java.lang.String r6 = "builder.build()"
            kotlin.jvm.internal.C19383o.m32796f(r3, r6)
            r6 = 33
            r1.setSpan(r3, r5, r2, r6)
            int r11 = r11 + 1
            goto L_0x012e
        L_0x0161:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0167:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p628nj.C18263b.m30857n0(androidx.compose.ui.text.a, m0.b, androidx.compose.ui.text.font.g$a):android.text.SpannableString");
    }

    /* renamed from: o */
    public static final long m30858o(float f, boolean z) {
        return ((z ? 1 : 0) & UnsignedInteger.INT_MASK) | (((long) Float.floatToIntBits(f)) << 32);
    }

    /* renamed from: o0 */
    public static final int m30859o0(long j) {
        C1505c f = C1545s.m3360f(j);
        if (f.mo6296d()) {
            return (int) (j >>> 32);
        }
        float[] O = m30820O(j);
        C19543e0.m33291G(f, (C1505c) null, 3).mo6311a(O);
        return ((int) ((O[2] * 255.0f) + 0.5f)) | (((int) ((O[3] * 255.0f) + 0.5f)) << 24) | (((int) ((O[0] * 255.0f) + 0.5f)) << 16) | (((int) ((O[1] * 255.0f) + 0.5f)) << 8);
    }

    /* renamed from: p */
    public static final int m30860p(long j) {
        int i = 32;
        if ((UnsignedInteger.INT_MASK & j) == 0) {
            j >>= 32;
        } else {
            i = 0;
        }
        if ((65535 & j) == 0) {
            i += 16;
            j >>= 16;
        }
        if ((255 & j) == 0) {
            i += 8;
            j >>= 8;
        }
        if ((15 & j) == 0) {
            i += 4;
            j >>= 4;
        }
        if ((1 & j) != 0) {
            return i;
        }
        if ((2 & j) != 0) {
            return i + 1;
        }
        if ((4 & j) != 0) {
            return i + 2;
        }
        if ((j & 8) != 0) {
            return i + 3;
        }
        return -1;
    }

    /* renamed from: p0 */
    public static final Object[] m30861p0(Collection collection) {
        C19383o.m32797g(collection, com.etsy.android.lib.models.apiv3.Collection.TYPE_COLLECTION);
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 < 2147483645) {
                                i3 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        C19383o.m32796f(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        C19383o.m32796f(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return f40074k1;
    }

    /* renamed from: q */
    public static final Class m30862q(String str) {
        C19383o.m32797g(str, "<this>");
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            Log.e("PreviewProvider", "Unable to find provider '" + str + '\'', e);
            return null;
        }
    }

    /* renamed from: q0 */
    public static final Object[] m30863q0(Collection collection, Object[] objArr) {
        Object[] objArr2;
        C19383o.m32797g(collection, com.etsy.android.lib.models.apiv3.Collection.TYPE_COLLECTION);
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    C19383o.m32795e(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 < 2147483645) {
                                i3 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        C19383o.m32796f(objArr2, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i2);
                        C19383o.m32796f(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }

    /* renamed from: r */
    public static void m30864r(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    /* renamed from: r0 */
    public static final Bundle m30865r0(Map map) {
        C19383o.m32797g(map, "<this>");
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    /* renamed from: s */
    public static byte[] m30866s(C7199b bVar, C8005o1 o1Var) {
        try {
            return new C6662a(bVar, o1Var.mo12996i(), (C8027v1) null, (byte[]) null).mo20561a("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: s0 */
    public static final Spanned m30867s0(String str) {
        C19383o.m32797g(str, "<this>");
        Spanned fromHtml = Html.fromHtml(str, 0);
        C19383o.m32796f(fromHtml, "fromHtml(this, Html.FROM_HTML_MODE_LEGACY)");
        return fromHtml;
    }

    /* renamed from: t */
    public static final int m30868t(int i, int[] iArr) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else if (i >= i4) {
                return i3;
            } else {
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: t0 */
    public static final C0730d0 m30869t0(C0736g0 g0Var, C0736g0 g0Var2) {
        C19383o.m32797g(g0Var2, "insets");
        return new C0730d0(g0Var, g0Var2);
    }

    /* renamed from: u */
    public static final int m30870u(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    /* renamed from: u0 */
    public static final Object m30871u0(C19857l lVar, C19340c cVar) {
        return m30823R(cVar.getContext()).mo5381Q(lVar, cVar);
    }

    /* renamed from: v */
    public static final String m30872v(Number number, Number number2) {
        C19383o.m32797g(number, ResponseConstants.FROM);
        C19383o.m32797g(number2, "until");
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    /* renamed from: v0 */
    public static Class m30873v0(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r2.getClass().getName();
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m30874w(java.lang.Object r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0008
            java.lang.String r2 = "null"
            r3.append(r2)
            goto L_0x003f
        L_0x0008:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002c
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002c
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002c:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3.append(r2)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p628nj.C18263b.m30874w(java.lang.Object, java.lang.StringBuilder):void");
    }

    /* renamed from: w0 */
    public static synchronized ClassLoader m30875w0() {
        ClassLoader classLoader;
        synchronized (C18263b.class) {
            if (f40062b == null) {
                f40062b = m30879y0();
            }
            classLoader = f40062b;
        }
        return classLoader;
    }

    /* renamed from: x */
    public static void m30876x(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = (j13 >>> 49) ^ j11;
        jArr2[2] = j12;
        jArr2[3] = 1 & j9;
    }

    /* renamed from: x0 */
    public static int m30877x0(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: y */
    public static void m30878y(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        m30815J(jArr, jArr2, jArr4);
        m30876x(jArr4, jArr3);
    }

    /* renamed from: y0 */
    public static synchronized ClassLoader m30879y0() {
        synchronized (C18263b.class) {
            ClassLoader classLoader = null;
            if (f40063c == null) {
                f40063c = m30806A0();
                if (f40063c == null) {
                    return null;
                }
            }
            synchronized (f40063c) {
                try {
                    classLoader = f40063c.getContextClassLoader();
                } catch (SecurityException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new String("Failed to get thread context classloader "));
                }
            }
            return classLoader;
        }
    }

    /* renamed from: z */
    public static final int m30880z(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* renamed from: z0 */
    public static long m30881z0(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo1133h(Object obj) {
        ChangeShippingAddressFragment changeShippingAddressFragment = (ChangeShippingAddressFragment) obj;
    }

    /* renamed from: i */
    public Object mo1134i() {
        return new LinkedTreeMap();
    }

    public Object then(C18123g gVar) {
        if (gVar.mo69668o()) {
            return (Bundle) gVar.mo69664k();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(gVar.mo69663j());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", gVar.mo69663j());
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Long.valueOf(C14720l8.f32933c.zza().zzj());
    }
}
