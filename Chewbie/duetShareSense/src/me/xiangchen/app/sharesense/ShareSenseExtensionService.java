package me.xiangchen.app.sharesense;

import com.sonyericsson.extras.liveware.extension.util.ExtensionService;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;

public class ShareSenseExtensionService extends ExtensionService {

	public static final String EXTENSION_KEY = "me.xiangchen.app.sharesense.key";

	public ShareSenseExtensionService() {
		super(EXTENSION_KEY);
	}

	@Override
	public void onCreate() {
		super.onCreate();
	}

	@Override
	protected RegistrationInformation getRegistrationInformation() {
		return new ShareSenseRegistrationInformation(this);
	}

	@Override
	protected boolean keepRunningWhenConnected() {
		return false;
	}

	@Override
	public ControlExtension createControlExtension(String hostAppPackageName) {
		return new ShareSenseExtension(this, hostAppPackageName);
	}
}
