package com.etsy.android.vespa.viewholders;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.Banner;
import com.etsy.android.lib.models.apiv3.BannerButton;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.apiv3.vespa.CardActionableItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.view.BannerImageView;
import com.google.android.material.button.MaterialButton;
import p423pf.C13230a;

/* renamed from: com.etsy.android.vespa.viewholders.a */
public abstract class C12076a extends C12086e<CardActionableItem> {

    /* renamed from: c */
    public View f26934c;

    /* renamed from: d */
    public C13230a f26935d;

    /* renamed from: e */
    public final TextView f26936e;

    /* renamed from: f */
    public final TextView f26937f;

    /* renamed from: g */
    public final BannerImageView f26938g;

    /* renamed from: h */
    public final Button f26939h;

    /* renamed from: i */
    public final Button f26940i;

    /* renamed from: j */
    public final Button f26941j;

    /* renamed from: k */
    public boolean f26942k = false;

    /* renamed from: com.etsy.android.vespa.viewholders.a$a */
    public class C12077a extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ ServerDrivenAction f26943b;

        public C12077a(ServerDrivenAction serverDrivenAction) {
            this.f26943b = serverDrivenAction;
        }

        public final void onViewClick(View view) {
            C12076a aVar = C12076a.this;
            aVar.f26935d.mo45936d(aVar.itemView, this.f26943b);
        }
    }

    /* renamed from: com.etsy.android.vespa.viewholders.a$b */
    public class C12078b extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ BannerButton f26945b;

        public C12078b(BannerButton bannerButton) {
            this.f26945b = bannerButton;
        }

        public final void onViewClick(View view) {
            C12076a.this.f26935d.mo45934f(Integer.valueOf(C12076a.this.getAdapterPosition()), this.f26945b.getUrl(), this.f26945b.getDismissBannerOnTap().booleanValue());
        }
    }

    public C12076a(ViewGroup viewGroup, C13230a aVar, int i) {
        super(C0326j.m859c(viewGroup, i, viewGroup, false));
        this.f26935d = aVar;
        this.f26934c = mo38986f(R.id.bg_color_area);
        this.f26936e = (TextView) mo38986f(R.id.txt_title);
        this.f26937f = (TextView) mo38986f(R.id.txt_message);
        this.f26939h = (Button) mo38986f(R.id.btn_primary);
        this.f26940i = (Button) mo38986f(R.id.btn_secondary);
        this.f26941j = (Button) mo38986f(R.id.btn_dismiss);
        this.f26938g = (BannerImageView) mo38986f(R.id.image);
    }

    /* renamed from: g */
    public static RecyclerView m19891g(C12076a aVar) {
        if (aVar.itemView.getParent() instanceof RecyclerView) {
            return (RecyclerView) aVar.itemView.getParent();
        }
        return null;
    }

    /* renamed from: h */
    public static boolean m19892h(C12076a aVar, RecyclerView recyclerView) {
        aVar.getClass();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        int P0 = gridLayoutManager.mo11279P0();
        int T0 = gridLayoutManager.mo11283T0();
        return P0 != -1 && T0 != -1 && P0 <= aVar.getAdapterPosition() && T0 >= aVar.getAdapterPosition();
    }

    /* renamed from: i */
    public static void m19893i(C12076a aVar, Banner banner) {
        aVar.f26938g.setVisibility(0);
        aVar.mo38980j(banner.getAnimation());
        banner.setAnimation("none");
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f26938g.setImageDrawable((Drawable) null);
    }

    /* renamed from: j */
    public abstract void mo38980j(String str);

    /* renamed from: k */
    public void mo19450a(CardActionableItem cardActionableItem) {
        Banner banner = (Banner) cardActionableItem.getData();
        this.f26934c.setBackgroundColor(banner.getBackgroundColor());
        this.f26936e.setText(banner.getTitle());
        this.f26936e.setTextColor(banner.getTextColor());
        String message = banner.getMessage();
        if (!TextUtils.isEmpty(message)) {
            this.f26937f.setText(message);
            this.f26937f.setVisibility(0);
            this.f26937f.setTextColor(banner.getTextColor());
        } else {
            this.f26937f.setVisibility(8);
        }
        Image image = banner.getImage();
        if (image != null) {
            this.f26942k = false;
            BannerImageView bannerImageView = this.f26938g;
            bannerImageView.setImageInfo(image, new C12080b(this, bannerImageView, banner));
            if (!"none".equals(banner.getAnimation())) {
                this.f26938g.setVisibility(4);
                this.itemView.addOnAttachStateChangeListener(new C12084d(this, banner, new C12082c(this, banner)));
            } else {
                this.f26938g.setVisibility(0);
            }
        } else {
            this.f26938g.setVisibility(8);
        }
        mo38982l(this.f26939h, banner.getButtonPrimary());
        mo38982l(this.f26940i, banner.getButtonSecondary());
        ServerDrivenAction action = cardActionableItem.getAction(ServerDrivenAction.TYPE_DISMISS);
        if (action == null || this.f26935d == null) {
            this.f26941j.setVisibility(8);
            return;
        }
        this.f26941j.setOnClickListener(new C12077a(action));
        Button button = this.f26941j;
        if (button instanceof MaterialButton) {
            ((MaterialButton) button).setIconTint(ColorStateList.valueOf(banner.getDismissButtonColor()));
        }
    }

    /* renamed from: l */
    public final void mo38982l(Button button, BannerButton bannerButton) {
        if (this.f26935d == null || bannerButton == null || TextUtils.isEmpty(bannerButton.getUrl())) {
            button.setVisibility(8);
            return;
        }
        button.setOnClickListener(new C12078b(bannerButton));
        button.setVisibility(0);
        button.setText(bannerButton.getText());
    }
}
