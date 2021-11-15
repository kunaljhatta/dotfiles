
/**
 * Write a description of class Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tree
{
    private Triangle leaves;
    private Square trunk;
    
    public Tree()
    {
        leaves = new Triangle();
        trunk = new Square();
        setup();
    }
    
    public void setup()
    {
        trunk.moveHorizontal(-80);
        trunk.moveVertical(80);
        trunk.changeSize(40);
        trunk.makeVisible();
        trunk.changeColor("brown");
        
        leaves.moveHorizontal(38);
        leaves.moveVertical(-100);
        leaves.changeSize(180,150);
        leaves.makeVisible();
        leaves.changeColor("green");
        
        
    }
}
