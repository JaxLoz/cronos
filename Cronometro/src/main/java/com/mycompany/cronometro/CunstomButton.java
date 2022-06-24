
package com.mycompany.cronometro;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;


/**
 *
 * @author javier
 */
public class CunstomButton extends JButton {
    
    private int round = 100;
    private Color rojo = new Color(255, 45, 0);
    private Color sombra = new Color(177, 31, 0);
    private Color button = this.getBackground();
    
    public CunstomButton(){
        
        this.setBorder(new EmptyBorder(0,0,0,0));
        this.setBorderPainted(false);
        
    }
    
    public void setRound(int r){
        this.round = r;
        repaint();
    }
    
    public int getRound(){
        return this.round;
    }
    
    public void setBackground(Color color){
        this.button = color;
    }
    
    @Override
    protected void paintComponent (Graphics grp){
        
        Graphics2D g2 = (Graphics2D) grp.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 0;
        int y = 0;
        int width = getWidth();
        int height = getHeight();
        Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, round, round));
        g2.setColor(button);
        g2.fill(area);
        area.subtract(new Area(new RoundRectangle2D.Double(x, y, width, height -2, round, round)));
        g2.setColor(new Color(92,92,92));
        g2.fill(area);
        g2.dispose();
        super.paintComponent(grp);
        
    }
    /**
    public enum ButtonStyle{
        
        PRIMARY(new Color(0,172,126), new Color(238, 238, 238), new Color(2, 111, 82), new Color(4, 205, 151)),
        SECONDARY(new Color(0,172,126), new Color(238, 238, 238), new Color(2, 111, 82), new Color(4, 205, 151)),
        DESTRUCTIVE(new Color(0,172,126), new Color(238, 238, 238), new Color(2, 111, 82), new Color(4, 205, 151));
        
        private ButtonStyle(Color background, Color foreground, Color backgroundHover, Color backgroundPress){
            
            this.background = background;
            this.foreground = foreground;
            this.backgroundHover = backgroundHover;
            this.backgroundPress = backgroundPress;
        }
        
        private Color background;
        private Color foreground;
        private Color backgroundHover;
        private Color backgroundPress;
            
    }
    
    protected class ButtonColor{
        
        private Color background;

        public Color getBackground() {
            return background;
        }

        public void setBackground(Color background) {
            this.background = background;
        }

        public Color getForeground() {
            return foreground;
        }

        public void setForeground(Color foreground) {
            this.foreground = foreground;
        }

        public Color getBackgroundHover() {
            return backgroundHover;
        }

        public void setBackgroundHover(Color backgroundHover) {
            this.backgroundHover = backgroundHover;
        }

        public Color getBackgroundPress() {
            return backgroundPress;
        }

        public void setBackgroundPress(Color backgroundPress) {
            this.backgroundPress = backgroundPress;
        }
        private Color foreground;
        private Color backgroundHover;
        private Color backgroundPress;
        
        public ButtonColor(ButtonStyle style){
            changeStyle(style);
        }
        
        public ButtonColor(){
            
        }
        
        private void changeStyle (ButtonStyle style){
            this.background = style.background;
            this.foreground = style.foreground;
            this.backgroundHover = style.backgroundHover;
            this.backgroundPress = style.backgroundPress;
        }
    }
    
    **/
    
}
