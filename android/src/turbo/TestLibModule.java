package com.testlib;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;

public class TestLibModule extends NativeTestLibSpec {
  public static final String NAME = TestLibModuleImpl.NAME;

  TestLibModule(ReactApplicationContext context) {
    super(context);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @Override
  @ReactMethod
  public void multiply(double a, double b, Promise promise) {
    promise.resolve(TestLibModuleImpl.multiply(a, b));
  }
}
