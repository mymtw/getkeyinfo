package com.etsy.android.p327ui.conversation.details.ccm;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.result.C0120c;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.text.font.C1948d;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.C3218a0;
import com.etsy.android.R;
import com.etsy.android.checkout.C6336c;
import com.etsy.android.exceptions.ThreeArmSweaterException;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.C6456a;
import com.etsy.android.feedback.C6457b;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ImageUrl;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.TranslatedConversationMessage;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.ShopReview;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.C8886e;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.C10077j;
import com.etsy.android.p327ui.C10674m0;
import com.etsy.android.p327ui.C11324t;
import com.etsy.android.p327ui.C11330u;
import com.etsy.android.p327ui.conversation.details.C9475a;
import com.etsy.android.p327ui.conversation.details.C9558n;
import com.etsy.android.p327ui.conversation.details.C9559o;
import com.etsy.android.p327ui.conversation.details.C9564q;
import com.etsy.android.p327ui.conversation.details.C9568s;
import com.etsy.android.p327ui.conversation.details.ConversationAttachmentImageLayout;
import com.etsy.android.p327ui.conversation.details.ccm.C9502k;
import com.etsy.android.p327ui.conversation.details.models.DraftMessage;
import com.etsy.android.p327ui.core.listinggallery.C9680e;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.EtsyWebKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingImageGalleryKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.UserProfileKey;
import com.etsy.android.stylekit.views.C9055f;
import com.etsy.android.stylekit.views.C9056g;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.stylekit.views.CollageButton;
import com.etsy.android.stylekit.views.CollageEmptyStateView;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import com.etsy.android.uikit.adapter.ListingVideoPosition;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.util.C12060q;
import com.etsy.android.util.C12061r;
import com.jakewharton.rxbinding2.widget.C17025m;
import com.jakewharton.rxbinding2.widget.C17026n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p145io.reactivex.BackpressureStrategy;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19198c;
import p145io.reactivex.internal.operators.single.C19202e;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p186n2.C7390d;
import p186n2.C7426q;
import p248tp.C8071s;
import p337de.C12647a;
import p337de.C12649c;
import p354gc.C12774h;
import p354gc.C12783l;
import p356ge.C12788a;
import p356ge.C12790b;
import p363he.C12821d;
import p370ie.C12948h;
import p377jf.C12979a;
import p425q9.C13265p;
import p440s9.C13366a;
import p456ua.C13461f;
import p487ya.C13895a;
import p525co.C14173a;
import p628nj.C18263b;
import p733ar.C18974a;
import p733ar.C18976c;
import p740eq.C19011a;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment */
public final class ConversationDetailsFragment extends TrackingBaseFragment implements C13366a, C10674m0.C10675a, C11324t.C11329b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Button cameraButton;
    private Disposable cameraDisposable;
    public C8886e cameraHelper;
    private TextView emptyViewText;
    private CollageEmptyStateView errorStateView;
    public C13895a fileSupport;
    private ConversationAttachmentImageLayout imageAttachmentLayout;
    /* access modifiers changed from: private */
    public boolean isScrolledToBottom = true;
    private C18976c keyboardVisibilityListenerRegistrar;
    private MessageListAdapter listAdapter;
    private final C9478a listAdapterDataObserver;
    private LoadingIndicatorView loadingIndicator;
    public C8694h logCat;
    private Disposable messageInputDisposable;
    /* access modifiers changed from: private */
    public EditText messageInputView;
    /* access modifiers changed from: private */
    public CollageAlert nudgeBanner;
    private Dialog progressDialog;
    /* access modifiers changed from: private */
    public RecyclerView recyclerView;
    private CollageButton sendMessageButton;
    public C13265p session;
    private int signInCounter;
    private final C0120c<C12948h> signInForContactUserResult;
    public C8923u translationHelper;
    private final C19285c viewModel$delegate;
    public C19011a<ConversationDetailsViewModel> viewModelProvider;

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$a */
    public static final class C9478a extends RecyclerView.C3091i {

        /* renamed from: a */
        public final /* synthetic */ ConversationDetailsFragment f21001a;

        public C9478a(ConversationDetailsFragment conversationDetailsFragment) {
            this.f21001a = conversationDetailsFragment;
        }

        /* renamed from: d */
        public final void mo11118d(int i, int i2) {
            RecyclerView access$getRecyclerView$p;
            if (i == 0 && this.f21001a.isScrolledToBottom && (access$getRecyclerView$p = this.f21001a.recyclerView) != null) {
                access$getRecyclerView$p.scrollToPosition(0);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$b */
    public static final class C9479b implements C9558n {

        /* renamed from: a */
        public final /* synthetic */ ConversationDetailsFragment f21002a;

        public C9479b(ConversationDetailsFragment conversationDetailsFragment) {
            this.f21002a = conversationDetailsFragment;
        }

        /* renamed from: a */
        public final void mo31994a(int i, List<C12774h> list) {
            C19383o.m32797g(list, "images");
            C13895a fileSupport = this.f21002a.getFileSupport();
            String a = list.get(i).mo45540a();
            fileSupport.getClass();
            if (C13895a.m21420c(a)) {
                this.f21002a.openListingImageGalleryView(i, list);
            } else {
                this.f21002a.openNonImageAttachmentView(list.get(i).mo45540a());
            }
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$c */
    public static final class C9480c implements C9564q {

        /* renamed from: a */
        public final /* synthetic */ ConversationDetailsFragment f21003a;

        public C9480c(ConversationDetailsFragment conversationDetailsFragment) {
            this.f21003a = conversationDetailsFragment;
        }

        /* renamed from: a */
        public final void mo31995a(String str) {
            C19383o.m32797g(str, "url");
            C12790b.m20430b(this.f21003a, new C12821d(str));
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$d */
    public static final class C9481d implements C9568s {

        /* renamed from: a */
        public final /* synthetic */ ConversationDetailsFragment f21004a;

        public C9481d(ConversationDetailsFragment conversationDetailsFragment) {
            this.f21004a = conversationDetailsFragment;
        }

        /* renamed from: a */
        public final void mo31996a(int i, C12783l lVar) {
            C19383o.m32797g(lVar, "messageObject");
            ConversationDetailsViewModel access$getViewModel = this.f21004a.getViewModel();
            access$getViewModel.getClass();
            C9510o oVar = access$getViewModel.f21023f;
            long j = lVar.f28247d;
            long j2 = lVar.f28246c;
            oVar.getClass();
            String language = C19383o.m32792b(Locale.getDefault().getLanguage(), "en") ? "en-US" : Locale.getDefault().getLanguage();
            C9492a aVar = oVar.f21086a;
            C19383o.m32796f(language, "languageCode");
            C8071s<TranslatedConversationMessage> b = aVar.mo32029b(j, j2, language);
            C9508m mVar = new C9508m(oVar, j2);
            b.getClass();
            C19198c cVar = new C19198c(new C19202e(b, mVar), new C9509n(oVar, j2));
            access$getViewModel.f21019b.getClass();
            ConsumerSingleObserver g = C0391c.m1056b(access$getViewModel.f21019b, cVar.mo20660i(C13461f.m21235b())).mo20658g(Functions.f28540d, Functions.f28541e);
            C7091a aVar2 = access$getViewModel.f21014G;
            C19383o.m32798h(aVar2, "compositeDisposable");
            aVar2.mo19403b(g);
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$e */
    public static final class C9482e implements C9475a {

        /* renamed from: a */
        public final /* synthetic */ ConversationDetailsFragment f21005a;

        public C9482e(ConversationDetailsFragment conversationDetailsFragment) {
            this.f21005a = conversationDetailsFragment;
        }

        /* renamed from: a */
        public final void mo31967a(long j) {
            C12790b.m20430b(this.f21005a, new UserProfileKey(C19421p.m32935c0(this.f21005a.getActivity()), new EtsyId(j), (Bundle) null, 4, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$f */
    public static final class C9483f extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ ConversationDetailsFragment f21006b;

        public C9483f(ConversationDetailsFragment conversationDetailsFragment) {
            this.f21006b = conversationDetailsFragment;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C19383o.m32797g(recyclerView, "recyclerView");
            this.f21006b.isScrolledToBottom = !recyclerView.canScrollVertically(1);
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$g */
    public static final class C9484g implements C18974a {

        /* renamed from: a */
        public final /* synthetic */ ConversationDetailsFragment f21007a;

        public C9484g(ConversationDetailsFragment conversationDetailsFragment) {
            this.f21007a = conversationDetailsFragment;
        }

        /* renamed from: a */
        public final void mo31997a(boolean z) {
            CollageAlert access$getNudgeBanner$p;
            if (z) {
                CollageAlert access$getNudgeBanner$p2 = this.f21007a.nudgeBanner;
                if (access$getNudgeBanner$p2 != null) {
                    ViewExtensions.m12860d(access$getNudgeBanner$p2);
                    return;
                }
                return;
            }
            Context context = this.f21007a.getContext();
            boolean z2 = false;
            if (context != null && !C1948d.m4274f(context)) {
                z2 = true;
            }
            if (z2) {
                CollageAlert access$getNudgeBanner$p3 = this.f21007a.nudgeBanner;
                if (C18263b.m30839d0(access$getNudgeBanner$p3 != null ? access$getNudgeBanner$p3.getBodyText() : null) && (access$getNudgeBanner$p = this.f21007a.nudgeBanner) != null) {
                    ViewExtensions.m12869m(access$getNudgeBanner$p);
                }
            }
        }
    }

    public ConversationDetailsFragment() {
        C0120c<C12948h> registerForActivityResult = registerForActivityResult(new C12649c(), new C3218a0(this, 0));
        C19383o.m32796f(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.signInForContactUserResult = registerForActivityResult;
        this.viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(ConversationDetailsViewModel.class), new C9486xbdb4a1d7(new C9485xbdb4a1d6(this)), new ConversationDetailsFragment$viewModel$2(this));
        this.listAdapterDataObserver = new C9478a(this);
    }

    /* access modifiers changed from: private */
    public final ConversationDetailsViewModel getViewModel() {
        return (ConversationDetailsViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleViewState(C9502k kVar) {
        if (C19383o.m32792b(kVar, C9502k.C9505c.f21077a)) {
            MessageListAdapter messageListAdapter = this.listAdapter;
            if (messageListAdapter == null) {
                C19383o.m32805o("listAdapter");
                throw null;
            } else if (messageListAdapter.getItemCount() == 0) {
                RecyclerView recyclerView2 = this.recyclerView;
                if (recyclerView2 != null) {
                    ViewExtensions.m12860d(recyclerView2);
                }
                CollageEmptyStateView collageEmptyStateView = this.errorStateView;
                if (collageEmptyStateView != null) {
                    ViewExtensions.m12860d(collageEmptyStateView);
                }
                TextView textView = this.emptyViewText;
                if (textView != null) {
                    ViewExtensions.m12860d(textView);
                }
                LoadingIndicatorView loadingIndicatorView = this.loadingIndicator;
                if (loadingIndicatorView != null) {
                    ViewExtensions.m12869m(loadingIndicatorView);
                }
            }
        } else if (kVar instanceof C9502k.C9503a) {
            LoadingIndicatorView loadingIndicatorView2 = this.loadingIndicator;
            if (loadingIndicatorView2 != null) {
                ViewExtensions.m12860d(loadingIndicatorView2);
            }
            RecyclerView recyclerView3 = this.recyclerView;
            if (recyclerView3 != null) {
                ViewExtensions.m12860d(recyclerView3);
            }
            CollageEmptyStateView collageEmptyStateView2 = this.errorStateView;
            if (collageEmptyStateView2 != null) {
                ViewExtensions.m12860d(collageEmptyStateView2);
            }
            TextView textView2 = this.emptyViewText;
            if (textView2 != null) {
                textView2.setText(getString(R.string.conversation_empty_message, ((C9502k.C9503a) kVar).f21072a));
            }
            TextView textView3 = this.emptyViewText;
            if (textView3 != null) {
                ViewExtensions.m12869m(textView3);
            }
        } else if (kVar instanceof C9502k.C9504b) {
            LoadingIndicatorView loadingIndicatorView3 = this.loadingIndicator;
            if (loadingIndicatorView3 != null) {
                ViewExtensions.m12860d(loadingIndicatorView3);
            }
            RecyclerView recyclerView4 = this.recyclerView;
            if (recyclerView4 != null) {
                ViewExtensions.m12860d(recyclerView4);
            }
            TextView textView4 = this.emptyViewText;
            if (textView4 != null) {
                ViewExtensions.m12860d(textView4);
            }
            CollageEmptyStateView collageEmptyStateView3 = this.errorStateView;
            if (collageEmptyStateView3 != null) {
                C9502k.C9504b bVar = (C9502k.C9504b) kVar;
                collageEmptyStateView3.setTitleText(bVar.f21073a);
                collageEmptyStateView3.setBodyText(bVar.f21074b);
                collageEmptyStateView3.setPrimaryButtonText(bVar.f21075c);
                collageEmptyStateView3.setPrimaryButtonOnClickListener(new C9055f(kVar, 2));
                ViewExtensions.m12869m(collageEmptyStateView3);
                ThreeArmSweaterException.Companion companion = ThreeArmSweaterException.Companion;
                Context context = collageEmptyStateView3.getContext();
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                companion.getClass();
                ThreeArmSweaterException.Companion.m12856a(context);
            }
        } else if (kVar instanceof C9502k.C9506d) {
            LoadingIndicatorView loadingIndicatorView4 = this.loadingIndicator;
            if (loadingIndicatorView4 != null) {
                ViewExtensions.m12860d(loadingIndicatorView4);
            }
            TextView textView5 = this.emptyViewText;
            if (textView5 != null) {
                ViewExtensions.m12860d(textView5);
            }
            CollageEmptyStateView collageEmptyStateView4 = this.errorStateView;
            if (collageEmptyStateView4 != null) {
                ViewExtensions.m12860d(collageEmptyStateView4);
            }
            C9502k.C9506d dVar = (C9502k.C9506d) kVar;
            requireActivity().setTitle(dVar.f21078a);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.invalidateOptionsMenu();
            }
            MessageListAdapter messageListAdapter2 = this.listAdapter;
            if (messageListAdapter2 != null) {
                messageListAdapter2.mo11950j(dVar.f21079b);
                RecyclerView recyclerView5 = this.recyclerView;
                if (recyclerView5 != null) {
                    ViewExtensions.m12869m(recyclerView5);
                    return;
                }
                return;
            }
            C19383o.m32805o("listAdapter");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: handleViewState$lambda-11$lambda-10  reason: not valid java name */
    public static final void m34934handleViewState$lambda11$lambda10(C9502k kVar, View view) {
        C19383o.m32797g(kVar, "$viewState");
        C19846a<C19394m> aVar = ((C9502k.C9504b) kVar).f21076d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    public final void onAddImageClicked() {
        Disposable disposable = this.cameraDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.cameraDisposable = SubscribersKt.m32502g(getCameraHelper().f19640f.mo20640k(BackpressureStrategy.BUFFER), ConversationDetailsFragment$onAddImageClicked$1.INSTANCE, new ConversationDetailsFragment$onAddImageClicked$2(this));
        getCameraHelper().mo30483j(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m34935onViewCreated$lambda2$lambda1(ConversationDetailsFragment conversationDetailsFragment, C17025m mVar) {
        C19383o.m32797g(conversationDetailsFragment, "this$0");
        Editable editable = mVar.editable();
        String obj = editable != null ? editable.toString() : null;
        if (obj != null) {
            ConversationDetailsViewModel viewModel = conversationDetailsFragment.getViewModel();
            viewModel.getClass();
            DraftMessage draftMessage = viewModel.f21016I;
            draftMessage.getClass();
            draftMessage.f21178d = obj;
            viewModel.mo32011g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-9$lambda-3  reason: not valid java name */
    public static final void m34936onViewCreated$lambda9$lambda3(ConversationDetailsFragment conversationDetailsFragment, C9502k kVar) {
        C19383o.m32797g(conversationDetailsFragment, "this$0");
        C19383o.m32796f(kVar, "it");
        conversationDetailsFragment.handleViewState(kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-9$lambda-4  reason: not valid java name */
    public static final void m34937onViewCreated$lambda9$lambda4(ConversationDetailsFragment conversationDetailsFragment, Boolean bool) {
        C19383o.m32797g(conversationDetailsFragment, "this$0");
        Button button = conversationDetailsFragment.cameraButton;
        if (button != null) {
            C19383o.m32796f(bool, "it");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-9$lambda-5  reason: not valid java name */
    public static final void m34938onViewCreated$lambda9$lambda5(ConversationDetailsFragment conversationDetailsFragment, C9559o[] oVarArr) {
        C19383o.m32797g(conversationDetailsFragment, "this$0");
        C19383o.m32796f(oVarArr, "it");
        conversationDetailsFragment.submitImageAttachmentStates(oVarArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-9$lambda-6  reason: not valid java name */
    public static final void m34939onViewCreated$lambda9$lambda6(ConversationDetailsFragment conversationDetailsFragment, Boolean bool) {
        C19383o.m32797g(conversationDetailsFragment, "this$0");
        CollageButton collageButton = conversationDetailsFragment.sendMessageButton;
        if (collageButton != null) {
            C19383o.m32796f(bool, "it");
            collageButton.setEnabled(bool.booleanValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-9$lambda-7  reason: not valid java name */
    public static final void m34940onViewCreated$lambda9$lambda7(ConversationDetailsFragment conversationDetailsFragment, String str) {
        C19383o.m32797g(conversationDetailsFragment, "this$0");
        conversationDetailsFragment.setLoadingDialog(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-9$lambda-8  reason: not valid java name */
    public static final void m34941onViewCreated$lambda9$lambda8(ConversationDetailsFragment conversationDetailsFragment, Alert alert) {
        C19383o.m32797g(conversationDetailsFragment, "this$0");
        conversationDetailsFragment.setNudgeBanner(alert);
    }

    /* access modifiers changed from: private */
    public final void openListingImageGalleryView(int i, List<C12774h> list) {
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

    /* access modifiers changed from: private */
    public final void openNonImageAttachmentView(String str) {
        try {
            Context requireContext = requireContext();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            requireContext.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            C8694h logCat2 = getLogCat();
            logCat2.mo21309d("No application found to open url: " + str, e);
        }
    }

    private final void setLoadingDialog(String str) {
        if (str == null) {
            Dialog dialog = this.progressDialog;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.progressDialog = null;
            return;
        }
        AlertDialog a = C8901g0.m17335a(requireContext(), str);
        this.progressDialog = a;
        if (a != null) {
            a.show();
        }
    }

    private final void setNudgeBanner(Alert alert) {
        CollageAlert collageAlert = this.nudgeBanner;
        if (collageAlert == null) {
            return;
        }
        if (alert == null) {
            ViewParent parent = collageAlert.getParent();
            C19383o.m32795e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C7390d dVar = new C7390d();
            dVar.f16565g.add(collageAlert);
            C7426q.m14342a((ViewGroup) parent, dVar);
            ViewExtensions.m12860d(collageAlert);
            return;
        }
        collageAlert.setAlertType(alert.getType().toCollageType());
        collageAlert.setTitleText(alert.getTitle());
        CollageAlert.setBodyText$default(collageAlert, alert.getBody(), (Drawable) null, 2, (Object) null);
        collageAlert.showDisclosureArrow(alert.getShowDisclosureIndicator());
        String deepLink = alert.getDeepLink();
        if (deepLink != null) {
            collageAlert.setClickableBackground(true);
            collageAlert.setBackgroundClickListener(new C9493b(this, alert, deepLink));
        }
        ViewParent parent2 = collageAlert.getParent();
        C19383o.m32795e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        C7390d dVar2 = new C7390d();
        dVar2.f16565g.add(collageAlert);
        C7426q.m14342a((ViewGroup) parent2, dVar2);
        ViewExtensions.m12869m(collageAlert);
    }

    /* access modifiers changed from: private */
    /* renamed from: setNudgeBanner$lambda-21$lambda-20$lambda-19  reason: not valid java name */
    public static final void m34942setNudgeBanner$lambda21$lambda20$lambda19(ConversationDetailsFragment conversationDetailsFragment, Alert alert, String str, View view) {
        C19383o.m32797g(conversationDetailsFragment, "this$0");
        C19383o.m32797g(str, "$url");
        C8703p analyticsContext = conversationDetailsFragment.getAnalyticsContext();
        analyticsContext.mo21333d(alert.getAnalyticsName() + "_clicked", (Map<? extends AnalyticsProperty, Object>) null);
        C12788a.m20424c(conversationDetailsFragment.getActivity(), new EtsyWebKey(C19421p.m32935c0(conversationDetailsFragment.getActivity()), 18, str, alert.getDeepLinkTitle()));
    }

    private final void showArchiveConfirmation() {
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        C9056g gVar = new C9056g(requireContext);
        gVar.mo70023l(R.string.conversation_archive_warning);
        gVar.setPositiveButton(R.string.conversation_archive, new C9494c(this)).setNegativeButton(R.string.convo_remove_warning_cancel_button, new C9495d()).create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: showArchiveConfirmation$lambda-12  reason: not valid java name */
    public static final void m34943showArchiveConfirmation$lambda12(ConversationDetailsFragment conversationDetailsFragment, DialogInterface dialogInterface, int i) {
        C19383o.m32797g(conversationDetailsFragment, "this$0");
        C19383o.m32797g(dialogInterface, "<anonymous parameter 0>");
        ConversationDetailsViewModel viewModel = conversationDetailsFragment.getViewModel();
        viewModel.f21038u.setValue(viewModel.f21022e.mo38059c(R.string.archiving_conversation, new Object[0]));
        C19202e b = viewModel.f21023f.mo32039b(viewModel.f21011D, ConversationAction.TOGGLE_ARCHIVED);
        viewModel.f21019b.getClass();
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(viewModel.f21019b, b.mo20660i(C13461f.m21235b())), new ConversationDetailsViewModel$archive$1(viewModel), new ConversationDetailsViewModel$archive$2(viewModel));
        C7091a aVar = viewModel.f21014G;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
    }

    /* access modifiers changed from: private */
    /* renamed from: showArchiveConfirmation$lambda-13  reason: not valid java name */
    public static final void m34944showArchiveConfirmation$lambda13(DialogInterface dialogInterface, int i) {
        C19383o.m32797g(dialogInterface, "<anonymous parameter 0>");
    }

    /* access modifiers changed from: private */
    public final void showErrorAlert(int i) {
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        a.mo45785e(getString(i));
        a.mo45781a(CollageAlert.AlertType.ERROR);
        a.mo45783c(R.drawable.clg_icon_core_exclamation_v1);
        a.mo45786f();
    }

    private final void showMarkAsSpamConfirmation() {
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        C9056g gVar = new C9056g(requireContext);
        gVar.mo70023l(R.string.conversation_mark_spam_warning);
        gVar.setPositiveButton(R.string.convo_remove_warning_mark_spam_button, new C9496e(this)).setNegativeButton(R.string.convo_remove_warning_cancel_button, new C9497f()).create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: showMarkAsSpamConfirmation$lambda-14  reason: not valid java name */
    public static final void m34945showMarkAsSpamConfirmation$lambda14(ConversationDetailsFragment conversationDetailsFragment, DialogInterface dialogInterface, int i) {
        C19383o.m32797g(conversationDetailsFragment, "this$0");
        C19383o.m32797g(dialogInterface, "<anonymous parameter 0>");
        ConversationDetailsViewModel viewModel = conversationDetailsFragment.getViewModel();
        viewModel.f21038u.setValue(viewModel.f21022e.mo38059c(R.string.marking_spam_convo, new Object[0]));
        C19202e b = viewModel.f21023f.mo32039b(viewModel.f21011D, ConversationAction.TOGGLE_MUTED);
        viewModel.f21019b.getClass();
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(viewModel.f21019b, b.mo20660i(C13461f.m21235b())), new ConversationDetailsViewModel$markAsSpam$1(viewModel), new ConversationDetailsViewModel$markAsSpam$2(viewModel));
        C7091a aVar = viewModel.f21014G;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
    }

    /* access modifiers changed from: private */
    /* renamed from: showMarkAsSpamConfirmation$lambda-15  reason: not valid java name */
    public static final void m34946showMarkAsSpamConfirmation$lambda15(DialogInterface dialogInterface, int i) {
        C19383o.m32797g(dialogInterface, "<anonymous parameter 0>");
    }

    /* access modifiers changed from: private */
    /* renamed from: signInForContactUserResult$lambda-0  reason: not valid java name */
    public static final void m34947signInForContactUserResult$lambda0(ConversationDetailsFragment conversationDetailsFragment, C12647a aVar) {
        C19383o.m32797g(conversationDetailsFragment, "this$0");
        if (aVar.f27895a == 311) {
            ConversationDetailsViewModel viewModel = conversationDetailsFragment.getViewModel();
            if (viewModel.f21017J == null) {
                viewModel.mo32009e();
            }
        }
    }

    private final void submitImageAttachmentStates(C9559o[] oVarArr) {
        ConversationAttachmentImageLayout conversationAttachmentImageLayout;
        int length = oVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C9559o.C9560a aVar = oVarArr[i];
            int i3 = i2 + 1;
            if (aVar instanceof C9559o.C9562c) {
                ConversationAttachmentImageLayout conversationAttachmentImageLayout2 = this.imageAttachmentLayout;
                if (conversationAttachmentImageLayout2 != null) {
                    conversationAttachmentImageLayout2.removeImage(i2);
                }
            } else if (aVar instanceof C9559o.C9561b) {
                ConversationAttachmentImageLayout conversationAttachmentImageLayout3 = this.imageAttachmentLayout;
                if (conversationAttachmentImageLayout3 != null) {
                    conversationAttachmentImageLayout3.addLoading(i2);
                }
            } else if ((aVar instanceof C9559o.C9560a) && (conversationAttachmentImageLayout = this.imageAttachmentLayout) != null) {
                conversationAttachmentImageLayout.addImage(aVar.f21217a, i2);
            }
            i++;
            i2 = i3;
        }
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

    public final C8886e getCameraHelper() {
        C8886e eVar = this.cameraHelper;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("cameraHelper");
        throw null;
    }

    public final C13895a getFileSupport() {
        C13895a aVar = this.fileSupport;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("fileSupport");
        throw null;
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

    public final C19011a<ConversationDetailsViewModel> getViewModelProvider() {
        C19011a<ConversationDetailsViewModel> aVar = this.viewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("viewModelProvider");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        ConversationDetailsViewModel viewModel = getViewModel();
        if (i == 300) {
            if (viewModel.f21017J == null) {
                viewModel.mo32009e();
            }
            z = true;
        } else {
            viewModel.getClass();
            z = false;
        }
        if (!z) {
            getCameraHelper().mo30479f(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        ConversationDetailsViewModel viewModel = getViewModel();
        EtsyId etsyId = new EtsyId(requireArguments().getLong("convo_id", 0));
        Long valueOf = Long.valueOf(requireArguments().getLong("user_id"));
        String string = requireArguments().getString(ConversationDetailsNavigationKey.USERNAME, "");
        C19383o.m32796f(string, "requireArguments().getString(USERNAME, \"\")");
        String string2 = requireArguments().getString("DISPLAY_NAME", "");
        C19383o.m32796f(string2, "requireArguments().getString(DISPLAY_NAME, \"\")");
        String string3 = requireArguments().getString(ConversationDetailsNavigationKey.MESSAGE, (String) null);
        viewModel.getClass();
        viewModel.f21010C = etsyId;
        viewModel.f21012E = string;
        viewModel.f21013F = string2;
        if (valueOf != null) {
            viewModel.f21011D = valueOf.longValue();
            C19697g.m33468f(C19388s.m32866i0(viewModel), (CoroutineContext) null, (CoroutineStart) null, new ConversationDetailsViewModel$streamConversation$1(viewModel, valueOf.longValue(), (C19340c<? super ConversationDetailsViewModel$streamConversation$1>) null), 3);
        }
        if (viewModel.f21021d.mo45960e()) {
            viewModel.mo32009e();
        }
        if (string3 != null) {
            C12060q.m19871b(viewModel.f21034q, string3);
        }
        MessageListAdapter messageListAdapter = new MessageListAdapter(getTranslationHelper(), new C9479b(this), new C9480c(this), new C9481d(this), new C9482e(this), new ConversationDetailsFragment$onCreate$5(this), new ConversationDetailsFragment$onCreate$6(this));
        this.listAdapter = messageListAdapter;
        messageListAdapter.registerAdapterDataObserver(this.listAdapterDataObserver);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C19383o.m32797g(menu, "menu");
        C19383o.m32797g(menuInflater, "inflater");
        MessageListAdapter messageListAdapter = this.listAdapter;
        if (messageListAdapter == null) {
            C19383o.m32805o("listAdapter");
            throw null;
        } else if (messageListAdapter.getItemCount() > 0) {
            menuInflater.inflate(R.menu.menu_conversation_actions, menu);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_conversation_details, viewGroup, false);
        C19383o.m32796f(inflate, "inflater.inflate(R.layou…etails, container, false)");
        return inflate;
    }

    public void onDestroyView() {
        Disposable disposable = this.messageInputDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.cameraDisposable;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.clearOnScrollListeners();
        }
        C18976c cVar = this.keyboardVisibilityListenerRegistrar;
        if (cVar != null) {
            cVar.mo70412a();
        }
        this.recyclerView = null;
        this.loadingIndicator = null;
        this.emptyViewText = null;
        this.errorStateView = null;
        this.messageInputView = null;
        this.sendMessageButton = null;
        this.imageAttachmentLayout = null;
        this.cameraButton = null;
        this.nudgeBanner = null;
        this.progressDialog = null;
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        switch (menuItem.getItemId()) {
            case R.id.menu_archive:
                showArchiveConfirmation();
                break;
            case R.id.menu_mark_spam:
                showMarkAsSpamConfirmation();
                break;
            case R.id.menu_mark_unread:
                ConversationDetailsViewModel viewModel = getViewModel();
                C19202e b = viewModel.f21023f.mo32039b(viewModel.f21011D, ConversationAction.TOGGLE_READ);
                viewModel.f21019b.getClass();
                ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(viewModel.f21019b, b.mo20660i(C13461f.m21235b())), new ConversationDetailsViewModel$markAsUnread$1(viewModel), new ConversationDetailsViewModel$markAsUnread$2(viewModel));
                C7091a aVar = viewModel.f21014G;
                C19383o.m32798h(aVar, "compositeDisposable");
                aVar.mo19403b(e);
                break;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    public void onResume() {
        super.onResume();
        if (getSession().mo45960e()) {
            return;
        }
        if (this.signInCounter > 0) {
            C12788a.m20426e(getActivity());
            return;
        }
        requireActivity().setTitle("");
        this.signInForContactUserResult.mo1157b(new C12948h(C19421p.m32935c0(getActivity()), EtsyAction.CONTACT_USER, getArguments(), (String) null, (String) null, (String) null, 56));
        this.signInCounter++;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().setTitle(requireArguments().getString("DISPLAY_NAME", ""));
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.recyclerView = recyclerView2;
        if (recyclerView2 != null) {
            getActivity();
            recyclerView2.setLayoutManager(new LinearLayoutManager(1, true));
        }
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 != null) {
            MessageListAdapter messageListAdapter = this.listAdapter;
            if (messageListAdapter != null) {
                recyclerView3.setAdapter(messageListAdapter);
            } else {
                C19383o.m32805o("listAdapter");
                throw null;
            }
        }
        RecyclerView recyclerView4 = this.recyclerView;
        if (recyclerView4 != null) {
            recyclerView4.setItemAnimator(new C11330u());
        }
        RecyclerView recyclerView5 = this.recyclerView;
        if (recyclerView5 != null) {
            recyclerView5.addOnScrollListener(new C9483f(this));
        }
        this.nudgeBanner = (CollageAlert) view.findViewById(R.id.nudge_banner);
        this.emptyViewText = (TextView) view.findViewById(R.id.empty_view_text);
        this.errorStateView = (CollageEmptyStateView) view.findViewById(R.id.error_state_view);
        this.loadingIndicator = (LoadingIndicatorView) view.findViewById(R.id.loading_indicator);
        Button button = (Button) view.findViewById(R.id.camera);
        this.cameraButton = button;
        if (button != null) {
            ViewExtensions.m12866j(button, new ConversationDetailsFragment$onViewCreated$2(this));
        }
        CollageButton collageButton = (CollageButton) view.findViewById(R.id.send_message);
        this.sendMessageButton = collageButton;
        if (collageButton != null) {
            ViewExtensions.m12866j(collageButton, new ConversationDetailsFragment$onViewCreated$3(this));
        }
        EditText editText = (EditText) view.findViewById(R.id.message);
        this.messageInputView = editText;
        if (editText != null) {
            this.messageInputDisposable = new C14173a.C14174a(new C17026n(editText)).mo20637g(new C6336c(this, 2));
        }
        ConversationAttachmentImageLayout conversationAttachmentImageLayout = (ConversationAttachmentImageLayout) view.findViewById(R.id.image_attachment_layout);
        this.imageAttachmentLayout = conversationAttachmentImageLayout;
        if (conversationAttachmentImageLayout != null) {
            conversationAttachmentImageLayout.setRemoveListener(new ConversationDetailsFragment$onViewCreated$5(this));
        }
        ConversationDetailsViewModel viewModel = getViewModel();
        viewModel.f21027j.observe(getViewLifecycleOwner(), new C6456a(this, 1));
        viewModel.f21029l.observe(getViewLifecycleOwner(), new C6457b(this, 2));
        viewModel.f21031n.observe(getViewLifecycleOwner(), new C10077j(this, 1));
        viewModel.f21033p.observe(getViewLifecycleOwner(), new C9498g(this, 0));
        viewModel.f21035r.observe(getViewLifecycleOwner(), new C12061r(new ConversationDetailsFragment$onViewCreated$6$5(this)));
        viewModel.f21037t.observe(getViewLifecycleOwner(), new C12061r(new ConversationDetailsFragment$onViewCreated$6$6(this)));
        viewModel.f21039v.observe(getViewLifecycleOwner(), new C9499h(this, 0));
        viewModel.f21041x.observe(getViewLifecycleOwner(), new C9500i(this, 0));
        viewModel.f21043z.observe(getViewLifecycleOwner(), new C12061r(new ConversationDetailsFragment$onViewCreated$6$9(this)));
        viewModel.f21009B.observe(getViewLifecycleOwner(), new C12061r(new ConversationDetailsFragment$onViewCreated$6$10(this)));
        this.keyboardVisibilityListenerRegistrar = C19382n.m32780x0(getActivity(), new C9484g(this));
    }

    public final void setCameraHelper(C8886e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.cameraHelper = eVar;
    }

    public final void setFileSupport(C13895a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.fileSupport = aVar;
    }

    public final void setLogCat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logCat = hVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setTranslationHelper(C8923u uVar) {
        C19383o.m32797g(uVar, "<set-?>");
        this.translationHelper = uVar;
    }

    public final void setViewModelProvider(C19011a<ConversationDetailsViewModel> aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.viewModelProvider = aVar;
    }

    public int softInputMode() {
        return 16;
    }

    public C11324t.C11325a.C11327b getBottomTabsOverrides() {
        return C11324t.C11325a.C11327b.f24989c;
    }
}
