import java.awt.*;

import java.applet.*;

/*<applet code="drawShapes.class" height=400 width=400>

</applet>*/

public class drawShapes extends Applet

{
                int xs[]={40,49,60,70,57,40,35};
                int ys[]={260,310,315,280,260,270,265};
                int xss[]={140,150,180,200,170,150,140};
                int yss[]={260,310,315,280,260,270,265};
                public void paint(Graphics g)
                {
                                g.drawString("Some of the drawing objects ",40,20);
                                g.drawLine(40,30,200,30);
                                g.drawRect(40,60,70,40);
                                g.drawRoundRect(240,60,70,40,10,20);
                                g.drawOval(240,120,70,40);
                                g.drawArc(140,180,70,40,0,180);
                }

}
