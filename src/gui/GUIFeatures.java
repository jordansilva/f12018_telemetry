package gui;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author miguelangel.garciar
 */
public class GUIFeatures {
    
    public static void setFlagLabel(JLabel lab, int flag, String sc){
        switch(flag){
            case -1: lab.setForeground(new Color(0,0,0));
                    lab.setBackground(new Color(255,255,255));
                    lab.setText("WARNING FLAG");
                break;
            case 0: lab.setForeground(new Color(19,19,19));
                    lab.setBackground(new Color(19,19,19));
                    lab.setText("");
                break;
            case 1: lab.setForeground(new Color(0,0,0));
                    lab.setBackground(new Color(102,255,51));
                    lab.setText("GREEN FLAG");
                break;
            case 2: lab.setForeground(new Color(0,0,0));
                    lab.setBackground(new Color(0,102,255));
                    lab.setText("BLUE FLAG");
                break;
            case 3: lab.setForeground(new Color(0,0,0));
                    lab.setBackground(new Color(255,255,0));
                    lab.setText("YELLOW FLAG");
                break;
            case 4: lab.setForeground(new Color(255,255,255));
                    lab.setBackground(new Color(255,0,0));
                    lab.setText("RED FLAG");
                break;
        }
    }
    
    public static void setTrackImage(JLabel label, int sh, int sv, int track) {
        try {
            label.setText("");
            String tr = null;
            switch(track){
                case 0: tr =  "australia"; break;
                case 1: tr =  "france";break;
                case 2: tr =  "china";break;
                case 3: case 21: tr =  "barhain";break;
                case 4: tr =  "spain";break;
                case 5: tr =  "monaco";break;
                case 6: tr =  "canada";break;
                case 7: case 22: tr =  "greatbritain";break;
                case 8: tr =  "germany";break;
                case 9: tr =  "hungary";break;
                case 10: tr =  "belgium";break;
                case 11: tr =  "italy";break;
                case 12: tr =  "singapore";break;
                case 13: case 24: tr =  "japan";break;
                case 14: tr =  "abudabi";break;
                case 15: case 23: tr =  "usa";break;
                case 16: tr =  "brasil";break;
                case 17: tr =  "austria";break;
                case 18: tr =  "russia";break;
                case 19: tr =  "mexico";break;
                case 20: tr =  "azerbaijan";break;
            }
            if(tr != null){
                setImageIcon(label, sh, sv, "tracks/"+tr);
            }
        } catch (Exception e) {
            System.out.println("Error en la imagen: " + e.toString());
        }
    }
    
    public static void setWeatherImage(JLabel label, int size, int weather, int trak, boolean night) {
        try {
            label.setText("");
            String we = null;
            switch(weather){
                case 0: we = (night ? "moon_clear" : "sunny_clear"); break;
                case 1: we = (night ? "moon_light_cloud" : "sunny_light_cloud"); break;
                case 2: we = "overcast"; break;
                case 3: we = "light_rain"; break;
                case 4: we = "heavy_rain"; break;
                case 5: we = "storm"; break;
                default:
            }
            if(we != null){
                setImageIcon(label, size, size, "weather/"+we);
            }
        } catch (Exception e) {
            System.out.println("Error en la imagen: " + e.toString());
        }
    }
    
    public static void setImageIcon(JLabel label, int sizehor, int sizever, String image){
        ImageIcon imagen = new ImageIcon("images/"+image+".png");
        Icon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(sizehor,sizever,Image.SCALE_DEFAULT));
        label.setIcon(imgRedimensionada);
    }
    
    public static void getTyreImage(JLabel label, int size, int compound) {
        try {
            label.setText("");
            String tyre = null;
            switch(compound){
                case 0: tyre = "hypersoft"; break;
                case 1: tyre = "ultrasoft"; break;
                case 2: tyre = "supersoft"; break;
                case 3: tyre = "soft"; break;
                case 4: tyre = "medium"; break;
                case 5: tyre = "hard"; break;
                case 6: tyre = "superhard"; break;
                case 7: tyre = "inter"; break;
                case 8: tyre = "wet"; break;
            }
            if(tyre != null){
                setImageIcon(label, size, size, "tyres/"+tyre);
            }
        } catch (Exception e) {
            System.out.println("Error en la imagen: " + e.toString());
        }
    }
    
    public static void setTyreWear(JProgressBar pb, JLabel lab, int usage){
        
        Color col; 
        if(usage < 30){
            col = Color.green;
        }else if(usage < 50){
            col = Color.yellow;
        }else if(usage < 65){
            col = Color.orange;
        }else if(usage < 100){
            col = Color.red;
        }else{
            col = Color.BLACK;
        }
        
        lab.setText(usage+"%");
        lab.setForeground(col);
        pb.setValue(usage);
        pb.setForeground(col);
    }
    
}