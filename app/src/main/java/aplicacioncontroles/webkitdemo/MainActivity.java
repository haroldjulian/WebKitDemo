package aplicacioncontroles.webkitdemo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends Activity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        //webView.loadUrl("https://www.onpe.gob.pe/");
        webView.loadData("<h1><u>hola</u></h1>","text/html; charset=utf-8","utf-8");
        //webView.loadData("<p style='padding:16px; text-align:justify;font-size:12px;'>La selección de fútbol de Perú es el equipo "+
        //                "representativo de ese país en las competiciones oficiales de "+
         //       "fútbol. Su organización está a cargo de la Federación Peruana de Fútbol, "+
         //       "la cual es miembro de la Confederación Sudamericana de Fútbol"</p>","text/html; charset=utf-8","utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new CustomWebviewClient());


    }

    class  CustomWebviewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request)
        {
            Toast.makeText(MainActivity.this,"Clicked...",Toast.LENGTH_SHORT).show();
            return super.shouldOverrideUrlLoading(view, request);
        }

    }
}
