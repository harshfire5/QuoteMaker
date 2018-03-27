package com.example.harsh.quotemaker;

import android.graphics.Color;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.*;

public class img_frag1 extends Fragment{

    preview1 prev2;
    public interface preview1{
        void imgselect2(img_frag1 j2);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof preview1)
            prev2 = (preview1)context;
    }

    static View v;
    int h[] = new int[12];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.image_input1, container, false);
        v.setVisibility(View.INVISIBLE);

        Arrays.fill(h, 0);
        final ImageView i0 = (ImageView)v.findViewById(R.id.img0);
        final ImageView i1 = (ImageView)v.findViewById(R.id.img1);
        final ImageView i2 = (ImageView)v.findViewById(R.id.img2);
        final ImageView i3 = (ImageView)v.findViewById(R.id.img3);
        final ImageView i4 = (ImageView)v.findViewById(R.id.img4);
        final ImageView i5 = (ImageView)v.findViewById(R.id.img5);
        final ImageView i6 = (ImageView)v.findViewById(R.id.img6);
        final ImageView i7 = (ImageView)v.findViewById(R.id.img7);
        final ImageView i8 = (ImageView)v.findViewById(R.id.img8);
        final ImageView i9 = (ImageView)v.findViewById(R.id.img9);
        final ImageView i10 = (ImageView)v.findViewById(R.id.img10);
        final ImageView i11 = (ImageView)v.findViewById(R.id.img11);

        i0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h[0] == 0) {
                            b1color(i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
                            i0.setBackgroundColor(Color.BLACK);
                            i0.setPadding(10,10,10,10);
                            h[0] = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h[1] == 0) {
                            b1color(i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
                            i1.setBackgroundColor(Color.BLACK);
                            i1.setPadding(10,10,10,10);
                            h[1] = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h[2] == 0) {
                            b1color(i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
                            i2.setBackgroundColor(Color.BLACK);
                            i2.setPadding(10,10,10,10);
                            h[2] = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h[3] == 0) {
                            b1color(i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
                            i3.setBackgroundColor(Color.BLACK);
                            i3.setPadding(10,10,10,10);
                            h[3] = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h[4] == 0) {
                            b1color(i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
                            i4.setBackgroundColor(Color.BLACK);
                            i4.setPadding(10,10,10,10);
                            h[4] = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h[5] == 0) {
                            b1color(i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
                            i5.setBackgroundColor(Color.BLACK);
                            i5.setPadding(10,10,10,10);
                            h[5] = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h[6] == 0) {
                            b1color(i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
                            i6.setBackgroundColor(Color.BLACK);
                            i6.setPadding(10,10,10,10);
                            h[6] = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h[7] == 0) {
                            b1color(i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
                            i7.setBackgroundColor(Color.BLACK);
                            i7.setPadding(10,10,10,10);
                            h[7] = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h[8] == 0) {
                            b1color(i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
                            i8.setBackgroundColor(Color.BLACK);
                            i8.setPadding(10,10,10,10);
                            h[8] = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h[9] == 0) {
                            b1color(i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
                            i9.setBackgroundColor(Color.BLACK);
                            i9.setPadding(10,10,10,10);
                            h[9] = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h[10] == 0) {
                            b1color(i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
                            i10.setBackgroundColor(Color.BLACK);
                            i10.setPadding(10,10,10,10);
                            h[10] = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        i11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(h[11] == 0) {
                            b1color(i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
                            i11.setBackgroundColor(Color.WHITE);
                            i11.setPadding(10,10,10,10);
                            h[11] = 1;
                            buttonclicked();
                        }
                    }
                }
        );

        return v;
    }

    void b1color(ImageView i0, ImageView i1, ImageView i2, ImageView i3, ImageView i4, ImageView i5, ImageView i6, ImageView i7, ImageView i8, ImageView i9, ImageView i10, ImageView i11){
        if(h[0] == 1) {
            i0.setBackgroundColor(Color.WHITE);
            i0.setPadding(0, 0, 0, 0);
            h[0] = 0;
        }
        if(h[1] == 1) {
            i1.setBackgroundColor(Color.WHITE);
            i1.setPadding(0, 0, 0, 0);
            h[1] = 0;
        }
        if(h[2] == 1) {
            i2.setBackgroundColor(Color.WHITE);
            i2.setPadding(0, 0, 0, 0);
            h[2] = 0;
        }
        if(h[3] == 1) {
            i3.setBackgroundColor(Color.WHITE);
            i3.setPadding(0, 0, 0, 0);
            h[3] = 0;
        }
        if(h[4] == 1) {
            i4.setBackgroundColor(Color.WHITE);
            i4.setPadding(0, 0, 0, 0);
            h[4] = 0;
        }
        if(h[5] == 1) {
            i5.setBackgroundColor(Color.WHITE);
            i5.setPadding(0, 0, 0, 0);
            h[5] = 0;
        }
        if(h[6] == 1) {
            i6.setBackgroundColor(Color.WHITE);
            i6.setPadding(0, 0, 0, 0);
            h[6] = 0;
        }
        if(h[7] == 1) {
            i7.setBackgroundColor(Color.WHITE);
            i7.setPadding(0, 0, 0, 0);
            h[7] = 0;
        }
        if(h[8] == 1) {
            i8.setBackgroundColor(Color.WHITE);
            i8.setPadding(0, 0, 0, 0);
            h[8] = 0;
        }
        if(h[9] == 1) {
            i9.setBackgroundColor(Color.WHITE);
            i9.setPadding(0, 0, 0, 0);
            h[9] = 0;
        }
        if(h[10] == 1) {
            i10.setBackgroundColor(Color.WHITE);
            i10.setPadding(0, 0, 0, 0);
            h[10] = 0;
        }
        if(h[11] == 1) {
            i11.setBackgroundColor(Color.BLACK);
            i11.setPadding(0, 0, 0, 0);
            h[11] = 0;
        }
    }

    public void buttonclicked(){
        prev2.imgselect2(this);
    }

}
