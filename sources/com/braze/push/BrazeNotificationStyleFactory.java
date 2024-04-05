package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.Constants;
import com.appboy.models.push.BrazeNotificationPayload;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.push.support.HtmlUtils;
import com.braze.support.IntentUtils;
import kotlin.jvm.internal.C19383o;
import p250u0.C8095k;
import p250u0.C8100m;
import p250u0.C8105q;

public class BrazeNotificationStyleFactory {
    private static final int BIG_PICTURE_STYLE_IMAGE_HEIGHT = 192;
    public static final Companion Companion = new Companion();
    private static final String STORY_SET_GRAVITY = "setGravity";
    private static final String STORY_SET_VISIBILITY = "setVisibility";

    public static final class Companion {
        /* renamed from: a */
        public static PendingIntent m11196a(Context context, Bundle bundle, int i) {
            Intent intent = new Intent(Constants.APPBOY_STORY_TRAVERSE_CLICKED_ACTION).setClass(context, BrazeNotificationUtils.m11200b());
            C19383o.m32796f(intent, "Intent(Constants.BRAZE_S…otificationReceiverClass)");
            if (bundle != null) {
                bundle.putInt(Constants.APPBOY_STORY_INDEX_KEY, i);
                intent.putExtras(bundle);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, IntentUtils.m11307b(), intent, 1140850688);
            C19383o.m32796f(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }

        /* renamed from: b */
        public static void m11197b(C8095k kVar, BrazeNotificationPayload brazeNotificationPayload) {
            String contentText;
            C19383o.m32797g(kVar, "bigPictureNotificationStyle");
            C19383o.m32797g(brazeNotificationPayload, "payload");
            BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider != null) {
                String bigSummaryText = brazeNotificationPayload.getBigSummaryText();
                String bigTitleText = brazeNotificationPayload.getBigTitleText();
                String summaryText = brazeNotificationPayload.getSummaryText();
                if (bigSummaryText != null) {
                    kVar.f17694c = C8100m.m16287c(HtmlUtils.m11217a(bigSummaryText, configurationProvider));
                    kVar.f17695d = true;
                }
                if (bigTitleText != null) {
                    kVar.f17693b = C8100m.m16287c(HtmlUtils.m11217a(bigTitleText, configurationProvider));
                }
                if (summaryText == null && bigSummaryText == null && (contentText = brazeNotificationPayload.getContentText()) != null) {
                    kVar.f17694c = C8100m.m16287c(HtmlUtils.m11217a(contentText, configurationProvider));
                    kVar.f17695d = true;
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: u0.n} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: u0.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: u0.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: u0.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: u0.p} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: u0.k} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: u0.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: u0.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: u0.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: u0.p} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: com.braze.push.BrazeNotificationStyleFactory$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: u0.n} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: u0.p} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: u0.n} */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x0474  */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x04c2  */
        /* JADX WARNING: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0186  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0194  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo16052c(p250u0.C8100m r18, com.appboy.models.push.BrazeNotificationPayload r19) {
            /*
                r17 = this;
                r1 = r18
                r2 = r19
                java.lang.String r0 = "notificationBuilder"
                kotlin.jvm.internal.C19383o.m32797g(r1, r0)
                java.lang.String r0 = "payload"
                kotlin.jvm.internal.C19383o.m32797g(r2, r0)
                boolean r0 = r19.isPushStory()
                r4 = 1
                if (r0 == 0) goto L_0x01c0
                android.content.Context r0 = r19.getContext()
                if (r0 == 0) goto L_0x01c0
                com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.f11932a
                r7 = 0
                r8 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$1 r9 = com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$1.INSTANCE
                r10 = 7
                r5 = r0
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                android.content.Context r11 = r19.getContext()
                if (r11 != 0) goto L_0x003b
                r7 = 0
                r8 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getStoryStyle$1 r9 = com.braze.push.BrazeNotificationStyleFactory$Companion$getStoryStyle$1.INSTANCE
                r10 = 7
                r5 = r0
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                goto L_0x0471
            L_0x003b:
                java.util.List r12 = r19.getPushStoryPages()
                int r13 = r19.getPushStoryPageIndex()
                java.lang.Object r5 = r12.get(r13)
                com.appboy.models.push.BrazeNotificationPayload$PushStoryPage r5 = (com.appboy.models.push.BrazeNotificationPayload.PushStoryPage) r5
                android.widget.RemoteViews r14 = new android.widget.RemoteViews
                java.lang.String r6 = r11.getPackageName()
                int r7 = com.appboy.p043ui.C4940R.C4943layout.com_braze_push_story_one_image
                r14.<init>(r6, r7)
                android.content.Context r6 = r19.getContext()
                r15 = 8
                if (r6 != 0) goto L_0x0068
                r7 = 0
                r8 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$1 r9 = com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$1.INSTANCE
                r10 = 7
                r5 = r0
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                goto L_0x00af
            L_0x0068:
                com.braze.configuration.BrazeConfigurationProvider r7 = r19.getConfigurationProvider()
                if (r7 != 0) goto L_0x007a
                r7 = 0
                r8 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$2 r9 = com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$2.INSTANCE
                r10 = 7
                r5 = r0
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                goto L_0x00af
            L_0x007a:
                java.lang.String r8 = r5.getBitmapUrl()
                if (r8 == 0) goto L_0x0089
                boolean r9 = kotlin.text.C19457k.m33020X0(r8)
                if (r9 == 0) goto L_0x0087
                goto L_0x0089
            L_0x0087:
                r9 = 0
                goto L_0x008a
            L_0x0089:
                r9 = r4
            L_0x008a:
                if (r9 == 0) goto L_0x0098
                r7 = 0
                r8 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$3 r9 = com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$3.INSTANCE
                r10 = 7
                r5 = r0
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                goto L_0x00af
            L_0x0098:
                r19.getNotificationExtras()
                com.braze.Braze$Companion r9 = com.braze.Braze.f11170m
                com.braze.Braze r9 = r9.mo15515f(r6)
                com.braze.images.a r9 = r9.mo15499n()
                com.braze.enums.BrazeViewBounds r10 = com.braze.enums.BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY
                com.braze.images.DefaultBrazeImageLoader r9 = (com.braze.images.DefaultBrazeImageLoader) r9
                android.graphics.Bitmap r8 = r9.mo15922c(r6, r8, r10)
                if (r8 != 0) goto L_0x00b2
            L_0x00af:
                r3 = 0
                goto L_0x0184
            L_0x00b2:
                int r9 = com.appboy.p043ui.C4940R.C4942id.com_braze_story_image_view
                r14.setImageViewBitmap(r9, r8)
                java.lang.String r8 = r5.getTitle()
                if (r8 == 0) goto L_0x00c6
                boolean r9 = kotlin.text.C19457k.m33020X0(r8)
                if (r9 == 0) goto L_0x00c4
                goto L_0x00c6
            L_0x00c4:
                r9 = 0
                goto L_0x00c7
            L_0x00c6:
                r9 = r4
            L_0x00c7:
                java.lang.String r10 = "setGravity"
                java.lang.String r3 = "setVisibility"
                if (r9 != 0) goto L_0x00e0
                java.lang.CharSequence r8 = com.braze.push.support.HtmlUtils.m11217a(r8, r7)
                int r9 = com.appboy.p043ui.C4940R.C4942id.com_braze_story_text_view
                r14.setTextViewText(r9, r8)
                int r8 = r5.getTitleGravity()
                int r9 = com.appboy.p043ui.C4940R.C4942id.com_braze_story_text_view_container
                r14.setInt(r9, r10, r8)
                goto L_0x00e5
            L_0x00e0:
                int r8 = com.appboy.p043ui.C4940R.C4942id.com_braze_story_text_view_container
                r14.setInt(r8, r3, r15)
            L_0x00e5:
                java.lang.String r8 = r5.getSubtitle()
                if (r8 == 0) goto L_0x00f5
                boolean r9 = kotlin.text.C19457k.m33020X0(r8)
                if (r9 == 0) goto L_0x00f2
                goto L_0x00f5
            L_0x00f2:
                r16 = 0
                goto L_0x00f7
            L_0x00f5:
                r16 = r4
            L_0x00f7:
                if (r16 != 0) goto L_0x010c
                java.lang.CharSequence r3 = com.braze.push.support.HtmlUtils.m11217a(r8, r7)
                int r7 = com.appboy.p043ui.C4940R.C4942id.com_braze_story_text_view_small
                r14.setTextViewText(r7, r3)
                int r3 = r5.getSubtitleGravity()
                int r7 = com.appboy.p043ui.C4940R.C4942id.com_braze_story_text_view_small_container
                r14.setInt(r7, r10, r3)
                goto L_0x0111
            L_0x010c:
                int r7 = com.appboy.p043ui.C4940R.C4942id.com_braze_story_text_view_small_container
                r14.setInt(r7, r3, r15)
            L_0x0111:
                android.content.Intent r3 = new android.content.Intent
                java.lang.String r7 = "com.appboy.action.APPBOY_STORY_CLICKED"
                r3.<init>(r7)
                java.lang.Class<com.braze.push.NotificationTrampolineActivity> r7 = com.braze.push.NotificationTrampolineActivity.class
                android.content.Intent r3 = r3.setClass(r6, r7)
                java.lang.String r7 = "Intent(Constants.BRAZE_S…lineActivity::class.java)"
                kotlin.jvm.internal.C19383o.m32796f(r3, r7)
                int r7 = r3.getFlags()
                com.braze.IBrazeDeeplinkHandler$IntentFlagPurpose r8 = com.braze.IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK
                java.lang.String r9 = "intentFlagPurpose"
                kotlin.jvm.internal.C19383o.m32797g(r8, r9)
                int[] r9 = com.braze.p044ui.BrazeDeeplinkHandler.C5622a.f12012a
                int r8 = r8.ordinal()
                r8 = r9[r8]
                switch(r8) {
                    case 1: goto L_0x0145;
                    case 2: goto L_0x0145;
                    case 3: goto L_0x0142;
                    case 4: goto L_0x0142;
                    case 5: goto L_0x0142;
                    case 6: goto L_0x013f;
                    case 7: goto L_0x013f;
                    default: goto L_0x0139;
                }
            L_0x0139:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            L_0x013f:
                r8 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x0147
            L_0x0142:
                r8 = 872415232(0x34000000, float:1.1920929E-7)
                goto L_0x0147
            L_0x0145:
                r8 = 1073741824(0x40000000, float:2.0)
            L_0x0147:
                r7 = r7 | r8
                r3.setFlags(r7)
                java.lang.String r7 = r5.getDeeplink()
                java.lang.String r8 = "appboy_action_uri"
                r3.putExtra(r8, r7)
                java.lang.String r7 = r5.getUseWebview()
                java.lang.String r8 = "appboy_action_use_webview"
                r3.putExtra(r8, r7)
                java.lang.String r7 = r5.getStoryPageId()
                java.lang.String r8 = "appboy_story_page_id"
                r3.putExtra(r8, r7)
                java.lang.String r5 = r5.getCampaignId()
                java.lang.String r7 = "appboy_campaign_id"
                r3.putExtra(r7, r5)
                int r5 = com.braze.support.IntentUtils.m11307b()
                r7 = 67108864(0x4000000, float:1.5046328E-36)
                android.app.PendingIntent r3 = android.app.PendingIntent.getActivity(r6, r5, r3, r7)
                java.lang.String r5 = "getActivity(\n           …tentFlags()\n            )"
                kotlin.jvm.internal.C19383o.m32796f(r3, r5)
                int r5 = com.appboy.p043ui.C4940R.C4942id.com_braze_story_relative_layout
                r14.setOnClickPendingIntent(r5, r3)
                r3 = r4
            L_0x0184:
                if (r3 != 0) goto L_0x0194
                com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.W
                r8 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getStoryStyle$2 r9 = com.braze.push.BrazeNotificationStyleFactory$Companion$getStoryStyle$2.INSTANCE
                r10 = 6
                r5 = r0
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                goto L_0x0471
            L_0x0194:
                android.os.Bundle r0 = r19.getNotificationExtras()
                u0.n r3 = new u0.n
                r3.<init>()
                int r5 = r12.size()
                int r6 = r13 + -1
                int r6 = r6 + r5
                int r6 = r6 % r5
                android.app.PendingIntent r6 = m11196a(r11, r0, r6)
                int r7 = com.appboy.p043ui.C4940R.C4942id.com_braze_story_button_previous
                r14.setOnClickPendingIntent(r7, r6)
                int r13 = r13 + r4
                int r13 = r13 % r5
                android.app.PendingIntent r0 = m11196a(r11, r0, r13)
                int r5 = com.appboy.p043ui.C4940R.C4942id.com_braze_story_button_next
                r14.setOnClickPendingIntent(r5, r0)
                r1.f17681y = r14
                r1.mo20693g(r15, r4)
                goto L_0x0472
            L_0x01c0:
                boolean r0 = r19.isConversationalPush()
                if (r0 == 0) goto L_0x0275
                com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.f11932a
                r7 = 0
                r8 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$2 r9 = com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$2.INSTANCE
                r10 = 7
                r5 = r0
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                java.util.Map r3 = r19.getConversationPersonMap()     // Catch:{ Exception -> 0x0265 }
                java.lang.String r5 = r19.getConversationReplyPersonId()     // Catch:{ Exception -> 0x0265 }
                java.lang.Object r5 = r3.get(r5)     // Catch:{ Exception -> 0x0265 }
                com.appboy.models.push.BrazeNotificationPayload$ConversationPerson r5 = (com.appboy.models.push.BrazeNotificationPayload.ConversationPerson) r5     // Catch:{ Exception -> 0x0265 }
                if (r5 != 0) goto L_0x01f0
                r7 = 0
                r8 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$1 r9 = com.braze.push.C5510xcfb3563c.INSTANCE     // Catch:{ Exception -> 0x0265 }
                r10 = 7
                r5 = r0
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0265 }
                goto L_0x0471
            L_0x01f0:
                u0.p r0 = new u0.p     // Catch:{ Exception -> 0x0265 }
                u0.u r5 = r5.getPerson()     // Catch:{ Exception -> 0x0265 }
                r0.<init>(r5)     // Catch:{ Exception -> 0x0265 }
                java.util.List r5 = r19.getConversationMessages()     // Catch:{ Exception -> 0x0265 }
                java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0265 }
            L_0x0201:
                boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x0265 }
                if (r6 == 0) goto L_0x0251
                java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x0265 }
                com.appboy.models.push.BrazeNotificationPayload$ConversationMessage r6 = (com.appboy.models.push.BrazeNotificationPayload.ConversationMessage) r6     // Catch:{ Exception -> 0x0265 }
                java.lang.String r7 = r6.getPersonId()     // Catch:{ Exception -> 0x0265 }
                java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x0265 }
                com.appboy.models.push.BrazeNotificationPayload$ConversationPerson r7 = (com.appboy.models.push.BrazeNotificationPayload.ConversationPerson) r7     // Catch:{ Exception -> 0x0265 }
                if (r7 != 0) goto L_0x022a
                com.braze.support.BrazeLogger r8 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x0265 }
                r10 = 0
                r11 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$2 r12 = new com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$2     // Catch:{ Exception -> 0x0265 }
                r12.<init>(r6)     // Catch:{ Exception -> 0x0265 }
                r13 = 7
                r9 = r17
                com.braze.support.BrazeLogger.m11282d(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0265 }
                goto L_0x0471
            L_0x022a:
                java.lang.String r8 = r6.getMessage()     // Catch:{ Exception -> 0x0265 }
                long r9 = r6.getTimestamp()     // Catch:{ Exception -> 0x0265 }
                u0.u r6 = r7.getPerson()     // Catch:{ Exception -> 0x0265 }
                u0.p$a r7 = new u0.p$a     // Catch:{ Exception -> 0x0265 }
                r7.<init>(r8, r9, r6)     // Catch:{ Exception -> 0x0265 }
                java.util.ArrayList r6 = r0.f17684e     // Catch:{ Exception -> 0x0265 }
                r6.add(r7)     // Catch:{ Exception -> 0x0265 }
                java.util.ArrayList r6 = r0.f17684e     // Catch:{ Exception -> 0x0265 }
                int r6 = r6.size()     // Catch:{ Exception -> 0x0265 }
                r7 = 25
                if (r6 <= r7) goto L_0x0201
                java.util.ArrayList r6 = r0.f17684e     // Catch:{ Exception -> 0x0265 }
                r7 = 0
                r6.remove(r7)     // Catch:{ Exception -> 0x0265 }
                goto L_0x0201
            L_0x0251:
                int r3 = r3.size()     // Catch:{ Exception -> 0x0265 }
                if (r3 <= r4) goto L_0x0259
                r3 = r4
                goto L_0x025a
            L_0x0259:
                r3 = 0
            L_0x025a:
                r0.mo20700h(r3)     // Catch:{ Exception -> 0x0265 }
                java.lang.String r3 = r19.getConversationShortcutId()     // Catch:{ Exception -> 0x0265 }
                r1.f17653A = r3     // Catch:{ Exception -> 0x0265 }
                goto L_0x0461
            L_0x0265:
                r0 = move-exception
                r8 = r0
                com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.f11932a
                com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.E
                com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$3 r9 = com.braze.push.C5512xcfb3563e.INSTANCE
                r10 = 4
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                goto L_0x0471
            L_0x0275:
                java.lang.String r0 = r19.getBigImageUrl()
                if (r0 == 0) goto L_0x0471
                int r0 = android.os.Build.VERSION.SDK_INT
                boolean r3 = r19.isInlineImagePush()
                if (r3 == 0) goto L_0x03bd
                com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.f11932a
                r7 = 0
                r8 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$3 r9 = com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$3.INSTANCE
                r10 = 7
                r5 = r3
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                android.content.Context r5 = r19.getContext()
                if (r5 != 0) goto L_0x02a3
                r7 = 0
                r8 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$1 r9 = com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$1.INSTANCE
                r10 = 7
                r5 = r3
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                goto L_0x0471
            L_0x02a3:
                java.lang.String r6 = r19.getBigImageUrl()
                if (r6 == 0) goto L_0x02b2
                boolean r7 = kotlin.text.C19457k.m33020X0(r6)
                if (r7 == 0) goto L_0x02b0
                goto L_0x02b2
            L_0x02b0:
                r7 = 0
                goto L_0x02b3
            L_0x02b2:
                r7 = r4
            L_0x02b3:
                if (r7 == 0) goto L_0x02c2
                r7 = 0
                r8 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$2 r9 = com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$2.INSTANCE
                r10 = 7
                r5 = r3
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                goto L_0x0471
            L_0x02c2:
                android.os.Bundle r7 = r19.getNotificationExtras()
                com.braze.Braze$Companion r8 = com.braze.Braze.f11170m
                com.braze.Braze r8 = r8.mo15515f(r5)
                com.braze.images.a r8 = r8.mo15499n()
                com.braze.enums.BrazeViewBounds r9 = com.braze.enums.BrazeViewBounds.NOTIFICATION_INLINE_PUSH_IMAGE
                com.braze.images.DefaultBrazeImageLoader r8 = (com.braze.images.DefaultBrazeImageLoader) r8
                android.graphics.Bitmap r6 = r8.mo15922c(r5, r6, r9)
                if (r6 != 0) goto L_0x02e7
                r7 = 0
                r8 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$3 r9 = com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$3.INSTANCE
                r10 = 7
                r5 = r3
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                goto L_0x0471
            L_0x02e7:
                r3 = 31
                if (r0 < r3) goto L_0x02f9
                android.content.Context r8 = r5.getApplicationContext()
                android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()
                int r8 = r8.targetSdkVersion
                if (r8 < r3) goto L_0x02f9
                r3 = r4
                goto L_0x02fa
            L_0x02f9:
                r3 = 0
            L_0x02fa:
                android.widget.RemoteViews r8 = new android.widget.RemoteViews
                java.lang.String r9 = r5.getPackageName()
                if (r3 == 0) goto L_0x0305
                int r10 = com.appboy.p043ui.C4940R.C4943layout.com_braze_push_inline_image_constrained
                goto L_0x0307
            L_0x0305:
                int r10 = com.appboy.p043ui.C4940R.C4943layout.com_braze_notification_inline_image
            L_0x0307:
                r8.<init>(r9, r10)
                com.braze.configuration.BrazeConfigurationProvider r9 = new com.braze.configuration.BrazeConfigurationProvider
                r9.<init>(r5)
                int r10 = r9.getSmallNotificationIconResourceId()
                android.graphics.drawable.Icon r10 = android.graphics.drawable.Icon.createWithResource(r5, r10)
                java.lang.String r11 = "createWithResource(\n    …nResourceId\n            )"
                kotlin.jvm.internal.C19383o.m32796f(r10, r11)
                java.lang.Integer r11 = r19.getAccentColor()
                if (r11 != 0) goto L_0x0323
                goto L_0x032a
            L_0x0323:
                int r11 = r11.intValue()
                r10.setTint(r11)
            L_0x032a:
                int r11 = com.appboy.p043ui.C4940R.C4942id.com_braze_inline_image_push_app_icon
                r8.setImageViewIcon(r11, r10)
                android.content.pm.PackageManager r10 = r5.getPackageManager()
                r11 = 33
                if (r0 < r11) goto L_0x0346
                java.lang.String r0 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x03ad }
                r11 = 0
                android.content.pm.PackageManager$ApplicationInfoFlags r5 = android.content.pm.PackageManager.ApplicationInfoFlags.of(r11)     // Catch:{ NameNotFoundException -> 0x03ad }
                android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x03ad }
                goto L_0x034f
            L_0x0346:
                java.lang.String r0 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x03ad }
                r5 = 0
                android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x03ad }
            L_0x034f:
                java.lang.String r5 = "{\n                if (Bu…          }\n            }"
                kotlin.jvm.internal.C19383o.m32796f(r0, r5)     // Catch:{ NameNotFoundException -> 0x03ad }
                java.lang.CharSequence r0 = r10.getApplicationLabel(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.CharSequence r0 = com.braze.push.support.HtmlUtils.m11217a(r0, r9)
                int r5 = com.appboy.p043ui.C4940R.C4942id.com_braze_inline_image_push_app_name_text
                r8.setTextViewText(r5, r0)
                int r0 = com.appboy.p043ui.C4940R.C4942id.com_braze_inline_image_push_time_text
                com.braze.enums.BrazeDateFormat r5 = com.braze.enums.BrazeDateFormat.CLOCK_12_HOUR
                java.lang.String r5 = com.braze.support.DateTimeUtils.m11301c(r5)
                r8.setTextViewText(r0, r5)
                java.lang.String r0 = "t"
                java.lang.String r0 = r7.getString(r0)
                if (r0 != 0) goto L_0x0377
                goto L_0x0380
            L_0x0377:
                int r5 = com.appboy.p043ui.C4940R.C4942id.com_braze_inline_image_push_title_text
                java.lang.CharSequence r0 = com.braze.push.support.HtmlUtils.m11217a(r0, r9)
                r8.setTextViewText(r5, r0)
            L_0x0380:
                java.lang.String r0 = "a"
                java.lang.String r0 = r7.getString(r0)
                if (r0 != 0) goto L_0x0389
                goto L_0x0392
            L_0x0389:
                int r5 = com.appboy.p043ui.C4940R.C4942id.com_braze_inline_image_push_content_text
                java.lang.CharSequence r0 = com.braze.push.support.HtmlUtils.m11217a(r0, r9)
                r8.setTextViewText(r5, r0)
            L_0x0392:
                r1.mo20692f(r8)
                if (r3 == 0) goto L_0x03a1
                r1.mo20694h(r6)
                u0.n r0 = new u0.n
                r0.<init>()
                goto L_0x0461
            L_0x03a1:
                int r0 = com.appboy.p043ui.C4940R.C4942id.com_braze_inline_image_push_side_image
                r8.setImageViewBitmap(r0, r6)
                com.braze.push.BrazeNotificationStyleFactory$a r0 = new com.braze.push.BrazeNotificationStyleFactory$a
                r0.<init>()
                goto L_0x0461
            L_0x03ad:
                r0 = move-exception
                r8 = r0
                com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.f11932a
                com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.E
                com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$applicationInfo$1 r9 = com.braze.push.C5513xbd76cf90.INSTANCE
                r10 = 4
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                goto L_0x0471
            L_0x03bd:
                r5 = 0
                com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.f11932a
                r13 = 0
                r14 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$4 r15 = com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$4.INSTANCE
                r16 = 7
                r11 = r0
                r12 = r17
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                android.content.Context r3 = r19.getContext()
                if (r3 != 0) goto L_0x03d4
                goto L_0x0471
            L_0x03d4:
                java.lang.String r6 = r19.getBigImageUrl()
                if (r6 == 0) goto L_0x03e0
                boolean r7 = kotlin.text.C19457k.m33020X0(r6)
                if (r7 == 0) goto L_0x03e1
            L_0x03e0:
                r5 = r4
            L_0x03e1:
                if (r5 == 0) goto L_0x03e5
                goto L_0x0471
            L_0x03e5:
                r19.getNotificationExtras()
                com.braze.Braze$Companion r5 = com.braze.Braze.f11170m
                com.braze.Braze r5 = r5.mo15515f(r3)
                com.braze.images.a r5 = r5.mo15499n()
                com.braze.enums.BrazeViewBounds r7 = com.braze.enums.BrazeViewBounds.NOTIFICATION_EXPANDED_IMAGE
                com.braze.images.DefaultBrazeImageLoader r5 = (com.braze.images.DefaultBrazeImageLoader) r5
                android.graphics.Bitmap r5 = r5.mo15922c(r3, r6, r7)
                if (r5 != 0) goto L_0x040c
                r13 = 0
                r14 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$1 r15 = new com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$1
                r15.<init>(r6)
                r16 = 7
                r11 = r0
                r12 = r17
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                goto L_0x0471
            L_0x040c:
                int r0 = r5.getWidth()     // Catch:{ Exception -> 0x0463 }
                int r6 = r5.getHeight()     // Catch:{ Exception -> 0x0463 }
                if (r0 <= r6) goto L_0x0447
                int r0 = com.braze.support.BrazeImageUtils.m11253c(r3)     // Catch:{ Exception -> 0x0463 }
                r6 = 192(0xc0, float:2.69E-43)
                int r0 = com.braze.support.BrazeImageUtils.m11255e(r0, r6)     // Catch:{ Exception -> 0x0463 }
                int r6 = r0 * 2
                kotlin.Pair r3 = com.braze.support.BrazeImageUtils.m11254d(r3)     // Catch:{ Exception -> 0x0463 }
                java.lang.Object r3 = r3.getSecond()     // Catch:{ Exception -> 0x0463 }
                java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ Exception -> 0x0463 }
                int r3 = r3.intValue()     // Catch:{ Exception -> 0x0463 }
                if (r6 <= r3) goto L_0x0433
                r6 = r3
            L_0x0433:
                android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r5, r6, r0, r4)     // Catch:{ Exception -> 0x0438 }
                goto L_0x0447
            L_0x0438:
                r0 = move-exception
                r3 = r0
                com.braze.support.BrazeLogger r6 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x0463 }
                com.braze.support.BrazeLogger$Priority r8 = com.braze.support.BrazeLogger.Priority.E     // Catch:{ Exception -> 0x0463 }
                com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$2 r10 = com.braze.push.C5507x631b905c.INSTANCE     // Catch:{ Exception -> 0x0463 }
                r11 = 4
                r7 = r17
                r9 = r3
                com.braze.support.BrazeLogger.m11282d(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0463 }
            L_0x0447:
                if (r5 != 0) goto L_0x0457
                com.braze.support.BrazeLogger r6 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x0463 }
                com.braze.support.BrazeLogger$Priority r8 = com.braze.support.BrazeLogger.Priority.I     // Catch:{ Exception -> 0x0463 }
                r9 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$3 r10 = com.braze.push.C5508x631b905d.INSTANCE     // Catch:{ Exception -> 0x0463 }
                r11 = 6
                r7 = r17
                com.braze.support.BrazeLogger.m11282d(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0463 }
                goto L_0x0471
            L_0x0457:
                u0.k r0 = new u0.k     // Catch:{ Exception -> 0x0463 }
                r0.<init>()     // Catch:{ Exception -> 0x0463 }
                r0.f17649e = r5     // Catch:{ Exception -> 0x0463 }
                m11197b(r0, r2)     // Catch:{ Exception -> 0x0463 }
            L_0x0461:
                r3 = r0
                goto L_0x0472
            L_0x0463:
                r0 = move-exception
                r8 = r0
                com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.f11932a
                com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.E
                com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$4 r9 = com.braze.push.C5509x631b905e.INSTANCE
                r10 = 4
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
            L_0x0471:
                r3 = 0
            L_0x0472:
                if (r3 != 0) goto L_0x04be
                com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.f11932a
                r7 = 0
                r8 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$5 r9 = com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$5.INSTANCE
                r10 = 7
                r6 = r17
                com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
                u0.l r3 = new u0.l
                r3.<init>()
                com.braze.configuration.BrazeConfigurationProvider r0 = r19.getConfigurationProvider()
                if (r0 != 0) goto L_0x048c
                goto L_0x04be
            L_0x048c:
                java.lang.String r5 = r19.getContentText()
                if (r5 != 0) goto L_0x0493
                goto L_0x049a
            L_0x0493:
                java.lang.CharSequence r5 = com.braze.push.support.HtmlUtils.m11217a(r5, r0)
                r3.mo20687h(r5)
            L_0x049a:
                java.lang.String r5 = r19.getBigSummaryText()
                if (r5 != 0) goto L_0x04a1
                goto L_0x04ad
            L_0x04a1:
                java.lang.CharSequence r5 = com.braze.push.support.HtmlUtils.m11217a(r5, r0)
                java.lang.CharSequence r5 = p250u0.C8100m.m16287c(r5)
                r3.f17694c = r5
                r3.f17695d = r4
            L_0x04ad:
                java.lang.String r2 = r19.getBigTitleText()
                if (r2 != 0) goto L_0x04b4
                goto L_0x04be
            L_0x04b4:
                java.lang.CharSequence r0 = com.braze.push.support.HtmlUtils.m11217a(r2, r0)
                java.lang.CharSequence r0 = p250u0.C8100m.m16287c(r0)
                r3.f17693b = r0
            L_0x04be:
                boolean r0 = r3 instanceof com.braze.push.BrazeNotificationStyleFactory.C5505a
                if (r0 != 0) goto L_0x04d1
                com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.f11932a
                r6 = 0
                r7 = 0
                com.braze.push.BrazeNotificationStyleFactory$Companion$setStyleIfSupported$1 r8 = com.braze.push.BrazeNotificationStyleFactory$Companion$setStyleIfSupported$1.INSTANCE
                r9 = 7
                r5 = r17
                com.braze.support.BrazeLogger.m11282d(r4, r5, r6, r7, r8, r9)
                r1.mo20696j(r3)
            L_0x04d1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazeNotificationStyleFactory.Companion.mo16052c(u0.m, com.appboy.models.push.BrazeNotificationPayload):void");
        }
    }

    /* renamed from: com.braze.push.BrazeNotificationStyleFactory$a */
    public static final class C5505a extends C8105q {
    }

    public static final void setBigPictureSummaryAndTitle(C8095k kVar, BrazeNotificationPayload brazeNotificationPayload) {
        Companion.getClass();
        Companion.m11197b(kVar, brazeNotificationPayload);
    }

    public static final void setStyleIfSupported(C8100m mVar, BrazeNotificationPayload brazeNotificationPayload) {
        Companion.mo16052c(mVar, brazeNotificationPayload);
    }
}
