package p388lb;

import android.opengl.GLES20;
import android.os.Build;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.work.C3436p;
import com.appboy.Constants;
import com.etsy.android.R;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities;
import com.etsy.android.stylekit.accessibility.exceptions.EtsyAccessibilityException;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;
import p435rb.C13352c;
import p461uf.C13516j;
import p461uf.C13517k;

/* renamed from: lb.a */
public class C13006a implements FeatureManager.C12256a {

    /* renamed from: A */
    public static final int[] f28629A = {R.attr.clg_buttonBackgroundTint, R.attr.clg_buttonStyle, R.attr.clg_text};

    /* renamed from: B */
    public static Field f28630B;

    /* renamed from: C */
    public static boolean f28631C;

    /* renamed from: D */
    public static final int[] f28632D = {-1, -1, -1, 0, 0, 0, 1, -1};

    /* renamed from: E */
    public static final int[] f28633E = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    /* renamed from: F */
    public static final C13006a f28634F = new C13006a();

    /* renamed from: b */
    public static final int[] f28635b = {R.attr.badgeColor};

    /* renamed from: c */
    public static final int[] f28636c = {R.attr.asAccessibilityHeading, R.attr.asButton, R.attr.delegateOnClick, R.attr.overrideOnClickWith};

    /* renamed from: d */
    public static final int[] f28637d = {R.attr.clg_small};

    /* renamed from: e */
    public static final int[] f28638e = {R.attr.clg_alertType, R.attr.clg_altButtonText, R.attr.clg_anchorDirection, R.attr.clg_anchorOffset, R.attr.clg_anchorOffsetDirection, R.attr.clg_badgeText, R.attr.clg_bodyDrawableStart, R.attr.clg_bodyText, R.attr.clg_clickableBackground, R.attr.clg_disclosureArrow, R.attr.clg_dismissButton, R.attr.clg_floating, R.attr.clg_fullWidth, R.attr.clg_icon, R.attr.clg_iconAlignment, R.attr.clg_image, R.attr.clg_largeTitle, R.attr.clg_mainButtonIcon, R.attr.clg_mainButtonText, R.attr.clg_showAnchor, R.attr.clg_titleText};

    /* renamed from: f */
    public static final int[] f28639f = {R.attr.clg_drawableType, R.attr.clg_small};

    /* renamed from: g */
    public static final int[] f28640g = {R.attr.clg_checked, R.attr.clg_direction, R.attr.clg_enabled, R.attr.clg_helperText, R.attr.clg_metaText, R.attr.clg_small, R.attr.clg_text};

    /* renamed from: h */
    public static final int[] f28641h = {R.attr.bottomColor, R.attr.checked, R.attr.color};

    /* renamed from: i */
    public static final int[] f28642i = {R.attr.clg_descriptionEllipsize, R.attr.clg_descriptionText, R.attr.clg_isExpanded, R.attr.clg_isPopOut, R.attr.clg_largeTitle, R.attr.clg_showBottomDivider, R.attr.clg_titleText};

    /* renamed from: j */
    public static final int[] f28643j = {R.attr.clg_expandText, R.attr.clg_maxChars, R.attr.clg_removeLineBreaksWhenCollapsed, R.attr.clg_small, R.attr.clg_text, R.attr.clg_textColorAttr};

    /* renamed from: k */
    public static final int[] f28644k = {R.attr.clg_edgeType, R.attr.clg_position, R.attr.clg_size};

    /* renamed from: l */
    public static final int[] f28645l = {R.attr.clg_bodyText, R.attr.clg_iconSrc, R.attr.clg_primaryButtonText, R.attr.clg_secondaryButtonText, R.attr.clg_tertiaryButtonText, R.attr.clg_titleText};

    /* renamed from: m */
    public static final int[] f28646m = {R.attr.accessibilityHeadingView};

