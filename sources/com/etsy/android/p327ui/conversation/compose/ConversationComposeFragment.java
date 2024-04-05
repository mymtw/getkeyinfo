package com.etsy.android.p327ui.conversation.compose;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.activity.result.C0120c;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.feedback.C6473r;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.elk.uploading.C8683d;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.User;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.push.settings.C8848c;
import com.etsy.android.lib.session.C8855a;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.C8886e;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.lib.util.NotificationType;
import com.etsy.android.p327ui.C10674m0;
import com.etsy.android.p327ui.conversation.compose.C9452a;
import com.etsy.android.p327ui.conversation.compose.C9456b;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey;
import com.etsy.android.p327ui.user.review.CreateReviewViewModel;
import com.etsy.android.shophome.C8998i;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.text.TextWatcherAdapter;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.view.ImageAttachmentLayout;
import com.etsy.android.util.BOEOptionsMenuItemHelper;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19543e0;
import okhttp3.C19928a0;
import okhttp3.C20002r;
import okhttp3.C20004s;
import okhttp3.C20013v;
import okhttp3.C20016y;
import p114g4.C6867g;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8071s;
import p251u1.C8115a;
import p277w8.C8266d;
import p306z8.C8478e;
import p337de.C12647a;
import p337de.C12649c;
import p341ec.C12680c;
import p341ec.C12681d;
import p356ge.C12788a;
import p356ge.C12790b;
import p370ie.C12948h;
import p377jf.C12979a;
import p392lf.C13020a;
import p402n9.C13089i;
import p402n9.C13090j;
import p417p9.C13194b;
import p425q9.C13250b;
import p425q9.C13265p;
import p426qa.C13277c;
import p426qa.C13278d;
import p440s9.C13366a;
import p456ua.C13461f;
import p568fn.C17782b;
import p764pq.C20056h;
import p765pr.C20064d;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.conversation.compose.ConversationComposeFragment */
public class ConversationComposeFragment extends TrackingBaseFragment implements C8886e.C8888b, ImageAttachmentLayout.C11917a, C13366a, C10674m0.C10675a, C13020a {
    private static final String KEY_SIGN_IN_COUNTER = "signInCounter";
    public static final String LISTING_CONVO_SENT = "LISTING_CONVO_SENT";
    private Button attachImageButton;
    /* access modifiers changed from: private */
    public C8886e cameraHelper;
    public Connectivity connectivity;
    private int conversationId;
    public C9452a conversationRepository;
    public C8855a customerCentricMessagingEligibility;
    private final C7091a disposables = new C7091a();
    private MessageDraft draft;
    private ImageAttachmentLayout imageAttachmentLayout;
    private boolean imageIsAttaching;
    private boolean isReply = false;
    private TextWatcher mTextWatcher = new C9450a();
    private CollageTextInput messageTextInput;
    public C13278d notificationRepo;
    private Dialog progressDialog;
    private C7091a recipientLookupDisposable = new C7091a();
    public C6473r reviewsEligibility;
    public C13461f schedulers;
    public C13265p session;
    private int signInCounter = 0;
    public C0120c<C12948h> signInForConvoResult = registerForActivityResult(new C12649c(), new C0071c());
    private CollageTextInput subjectTextInput;
    private TextView titleTextView;
    private Toolbar toolbar;
    private CollageTextInput userNameTextInput;

    /* renamed from: com.etsy.android.ui.conversation.compose.ConversationComposeFragment$a */
    public class C9450a extends TextWatcherAdapter {
        public C9450a() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ConversationComposeFragment.this.checkSendButton();
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.compose.ConversationComposeFragment$b */
    public class C9451b extends TrackingOnClickListener {
        public C9451b() {
        }

        public final void onViewClick(View view) {
            ConversationComposeFragment.this.hideKeyboard();
            ConversationComposeFragment.this.cameraHelper.mo30483j(ConversationComposeFragment.this);
        }
    }

    private void checkCanAttachMore() {
        if (this.imageAttachmentLayout.hasSpaceAvailable()) {
            this.attachImageButton.setVisibility(0);
        } else {
            this.attachImageButton.setVisibility(8);
        }
    }

