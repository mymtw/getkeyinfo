package com.etsy.android.p327ui.cardview.clickhandlers;

import android.content.res.Resources;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.vespa.UserAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.k */
public abstract class C9126k {

    /* renamed from: com.etsy.android.ui.cardview.clickhandlers.k$a */
    public static final class C9127a extends C9126k {

        /* renamed from: a */
        public static final C9127a f20059a = new C9127a();

        /* renamed from: a */
        public final List<UserAction> mo31352a(Resources resources, boolean z) {
            C19383o.m32797g(resources, "resources");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new UserAction(UserAction.TYPE_REPORT_LISTING, resources.getString(R.string.report_listing), resources.getResourceEntryName(R.drawable.clg_icon_core_flag_v1), R.id.view_type_bottom_sheet_list_item));
            arrayList.add(new UserAction(UserAction.TYPE_ADD_TO_LIST, resources.getString(z ? R.string.manage_collections : R.string.add_to_collection), resources.getResourceEntryName(R.drawable.clg_icon_core_list_v1), R.id.view_type_bottom_sheet_list_item));
            arrayList.add(new UserAction(UserAction.TYPE_SEE_SIMILAR, resources.getString(R.string.see_similar_items), resources.getResourceEntryName(R.drawable.clg_icon_core_addimage_v1), R.id.view_type_bottom_sheet_list_item));
            arrayList.add(new UserAction(UserAction.TYPE_GOTO_SHOP, resources.getString(R.string.visit_shop), resources.getResourceEntryName(R.drawable.clg_icon_core_shop_v1), R.id.view_type_bottom_sheet_list_item));
            arrayList.add(new UserAction(UserAction.TYPE_SHARE, resources.getString(R.string.share), resources.getResourceEntryName(R.drawable.clg_icon_core_androidshare_v1), R.id.view_type_bottom_sheet_list_item));
            return arrayList;
        }
    }

    /* renamed from: com.etsy.android.ui.cardview.clickhandlers.k$b */
    public static final class C9128b extends C9126k {

        /* renamed from: a */
        public static final C9128b f20060a = new C9128b();

        /* renamed from: a */
        public final List<UserAction> mo31352a(Resources resources, boolean z) {
            C19383o.m32797g(resources, "resources");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new UserAction(UserAction.TYPE_REPORT_LISTING, resources.getString(R.string.report_listing), resources.getResourceEntryName(R.drawable.clg_icon_core_flag_v1), R.id.view_type_bottom_sheet_list_item));
            arrayList.add(new UserAction(UserAction.TYPE_ADD_TO_LIST, resources.getString(z ? R.string.manage_collections : R.string.add_to_collection), resources.getResourceEntryName(R.drawable.clg_icon_core_list_v1), R.id.view_type_bottom_sheet_list_item));
            arrayList.add(new UserAction(UserAction.TYPE_SHARE, resources.getString(R.string.share), resources.getResourceEntryName(R.drawable.clg_icon_core_androidshare_v1), R.id.view_type_bottom_sheet_list_item));
            return arrayList;
        }
    }

    /* renamed from: a */
    public abstract List<UserAction> mo31352a(Resources resources, boolean z);
}
