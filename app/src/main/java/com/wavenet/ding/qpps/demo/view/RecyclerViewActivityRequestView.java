package com.wavenet.ding.qpps.demo.view;

import com.dereck.library.base.IMvpBaseView;

public interface RecyclerViewActivityRequestView extends IMvpBaseView {

    void resultSuccess(String result);

    void show();

    void hide();

    void resultFailure(String result);
}