    private void checkCustomerCentricEligibility() {
        if (this.customerCentricMessagingEligibility.mo30407a() && getArguments() != null) {
            long j = getArguments().getLong("user_id", 0);
            String string = getArguments().getString("DISPLAY_NAME");
            String string2 = getArguments().getString("message");
            C12788a.m20424c(getActivity(), new ConversationDetailsNavigationKey(C19421p.m32935c0(getActivity()), (Bundle) null, Long.valueOf(j), getArguments().getString(ResponseConstants.USERNAME), string, (Long) null, false, true, string2, true, 64, (DefaultConstructorMarker) null));
        }
    }

    /* access modifiers changed from: private */
    public void checkSendButton() {
        MenuItem findItem;
        Toolbar toolbar2 = this.toolbar;
        if (toolbar2 != null && (findItem = toolbar2.getMenu().findItem(R.id.menu_send_reply)) != null) {
            boolean z = !this.imageIsAttaching && preValidateMessage();
            Drawable icon = findItem.getIcon();
            if (icon != null) {
                icon.setAlpha(z ? 255 : 128);
            }
            findItem.setEnabled(z);
        }
    }

    private void createNewConversation(MessageDraft messageDraft) {
        C8071s<C20145v<C19928a0>> sVar;
        C20004s.C20007c cVar;
        C19383o.m32797g(messageDraft, Listing.DRAFT_STATE);
        onPreSendMessage();
        C9452a aVar = this.conversationRepository;
        aVar.getClass();
        if (C19543e0.m33306Y(messageDraft.getImages())) {
            EtsyId guestUserId = messageDraft.getGuestUserId();
            C20004s.C20007c[] cVarArr = new C20004s.C20007c[3];
            if (guestUserId != null) {
                C20004s.C20007c.C20008a aVar2 = C20004s.C20007c.f44276c;
                String id = guestUserId.getId();
                aVar2.getClass();
                cVar = C20004s.C20007c.C20008a.m34254b("recipient_id", id);
            } else {
                C20004s.C20007c.C20008a aVar3 = C20004s.C20007c.f44276c;
                String userName = messageDraft.getUserName();
                C19383o.m32796f(userName, "specs.draft.userName");
                aVar3.getClass();
                cVar = C20004s.C20007c.C20008a.m34254b("recipient_loginname", userName);
            }
            cVarArr[0] = cVar;
            C20004s.C20007c.C20008a aVar4 = C20004s.C20007c.f44276c;
            String subject = messageDraft.getSubject();
            C19383o.m32796f(subject, "specs.draft.subject");
            aVar4.getClass();
            cVarArr[1] = C20004s.C20007c.C20008a.m34254b(ResponseConstants.SUBJECT, subject);
            String message = messageDraft.getMessage();
            C19383o.m32796f(message, "specs.draft.message");
            cVarArr[2] = C20004s.C20007c.C20008a.m34254b("message", message);
            ArrayList f0 = C17782b.m29866f0(cVarArr);
            List<File> images = messageDraft.getImages();
            C19383o.m32796f(images, "specs.draft.images");
            C20056h l = C17782b.m29857W(images).iterator();
            while (l.f44419d) {
                int nextInt = l.nextInt();
                C20016y.C20017a aVar5 = C20016y.f44360a;
                C20002r.C20003a aVar6 = C20002r.f44260f;
                File file = messageDraft.getImages().get(nextInt);
                C19383o.m32796f(file, "specs.draft.images[it]");
                String e0 = C0114h.m300e0(file);
                if (e0 == null) {
                    e0 = "jpeg";
                }
                aVar6.getClass();
                C20002r b = C20002r.C20003a.m34244b(e0);
                File file2 = messageDraft.getImages().get(nextInt);
                C19383o.m32796f(file2, "specs.draft.images[it]");
                aVar5.getClass();
                C20013v a = C20016y.C20017a.m34280a(file2, b);
                C20004s.C20007c.C20008a aVar7 = C20004s.C20007c.f44276c;
                StringBuilder h = C0072d.m201h(ResponseConstants.IMAGE);
                h.append(nextInt == 0 ? "" : Integer.valueOf(nextInt + 1));
                String sb = h.toString();
                String name = messageDraft.getImages().get(nextInt).getName();
                aVar7.getClass();
                f0.add(C20004s.C20007c.C20008a.m34255c(sb, name, a));
            }
            sVar = aVar.f20955b.mo45453a(f0);
        } else {
            C12681d dVar = aVar.f20955b;
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair(ResponseConstants.SUBJECT, messageDraft.getSubject());
            pairArr[1] = new Pair("message", messageDraft.getMessage());
            EtsyId guestUserId2 = messageDraft.getGuestUserId();
            pairArr[2] = guestUserId2 != null ? new Pair("recipient_id", guestUserId2.getId()) : new Pair("recipient_loginname", messageDraft.getUserName());
            sVar = dVar.mo45454b(C19294b0.m32562s0(pairArr));
        }
        C8848c cVar2 = new C8848c(aVar, 1);
        sVar.getClass();
        this.disposables.mo19403b(C0391c.m1056b(this.schedulers, C0472h.m1243e(this.schedulers, new C19211l(new C19208j(sVar, cVar2), new C8998i(aVar, 1)))).mo20658g(new C13089i(this, 4), new C13090j(this, 3)));
    }

