ActivityTransition
==================

An android project presenting some transitions you can use between activities

#Integration

* Add the anim folder to your Android project's res folder
* Import the ActivityAnimator class
* Call `new ActivityAnimator().animationName(this)` right after the `startActivity(Intent i)` method

Note that the ActivityAnimator class is here to help you choosing your animation but you can also directly use `overridePendingTransition(int, int)` on your Activity

#Animations

Fade

[![Alt text](http://philbert.mobi/img/fade.jpg)](http://philbert.mobi/gif/fade.gif)

Flip Horizontal

[![Alt text](http://philbert.mobi/img/flip-horizontal.jpg)](http://philbert.mobi/gif/flip-horizontal.gif)

Flip Vertical

[![Alt text](http://philbert.mobi/img/flip-vertical.jpg)](http://philbert.mobi/gif/flip-vertical.gif)

Disappear Top Left

[![Alt text](http://philbert.mobi/img/disappear_top_left.jpg)](http://philbert.mobi/gif/disappear_top_left.gif)

Appear Top Left

[![Alt text](http://philbert.mobi/img/appear_top_left.jpg)](http://philbert.mobi/gif/appear_top_left.gif)

Appear Bottom Right

[![Alt text](http://philbert.mobi/img/appear_bottom_right.jpg)](http://philbert.mobi/gif/appear_bottom_right.gif)

Disappear Bottom Right

[![Alt text](http://philbert.mobi/img/disappear_bottom_right.jpg)](http://philbert.mobi/gif/disappear_bottom_right.gif)

Unzoom

[![Alt text](http://philbert.mobi/img/zoom.jpg)](http://philbert.mobi/gif/zoom.gif)
