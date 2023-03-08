import java.util.*;

public class HW_Mine_Main{
    HW_Mine[][] grid = new HW_Mine[10][10];
    
    public HW_Mine_Main(){
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if((int)(Math.random()*5) > 2)
                    grid[row][col] = new HW_Mine(((int)(Math.random()*3)) == 0);
            }
        }
        //how many do you expect?
        System.out.println(getArmedMines(grid).size());
    }
    
    //implement this
    public ArrayList<HW_Mine> getArmedMines(HW_Mine[][] grid){
 
    }

 
}