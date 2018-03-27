package com.example.harsh.quotemaker;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class img_frag extends Fragment{

    preview prev1;
    public interface preview{
        void imgselect1(img_frag j1);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof preview)
            prev1 = (preview)context;
    }

    static View v;
    int h1 = 0, h2 = 0, h3 = 0, h4 = 0, h5 = 0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.image_input0, container, false);
        v.setVisibility(View.VISIBLE);

        final ImageView i1 = (ImageView)v.findViewById(R.id.image0);
        final ImageView i2 = (ImageView)v.findViewById(R.id.image1);
        final ImageView i3 = (ImageView)v.findViewById(R.id.image2);
        final ImageView i4 = (ImageView)v.findViewById(R.id.image3);
        final ImageView i5 = (ImageView)v.findViewById(R.id.image4);


        i1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h1 == 0) {
                            b1color(i1, i2, i3, i4, i5);
                            i1.setBackgroundColor(Color.BLACK);
                            i1.setPadding(10,10,10,10);
                            h1 = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h2 == 0) {
                            b1color(i1, i2, i3, i4, i5);
                            i2.setBackgroundColor(Color.BLACK);
                            i2.setPadding(10,10,10,10);
                            h2 = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h3 == 0) {
                            b1color(i1, i2, i3, i4, i5);
                            i3.setBackgroundColor(Color.BLACK);
                            i3.setPadding(10,10,10,10);
                            h3 = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h4 == 0) {
                            b1color(i1, i2, i3, i4, i5);
                            i4.setBackgroundColor(Color.BLACK);
                            i4.setPadding(10,10,10,10);
                            h4 = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h5 == 0) {
                            b1color(i1, i2, i3, i4, i5);
                            i5.setBackgroundColor(Color.BLACK);
                            i5.setPadding(10,10,10,10);
                            h5 = 1;
                            buttonclicked();
                        }
                    }
                }
        );
        return v;
    }

    void b1color(ImageView i1, ImageView i2, ImageView i3, ImageView i4, ImageView i5){
        if(h1 == 1) {
            i1.setBackgroundColor(Color.WHITE);
            i1.setPadding(0, 0, 0, 0);
            h1 = 0;
        }
        if(h2 == 1) {
            i2.setBackgroundColor(Color.WHITE);
            i2.setPadding(0, 0, 0, 0);
            h2 = 0;
        }
        if(h3 == 1) {
            i3.setBackgroundColor(Color.WHITE);
            i3.setPadding(0, 0, 0, 0);
            h3 = 0;
        }
        if(h4 == 1) {
            i4.setBackgroundColor(Color.WHITE);
            i4.setPadding(0, 0, 0, 0);
            h4 = 0;
        }
        if(h5 == 1) {
            i5.setBackgroundColor(Color.WHITE);
            i5.setPadding(0, 0, 0, 0);
            h5 = 0;
        }
    }

    public void buttonclicked(){
        prev1.imgselect1(this);
    }
}
