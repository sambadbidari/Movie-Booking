package com.loopwiki.movie;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by sambad on 2/13/18
 */

public class Seat extends AppCompatTextView {

    public Seat(Context context) {
        super(context);

    }

    public Seat(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    public Seat(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }

    private String seatNumber;
    private Boolean isSelected = false;
    private Boolean isWomen = false;
    private Double seatPrice = 100.00;

    public Boolean getIsWomen() {
        return isWomen;
    }

    public void setIsWomen(Boolean isWomen) {
        this.isWomen = isWomen;
    }

    public Double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(Double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public Boolean getIsSelected() {
        return isSelected;
    }

    public Boolean setSelected() {

        this.isSelected = !this.isSelected;

        if (getIsSelected()) {
            setBackgroundColor(0xff99cc00);

        } else {
            setBackgroundColor(0xff33b5e5);

        }

        return isSelected;

    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;

        setText(seatNumber);
    }

}