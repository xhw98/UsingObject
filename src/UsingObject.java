/**
 * Created by admin on 2017/5/3.
 */
class Point{
    int x,y;//成员变量
    String name="a point";
    Point(){
        x=0;
        y=0;
    }
    Point(int x,int y,String name){
        this.x=x;
    this.y=y;
    this.name=name;
}
int getX(){
    return x;
}
int getY(){
    return y;
}
void move(int newX,int newY){
    x=newX;y=newY;

}
Point newPoint(String name){
    Point newP=new Point(-x,-y,name);
    return newP;
}
boolean equal(int x,int y)
{
    if(this.x==x&&this.y==y)
        return true;
    else
        return false;
}
void print()
{
    System.out.println(name+": x="+x+" y= "+y);
}
}
public class UsingObject {
    public static void main(String args[]) {
        Point p = new Point();
        p.print();
        p.move(50,50);

        System.out.println("*****after moving");

        System.out.println("get x and get y directly");
        System.out.println("x=" + p.x + "y=" + p.y);
        System.out.println("or Get x by method");
        System.out.println("x=" + p.getX() + " y" + p.getY());
        if (p.equal(50, 50))
            System.out.println("i like this ");
        else
            System.out.println("i hate thi");
        p.newPoint("a new point").print();
        new Point(10, 15, "another new point ").print();

    }
    }

