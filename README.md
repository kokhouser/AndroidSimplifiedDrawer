Android Simplified Drawer
=======================

An Android library which provides a simple activity class to extend from to enable both left and right navigation drawers.

It is currently **NOT** ready.

A sample app is made available in the "app2" folder. Simply import it into your Android Studio and build. (Play Store listing coming soon).

Features
=======================
The current version of ASD supports extremely basic drawer functionality. It removes a lot of boilerplate code needed to make navigation drawers work.

A DrawerActivity class is provided to be extended by any activity that uses a drawer.

A DrawerManager class is also provided to be used to initialize drawers.

As of this version, ASD provides basic, one-layout type of drawer items, containing a single icon and it's label. In the future, I hope to provide functionality to have custom drawer item types, for both drawers (left and right).

![image](http://kokhouser.github.io/Readme/Images/earlysample.png = 250x250)

Usage
=======================
A complete guide on using ASD can be found on the project page.


TO-DO
=======================
- ~~Clean up DrawerManager.~~
- Provide interface to define own drawer items.
- Provide mechanism to define placement of subitems etc.
- Provide means to implement right drawer.
- Write up comprehensive README.
