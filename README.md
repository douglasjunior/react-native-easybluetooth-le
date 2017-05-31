# Easy Bluetooth LE

[![Licence MIT](https://img.shields.io/badge/licence-MIT-blue.svg)](https://github.com/douglasjunior/react-native-easybluetooth-le/blob/master/LICENSE)
[![npm version](https://img.shields.io/npm/v/easy-bluetooth-le.svg)](https://www.npmjs.com/package/easy-bluetooth-le)
[![npm downloads](https://img.shields.io/npm/dt/easy-bluetooth-le.svg)](#install)

A Library for easy implementation of Serial Bluetooth Low Energy on React Native.

## Requirements

- Android 4.3 (API 18)
- *iOS soon...*

## Use

### Configuration

```javascript
import EasyBluetooth from 'easy-bluetooth-le';

...

    var config = {
      "uuidService": "e7810a71-73ae-499d-8c15-faa9aef0c3f2",
      "uuidCharacteristic": "bef8d6c9-9c21-4c9e-b632-bd58c1009f9f",
      "deviceName": "Bluetooth Example Project",
      "bufferSize": 1024,
      "characterDelimiter": "\n"
    }

    EasyBluetooth.init(config)
      .then(function (config) {
        console.log("config done!");
      })
      .catch(function (ex) {
        console.warn(ex);
      });
```

### Scanning

```javascript
    EasyBluetooth.startScan()
      .then(function (devices) {
        console.log("all devices found:");
        console.log(devices);
      })
      .catch(function (ex) {
        console.warn(ex);
      });
```

### Connecting

```javascript
    EasyBluetooth.connect(device)
      .then(() => {
        console.log("Connected!");
      })
      .catch((ex) => {
        console.warn(ex);
      })
```

### Writing

```javascript
    EasyBluetooth.writeln("Works in React Native!")
      .then(() => {
        console.log("Writing...")
      })
      .catch((ex) => {
        console.warn(ex);
      })
```

## Install 

1. Run in console:
   ```bash
   npm i -s easy-bluetooth-le
   ```

2. Link:
   ```bash
   react-native link easy-bluetooth-le
   ```
    
2. Add jitpack repository in `android/build.gradle`:
   ```gradle
   allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
   }

   ```
 
## Known issues

- Location needs to be enabled for Bluetooth Low Energy Scanning on Android 6.0 http://stackoverflow.com/a/33045489/2826279
 
## Contribute

New features, bug fixes and improvements are welcome! For questions and suggestions use the [issues](https://github.com/douglasjunior/react-native-easybluetooth-le/issues).

## Donate

[![Donate](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=ZJ6TCL3EVUDDL)


## Licence

```
The MIT License (MIT)

Copyright (c) 2017 Douglas Nassif Roma Junior
```

See the full [licence file](https://github.com/douglasjunior/react-native-easybluetooth-le/blob/master/LICENSE).
