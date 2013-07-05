package me.xiangchen.app.rotatesense;

import android.content.ContentValues;
import android.content.Context;

import com.sonyericsson.extras.liveware.aef.registration.Registration;
import com.sonyericsson.extras.liveware.extension.util.ExtensionUtils;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;

public class RotateSenseRegistrationInformation extends RegistrationInformation {
	final Context mContext;

	protected RotateSenseRegistrationInformation(Context context) {
		if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        mContext = context;
	}
	
	@Override
    public int getRequiredControlApiVersion() {
        return 1;
    }

    @Override
    public int getRequiredSensorApiVersion() {
        return 0;
    }

    @Override
    public int getRequiredNotificationApiVersion() {
        return 0;
    }

    @Override
    public int getRequiredWidgetApiVersion() {
        return 0;
    }

    @Override
    public ContentValues getExtensionRegistrationConfiguration() {
        String extensionIcon = ExtensionUtils.getUriString(mContext,
                R.drawable.ic_extension);
        String iconHostapp = ExtensionUtils.getUriString(mContext,
                R.drawable.ic_launcher);

        String configurationText = mContext.getString(R.string.configuration_text);
        String extensionName = mContext.getString(R.string.extension_name);

        ContentValues values = new ContentValues();

        values.put(Registration.ExtensionColumns.CONFIGURATION_TEXT, configurationText);
        values.put(Registration.ExtensionColumns.EXTENSION_ICON_URI, extensionIcon);
        values.put(Registration.ExtensionColumns.EXTENSION_KEY,
                RotateSenseExtensionService.EXTENSION_KEY);
        values.put(Registration.ExtensionColumns.HOST_APP_ICON_URI, iconHostapp);
        values.put(Registration.ExtensionColumns.NAME, extensionName);
        values.put(Registration.ExtensionColumns.NOTIFICATION_API_VERSION,
                getRequiredNotificationApiVersion());
        values.put(Registration.ExtensionColumns.PACKAGE_NAME, mContext.getPackageName());

        return values;
    }
    
    @Override
    public boolean isDisplaySizeSupported(int width, int height) {
        return ((width == RotateSenseExtension.getSupportedControlWidth(mContext) && height == RotateSenseExtension
                .getSupportedControlHeight(mContext)));
    }
}
