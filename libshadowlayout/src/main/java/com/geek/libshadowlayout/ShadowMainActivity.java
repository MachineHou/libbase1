package com.geek.libshadowlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.geek.libshadowlayout.widgets.ShadowLayouts;

/**
 * 首页展示
 */
public class ShadowMainActivity extends AppCompatActivity {
    private ShadowLayouts ShadowLayoutShadow;
    private ShadowLayouts ShadowLayoutShape;
    private ShadowLayouts ShadowLayoutWiki;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shadowmain);
        ShadowLayoutShadow = findViewById(R.id.ShadowLayout_shadow);
        ShadowLayoutShape = findViewById(R.id.ShadowLayout_shape);
        ShadowLayoutWiki = findViewById(R.id.ShadowLayout_wiki);
        ShadowLayoutShadow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShadowMainActivity.this, ShadowActivity.class));
            }
        });
        ShadowLayoutShape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShadowMainActivity.this, ShapeActivity.class));
            }
        });
    }
}
