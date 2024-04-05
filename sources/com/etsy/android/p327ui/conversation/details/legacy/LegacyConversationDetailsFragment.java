package com.etsy.android.p327ui.conversation.details.legacy;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.result.C0120c;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.text.font.C1948d;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.conversation.ConversationSentBroadcastReceiver;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ImageUrl;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.ShopReview;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.session.C8855a;
import com.etsy.android.lib.util.C8891f;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.lib.util.C8905i;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.C10674m0;
import com.etsy.android.p327ui.C11324t;
import com.etsy.android.p327ui.cardview.viewholders.C9180h;
import com.etsy.android.p327ui.cart.C9243b;
import com.etsy.android.p327ui.conversation.details.C9475a;
import com.etsy.android.p327ui.conversation.details.C9524g;
import com.etsy.android.p327ui.conversation.details.C9526h;
import com.etsy.android.p327ui.conversation.details.C9559o;
import com.etsy.android.p327ui.conversation.details.ConversationAttachmentImageLayout;
import com.etsy.android.p327ui.conversation.details.ccm.CursorDirection;
import com.etsy.android.p327ui.conversation.details.legacy.C9551k;
import com.etsy.android.p327ui.conversation.details.models.ConversationResponse;
import com.etsy.android.p327ui.core.listinggallery.C9680e;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CartWithSavedKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.EtsyWebKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingImageGalleryKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ReceiptKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.UserProfileKey;
import com.etsy.android.stylekit.views.C9056g;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.stylekit.views.CollageButton;
import com.etsy.android.uikit.BaseRecyclerViewListFragment;
import com.etsy.android.uikit.adapter.ListingVideoPosition;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.google.logging.type.LogSeverity;
import com.jakewharton.rxbinding2.widget.C17025m;
import com.jakewharton.rxbinding2.widget.C17026n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p145io.reactivex.BackpressureStrategy;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.completable.C19095g;
import p145io.reactivex.internal.operators.completable.CompletableObserveOn;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.subscribers.LambdaSubscriber;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8054g;
import p248tp.C8071s;
import p251u1.C8115a;
import p337de.C12647a;
import p337de.C12649c;
import p354gc.C12766d;
import p354gc.C12774h;
import p354gc.C12778k;
import p356ge.C12788a;
import p356ge.C12790b;
import p370ie.C12948h;
import p377jf.C12979a;
import p417p9.C13193a;
import p425q9.C13265p;
import p440s9.C13366a;
import p456ua.C13461f;
import p525co.C14173a;
import p568fn.C17782b;
import p733ar.C18974a;
import p733ar.C18976c;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsFragment */
public final class LegacyConversationDetailsFragment extends BaseRecyclerViewListFragment<C12778k> implements C9526h, C13366a, C10674m0.C10675a, C11324t.C11329b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8855a customerCentricMessagingEligibility;
    private C18976c keyboardVisibilityListenerRegistrar;
    public C8694h logCat;
    private Disposable messageBoxDisposable;
    public LegacyConversationDetailsPresenter presenter;
    private Dialog progressDialog;
    private ConversationSentBroadcastReceiver receiver;
    public C13265p session;
    private int signInCounter;
    private final C0120c<C12948h> signInForContactUserResult;
    public C8923u translationHelper;

    /* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsFragment$a */
    public static final class C9533a implements C9475a {

        /* renamed from: a */
        public final /* synthetic */ LegacyConversationDetailsFragment f21117a;

        public C9533a(LegacyConversationDetailsFragment legacyConversationDetailsFragment) {
            this.f21117a = legacyConversationDetailsFragment;
        }

        /* renamed from: a */
        public final void mo31967a(long j) {
            C12790b.m20430b(this.f21117a, new UserProfileKey(C19421p.m32935c0(this.f21117a.getActivity()), new EtsyId(j), (Bundle) null, 4, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsFragment$b */
    public static final class C9534b implements C18974a {

        /* renamed from: a */
        public final /* synthetic */ LegacyConversationDetailsFragment f21118a;

        public C9534b(LegacyConversationDetailsFragment legacyConversationDetailsFragment) {
            this.f21118a = legacyConversationDetailsFragment;
        }

        /* renamed from: a */
        public final void mo31997a(boolean z) {
            C12766d dVar;
            LegacyConversationDetailsPresenter presenter = this.f21118a.getPresenter();
            if (z) {
                presenter.f21120b.hidePersistentAlert();
                return;
            }
            Context context = presenter.f21120b.getContext();
            boolean z2 = false;
            if (context != null && !C1948d.m4274f(context)) {
                z2 = true;
            }
            if (z2 && (dVar = presenter.f21137s) != null) {
                Alert alert = dVar.f28216a.f28213g;
                if (alert != null) {
                    presenter.f21120b.showPersistentAlert(alert);
                } else {
                    presenter.f21120b.hidePersistentAlert();
                }
            }
        }
    }

    public LegacyConversationDetailsFragment() {
        C0120c<C12948h> registerForActivityResult = registerForActivityResult(new C12649c(), new C9541a(this));
        C19383o.m32796f(registerForActivityResult, "registerForActivityResul…t.intent)\n        }\n    }");
        this.signInForContactUserResult = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    public static final void m34948onCreateView$lambda1(LegacyConversationDetailsFragment legacyConversationDetailsFragment, C17025m mVar) {
        C19383o.m32797g(legacyConversationDetailsFragment, "this$0");
        Editable editable = mVar.editable();
        String obj = editable != null ? editable.toString() : null;
        if (obj != null) {
            LegacyConversationDetailsPresenter presenter2 = legacyConversationDetailsFragment.getPresenter();
            int selectionStart = ((EditText) legacyConversationDetailsFragment._$_findCachedViewById(R.id.message)).getSelectionStart();
            int selectionEnd = ((EditText) legacyConversationDetailsFragment._$_findCachedViewById(R.id.message)).getSelectionEnd();
            presenter2.getClass();
            LegacyDraftMessage legacyDraftMessage = presenter2.f21136r;
            legacyDraftMessage.getClass();
            legacyDraftMessage.f21153b = obj;
            LegacyDraftMessage legacyDraftMessage2 = presenter2.f21136r;
            legacyDraftMessage2.f21156e = selectionStart;
            legacyDraftMessage2.f21157f = selectionEnd;
            presenter2.mo32104a();
        }
    }

    private final void sendRefreshBroadcast() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C8115a.m16322a(activity).mo20709c(new Intent("com.etsy.android.convos.NEEDS_REFRESH"));
        }
    }

    private final void showErrorPopup(String str) {
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        a.mo45785e(str);
        a.mo45781a(CollageAlert.AlertType.ERROR);
        a.mo45783c(R.drawable.clg_icon_core_exclamation_v1);
        a.mo45786f();
    }

    private final void showMarkAsSpamConfirmation() {
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        C9056g gVar = new C9056g(requireContext);
        gVar.mo70023l(R.string.convo_mark_spam_warning_message);
        gVar.setPositiveButton(R.string.convo_remove_warning_mark_spam_button, new C9544d(this)).setNegativeButton(R.string.convo_remove_warning_cancel_button, new C9545e()).create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: showMarkAsSpamConfirmation$lambda-4  reason: not valid java name */
    public static final void m34949showMarkAsSpamConfirmation$lambda4(LegacyConversationDetailsFragment legacyConversationDetailsFragment, DialogInterface dialogInterface, int i) {
        C19383o.m32797g(legacyConversationDetailsFragment, "this$0");
        C19383o.m32797g(dialogInterface, "<anonymous parameter 0>");
        LegacyConversationDetailsPresenter presenter2 = legacyConversationDetailsFragment.getPresenter();
        presenter2.f21120b.showLoadingDialog(R.string.marking_spam_convo);
        C19095g b = presenter2.f21119a.mo32130b(new C9551k.C9553b(presenter2.f21130l));
        presenter2.f21121c.getClass();
        CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(b, C13461f.m21235b());
        presenter2.f21121c.getClass();
        Disposable d = SubscribersKt.m32499d(new CompletableObserveOn(completableSubscribeOn, C13461f.m21236c()), new LegacyConversationDetailsPresenter$markAsSpam$1(presenter2), new LegacyConversationDetailsPresenter$markAsSpam$2(presenter2));
        C7091a aVar = presenter2.f21132n;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(d);
    }

    /* access modifiers changed from: private */
    /* renamed from: showMarkAsSpamConfirmation$lambda-5  reason: not valid java name */
    public static final void m34950showMarkAsSpamConfirmation$lambda5(DialogInterface dialogInterface, int i) {
        C19383o.m32797g(dialogInterface, "<anonymous parameter 0>");
    }

    private final void showMarkAsTrashConfirmation() {
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        C9056g gVar = new C9056g(requireContext);
        gVar.mo70023l(R.string.convo_delete_warning_message);
        gVar.setPositiveButton(R.string.convo_remove_warning_delete_button, new C9542b(this)).setNegativeButton(R.string.convo_remove_warning_cancel_button, new C9543c(0)).create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: showMarkAsTrashConfirmation$lambda-6  reason: not valid java name */
    public static final void m34951showMarkAsTrashConfirmation$lambda6(LegacyConversationDetailsFragment legacyConversationDetailsFragment, DialogInterface dialogInterface, int i) {
        C19383o.m32797g(legacyConversationDetailsFragment, "this$0");
        C19383o.m32797g(dialogInterface, "<anonymous parameter 0>");
        LegacyConversationDetailsPresenter presenter2 = legacyConversationDetailsFragment.getPresenter();
        presenter2.f21120b.showLoadingDialog(R.string.deleting_convo);
        C19095g b = presenter2.f21119a.mo32130b(new C9551k.C9554c(presenter2.f21130l));
        presenter2.f21121c.getClass();
        CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(b, C13461f.m21235b());
        presenter2.f21121c.getClass();
        Disposable d = SubscribersKt.m32499d(new CompletableObserveOn(completableSubscribeOn, C13461f.m21236c()), new LegacyConversationDetailsPresenter$markAsTrash$1(presenter2), new LegacyConversationDetailsPresenter$markAsTrash$2(presenter2));
        C7091a aVar = presenter2.f21132n;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(d);
    }

    /* access modifiers changed from: private */
    /* renamed from: showMarkAsTrashConfirmation$lambda-7  reason: not valid java name */
    public static final void m34952showMarkAsTrashConfirmation$lambda7(DialogInterface dialogInterface, int i) {
        C19383o.m32797g(dialogInterface, "<anonymous parameter 0>");
    }

    /* access modifiers changed from: private */
    /* renamed from: showPersistentAlert$lambda-10$lambda-9$lambda-8  reason: not valid java name */
    public static final void m34953showPersistentAlert$lambda10$lambda9$lambda8(LegacyConversationDetailsFragment legacyConversationDetailsFragment, Alert alert, String str, View view) {
        C19383o.m32797g(legacyConversationDetailsFragment, "this$0");
        C19383o.m32797g(alert, "$alertData");
        C19383o.m32797g(str, "$url");
        C8703p analyticsContext = legacyConversationDetailsFragment.getAnalyticsContext();
        analyticsContext.mo21333d(alert.getAnalyticsName() + "_clicked", (Map<? extends AnalyticsProperty, Object>) null);
        C12788a.m20424c(legacyConversationDetailsFragment.getActivity(), new EtsyWebKey(C19421p.m32935c0(legacyConversationDetailsFragment.getActivity()), 18, str, alert.getDeepLinkTitle()));
    }

    /* access modifiers changed from: private */
    /* renamed from: signInForContactUserResult$lambda-0  reason: not valid java name */
    public static final void m34954signInForContactUserResult$lambda0(LegacyConversationDetailsFragment legacyConversationDetailsFragment, C12647a aVar) {
        C12647a aVar2 = aVar;
        C19383o.m32797g(legacyConversationDetailsFragment, "this$0");
        if (!legacyConversationDetailsFragment.getCustomerCentricMessagingEligibility().mo30407a() || aVar2.f27895a != 311 || legacyConversationDetailsFragment.getArguments() == null) {
            legacyConversationDetailsFragment.getPresenter().mo32107d(LogSeverity.NOTICE_VALUE, aVar2.f27895a, aVar2.f27896b);
            return;
        }
        long j = legacyConversationDetailsFragment.requireArguments().getLong("user_id");
        C12788a.m20424c(legacyConversationDetailsFragment.getActivity(), new ConversationDetailsNavigationKey(C19421p.m32935c0(legacyConversationDetailsFragment.getActivity()), (Bundle) null, Long.valueOf(j), (String) null, legacyConversationDetailsFragment.requireArguments().getString("DISPLAY_NAME"), Long.valueOf(legacyConversationDetailsFragment.requireArguments().getLong("convo_id", 0)), false, true, legacyConversationDetailsFragment.requireArguments().getString("message"), true, 64, (DefaultConstructorMarker) null));
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void addDraftToAdapter(C12778k kVar) {
        C19383o.m32797g(kVar, "item");
        this.adapter.addItemAtPosition(0, kVar);
        this.recyclerView.scrollToPosition(0);
    }

    public void addImage() {
        LegacyConversationDetailsPresenter presenter2 = getPresenter();
        presenter2.getClass();
        LambdaSubscriber lambdaSubscriber = presenter2.f21133o;
        if (lambdaSubscriber != null) {
            lambdaSubscriber.dispose();
        }
        C8054g<C8891f> k = presenter2.f21125g.f19640f.mo20640k(BackpressureStrategy.BUFFER);
        presenter2.f21121c.getClass();
        presenter2.f21133o = SubscribersKt.m32502g(k.mo20617a(C13461f.m21236c()), LegacyConversationDetailsPresenter$addImage$1.INSTANCE, new LegacyConversationDetailsPresenter$addImage$2(presenter2));
        presenter2.f21125g.mo30483j(this);
    }

    public void addImageAttachment(Bitmap bitmap, int i) {
        C19383o.m32797g(bitmap, "bitmap");
        ((ConversationAttachmentImageLayout) _$_findCachedViewById(R.id.image_attachment_layout)).addImage(bitmap, i);
    }

    public void addItemsToAdapter(List<? extends C12778k> list) {
        C19383o.m32797g(list, ResponseConstants.ITEMS);
        this.adapter.addItems(list);
    }

    public void clearAdapter() {
        this.adapter.clear();
    }

    public void clearMessageInput() {
        LegacyConversationDetailsPresenter presenter2 = getPresenter();
        for (int i = 0; i < 3; i++) {
            C9559o[] oVarArr = presenter2.f21134p;
            C9559o oVar = oVarArr[i];
            oVarArr[i] = C9559o.C9562c.f21220a;
            if (oVar instanceof C9559o.C9560a) {
                ((C9559o.C9560a) oVar).f21218b.delete();
            }
            presenter2.f21120b.removeImageAttachment(i);
        }
        presenter2.mo32105b();
        presenter2.mo32104a();
        LegacyDraftMessage legacyDraftMessage = presenter2.f21136r;
        ArrayList c = presenter2.mo32106c();
        legacyDraftMessage.getClass();
        legacyDraftMessage.f21160i = c;
        ((EditText) _$_findCachedViewById(R.id.message)).setText((CharSequence) null);
    }

    public RecyclerView.C3100o createLayoutManager() {
        getActivity();
        return new LinearLayoutManager(1, true);
    }

    public void enableSend(boolean z) {
        ((CollageButton) _$_findCachedViewById(R.id.send_message)).setEnabled(z);
    }

    public final C8855a getCustomerCentricMessagingEligibility() {
        C8855a aVar = this.customerCentricMessagingEligibility;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("customerCentricMessagingEligibility");
        throw null;
    }

    public int getLayoutId() {
        return R.layout.fragment_legacy_conversation_details;
    }

    public final C8694h getLogCat() {
        C8694h hVar = this.logCat;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("logCat");
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final LegacyConversationDetailsPresenter getPresenter() {
        LegacyConversationDetailsPresenter legacyConversationDetailsPresenter = this.presenter;
        if (legacyConversationDetailsPresenter != null) {
            return legacyConversationDetailsPresenter;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public final C8923u getTranslationHelper() {
        C8923u uVar = this.translationHelper;
        if (uVar != null) {
            return uVar;
        }
        C19383o.m32805o("translationHelper");
        throw null;
    }

    public void goBack() {
        C12788a.m20426e(getActivity());
    }

    public void hideLoadingDialog() {
        Dialog dialog = this.progressDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void hidePersistentAlert() {
        View findViewById;
        FragmentActivity activity = getActivity();
        if (activity != null && (findViewById = activity.findViewById(R.id.nudge_banner)) != null) {
            ViewExtensions.m12860d(findViewById);
        }
    }

    public void navToCart() {
        C12788a.m20424c(getActivity(), new CartWithSavedKey(C19421p.m32935c0(getActivity()), (String) null, (Bundle) null, 6, (DefaultConstructorMarker) null));
    }

    public void navToReceipt(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "receiptId");
        C12788a.m20424c(getActivity(), new ReceiptKey(C19421p.m32935c0(getActivity()), Long.valueOf(etsyId.getIdAsLong()), (Long) null, false, (Bundle) null, 28, (DefaultConstructorMarker) null));
    }

    public void notifyItemChanged(int i) {
        this.adapter.notifyItemChanged(i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        getPresenter().mo32107d(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LegacyConversationDetailsPresenter presenter2 = getPresenter();
        EtsyId etsyId = new EtsyId(requireArguments().getLong("convo_id", 0));
        presenter2.getClass();
        presenter2.f21130l = etsyId;
        LegacyConversationDetailsPresenter presenter3 = getPresenter();
        EtsyId etsyId2 = new EtsyId(requireArguments().getLong("user_id"));
        presenter3.getClass();
        presenter3.f21131m = etsyId2;
        setHasOptionsMenu(true);
        this.adapter = new C9524g(getActivity(), getTranslationHelper(), getPresenter().f21140v, getPresenter().f21141w, getPresenter().f21142x, getPresenter().f21143y, new C9533a(this));
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C19383o.m32797g(menu, "menu");
        C19383o.m32797g(menuInflater, "inflater");
        menuInflater.inflate(R.menu.menu_conversation_details, menu);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        Button button = (Button) onCreateView.findViewById(R.id.camera);
        C19383o.m32796f(button, "view.camera");
        ViewExtensions.m12866j(button, new LegacyConversationDetailsFragment$onCreateView$1(this));
        CollageButton collageButton = (CollageButton) onCreateView.findViewById(R.id.send_message);
        C19383o.m32796f(collageButton, "view.send_message");
        ViewExtensions.m12866j(collageButton, new LegacyConversationDetailsFragment$onCreateView$2(this));
        ((CollageButton) onCreateView.findViewById(R.id.send_message)).setEnabled(false);
        EditText editText = (EditText) onCreateView.findViewById(R.id.message);
        if (editText != null) {
            this.messageBoxDisposable = new C14173a.C14174a(new C17026n(editText)).mo20637g(new C8905i(this, 3));
            ((ConversationAttachmentImageLayout) onCreateView.findViewById(R.id.image_attachment_layout)).setRemoveListener(new LegacyConversationDetailsFragment$onCreateView$4(this));
            return onCreateView;
        }
        throw new NullPointerException("view == null");
    }

    public void onDestroy() {
        super.onDestroy();
        LegacyConversationDetailsPresenter presenter2 = getPresenter();
        presenter2.f21132n.mo19405d();
        LambdaSubscriber lambdaSubscriber = presenter2.f21133o;
        if (lambdaSubscriber != null) {
            lambdaSubscriber.dispose();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.messageBoxDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        C18976c cVar = this.keyboardVisibilityListenerRegistrar;
        if (cVar != null) {
            cVar.mo70412a();
        }
    }

    public void onLoadContent() {
        C8071s sVar;
        if (this.adapter.getDataItemCount() > 0 && isRefreshing()) {
            this.adapter.clear();
        }
        LegacyConversationDetailsPresenter presenter2 = getPresenter();
        if (presenter2.f21128j.mo29933a() && (!presenter2.f21138t.isEmpty())) {
            presenter2.mo32108e(presenter2.f21138t);
        }
        if (presenter2.f21130l.isNumeric() || !presenter2.f21131m.isNumeric()) {
            LegacyConversationRepository legacyConversationRepository = presenter2.f21119a;
            sVar = legacyConversationRepository.f21146a.mo32149d(presenter2.f21130l.getIdAsLongDeprecated());
        } else {
            LegacyConversationRepository legacyConversationRepository2 = presenter2.f21119a;
            C8071s<ConversationResponse> e = legacyConversationRepository2.f21148c.mo32032e(presenter2.f21131m.getIdAsLongDeprecated(), true, 0, CursorDirection.OLDER);
            C9243b bVar = new C9243b(2);
            e.getClass();
            sVar = new C19208j(e, bVar);
        }
        ConsumerSingleObserver e2 = SubscribersKt.m32500e(C0391c.m1056b(presenter2.f21121c, C0072d.m199f(presenter2.f21121c, sVar)), new LegacyConversationDetailsPresenter$loadContent$1(presenter2), new LegacyConversationDetailsPresenter$loadContent$2(presenter2));
        C7091a aVar = presenter2.f21132n;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e2);
    }

    public void onMessageSent() {
        sendRefreshBroadcast();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_delete) {
            showMarkAsTrashConfirmation();
            return true;
        } else if (itemId == R.id.menu_mark_spam) {
            showMarkAsSpamConfirmation();
            return true;
        } else if (itemId != R.id.menu_read_state) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            getPresenter().mo32110g(true);
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        try {
            requireContext().unregisterReceiver(this.receiver);
        } catch (IllegalArgumentException e) {
            CrashUtil.m17307a().mo30457b(e);
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
        C19383o.m32797g(menu, "menu");
        MenuItem findItem = menu.findItem(R.id.menu_read_state);
        FragmentActivity requireActivity = requireActivity();
        C12766d dVar = getPresenter().f21137s;
        boolean z = true;
        if (dVar == null || !dVar.f28218c) {
            z = false;
        }
        findItem.setTitle(requireActivity.getString(z ? R.string.convo_mark_as_unread : R.string.convo_mark_as_read));
    }

    public void onResume() {
        super.onResume();
        boolean z = true;
        if (!getSession().mo45960e()) {
            if (this.signInCounter > 0) {
                C12788a.m20426e(getActivity());
            } else {
                setTitle("");
                this.signInForContactUserResult.mo1157b(new C12948h(C19421p.m32935c0(getActivity()), EtsyAction.CONTACT_USER, getArguments(), (String) null, (String) null, (String) null, 56));
                this.signInCounter++;
            }
        } else if (getSession().mo45960e() && !isLoading()) {
            if (getPresenter().f21137s == null) {
                z = false;
            }
            if (!z) {
                loadContent();
            }
        }
        this.receiver = new C13193a();
        Context requireContext = requireContext();
        ConversationSentBroadcastReceiver conversationSentBroadcastReceiver = this.receiver;
        IntentFilter intentFilter = new IntentFilter("com.etsy.android.convos.MESSAGE_SENT");
        intentFilter.addAction("com.etsy.android.convos.MESSAGE_FAILED_TO_SEND");
        intentFilter.addAction("com.etsy.android.convos.MESSAGE_SENDING");
        intentFilter.setPriority(10);
        requireContext.registerReceiver(conversationSentBroadcastReceiver, intentFilter);
    }

    public void onStart() {
        super.onStart();
        if (getSession().mo45960e()) {
            if (getPresenter().f21137s != null) {
                LegacyConversationDetailsPresenter presenter2 = getPresenter();
                C12766d dVar = presenter2.f21137s;
                if (dVar != null) {
                    presenter2.mo32109f(dVar);
                }
            } else {
                loadContent();
            }
        }
        LegacyConversationDetailsPresenter presenter3 = getPresenter();
        C19179q a = presenter3.f21124f.mo32082a();
        presenter3.f21121c.getClass();
        ObservableSubscribeOn i = a.mo20639i(C13461f.m21235b());
        presenter3.f21121c.getClass();
        presenter3.f21139u = SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), C9537x35124677.INSTANCE, new C9538x35124678(presenter3), 2);
    }

    public void onStatusChanged() {
        sendRefreshBroadcast();
    }

    public void onStop() {
        LambdaObserver lambdaObserver = getPresenter().f21139u;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        if (getSession().mo45960e()) {
            if (!(getPresenter().f21137s != null)) {
                loadContent();
            }
        }
        this.keyboardVisibilityListenerRegistrar = C19382n.m32780x0(getActivity(), new C9534b(this));
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        LegacyConversationDetailsPresenter presenter2 = getPresenter();
        Iterator it = presenter2.mo32106c().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                Bitmap decodeFile = BitmapFactory.decodeFile(((File) next).getPath());
                if (decodeFile != null) {
                    presenter2.f21120b.addImageAttachment(decodeFile, i);
                }
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        presenter2.mo32105b();
        presenter2.mo32104a();
    }

    public void openListingImageGalleryView(int i, List<C12774h> list) {
        C19383o.m32797g(list, "images");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(list));
        for (C12774h a : list) {
            arrayList2.add(new ImageUrl(a.mo45540a()));
        }
        arrayList.addAll(arrayList2);
        C9680e eVar = new C9680e((ListingFetch) null, (ShopReview) null, arrayList, 63);
        C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
        int i2 = i;
        C12790b.m20430b(this, new ListingImageGalleryKey(C12790b.m20432d(this), i2, (String) null, (ListingVideoPosition) null, false, Integer.valueOf(TransactionDataRepository.C11867a.m19552a().mo38343b(eVar)), false, 92, (DefaultConstructorMarker) null));
    }

    public void openNonImageAttachmentView(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            Context context = getContext();
            if (context != null) {
                context.startActivity(intent);
            }
        } catch (ActivityNotFoundException e) {
            C8694h logCat2 = getLogCat();
            logCat2.mo21309d("No application found to open url: " + str, e);
        }
    }

    public void refreshConversation() {
        setRefreshing(true);
        loadContent();
    }

    public void reloadOptionsMenu() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
    }

    public void removeImageAttachment(int i) {
        ((ConversationAttachmentImageLayout) _$_findCachedViewById(R.id.image_attachment_layout)).removeImage(i);
    }

    public void removeImageLoadingIndicator(int i) {
        ((ConversationAttachmentImageLayout) _$_findCachedViewById(R.id.image_attachment_layout)).removeLoading(i);
    }

    public final void setCustomerCentricMessagingEligibility(C8855a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.customerCentricMessagingEligibility = aVar;
    }

    public final void setLogCat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logCat = hVar;
    }

    public final void setPresenter(LegacyConversationDetailsPresenter legacyConversationDetailsPresenter) {
        C19383o.m32797g(legacyConversationDetailsPresenter, "<set-?>");
        this.presenter = legacyConversationDetailsPresenter;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public void setTitle(String str) {
        C19383o.m32797g(str, "title");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setTitle(str);
        }
    }

    public final void setTranslationHelper(C8923u uVar) {
        C19383o.m32797g(uVar, "<set-?>");
        this.translationHelper = uVar;
    }

    public void showError(int i) {
        String string = getResources().getString(i);
        C19383o.m32796f(string, "resources.getString(message)");
        showErrorPopup(string);
    }

    public void showImageLoadingIndicator(int i) {
        ((ConversationAttachmentImageLayout) _$_findCachedViewById(R.id.image_attachment_layout)).addLoading(i);
    }

    public void showLoadingDialog(int i) {
        AlertDialog a = C8901g0.m17335a(getActivity(), getString(i));
        this.progressDialog = a;
        if (a != null) {
            a.show();
        }
    }

    public void showPersistentAlert(Alert alert) {
        CollageAlert collageAlert;
        C19383o.m32797g(alert, "alertData");
        FragmentActivity activity = getActivity();
        if (activity != null && (collageAlert = (CollageAlert) activity.findViewById(R.id.nudge_banner)) != null) {
            collageAlert.setAlertType(alert.getType().toCollageType());
            collageAlert.setTitleText(alert.getTitle());
            CollageAlert.setBodyText$default(collageAlert, alert.getBody(), (Drawable) null, 2, (Object) null);
            collageAlert.showDisclosureArrow(alert.getShowDisclosureIndicator());
            String deepLink = alert.getDeepLink();
            if (deepLink != null) {
                collageAlert.setClickableBackground(true);
                collageAlert.setBackgroundClickListener(new C9180h(this, alert, deepLink));
            }
            ViewExtensions.m12869m(collageAlert);
        }
    }

    public void showPushNotificationOptInPrompt() {
    }

    public void showSendMessageError(String str) {
        C19383o.m32797g(str, "message");
        String string = getResources().getString(R.string.convo_send_error_message, new Object[]{str});
        C19383o.m32796f(string, "resources.getString(R.st…d_error_message, message)");
        showError((CharSequence) string);
    }

    public int softInputMode() {
        return 16;
    }

    public void stopRefreshing() {
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        setLoading(false);
        setRefreshing(false);
    }

    public void updateImageAttachmentButton(boolean z) {
        ((Button) _$_findCachedViewById(R.id.camera)).setEnabled(z);
    }

    public void updateReply(String str) {
        C19383o.m32797g(str, "reply");
        ((EditText) _$_findCachedViewById(R.id.message)).setText(str);
    }

    public C11324t.C11325a.C11327b getBottomTabsOverrides() {
        return C11324t.C11325a.C11327b.f24989c;
    }

    public void showError(CharSequence charSequence) {
        C19383o.m32797g(charSequence, "message");
        showErrorPopup(charSequence.toString());
    }
}
