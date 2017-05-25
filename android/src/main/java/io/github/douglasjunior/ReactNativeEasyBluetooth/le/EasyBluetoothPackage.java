package io.github.douglasjunior.ReactNativeEasyBluetooth.le;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.github.douglasjunior.bluetoothlowenergylibrary.BluetoothLeService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.github.douglasjunior.ReactNativeEasyBluetooth.core.CoreModule;

/**
 * Created by douglas on 24/05/17.
 */

public class EasyBluetoothPackage implements ReactPackage {

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new CoreModule(reactContext, BluetoothLeService.class));
        return modules;
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}