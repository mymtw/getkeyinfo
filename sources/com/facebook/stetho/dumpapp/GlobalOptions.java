package com.facebook.stetho.dumpapp;

import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class GlobalOptions {
    public final Option optionHelp;
    public final Option optionListPlugins;
    public final Option optionProcess;
    public final Options options;

    public GlobalOptions() {
        Option option = new Option("h", "help", false, "Print this help");
        this.optionHelp = option;
        Option option2 = new Option("l", ResponseConstants.LIST, false, "List available plugins");
        this.optionListPlugins = option2;
        Option option3 = new Option(Constants.APPBOY_PUSH_PRIORITY_KEY, "process", true, "Specify target process");
        this.optionProcess = option3;
        Options options2 = new Options();
        this.options = options2;
        options2.addOption(option);
        options2.addOption(option2);
        options2.addOption(option3);
    }
}
