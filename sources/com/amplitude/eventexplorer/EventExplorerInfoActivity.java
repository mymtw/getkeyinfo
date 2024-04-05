package com.amplitude.eventexplorer;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.etsy.android.R;
import p253u3.C8134a;

public class EventExplorerInfoActivity extends Activity {
    private ImageView closeImageView;
    private Button deviceIdCopyButton;
    private TextView deviceIdTextView;
    private Button userIdCopyButton;
    private TextView userIdTextView;

    /* renamed from: com.amplitude.eventexplorer.EventExplorerInfoActivity$a */
    public class C4871a implements View.OnClickListener {
        public C4871a() {
        }

        public final void onClick(View view) {
            EventExplorerInfoActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.amplitude.eventexplorer.EventExplorerInfoActivity$b */
    public class C4872b implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ String f11077b;

        public C4872b(String str) {
            this.f11077b = str;
        }

        public final void onClick(View view) {
            EventExplorerInfoActivity.this.copyText(view.getContext(), this.f11077b);
        }
    }

    /* renamed from: com.amplitude.eventexplorer.EventExplorerInfoActivity$c */
    public class C4873c implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ String f11079b;

        public C4873c(String str) {
            this.f11079b = str;
        }

        public final void onClick(View view) {
            EventExplorerInfoActivity.this.copyText(view.getContext(), this.f11079b);
        }
    }

    /* access modifiers changed from: private */
    public void copyText(Context context, String str) {
        if (str != null) {
            ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied text", str));
            Toast.makeText(context, getString(R.string.amp_label_copied), 0).show();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.amp_activity_eventexplorer_info);
        ImageView imageView = (ImageView) findViewById(R.id.amp_eeInfo_iv_close);
        this.closeImageView = imageView;
        imageView.setOnClickListener(new C4871a());
        this.deviceIdTextView = (TextView) findViewById(R.id.amp_eeInfo_tv_deviceId);
        this.userIdTextView = (TextView) findViewById(R.id.amp_eeInfo_tv_userId);
        String string = getIntent().getExtras().getString("instanceName");
        String str = C8134a.m16364a(string).f17825g;
        String str2 = C8134a.m16364a(string).f17824f;
        this.deviceIdTextView.setText(str != null ? str : getString(R.string.amp_label_not_avail));
        this.userIdTextView.setText(str2 != null ? str2 : getString(R.string.amp_label_not_avail));
        Button button = (Button) findViewById(R.id.amp_eeInfo_btn_copyDeviceId);
        this.deviceIdCopyButton = button;
        button.setOnClickListener(new C4872b(str));
        Button button2 = (Button) findViewById(R.id.amp_eeInfo_btn_copyUserId);
        this.userIdCopyButton = button2;
        button2.setOnClickListener(new C4873c(str2));
    }
}
