package io.github.douglasjunior.ReactNativeEasyBluetooth.le;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.github.douglasjunior.bluetoothlowenergylibrary.BluetoothLeService;

import io.github.douglasjunior.ReactNativeEasyBluetooth.core.CoreModule;

/**
 * Created by douglas on 30/05/17.
 */

public class LowEnergyModule extends CoreModule {

    public LowEnergyModule(ReactApplicationContext reactContext) {
        super(reactContext, BluetoothLeService.class);
    }

    @Override
    public String getName() {
        return "EasyBluetoothLE";
    }

    /* ====================================
                 REACT METHODS
     ==================================== */

    @ReactMethod
    @Override
    public void init(ReadableMap config, Promise promise) {
        super.init(config, promise);
    }

    @ReactMethod
    @Override
    public void startScan(Promise promise) {
        super.startScan(promise);
    }

    @ReactMethod
    @Override
    public void stopScan(Promise promise) throws InterruptedException {
        super.stopScan(promise);
    }

    @ReactMethod
    @Override
    public void connect(ReadableMap device, Promise promise) throws InterruptedException {
        super.connect(device, promise);
    }

    @ReactMethod
    @Override
    public void disconnect(Promise promise) {
        super.disconnect(promise);
    }

    @ReactMethod
    @Override
    public void getStatus(Promise promise) {
        super.getStatus(promise);
    }

    @ReactMethod
    @Override
    public void write(String data, Promise promise) {
        super.write(data, promise);
    }

    @ReactMethod
    @Override
    public void writeln(String data, Promise promise) {
        super.writeln(data, promise);
    }

    @ReactMethod
    @Override
    public void writeIntArray(ReadableArray data, Promise promise) {
        super.writeIntArray(data, promise);
    }

    @ReactMethod
    @Override
    public void stopService(Promise promise) {
        super.stopService(promise);
    }

    /* ====================================
            ADAPTER - REACT METHODS
     ==================================== */

    @ReactMethod
    @Override
    public void isAdapterEnable(Promise promise) {
        super.isAdapterEnable(promise);
    }

    @ReactMethod
    @Override
    public void enable(Promise promise) {
        super.enable(promise);
    }

    @ReactMethod
    @Override
    public void disable(Promise promise) {
        super.disable(promise);
    }

    @ReactMethod
    @Override
    public void getBoundedDevices(Promise promise) {
        super.getBoundedDevices(promise);
    }

}
