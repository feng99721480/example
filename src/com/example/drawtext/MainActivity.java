package com.example.drawtext;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Bitmap.Config;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/*Paint paint = new Paint();
		paint.setTextSize(20);
		paint.setColor(Color.BLUE);

		FontMetrics fontMetrics = paint.getFontMetrics();
		String text = "sdfsdfsdfsfs";

		float baseX = 0;
		float baseY = 100;
		

		Bitmap bitmap = Bitmap.createBitmap(480, 800, Config.RGB_565);
		Canvas canvas = new Canvas(bitmap);
		canvas.drawText(text, baseX, baseY, paint);
		
		// BaseLine�軭  
		   Paint baseLinePaint = new Paint( Paint.ANTI_ALIAS_FLAG);  
		   baseLinePaint.setColor( Color.RED);  
		   canvas.drawLine(0, baseY, bitmap.getWidth(), baseY, baseLinePaint);*/
		Rect targetRect = new Rect(50, 50, 200, 10);
	    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
	    paint.setStrokeWidth(3);
	    paint.setTextSize(20);
	    String testString = "���ԣ�ijkJQKA:1234";
	    paint.setColor(Color.CYAN);
	    Bitmap bitmap = Bitmap.createBitmap(480, 800, Config.RGB_565);
	    Canvas canvas = new Canvas(bitmap);
	    canvas.drawRect(targetRect, paint);
	    paint.setColor(Color.RED);
	    FontMetricsInt fontMetrics = paint.getFontMetricsInt();
	    // ת����ע��������http://blog.csdn.net/hursing
	    int baseline = targetRect.top + (targetRect.bottom - targetRect.top - fontMetrics.bottom + fontMetrics.top) / 2 - fontMetrics.top;
	    // ����������ʵ��ˮƽ���У�drawText��Ӧ��Ϊ����targetRect.centerX()
	    paint.setTextAlign(Paint.Align.CENTER);
	    canvas.drawText(testString, targetRect.centerX(), baseline, paint);
	}

}
