package uz.xusniddintech.kiyimdokoni;

import android.webkit.WebSettings;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onResume() {
        super.onResume();
        try {
            // Telefon shrifti juda katta bo'lsa ham ilova buzilmasin: ko'pi bilan +15%
            float scale = getResources().getConfiguration().fontScale;
            int zoom = Math.round(Math.max(0.85f, Math.min(scale, 1.15f)) * 100);
            WebSettings s = getBridge().getWebView().getSettings();
            s.setTextZoom(zoom);
        } catch (Exception ignored) {
        }
    }
}