    /* renamed from: n */
    public static final int[] f28647n = {R.attr.clg_actionType, R.attr.clg_badgeCount, R.attr.clg_categoryImage, R.attr.clg_dragHandleVisible, R.attr.clg_enabled, R.attr.clg_helperText, R.attr.clg_icon, R.attr.clg_maxBadgeCount, R.attr.clg_metaText, R.attr.clg_selected, R.attr.clg_text};

    /* renamed from: o */
    public static final int[] f28648o = {R.attr.clg_countDirection};

    /* renamed from: p */
    public static final int[] f28649p = {R.attr.clg_checked, R.attr.clg_direction, R.attr.clg_enabled, R.attr.clg_helperText, R.attr.clg_metaText, R.attr.clg_showBottomDivider, R.attr.clg_small, R.attr.clg_text};

    /* renamed from: q */
    public static final int[] f28650q = {R.attr.clg_rating, R.attr.clg_star_size};

    /* renamed from: r */
    public static final int[] f28651r = {R.attr.clg_iconTint, R.attr.clg_rating, R.attr.clg_size};

    /* renamed from: s */
    public static final int[] f28652s = {16842766, 16843088, R.attr.clg_required, R.attr.clg_small, R.attr.errorText, R.attr.labelText};

    /* renamed from: t */
    public static final int[] f28653t = {R.attr.clg_checked, R.attr.clg_description, R.attr.clg_enabled, R.attr.clg_small, R.attr.clg_text};

    /* renamed from: u */
    public static final int[] f28654u = {R.attr.badgeCount, R.attr.badgeIcon};

    /* renamed from: v */
    public static final int[] f28655v = {R.attr.clg_tabBadgeMaxCount, R.attr.clg_tabBadgeStyle, R.attr.tabGravity, R.attr.tabMode};

    /* renamed from: w */
    public static final int[] f28656w = {16842766, 16843087, 16843088, 16843296, 16843364, R.attr.buttonText, R.attr.clg_small, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.endDrawable, R.attr.errorText, R.attr.helperText, R.attr.labelText, R.attr.multiLine, R.attr.required, R.attr.startDrawable};

    /* renamed from: x */
    public static final int[] f28657x = {R.attr.tooltipText};

    /* renamed from: y */
    public static final int[] f28658y = {R.attr.clg_colorScheme, R.attr.isLarge};

    /* renamed from: z */
    public static final int[] f28659z = {R.attr.clg_pageColor, R.attr.clg_selectedPageColor};

