/* 用「斜線、星號」、「星號、斜線」包住的區塊為多行註解 */
/* Logical_operator_and_bitwise_logical_operator_experiment.java
   Logical_operator_and_bitwise_logical_operator_experiment 主程式 */

/* # 主程式 物件類別(class)
   ## 類別函式
   ### public static void main()
   main() 為 Java 程式的進入點(entry point)子程式
   #### 參數
   ##### String[] args
   命令列參數的陣列，本程式沒有實際用到此參數 */
public class Logical_operator_and_bitwise_logical_operator_experiment{
	public static void main(String[] args){
		System.out.println("Logical operator and bitwise logical operator experiment 主程式");
		
		int divisor = 0;
		
		if(divisor != 0 && 10 / divisor == 2){
			
		}
		System.out.println("Logical operator 正常運作（符合預期）");
		
		if(divisor != 0 & 10 / divisor == 2){
			
		}
		System.out.println("Bitwise logical operator 正常運作（不符合預期）");
			
		return;
	}
}
