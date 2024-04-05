package com.braze.p044ui.inappmessage.utils;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.C5483a;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;

/* renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer */
public final class BackgroundInAppMessagePreparer {

    /* renamed from: a */
    public static final BackgroundInAppMessagePreparer f12084a = new BackgroundInAppMessagePreparer();

    /* renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$a */
    public /* synthetic */ class C5676a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12085a;

        static {
            int[] iArr = new int[MessageType.values().length];
            iArr[MessageType.HTML_FULL.ordinal()] = 1;
            iArr[MessageType.HTML.ordinal()] = 2;
            iArr[MessageType.SLIDEUP.ordinal()] = 3;
            iArr[MessageType.MODAL.ordinal()] = 4;
            f12085a = iArr;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ee, code lost:
        if (r1 != false) goto L_0x0144;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.braze.models.inappmessage.C5483a m11459a(com.braze.models.inappmessage.C5483a r19) {
        /*
            r0 = r19
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer r7 = f12084a
            boolean r1 = r19.isControl()
            if (r1 == 0) goto L_0x0017
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            r3 = 0
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessage$1 r5 = com.braze.p044ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessage$1.INSTANCE
            r6 = 7
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            goto L_0x0235
        L_0x0017:
            com.braze.support.BrazeLogger r8 = com.braze.support.BrazeLogger.f11932a
            r3 = 0
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessage$2 r5 = com.braze.p044ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessage$2.INSTANCE
            r6 = 7
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            com.braze.enums.inappmessage.MessageType r1 = r19.mo16002R()
            int[] r2 = com.braze.p044ui.inappmessage.utils.BackgroundInAppMessagePreparer.C5676a.f12085a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r10 = 1
            r11 = 0
            if (r1 == r10) goto L_0x018a
            r3 = 2
            if (r1 == r3) goto L_0x0159
            boolean r1 = r0 instanceof com.braze.models.inappmessage.C5487e
            if (r1 != 0) goto L_0x0046
            r3 = 0
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$1 r5 = com.braze.p044ui.inappmessage.utils.C5680x2a03dedc.INSTANCE
            r6 = 7
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            goto L_0x0142
        L_0x0046:
            r12 = r0
            com.braze.models.inappmessage.e r12 = (com.braze.models.inappmessage.C5487e) r12
            android.graphics.Bitmap r1 = r12.mo16033w()
            if (r1 == 0) goto L_0x005f
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.I
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$2 r5 = com.braze.p044ui.inappmessage.utils.C5681x2a03dedd.INSTANCE
            r6 = 6
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            r12.mo16035y()
            goto L_0x0144
        L_0x005f:
            com.braze.enums.inappmessage.MessageType r1 = r19.mo16002R()
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 3
            if (r1 == r2) goto L_0x0075
            r2 = 4
            if (r1 == r2) goto L_0x0072
            com.braze.enums.BrazeViewBounds r1 = com.braze.enums.BrazeViewBounds.NO_BOUNDS
            goto L_0x0077
        L_0x0072:
            com.braze.enums.BrazeViewBounds r1 = com.braze.enums.BrazeViewBounds.IN_APP_MESSAGE_MODAL
            goto L_0x0077
        L_0x0075:
            com.braze.enums.BrazeViewBounds r1 = com.braze.enums.BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP
        L_0x0077:
            r13 = r1
            g4.b r1 = p114g4.C6861b.m13319e()
            android.content.Context r14 = r1.f15221c
            if (r14 != 0) goto L_0x008d
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$3 r5 = com.braze.p044ui.inappmessage.utils.C5682x2a03dede.INSTANCE
            r6 = 6
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            goto L_0x0142
        L_0x008d:
            com.braze.Braze$Companion r1 = com.braze.Braze.f11170m
            com.braze.Braze r1 = r1.mo15515f(r14)
            com.braze.images.a r15 = r1.mo15499n()
            java.lang.String r6 = r12.mo16031A()
            if (r6 == 0) goto L_0x00a6
            boolean r1 = kotlin.text.C19457k.m33020X0(r6)
            if (r1 == 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r1 = r11
            goto L_0x00a7
        L_0x00a6:
            r1 = r10
        L_0x00a7:
            java.lang.String r5 = "imageUrl"
            if (r1 != 0) goto L_0x00f1
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.I
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$handleLocalImage$1 r4 = new com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$handleLocalImage$1
            r4.<init>(r6)
            r16 = 0
            r17 = 6
            r1 = r8
            r2 = r7
            r18 = r4
            r4 = r16
            r9 = r5
            r5 = r18
            r10 = r6
            r6 = r17
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            r1 = r15
            com.braze.images.DefaultBrazeImageLoader r1 = (com.braze.images.DefaultBrazeImageLoader) r1
            kotlin.jvm.internal.C19383o.m32797g(r10, r9)
            android.graphics.Bitmap r1 = r1.mo15921b(r14, r10, r13)
            r12.mo16036z(r1)
            android.graphics.Bitmap r1 = r12.mo16033w()
            if (r1 == 0) goto L_0x00dd
            r12.mo16035y()
            r1 = 1
            goto L_0x00ee
        L_0x00dd:
            r3 = 0
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$handleLocalImage$2 r5 = new com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$handleLocalImage$2
            r5.<init>(r10)
            r6 = 7
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            r12.mo16034x()
            r1 = r11
        L_0x00ee:
            if (r1 == 0) goto L_0x00f2
            goto L_0x0144
        L_0x00f1:
            r9 = r5
        L_0x00f2:
            java.lang.String r10 = r12.mo16032v()
            if (r10 == 0) goto L_0x0101
            boolean r1 = kotlin.text.C19457k.m33020X0(r10)
            if (r1 == 0) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r1 = r11
            goto L_0x0102
        L_0x0101:
            r1 = 1
        L_0x0102:
            if (r1 != 0) goto L_0x0128
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.I
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$4 r5 = new com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$4
            r5.<init>(r10)
            r6 = 6
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            com.braze.images.DefaultBrazeImageLoader r15 = (com.braze.images.DefaultBrazeImageLoader) r15
            kotlin.jvm.internal.C19383o.m32797g(r10, r9)
            android.graphics.Bitmap r1 = r15.mo15921b(r14, r10, r13)
            r12.mo16036z(r1)
            android.graphics.Bitmap r1 = r12.mo16033w()
            if (r1 == 0) goto L_0x0142
            r12.mo16035y()
            goto L_0x0144
        L_0x0128:
            com.braze.support.BrazeLogger$Priority r9 = com.braze.support.BrazeLogger.Priority.W
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$5 r5 = com.braze.p044ui.inappmessage.utils.C5684x2a03dee0.INSTANCE
            r6 = 6
            r1 = r8
            r2 = r7
            r3 = r9
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            boolean r1 = r12 instanceof com.braze.models.inappmessage.C5489g
            if (r1 == 0) goto L_0x0144
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$6 r5 = com.braze.p044ui.inappmessage.utils.C5685x2a03dee1.INSTANCE
            r6 = 6
            r1 = r8
            r2 = r7
            r3 = r9
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
        L_0x0142:
            r10 = r11
            goto L_0x0145
        L_0x0144:
            r10 = 1
        L_0x0145:
            if (r10 != 0) goto L_0x0235
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessage$4 r5 = com.braze.p044ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessage$4.INSTANCE
            r6 = 6
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            com.braze.enums.inappmessage.InAppMessageFailureType r1 = com.braze.enums.inappmessage.InAppMessageFailureType.IMAGE_DOWNLOAD
            r0.mo15953F(r1)
            goto L_0x0234
        L_0x0159:
            r1 = r0
            com.braze.models.inappmessage.h r1 = (com.braze.models.inappmessage.C5490h) r1
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f11842C
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0170
            r3 = 0
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithHtml$1 r5 = com.braze.p044ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithHtml$1.INSTANCE
            r6 = 7
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            goto L_0x0235
        L_0x0170:
            java.lang.String r2 = r1.f11753d
            if (r2 != 0) goto L_0x0180
            r3 = 0
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithHtml$2 r5 = com.braze.p044ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithHtml$2.INSTANCE
            r6 = 7
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            goto L_0x0235
        L_0x0180:
            java.util.Map<java.lang.String, java.lang.String> r3 = r1.f11842C
            java.lang.String r2 = com.braze.support.WebContentUtils.m11365c(r2, r3)
            r1.f11753d = r2
            goto L_0x0235
        L_0x018a:
            r9 = r0
            com.braze.models.inappmessage.f r9 = (com.braze.models.inappmessage.C5488f) r9
            java.lang.String r1 = r9.mo16007B()
            if (r1 == 0) goto L_0x019c
            boolean r2 = kotlin.text.C19457k.m33020X0(r1)
            if (r2 == 0) goto L_0x019a
            goto L_0x019c
        L_0x019a:
            r2 = r11
            goto L_0x019d
        L_0x019c:
            r2 = 1
        L_0x019d:
            if (r2 != 0) goto L_0x01b9
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x01b9
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.I
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$1 r5 = new com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$1
            r5.<init>(r1)
            r6 = 6
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            goto L_0x0211
        L_0x01b9:
            java.lang.String r1 = r9.mo16037V()
            if (r1 == 0) goto L_0x01c8
            boolean r2 = kotlin.text.C19457k.m33020X0(r1)
            if (r2 == 0) goto L_0x01c6
            goto L_0x01c8
        L_0x01c6:
            r2 = r11
            goto L_0x01c9
        L_0x01c8:
            r2 = 1
        L_0x01c9:
            if (r2 == 0) goto L_0x01d7
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.I
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$2 r5 = com.braze.p044ui.inappmessage.utils.C5687xc279f323.INSTANCE
            r6 = 6
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            goto L_0x0211
        L_0x01d7:
            g4.b r2 = p114g4.C6861b.m13319e()
            android.content.Context r2 = r2.f15221c
            if (r2 != 0) goto L_0x01eb
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$3 r5 = com.braze.p044ui.inappmessage.utils.C5688xc279f324.INSTANCE
            r6 = 6
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            goto L_0x0221
        L_0x01eb:
            java.io.File r2 = com.braze.support.WebContentUtils.m11363a(r2)
            java.lang.String r10 = com.braze.support.WebContentUtils.m11364b(r2, r1)
            if (r10 == 0) goto L_0x01fe
            boolean r1 = kotlin.text.C19457k.m33020X0(r10)
            if (r1 == 0) goto L_0x01fc
            goto L_0x01fe
        L_0x01fc:
            r1 = r11
            goto L_0x01ff
        L_0x01fe:
            r1 = 1
        L_0x01ff:
            if (r1 != 0) goto L_0x0213
            r3 = 0
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$4 r5 = new com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$4
            r5.<init>(r10)
            r6 = 7
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            r9.mo16008C(r10)
        L_0x0211:
            r10 = 1
            goto L_0x0222
        L_0x0213:
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$5 r5 = new com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$5
            r5.<init>(r9, r10)
            r6 = 6
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
        L_0x0221:
            r10 = r11
        L_0x0222:
            if (r10 != 0) goto L_0x0235
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            r4 = 0
            com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessage$3 r5 = com.braze.p044ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessage$3.INSTANCE
            r6 = 6
            r1 = r8
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            com.braze.enums.inappmessage.InAppMessageFailureType r1 = com.braze.enums.inappmessage.InAppMessageFailureType.ZIP_ASSET_DOWNLOAD
            r0.mo15953F(r1)
        L_0x0234:
            r0 = 0
        L_0x0235:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.p044ui.inappmessage.utils.BackgroundInAppMessagePreparer.m11459a(com.braze.models.inappmessage.a):com.braze.models.inappmessage.a");
    }

    /* renamed from: b */
    public static final void m11460b(C5483a aVar) {
        C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(aVar, (C19340c<? super BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1>) null), 3);
    }
}