    /* renamed from: a */
    public static void m20712a(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & UnsignedInteger.INT_MASK;
            long j3 = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & UnsignedInteger.INT_MASK);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & UnsignedInteger.INT_MASK);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = ((((long) iArr[3]) & UnsignedInteger.INT_MASK) - j2) + j4;
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & UnsignedInteger.INT_MASK);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & UnsignedInteger.INT_MASK);
                iArr[5] = (int) j10;
                j8 = j10 >> 32;
            }
            long j11 = ((((long) iArr[6]) & UnsignedInteger.INT_MASK) - j2) + j8;
            iArr[6] = (int) j11;
            long j12 = (UnsignedInteger.INT_MASK & ((long) iArr[7])) + j2 + (j11 >> 32);
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || (iArr[7] == -1 && C3436p.m8227A(iArr, f28632D))) {
            m20714c(iArr);
        }
    }

    /* renamed from: b */
    public static void m20713b(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        C3436p.m8232F(iArr, iArr3);
        while (true) {
            m20717f(iArr3, iArr2);
            i--;
            if (i > 0) {
                C3436p.m8232F(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public static void m20714c(int[] iArr) {
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
        long j5 = ((((long) iArr[3]) & UnsignedInteger.INT_MASK) - 1) + j2;
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & UnsignedInteger.INT_MASK);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & UnsignedInteger.INT_MASK);
            iArr[5] = (int) j8;
            j6 = j8 >> 32;
        }
        long j9 = ((((long) iArr[6]) & UnsignedInteger.INT_MASK) - 1) + j6;
        iArr[6] = (int) j9;
        iArr[7] = (int) ((UnsignedInteger.INT_MASK & ((long) iArr[7])) + 1 + (j9 >> 32));
    }

    /* renamed from: d */
    public static void m20715d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        C3436p.m8230D(iArr, iArr2, iArr4);
        m20717f(iArr4, iArr3);
    }

    /* renamed from: e */
    public static void m20716e(Button button) {
        C19383o.m32797g(button, "button");
        if (C13007b.f28660a.mo18061a() && m20724m(button)) {
            CharSequence text = button.getText();
            boolean z = true;
            if (text == null || text.length() == 0) {
                CharSequence contentDescription = button.getContentDescription();
                if (contentDescription == null || contentDescription.length() == 0) {
                    button.setVisibility(4);
                    List<String> list = AccessibilityCapabilities.f19885a;
                    if (Build.VERSION.SDK_INT < 29) {
                        z = false;
                    }
                    if (z) {
                        StringBuilder h = C0072d.m201h("View with ");
                        h.append(C13352c.m21021a(button));
                        h.append(" on ");
                        h.append(C13352c.m21022b(button));
                        h.append(" requires to set attributes text or contentDescription to preserve accessibility.");
                        throw new EtsyAccessibilityException(h.toString());
                    }
                    StringBuilder h2 = C0072d.m201h("View with ");
                    h2.append(C13352c.m21021a(button));
                    h2.append(" requires to set attributes text or contentDescription to preserve accessibility.");
                    throw new EtsyAccessibilityException(h2.toString());
                }
            }
        }
    }

    /* renamed from: f */
    public static void m20717f(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[8]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr[9]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr[10]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr[11]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr[12]) & UnsignedInteger.INT_MASK;
        long j6 = ((long) iArr[13]) & UnsignedInteger.INT_MASK;
        long j7 = ((long) iArr[14]) & UnsignedInteger.INT_MASK;
        long j8 = ((long) iArr[15]) & UnsignedInteger.INT_MASK;
        long j9 = j - 6;
        long j10 = j9 + j2;
        long j11 = j2 + j3;
        long j12 = (j3 + j4) - j8;
        long j13 = j4 + j5;
        long j14 = j5 + j6;
        long j15 = j6 + j7;
        long j16 = j7 + j8;
        long j17 = j15 - j10;
        long j18 = j9;
        long j19 = (((((long) iArr[0]) & UnsignedInteger.INT_MASK) - j13) - j17) + 0;
        iArr3[0] = (int) j19;
        long j20 = j8;
        long j21 = ((((((long) iArr[1]) & UnsignedInteger.INT_MASK) + j11) - j14) - j16) + (j19 >> 32);
        iArr3[1] = (int) j21;
        long j22 = (((((long) iArr[2]) & UnsignedInteger.INT_MASK) + j12) - j15) + (j21 >> 32);
        iArr3[2] = (int) j22;
        long j23 = ((((((long) iArr[3]) & UnsignedInteger.INT_MASK) + (j13 << 1)) + j17) - j16) + (j22 >> 32);
        iArr3[3] = (int) j23;
        long j24 = ((((((long) iArr[4]) & UnsignedInteger.INT_MASK) + (j14 << 1)) + j7) - j11) + (j23 >> 32);
        iArr3[4] = (int) j24;
        long j25 = (((((long) iArr[5]) & UnsignedInteger.INT_MASK) + (j15 << 1)) - j12) + (j24 >> 32);
        iArr3[5] = (int) j25;
        long j26 = (((long) iArr[6]) & UnsignedInteger.INT_MASK) + (j16 << 1) + j17 + (j25 >> 32);
        iArr3[6] = (int) j26;
        long j27 = (((((((long) iArr[7]) & UnsignedInteger.INT_MASK) + (j20 << 1)) + j18) - j12) - j14) + (j26 >> 32);
        iArr3[7] = (int) j27;
        m20712a((int) ((j27 >> 32) + 6), iArr3);
    }

    /* renamed from: g */
    public static void m20718g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e(Constants.APPBOY_PUSH_CONTENT_KEY, str + ": glError " + glGetError);
            throw new RuntimeException(str + ": glError " + glGetError);
        }
    }

    /* renamed from: h */
    public static void m20719h(View view) {
        CharSequence contentDescription = view.getContentDescription();
        boolean z = false;
        if (contentDescription == null || contentDescription.length() == 0) {
            view.setVisibility(4);
            List<String> list = AccessibilityCapabilities.f19885a;
            if (Build.VERSION.SDK_INT >= 29) {
                z = true;
            }
            if (z) {
                StringBuilder h = C0072d.m201h("View with ");
                h.append(C13352c.m21021a(view));
                h.append(" on ");
                h.append(C13352c.m21022b(view));
                h.append(" requires to set attributes contentDescription or importantForAccessibility=no to preserve accessibility.");
                throw new EtsyAccessibilityException(h.toString());
            }
            StringBuilder h2 = C0072d.m201h("View with ");
            h2.append(C13352c.m21021a(view));
            h2.append(" requires to set attributes contentDescription or importantForAccessibility=no to preserve accessibility.");
            throw new EtsyAccessibilityException(h2.toString());
        }
    }

    /* renamed from: i */
    public static void m20720i(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        C3436p.m8232F(iArr, iArr3);
        m20717f(iArr3, iArr2);
    }

    /* renamed from: j */
    public static void m20721j(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C3436p.m8238L(iArr, iArr2, iArr3) != 0) {
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
            long j5 = (((long) iArr3[3]) & UnsignedInteger.INT_MASK) + 1 + j2;
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (((long) iArr3[4]) & UnsignedInteger.INT_MASK);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (((long) iArr3[5]) & UnsignedInteger.INT_MASK);
                iArr3[5] = (int) j8;
                j6 = j8 >> 32;
            }
            long j9 = (((long) iArr3[6]) & UnsignedInteger.INT_MASK) + 1 + j6;
            iArr3[6] = (int) j9;
            iArr3[7] = (int) (((UnsignedInteger.INT_MASK & ((long) iArr3[7])) - 1) + (j9 >> 32));
        }
    }

    /* renamed from: k */
    public static void m20722k(ImageButton imageButton) {
        C19383o.m32797g(imageButton, "imageButton");
        if (C13007b.f28660a.mo18061a() && m20724m(imageButton)) {
            m20719h(imageButton);
        }
    }

    /* renamed from: l */
    public static void m20723l(ImageView imageView) {
        C19383o.m32797g(imageView, "imageView");
        if (C13007b.f28660a.mo18061a() && m20724m(imageView)) {
            m20719h(imageView);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m20724m(android.view.View r8) {
        /*
            boolean r0 = r8.isAttachedToWindow()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0114
            java.util.List<java.lang.String> r0 = com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.f19885a
            android.content.Context r0 = r8.getContext()
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r3 = "view.context.packageName"
            kotlin.jvm.internal.C19383o.m32796f(r0, r3)
            java.util.List<java.lang.String> r3 = com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.f19885a
            java.util.Iterator r3 = r3.iterator()
        L_0x001d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0031
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.C19457k.m33025c1(r0, r4, r1)
            if (r4 == 0) goto L_0x001d
            r0 = r1
            goto L_0x0032
        L_0x0031:
            r0 = r2
        L_0x0032:
            if (r0 == 0) goto L_0x00fe
            java.lang.String r0 = p435rb.C13352c.m21021a(r8)
            java.lang.String r3 = "/"
            java.lang.String[] r4 = new java.lang.String[]{r3}
            r5 = 6
            java.util.List r0 = kotlin.text.C19459m.m33056y1(r0, r4, r1, r5)
            int r4 = r0.size()
            if (r4 <= r2) goto L_0x004b
            r4 = r2
            goto L_0x004c
        L_0x004b:
            r4 = r1
        L_0x004c:
            r6 = 0
            if (r4 == 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r0 = r6
        L_0x0051:
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00b3
            java.lang.String r4 = p435rb.C13352c.m21022b(r8)
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.util.List r3 = kotlin.text.C19459m.m33056y1(r4, r3, r1, r5)
            int r4 = r3.size()
            if (r4 <= r2) goto L_0x006f
            r4 = r2
            goto L_0x0070
        L_0x006f:
            r4 = r1
        L_0x0070:
            if (r4 == 0) goto L_0x0073
            r6 = r3
        L_0x0073:
            if (r6 == 0) goto L_0x007d
            java.lang.Object r3 = r6.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x007f
        L_0x007d:
            java.lang.String r3 = ""
        L_0x007f:
            java.util.List<java.lang.String> r4 = com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.f19886b
            java.util.Iterator r4 = r4.iterator()
        L_0x0085:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00f9
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r0.length()
            int r7 = r5.length()
            if (r6 < r7) goto L_0x00a2
            boolean r6 = kotlin.text.C19457k.m33025c1(r0, r5, r1)
            if (r6 == 0) goto L_0x00a2
            goto L_0x00f7
        L_0x00a2:
            int r6 = r3.length()
            int r7 = r5.length()
            if (r6 < r7) goto L_0x0085
            boolean r5 = kotlin.text.C19457k.m33025c1(r3, r5, r1)
            if (r5 == 0) goto L_0x0085
            goto L_0x00f7
        L_0x00b3:
            java.lang.String r0 = p435rb.C13352c.m21022b(r8)
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.util.List r0 = kotlin.text.C19459m.m33056y1(r0, r3, r1, r5)
            int r3 = r0.size()
            if (r3 <= r2) goto L_0x00c7
            r3 = r2
            goto L_0x00c8
        L_0x00c7:
            r3 = r1
        L_0x00c8:
            if (r3 == 0) goto L_0x00cb
            r6 = r0
        L_0x00cb:
            if (r6 == 0) goto L_0x00f9
            java.lang.Object r0 = r6.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00f9
            java.util.List<java.lang.String> r3 = com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.f19886b
            java.util.Iterator r3 = r3.iterator()
        L_0x00db:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00f9
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r0.length()
            int r6 = r4.length()
            if (r5 < r6) goto L_0x00db
            boolean r4 = kotlin.text.C19457k.m33025c1(r0, r4, r1)
            if (r4 == 0) goto L_0x00db
        L_0x00f7:
            r0 = r1
            goto L_0x00fa
        L_0x00f9:
            r0 = r2
        L_0x00fa:
            if (r0 == 0) goto L_0x00fe
            r0 = r2
            goto L_0x00ff
        L_0x00fe:
            r0 = r1
        L_0x00ff:
            if (r0 == 0) goto L_0x0114
            int r0 = r8.getVisibility()
            if (r0 != 0) goto L_0x0114
            int r0 = r8.getImportantForAccessibility()
            if (r0 == 0) goto L_0x0113
            int r8 = r8.getImportantForAccessibility()
            if (r8 != r2) goto L_0x0114
        L_0x0113:
            r1 = r2
        L_0x0114:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p388lb.C13006a.m20724m(android.view.View):boolean");
    }

    /* renamed from: o */
    public static int m20725o(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m20718g("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e(Constants.APPBOY_PUSH_CONTENT_KEY, "Could not compile shader " + i + MessageDraft.IMAGE_DELIMITER);
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e(Constants.APPBOY_PUSH_CONTENT_KEY, sb.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: n */
    public void mo20n(boolean z) {
        if (z) {
            int i = C13517k.f29573a;
            Class<C13517k> cls = C13517k.class;
            if (!C13080a.m20762b(cls)) {
                try {
                    FetchedAppSettingsManager.f27350e.add(new C13516j());
                    FetchedAppSettingsManager.m20105c();
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            }
        }
    }

    /* renamed from: p */
    public void mo19740p(int i, View view) {
        if (!f28631C) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f28630B = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f28631C = true;
        }
        Field field = f28630B;
        if (field != null) {
            try {
                f28630B.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
