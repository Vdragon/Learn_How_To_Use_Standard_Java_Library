/* 用「斜線、星號」、「星號、斜線」包住的區塊為多行註解 */
/* stdin_eof_condition_experiment.java
   Scanner standard input stream end of file condition experiment 主程式 */

/* Imported Java packages */
import java.util.Scanner;

/* # 主程式 物件類別(class)
   ## 類別函式
   ### public static void main()
   main() 為 Java 程式的進入點(entry point)子程式
   #### 參數
   ##### String[] args
   命令列參數的陣列，本程式沒有實際用到此參數 */
public class stdin_eof_condition_experiment{
	public static void main(String[] args){
		System.out.println("Scanner standard input stream end of file condition experiment 主程式");
		
		Scanner standard_input = new Scanner(System.in);
		
		while(standard_input.hasNext()){
			System.out.println(standard_input.nextLine());
		}
		
		standard_input.close();
		
	}
}
