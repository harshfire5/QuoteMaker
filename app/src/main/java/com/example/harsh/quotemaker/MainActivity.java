package com.example.harsh.quotemaker;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.ImageView;
import android.util.TypedValue;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements img_frag.preview, img_frag1.preview1, input.texti{

    ImageView iv;
    View f1;
    TextView t1, t2;
    //String TAG = "Hello";
    String s1="";
    int t = 0, temp = 0, p = 0, pic = 0, pic1 = 0;
    ConstraintLayout co1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton b1 = (RadioButton) findViewById(R.id.radioButton);
        final RadioButton b2 = (RadioButton) findViewById(R.id.radioButton3);

        co1 = (ConstraintLayout)findViewById(R.id.constraint1);

        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final boolean h1 = b1.isChecked();
                        if(h1) {
                            b2.setChecked(false);
                            img_frag.v.setVisibility(View.VISIBLE);
                            img_frag1.v.setVisibility(View.INVISIBLE);
                        }
                    }
                }
        );

        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final boolean h1 = b2.isChecked();
                        if(h1) {
                            b1.setChecked(false);
                            img_frag1.v.setVisibility(View.VISIBLE);
                            img_frag.v.setVisibility(View.INVISIBLE);
                        }
                    }
                }
        );

        if(Build.VERSION.SDK_INT >= 23) {

            if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            }
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 2);
            }
        }

        settext1();

        Button bt1 = (Button) findViewById(R.id.button1);
        final Context c = this;
        bt1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Bitmap bmp = null;
                        Canvas canv = null;
                        if(t == 1) {
                            Drawable d;
                            if (pic == 1)
                                d = getResources().getDrawable(R.drawable.photo1);
                            else if (pic == 2)
                                d = getResources().getDrawable(R.drawable.photo2);
                            else if (pic == 3)
                                d = getResources().getDrawable(R.drawable.photo3);
                            else if (pic == 4)
                                d = getResources().getDrawable(R.drawable.photo4);
                            else
                                d = getResources().getDrawable(R.drawable.photo5);

                            //int h1 = d.getIntrinsicHeight();
                            //int w1 = d.getIntrinsicWidth();

                            Bitmap.Config conf = Bitmap.Config.ARGB_8888;
                            Bitmap bmp0 = ((BitmapDrawable) d).getBitmap();
                            bmp = bmp0.copy(conf, true);
                            canv = new Canvas(bmp);
                        }
                        if(temp == 1) {
                            bmp = Bitmap.createBitmap(1280, 720, Bitmap.Config.ARGB_8888);
                            canv = new Canvas(bmp);
                            Paint paint1 = new Paint();
                            if(pic1 == 1)
                                paint1.setColor(Color.parseColor("#00ddff"));
                            else if(pic1 == 2)
                                paint1.setColor(Color.parseColor("#0099cc"));
                            else if(pic1 == 3)
                                paint1.setColor(Color.parseColor("#33b5ef"));
                            else if(pic1 == 4)
                                paint1.setColor(Color.parseColor("#669900"));
                            else if(pic1 == 5)
                                paint1.setColor(Color.parseColor("#99cc00"));
                            else if(pic1 == 6)
                                paint1.setColor(Color.parseColor("#ff8800"));
                            else if(pic1 == 7)
                                paint1.setColor(Color.parseColor("#ffbb33"));
                            else if(pic1 == 8)
                                paint1.setColor(Color.parseColor("#cc0000"));
                            else if(pic1 == 9)
                                paint1.setColor(Color.parseColor("#ff4444"));
                            else if(pic1 == 10)
                                paint1.setColor(Color.parseColor("#ffffff"));
                            else if(pic1 == 11)
                                paint1.setColor(Color.parseColor("#aaaaaa"));
                            else
                                paint1.setColor(Color.parseColor("#000000"));
                            canv.drawRect(0F, 0F, 1280, 720, paint1);
                        }
                        if(t == 1 || temp == 1) {
                            File file = new File(Environment.getExternalStorageDirectory().getPath(), "image" + System.currentTimeMillis() + ".png");
                            try {
                                if (file.exists())
                                    file.delete();
                                else
                                    file.createNewFile();

                                Resources r = getResources();
                                int px = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 28,
                                        r.getDisplayMetrics()
                                );

                                FileOutputStream os = new FileOutputStream(file);

                                //paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                                //float y = (canv.getHeight() / 2) - ((paint.descent() + paint.ascent()) / 2);

                                TextPaint tpaint = new TextPaint();
                                tpaint.setColor(Color.WHITE);
                                tpaint.setShadowLayer(8, 2, 2, Color.DKGRAY);
                                //tpaint.setTextAlign(Paint.Align.CENTER);
                                StaticLayout tlayout;
                                if(t == 1) {
                                    Log.i("Hello", "" + bmp.getWidth()*getResources().getDisplayMetrics().density);
                                    tpaint.setTextSize(70);
                                    tlayout = new StaticLayout(s1, tpaint, (bmp.getWidth())-60, Layout.Alignment.ALIGN_CENTER,
                                            1.0f, 0f, false);
                                }
                                else {
                                    tpaint.setTextSize(70);
                                    tlayout = new StaticLayout(s1, tpaint, 1220, Layout.Alignment.ALIGN_CENTER,
                                            1.0f, 0f, false);
                                }
                                canv.save();
                                canv.translate((canv.getWidth() / 2) - (tlayout.getWidth() / 2), (canv.getHeight() / 2) - ((tlayout.getHeight() / 2)));
                                tlayout.draw(canv);

                                //canv.drawBitmap(bmp,0, 0, paint);
                                //canv.drawText(s1, canv.getWidth() / 2, y, paint);

                                //ByteArrayOutputStream bos = new ByteArrayOutputStream();
                                bmp.compress(Bitmap.CompressFormat.PNG, 0, os);
                                //byte[] bmpdata = bos.toByteArray();
                                os.flush();
                                os.close();
                                //bmp.recycle();
                                MediaStore.Images.Media.insertImage(getContentResolver(), file.getAbsolutePath(), file.getName(), file.getName());
                            } catch (IOException e) {
                                //bmp.recycle();
                                //Log.e("Hello", "problem combining images", e);
                                e.printStackTrace();
                            }

                            Toast.makeText(c, "Image Saved Successfully", Toast.LENGTH_SHORT).show();

                            MediaScannerConnection.scanFile(c, new String[]{file.toString()}, null,
                                    new MediaScannerConnection.OnScanCompletedListener() {
                                        public void onScanCompleted(String path, Uri uri) {
                                            Log.i("ExternalStorage", "Scanned " + path + ":");
                                            Log.i("ExternalStorage", "-> uri=" + uri);
                                        }
                                    });

                            /*Log.i("Hello", file.getPath());
                            //MimeTypeMap mymime = MimeTypeMap.getSingleton();
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            //String mime = mymime.getMimeTypeFromExtension("png");
                            //intent.setAction(Intent.ACTION_VIEW);
                            uri = FileProvider.getUriForFile(c, c.getPackageName() + ".provider", file);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_GRANT_READ_URI_PERMISSION|Intent.FLAG_ACTIVITY_NO_HISTORY);
                            intent.setDataAndType(uri, "image/png");
                            startActivity(intent);*/

                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            try {
                                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
                                    intent.setDataAndType(Uri.fromFile(file), "image/png");
                                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_GRANT_READ_URI_PERMISSION);
                                } else {
                                    //Uri uri = Uri.parse(file.getPath());
                                    if (file.exists()) {
                                        Uri uri = FileProvider.getUriForFile(c, BuildConfig.APPLICATION_ID + ".provider", file);
                                        intent.setDataAndType(uri, "image/png");
                                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_GRANT_READ_URI_PERMISSION);
                                    }
                                }
                            }catch(Exception e){
                                e.printStackTrace();
                            }

                            intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                            startActivity(intent);
                        }
                    }
                }
        );


    }

    public void imgselect1(img_frag ob1) {

        if(t == 1)
            ((ViewGroup)iv.getParent()).removeView(iv);
        if(temp == 1) {
            ((ViewGroup) f1.getParent()).removeView(f1);
            temp = 0;
        }
        iv = new ImageView(this);
        if (ob1.h1 == 1) {
            iv.setImageResource(R.drawable.photo1);
            pic = 1;
        }
        else if (ob1.h2 == 1) {
            iv.setImageResource(R.drawable.photo2);
            pic = 2;
        }
        else if (ob1.h3 == 1) {
            iv.setImageResource(R.drawable.photo3);
            pic = 3;
        }
        else if (ob1.h4 == 1) {
            iv.setImageResource(R.drawable.photo4);
            pic = 4;
        }
        else {
            iv.setImageResource(R.drawable.photo5);
            pic = 5;
        }

        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 5,
                r.getDisplayMetrics()
        );

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;

        View fo1 = findViewById(R.id.fragment3);
        int hh1 = co1.getHeight();
        int hh2 = fo1.getBottom();

        ConstraintLayout.LayoutParams l1 = new ConstraintLayout.LayoutParams(
                width,
                hh1-hh2-px
        );

        l1.topToBottom = R.id.fragment3;
        //l1.bottomToBottom = R.id.constraint1;
        l1.leftToLeft = R.id.constraint1;
        l1.rightToRight = R.id.constraint1;
        l1.setMargins(0, px,0,0);

        //iv.setAdjustViewBounds(true);
        //iv.setMaxHeight(hh1-hh2-px);
        iv.setScaleType(ImageView.ScaleType.FIT_XY);

        co1.addView(iv, l1);

        t1.bringToFront();
        t = 1;

        if(p == 0)
            settext2();
        else
            t2.bringToFront();
    }
    public void imgselect2(img_frag1 ob2){

        if(t == 1) {
            ((ViewGroup) iv.getParent()).removeView(iv);
            t = 0;
        }
        if(temp == 1)
            ((ViewGroup)f1.getParent()).removeView(f1);
        f1 = new View(this);
        if(ob2.h[0] == 1) {
            f1.setBackgroundColor(Color.parseColor("#00ddff"));
            pic1 = 1;
        }
        else if(ob2.h[1] == 1) {
            f1.setBackgroundColor(Color.parseColor("#0099cc"));
            pic1 = 2;
        }
        else if(ob2.h[2] == 1) {
            f1.setBackgroundColor(Color.parseColor("#33b5ef"));
            pic1 = 3;
        }
        else if(ob2.h[3] == 1) {
            f1.setBackgroundColor(Color.parseColor("#669900"));
            pic1 = 4;
        }
        else if(ob2.h[4] == 1) {
            f1.setBackgroundColor(Color.parseColor("#99cc00"));
            pic1 = 5;
        }
        else if(ob2.h[5] == 1) {
            f1.setBackgroundColor(Color.parseColor("#ff8800"));
            pic1 = 6;
        }
        else if(ob2.h[6] == 1) {
            f1.setBackgroundColor(Color.parseColor("#ffbb33"));
            pic1 = 7;
        }
        else if(ob2.h[7] == 1) {
            f1.setBackgroundColor(Color.parseColor("#cc0000"));
            pic1 = 8;
        }
        else if(ob2.h[8] == 1) {
            f1.setBackgroundColor(Color.parseColor("#ff4444"));
            pic1 = 9;
        }
        else if(ob2.h[9] == 1) {
            f1.setBackgroundColor(Color.parseColor("#ffffff"));
            pic1 = 10;
        }
        else if(ob2.h[10] == 1) {
            f1.setBackgroundColor(Color.parseColor("#aaaaaa"));
            pic1 = 11;
        }
        else {
            f1.setBackgroundColor(Color.parseColor("#000000"));
            pic1 = 12;
        }

        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 5,
                r.getDisplayMetrics()
        );

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;

        View fo1 = findViewById(R.id.fragment3);
        int hh1 = co1.getHeight();
        int hh2 = fo1.getBottom();

        ConstraintLayout.LayoutParams l1 = new ConstraintLayout.LayoutParams(
                width,
                hh1-hh2-px
        );

        l1.topToBottom = R.id.fragment3;
        //l1.bottomToBottom = R.id.constraint1;
        l1.leftToLeft = R.id.constraint1;
        l1.rightToRight = R.id.constraint1;
        l1.setMargins(0, px,0,0);

        co1.addView(f1, l1);
        t1.bringToFront();
        temp = 1;

        if(p == 0)
            settext2();
        else
            t2.bringToFront();
    }

    public void settext1(){
        t1 = new TextView(this);
        Resources r = getResources();
        int px0 = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 340,
                r.getDisplayMetrics()
        );
        int px1 = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 5,
                r.getDisplayMetrics()
        );

        ConstraintLayout.LayoutParams l2 = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        );
        //Log.i("Hello", "meow" + R.id.fragment3);
        l2.bottomToBottom = R.id.constraint1;
        l2.topToBottom = R.id.fragment3;
        l2.leftToLeft = R.id.constraint1;
        l2.rightToRight = R.id.constraint1;
        l2.setMargins(0, px1, 0, 0);
        t1.setWidth(px0);
        t1.setTextSize(20);
        t1.setTextColor(Color.WHITE);
        t1.setGravity(Gravity.CENTER_HORIZONTAL);
        co1.addView(t1, l2);
    }

    public void settext2(){
        t2 = new TextView(this);
        Resources r = getResources();
        int px0 = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 6,
                r.getDisplayMetrics()
        );

        ConstraintLayout.LayoutParams l3 = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        );

        l3.leftToLeft = R.id.constraint1;
        l3.topToBottom = R.id.fragment3;
        l3.setMargins(px0, px0 , 0 , 0);

        t2.setText("Preview");
        t2.setTextSize(18);
        t2.setTextColor(Color.LTGRAY);

        co1.addView(t2, l3);
        p = 1;
    }

    public void changetext(String s){
        s1 = s;
        t1.setText(s);
        t1.setShadowLayer(10,2,2,Color.DKGRAY);
    }


    //@Override
    /*public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
            Log.v(TAG,"Permission: "+permissions[0]+ "was "+grantResults[0]);
        }
    }*/
}
