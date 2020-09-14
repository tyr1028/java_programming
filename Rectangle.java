
/**
 * 여기에 Rectangle 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Rectangle
{
    int width;
    int height;
    public Rectangle(int x, int y)
    {
        this.width = x;
        this.height = y;
    }
    
    public boolean equals(Object obj)
    {
        Rectangle p = (Rectangle)obj;
        if(this.width * this.height == p.width * p.height)
            return true;
        else
            return false;
    }
}
