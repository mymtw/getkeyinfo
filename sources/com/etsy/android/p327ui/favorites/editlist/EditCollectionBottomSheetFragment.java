package com.etsy.android.p327ui.favorites.editlist;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.p327ui.favorites.C9743a0;
import com.etsy.android.p327ui.favorites.createalist.C9818j;
import com.etsy.android.p327ui.favorites.createalist.CustomBottomSheetDialog;
import com.etsy.android.p327ui.favorites.editlist.EditCollectionViewModel;
import com.etsy.android.stylekit.views.C9055f;
import com.etsy.android.stylekit.views.C9056g;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.stylekit.views.CollageListItem;
import com.etsy.android.stylekit.views.CollageSwitch;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import com.etsy.android.uikit.util.EtsyLinkify;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p251u1.C8115a;
import p363he.C12824f;
import p377jf.C12979a;
import p440s9.C13366a;
import p628nj.C18263b;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionBottomSheetFragment */
public final class EditCollectionBottomSheetFragment extends TrackingBottomSheetDialogFragment implements C13366a, C2843a0<EditCollectionViewModel.C9838a> {
    public static final int $stable = 8;
    public static final C9836a Companion = new C9836a();
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C19285c collection$delegate = C19350d.m32677b(new EditCollectionBottomSheetFragment$collection$2(this));
    private CollageListItem deleteButton;
    private TextView editListName;
    /* access modifiers changed from: private */
    public CollageTextInput editNameDialog;
    private TextView errorTextView;
    /* access modifiers changed from: private */
    public ImageView privacyIcon;
    private CollageSwitch privacyToggle;
    private Dialog progressDialog;
    private View renameButton;
    /* access modifiers changed from: private */
    public AlertDialog renameDialog;
    private View saveButton;
    private View shareButton;
    private final C19285c updateCollectionSpec$delegate = C19350d.m32677b(new EditCollectionBottomSheetFragment$updateCollectionSpec$2(this));
    /* access modifiers changed from: private */
    public EditCollectionViewModel viewModel;
    public C8656o viewModelFactory;

    /* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionBottomSheetFragment$a */
    public static final class C9836a {
    }

    /* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionBottomSheetFragment$b */
    public static final class C9837b implements C9818j {

        /* renamed from: a */
        public final /* synthetic */ EditCollectionBottomSheetFragment f21734a;

        public C9837b(EditCollectionBottomSheetFragment editCollectionBottomSheetFragment) {
            this.f21734a = editCollectionBottomSheetFragment;
        }

