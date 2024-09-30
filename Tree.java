public class Tree 
{
    private String name;
    private int height;
    
    public Tree(String name, int height)
    {
        this.name = name;
        this.height = height;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    @Override
    public String toString()
    {
        return "Tree name: " + name + "\nHeight in feet: " + height;
    }
    
}
