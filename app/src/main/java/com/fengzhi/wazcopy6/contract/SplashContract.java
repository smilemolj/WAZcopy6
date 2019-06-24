package com.fengzhi.wazcopy6.contract;

import com.fengzhi.wazcopy6.base.AbstractPresenter;
import com.fengzhi.wazcopy6.base.AbstractView;

public interface SplashContract {
    interface View extends AbstractView {
        /**
         * after some time jump to main page
         */
        void jumpToMain();
    }

    interface Presenter extends AbstractPresenter<View> {

    }
}