        /* renamed from: a */
        public final void mo32757a(DialogInterface dialogInterface) {
            C19383o.m32797g(dialogInterface, "dialog");
            if (!C19383o.m32792b(this.f21734a.getUpdateCollectionSpec().f21539a, this.f21734a.getCollection().getKey()) || !C19383o.m32792b(this.f21734a.getUpdateCollectionSpec().f21540b, this.f21734a.getCollection().getName()) || !C19383o.m32792b(this.f21734a.getUpdateCollectionSpec().f21541c, this.f21734a.getCollection().getPrivacyLevel().getSlug())) {
                Context requireContext = this.f21734a.requireContext();
                C19383o.m32796f(requireContext, "requireContext()");
                C9056g gVar = new C9056g(requireContext);
                gVar.mo70029r(R.string.are_you_sure);
                gVar.mo70023l(R.string.navigate_without_saving_address);
                gVar.setPositiveButton(R.string.discard_changes, new C9845a(dialogInterface)).setNegativeButton(R.string.keep_editing, (DialogInterface.OnClickListener) null).mo1240k();
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public final Collection getCollection() {
        return (Collection) this.collection$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final C9743a0 getUpdateCollectionSpec() {
        return (C9743a0) this.updateCollectionSpec$delegate.getValue();
    }

    public static final EditCollectionBottomSheetFragment newInstance(Collection collection) {
        Companion.getClass();
        C19383o.m32797g(collection, Collection.TYPE_COLLECTION);
        EditCollectionBottomSheetFragment editCollectionBottomSheetFragment = new EditCollectionBottomSheetFragment();
        C11869a aVar = new C11869a();
        aVar.mo38349f(Collection.TYPE_COLLECTION, collection);
        C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
        int b = TransactionDataRepository.C11867a.m19552a().mo38343b(aVar);
        C12824f fVar = new C12824f();
        fVar.f28304a.put("transaction-data", Integer.valueOf(b));
        editCollectionBottomSheetFragment.setArguments(fVar.mo45608a());
        return editCollectionBottomSheetFragment;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r0.f19116n;
     */
    /* renamed from: onCreateView$lambda-2$lambda-1$lambda-0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34978onCreateView$lambda2$lambda1$lambda0(com.etsy.android.p327ui.favorites.editlist.EditCollectionBottomSheetFragment r2, android.view.View r3) {
        /*
            java.lang.String r3 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            android.content.Intent r3 = new android.content.Intent
            com.etsy.android.lib.logger.p r0 = r2.getAnalyticsContext()
            if (r0 == 0) goto L_0x0018
            com.etsy.android.lib.config.e r0 = r0.f19116n
            if (r0 == 0) goto L_0x0018
            com.etsy.android.lib.config.EtsyConfigKey r1 = com.etsy.android.lib.config.C8592b.f18818p
            java.lang.String r0 = r0.mo21136f(r1)
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = "android.intent.action.VIEW"
            r3.<init>(r1, r0)
            r2.startActivity(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.editlist.EditCollectionBottomSheetFragment.m34978onCreateView$lambda2$lambda1$lambda0(com.etsy.android.ui.favorites.editlist.EditCollectionBottomSheetFragment, android.view.View):void");
    }

    private final void setResult(int i, Collection collection) {
        String intentAction = i != 611 ? i != 612 ? null : EtsyAction.COLLECTION_EDITED.getIntentAction() : EtsyAction.COLLECTION_DELETED.getIntentAction();
        if (intentAction != null) {
            C11869a aVar = new C11869a();
            aVar.mo38349f(Collection.TYPE_COLLECTION, collection);
            C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
            int b = TransactionDataRepository.C11867a.m19552a().mo38343b(aVar);
            Intent intent = new Intent();
            C12824f fVar = new C12824f();
            fVar.f28304a.put("transaction-data", Integer.valueOf(b));
            intent.putExtras(fVar.mo45608a());
            intent.setAction(intentAction);
            C8115a.m16322a(requireActivity()).mo20709c(intent);
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

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C8656o getViewModelFactory() {
        C8656o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewModelFactory");
        throw null;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        return new CustomBottomSheetDialog(requireContext, getTheme(), true, new C9837b(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_collection_bottomsheet, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.edit_collection_save);
        C19383o.m32796f(findViewById, "root.findViewById(R.id.edit_collection_save)");
        this.saveButton = findViewById;
        View findViewById2 = inflate.findViewById(R.id.edit_collection_name);
        C19383o.m32796f(findViewById2, "root.findViewById(R.id.edit_collection_name)");
        this.editListName = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.edit_collection_errortext);
        C19383o.m32796f(findViewById3, "root.findViewById(R.id.edit_collection_errortext)");
        this.errorTextView = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.edit_collection_rename);
        C19383o.m32796f(findViewById4, "root.findViewById(R.id.edit_collection_rename)");
        this.renameButton = findViewById4;
        View findViewById5 = inflate.findViewById(R.id.edit_collection_privacytoggle);
        C19383o.m32796f(findViewById5, "root.findViewById(R.id.e…collection_privacytoggle)");
        this.privacyToggle = (CollageSwitch) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.edit_collection_privacytoggle_icon);
        C19383o.m32796f(findViewById6, "root.findViewById(R.id.e…ction_privacytoggle_icon)");
        this.privacyIcon = (ImageView) findViewById6;
        View findViewById7 = inflate.findViewById(R.id.edit_collection_share);
        C19383o.m32796f(findViewById7, "root.findViewById(R.id.edit_collection_share)");
        this.shareButton = findViewById7;
        View findViewById8 = inflate.findViewById(R.id.edit_collection_delete);
        C19383o.m32796f(findViewById8, "root.findViewById(R.id.edit_collection_delete)");
        this.deleteButton = (CollageListItem) findViewById8;
        CollageSwitch collageSwitch = this.privacyToggle;
        if (collageSwitch != null) {
            collageSwitch.setTitle(getString(R.string.collection_edit_privacy_switch_title));
            CollageSwitch collageSwitch2 = this.privacyToggle;
            if (collageSwitch2 != null) {
                String string = getString(R.string.collection_edit_privacy_switch_description);
                C19383o.m32796f(string, "getString(R.string.colle…ivacy_switch_description)");
                collageSwitch2.setDescription(C18263b.m30867s0(string));
                CollageSwitch collageSwitch3 = this.privacyToggle;
                if (collageSwitch3 != null) {
                    TextView textView = (TextView) collageSwitch3.findViewById(R.id.clg_switch_description);
                    if (textView != null) {
                        EtsyLinkify.m19608b(textView, true, true, new C9055f(this, 3));
                    }
                    return inflate;
                }
                C19383o.m32805o("privacyToggle");
                throw null;
            }
            C19383o.m32805o("privacyToggle");
            throw null;
        }
        C19383o.m32805o("privacyToggle");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        this.viewModel = (EditCollectionViewModel) new C2870k0((C2880m0) this, (C2870k0.C2872b) getViewModelFactory()).mo10829a(EditCollectionViewModel.class);
        CollageListItem collageListItem = this.deleteButton;
        if (collageListItem != null) {
            collageListItem.setText((int) R.string.collection_bottom_sheet_delete);
            CollageListItem collageListItem2 = this.deleteButton;
            if (collageListItem2 != null) {
                ViewExtensions.m12866j(collageListItem2, new EditCollectionBottomSheetFragment$onViewCreated$1(this));
                View view2 = this.saveButton;
                if (view2 != null) {
                    ViewExtensions.m12866j(view2, new EditCollectionBottomSheetFragment$onViewCreated$2(this));
                    if (getCollection().isTypeFavorites()) {
                        View view3 = this.renameButton;
                        if (view3 != null) {
                            view3.setVisibility(8);
                            CollageListItem collageListItem3 = this.deleteButton;
                            if (collageListItem3 != null) {
                                collageListItem3.setVisibility(8);
                            } else {
                                C19383o.m32805o("deleteButton");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("renameButton");
                            throw null;
                        }
                    }
                    TextView textView = this.editListName;
                    if (textView != null) {
                        textView.setText(getCollection().getName());
                        View view4 = this.renameButton;
                        if (view4 != null) {
                            ViewExtensions.m12866j(view4, new EditCollectionBottomSheetFragment$onViewCreated$3(this));
                            CollageSwitch collageSwitch = this.privacyToggle;
                            if (collageSwitch != null) {
                                collageSwitch.setChecked(getCollection().isPrivate());
                                ImageView imageView = this.privacyIcon;
                                if (imageView != null) {
                                    imageView.setImageResource(getCollection().getPrivacyLevel().getIcon());
                                    CollageSwitch collageSwitch2 = this.privacyToggle;
                                    if (collageSwitch2 != null) {
                                        collageSwitch2.setOnCheckedChangeListener((C19861p<? super View, ? super Boolean, C19394m>) new EditCollectionBottomSheetFragment$onViewCreated$4(this));
                                        if (getConfigMap().mo21132b(C8592b.f18829s1)) {
                                            View view5 = this.shareButton;
                                            if (view5 != null) {
                                                view5.setVisibility(0);
                                                View view6 = this.shareButton;
                                                if (view6 != null) {
                                                    ViewExtensions.m12866j(view6, new EditCollectionBottomSheetFragment$onViewCreated$5(this));
                                                } else {
                                                    C19383o.m32805o("shareButton");
                                                    throw null;
                                                }
                                            } else {
                                                C19383o.m32805o("shareButton");
                                                throw null;
                                            }
                                        } else {
                                            View view7 = this.shareButton;
                                            if (view7 != null) {
                                                view7.setVisibility(8);
                                            } else {
                                                C19383o.m32805o("shareButton");
                                                throw null;
                                            }
                                        }
                                        EditCollectionViewModel editCollectionViewModel = this.viewModel;
                                        if (editCollectionViewModel != null) {
                                            editCollectionViewModel.f21739f.observe(this, this);
                                        } else {
                                            C19383o.m32805o("viewModel");
                                            throw null;
                                        }
                                    } else {
                                        C19383o.m32805o("privacyToggle");
                                        throw null;
                                    }
                                } else {
                                    C19383o.m32805o("privacyIcon");
                                    throw null;
                                }
                            } else {
                                C19383o.m32805o("privacyToggle");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("renameButton");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("editListName");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("saveButton");
                    throw null;
                }
            } else {
                C19383o.m32805o("deleteButton");
                throw null;
            }
        } else {
            C19383o.m32805o("deleteButton");
            throw null;
        }
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }

    public void onChanged(EditCollectionViewModel.C9838a aVar) {
        TextView textView = this.errorTextView;
        if (textView != null) {
            textView.setVisibility(8);
            if (aVar == null) {
                return;
            }
            if (C19383o.m32792b(aVar, EditCollectionViewModel.C9838a.C9841c.f21743a)) {
                AlertDialog a = C8901g0.m17335a(getActivity(), getString(R.string.deleting));
                a.show();
                this.progressDialog = a;
            } else if (aVar instanceof EditCollectionViewModel.C9838a.C9839a) {
                Dialog dialog = this.progressDialog;
                if (dialog != null) {
                    dialog.dismiss();
                }
                TextView textView2 = this.errorTextView;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    TextView textView3 = this.errorTextView;
                    if (textView3 != null) {
                        textView3.setText(R.string.whoops_somethings_wrong);
                    } else {
                        C19383o.m32805o("errorTextView");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("errorTextView");
                    throw null;
                }
            } else if (aVar instanceof EditCollectionViewModel.C9838a.C9840b) {
                setResult(611, getCollection());
                Dialog dialog2 = this.progressDialog;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                dismiss();
            } else if (C19383o.m32792b(aVar, EditCollectionViewModel.C9838a.C9844f.f21747a)) {
                AlertDialog a2 = C8901g0.m17335a(getActivity(), getString(R.string.saving));
                a2.show();
                this.progressDialog = a2;
            } else if (aVar instanceof EditCollectionViewModel.C9838a.C9842d) {
                Dialog dialog3 = this.progressDialog;
                if (dialog3 != null) {
                    dialog3.dismiss();
                }
                CollageTextInput collageTextInput = this.editNameDialog;
                if (collageTextInput != null) {
                    collageTextInput.setErrorText(((EditCollectionViewModel.C9838a.C9842d) aVar).f21744a);
                } else {
                    C19383o.m32805o("editNameDialog");
                    throw null;
                }
            } else if (aVar instanceof EditCollectionViewModel.C9838a.C9843e) {
                AlertDialog alertDialog = this.renameDialog;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                FragmentActivity requireActivity = requireActivity();
                C19383o.m32796f(requireActivity, "requireActivity()");
                C12979a a3 = C12979a.C12980a.m20683a(requireActivity);
                a3.f28588b.setTitleText(getString(R.string.changes_saved));
                a3.mo45781a(CollageAlert.AlertType.SUCCESS);
                a3.f28588b.setIconDrawableRes(R.drawable.clg_icon_core_check_v1);
                a3.f28591e = 6000;
                a3.f28590d = true;
                a3.mo45786f();
                setResult(612, ((EditCollectionViewModel.C9838a.C9843e) aVar).f21746a);
                Dialog dialog4 = this.progressDialog;
                if (dialog4 != null) {
                    dialog4.dismiss();
                }
                dismiss();
            }
        } else {
            C19383o.m32805o("errorTextView");
            throw null;
        }
    }
}
