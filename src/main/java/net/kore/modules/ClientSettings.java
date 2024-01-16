package net.kore.modules;

import net.kore.Kore;
import net.kore.settings.BooleanSetting;
import net.kore.settings.ModeSetting;

public class ClientSettings extends Module {
    public ModeSetting hideModules;
    public BooleanSetting debug;
    public BooleanSetting richPresence;
    public BooleanSetting autoUpdate;

    public ClientSettings() {
        super("Client Settings", Category.SETTINGS);
        this.setToggled(true);
        this.hideModules = new ModeSetting("Hidden modules", "None", "None", "Detected", "Premium", "Premium + Detected");
        this.debug = new BooleanSetting("Developer Mode", false);
        this.richPresence = new BooleanSetting("Rich Presence", true);
        this.autoUpdate = new BooleanSetting("Auto Update", true);
        this.addSettings(hideModules, debug, richPresence, autoUpdate);
    }

    @Override
    public void assign() {
        Kore.clientSettings = this;
    }

}