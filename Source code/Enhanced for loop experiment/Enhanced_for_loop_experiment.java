/**
 * @file Enhanced_for_loop_experiment.java
 * @brief 增強型 for 迴圈實驗程式
 * @author Vdragon
 */

/**
 * @brief 放置 Java 程式進入點的類別
 */
public class Enhanced_for_loop_experiment {
	private Enhanced_for_loop_experiment() {
		/* 不允許實例化 */
	}

	/**
	 * @brief Java 程式進入點
	 * @param args 包含命令列參數的 String 陣列
	 */
	public static void main(String[] args) {
		int numbers[] = {12, 34, 56, 78, 90};
		String fruit_names[] = {"apple", "banana", "pear"};
		
		for (int number : numbers){
			System.out.println(number);
		}
		
		for (String fruit_name : fruit_names){
			System.out.println(fruit_name);
		}
	}

}