    private void dismissProgressDialog() {
        Dialog dialog = this.progressDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.progressDialog = null;
        }
    }

    private void fetchRecipient(long j) {
        C8071s<C20064d<User>> publicUserById = this.conversationRepository.f20954a.getPublicUserById(j);
        C13250b bVar = new C13250b(2);
        publicUserById.getClass();
        this.recipientLookupDisposable.mo19403b(C0391c.m1056b(this.schedulers, C0472h.m1243e(this.schedulers, new C19211l(new C19208j(publicUserById, bVar), new C8683d(2)))).mo20658g(new C8266d(this, 5), Functions.f28541e));
    }

    private MessageDraft getDraft() {
        MessageDraft userName = new MessageDraft().message(this.messageTextInput.getText()).subject(this.subjectTextInput.getText()).userName(this.userNameTextInput.getText());
        userName.images(this.imageAttachmentLayout.getImageFiles());
        return userName;
    }

    private void goBack() {
        hideKeyboard();
        C12788a.m20426e(getActivity());
    }

    /* access modifiers changed from: private */
    public void handleConversationError(Throwable th) {
        String message = th.getMessage() != null ? th.getMessage() : getString(R.string.whoops_somethings_wrong);
        if (message == null) {
            message = "";
        }
        onMessageError(message);
    }

    /* access modifiers changed from: private */
    public void handleConversationResult(C9456b bVar) {
        if (bVar instanceof C9456b.C9458b) {
            EtsyApplication.get().getAnalyticsTracker().mo21333d("conversations_new_sent", (Map<? extends AnalyticsProperty, Object>) null);
            onMessageSent();
            return;
        }
        C9456b.C9457a aVar = (C9456b.C9457a) bVar;
        Throwable th = aVar.f20961c;
        if (th == null) {
            th = new IllegalStateException(aVar.f20959a);
        }
        handleConversationError(th);
    }

    /* access modifiers changed from: private */
    public void hideKeyboard() {
        View view = getView();
        if (view != null) {
            C15588c1.m25340p0(view);
        }
    }

