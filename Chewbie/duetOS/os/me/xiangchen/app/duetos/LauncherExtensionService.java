package me.xiangchen.app.duetos;

import com.sonyericsson.extras.liveware.extension.util.ExtensionService;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;

public class LauncherExtensionService extends ExtensionService {

	public static final String EXTENSION_KEY = "me.xiangchen.app.duetos.key";
	public LauncherExtensionService() {
        super(EXTENSION_KEY);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected RegistrationInformation getRegistrationInformation() {
        return new LauncherRegistrationInformation(this);
    }

    @Override
    protected boolean keepRunningWhenConnected() {
        return false;
    }

	@Override
	public ControlExtension createControlExtension(String hostAppPackageName) {
		return new LauncherExtension(this, hostAppPackageName);
	}

}
