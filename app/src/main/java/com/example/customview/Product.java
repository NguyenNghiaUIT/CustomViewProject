package com.example.customview;

/**
 * Created by NguyenNghia on 3/11/2016.
 */
public class Product {
    private int price;
    public void setPrice(int price){
        int oldPrice = this.price;
        this.price = price;
        listener.Nghia(oldPrice, price);
    }

    OnPriceChanged listener;

    public void setOnPriceChangedListener(OnPriceChanged listener){
        this.listener = listener;
    }

    public interface OnPriceChanged{
        public void Nghia(int oldPrice, int newPrice);
    }
}
