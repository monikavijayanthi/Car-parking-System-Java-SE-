/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCode;

import interfaces.Reservation;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author lap
 */
public class ImageProcess {
    
    public BufferedImage imageProcess(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream("interfaces/Car2.png");                   
        BufferedImage image = null;
        try {
           image = ImageIO.read(input);
        } catch (IOException ex) {
           Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return image;
        }
    
    
}