    /* access modifiers changed from: private */
    public void lambda$fetchRecipient$4(C9452a.C9453a aVar) throws Exception {
        if (aVar instanceof C9452a.C9453a.C9455b) {
            User user = ((C9452a.C9453a.C9455b) aVar).f20958a;
            if (this.userNameTextInput != null) {
                String loginName = user.getLoginName();
                if (C8885d0.m17324h(user.getDisplayName()) && this.reviewsEligibility.f14376a.mo21132b(C8592b.f18772Z0)) {
                    loginName = user.getDisplayName();
                }
                this.userNameTextInput.setText(loginName);
                this.userNameTextInput.setTag(user.getLoginName());
                this.userNameTextInput.setEnabled(false);
                if (this.userNameTextInput.hasFocus()) {
                    this.subjectTextInput.requestFocus();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(C12647a aVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setupToolbar$1(View view) {
        goBack();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C2348w0 lambda$setupToolbar$2(View view, C2348w0 w0Var) {
        this.toolbar.setPadding(0, w0Var.mo8942b(7).f18321b, 0, 0);
        return w0Var;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setupToolbar$3(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_send_reply) {
            return false;
        }
        send();
        return true;
    }

    private void layoutImageAttachments() {
        this.imageAttachmentLayout.calcSizes(1073741824);
        this.imageAttachmentLayout.requestLayout();
    }

    private boolean preValidateMessage() {
        CollageTextInput collageTextInput;
        FragmentActivity activity = getActivity();
        if (!(this.userNameTextInput == null || (collageTextInput = this.subjectTextInput) == null || this.messageTextInput == null || activity == null)) {
            String text = collageTextInput.getText();
            String text2 = this.messageTextInput.getText();
            String str = "";
            if (TextUtils.isEmpty(TextUtils.isEmpty(text) ? activity.getString(R.string.convo_message_subject_validation) : str)) {
                if (TextUtils.isEmpty(text2)) {
                    str = activity.getString(R.string.convo_message_validation);
                }
                if (TextUtils.isEmpty(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void send() {
        if (this.connectivity.mo29933a()) {
            String text = this.userNameTextInput.getText();
            if (this.userNameTextInput.getTag() != null) {
                text = this.userNameTextInput.getTag().toString();
            }
            MessageDraft conversationId2 = new MessageDraft().userName(text).subject(this.subjectTextInput.getText()).message(this.messageTextInput.getText()).images(this.imageAttachmentLayout.getImageFiles()).conversationId((long) this.conversationId);
            Context requireContext = requireContext();
            String userName = conversationId2.getUserName();
            String str = "";
            String string = TextUtils.isEmpty(userName) ? requireContext.getString(R.string.convo_message_username_validation) : userName.equalsIgnoreCase(requireContext.getSharedPreferences("EtsyUserPrefs", 0).getString("etsyUserLogin", str)) ? requireContext.getString(R.string.convo_message_username_to_yourself) : str;
            Context requireContext2 = requireContext();
            String subject = conversationId2.getSubject();
            String string2 = (TextUtils.isEmpty(subject) || subject.length() < 3) ? requireContext2.getString(R.string.convo_message_subject_validation) : str;
            Context requireContext3 = requireContext();
            if (TextUtils.isEmpty(conversationId2.getMessage())) {
                str = requireContext3.getString(R.string.convo_message_validation);
            }
            this.userNameTextInput.setErrorText(string);
            this.subjectTextInput.setErrorText(string2);
            this.messageTextInput.setErrorText(str);
            if (!string.isEmpty()) {
                ViewsExtensionsKt.m17422a(this.userNameTextInput, string, 500);
            } else if (!string2.isEmpty()) {
                ViewsExtensionsKt.m17422a(this.subjectTextInput, string2, 500);
            } else if (!str.isEmpty()) {
                ViewsExtensionsKt.m17422a(this.messageTextInput, str, 500);
            } else {
                createNewConversation(conversationId2);
            }
        } else {
            C12979a a = C12979a.C12980a.m20683a(requireActivity());
            a.f28588b.setTitleText(getString(R.string.network_unavailable));
            a.mo45781a(CollageAlert.AlertType.ERROR);
            a.f28588b.setIconDrawableRes(R.drawable.clg_icon_core_exclamation_v1);
            a.mo45786f();
        }
    }

    private void setAccessibilityHeadingOnTitle(String str) {
        TextView textView = this.titleTextView;
        if (textView == null) {
            for (int i = 0; i < this.toolbar.getChildCount(); i++) {
                View childAt = this.toolbar.getChildAt(i);
                if (childAt instanceof TextView) {
                    TextView textView2 = (TextView) childAt;
                    if (TextUtils.equals(textView2.getText(), str)) {
                        ViewsExtensionsKt.m17424c(textView2, true);
                        this.titleTextView = textView2;
                        return;
                    }
                }
            }
        } else if (!C2364y.m5194i(textView)) {
            ViewsExtensionsKt.m17424c(this.titleTextView, true);
        }
    }

    private void setTitle() {
        String string = getResources().getString(R.string.convo_compose_new_title);
        if (this.isReply) {
            string = String.format(getResources().getString(R.string.convo_compose_reply), new Object[]{getArguments().getString(ResponseConstants.USERNAME)});
        }
        this.toolbar.setTitle((CharSequence) string);
        setAccessibilityHeadingOnTitle(string);
    }

    private void setUpReplyOrNewMessage() {
        if (getArguments() != null) {
            long j = getArguments().getLong("user_id", 0);
            String string = getArguments().getString(ResponseConstants.USERNAME);
            String string2 = getArguments().getString("DISPLAY_NAME");
            String string3 = getArguments().getString(ResponseConstants.SUBJECT);
            String string4 = getArguments().getString("message");
            this.isReply = getArguments().containsKey("convo_id");
            this.conversationId = getArguments().getInt("convo_id");
            if (!C8885d0.m17324h(string2) || !this.reviewsEligibility.f14376a.mo21132b(C8592b.f18772Z0)) {
                string2 = string;
            }
            if (C8885d0.m17324h(string2)) {
                if (this.isReply) {
                    string2 = String.format(getString(R.string.to_user), new Object[]{string2});
                }
                this.userNameTextInput.setText(string2);
                this.userNameTextInput.setTag(string);
                this.userNameTextInput.setEnabled(false);
                this.subjectTextInput.requestFocus();
            } else if (j > 0) {
                fetchRecipient(j);
            }
            if (C8885d0.m17324h(string3)) {
                if (this.isReply) {
                    string3 = String.format(getString(R.string.re_subject), new Object[]{string3});
                }
                this.subjectTextInput.setText(string3);
                this.subjectTextInput.setEnabled(false);
                this.messageTextInput.requestFocus();
            }
            if (C8885d0.m17324h(string4)) {
                this.messageTextInput.setText(string4);
                this.messageTextInput.requestFocus();
                this.messageTextInput.setSelection(string4.length());
            }
        }
        MessageDraft messageDraft = this.draft;
        if (messageDraft != null && messageDraft.getConversationId() == 0) {
            this.messageTextInput.setText(this.draft.getMessage());
            this.messageTextInput.setSelection(this.draft.getCursorStartPosition(), this.draft.getCursorEndPosition());
            this.userNameTextInput.setText(this.draft.getUserName());
            this.userNameTextInput.setTag(this.draft.getUserName());
            this.subjectTextInput.setText(this.draft.getSubject());
            this.imageAttachmentLayout.setImages(this.draft.getImages());
            checkCanAttachMore();
        }
    }

    private void setupToolbar() {
        this.toolbar.setNavigationIcon((int) R.drawable.clg_icon_core_close_v1);
        this.toolbar.setNavigationContentDescription((int) R.string.close_button_content_description);
        this.toolbar.setNavigationOnClickListener(new C6867g(this, 1));
        this.toolbar.inflateMenu(R.menu.menu_conversation_compose);
        Toolbar toolbar2 = this.toolbar;
        C12680c cVar = new C12680c(this);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2373i.m5274u(toolbar2, cVar);
        this.toolbar.setOnMenuItemClickListener(new C8478e(this));
        BOEOptionsMenuItemHelper.m19853a(this.toolbar.getMenu());
        checkSendButton();
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 301 && i != 300) {
            this.cameraHelper.mo30479f(i, i2, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        layoutImageAttachments();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cameraHelper = new C8886e(getContext(), bundle, (CreateReviewViewModel) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_conversation_compose, viewGroup, false);
        this.toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        Button button = (Button) inflate.findViewById(R.id.button_image);
        this.attachImageButton = button;
        button.setOnClickListener(new C9451b());
        ImageAttachmentLayout imageAttachmentLayout2 = (ImageAttachmentLayout) inflate.findViewById(R.id.linear_convo_image_attachments);
        this.imageAttachmentLayout = imageAttachmentLayout2;
        imageAttachmentLayout2.setAttachmentCallback(this);
        CollageTextInput collageTextInput = (CollageTextInput) inflate.findViewById(R.id.edit_message);
        this.messageTextInput = collageTextInput;
        collageTextInput.setTextChangeListener(this.mTextWatcher);
        CollageTextInput collageTextInput2 = (CollageTextInput) inflate.findViewById(R.id.edit_username);
        this.userNameTextInput = collageTextInput2;
        collageTextInput2.setTextChangeListener(this.mTextWatcher);
        this.userNameTextInput.setFocusableInTouchMode(true);
        CollageTextInput collageTextInput3 = (CollageTextInput) inflate.findViewById(R.id.edit_subject);
        this.subjectTextInput = collageTextInput3;
        collageTextInput3.setTextChangeListener(this.mTextWatcher);
        setUpReplyOrNewMessage();
        setupToolbar();
        return inflate;
    }

    public void onDestroy() {
        this.cameraHelper.f19641g = null;
        this.cameraHelper = null;
        super.onDestroy();
    }

    public void onDestroyView() {
        this.cameraHelper.f19641g = null;
        hideKeyboard();
        dismissProgressDialog();
        this.recipientLookupDisposable.mo19405d();
        this.imageAttachmentLayout.setAttachmentCallback((ImageAttachmentLayout.C11917a) null);
        this.imageAttachmentLayout = null;
        this.messageTextInput = null;
        this.userNameTextInput = null;
        this.subjectTextInput = null;
        this.attachImageButton = null;
        this.toolbar = null;
        super.onDestroyView();
        this.disposables.mo19405d();
    }

    public void onImageSaveFail(Object obj, File file) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C12979a a = C12979a.C12980a.m20683a(activity);
            a.f28588b.setTitleText(getString(R.string.camera_helper_image_load_error));
            a.mo45781a(CollageAlert.AlertType.ERROR);
            a.f28588b.setIconDrawableRes(R.drawable.clg_icon_core_image_v1);
            a.mo45786f();
        }
        ImageAttachmentLayout imageAttachmentLayout2 = this.imageAttachmentLayout;
        if (imageAttachmentLayout2 != null) {
            imageAttachmentLayout2.onAbort((ImageAttachmentLayout.C11918b) obj, file);
        }
        this.imageIsAttaching = false;
        checkCanAttachMore();
        checkSendButton();
    }

    public void onImageSaveSuccess(Object obj, Bitmap bitmap, File file) {
        ImageAttachmentLayout imageAttachmentLayout2 = this.imageAttachmentLayout;
        if (imageAttachmentLayout2 != null) {
            imageAttachmentLayout2.addBitmap((ImageAttachmentLayout.C11918b) obj, bitmap, file);
        }
        this.imageIsAttaching = false;
        checkCanAttachMore();
        checkSendButton();
    }

    public void onMessageError(String str) {
        dismissProgressDialog();
        C12979a a = C12979a.C12980a.m20683a(requireActivity());
        a.f28588b.setTitleText(str);
        a.mo45781a(CollageAlert.AlertType.ERROR);
        a.f28588b.setIconDrawableRes(R.drawable.clg_icon_core_send_v1_1);
        a.mo45786f();
    }

    public void onMessageSent() {
        dismissProgressDialog();
        ImageAttachmentLayout imageAttachmentLayout2 = this.imageAttachmentLayout;
        if (imageAttachmentLayout2 != null) {
            imageAttachmentLayout2.clear();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C12979a a = C12979a.C12980a.m20683a(requireActivity());
            a.f28588b.setTitleText(getString(R.string.convo_message_send_success));
            a.mo45781a(CollageAlert.AlertType.SUCCESS);
            a.f28588b.setIconDrawableRes(R.drawable.clg_icon_core_send_v1_1);
            a.mo45786f();
            SharedPreferences sharedPreferences = activity.getSharedPreferences("convo_prefs", 0);
            ArrayList a2 = C13194b.m20863a(sharedPreferences.getStringSet("images", (Set) null));
            if (a2 != null) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                a2.clear();
            }
            sharedPreferences.edit().remove("message").remove(ResponseConstants.USERNAME).remove(ResponseConstants.SUBJECT).remove("convo_id").remove("images").remove("cursor_position_start").remove("cursor_position_end").remove("convo_is_sending").apply();
            C8115a.m16322a(activity).mo20709c(new Intent("com.etsy.android.convos.MESSAGE_SENT"));
            C13278d dVar = this.notificationRepo;
            dVar.f29184a.onNext(new C13277c(NotificationType.CONVERSATION.getType(), "", ""));
            getParentFragmentManager().mo10373Z(new Bundle(), LISTING_CONVO_SENT);
            goBack();
        }
    }

    public void onNoAvailableActivities() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C12979a a = C12979a.C12980a.m20683a(activity);
            a.f28588b.setTitleText(getString(R.string.error_no_image_chooser_app_found));
            a.mo45781a(CollageAlert.AlertType.ERROR);
            a.f28588b.setIconDrawableRes(R.drawable.clg_icon_core_image_v1);
            a.mo45786f();
        }
    }

    public void onPermissionGranted() {
        this.cameraHelper.mo30483j(this);
    }

    public Object onPreImageSave() {
        this.imageIsAttaching = true;
        checkSendButton();
        return this.imageAttachmentLayout.startLoading();
    }

    public void onPreSendMessage() {
        dismissProgressDialog();
        hideKeyboard();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AlertDialog a = C8901g0.m17335a(activity, getResources().getString(R.string.convo_message_sending_v2));
            this.progressDialog = a;
            a.show();
        }
    }

    public void onRemove() {
        checkCanAttachMore();
    }

    public void onRequestCrop(Uri uri, Uri uri2) {
    }

    public void onResume() {
        super.onResume();
        if (this.session.mo45960e()) {
            checkCustomerCentricEligibility();
        } else if (this.signInCounter > 0) {
            goBack();
        } else {
            EtsyAction.C8658a aVar = EtsyAction.Companion;
            String d = C12790b.m20432d(this);
            EtsyAction etsyAction = EtsyAction.CONTACT_USER;
            C19383o.m32797g(etsyAction, "signInAction");
            this.signInForConvoResult.mo1157b(new C12948h(d, etsyAction, (Bundle) null, (String) null, (String) null, (String) null, 32));
            this.signInCounter++;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C8886e eVar = this.cameraHelper;
        File file = eVar.f19643i;
        if (file != null) {
            bundle.putString("CAMERA_HELPER_CAMERA_IMAGE", file.getAbsolutePath());
        }
        bundle.putInt("CAMERA_HELPER_REQUEST_CODE", eVar.f19636b);
        bundle.putInt(KEY_SIGN_IN_COUNTER, this.signInCounter);
        FragmentActivity activity = getActivity();
        MessageDraft draft2 = getDraft();
        if (activity != null && draft2 != null) {
            SharedPreferences.Editor edit = activity.getSharedPreferences("convo_prefs", 0).edit();
            edit.putString("message", draft2.getMessage());
            edit.putString(ResponseConstants.USERNAME, draft2.getUserName());
            edit.putString(ResponseConstants.SUBJECT, draft2.getSubject());
            edit.putLong("convo_id", draft2.getConversationId());
            edit.putInt("cursor_position_start", draft2.getCursorStartPosition());
            edit.putInt("cursor_position_end", draft2.getCursorEndPosition());
            if (draft2.getImages() != null) {
                HashSet hashSet = new HashSet(draft2.getImages().size());
                for (File absolutePath : draft2.getImages()) {
                    hashSet.add(absolutePath.getAbsolutePath());
                }
                edit.putStringSet("images", hashSet);
            }
            edit.apply();
        }
    }

    public void onStart() {
        super.onStart();
        setTitle();
    }

    public void onViewCreated(View view, Bundle bundle) {
        MessageDraft messageDraft;
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            SharedPreferences sharedPreferences = requireContext().getSharedPreferences("convo_prefs", 0);
            try {
                messageDraft = new MessageDraft().message(sharedPreferences.getString("message", "")).userName(sharedPreferences.getString(ResponseConstants.USERNAME, "")).subject(sharedPreferences.getString(ResponseConstants.SUBJECT, "")).conversationId(sharedPreferences.getLong("convo_id", 0)).saveCursorPosition(sharedPreferences.getInt("cursor_position_start", 0), sharedPreferences.getInt("cursor_position_end", 0));
            } catch (ClassCastException e) {
                C8694h.f19097a.mo21309d("error converting long to string", e);
                messageDraft = new MessageDraft().message(sharedPreferences.getString("message", "")).userName(sharedPreferences.getString(ResponseConstants.USERNAME, "")).subject(sharedPreferences.getString(ResponseConstants.SUBJECT, "")).conversationId(sharedPreferences.getLong("convo_id", 0)).saveCursorPosition(sharedPreferences.getInt("cursor_position_start", 0), sharedPreferences.getInt("cursor_position_end", 0));
            }
            messageDraft.images(C13194b.m20863a(sharedPreferences.getStringSet("images", (Set) null)));
            this.draft = messageDraft;
            this.signInCounter = bundle.getInt(KEY_SIGN_IN_COUNTER, 0);
        }
        this.cameraHelper.f19641g = this;
        NavigationExtensionsKt.m17420a(this.userNameTextInput, 500);
    }

    public int softInputMode() {
        return 16;
    }
}
