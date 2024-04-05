package com.etsy.android.p327ui.favorites.editlist;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.C9056g;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionBottomSheetFragment$onViewCreated$3 */
public final class EditCollectionBottomSheetFragment$onViewCreated$3 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ EditCollectionBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditCollectionBottomSheetFragment$onViewCreated$3(EditCollectionBottomSheetFragment editCollectionBottomSheetFragment) {
        super(1);
        this.this$0 = editCollectionBottomSheetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        Button button;
        EditCollectionBottomSheetFragment editCollectionBottomSheetFragment = this.this$0;
        Context requireContext = this.this$0.requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        CollageTextInput collageTextInput = new CollageTextInput(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        EditCollectionBottomSheetFragment editCollectionBottomSheetFragment2 = this.this$0;
        collageTextInput.setText(editCollectionBottomSheetFragment2.getUpdateCollectionSpec().f21540b);
        collageTextInput.setCounterEnabled(true);
        collageTextInput.setCounterMaxLength(collageTextInput.getResources().getInteger(R.integer.collection_name_max_character_length));
        collageTextInput.setLabelText(editCollectionBottomSheetFragment2.getString(R.string.collection_edit_rename_collection));
        collageTextInput.setMultiline(false);
        editCollectionBottomSheetFragment.editNameDialog = collageTextInput;
        EditCollectionBottomSheetFragment editCollectionBottomSheetFragment3 = this.this$0;
        Context requireContext2 = editCollectionBottomSheetFragment3.requireContext();
        C19383o.m32796f(requireContext2, "requireContext()");
        AlertDialog create = new C9056g(requireContext2).setPositiveButton(R.string.save, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, new C9848d()).create();
        EditCollectionBottomSheetFragment editCollectionBottomSheetFragment4 = this.this$0;
        int dimensionPixelSize = editCollectionBottomSheetFragment4.getResources().getDimensionPixelSize(R.dimen.clg_space_16);
        CollageTextInput access$getEditNameDialog$p = editCollectionBottomSheetFragment4.editNameDialog;
        if (access$getEditNameDialog$p != null) {
            create.setView(access$getEditNameDialog$p, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0);
            editCollectionBottomSheetFragment3.renameDialog = create;
            AlertDialog access$getRenameDialog$p = this.this$0.renameDialog;
            if (access$getRenameDialog$p != null) {
                access$getRenameDialog$p.show();
            }
            AlertDialog access$getRenameDialog$p2 = this.this$0.renameDialog;
            if (access$getRenameDialog$p2 != null && (button = access$getRenameDialog$p2.getButton(-1)) != null) {
                button.setOnClickListener(new C9849e(this.this$0));
                return;
            }
            return;
        }
        C19383o.m32805o("editNameDialog");
        throw null;
    }
}
