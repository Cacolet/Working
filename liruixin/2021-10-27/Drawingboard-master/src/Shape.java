import java.awt.*;
import java.io.Serializable;

public class Shape implements Serializable {
    int x1, x2, y1, y2;//定义坐标
    int R, G, B;//定义色彩
    float stroke;//粗细


    void draw(Graphics2D g) { }
}

class Rect extends Shape{
    void draw(Graphics2D g){
        g.setPaint(new Color(R,G,B));
        g.setStroke(new BasicStroke(stroke));
        g.drawRect(Math.min(x1,x2),Math.min(y1,y2),Math.abs(x2-x1),Math.abs(y2-y1));
    }
}//矩形类
class fillRect extends Shape{
    void draw(Graphics2D g){
        g.setPaint(new Color(R,G,B));
        g.setStroke(new BasicStroke(stroke));
        g.fillRect(Math.min(x1,x2),Math.min(y1,y2),Math.abs(x2-x1),Math.abs(y2-y1));
    }
}//填充矩形类
class Oval extends Shape{
    void draw(Graphics2D g){
        g.setPaint(new Color(R,G,B));
        g.setStroke(new BasicStroke(stroke));
        g.drawOval(Math.min(x1,x2),Math.min(y1,y2),Math.abs(x2-x1),Math.abs(y2-y1));
    }
}//椭圆
class Line extends Shape{
    void draw(Graphics2D g){
        g.setPaint(new Color(R,G,B));
        g.setStroke(new BasicStroke(stroke,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL));
        g.drawLine(x1,y1,x2,y2);
    }
}//直线类
class fillOval extends Shape{
    void draw(Graphics2D g){
        g.setPaint(new Color(R,G,B));
        g.setStroke(new BasicStroke(stroke));
        g.fillOval(Math.min(x1,x2),Math.min(y1,y2),Math.abs(x2-x1),Math.abs(y2-y1));
    }
}//填充椭圆
class Circle extends Shape{
    void draw(Graphics2D g){
        g.setPaint(new Color(R,G,B));
        g.setStroke(new BasicStroke(stroke));
        g.drawOval(Math.min(x1,x2),Math.min(y1,y2),Math.max(Math.abs(x1-x2),Math.abs(y1-y2)),Math.max(Math.abs(x1-x2),Math.abs(y1-y2)));
    }
}//
class fillCircle extends Shape{
    void draw(Graphics2D g){
        g.setPaint(new Color(R,G,B));
        g.setStroke(new BasicStroke(stroke));
        g.fillOval(Math.min(x1,x2),Math.min(y1,y2),Math.max(Math.abs(x1-x2),Math.abs(y1-y2)),Math.max(Math.abs(x1-x2),Math.abs(y1-y2)));
    }
}//
class RoundRect extends Shape{
    void draw(Graphics2D g){
        g.setPaint(new Color(R,G,B));
        g.setStroke(new BasicStroke(stroke));
        g.drawRoundRect(Math.min(x1,x2),Math.min(y1,y2),Math.abs(x2-x1),Math.abs(y2-y1),50,50);
    }
}//
class fillRoundRect extends Shape{
    void draw(Graphics2D g){
        g.setPaint(new Color(R,G,B));
        g.setStroke(new BasicStroke(stroke));
        g.fillRoundRect(Math.min(x1,x2),Math.min(y1,y2),Math.abs(x2-x1),Math.abs(y2-y1),50,50);
    }
}//

